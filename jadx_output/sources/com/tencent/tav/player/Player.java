package com.tencent.tav.player;

/* loaded from: classes16.dex */
public class Player implements com.tencent.tav.player.IPlayer, android.os.Handler.Callback {
    private static final int DEFAULT_MAX_CACHE_SIZE = 60;
    public static final java.lang.String TAG = "PlayerThreadMain";
    public static final int TYPE_PROGRESS = 2;
    public static final int TYPE_STATES = 1;
    public static final int TYPE_VIEWPORT_UPDATE = 3;
    public static java.lang.String time = "time";
    private com.tencent.tav.player.Player.AVPlayerActionAtItemEnd actionAtItemEnd;
    private com.tencent.tav.asset.Asset asset;
    private int bgColor;
    private com.tencent.tav.player.PlayerItem currentItem;
    private com.tencent.tav.player.ErrorMsg errMsg;
    private boolean loop;
    private com.tencent.tav.player.AudioFocusHelper mAudioFocuser;
    private boolean mHasPostedSeek;
    private com.tencent.tav.coremedia.CMTime mLastSeekTargetTimeUs;
    android.os.Handler mMainHandler;
    private com.tencent.tav.coremedia.CMTimeRange mPlayRange;
    private com.tencent.tav.player.PlayerThread mPlayThread;
    private com.tencent.tav.player.IPlayer.PlayerListener mPlayerListener;
    private com.tencent.tav.player.IPlayer.PlayerStatus mPlayerStatus;
    private com.tencent.tav.coremedia.CMTime mPosition;
    private com.tencent.tav.coremedia.CMTime mSeekTargetTimeUs;
    private boolean muted;
    private com.tencent.tav.player.OnCompositionUpdateListener onCompositionUpdateListener;
    private com.tencent.tav.player.PlayerLayer playerLayer;
    private float rate;
    private volatile boolean released;
    private com.tencent.tav.player.Player.PlayerStatus status;
    private com.tencent.tav.player.OnViewportUpdateListener viewportUpdateListener;
    private float volume;

    /* loaded from: classes3.dex */
    public enum AVPlayerActionAtItemEnd {
        AVPlayerActionAtItemEndAdvance,
        AVPlayerActionAtItemEndPause,
        AVPlayerActionAtItemEndNone
    }

    /* loaded from: classes3.dex */
    public enum PlayerStatus {
        PlayerStatusUnknown,
        PlayerStatusReadyToPlay,
        PlayerStatusFailed
    }

    public Player(java.lang.String str) {
        this(new com.tencent.tav.player.PlayerItem(str));
    }

    private synchronized void checkAndReady() {
        if (this.mPlayerStatus == com.tencent.tav.player.IPlayer.PlayerStatus.IDLE) {
            this.mPlayThread.sendMessage(1, com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM);
        }
    }

    public void bindLayer(com.tencent.tav.player.PlayerLayer playerLayer) {
        this.playerLayer = playerLayer;
        this.currentItem.bindLayer(playerLayer);
    }

    @Override // com.tencent.tav.player.IPlayer
    public synchronized com.tencent.tav.player.IPlayer.PlayerStatus currentStatus() {
        return this.mPlayerStatus;
    }

    public com.tencent.tav.coremedia.CMTime currentTime() {
        com.tencent.tav.player.PlayerThread playerThread = this.mPlayThread;
        return playerThread == null ? com.tencent.tav.coremedia.CMTime.CMTimeZero : playerThread.getPosition();
    }

    @Override // com.tencent.tav.player.IPlayer
    public synchronized com.tencent.tav.coremedia.CMTime duration() {
        com.tencent.tav.asset.Asset asset;
        asset = this.asset;
        return asset == null ? com.tencent.tav.coremedia.CMTime.CMTimeZero : asset.getDuration();
    }

    public void enAbleAudioFocus(android.content.Context context, boolean z17) {
        if (z17) {
            if (this.mAudioFocuser == null) {
                this.mAudioFocuser = new com.tencent.tav.player.AudioFocusHelper(context, this);
            }
        } else {
            com.tencent.tav.player.AudioFocusHelper audioFocusHelper = this.mAudioFocuser;
            if (audioFocusHelper != null) {
                audioFocusHelper.release();
            }
        }
    }

    public int getBgColor() {
        return this.bgColor;
    }

