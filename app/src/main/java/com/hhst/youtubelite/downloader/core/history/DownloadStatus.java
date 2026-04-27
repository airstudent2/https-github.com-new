package com.rohit.acsyt.downloader.core.history;

/**
 * Enumeration of download lifecycle states.
 */
public enum DownloadStatus {
	QUEUED,
	RUNNING,
	MERGING,
	COMPLETED,
	CANCELED,
	FAILED,
	PAUSED
}

