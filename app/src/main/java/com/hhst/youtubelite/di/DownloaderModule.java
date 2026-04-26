package com.rohit.acsyt.di;

import com.rohit.acsyt.downloader.core.LiteDownloader;
import com.rohit.acsyt.downloader.core.StreamDownloader;
import com.rohit.acsyt.downloader.core.impl.LiteDownloaderImpl;
import com.rohit.acsyt.downloader.core.impl.StreamDownloaderImpl;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;

/**
 * Hilt module that wires download dependencies.
 */
@Module
@InstallIn(SingletonComponent.class)
public abstract class DownloaderModule {

	@Binds
	@Singleton
	public abstract LiteDownloader bindLiteDownloader(LiteDownloaderImpl impl);

	@Binds
	@Singleton
	public abstract StreamDownloader bindStreamDownloader(StreamDownloaderImpl impl);

}