    public com.tencent.tav.player.PlayerItem getCurrentItem() {
        return this.currentItem;
    }

    public com.tencent.tav.player.ErrorMsg getErrMsg() {
        return this.errMsg;
    }

    public com.tencent.tav.coremedia.CGRect getGlViewport() {
        com.tencent.tav.player.PlayerThread playerThread = this.mPlayThread;
        if (playerThread == null) {
            return null;
        }
        return playerThread.getGlViewportRect();
    }

    public float getRate() {
        return this.rate;
    }

    public com.tencent.tav.decoder.RenderContextParams getRenderContextParams() {
        com.tencent.tav.player.PlayerThread playerThread = this.mPlayThread;
        if (playerThread != null) {
            return playerThread.getRenderContextParams();
        }
        return null;
    }

    public com.tencent.tav.player.Player.PlayerStatus getStatus() {
        return this.status;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        if (this.released) {
            return false;
        }
        int i17 = message.what;
        if (i17 == 1) {
            com.tencent.tav.player.IPlayer.PlayerStatus playerStatus = this.mPlayerStatus;
            com.tencent.tav.player.PlayerStatusMsg playerStatusMsg = (com.tencent.tav.player.PlayerStatusMsg) message.obj;
            com.tencent.tav.player.IPlayer.PlayerStatus playerStatus2 = playerStatusMsg.getPlayerStatus();
            this.mPlayerStatus = playerStatus2;
            if (playerStatus == com.tencent.tav.player.IPlayer.PlayerStatus.PLAYING && ((playerStatus2 == com.tencent.tav.player.IPlayer.PlayerStatus.FINISHED || playerStatus2 == com.tencent.tav.player.IPlayer.PlayerStatus.ERROR) && this.loop)) {
                synchronized (this) {
                    if (!this.mPlayThread.hasMessage(3) && !this.mPlayThread.hasMessage(6) && !this.mPlayThread.hasMessage(4) && !this.mPlayThread.hasMessage(11) && !this.mMainHandler.hasMessages(1)) {
                        com.tencent.tav.coremedia.CMTimeRange cMTimeRange = this.mPlayRange;
                        if (cMTimeRange == null || cMTimeRange.getDuration().getValue() <= 0) {
                            seekToTime(com.tencent.tav.coremedia.CMTime.CMTimeZero);
                        } else {
                            seekToTime(this.mPlayRange.getStart());
                        }
                        com.tencent.tav.player.IPlayer.PlayerListener playerListener = this.mPlayerListener;
                        if (playerListener != null) {
                            playerListener.onStatusChanged(com.tencent.tav.player.IPlayer.PlayerStatus.REPLAY);
                        }
                        play();
                    }
                }
            } else {
                com.tencent.tav.player.IPlayer.PlayerListener playerListener2 = this.mPlayerListener;
                if (playerListener2 != null) {
                    playerListener2.onStatusChanged(playerStatus2);
                }
                if (this.mPlayerStatus == com.tencent.tav.player.IPlayer.PlayerStatus.ERROR) {
                    this.errMsg = new com.tencent.tav.player.ErrorMsg(-1, playerStatusMsg.getErrorMsg());
                }
            }
        } else if (i17 == 2) {
            this.mPosition = (com.tencent.tav.coremedia.CMTime) message.obj;
            if (this.mPlayerListener != null && !this.mMainHandler.hasMessages(2)) {
                this.mPlayerListener.onPositionChanged(this.mPosition);
            }
            com.tencent.tav.coremedia.CMTimeRange cMTimeRange2 = this.mPlayRange;
            if (cMTimeRange2 != null && !this.mPosition.smallThan(cMTimeRange2.getEnd()) && isPlaying()) {
                if (this.loop) {
                    com.tencent.tav.player.IPlayer.PlayerListener playerListener3 = this.mPlayerListener;
                    if (playerListener3 != null) {
                        playerListener3.onStatusChanged(com.tencent.tav.player.IPlayer.PlayerStatus.REPLAY);
                    }
                    seekToTime(this.mPlayRange.getStart());
                } else {
                    pause();
                }
            }
        } else {
            if (i17 != 3) {
                return false;
            }
            com.tencent.tav.player.OnViewportUpdateListener onViewportUpdateListener = this.viewportUpdateListener;
            if (onViewportUpdateListener != null) {
                java.lang.Object obj = message.obj;
                if (obj instanceof com.tencent.tav.coremedia.CGRect) {
                    onViewportUpdateListener.onViewportUpdate(((com.tencent.tav.coremedia.CGRect) obj).m411clone());
                }
            }
        }
        return true;
    }

