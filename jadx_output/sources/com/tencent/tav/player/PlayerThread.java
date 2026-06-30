package com.tencent.tav.player;

/* loaded from: classes16.dex */
public class PlayerThread implements android.os.Handler.Callback {
    static final int ACTION_FINISH = -1;
    static final int ACTION_GET_TAV_EXTRA_INFO = 25;
    static final int ACTION_PAUSE = 3;
    static final int ACTION_PLAY = 2;
    static final int ACTION_PREPARE = 1;
    static final int ACTION_QUIT = 850;
    static final int ACTION_READ_SAMPLE = 12;
    static final int ACTION_READ_SNAP_SHOOT_BITMAP = 24;
    static final int ACTION_REFRESH_SURFACE = 26;
    static final int ACTION_RELEASE = 6;
    static final int ACTION_SEEK = 5;
    static final int ACTION_SEEK_PRE_SAMPLE = 9;
    static final int ACTION_SET_VOLUME = 7;
    static final int ACTION_STOP = 4;
    static final int ACTION_UPDATE_ALLPROPERTIES = 20;
    static final int ACTION_UPDATE_AUDIOCLIP_PROPERTIES = 22;
    static final int ACTION_UPDATE_AUDIOVOLUME_PROPERTIES = 23;
    static final int ACTION_UPDATE_COMPOSITION = 11;
    static final int ACTION_UPDATE_PROPERTIES = 10;
    static final int ACTION_UPDATE_SIZE = 21;
    static final int STATUS_FINISH = 3;
    static final int STATUS_INIT_CODEC = 2;
    static final int STATUS_NONE = 1;
    public static final java.lang.String TAG = "PlayerThreadMain";
    private static final long UNIT_TIME = 1000;
    public static x.o map;
    private byte _hellAccFlag_;
    private com.tencent.tav.core.AudioCompositionDecoderTrack aDecoderTrack;
    private boolean enableLut;
    private com.tencent.tav.decoder.Filter filter;
    private com.tencent.tav.coremedia.CMTime frameDuration;
    private com.tencent.tav.coremedia.CGRect glViewportRect;
    private com.tencent.tav.core.composition.VideoComposition.RenderLayoutMode layoutMode;
    private android.graphics.Bitmap lutBitmap;
    private com.tencent.tav.player.PlayerThreadAudio mAudioThread;
    private android.view.Surface mDisplayTarget;
    private boolean mLooper;
    private android.os.Handler mMainHandler;
    private boolean mPause;
    private android.os.Handler mPlayHandler;
    private com.tencent.tav.coremedia.CMTimeRange mPlayRange;
    private com.tencent.tav.player.Player mPlayer;
    private com.tencent.tav.player.PlayerItem mPlayerItem;
    private long mStartTime;
    private android.os.HandlerThread mThread;
    private com.tencent.tav.player.OnGetTavExtraListener onGetTavExtraListener;
    private com.tencent.tav.player.OnReadSnapShootListener onReadSnapShootListener;
    private com.tencent.tav.decoder.RenderContext renderContext;
    private com.tencent.tav.decoder.RenderContextParams renderContextParams;
    private com.tencent.tav.coremedia.CGSize renderSize;
    private com.tencent.tav.report.PreviewReportSession reportSession;
    private com.tencent.tav.coremedia.CGSize surfaceSize;
    private com.tencent.tav.decoder.IDecoderTrack vDecoderTrack;
    private volatile long lastSyncMessageId = 0;
    private long decoderConsumerTimeUs = 0;
    private com.tencent.tav.coremedia.CMTime mPosition = com.tencent.tav.coremedia.CMTime.CMTimeZero;
    private int mStatus = 1;
    private float rate = 1.0f;
    private volatile boolean mEnableScheduleNext = false;
    private long startTimeUsMark = getCurrentUsTime();

    /* renamed from: com.tencent.tav.player.PlayerThread$2, reason: invalid class name */
    /* loaded from: classes16.dex */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$tencent$tav$core$composition$VideoComposition$RenderLayoutMode;

