package com.rohit.acsyt.player.queue;

/**
 * Listener notified when queue data changes.
 */
@FunctionalInterface
public interface QueueInvalidationListener {
	void onQueueInvalidated();
}
