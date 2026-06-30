package com.tencent.tav.player;

/* loaded from: classes16.dex */
public class PlayerThreadAudio implements android.os.Handler.Callback {
    private static final java.lang.String TAG = "PlayerThreadAudio";
    private com.tencent.tav.core.AudioCompositionDecoderTrack audioDecoderTrack;
    private com.tencent.tav.player.AudioTrackWrapper mAudioTrack;
    private boolean mLooper;
    private android.os.Handler mMainHandler;
    private android.os.Handler mPlayHandler;
    private android.os.HandlerThread mThread;
    private android.os.Handler mVideoHandler;
    public volatile com.tencent.tav.coremedia.CMSampleState currentPlayingState = new com.tencent.tav.coremedia.CMSampleState();
    public volatile long lastSyncMessgeId = -1;
    private int mStatus = 1;
    private float rate = 1.0f;
    private float volume = 1.0f;

    public PlayerThreadAudio(com.tencent.tav.core.AudioCompositionDecoderTrack audioCompositionDecoderTrack, android.os.Handler handler, android.os.Handler handler2) {
        this.audioDecoderTrack = audioCompositionDecoderTrack;
        this.mMainHandler = handler;
        this.mVideoHandler = handler2;
        initThread();
    }

    private void actionPrepare() {
        if (this.audioDecoderTrack != null) {
            updateStatus(2);
            releaseAudioTrack();
        }
    }

    private java.lang.String catLog(int i17) {
        return (java.lang.String) com.tencent.tav.player.PlayerThread.map.e(i17, null);
    }

    private void initThread() {
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("PlayerAudioThread");
        this.mThread = handlerThread;
        handlerThread.start();
        this.mPlayHandler = new android.os.Handler(this.mThread.getLooper(), this);
    }

    private void pause() {
        if (this.mStatus == 2) {
            this.mLooper = false;
            this.currentPlayingState = new com.tencent.tav.coremedia.CMSampleState();
            removePendingMessage(12);
        }
    }

    private void play(java.lang.Object obj) {
        if (this.mStatus == 1) {
            return;
        }
        this.mLooper = true;
        if ((obj instanceof com.tencent.tav.coremedia.CMTime) && java.lang.Math.abs(((com.tencent.tav.coremedia.CMTime) obj).getTimeUs() - this.currentPlayingState.getTime().getTimeUs()) > 100000) {
            seekTo(obj);
        }
        if (this.mStatus == 3) {
            updateStatus(2);
        }
        sendMessage(12, com.tencent.tav.core.AssetExtension.SCENE_PLAY, java.lang.System.currentTimeMillis());
    }

