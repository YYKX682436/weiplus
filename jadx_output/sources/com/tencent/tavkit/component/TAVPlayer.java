package com.tencent.tavkit.component;

/* loaded from: classes16.dex */
public class TAVPlayer {
    public static final int VIDEO_PLAYER_HEIGHT = 960;
    public static final int VIDEO_PLAYER_WIDTH = 540;
    private android.media.AudioManager audioManager;
    private com.tencent.tav.player.OnCompositionUpdateListener compositionUpdateListener;
    private android.content.Context context;
    private android.widget.FrameLayout mPlayerLayout;
    private com.tencent.tav.coremedia.CMTimeRange playRange;
    private com.tencent.tav.player.Player player;
    private com.tencent.tav.player.IPlayer.PlayerListener playerListener;
    private com.tencent.tavkit.component.TAVPlayer.PostUpdateThread postUpdateThread;
    private android.view.Surface surface;
    private int surfaceHeight;
    private int surfaceWidth;
    private com.tencent.tavkit.composition.TAVComposition tavComposition;
    private final java.lang.String TAG = "GameTemplatePlayer@" + java.lang.Integer.toHexString(hashCode());
    private boolean isAllowInterrupt = true;
    private boolean isAutoPlay = true;
    private boolean loopPlay = false;
    private float volume = 1.0f;
    private com.tencent.tav.coremedia.CMTime position = com.tencent.tav.coremedia.CMTime.CMTimeZero;
    private boolean videoTracksMerge = true;
    private boolean audioTracksMerge = true;
    private float rate = 1.0f;
    private int bgColor = -16777216;
    private boolean isResetting = false;
    private android.media.AudioManager.OnAudioFocusChangeListener audioFocusChangeListener = new android.media.AudioManager.OnAudioFocusChangeListener() { // from class: com.tencent.tavkit.component.TAVPlayer.4
        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int i17) {
            if (i17 == -2 || i17 == -1) {
                if (com.tencent.tavkit.component.TAVPlayer.this.isAllowInterrupt && com.tencent.tavkit.component.TAVPlayer.this.player != null) {
                    com.tencent.tavkit.component.TAVPlayer.this.player.pause();
                    return;
                }
                return;
            }
            if (i17 == 1 && com.tencent.tavkit.component.TAVPlayer.this.player != null) {
                com.tencent.tavkit.component.TAVPlayer.this.player.play();
            }
        }
    };

    /* loaded from: classes16.dex */
    public interface ICompositionBuilder extends com.tencent.tav.player.OnCompositionUpdateListener {
        com.tencent.tavkit.composition.TAVComposition buildComposition();
    }

    /* loaded from: classes16.dex */
    public interface PlayerListener {
        void onPositionChanged(com.tencent.tav.coremedia.CMTime cMTime, com.tencent.tav.coremedia.CMTime cMTime2);

        void onStatusChanged(com.tencent.tav.player.IPlayer.PlayerStatus playerStatus, com.tencent.tav.player.Player player);
    }

    /* loaded from: classes16.dex */
    public class PostUpdateThread extends android.os.HandlerThread implements android.os.Handler.Callback {
        private static final int MSG_UNLOCK = 95;
        private static final int MSG_UPDATE = 223;
        private boolean autoPlay;
        private android.os.Handler handler;
        private volatile boolean msgLock;
        private com.tencent.tavkit.component.TAVPlayer.ICompositionBuilder templateSource;

        private void doUnlockMsg() {
            if (this.msgLock) {
                this.msgLock = false;
                com.tencent.tavkit.component.TAVPlayer.ICompositionBuilder iCompositionBuilder = this.templateSource;
                if (iCompositionBuilder != null) {
                    update(iCompositionBuilder, this.autoPlay);
                }
            }
        }

        private void doUpdateComposition(final com.tencent.tavkit.component.TAVPlayer.ICompositionBuilder iCompositionBuilder, boolean z17) {
            unlockMsg(1000);
            com.tencent.tavkit.component.TAVPlayer.this.updateComposition(iCompositionBuilder.buildComposition(), com.tencent.tav.coremedia.CMTime.CMTimeZero, z17, new com.tencent.tav.player.OnCompositionUpdateListener() { // from class: com.tencent.tavkit.component.TAVPlayer.PostUpdateThread.1
                @Override // com.tencent.tav.player.OnCompositionUpdateListener
                public void onUpdated(com.tencent.tav.player.Player player, boolean z18) {
                    iCompositionBuilder.onUpdated(player, z18);
                    com.tencent.tavkit.component.TAVPlayer.PostUpdateThread.this.unlockMsg(0);
                }
            });
        }

        private void doUpdateMsg() {
            if (this.msgLock || this.templateSource == null) {
                return;
            }
            java.lang.String unused = com.tencent.tavkit.component.TAVPlayer.this.TAG;
            this.msgLock = true;
            doUpdateComposition(this.templateSource, this.autoPlay);
            this.templateSource = null;
            this.autoPlay = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized void unlockMsg(int i17) {
            com.tencent.tav.decoder.logger.Logger.d(com.tencent.tavkit.component.TAVPlayer.this.TAG, "unlockMsg() called thread = " + java.lang.Thread.currentThread().getName());
            this.handler.removeMessages(95);
            this.handler.sendEmptyMessageDelayed(95, (long) i17);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized void update(com.tencent.tavkit.component.TAVPlayer.ICompositionBuilder iCompositionBuilder, boolean z17) {
            com.tencent.tav.decoder.logger.Logger.d(com.tencent.tavkit.component.TAVPlayer.this.TAG, "update() called with: thread = " + java.lang.Thread.currentThread().getName() + ", templateSource = [" + iCompositionBuilder + "], autoPlay = [" + z17 + "]");
            this.templateSource = iCompositionBuilder;
            this.autoPlay = z17;
            this.handler.removeMessages(223);
            this.handler.sendEmptyMessage(223);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(android.os.Message message) {
            com.tencent.tav.decoder.logger.Logger.d(com.tencent.tavkit.component.TAVPlayer.this.TAG, "handleMessage() called with: msg = [" + message + "] msgLock = " + this.msgLock + ",templateSource = " + this.templateSource);
            int i17 = message.what;
            if (i17 == 95) {
                doUnlockMsg();
                return true;
            }
            if (i17 != 223) {
                return true;
            }
            doUpdateMsg();
            return true;
        }

        @Override // android.os.HandlerThread
        public void onLooperPrepared() {
            super.onLooperPrepared();
        }

        public void release() {
            this.templateSource = null;
            android.os.Handler handler = this.handler;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                this.handler = null;
            }
            quit();
        }

        @Override // java.lang.Thread
        public synchronized void start() {
            super.start();
            this.handler = new android.os.Handler(getLooper(), this);
        }

        private PostUpdateThread(java.lang.String str) {
            super(str);
            this.msgLock = false;
        }
    }

    public TAVPlayer() {
    }

    private void abandonAudioFocus() {
        android.media.AudioManager audioManager = this.audioManager;
        if (audioManager == null) {
            return;
        }
        audioManager.abandonAudioFocus(this.audioFocusChangeListener);
    }

    private com.tencent.tav.player.PlayerItem buildPlayerItem(com.tencent.tavkit.composition.TAVComposition tAVComposition) {
        com.tencent.tav.decoder.logger.Logger.d(this.TAG, "buildPlayerItem() called with: tavComposition = [" + tAVComposition + "]");
        com.tencent.tavkit.composition.builder.TAVCompositionBuilder tAVCompositionBuilder = new com.tencent.tavkit.composition.builder.TAVCompositionBuilder(tAVComposition);
        tAVCompositionBuilder.setVideoTracksMerge(this.videoTracksMerge);
        tAVCompositionBuilder.setAudioTracksMerge(this.audioTracksMerge);
        com.tencent.tavkit.composition.TAVSource buildSource = tAVCompositionBuilder.buildSource();
        com.tencent.tav.player.PlayerItem playerItem = new com.tencent.tav.player.PlayerItem(buildSource.getAsset());
        playerItem.setVideoComposition(buildSource.getVideoComposition());
        playerItem.setAudioMix(buildSource.getAudioMix());
        return playerItem;
    }

    private void initContentView() {
        android.widget.FrameLayout frameLayout = this.mPlayerLayout;
        if (frameLayout == null) {
            return;
        }
        frameLayout.removeAllViews();
        android.view.TextureView textureView = new android.view.TextureView(this.context);
        textureView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        this.mPlayerLayout.addView(textureView);
        textureView.setSurfaceTextureListener(new android.view.TextureView.SurfaceTextureListener() { // from class: com.tencent.tavkit.component.TAVPlayer.1
            private final java.lang.String TAG = "GameTextureView@" + java.lang.Integer.toHexString(hashCode());

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
                com.tencent.tavkit.component.TAVPlayer.this.onSurfaceCreate(new android.view.Surface(surfaceTexture), i18, i17);
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
                com.tencent.tavkit.component.TAVPlayer.this.onSurfaceDestory();
                return false;
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
                com.tencent.tavkit.component.TAVPlayer.this.onSurfaceSizeChanged(i17, i18);
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
            }
        });
    }

    private com.tencent.tav.player.Player newPlayer(com.tencent.tav.player.PlayerItem playerItem, com.tencent.tav.coremedia.CMTime cMTime, boolean z17) {
        com.tencent.tav.decoder.logger.Logger.d(this.TAG, "newPlayer() called with: playerItem = [" + playerItem + "], position = [" + cMTime + "], autoPlay = [" + z17 + "]");
        com.tencent.tav.player.Player player = new com.tencent.tav.player.Player(playerItem);
        player.setPlayerListener(this.playerListener);
        player.setLoop(this.loopPlay);
        player.setRate(this.rate);
        player.setBgColor(this.bgColor);
        player.setPlayRange(this.playRange);
        player.setVolume(this.volume);
        player.seekToTime(cMTime);
        new com.tencent.tav.player.PlayerLayer(this.surface, this.surfaceWidth, this.surfaceHeight).setPlayer(player);
        if (z17 && requestAudioFocus()) {
            player.play();
        }
        com.tencent.tav.player.OnCompositionUpdateListener onCompositionUpdateListener = this.compositionUpdateListener;
        if (onCompositionUpdateListener != null) {
            onCompositionUpdateListener.onUpdated(player, false);
        }
        this.isResetting = false;
        return player;
    }

    private boolean requestAudioFocus() {
        android.content.Context context = this.context;
        if (context == null) {
            return true;
        }
        if (this.audioManager == null) {
            this.audioManager = (android.media.AudioManager) context.getSystemService("audio");
        }
        return this.audioManager.requestAudioFocus(this.audioFocusChangeListener, 3, 1) == 1;
    }

    public synchronized com.tencent.tav.player.IPlayer.PlayerStatus getCurrentStatus() {
        com.tencent.tav.player.Player player = this.player;
        if (player == null) {
            return com.tencent.tav.player.IPlayer.PlayerStatus.ERROR;
        }
        return player.currentStatus();
    }

    public synchronized com.tencent.tav.coremedia.CMTime getDuration() {
        com.tencent.tav.player.Player player = this.player;
        if (player != null) {
            return player.duration();
        }
        return com.tencent.tav.coremedia.CMTime.CMTimeZero;
    }

    public synchronized com.tencent.tav.coremedia.CMTime getPosition() {
        com.tencent.tav.player.Player player = this.player;
        if (player != null) {
            return player.position();
        }
        return com.tencent.tav.coremedia.CMTime.CMTimeInvalid;
    }

    public synchronized float getVolume() {
        return this.volume;
    }

    public synchronized boolean isPlaying() {
        com.tencent.tav.player.Player player = this.player;
        if (player == null) {
            return false;
        }
        return player.isPlaying();
    }

    public boolean isResetting() {
        return this.isResetting;
    }

    public void onSurfaceCreate(android.view.Surface surface, int i17, int i18) {
        this.surfaceWidth = i18;
        this.surfaceHeight = i17;
        this.surface = surface;
        updateComposition(this.tavComposition, this.position, this.isAutoPlay, this.compositionUpdateListener);
    }

    public void onSurfaceDestory() {
        com.tencent.tav.player.Player player = this.player;
        if (player != null && !player.isReleased()) {
            this.position = this.player.position();
            this.player.release();
        }
        this.surface = null;
    }

    public void onSurfaceSizeChanged(int i17, int i18) {
        com.tencent.tav.player.Player player = this.player;
        if (player != null) {
            player.updateViewport(i17, i18);
        }
    }

    public synchronized void pause() {
        com.tencent.tav.decoder.logger.Logger.d(this.TAG, "pause: player = " + this.player);
        if (this.player != null) {
            abandonAudioFocus();
            this.player.pause();
        } else {
            this.isAutoPlay = false;
        }
    }

    public synchronized void play() {
        com.tencent.tav.decoder.logger.Logger.d(this.TAG, "play: player = " + this.player);
        if (this.player == null) {
            this.isAutoPlay = true;
        } else if (requestAudioFocus()) {
            this.player.play();
        }
    }

    public synchronized void postUpdate(final com.tencent.tavkit.composition.TAVComposition tAVComposition, boolean z17) {
        postUpdate(new com.tencent.tavkit.component.TAVPlayer.ICompositionBuilder() { // from class: com.tencent.tavkit.component.TAVPlayer.5
            @Override // com.tencent.tavkit.component.TAVPlayer.ICompositionBuilder
            public com.tencent.tavkit.composition.TAVComposition buildComposition() {
                return tAVComposition;
            }

            @Override // com.tencent.tav.player.OnCompositionUpdateListener
            public void onUpdated(com.tencent.tav.player.Player player, boolean z18) {
            }
        }, z17);
    }

    public synchronized void release() {
        com.tencent.tav.decoder.logger.Logger.d(this.TAG, "release: player = " + this.player);
        com.tencent.tav.player.Player player = this.player;
        if (player != null) {
            this.position = player.position();
            abandonAudioFocus();
            this.player.release();
            this.player = null;
        }
        com.tencent.tavkit.component.TAVPlayer.PostUpdateThread postUpdateThread = this.postUpdateThread;
        if (postUpdateThread != null) {
            postUpdateThread.quit();
            this.postUpdateThread = null;
        }
        this.isResetting = false;
    }

    public synchronized void reset() {
        this.isResetting = true;
        initContentView();
    }

    public void seekToTime(com.tencent.tav.coremedia.CMTime cMTime) {
        com.tencent.tav.decoder.logger.Logger.d(this.TAG, "seekToTime() called with: cmTime = [" + cMTime + "],player = " + this.player);
        com.tencent.tav.player.Player player = this.player;
        if (player != null) {
            player.seekToTime(cMTime);
        }
    }

    public void setAllowInterrupt(boolean z17) {
        this.isAllowInterrupt = z17;
    }

    public void setAudioTracksMerge(boolean z17) {
        this.audioTracksMerge = z17;
    }

    public synchronized void setAutoPlay(boolean z17) {
        this.isAutoPlay = z17;
    }

    public void setBgColor(int i17) {
        this.bgColor = i17;
        com.tencent.tav.player.Player player = this.player;
        if (player != null) {
            player.setBgColor(i17);
        }
    }

    public synchronized void setLoopPlay(boolean z17) {
        com.tencent.tav.decoder.logger.Logger.d(this.TAG, "setLoopPlay() called with: loopPlay = [" + z17 + "],player = " + this.player);
        this.loopPlay = z17;
        com.tencent.tav.player.Player player = this.player;
        if (player != null) {
            player.setLoop(z17);
        }
    }

    public synchronized void setPlayRange(com.tencent.tav.coremedia.CMTimeRange cMTimeRange) {
        com.tencent.tav.decoder.logger.Logger.d(this.TAG, "setPlayRange() called with: playRange = [" + cMTimeRange + "],player = " + this.player);
        this.playRange = cMTimeRange;
        com.tencent.tav.player.Player player = this.player;
        if (player != null) {
            player.setPlayRange(cMTimeRange);
        }
    }

    public void setPlayerListener(final com.tencent.tavkit.component.TAVPlayer.PlayerListener playerListener) {
        com.tencent.tav.decoder.logger.Logger.d(this.TAG, "setPlayerListener() called with: playerListener = [" + playerListener + "],player = " + this.player);
        setPlayerListener(new com.tencent.tav.player.IPlayer.PlayerListener() { // from class: com.tencent.tavkit.component.TAVPlayer.2
            @Override // com.tencent.tav.player.IPlayer.PlayerListener
            public void onPositionChanged(com.tencent.tav.coremedia.CMTime cMTime) {
                if (playerListener == null || com.tencent.tavkit.component.TAVPlayer.this.player == null) {
                    return;
                }
                playerListener.onPositionChanged(cMTime, com.tencent.tavkit.component.TAVPlayer.this.player.duration());
            }

            @Override // com.tencent.tav.player.IPlayer.PlayerListener
            public void onStatusChanged(com.tencent.tav.player.IPlayer.PlayerStatus playerStatus) {
                if (playerListener == null || com.tencent.tavkit.component.TAVPlayer.this.player == null) {
                    return;
                }
                playerListener.onStatusChanged(playerStatus, com.tencent.tavkit.component.TAVPlayer.this.player);
            }
        });
    }

    public synchronized void setRate(float f17) {
        com.tencent.tav.decoder.logger.Logger.d(this.TAG, "setLoopPlay() called with: loopPlay = [" + this.loopPlay + "],player = " + this.player);
        this.rate = f17;
        com.tencent.tav.player.Player player = this.player;
        if (player != null) {
            player.setRate(f17);
        }
    }

    public void setVideoTracksMerge(boolean z17) {
        this.videoTracksMerge = z17;
    }

    public synchronized void setVolume(float f17) {
        com.tencent.tav.decoder.logger.Logger.d(this.TAG, "setVolume() called with: volume = [" + f17 + "],player = " + this.player);
        this.volume = f17;
        com.tencent.tav.player.Player player = this.player;
        if (player != null) {
            player.setVolume(f17);
        }
    }

    public void updateComposition(com.tencent.tavkit.composition.TAVComposition tAVComposition, boolean z17) {
        updateComposition(tAVComposition, com.tencent.tav.coremedia.CMTime.CMTimeZero, z17);
    }

    public void updateComposition(com.tencent.tavkit.composition.TAVComposition tAVComposition, com.tencent.tav.coremedia.CMTime cMTime, boolean z17) {
        updateComposition(tAVComposition, cMTime, z17, null);
    }

    private void setPlayerListener(com.tencent.tav.player.IPlayer.PlayerListener playerListener) {
        com.tencent.tav.decoder.logger.Logger.d(this.TAG, "setPlayerListener() called with: playerListener = [" + playerListener + "],player = " + this.player);
        this.playerListener = playerListener;
        com.tencent.tav.player.Player player = this.player;
        if (player != null) {
            player.setPlayerListener(playerListener);
        }
    }

    public synchronized void postUpdate(com.tencent.tavkit.component.TAVPlayer.ICompositionBuilder iCompositionBuilder, boolean z17) {
        if (this.postUpdateThread == null) {
            com.tencent.tavkit.component.TAVPlayer.PostUpdateThread postUpdateThread = new com.tencent.tavkit.component.TAVPlayer.PostUpdateThread("PostUpdateThread");
            this.postUpdateThread = postUpdateThread;
            postUpdateThread.start();
        }
        this.postUpdateThread.update(iCompositionBuilder, z17);
    }

    public void updateComposition(com.tencent.tavkit.composition.TAVComposition tAVComposition, final com.tencent.tav.coremedia.CMTime cMTime, final boolean z17, com.tencent.tav.player.OnCompositionUpdateListener onCompositionUpdateListener) {
        com.tencent.tav.decoder.logger.Logger.d(this.TAG, "updateComposition() called with: tavComposition = [" + tAVComposition + "], position = [" + cMTime + "], autoPlay = [" + z17 + "]");
        this.tavComposition = tAVComposition;
        this.position = cMTime;
        this.compositionUpdateListener = onCompositionUpdateListener;
        if (tAVComposition == null) {
            this.isResetting = false;
            return;
        }
        if (this.surface == null) {
            this.isAutoPlay = z17;
            this.isResetting = false;
            return;
        }
        com.tencent.tav.player.PlayerItem buildPlayerItem = buildPlayerItem(tAVComposition);
        com.tencent.tav.player.Player player = this.player;
        if (player != null && !player.isReleased()) {
            com.tencent.tav.player.Player player2 = this.player;
            if (onCompositionUpdateListener == null) {
                onCompositionUpdateListener = new com.tencent.tav.player.OnCompositionUpdateListener() { // from class: com.tencent.tavkit.component.TAVPlayer.3
                    @Override // com.tencent.tav.player.OnCompositionUpdateListener
                    public void onUpdated(com.tencent.tav.player.Player player3, boolean z18) {
                        com.tencent.tavkit.component.TAVPlayer.this.seekToTime(cMTime);
                        if (z17 && z18) {
                            com.tencent.tavkit.component.TAVPlayer.this.play();
                        }
                        com.tencent.tavkit.component.TAVPlayer.this.isResetting = false;
                    }
                };
            }
            player2.update(buildPlayerItem, cMTime, onCompositionUpdateListener);
            this.compositionUpdateListener = null;
            return;
        }
        this.player = newPlayer(buildPlayerItem, cMTime, z17);
    }

    public TAVPlayer(android.view.Surface surface, int i17, int i18) {
        onSurfaceCreate(surface, i18, i17);
    }

    public TAVPlayer(android.widget.FrameLayout frameLayout) {
        this.context = frameLayout.getContext();
        this.mPlayerLayout = frameLayout;
        initContentView();
    }
}