    @Override // com.tencent.tav.player.IPlayer
    public synchronized boolean isPlaying() {
        return this.mPlayerStatus == com.tencent.tav.player.IPlayer.PlayerStatus.PLAYING;
    }

    public synchronized boolean isReleased() {
        return this.released;
    }

    @Override // com.tencent.tav.player.IPlayer
    public synchronized void pause() {
        if (this.released) {
            return;
        }
        this.mPlayThread.removeReadSampleMessage();
        this.mPlayThread.enableScheduleNext(false);
        this.mPlayThread.sendMessage(3, com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM);
    }

    @Override // com.tencent.tav.player.IPlayer
    public synchronized void play() {
        if (this.released) {
            return;
        }
        com.tencent.tav.coremedia.CMTimeRange cMTimeRange = this.mPlayRange;
        if (cMTimeRange != null && !cMTimeRange.containsTime(currentTime())) {
            seekToTime(this.mPlayRange.getStart());
        }
        this.mPlayThread.sendMessage(2, com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM);
        com.tencent.tav.player.AudioFocusHelper audioFocusHelper = this.mAudioFocuser;
        if (audioFocusHelper != null) {
            audioFocusHelper.requestFocus();
        }
    }

    @Override // com.tencent.tav.player.IPlayer
    public synchronized com.tencent.tav.coremedia.CMTime position() {
        com.tencent.tav.player.PlayerThread playerThread;
        playerThread = this.mPlayThread;
        return playerThread == null ? com.tencent.tav.coremedia.CMTime.CMTimeZero : playerThread.getPosition();
    }

    public void prepare(com.tencent.tav.player.PlayerPrepareListener playerPrepareListener) {
        com.tencent.tav.player.IPlayer.PlayerStatus playerStatus = com.tencent.tav.player.IPlayer.PlayerStatus.IDLE;
    }

    public void readSnapShootBitmap(com.tencent.tav.player.OnReadSnapShootListener onReadSnapShootListener) {
        com.tencent.tav.player.PlayerThread playerThread = this.mPlayThread;
        if (playerThread == null) {
            return;
        }
        playerThread.sendMessage(24, onReadSnapShootListener, "readSnapShootBitmap");
    }

    public void refreshSurface(com.tencent.tav.player.Callback callback) {
        if (this.released) {
            return;
        }
        this.mPlayThread.sendMessage(26, callback, com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM);
    }

    @Override // com.tencent.tav.player.IPlayer
    public synchronized void release() {
        release(null);
    }

    public void replaceCurrentItemWithPlayerItem(com.tencent.tav.player.PlayerItem playerItem) {
        update(playerItem, position());
    }

    public void seekToTime(com.tencent.tav.coremedia.CMTime cMTime) {
        seekToTime(cMTime, null);
    }

    public void setBgColor(int i17) {
        this.bgColor = i17;
    }

    public void setGetTavExtraListener(com.tencent.tav.player.OnGetTavExtraListener onGetTavExtraListener) {
        com.tencent.tav.player.PlayerThread playerThread = this.mPlayThread;
        if (playerThread != null) {
            playerThread.sendMessage(25, onGetTavExtraListener, "setGetTavExtraListener");
        }
    }

    @Override // com.tencent.tav.player.IPlayer
    public synchronized void setLoop(boolean z17) {
        this.loop = z17;
    }

    @Override // com.tencent.tav.player.IPlayer
    public void setOnCompositionUpdateListener(com.tencent.tav.player.OnCompositionUpdateListener onCompositionUpdateListener) {
        this.onCompositionUpdateListener = onCompositionUpdateListener;
    }

    @Override // com.tencent.tav.player.IPlayer
    public synchronized void setPlayRange(com.tencent.tav.coremedia.CMTimeRange cMTimeRange) {
        this.mPlayRange = cMTimeRange;
        if (cMTimeRange != null && !cMTimeRange.containsTime(currentTime()) && isPlaying()) {
            seekToTime(cMTimeRange.getStart());
        }
        this.mPlayThread.setPlayRange(cMTimeRange);
    }

    @Override // com.tencent.tav.player.IPlayer
    public void setPlayerListener(com.tencent.tav.player.IPlayer.PlayerListener playerListener) {
        this.mPlayerListener = playerListener;
    }

