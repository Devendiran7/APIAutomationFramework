package com.api.listeners;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

	private static final Logger logger = LogManager.getLogger(TestListener.class);

	public void onTestStart(ITestResult result) {
		logger.info("Test Suite Started!!!");

	}

	public void onTestSuccess(ITestResult result) {
		logger.info("passed!!! " + result.getMethod().getMethodName());
		logger.info("Started!!! " + result.getMethod().getDescription());
	}

	public void onTestFailure(ITestResult result) {
		logger.error("Failed!!! " + result.getMethod().getMethodName());
	}

	public void onTestSkipped(ITestResult result) {
		logger.info("Skipped!!! " + result.getMethod().getMethodName());
	}

	public void onFinish(ITestResult result) {
		logger.info("FInished!!! " + result.getMethod().getMethodName());
		logger.info("Started!!! " + result.getMethod().getDescription());
	}

	public void onStarted(ITestResult result) {
		logger.info("Started!!! " + result.getMethod().getMethodName());
		logger.info("Started!!! " + result.getMethod().getDescription());

	}
}