    private void playerFinish() {
        this.currentPlayingState = new com.tencent.tav.coremedia.CMSampleState();
        this.audioDecoderTrack.seekTo(com.tencent.tav.coremedia.CMTime.CMTimeZero, false, true);
        this.mLooper = false;
        updateStatus(3);
        removePendingMessage(12);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void readSample() {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tav.player.PlayerThreadAudio.readSample():void");
    }

    private void release() {
        releaseAudioTrack();
        removePendingMessage(new int[0]);
        updateStatus(1);
        try {
            try {
                com.tencent.tav.decoder.logger.Logger.e(TAG, "quit: PlayerThreadAudio " + this);
                this.mThread.quit();
                this.mThread = null;
                synchronized (this.mVideoHandler) {
                    this.mVideoHandler.sendEmptyMessage(850);
                }
            } catch (java.lang.Exception e17) {
                com.tencent.tav.decoder.logger.Logger.e(TAG, "release error-->", e17);
                synchronized (this.mVideoHandler) {
                    this.mVideoHandler.sendEmptyMessage(850);
                }
            }
            this.mPlayHandler = null;
            this.mVideoHandler = null;
        } catch (java.lang.Throwable th6) {
            synchronized (this.mVideoHandler) {
                this.mVideoHandler.sendEmptyMessage(850);
                this.mPlayHandler = null;
                this.mVideoHandler = null;
                throw th6;
            }
        }
    }

    private void releaseAudioTrack() {
        com.tencent.tav.player.AudioTrackWrapper audioTrackWrapper = this.mAudioTrack;
        if (audioTrackWrapper != null) {
            audioTrackWrapper.stop();
            this.mAudioTrack.release();
            this.mAudioTrack = null;
        }
    }

    private void removePendingMessage(int... iArr) {
        if (iArr == null || iArr.length == 0) {
            this.mPlayHandler.removeCallbacksAndMessages(null);
            return;
        }
        for (int i17 : iArr) {
            this.mPlayHandler.removeMessages(i17);
        }
    }

    private void scheduleNextWork() {
        sendMessage(12, "schedule next", java.lang.System.currentTimeMillis());
    }

    private void seekTo(java.lang.Object obj) {
        if (obj instanceof com.tencent.tav.player.PlayerMessage) {
            obj = ((com.tencent.tav.player.PlayerMessage) obj).bizMsg1;
        }
        if (obj instanceof com.tencent.tav.coremedia.CMTime) {
            com.tencent.tav.coremedia.CMTime cMTime = (com.tencent.tav.coremedia.CMTime) obj;
            this.currentPlayingState = new com.tencent.tav.coremedia.CMSampleState(cMTime);
            this.audioDecoderTrack.seekTo(cMTime, false, true);
        }
        com.tencent.tav.player.AudioTrackWrapper audioTrackWrapper = this.mAudioTrack;
        if (audioTrackWrapper != null) {
            audioTrackWrapper.flush();
        }
    }

    private void setVolume(java.lang.Object obj) {
        float floatValue = obj instanceof com.tencent.tav.player.PlayerMessage ? ((java.lang.Float) ((com.tencent.tav.player.PlayerMessage) obj).bizMsg1).floatValue() : obj instanceof java.lang.Float ? ((java.lang.Float) obj).floatValue() : 1.0f;
        if (floatValue < 0.0f || floatValue > 1.0f) {
            return;
        }
        setVolumeToAudioTrack(floatValue);
    }

    private void setVolumeToAudioTrack(float f17) {
        this.volume = f17;
        com.tencent.tav.player.AudioTrackWrapper audioTrackWrapper = this.mAudioTrack;
        if (audioTrackWrapper != null) {
            audioTrackWrapper.setVolume(f17);
        }
    }

    private void stop(boolean z17) {
        if (z17) {
            removePendingMessage(12);
            this.mLooper = false;
            this.currentPlayingState = new com.tencent.tav.coremedia.CMSampleState();
        }
        updateStatus(1);
        releaseAudioTrack();
    }

    private void updateStatus(int i17) {
        this.mStatus = i17;
    }

    private void v(java.lang.String str, java.lang.String str2) {
        com.tencent.tav.decoder.logger.Logger.v(str, str2);
    }

    public com.tencent.tav.coremedia.CMTime getCurrentPlayingState() {
        return this.currentPlayingState.getTime();
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        java.lang.Object obj = message.obj;
        com.tencent.tav.player.PlayerMessage playerMessage = obj == null ? null : (com.tencent.tav.player.PlayerMessage) obj;
        java.lang.Object obj2 = playerMessage != null ? playerMessage.bizMsg1 : null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleMessage() called with: msg = [");
        sb6.append(catLog(message.what));
        sb6.append(message.what);
        sb6.append("]--status-->");
        sb6.append(this.mStatus);
        sb6.append("--from-->");
        sb6.append(playerMessage != null ? playerMessage : null);
        sb6.append(" targetObj = ");
        sb6.append(obj2);
        v(TAG, sb6.toString());
        try {
            try {
                int i17 = message.what;
                if (i17 == -1) {
                    playerFinish();
                } else if (i17 != 12) {
                    switch (i17) {
                        case 1:
                            actionPrepare();
                            break;
                        case 2:
                            play(obj2);
                            break;
                        case 3:
                            pause();
                            break;
                        case 4:
                            stop(false);
                            break;
                        case 5:
                            seekTo(obj2);
                            break;
                        case 6:
                            release();
                            break;
                        case 7:
                            setVolume(obj2);
                            break;
                    }
                } else {
                    readSample();
                }
                if (playerMessage == null || android.text.TextUtils.isEmpty(playerMessage.form) || !playerMessage.form.startsWith("syncAudioStatus")) {
                    return true;
                }
                com.tencent.tav.decoder.logger.Logger.d(TAG, "handleMessage:  SyncMessageId = " + playerMessage.msgId + ", what = " + message.what);
                this.lastSyncMessgeId = playerMessage.msgId;
                return true;
            } catch (java.lang.Exception e17) {
                com.tencent.tav.decoder.logger.Logger.e(TAG, "handleMessage: error", e17);
                if (playerMessage != null && !android.text.TextUtils.isEmpty(playerMessage.form) && playerMessage.form.startsWith("syncAudioStatus")) {
                    com.tencent.tav.decoder.logger.Logger.d(TAG, "handleMessage:  SyncMessageId = " + playerMessage.msgId + ", what = " + message.what);
                    this.lastSyncMessgeId = playerMessage.msgId;
                }
                return false;
            }
        } catch (java.lang.Throwable th6) {
            if (playerMessage != null && !android.text.TextUtils.isEmpty(playerMessage.form) && playerMessage.form.startsWith("syncAudioStatus")) {
                com.tencent.tav.decoder.logger.Logger.d(TAG, "handleMessage:  SyncMessageId = " + playerMessage.msgId + ", what = " + message.what);
                this.lastSyncMessgeId = playerMessage.msgId;
            }
            throw th6;
        }
    }

    public boolean isFinished() {
        return 3 == this.mStatus && this.currentPlayingState.isInvalid();
    }

    public void sendMessage(int i17, java.lang.Object obj, java.lang.String str, long j17) {
        v(TAG, "sendMessage() called with: what = [" + catLog(i17) + "], obj = [" + obj + "], from = [" + str + "]");
        android.os.Handler handler = this.mPlayHandler;
        if (handler == null || this.mThread == null) {
            return;
        }
        if ((i17 == 3 || i17 == -1 || i17 == 5 || i17 == 6) && handler.hasMessages(12)) {
            this.mPlayHandler.removeMessages(12);
            sendMessage(12, "schedule next", java.lang.System.currentTimeMillis());
        }
        this.mPlayHandler.obtainMessage(i17, new com.tencent.tav.player.PlayerMessage(obj, str, j17)).sendToTarget();
    }

    public void sendMessageDelay(int i17, long j17, java.lang.String str, long j18) {
        v(TAG, "sendMessageDelay() called with: what = [" + catLog(i17) + "], delay = [" + j17 + "], from = [" + str + "]");
        if (this.mPlayHandler != null) {
            android.os.Message message = new android.os.Message();
            message.what = i17;
            message.obj = new com.tencent.tav.player.PlayerMessage(null, str, j18);
            this.mPlayHandler.sendMessageDelayed(message, j17);
        }
    }

    public void setRate(float f17) {
        this.rate = java.lang.Math.abs(f17);
    }

    public void update(com.tencent.tav.core.AudioCompositionDecoderTrack audioCompositionDecoderTrack) {
        this.audioDecoderTrack = audioCompositionDecoderTrack;
    }

    @java.lang.Deprecated
    public void updateComposition(com.tencent.tav.core.AudioCompositionDecoderTrack audioCompositionDecoderTrack) {
        sendMessage(4, "updateComposition", java.lang.System.currentTimeMillis());
        sendMessage(1, audioCompositionDecoderTrack, "updateComposition", java.lang.System.currentTimeMillis());
    }

    public void sendMessage(int i17, java.lang.String str, long j17) {
        v(TAG, "sendMessage() called with: what = [" + catLog(i17) + "], from = [" + str + "]");
        android.os.Handler handler = this.mPlayHandler;
        if (handler == null || this.mThread == null) {
            return;
        }
        handler.obtainMessage(i17, new com.tencent.tav.player.PlayerMessage(null, str, j17)).sendToTarget();
    }
}