    public void setRate(float f17) {
        setRate(f17, 60);
    }

    public void setRateAtTimeAndHostTime(float f17, com.tencent.tav.coremedia.CMTime cMTime, com.tencent.tav.coremedia.CMTime cMTime2) {
    }

    public void setRenderContextParams(com.tencent.tav.decoder.RenderContextParams renderContextParams) {
        com.tencent.tav.player.PlayerThread playerThread = this.mPlayThread;
        if (playerThread != null) {
            playerThread.setRenderContextParams(renderContextParams);
        }
    }

    public void setViewportUpdateListener(com.tencent.tav.player.OnViewportUpdateListener onViewportUpdateListener) {
        this.viewportUpdateListener = onViewportUpdateListener;
    }

    @Override // com.tencent.tav.player.IPlayer
    public synchronized void setVolume(float f17) {
        if (this.released) {
            return;
        }
        this.mPlayThread.sendMessage(7, java.lang.Float.valueOf(f17), com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM);
    }

    @Override // com.tencent.tav.player.IPlayer
    public synchronized void stop() {
        if (this.released) {
            return;
        }
        this.mPlayThread.sendMessage(4, java.lang.Boolean.TRUE, com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM);
    }

    @Override // com.tencent.tav.player.IPlayer
    public synchronized void update(com.tencent.tav.player.PlayerItem playerItem, com.tencent.tav.coremedia.CMTime cMTime) {
        if (this.released) {
            return;
        }
        this.currentItem = playerItem;
        this.asset = playerItem.getAsset();
        this.currentItem.updateDecoderTrack();
        this.mMainHandler.removeMessages(2);
        this.mPlayThread.removePendingUpdateCompositionMessage();
        this.mPlayThread.updatePositionRightAway(cMTime);
        this.mPlayThread.removeReadSampleMessage();
        this.mPlayThread.enableScheduleNext(false);
        this.mPlayThread.sendMessage(11, new com.tencent.tav.player.UpdateCompositionMessage(playerItem, this.onCompositionUpdateListener), "update clips");
        this.mLastSeekTargetTimeUs = com.tencent.tav.coremedia.CMTime.CMTimeZero;
    }

    public synchronized void updateAllProperties() {
        if (this.released) {
            return;
        }
        this.mPlayThread.sendMessage(20, com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM);
    }

    @Override // com.tencent.tav.player.IPlayer
    public synchronized void updateAudioClipsProperties() {
        if (this.released) {
            return;
        }
        this.mPlayThread.sendMessage(22, com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM);
    }

    @Override // com.tencent.tav.player.IPlayer
    public synchronized void updateAudioVolumeProperties() {
        if (this.released) {
            return;
        }
        this.mPlayThread.sendMessage(23, com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM);
    }

    public synchronized void updateProperties() {
        if (this.released) {
            return;
        }
        this.mPlayThread.sendMessage(10, com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM);
    }

    public void updateViewport(int i17, int i18) {
        if (this.released) {
            return;
        }
        this.mPlayThread.sendMessage(21, new com.tencent.tav.coremedia.CGSize(i17, i18), com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM);
    }

    @Override // com.tencent.tav.player.IPlayer
    public int videoHeight() {
        com.tencent.tav.player.PlayerItem playerItem = this.currentItem;
        if (playerItem == null) {
            return 0;
        }
        return (int) playerItem.getPresentationSize().height;
    }

    @Override // com.tencent.tav.player.IPlayer
    public int videoWidth() {
        com.tencent.tav.player.PlayerItem playerItem = this.currentItem;
        if (playerItem == null) {
            return 0;
        }
        return (int) playerItem.getPresentationSize().width;
    }

    @Override // com.tencent.tav.player.IPlayer
    public synchronized void waitForRelease(long j17) {
    }

    public Player(com.tencent.tav.player.PlayerItem playerItem) {
        this.mPlayerStatus = com.tencent.tav.player.IPlayer.PlayerStatus.IDLE;
        this.loop = false;
        this.released = false;
        this.bgColor = -16777216;
        this.currentItem = playerItem;
        this.mMainHandler = new android.os.Handler(android.os.Looper.getMainLooper(), this);
        this.asset = this.currentItem.getAsset();
        this.currentItem.start(this);
        this.mPlayThread = this.currentItem.getPlayerThreadMain();
    }

