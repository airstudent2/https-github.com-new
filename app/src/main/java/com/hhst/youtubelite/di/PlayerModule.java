package com.rohit.acsyt.di;

import android.app.Activity;

import androidx.media3.common.util.UnstableApi;

import com.rohit.acsyt.R;
import com.rohit.acsyt.player.LitePlayerView;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.scopes.ActivityScoped;

/**
 * Hilt module that wires playback dependencies.
 */
@Module
@InstallIn(ActivityComponent.class)
@UnstableApi
public class PlayerModule {

	@Provides
	@ActivityScoped
	public static LitePlayerView provideLitePlayerView(Activity activity) {
		return activity.findViewById(R.id.playerView);
	}
}
