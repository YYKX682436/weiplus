package com.tencent.thumbplayer.adapter.player.systemplayer;

/* loaded from: classes15.dex */
public class TPAsyncMediaPlayer extends com.tencent.thumbplayer.adapter.player.systemplayer.TPMediaPlayer {
    private static final java.lang.String TAG = "TPThumbPlayer[TPAsyncMediaPlayer.java]";
    private static final int TP_MEDIAPLAYER_MSG_PAUSE = 3;
    private static final int TP_MEDIAPLAYER_MSG_RELEASE = 8;
    private static final int TP_MEDIAPLAYER_MSG_RESET = 7;
    private static final int TP_MEDIAPLAYER_MSG_SEEK = 4;
    private static final int TP_MEDIAPLAYER_MSG_SEEK_BY_MODE = 5;
    private static final int TP_MEDIAPLAYER_MSG_SETSURFACE = 1;
    private static final int TP_MEDIAPLAYER_MSG_SET_PLAY_PARAM = 9;
    private static final int TP_MEDIAPLAYER_MSG_START = 2;
    private static final int TP_MEDIAPLAYER_MSG_STOP = 6;
    private static final int WAIT_STOP_TIMEOUT = 2500;
    private android.media.MediaPlayer.OnSeekCompleteListener mOnSeekCompleteListener;
    private final java.lang.Object mStopCondition = new java.lang.Object();
    private final java.lang.Object mResetCondition = new java.lang.Object();
    private final java.lang.Object mReleaseCondition = new java.lang.Object();
    private long mLastSeekPos = 0;
    private boolean mIsSeeking = false;
    private final java.lang.Object mStateLock = new java.lang.Object();
    private android.media.MediaPlayer.OnSeekCompleteListener mOnSeekCompleteListenerInner = new android.media.MediaPlayer.OnSeekCompleteListener() { // from class: com.tencent.thumbplayer.adapter.player.systemplayer.TPAsyncMediaPlayer.1
        @Override // android.media.MediaPlayer.OnSeekCompleteListener
        public void onSeekComplete(android.media.MediaPlayer mediaPlayer) {
            synchronized (com.tencent.thumbplayer.adapter.player.systemplayer.TPAsyncMediaPlayer.this.mStateLock) {
                com.tencent.thumbplayer.adapter.player.systemplayer.TPAsyncMediaPlayer.this.mIsSeeking = false;
            }
            android.media.MediaPlayer.OnSeekCompleteListener onSeekCompleteListener = com.tencent.thumbplayer.adapter.player.systemplayer.TPAsyncMediaPlayer.this.mOnSeekCompleteListener;
            if (onSeekCompleteListener != null) {
                onSeekCompleteListener.onSeekComplete(mediaPlayer);
            }
        }
    };
    private android.os.HandlerThread mHandlerThread = com.tencent.thumbplayer.utils.TPThreadPool.getInstance().obtainShareThread();
    private com.tencent.thumbplayer.adapter.player.systemplayer.TPAsyncMediaPlayer.EventHandler mEventHandler = new com.tencent.thumbplayer.adapter.player.systemplayer.TPAsyncMediaPlayer.EventHandler(this.mHandlerThread.getLooper(), this);

    /* loaded from: classes15.dex */
    public static class EventHandler extends android.os.Handler {
        private java.lang.ref.WeakReference<com.tencent.thumbplayer.adapter.player.systemplayer.TPAsyncMediaPlayer> mWeakRef;

        public EventHandler(android.os.Looper looper, com.tencent.thumbplayer.adapter.player.systemplayer.TPAsyncMediaPlayer tPAsyncMediaPlayer) {
            super(looper);
            this.mWeakRef = new java.lang.ref.WeakReference<>(tPAsyncMediaPlayer);
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            com.tencent.thumbplayer.utils.TPLogUtil.i(com.tencent.thumbplayer.adapter.player.systemplayer.TPAsyncMediaPlayer.TAG, "EventHandler msg msg.what: " + message.what + ", value: " + message.what + ", arg1: " + message.arg1 + ", arg2: " + message.arg2);
            com.tencent.thumbplayer.adapter.player.systemplayer.TPAsyncMediaPlayer tPAsyncMediaPlayer = this.mWeakRef.get();
            if (tPAsyncMediaPlayer == null) {
                com.tencent.thumbplayer.utils.TPLogUtil.e(com.tencent.thumbplayer.adapter.player.systemplayer.TPAsyncMediaPlayer.TAG, "mWeakRef is null");
                return;
            }
            switch (message.what) {
                case 1:
                    tPAsyncMediaPlayer.handleSetSurface(message);
                    return;
                case 2:
                    tPAsyncMediaPlayer.handleStart();
                    return;
                case 3:
                    tPAsyncMediaPlayer.handlePause();
                    return;
                case 4:
                    tPAsyncMediaPlayer.handleSeekTo(message);
                    return;
                case 5:
                    tPAsyncMediaPlayer.handleSeekToByMode(message);
                    return;
                case 6:
                    tPAsyncMediaPlayer.handleStop();
                    return;
                case 7:
                    tPAsyncMediaPlayer.handleReset();
                    return;
                case 8:
                    tPAsyncMediaPlayer.handleRelease();
                    return;
                case 9:
                    tPAsyncMediaPlayer.handleSetPlaybackParams(message);
                    return;
                default:
                    com.tencent.thumbplayer.utils.TPLogUtil.i(com.tencent.thumbplayer.adapter.player.systemplayer.TPAsyncMediaPlayer.TAG, "eventHandler unknow msg");
                    return;
            }
        }
    }