    public void seekToTime(com.tencent.tav.coremedia.CMTime cMTime, com.tencent.tav.coremedia.CMTime cMTime2, com.tencent.tav.coremedia.CMTime cMTime3) {
        seekToTime(cMTime, cMTime2, cMTime3, null);
    }

    public void setRate(float f17, int i17) {
        com.tencent.tav.player.IPlayer.PlayerStatus playerStatus = this.mPlayerStatus;
        if (playerStatus == com.tencent.tav.player.IPlayer.PlayerStatus.PLAYING || playerStatus == com.tencent.tav.player.IPlayer.PlayerStatus.PAUSED) {
            return;
        }
        this.rate = f17;
        this.currentItem.setRate(f17, i17);
    }

    @Override // com.tencent.tav.player.IPlayer
    public synchronized void release(java.lang.Runnable runnable) {
        if (!this.released) {
            this.released = true;
            this.mMainHandler.removeCallbacksAndMessages(null);
            this.mMainHandler = null;
            this.mPlayThread.sendMessage(4, com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM);
            this.mPlayThread.sendMessage(6, runnable, com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM);
            this.mPlayThread = null;
            com.tencent.tav.player.AudioFocusHelper audioFocusHelper = this.mAudioFocuser;
            if (audioFocusHelper != null) {
                audioFocusHelper.release();
            }
            com.tencent.tav.player.PlayerItem playerItem = this.currentItem;
            if (playerItem != null) {
                playerItem.release();
            }
            this.currentItem = null;
        }
    }

    @Override // com.tencent.tav.player.IPlayer
    public void seekToTime(com.tencent.tav.coremedia.CMTime cMTime, com.tencent.tav.player.Callback callback) {
        com.tencent.tav.coremedia.CMTime cMTime2 = com.tencent.tav.coremedia.CMTime.CMTimeZero;
        seekToTime(cMTime, cMTime2, cMTime2, callback);
    }

    public void seekToTime(com.tencent.tav.coremedia.CMTime cMTime, com.tencent.tav.coremedia.CMTime cMTime2, com.tencent.tav.coremedia.CMTime cMTime3, com.tencent.tav.player.Callback callback) {
        if (this.released) {
            return;
        }
        this.mSeekTargetTimeUs = cMTime;
        this.mLastSeekTargetTimeUs = cMTime;
        this.mPlayThread.updatePositionRightAway(cMTime);
        this.mPlayThread.enableScheduleNext(true);
        this.mPlayThread.cancelAllPendingSeeks();
        this.mPlayThread.sendMessage(5, this.mSeekTargetTimeUs, com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM, callback);
    }

    public synchronized void update(com.tencent.tav.player.PlayerItem playerItem, com.tencent.tav.coremedia.CMTime cMTime, final com.tencent.tav.player.OnCompositionUpdateListener onCompositionUpdateListener) {
        if (this.released) {
            return;
        }
        this.currentItem = playerItem;
        this.asset = playerItem.getAsset();
        this.currentItem.updateDecoderTrack();
        this.mMainHandler.removeMessages(2);
        this.mPlayThread.removePendingUpdateCompositionMessage();
        this.mPlayThread.updatePositionRightAway(cMTime);
        this.mPlayThread.removeReadSampleMessage();
        this.mPlayThread.enableScheduleNext(false);
        this.mPlayThread.sendMessage(11, new com.tencent.tav.player.UpdateCompositionMessage(playerItem, new com.tencent.tav.player.OnCompositionUpdateListener() { // from class: com.tencent.tav.player.Player.1
            @Override // com.tencent.tav.player.OnCompositionUpdateListener
            public void onUpdated(com.tencent.tav.player.Player player, boolean z17) {
                com.tencent.tav.player.OnCompositionUpdateListener onCompositionUpdateListener2 = onCompositionUpdateListener;
                if (onCompositionUpdateListener2 != null) {
                    onCompositionUpdateListener2.onUpdated(player, z17);
                }
                if (com.tencent.tav.player.Player.this.onCompositionUpdateListener != null) {
                    com.tencent.tav.player.Player.this.onCompositionUpdateListener.onUpdated(player, z17);
                }
            }
        }), "update clips");
        this.mLastSeekTargetTimeUs = com.tencent.tav.coremedia.CMTime.CMTimeZero;
    }
}