        static {
            int[] iArr = new int[com.tencent.tav.core.composition.VideoComposition.RenderLayoutMode.values().length];
            $SwitchMap$com$tencent$tav$core$composition$VideoComposition$RenderLayoutMode = iArr;
            try {
                iArr[com.tencent.tav.core.composition.VideoComposition.RenderLayoutMode.aspectFit.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$tencent$tav$core$composition$VideoComposition$RenderLayoutMode[com.tencent.tav.core.composition.VideoComposition.RenderLayoutMode.aspectFill.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    static {
        x.o oVar = new x.o(10);
        map = oVar;
        oVar.g(1, "初始化");
        map.g(2, "播放");
        map.g(3, "暂停");
        map.g(4, "停止");
        map.g(5, "拖动");
        map.g(12, "读取下一帧");
        map.g(6, "结束线程");
        map.g(26, "刷新渲染");
    }

    public PlayerThread(com.tencent.tav.decoder.IDecoderTrack iDecoderTrack, com.tencent.tav.core.AudioCompositionDecoderTrack audioCompositionDecoderTrack, com.tencent.tav.coremedia.CGSize cGSize, android.view.Surface surface, android.os.Handler handler, com.tencent.tav.player.Player player) {
        this.frameDuration = new com.tencent.tav.coremedia.CMTime(1L, 30);
        this.vDecoderTrack = iDecoderTrack;
        this.aDecoderTrack = audioCompositionDecoderTrack;
        this.mDisplayTarget = surface;
        this.mMainHandler = handler;
        this.renderSize = cGSize;
        if (iDecoderTrack != null) {
            this.frameDuration = iDecoderTrack.getFrameDuration();
        }
        this.mPlayer = player;
        this.mPlayerItem = player.getCurrentItem();
        initThread();
    }

    private void applyViewport() {
        com.tencent.tav.coremedia.CGRect cGRect;
        com.tencent.tav.decoder.RenderContext renderContext = this.renderContext;
        if (renderContext == null || (cGRect = this.glViewportRect) == null || cGRect.origin == null || cGRect.size == null) {
            return;
        }
        renderContext.updateViewport(cGRect);
    }

    private java.lang.String catLog(int i17) {
        java.lang.String str = (java.lang.String) map.e(i17, null);
        return android.text.TextUtils.isEmpty(str) ? java.lang.String.valueOf(i17) : str;
    }

    private void checkCopyPixelBuffer(com.tencent.tav.coremedia.CMTime cMTime) {
        if (this.onReadSnapShootListener != null) {
            java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(this.renderContext.width() * this.renderContext.height() * 4);
            allocateDirect.order(java.nio.ByteOrder.LITTLE_ENDIAN);
            allocateDirect.rewind();
            android.opengl.GLES20.glReadPixels(0, 0, this.renderContext.width(), this.renderContext.height(), com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGBA, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, allocateDirect);
            int width = this.renderContext.width();
            int height = this.renderContext.height();
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_4444;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(height));
            arrayList.add(java.lang.Integer.valueOf(width));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/tav/player/PlayerThread", "checkCopyPixelBuffer", "(Lcom/tencent/tav/coremedia/CMTime;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj, createBitmap, "com/tencent/tav/player/PlayerThread", "checkCopyPixelBuffer", "(Lcom/tencent/tav/coremedia/CMTime;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            allocateDirect.rewind();
            createBitmap.copyPixelsFromBuffer(allocateDirect);
            this.onReadSnapShootListener.onSuccess(com.tencent.tav.Utils.flipYBitmap(createBitmap), cMTime);
            this.onReadSnapShootListener = null;
        }
    }

    private long getCurrentUsTime() {
        return java.lang.System.nanoTime() / 1000;
    }

    private com.tencent.tav.coremedia.CMTime getLastSeekPosAndRemoveOther() {
        com.tencent.tav.coremedia.CMTime cMTime = com.tencent.tav.coremedia.CMTime.CMTimeInvalid;
        android.os.MessageQueue queue = this.mPlayHandler.getLooper().getQueue();
        java.lang.reflect.Field declaredField = android.os.MessageQueue.class.getDeclaredField("mMessages");
        declaredField.setAccessible(true);
        android.os.Message message = (android.os.Message) declaredField.get(queue);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (message != null) {
            if (message.what == 5) {
                java.lang.Object obj = message.obj;
                if (obj instanceof com.tencent.tav.player.PlayerMessage) {
                    cMTime = (com.tencent.tav.coremedia.CMTime) ((com.tencent.tav.player.PlayerMessage) obj).bizMsg1;
                    arrayList.add(message);
                    java.lang.reflect.Field declaredField2 = android.os.Message.class.getDeclaredField("next");
                    declaredField2.setAccessible(true);
                    message = (android.os.Message) declaredField2.get(message);
                }
            }
            if (message.getTarget() == this.mPlayHandler) {
                break;
            }
            java.lang.reflect.Field declaredField22 = android.os.Message.class.getDeclaredField("next");
            declaredField22.setAccessible(true);
            message = (android.os.Message) declaredField22.get(message);
        }
        if (cMTime != com.tencent.tav.coremedia.CMTime.CMTimeInvalid) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                android.os.Message message2 = (android.os.Message) it.next();
                this.mPlayHandler.removeMessages(message2.what, message2.obj);
            }
        }
        return cMTime;
    }

    private long getWaitTime(com.tencent.tav.coremedia.CMTime cMTime, boolean z17, boolean z18) {
        long timeUs = this.frameDuration.getTimeUs();
        long timeUs2 = cMTime.getTimeUs();
        if (z17 || z18) {
            com.tencent.tav.decoder.logger.Logger.d("PlayerThreadMain", "getWaitTime - 0 " + z17 + "  |  " + z18);
            return 0L;
        }
        long abs = ((float) timeUs) / java.lang.Math.abs(this.rate);
        long j17 = abs - this.decoderConsumerTimeUs;
        com.tencent.tav.decoder.logger.Logger.v("PlayerThreadMain", "getWaitTime--position-->" + timeUs2 + " rate = " + this.rate + "--decoderConsumerTimeUs-->" + this.decoderConsumerTimeUs + "--frameDurationMs-->" + timeUs + "--realTime-->" + abs + "--nextFrameTime-->" + (timeUs2 + abs) + "--sleepTime-->" + j17 + "  mStartTime = " + this.mStartTime);
        return j17;
    }

    private void initDecoderTrack(java.lang.Object obj) {
        com.tencent.tav.coremedia.CGSize cGSize;
        if (this.renderContext == null && this.mDisplayTarget != null) {
            com.tencent.tav.decoder.RenderContextParams renderContextParams = this.renderContextParams;
            android.opengl.EGLContext eGLContext = (renderContextParams == null || !(renderContextParams.getParam("share_context") instanceof android.opengl.EGLContext)) ? null : (android.opengl.EGLContext) this.renderContextParams.getParam("share_context");
            if (eGLContext != null) {
                com.tencent.tav.coremedia.CGSize cGSize2 = this.surfaceSize;
                this.renderContext = new com.tencent.tav.decoder.RenderContext((int) cGSize2.width, (int) cGSize2.height, this.mDisplayTarget, eGLContext);
            } else {
                com.tencent.tav.coremedia.CGSize cGSize3 = this.surfaceSize;
                this.renderContext = new com.tencent.tav.decoder.RenderContext((int) cGSize3.width, (int) cGSize3.height, this.mDisplayTarget);
            }
            this.renderContext.setParams(this.renderContextParams);
        }
        com.tencent.tav.core.composition.VideoComposition videoComposition = this.mPlayerItem.getVideoComposition();
        if (videoComposition != null) {
            this.renderSize = videoComposition.getRenderSize();
            this.layoutMode = videoComposition.getRenderLayoutMode();
        }
        com.tencent.tav.decoder.RenderContext renderContext = this.renderContext;
        if (renderContext != null && (cGSize = this.renderSize) != null) {
            renderContext.setHeight((int) cGSize.height);
            this.renderContext.setWidth((int) this.renderSize.width);
        }
        initViewport();
        updateProgressPreNextAction(this.mPosition);
        com.tencent.tav.decoder.IDecoderTrack iDecoderTrack = this.vDecoderTrack;
        if (iDecoderTrack != null) {
            try {
                iDecoderTrack.setFrameRate((int) (r5.timeScale / this.frameDuration.getValue()));
                this.vDecoderTrack.start(this.renderContext);
                if (!this.mLooper) {
                    if (this.mPosition == com.tencent.tav.coremedia.CMTime.CMTimeInvalid) {
                        this.mPosition = this.vDecoderTrack.getDuration();
                    }
                    this.vDecoderTrack.seekTo(this.mPosition, false, true);
                    readSample(-1);
                }
                onCompositionUpdate(obj, true);
                com.tencent.tav.decoder.logger.Logger.v("PlayerThreadMain", "prepare: init codec-->" + java.lang.Thread.currentThread().getName() + "--vDecoderTrack-->" + this.vDecoderTrack);
            } catch (java.lang.Exception e17) {
                com.tencent.tav.decoder.logger.Logger.v("PlayerThreadMain", "init composition cause exception: " + e17);
                this.vDecoderTrack.release();
                this.vDecoderTrack = null;
                onCompositionUpdate(obj, false);
            }
        } else {
            onCompositionUpdate(obj, false);
        }
        com.tencent.tav.core.AudioCompositionDecoderTrack audioCompositionDecoderTrack = this.aDecoderTrack;
        if (audioCompositionDecoderTrack != null) {
            audioCompositionDecoderTrack.start();
            this.aDecoderTrack.seekTo(this.mPosition, false, false);
        }
        updateStatus(2);
        synAudioComposition();
        notifyProgressChange();
    }

    private void initThread() {
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("PlayerVideoThread");
        this.mThread = handlerThread;
        handlerThread.start();
        this.mPlayHandler = new android.os.Handler(this.mThread.getLooper(), this);
        this.mAudioThread = new com.tencent.tav.player.PlayerThreadAudio(this.aDecoderTrack, this.mMainHandler, getPlayHandler());
    }

    private void initViewport() {
        com.tencent.tav.coremedia.CGSize cGSize = this.renderSize;
        if (cGSize == null) {
            cGSize = this.surfaceSize;
        }
        if (this.layoutMode == null) {
            this.glViewportRect = com.tencent.tav.core.CGMathFunctions.initGLViewportDefault(this.surfaceSize, cGSize);
        } else {
            initViewportByLayoutMode(cGSize);
        }
        applyViewport();
        this.mMainHandler.obtainMessage(3, this.glViewportRect).sendToTarget();
    }

    private void initViewportByLayoutMode(com.tencent.tav.coremedia.CGSize cGSize) {
        int i17 = com.tencent.tav.player.PlayerThread.AnonymousClass2.$SwitchMap$com$tencent$tav$core$composition$VideoComposition$RenderLayoutMode[this.layoutMode.ordinal()];
        if (i17 == 1) {
            this.glViewportRect = com.tencent.tav.core.CGMathFunctions.initGLViewportFit(this.surfaceSize, cGSize);
        } else if (i17 != 2) {
            this.glViewportRect = com.tencent.tav.core.CGMathFunctions.initGLViewportDefault(this.surfaceSize, cGSize);
        } else {
            this.glViewportRect = com.tencent.tav.core.CGMathFunctions.initGLViewportFill(this.surfaceSize, cGSize);
        }
    }

    private void isNeedEnsureLooper(int i17) {
        if (i17 == 2) {
            this.mLooper = true;
        }
    }

    private boolean needNotifyProgressChange() {
        try {
            android.os.MessageQueue queue = this.mPlayHandler.getLooper().getQueue();
            java.lang.reflect.Field declaredField = android.os.MessageQueue.class.getDeclaredField("mMessages");
            declaredField.setAccessible(true);
            android.os.Message message = (android.os.Message) declaredField.get(queue);
            if (message != null) {
                int i17 = message.what;
                if (i17 == 3 || i17 == 4 || i17 == 1 || i17 == ACTION_QUIT || i17 == 6) {
                    return false;
                }
            }
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.tav.decoder.logger.Logger.e("PlayerThreadMain", "needNotifyProgressChange", e17);
            return false;
        }
    }

    private void notifyProgressChange() {
        if (needNotifyProgressChange()) {
            this.mMainHandler.obtainMessage(2, this.mPosition).sendToTarget();
        }
    }

    private void notifyStatus(com.tencent.tav.player.IPlayer.PlayerStatus playerStatus, java.lang.String str) {
        this.mMainHandler.obtainMessage(1, new com.tencent.tav.player.PlayerStatusMsg(playerStatus, str)).sendToTarget();
    }

    private void onCompositionUpdate(java.lang.Object obj, boolean z17) {
        if (obj instanceof com.tencent.tav.player.OnCompositionUpdateListener) {
            ((com.tencent.tav.player.OnCompositionUpdateListener) obj).onUpdated(this.mPlayer, z17);
        }
    }

    private void pause() {
        this.mLooper = false;
        this.mPause = true;
        enableScheduleNext(false);
        removePendingMessage(12);
        notifyStatus(com.tencent.tav.player.IPlayer.PlayerStatus.PAUSED, "");
    }

    private void play() {
        int i17 = this.mStatus;
        if (i17 == 1) {
            if (this.vDecoderTrack == null && this.aDecoderTrack == null) {
                return;
            }
            sendMessage(1, "not can play");
            sendMessage(2, "not can play");
            return;
        }
        if (i17 == 3) {
            com.tencent.tav.decoder.IDecoderTrack iDecoderTrack = this.vDecoderTrack;
            if (iDecoderTrack != null) {
                if (this.mPosition.smallThan(iDecoderTrack.getDuration())) {
                    this.vDecoderTrack.seekTo(this.mPosition, false, true);
                } else {
                    this.vDecoderTrack.seekTo(com.tencent.tav.coremedia.CMTime.CMTimeZero, false, true);
                }
            }
            updateStatus(2);
        }
        removePendingMessage(12);
        this.mLooper = true;
        enableScheduleNext(true);
        sendMessage(12, 2, com.tencent.tav.core.AssetExtension.SCENE_PLAY);
        notifyStatus(com.tencent.tav.player.IPlayer.PlayerStatus.PLAYING, "");
        com.tencent.tav.decoder.logger.Logger.v("PlayerThreadMain", "playm() called start play-->" + this.mStatus);
    }

    private void playerFinish() {
        com.tencent.tav.decoder.logger.Logger.d("PlayerThreadMain", "playFinish");
        com.tencent.tav.decoder.IDecoderTrack iDecoderTrack = this.vDecoderTrack;
        updateProgressPreNextAction(iDecoderTrack != null ? iDecoderTrack.getDuration() : this.mPlayer.duration());
        notifyProgressChange();
        updateStatus(3);
        syncAudioOtherMsg(-1, null);
        com.tencent.tav.decoder.IDecoderTrack iDecoderTrack2 = this.vDecoderTrack;
        if (iDecoderTrack2 != null) {
            iDecoderTrack2.seekTo(com.tencent.tav.coremedia.CMTime.CMTimeZero, false, true);
        }
        this.mStartTime = 0L;
        this.mLooper = false;
        notifyStatus(com.tencent.tav.player.IPlayer.PlayerStatus.FINISHED, "");
    }

    private void prepare(java.lang.Object obj) {
        if (this.mStatus == 1) {
            initDecoderTrack(obj);
            enableScheduleNext(true);
        } else {
            sendMessage(4, java.lang.Boolean.FALSE, "prepare");
            sendMessage(1, obj, "prepare");
        }
    }

    private void readSample(int i17) {
        readSample(i17, (this.mAudioThread.lastSyncMessgeId > this.lastSyncMessageId ? 1 : (this.mAudioThread.lastSyncMessgeId == this.lastSyncMessageId ? 0 : -1)) == 0 ? this.mAudioThread.getCurrentPlayingState() : com.tencent.tav.coremedia.CMTime.CMTimeInvalid);
    }

    private com.tencent.tav.coremedia.CMSampleBuffer readSampleBuffer(int i17, com.tencent.tav.coremedia.CMTime cMTime, com.tencent.tav.coremedia.CMTime cMTime2) {
        if (i17 == 5) {
            return this.vDecoderTrack.seekTo(cMTime, true, true);
        }
        com.tencent.tav.coremedia.CMTime multi = this.frameDuration.multi(this.rate);
        if (cMTime2.smallThan(cMTime.sub(multi.multi(3.0f)))) {
            com.tencent.tav.decoder.logger.Logger.v("PlayerThreadMain", "readSampleBuffer: sampleTime = // " + cMTime2.add(this.frameDuration));
            return this.vDecoderTrack.readSample(cMTime.divide(multi).multi(multi));
        }
        if (!cMTime2.bigThan(cMTime.add(multi)) || !cMTime.bigThan(com.tencent.tav.coremedia.CMTime.CMTimeZero) || !this.mAudioThread.isFinished()) {
            com.tencent.tav.decoder.logger.Logger.v("PlayerThreadMain", "readSampleBuffer: sampleTime = " + cMTime2.add(multi));
            return this.vDecoderTrack.readSample(cMTime2.add(multi));
        }
        syncAudioOtherMsg(2, cMTime2);
        com.tencent.tav.decoder.logger.Logger.v("PlayerThreadMain", "readSampleBuffer: sampleTime = /// " + cMTime2.add(multi));
        return this.vDecoderTrack.readSample(multi);
    }

    private void refreshSurface(com.tencent.tav.player.Callback callback) {
        if (this.mStatus == 1) {
            return;
        }
        if (this.vDecoderTrack != null) {
            removePendingMessage(12, 26);
            com.tencent.tav.decoder.IDecoderTrack iDecoderTrack = this.vDecoderTrack;
            renderSampleBuffer(iDecoderTrack.readSample(iDecoderTrack.getCurrentSampleTime()));
        }
        if (callback != null) {
            callback.call();
        }
    }

    private void release(android.os.Message message) {
        com.tencent.tav.decoder.logger.Logger.d("PlayerThreadMain", "release player - " + this);
        this.renderContext.makeCurrent();
        java.lang.Object obj = message.obj;
        if (obj instanceof com.tencent.tav.player.PlayerMessage) {
            java.lang.Object obj2 = ((com.tencent.tav.player.PlayerMessage) obj).bizMsg1;
            if (obj2 instanceof java.lang.Runnable) {
                ((java.lang.Runnable) obj2).run();
            }
        }
        removePendingMessage(new int[0]);
        releaseAudioThread(message.what, message.obj);
        updateStatus(1);
        com.tencent.tav.report.PreviewReportSession previewReportSession = this.reportSession;
        if (previewReportSession != null) {
            previewReportSession.flush();
            this.reportSession = null;
        }
    }

    private void releaseAudioThread(int i17, java.lang.Object obj) {
        if (i17 == 6) {
            this.lastSyncMessageId = java.lang.System.currentTimeMillis();
            com.tencent.tav.decoder.logger.Logger.d("PlayerThreadMain", "releaseAudioThread SyncMessageId = " + this.lastSyncMessageId + "  action = " + i17 + "  obj =  " + obj);
            this.mAudioThread.sendMessage(i17, obj, "syncAudioStatus", this.lastSyncMessageId);
        }
    }

    private void releaseComposition() {
        if (this.vDecoderTrack == null) {
            return;
        }
        if (this.mPlayerItem.getCustomVideoCompositor() != null) {
            this.mPlayerItem.getCustomVideoCompositor().release();
        }
        this.vDecoderTrack.release();
        this.aDecoderTrack.release();
    }

    private void removePendingMessage(int... iArr) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleMessage() called with: removeInt = [");
        sb6.append(iArr.length == 0 ? "null" : java.lang.Integer.valueOf(iArr[0]));
        sb6.append("]");
        com.tencent.tav.decoder.logger.Logger.v("PlayerThreadMain", sb6.toString());
        if (iArr.length != 0) {
            for (int i17 : iArr) {
                this.mPlayHandler.removeMessages(i17);
            }
            return;
        }
        synchronized (this.mPlayHandler) {
            if (this.mPlayHandler.hasMessages(ACTION_QUIT)) {
                this.mPlayHandler.removeCallbacksAndMessages(null);
                this.mPlayHandler.sendEmptyMessage(ACTION_QUIT);
            } else {
                this.mPlayHandler.removeCallbacksAndMessages(null);
            }
        }
    }

    private void renderSampleBuffer(com.tencent.tav.coremedia.CMSampleBuffer cMSampleBuffer) {
        com.tencent.tav.decoder.logger.Logger.v("PlayerThreadMain", "renderSampleBuffer() called with: sampleBuffer = [" + cMSampleBuffer + "]");
        if (cMSampleBuffer.getTextureInfo() != null) {
            if (this.filter == null) {
                if (this.enableLut) {
                    this.filter = new com.tencent.tav.decoder.LookUpFilter(this.lutBitmap);
                } else {
                    this.filter = new com.tencent.tav.decoder.Filter();
                }
                this.filter.setRendererWidth(this.renderContext.width());
                this.filter.setRendererHeight(this.renderContext.height());
            }
            this.renderContext.makeCurrent();
            com.tencent.tav.coremedia.TextureInfo textureInfo = cMSampleBuffer.getTextureInfo();
            com.tencent.tav.player.OnGetTavExtraListener onGetTavExtraListener = this.onGetTavExtraListener;
            if (onGetTavExtraListener != null) {
                onGetTavExtraListener.getTextureInfo(textureInfo);
                return;
            }
            applyViewport();
            this.filter.setBgColor(this.mPlayer.getBgColor());
            this.filter.applyFilter(textureInfo, null, textureInfo.getTextureMatrix());
            checkCopyPixelBuffer(cMSampleBuffer.getTime());
            this.renderContext.setPresentationTime(cMSampleBuffer.getTime().getTimeUs());
            this.renderContext.swapBuffers();
        }
    }

    private void scheduleNextWork(long j17) {
        if (!this.mEnableScheduleNext) {
            com.tencent.tav.decoder.logger.Logger.i("PlayerThreadMain", "disable scheduleNextWork ignore");
            return;
        }
        long j18 = j17 / 1000;
        if (j18 <= 0) {
            sendMessage(12, "schedule next");
            return;
        }
        com.tencent.tav.decoder.logger.Logger.v("scheduleNextWork", "waitTime" + j18);
        sendMessageDelay(12, j18, "schedule next");
    }

    private void seek(com.tencent.tav.coremedia.CMTime cMTime) {
        if (this.mStatus == 1) {
            return;
        }
        com.tencent.tav.coremedia.CMTime cMTime2 = com.tencent.tav.coremedia.CMTime.CMTimeInvalid;
        try {
            cMTime2 = getLastSeekPosAndRemoveOther();
        } catch (java.lang.Exception e17) {
            com.tencent.tav.decoder.logger.Logger.e("PlayerThreadMain", "getLastSeekPosAndRemoveOther", e17);
        }
        if (cMTime2.getValue() > -1) {
            cMTime = cMTime2;
        }
        if (this.vDecoderTrack == null) {
            syncAudioOtherMsg(5, cMTime);
            return;
        }
        removePendingMessage(12);
        this.mPosition = cMTime;
        notifyProgressChange();
        syncAudioOtherMsg(3, cMTime);
        syncAudioOtherMsg(5, cMTime);
        readSample(5, cMTime);
        this.mPlayHandler.postDelayed(new java.lang.Runnable() { // from class: com.tencent.tav.player.PlayerThread.1
            @Override // java.lang.Runnable
            public void run() {
                if (com.tencent.tav.player.PlayerThread.this.mLooper) {
                    com.tencent.tav.player.PlayerThread.this.syncAudioOtherMsg(2, null);
                }
            }
        }, 10L);
    }

    private void seekPreSample() {
        com.tencent.tav.coremedia.CMTime currentSampleTime = this.vDecoderTrack.getCurrentSampleTime();
        if (currentSampleTime != com.tencent.tav.coremedia.CMTime.CMTimeInvalid) {
            seek(currentSampleTime);
        }
    }

    private void stop(boolean z17) {
        releaseComposition();
        com.tencent.tav.decoder.Filter filter = this.filter;
        if (filter != null) {
            filter.release();
            this.filter = null;
        }
        this.mStartTime = 0L;
        enableScheduleNext(false);
        updateStatus(1);
        if (z17) {
            notifyStatus(com.tencent.tav.player.IPlayer.PlayerStatus.STOPPED, "");
            removePendingMessage(new int[0]);
            this.mLooper = false;
        }
    }

    private void synAudioComposition() {
        if (this.aDecoderTrack != null) {
            this.lastSyncMessageId = java.lang.System.currentTimeMillis();
            com.tencent.tav.decoder.logger.Logger.d("PlayerThreadMain", "synAudioComposition SyncMessageId = " + this.lastSyncMessageId);
            this.mAudioThread.sendMessage(1, null, "syncAudioStatus composition", this.lastSyncMessageId);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void syncAudioOtherMsg(int i17, java.lang.Object obj) {
        if (i17 == 3 || i17 == 2 || i17 == 4 || i17 == 6 || i17 == 7 || i17 == -1 || i17 == 5) {
            this.lastSyncMessageId = java.lang.System.currentTimeMillis();
            com.tencent.tav.decoder.logger.Logger.d("PlayerThreadMain", "syncAudioOtherMsg SyncMessageId = " + this.lastSyncMessageId + "  action = " + i17 + "  obj = " + obj);
            this.mAudioThread.sendMessage(i17, obj, "syncAudioStatus", this.lastSyncMessageId);
        }
    }

    private void syncAudioProgress() {
        com.tencent.tav.core.AudioCompositionDecoderTrack audioCompositionDecoderTrack = this.aDecoderTrack;
        if (audioCompositionDecoderTrack != null) {
            if (!this.mPosition.equalsTo(audioCompositionDecoderTrack.getCurrentSampleTime())) {
                this.mPosition = this.aDecoderTrack.getCurrentSampleTime();
                notifyProgressChange();
            }
            if (this.mAudioThread.isFinished()) {
                com.tencent.tav.decoder.logger.Logger.v("PlayerThreadMain", "processFrame() called with: finish");
                playerFinish();
            } else if (this.mLooper) {
                scheduleNextWork(30L);
                this.mPause = false;
            }
        }
    }

    private void udpateAudioVolumeProperties() {
    }

    private void updateAllProperties() {
    }

    private void updateAudioClipsProperties() {
        com.tencent.tav.core.AudioCompositionDecoderTrack audioCompositionDecoderTrack = this.aDecoderTrack;
        if (audioCompositionDecoderTrack != null) {
            audioCompositionDecoderTrack.release();
        }
        com.tencent.tav.core.AudioCompositionDecoderTrack initAudioCompositionDecoderTrack = this.mPlayerItem.initAudioCompositionDecoderTrack();
        this.aDecoderTrack = initAudioCompositionDecoderTrack;
        initAudioCompositionDecoderTrack.start();
        this.mAudioThread.update(this.aDecoderTrack);
        if (this.mLooper) {
            syncAudioOtherMsg(2, this.mPosition);
        }
    }

    private void updateComposition(java.lang.Object obj) {
        if (obj instanceof com.tencent.tav.player.PlayerItem) {
            com.tencent.tav.player.PlayerItem playerItem = (com.tencent.tav.player.PlayerItem) obj;
            this.vDecoderTrack = playerItem.getRealDecoderTrack();
            this.aDecoderTrack = playerItem.getAudioCompositionDecoderTrack();
            this.mPlayerItem = playerItem;
        }
        com.tencent.tav.decoder.IDecoderTrack iDecoderTrack = this.vDecoderTrack;
        if (iDecoderTrack != null) {
            this.frameDuration = iDecoderTrack.getFrameDuration();
        }
        this.mAudioThread.update(this.aDecoderTrack);
    }

    private void updateProgressPreNextAction(com.tencent.tav.coremedia.CMTime cMTime) {
        this.mPosition = cMTime;
    }

    private void updateProperties() {
    }

    private void updateStatus(int i17) {
        this.mStatus = i17;
    }

    public void bindSurface(com.tencent.tav.decoder.IDecoderTrack iDecoderTrack, com.tencent.tav.player.PlayerLayer playerLayer) {
        this.mDisplayTarget = playerLayer.surface;
        this.vDecoderTrack = iDecoderTrack;
        this.surfaceSize = new com.tencent.tav.coremedia.CGSize(playerLayer.surfaceWidth, playerLayer.surfaceHeight);
        sendMessage(1, "bind surface");
    }

    public void cancelAllPendingSeeks() {
        removePendingMessage(5);
    }

    public void enableScheduleNext(boolean z17) {
        this.mEnableScheduleNext = z17;
    }

    public com.tencent.tav.coremedia.CGRect getGlViewportRect() {
        return this.glViewportRect;
    }

    public android.os.Handler getPlayHandler() {
        return this.mPlayHandler;
    }

    public com.tencent.tav.coremedia.CMTime getPosition() {
        return this.mPosition;
    }

    public com.tencent.tav.decoder.RenderContextParams getRenderContextParams() {
        return this.renderContextParams;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        java.lang.Object obj;
        com.tencent.tav.player.Callback callback;
        java.lang.Object obj2 = message.obj;
        com.tencent.tav.player.PlayerMessage playerMessage = obj2 == null ? null : (com.tencent.tav.player.PlayerMessage) obj2;
        if (playerMessage != null) {
            obj = playerMessage.bizMsg1;
            callback = playerMessage.callback;
        } else {
            obj = null;
            callback = null;
        }
        int i17 = message.what;
        if (i17 != 2) {
            syncAudioOtherMsg(i17, obj2);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleMessage() called with: msg = [");
        sb6.append(catLog(message.what));
        sb6.append("]--obj-->");
        sb6.append(obj);
        sb6.append("--from-->");
        sb6.append(playerMessage == null ? null : playerMessage.form);
        com.tencent.tav.decoder.logger.Logger.v("PlayerThreadMain", sb6.toString());
        if (this.mThread == null) {
            return false;
        }
        try {
            int i18 = message.what;
            if (i18 != ACTION_QUIT) {
                switch (i18) {
                    case 1:
                        prepare(obj);
                        break;
                    case 2:
                        play();
                        break;
                    case 3:
                        pause();
                        break;
                    case 4:
                        stop(obj == null ? false : ((java.lang.Boolean) obj).booleanValue());
                        break;
                    case 5:
                        seek((com.tencent.tav.coremedia.CMTime) obj);
                        break;
                    case 6:
                        release(message);
                        break;
                    default:
                        switch (i18) {
                            case 9:
                                seekPreSample();
                                break;
                            case 10:
                                updateProperties();
                                break;
                            case 11:
                                com.tencent.tav.player.UpdateCompositionMessage updateCompositionMessage = (com.tencent.tav.player.UpdateCompositionMessage) obj;
                                stop(true);
                                releaseComposition();
                                if (updateCompositionMessage != null) {
                                    updateComposition(updateCompositionMessage.playerItem);
                                    prepare(updateCompositionMessage.updateListener);
                                    break;
                                }
                                break;
                            case 12:
                                if (this.mPlayRange != null && !this.mPosition.add(this.frameDuration).smallThan(this.mPlayRange.getEnd())) {
                                    seek(this.mPlayRange.getStart());
                                    break;
                                } else if (this.mEnableScheduleNext) {
                                    readSample(obj == null ? 0 : ((java.lang.Integer) obj).intValue());
                                    break;
                                }
                                break;
                            default:
                                switch (i18) {
                                    case 20:
                                        updateAllProperties();
                                        break;
                                    case 21:
                                        if (obj instanceof com.tencent.tav.coremedia.CGSize) {
                                            this.surfaceSize = (com.tencent.tav.coremedia.CGSize) obj;
                                            initViewport();
                                            break;
                                        }
                                        break;
                                    case 22:
                                        updateAudioClipsProperties();
                                        break;
                                    case 23:
                                        udpateAudioVolumeProperties();
                                        break;
                                    case 24:
                                        if (obj instanceof com.tencent.tav.player.OnReadSnapShootListener) {
                                            this.onReadSnapShootListener = (com.tencent.tav.player.OnReadSnapShootListener) obj;
                                            break;
                                        }
                                        break;
                                    case 25:
                                        if (obj instanceof com.tencent.tav.player.OnGetTavExtraListener) {
                                            this.onGetTavExtraListener = (com.tencent.tav.player.OnGetTavExtraListener) obj;
                                            break;
                                        }
                                        break;
                                    case 26:
                                        refreshSurface((com.tencent.tav.player.Callback) obj);
                                        break;
                                }
                        }
                }
            } else {
                com.tencent.tav.decoder.logger.Logger.i("PlayerThreadMain", "quit: PlayerThreadMain " + this);
                removePendingMessage(new int[0]);
                this.mThread.quit();
                this.mThread = null;
                this.vDecoderTrack.release();
                this.aDecoderTrack.release();
                this.renderContext.release();
                this.renderContext = null;
                this.vDecoderTrack = null;
                this.aDecoderTrack = null;
                this.mPlayHandler.removeCallbacksAndMessages(null);
            }
            if (callback != null) {
                callback.call();
            }
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.tav.decoder.logger.Logger.v("PlayerThreadMain", "player error:" + android.util.Log.getStackTraceString(e17));
            return false;
        }
    }

    public boolean hasMessage(int i17) {
        android.os.Handler handler = this.mPlayHandler;
        if (handler == null || this.mThread == null) {
            return false;
        }
        return handler.hasMessages(i17);
    }

    public void removePendingUpdateCompositionMessage() {
        removePendingMessage(11);
    }

    public void removeReadSampleMessage() {
        if (this.mStatus == 1 || this.vDecoderTrack == null) {
            return;
        }
        removePendingMessage(12, 26);
    }

    public void sendMessage(int i17, java.lang.Object obj, java.lang.String str, com.tencent.tav.player.Callback callback) {
        com.tencent.tav.decoder.logger.Logger.d("PlayerThreadMain", "sendMessage() called with: what = [" + catLog(i17) + "], obj = [" + obj + "], from = [" + str + "]");
        android.os.Handler handler = this.mPlayHandler;
        if (handler == null || this.mThread == null) {
            return;
        }
        handler.obtainMessage(i17, new com.tencent.tav.player.PlayerMessage(obj, str, java.lang.System.currentTimeMillis(), callback)).sendToTarget();
    }

    public void sendMessageDelay(int i17, long j17, java.lang.String str) {
        com.tencent.tav.decoder.logger.Logger.v("PlayerThreadMain", "sendMessageDelay() called with: what = [" + catLog(i17) + "], delay = [" + j17 + "], from = [" + str + "]");
        if (this.mPlayHandler != null) {
            android.os.Message message = new android.os.Message();
            message.what = i17;
            message.obj = new com.tencent.tav.player.PlayerMessage(null, str, java.lang.System.currentTimeMillis());
            this.mPlayHandler.sendMessageDelayed(message, j17);
        }
    }

    public void setEnableLut(boolean z17, android.graphics.Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            this.enableLut = false;
            return;
        }
        this.enableLut = z17;
        this.lutBitmap = bitmap;
        com.tencent.tav.decoder.Filter filter = this.filter;
        if (filter == null || !(filter instanceof com.tencent.tav.decoder.LookUpFilter)) {
            return;
        }
        ((com.tencent.tav.decoder.LookUpFilter) filter).setUseLut(z17, bitmap);
    }

    public void setFrameDuration(com.tencent.tav.coremedia.CMTime cMTime) {
        this.frameDuration = cMTime;
    }

    public void setPlayRange(com.tencent.tav.coremedia.CMTimeRange cMTimeRange) {
        this.mPlayRange = cMTimeRange;
    }

    public void setRate(float f17) {
        this.rate = f17;
        this.mAudioThread.setRate(f17);
    }

    public void setRenderContextParams(com.tencent.tav.decoder.RenderContextParams renderContextParams) {
        this.renderContextParams = renderContextParams;
        com.tencent.tav.decoder.RenderContext renderContext = this.renderContext;
        if (renderContext != null) {
            renderContext.setParams(renderContextParams);
        }
    }

    public void updatePositionRightAway(com.tencent.tav.coremedia.CMTime cMTime) {
        this.mPosition = cMTime;
    }

    private void readSample(int i17, com.tencent.tav.coremedia.CMTime cMTime) {
        com.tencent.tav.coremedia.CMSampleBuffer readSampleBuffer;
        long nanoTime;
        if (this.vDecoderTrack == null) {
            syncAudioProgress();
            return;
        }
        if (this.reportSession == null) {
            this.reportSession = new com.tencent.tav.report.PreviewReportSession();
        }
        try {
            long timeUs = this.frameDuration.divide(this.rate).getTimeUs() - (getCurrentUsTime() - this.startTimeUsMark);
            if (timeUs > 0) {
                java.lang.Thread.sleep(timeUs / 1000);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.tav.decoder.logger.Logger.e("PlayerThreadMain", "readSample", th6);
        }
        this.startTimeUsMark = getCurrentUsTime();
        isNeedEnsureLooper(i17);
        com.tencent.tav.coremedia.CMSampleState cMSampleState = new com.tencent.tav.coremedia.CMSampleState();
        com.tencent.tav.coremedia.CMTime currentSampleTime = this.vDecoderTrack.getCurrentSampleTime();
        com.tencent.tav.decoder.logger.Logger.v("PlayerThreadMain", "readSample[" + i17 + "] lastPosition = " + currentSampleTime + " syncPlayingTime = " + cMTime);
        if (i17 == 2) {
            syncAudioOtherMsg(2, currentSampleTime);
        }
        if (i17 != 5 && !this.mEnableScheduleNext) {
            com.tencent.tav.decoder.logger.Logger.i("PlayerThreadMain", "disable schedule next, ignore this readSample");
            return;
        }
        try {
            this.renderContext.makeCurrent();
            long nanoTime2 = java.lang.System.nanoTime();
            readSampleBuffer = readSampleBuffer(i17, cMTime, currentSampleTime);
            nanoTime = java.lang.System.nanoTime() - nanoTime2;
        } catch (java.lang.Exception e17) {
            com.tencent.tav.decoder.logger.Logger.e("PlayerThreadMain", "readSample", e17);
            if (e17 instanceof java.lang.IllegalStateException) {
                notifyStatus(com.tencent.tav.player.IPlayer.PlayerStatus.ERROR, "解码异常");
                return;
            }
        }
        if (i17 != 5 && !this.mEnableScheduleNext) {
            com.tencent.tav.decoder.logger.Logger.i("PlayerThreadMain", "disable schedule next, ignore this render");
            return;
        }
        long nanoTime3 = java.lang.System.nanoTime();
        renderSampleBuffer(readSampleBuffer);
        this.reportSession.tickPreview(nanoTime, java.lang.System.nanoTime() - nanoTime3);
        cMSampleState = readSampleBuffer.getState();
        this.vDecoderTrack.asyncReadNextSample(cMSampleState.getTime().add(new com.tencent.tav.coremedia.CMTime(1L, cMSampleState.getTime().timeScale)));
        this.decoderConsumerTimeUs = getCurrentUsTime() - this.startTimeUsMark;
        com.tencent.tav.decoder.logger.Logger.v("PlayerThreadMain", "readSample() called with: messageId = [" + i17 + "]--currentSampleState-->" + cMSampleState + "--looper-->" + this.mLooper + " consumer = " + (java.lang.System.currentTimeMillis() - this.startTimeUsMark));
        if (cMSampleState.stateMatchingTo(-1, -3)) {
            com.tencent.tav.decoder.logger.Logger.v("PlayerThreadMain", "readSample() called with: finish");
            playerFinish();
            return;
        }
        boolean z17 = 5 == i17;
        if (cMSampleState.getStateCode() >= 0) {
            this.mPosition = cMSampleState.getTime();
            if (!z17 && !this.mPlayHandler.hasMessages(5)) {
                notifyProgressChange();
            }
        } else {
            if (cMSampleState.stateMatchingTo(-100)) {
                this.vDecoderTrack.seekTo(com.tencent.tav.coremedia.CMTime.CMTimeZero, false, true);
            }
            cMSampleState = new com.tencent.tav.coremedia.CMSampleState(currentSampleTime);
        }
        if (this.mLooper) {
            boolean z18 = this.mPause;
            this.decoderConsumerTimeUs = (getCurrentUsTime() - this.startTimeUsMark) + 5000;
            scheduleNextWork(getWaitTime(cMSampleState.getTime(), z17, z18));
            this.mPause = false;
        }
        com.tencent.tav.decoder.logger.Logger.v("PlayerThreadMain", "readSample end [" + i17 + "]--looper-->" + this.mLooper + " consumer = " + (getCurrentUsTime() - this.startTimeUsMark));
    }

    public void sendMessage(int i17, java.lang.Object obj, java.lang.String str) {
        com.tencent.tav.decoder.logger.Logger.v("PlayerThreadMain", "sendMessage() called with: what = [" + catLog(i17) + "], obj = [" + obj + "], from = [" + str + "]");
        android.os.Handler handler = this.mPlayHandler;
        if (handler == null || this.mThread == null) {
            return;
        }
        handler.obtainMessage(i17, new com.tencent.tav.player.PlayerMessage(obj, str, java.lang.System.currentTimeMillis())).sendToTarget();
    }

    public void sendMessage(int i17, java.lang.String str) {
        com.tencent.tav.decoder.logger.Logger.v("PlayerThreadMain", "sendMessage() called with: what = [" + catLog(i17) + "], from = [" + str + "]");
        android.os.Handler handler = this.mPlayHandler;
        if (handler == null || this.mThread == null) {
            return;
        }
        handler.obtainMessage(i17, new com.tencent.tav.player.PlayerMessage(null, str, java.lang.System.currentTimeMillis())).sendToTarget();
    }
}