    @Override // com.tencent.thumbplayer.adapter.player.systemplayer.TPMediaPlayer, android.media.MediaPlayer
    public int getCurrentPosition() {
        return this.mIsSeeking ? (int) this.mLastSeekPos : super.getCurrentPosition();
    }

    public void handlePause() {
        try {
            super.pause();
        } catch (java.lang.Exception e17) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, e17);
        }
    }

    public void handleRelease() {
        try {
            super.release();
        } catch (java.lang.Exception e17) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, e17);
        }
        com.tencent.thumbplayer.utils.TPThreadPool.getInstance().recycle(this.mHandlerThread, this.mEventHandler);
        this.mHandlerThread = null;
        this.mEventHandler = null;
        synchronized (this.mReleaseCondition) {
            this.mReleaseCondition.notify();
        }
    }

    public void handleReset() {
        try {
            super.reset();
        } catch (java.lang.Exception e17) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, e17);
        }
        synchronized (this.mResetCondition) {
            this.mResetCondition.notify();
        }
    }

    public void handleSeekTo(android.os.Message message) {
        synchronized (this.mStateLock) {
            try {
                super.seekTo(message.arg1);
            } catch (java.lang.Exception e17) {
                com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, e17);
            }
        }
    }

    public void handleSeekToByMode(android.os.Message message) {
        synchronized (this.mStateLock) {
            try {
                super.seekTo(((java.lang.Long) message.obj).longValue(), message.arg1);
            } catch (java.lang.Exception e17) {
                com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, e17);
            }
        }
    }

    public void handleSetPlaybackParams(android.os.Message message) {
        try {
            super.setPlaybackParams((android.media.PlaybackParams) message.obj);
        } catch (java.lang.Exception e17) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, e17);
        }
    }

    public void handleSetSurface(android.os.Message message) {
        super.setSurface((android.view.Surface) message.obj);
    }

    public void handleStart() {
        try {
            super.start();
        } catch (java.lang.Exception e17) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, e17);
        }
    }

    public void handleStop() {
        try {
            super.stop();
        } catch (java.lang.Exception e17) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, e17);
        }
        synchronized (this.mStopCondition) {
            this.mStopCondition.notify();
        }
    }

    @Override // android.media.MediaPlayer
    public void pause() {
        this.mEventHandler.sendEmptyMessage(3);
    }

    @Override // com.tencent.thumbplayer.adapter.player.systemplayer.TPMediaPlayer, android.media.MediaPlayer
    public void release() {
        synchronized (this.mReleaseCondition) {
            this.mEventHandler.sendEmptyMessage(8);
            try {
                this.mReleaseCondition.wait(2500L);
            } catch (java.lang.InterruptedException e17) {
                com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, e17);
            }
        }
    }

    @Override // com.tencent.thumbplayer.adapter.player.systemplayer.TPMediaPlayer, android.media.MediaPlayer
    public void reset() {
        synchronized (this.mResetCondition) {
            this.mEventHandler.sendEmptyMessage(7);
            try {
                this.mResetCondition.wait(2500L);
            } catch (java.lang.InterruptedException e17) {
                com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, e17);
            }
        }
    }

    @Override // android.media.MediaPlayer
    public void seekTo(int i17) {
        synchronized (this.mStateLock) {
            this.mLastSeekPos = i17;
            this.mIsSeeking = true;
            android.os.Message obtain = android.os.Message.obtain();
            obtain.what = 4;
            obtain.arg1 = i17;
            this.mEventHandler.sendMessage(obtain);
        }
    }

    @Override // android.media.MediaPlayer
    public void setOnSeekCompleteListener(android.media.MediaPlayer.OnSeekCompleteListener onSeekCompleteListener) {
        this.mOnSeekCompleteListener = onSeekCompleteListener;
        super.setOnSeekCompleteListener(this.mOnSeekCompleteListenerInner);
    }

    @Override // com.tencent.thumbplayer.adapter.player.systemplayer.TPMediaPlayer, android.media.MediaPlayer
    public void setPlaybackParams(android.media.PlaybackParams playbackParams) {
        android.os.Message obtain = android.os.Message.obtain();
        obtain.what = 9;
        obtain.obj = playbackParams;
        this.mEventHandler.sendMessage(obtain);
    }

    @Override // com.tencent.thumbplayer.adapter.player.systemplayer.TPMediaPlayer, android.media.MediaPlayer
    public void setSurface(android.view.Surface surface) {
        android.os.Message obtain = android.os.Message.obtain();
        obtain.what = 1;
        obtain.obj = surface;
        this.mEventHandler.sendMessage(obtain);
    }

    @Override // android.media.MediaPlayer
    public void start() {
        this.mEventHandler.sendEmptyMessage(2);
    }

    @Override // com.tencent.thumbplayer.adapter.player.systemplayer.TPMediaPlayer, android.media.MediaPlayer
    public void stop() {
        synchronized (this.mStopCondition) {
            this.mEventHandler.sendEmptyMessage(6);
            try {
                this.mStopCondition.wait(2500L);
            } catch (java.lang.InterruptedException e17) {
                com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, e17);
            }
        }
    }

    @Override // android.media.MediaPlayer
    public void seekTo(long j17, int i17) {
        synchronized (this.mStateLock) {
            this.mLastSeekPos = j17;
            this.mIsSeeking = true;
            android.os.Message obtain = android.os.Message.obtain();
            obtain.what = 5;
            obtain.arg1 = i17;
            obtain.obj = java.lang.Long.valueOf(j17);
            this.mEventHandler.sendMessage(obtain);
        }
    }
}
