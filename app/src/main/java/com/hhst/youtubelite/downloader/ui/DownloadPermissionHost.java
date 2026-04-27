package com.rohit.acsyt.downloader.ui;

import androidx.annotation.NonNull;

/**
 * Contract for app logic.
 */
public interface DownloadPermissionHost {
	void requestDownloadStoragePermission(@NonNull Runnable onGranted);
}
