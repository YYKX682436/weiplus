package org.webrtc;

/* loaded from: classes16.dex */
public abstract class EglRenderer implements org.webrtc.VideoSink {
    private static final long LOG_INTERVAL_SEC = 4;
    private static final java.lang.String TAG = "EglRenderer";
    private byte _hellAccFlag_;
    private final org.webrtc.GlTextureFrameBuffer bitmapTextureFramebuffer;
    private final org.webrtc.PerformanceStatistics currentStats;
    private final org.webrtc.PerformanceInspector detailedPerformanceInspector;
    private final android.graphics.Matrix drawMatrix;
    private org.webrtc.RendererCommon.GlDrawer drawer;
    private org.webrtc.EglBase eglBase;
    private final org.webrtc.EglRenderer.EglSurfaceCreation eglSurfaceCreationRunnable;
    private volatile org.webrtc.EglRenderer.ErrorCallback errorCallback;
    private final java.lang.Object fpsReductionLock;
    private final org.webrtc.VideoFrameDrawer frameDrawer;
    private final java.util.ArrayList<org.webrtc.EglRenderer.FrameListenerAndParams> frameListeners;
    private final java.lang.Object frameLock;
    private final java.lang.Object handlerLock;
    private float layoutAspectRatio;
    private final java.lang.Object layoutLock;
    private final java.lang.Runnable logStatisticsRunnable;
    private org.webrtc.EglRenderer.OnFrameInGLEnv mFrameWithGLCallback;
    private long minRenderPeriodNs;
    private boolean mirrorHorizontally;
    private boolean mirrorVertically;
    protected final java.lang.String name;
    private long nextFrameTimeNs;
    private org.webrtc.VideoFrame pendingFrame;
    private android.os.Handler renderThreadHandler;
    private boolean usePresentationTimeStamp;

    /* loaded from: classes14.dex */
    public class EglSurfaceCreation implements java.lang.Runnable {
        private java.lang.Object surface;

        private EglSurfaceCreation() {
        }

        @Override // java.lang.Runnable
        public synchronized void run() {
            if (this.surface != null && org.webrtc.EglRenderer.this.eglBase != null && !org.webrtc.EglRenderer.this.eglBase.hasSurface()) {
                java.lang.Object obj = this.surface;
                if (obj instanceof android.view.Surface) {
                    org.webrtc.EglRenderer.this.eglBase.createSurface((android.view.Surface) this.surface);
                } else {
                    if (!(obj instanceof android.graphics.SurfaceTexture)) {
                        throw new java.lang.IllegalStateException("Invalid surface: " + this.surface);
                    }
                    org.webrtc.EglRenderer.this.eglBase.createSurface((android.graphics.SurfaceTexture) this.surface);
                }
                org.webrtc.EglRenderer.this.eglBase.makeCurrent();
                android.opengl.GLES20.glPixelStorei(3317, 1);
            }
        }

        public synchronized void setSurface(java.lang.Object obj) {
            this.surface = obj;
        }
    }

    /* loaded from: classes16.dex */
    public interface ErrorCallback {
        void onGlOutOfMemory();
    }

    /* loaded from: classes16.dex */
    public interface FrameListener {
        void onFrame(android.graphics.Bitmap bitmap);
    }

    /* loaded from: classes16.dex */
    public static class FrameListenerAndParams {
        public final boolean applyFpsReduction;
        public final org.webrtc.RendererCommon.GlDrawer drawer;
        public final org.webrtc.EglRenderer.FrameListener listener;
        public final float scale;

        public FrameListenerAndParams(org.webrtc.EglRenderer.FrameListener frameListener, float f17, org.webrtc.RendererCommon.GlDrawer glDrawer, boolean z17) {
            this.listener = frameListener;
            this.scale = f17;
            this.drawer = glDrawer;
            this.applyFpsReduction = z17;
        }
    }

    /* loaded from: classes13.dex */
    public static class HandlerWithExceptionCallback extends android.os.Handler {
        private final java.lang.Runnable exceptionCallback;

        public HandlerWithExceptionCallback(android.os.Looper looper, java.lang.Runnable runnable) {
            super(looper);
            this.exceptionCallback = runnable;
        }

        @Override // android.os.Handler
        public void dispatchMessage(android.os.Message message) {
            try {
                super.dispatchMessage(message);
            } catch (java.lang.Exception e17) {
                org.webrtc.Logging.e(org.webrtc.EglRenderer.TAG, "Exception on EglRenderer thread", e17);
                this.exceptionCallback.run();
                throw e17;
            }
        }
    }

    /* loaded from: classes16.dex */
    public interface OnFrameInGLEnv {
        boolean doOnDrawFrameWithEGL(org.webrtc.EglBase eglBase, org.webrtc.VideoFrame videoFrame, org.webrtc.RendererCommon.GlDrawer glDrawer, org.webrtc.VideoFrameDrawer videoFrameDrawer, android.graphics.Matrix matrix);
    }

    public EglRenderer(java.lang.String str) {
        this(str, new org.webrtc.VideoFrameDrawer());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: clearSurfaceOnRenderThread, reason: merged with bridge method [inline-methods] */
    public void lambda$clearImage$6(float f17, float f18, float f19, float f27) {
        org.webrtc.EglBase eglBase = this.eglBase;
        if (eglBase == null || !eglBase.hasSurface()) {
            return;
        }
        logD("clearSurface");
        android.opengl.GLES20.glClearColor(f17, f18, f19, f27);
        android.opengl.GLES20.glClear(16384);
        this.eglBase.swapBuffers();
    }

    private void createEglSurfaceInternal(java.lang.Object obj) {
        this.eglSurfaceCreationRunnable.setSurface(obj);
        postToRenderThread(this.eglSurfaceCreationRunnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addFrameListener$3(org.webrtc.RendererCommon.GlDrawer glDrawer, org.webrtc.EglRenderer.FrameListener frameListener, float f17, boolean z17) {
        if (glDrawer == null) {
            glDrawer = this.drawer;
        }
        this.frameListeners.add(new org.webrtc.EglRenderer.FrameListenerAndParams(frameListener, f17, glDrawer, z17));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$0(org.webrtc.EglBase.Context context, int[] iArr) {
        if (context == null) {
            logD("EglBase10.create context");
            this.eglBase = org.webrtc.EglBase.EglBaseStatic.createEgl10(iArr);
        } else {
            logD("EglBase.create shared context");
            this.eglBase = org.webrtc.EglBase.EglBaseStatic.create(context, iArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$release$1(java.util.concurrent.CountDownLatch countDownLatch) {
        synchronized (org.webrtc.EglBase.lock) {
            android.opengl.GLES20.glUseProgram(0);
        }
        org.webrtc.RendererCommon.GlDrawer glDrawer = this.drawer;
        if (glDrawer != null) {
            glDrawer.release();
            this.drawer = null;
        }
        this.frameDrawer.release();
        this.bitmapTextureFramebuffer.release();
        if (this.eglBase != null) {
            logD("eglBase detach and release.");
            this.eglBase.detachCurrent();
            this.eglBase.release();
            this.eglBase = null;
        }
        this.frameListeners.clear();
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$release$2(android.os.Looper looper) {
        logD("Quitting render thread.");
        looper.quit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$releaseEglSurface$5(java.lang.Runnable runnable) {
        org.webrtc.EglBase eglBase = this.eglBase;
        if (eglBase != null) {
            eglBase.detachCurrent();
            this.eglBase.releaseSurface();
        }
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeFrameListener$4(java.util.concurrent.CountDownLatch countDownLatch, org.webrtc.EglRenderer.FrameListener frameListener) {
        countDownLatch.countDown();
        java.util.Iterator<org.webrtc.EglRenderer.FrameListenerAndParams> it = this.frameListeners.iterator();
        while (it.hasNext()) {
            if (it.next().listener == frameListener) {
                it.remove();
            }
        }
    }

    private void logD(java.lang.String str) {
        org.webrtc.Logging.d(TAG, this.name + str);
    }

    private void logE(java.lang.String str, java.lang.Throwable th6) {
        org.webrtc.Logging.e(TAG, this.name + str, th6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void logStatistics() {
        java.text.DecimalFormat decimalFormat = new java.text.DecimalFormat("#.0");
        long nanoTime = java.lang.System.nanoTime();
        synchronized (this.currentStats) {
            org.webrtc.PerformanceStatistics performanceStatistics = this.currentStats;
            long j17 = nanoTime - performanceStatistics.statisticsStartTimeNs;
            if (j17 > 0 && (this.minRenderPeriodNs != com.tencent.wcdb.core.Database.DictDefaultMatchValue || performanceStatistics.framesReceived != 0)) {
                java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.NANOSECONDS;
                performanceStatistics.duration = timeUnit.toMillis(j17);
                this.currentStats.renderFps = ((float) (r6.framesRendered * java.util.concurrent.TimeUnit.SECONDS.toNanos(1L))) / ((float) j17);
                org.webrtc.PerformanceStatistics performanceStatistics2 = this.currentStats;
                int i17 = performanceStatistics2.framesRendered;
                performanceStatistics2.averageRenderTime = i17 > 0 ? timeUnit.toMicros(performanceStatistics2.renderTimeNs / i17) : 0L;
                org.webrtc.PerformanceStatistics performanceStatistics3 = this.currentStats;
                int i18 = performanceStatistics3.framesRendered;
                performanceStatistics3.averageSwapBufferTime = i18 > 0 ? timeUnit.toMicros(performanceStatistics3.renderSwapBufferTimeNs / i18) : 0L;
                logD("Duration: " + this.currentStats.duration + " ms. Frames received: " + this.currentStats.framesReceived + ". Dropped: " + this.currentStats.framesDropped + ". Rendered: " + this.currentStats.framesRendered + ". Render fps: " + decimalFormat.format(this.currentStats.renderFps) + ". Average render time: " + this.currentStats.averageRenderTime + " us. Average swapBuffer time: " + this.currentStats.averageSwapBufferTime + " us.");
                this.detailedPerformanceInspector.flush(this.currentStats);
                onRenderStats(new org.webrtc.PerformanceStatistics(this.currentStats));
                this.currentStats.resetStatistics(nanoTime);
            }
        }
    }

    private void logW(java.lang.String str) {
        org.webrtc.Logging.w(TAG, this.name + str);
    }

    private void notifyCallbacks(org.webrtc.VideoFrame videoFrame, boolean z17) {
        if (this.frameListeners.isEmpty()) {
            return;
        }
        this.drawMatrix.reset();
        this.drawMatrix.preTranslate(0.5f, 0.5f);
        this.drawMatrix.preScale(this.mirrorHorizontally ? -1.0f : 1.0f, this.mirrorVertically ? -1.0f : 1.0f);
        this.drawMatrix.preScale(1.0f, -1.0f);
        this.drawMatrix.preTranslate(-0.5f, -0.5f);
        java.util.Iterator<org.webrtc.EglRenderer.FrameListenerAndParams> it = this.frameListeners.iterator();
        while (it.hasNext()) {
            org.webrtc.EglRenderer.FrameListenerAndParams next = it.next();
            if (z17 || !next.applyFpsReduction) {
                it.remove();
                int rotatedWidth = (int) (next.scale * videoFrame.getRotatedWidth());
                int rotatedHeight = (int) (next.scale * videoFrame.getRotatedHeight());
                if (rotatedWidth == 0 || rotatedHeight == 0) {
                    next.listener.onFrame(null);
                } else {
                    this.bitmapTextureFramebuffer.setSize(rotatedWidth, rotatedHeight);
                    android.opengl.GLES20.glBindFramebuffer(36160, this.bitmapTextureFramebuffer.getFrameBufferId());
                    android.opengl.GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.bitmapTextureFramebuffer.getTextureId(), 0);
                    android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                    android.opengl.GLES20.glClear(16384);
                    this.frameDrawer.drawFrame(videoFrame, next.drawer, this.drawMatrix, 0, 0, rotatedWidth, rotatedHeight);
                    java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(rotatedWidth * rotatedHeight * 4);
                    android.opengl.GLES20.glViewport(0, 0, rotatedWidth, rotatedHeight);
                    android.opengl.GLES20.glReadPixels(0, 0, rotatedWidth, rotatedHeight, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGBA, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, allocateDirect);
                    android.opengl.GLES20.glBindFramebuffer(36160, 0);
                    org.webrtc.GlUtil.checkNoGLES2Error("EglRenderer.notifyCallbacks");
                    android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(config);
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(java.lang.Integer.valueOf(rotatedHeight));
                    arrayList.add(java.lang.Integer.valueOf(rotatedWidth));
                    java.lang.Object obj = new java.lang.Object();
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(obj, arrayList.toArray(), "org/webrtc/EglRenderer", "notifyCallbacks", "(Lorg/webrtc/VideoFrame;Z)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                    android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
                    yj0.a.e(obj, createBitmap, "org/webrtc/EglRenderer", "notifyCallbacks", "(Lorg/webrtc/VideoFrame;Z)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                    createBitmap.copyPixelsFromBuffer(allocateDirect);
                    next.listener.onFrame(createBitmap);
                }
            }
        }
    }

    private void postToRenderThread(java.lang.Runnable runnable) {
        synchronized (this.handlerLock) {
            android.os.Handler handler = this.renderThreadHandler;
            if (handler != null) {
                handler.post(runnable);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void renderFrameOnRenderThread() {
        boolean z17;
        float f17;
        float f18;
        float f19;
        synchronized (this.frameLock) {
            org.webrtc.VideoFrame videoFrame = this.pendingFrame;
            if (videoFrame == null) {
                return;
            }
            this.pendingFrame = null;
            org.webrtc.EglBase eglBase = this.eglBase;
            if (eglBase == null || !eglBase.hasSurface()) {
                logD("Dropping frame - No surface");
                return;
            }
            synchronized (this.fpsReductionLock) {
                long j17 = this.minRenderPeriodNs;
                if (j17 != com.tencent.wcdb.core.Database.DictDefaultMatchValue) {
                    if (j17 > 0) {
                        long nanoTime = java.lang.System.nanoTime();
                        long j18 = this.nextFrameTimeNs;
                        if (nanoTime < j18) {
                            logD("Skipping frame rendering - fps reduction is active.");
                        } else {
                            long j19 = j18 + this.minRenderPeriodNs;
                            this.nextFrameTimeNs = j19;
                            this.nextFrameTimeNs = java.lang.Math.max(j19, nanoTime);
                        }
                    }
                    z17 = true;
                }
                z17 = false;
            }
            long nanoTime2 = java.lang.System.nanoTime();
            float rotatedWidth = videoFrame.getRotatedWidth() / videoFrame.getRotatedHeight();
            synchronized (this.layoutLock) {
                f17 = this.layoutAspectRatio;
                if (f17 == 0.0f) {
                    f17 = rotatedWidth;
                }
            }
            if (rotatedWidth > f17) {
                f19 = f17 / rotatedWidth;
                f18 = 1.0f;
            } else {
                f18 = rotatedWidth / f17;
                f19 = 1.0f;
            }
            this.drawMatrix.reset();
            this.drawMatrix.preTranslate(0.5f, 0.5f);
            this.drawMatrix.preScale(this.mirrorHorizontally ? -1.0f : 1.0f, this.mirrorVertically ? -1.0f : 1.0f);
            this.drawMatrix.preScale(f19, f18);
            this.drawMatrix.preTranslate(-0.5f, -0.5f);
            try {
                if (z17) {
                    try {
                        if (!this.mFrameWithGLCallback.doOnDrawFrameWithEGL(this.eglBase, videoFrame, this.drawer, this.frameDrawer, this.drawMatrix)) {
                            android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                            android.opengl.GLES20.glClear(16384);
                            this.frameDrawer.drawFrame(videoFrame, this.drawer, this.drawMatrix, 0, 0, this.eglBase.surfaceWidth(), this.eglBase.surfaceHeight());
                        }
                        long nanoTime3 = java.lang.System.nanoTime();
                        if (this.usePresentationTimeStamp) {
                            this.eglBase.swapBuffers(videoFrame.getTimestampNs());
                        } else {
                            this.eglBase.swapBuffers();
                        }
                        long nanoTime4 = java.lang.System.nanoTime();
                        synchronized (this.currentStats) {
                            org.webrtc.PerformanceStatistics performanceStatistics = this.currentStats;
                            performanceStatistics.framesRendered++;
                            performanceStatistics.renderTimeNs += nanoTime4 - nanoTime2;
                            performanceStatistics.renderSwapBufferTimeNs += nanoTime4 - nanoTime3;
                        }
                    } catch (org.webrtc.GlUtil.GlOutOfMemoryException e17) {
                        logE("Error while drawing frame", e17);
                        org.webrtc.EglRenderer.ErrorCallback errorCallback = this.errorCallback;
                        if (errorCallback != null) {
                            errorCallback.onGlOutOfMemory();
                        }
                        this.drawer.release();
                        this.frameDrawer.release();
                        this.bitmapTextureFramebuffer.release();
                    }
                }
                notifyCallbacks(videoFrame, z17);
            } finally {
                videoFrame.release();
            }
        }
    }

    public void addFrameListener(org.webrtc.EglRenderer.FrameListener frameListener, float f17) {
        addFrameListener(frameListener, f17, null, false);
    }

    public void clearImage() {
        clearImage(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public void createEglSurface(android.view.Surface surface) {
        createEglSurfaceInternal(surface);
    }

    public void disableFpsReduction() {
        setFpsReduction(Float.POSITIVE_INFINITY);
    }

    public org.webrtc.EglRenderer.OnFrameInGLEnv getFrameWithGLCallback() {
        return this.mFrameWithGLCallback;
    }

    public void init(final org.webrtc.EglBase.Context context, final int[] iArr, org.webrtc.RendererCommon.GlDrawer glDrawer, boolean z17) {
        synchronized (this.handlerLock) {
            if (this.renderThreadHandler == null) {
                logD("Initializing EglRenderer");
                this.drawer = glDrawer;
                this.usePresentationTimeStamp = z17;
                android.os.HandlerThread handlerThread = new android.os.HandlerThread(this.name + TAG);
                handlerThread.start();
                org.webrtc.EglRenderer.HandlerWithExceptionCallback handlerWithExceptionCallback = new org.webrtc.EglRenderer.HandlerWithExceptionCallback(handlerThread.getLooper(), new java.lang.Runnable() { // from class: org.webrtc.EglRenderer.2
                    @Override // java.lang.Runnable
                    public void run() {
                        synchronized (org.webrtc.EglRenderer.this.handlerLock) {
                            org.webrtc.EglRenderer.this.renderThreadHandler = null;
                        }
                    }
                });
                this.renderThreadHandler = handlerWithExceptionCallback;
                org.webrtc.ThreadUtils.invokeAtFrontUninterruptibly(handlerWithExceptionCallback, new java.lang.Runnable() { // from class: org.webrtc.EglRenderer$$h
                    @Override // java.lang.Runnable
                    public final void run() {
                        org.webrtc.EglRenderer.this.lambda$init$0(context, iArr);
                    }
                });
                this.renderThreadHandler.post(this.eglSurfaceCreationRunnable);
                this.currentStats.resetStatistics(java.lang.System.nanoTime());
                this.renderThreadHandler.postDelayed(this.logStatisticsRunnable, java.util.concurrent.TimeUnit.SECONDS.toMillis(4L));
            } else {
                throw new java.lang.IllegalStateException(this.name + "Already initialized");
            }
        }
    }

    @Override // org.webrtc.VideoSink
    public void onFrame(org.webrtc.VideoFrame videoFrame) {
        boolean z17;
        synchronized (this.currentStats) {
            this.detailedPerformanceInspector.notifyAnimationFrameStart();
            this.currentStats.framesReceived++;
        }
        synchronized (this.handlerLock) {
            if (this.renderThreadHandler == null) {
                logD("Dropping frame - Not initialized or already released.");
                return;
            }
            synchronized (this.frameLock) {
                org.webrtc.VideoFrame videoFrame2 = this.pendingFrame;
                z17 = videoFrame2 != null;
                if (z17) {
                    videoFrame2.release();
                }
                this.pendingFrame = videoFrame;
                videoFrame.retain();
                this.renderThreadHandler.post(new java.lang.Runnable() { // from class: org.webrtc.EglRenderer$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        org.webrtc.EglRenderer.this.renderFrameOnRenderThread();
                    }
                });
            }
            if (z17) {
                synchronized (this.currentStats) {
                    this.currentStats.framesDropped++;
                }
            }
        }
    }

    public abstract void onRenderStats(org.webrtc.PerformanceStatistics performanceStatistics);

    public void onViewVisibilityChange(int i17) {
        if (i17 == 4 || i17 == 8) {
            this.detailedPerformanceInspector.onBackground();
        }
    }

    public void pauseVideo() {
        setFpsReduction(0.0f);
    }

    public void printStackTrace() {
        synchronized (this.handlerLock) {
            android.os.Handler handler = this.renderThreadHandler;
            java.lang.Thread thread = handler == null ? null : handler.getLooper().getThread();
            if (thread != null) {
                java.lang.StackTraceElement[] stackTrace = thread.getStackTrace();
                if (stackTrace.length > 0) {
                    logW("EglRenderer stack trace:");
                    for (java.lang.StackTraceElement stackTraceElement : stackTrace) {
                        logW(stackTraceElement.toString());
                    }
                }
            }
        }
    }

    public void release() {
        logD("Releasing.");
        final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        synchronized (this.handlerLock) {
            android.os.Handler handler = this.renderThreadHandler;
            if (handler == null) {
                logD("Already released");
                return;
            }
            handler.removeCallbacks(this.logStatisticsRunnable);
            this.renderThreadHandler.postAtFrontOfQueue(new java.lang.Runnable() { // from class: org.webrtc.EglRenderer$$c
                @Override // java.lang.Runnable
                public final void run() {
                    org.webrtc.EglRenderer.this.lambda$release$1(countDownLatch);
                }
            });
            final android.os.Looper looper = this.renderThreadHandler.getLooper();
            this.renderThreadHandler.post(new java.lang.Runnable() { // from class: org.webrtc.EglRenderer$$d
                @Override // java.lang.Runnable
                public final void run() {
                    org.webrtc.EglRenderer.this.lambda$release$2(looper);
                }
            });
            this.renderThreadHandler = null;
            org.webrtc.ThreadUtils.awaitUninterruptibly(countDownLatch);
            synchronized (this.frameLock) {
                org.webrtc.VideoFrame videoFrame = this.pendingFrame;
                if (videoFrame != null) {
                    videoFrame.release();
                    this.pendingFrame = null;
                }
            }
            logD("Releasing done.");
        }
    }

    public void releaseEglSurface(final java.lang.Runnable runnable) {
        this.eglSurfaceCreationRunnable.setSurface(null);
        synchronized (this.handlerLock) {
            android.os.Handler handler = this.renderThreadHandler;
            if (handler == null) {
                runnable.run();
            } else {
                handler.removeCallbacks(this.eglSurfaceCreationRunnable);
                this.renderThreadHandler.postAtFrontOfQueue(new java.lang.Runnable() { // from class: org.webrtc.EglRenderer$$f
                    @Override // java.lang.Runnable
                    public final void run() {
                        org.webrtc.EglRenderer.this.lambda$releaseEglSurface$5(runnable);
                    }
                });
            }
        }
    }

    public void removeFrameListener(final org.webrtc.EglRenderer.FrameListener frameListener) {
        final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        synchronized (this.handlerLock) {
            if (this.renderThreadHandler == null) {
                return;
            }
            if (java.lang.Thread.currentThread() == this.renderThreadHandler.getLooper().getThread()) {
                throw new java.lang.RuntimeException("removeFrameListener must not be called on the render thread.");
            }
            postToRenderThread(new java.lang.Runnable() { // from class: org.webrtc.EglRenderer$$b
                @Override // java.lang.Runnable
                public final void run() {
                    org.webrtc.EglRenderer.this.lambda$removeFrameListener$4(countDownLatch, frameListener);
                }
            });
            org.webrtc.ThreadUtils.awaitUninterruptibly(countDownLatch);
        }
    }

    public void setErrorCallback(org.webrtc.EglRenderer.ErrorCallback errorCallback) {
        this.errorCallback = errorCallback;
    }

    public void setFpsReduction(float f17) {
        logD("setFpsReduction: " + f17);
        synchronized (this.fpsReductionLock) {
            long j17 = this.minRenderPeriodNs;
            if (f17 <= 0.0f) {
                this.minRenderPeriodNs = com.tencent.wcdb.core.Database.DictDefaultMatchValue;
            } else {
                this.minRenderPeriodNs = ((float) java.util.concurrent.TimeUnit.SECONDS.toNanos(1L)) / f17;
            }
            if (this.minRenderPeriodNs != j17) {
                this.nextFrameTimeNs = java.lang.System.nanoTime();
            }
        }
    }

    public void setFrameWithGLCallback(org.webrtc.EglRenderer.OnFrameInGLEnv onFrameInGLEnv) {
        this.mFrameWithGLCallback = onFrameInGLEnv;
    }

    public void setLayoutAspectRatio(float f17) {
        logD("setLayoutAspectRatio: " + f17);
        synchronized (this.layoutLock) {
            this.layoutAspectRatio = f17;
        }
    }

    public void setMirror(boolean z17) {
        logD("setMirrorHorizontally: " + z17);
        synchronized (this.layoutLock) {
            this.mirrorHorizontally = z17;
        }
    }

    public void setMirrorVertically(boolean z17) {
        logD("setMirrorVertically: " + z17);
        synchronized (this.layoutLock) {
            this.mirrorVertically = z17;
        }
    }

    public EglRenderer(java.lang.String str, org.webrtc.VideoFrameDrawer videoFrameDrawer) {
        this.mFrameWithGLCallback = null;
        this.handlerLock = new java.lang.Object();
        this.frameListeners = new java.util.ArrayList<>();
        this.fpsReductionLock = new java.lang.Object();
        this.drawMatrix = new android.graphics.Matrix();
        this.frameLock = new java.lang.Object();
        this.layoutLock = new java.lang.Object();
        this.currentStats = new org.webrtc.PerformanceStatistics();
        this.detailedPerformanceInspector = new org.webrtc.PerformanceInspector();
        this.bitmapTextureFramebuffer = new org.webrtc.GlTextureFrameBuffer(com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGBA);
        this.logStatisticsRunnable = new java.lang.Runnable() { // from class: org.webrtc.EglRenderer.1
            @Override // java.lang.Runnable
            public void run() {
                org.webrtc.EglRenderer.this.logStatistics();
                synchronized (org.webrtc.EglRenderer.this.handlerLock) {
                    if (org.webrtc.EglRenderer.this.renderThreadHandler != null) {
                        org.webrtc.EglRenderer.this.renderThreadHandler.removeCallbacks(org.webrtc.EglRenderer.this.logStatisticsRunnable);
                        org.webrtc.EglRenderer.this.renderThreadHandler.postDelayed(org.webrtc.EglRenderer.this.logStatisticsRunnable, java.util.concurrent.TimeUnit.SECONDS.toMillis(4L));
                    }
                }
            }
        };
        this.eglSurfaceCreationRunnable = new org.webrtc.EglRenderer.EglSurfaceCreation();
        this.name = str;
        this.frameDrawer = videoFrameDrawer;
    }

    public void addFrameListener(org.webrtc.EglRenderer.FrameListener frameListener, float f17, org.webrtc.RendererCommon.GlDrawer glDrawer) {
        addFrameListener(frameListener, f17, glDrawer, false);
    }

    public void clearImage(final float f17, final float f18, final float f19, final float f27) {
        synchronized (this.handlerLock) {
            android.os.Handler handler = this.renderThreadHandler;
            if (handler == null) {
                return;
            }
            handler.postAtFrontOfQueue(new java.lang.Runnable() { // from class: org.webrtc.EglRenderer$$g
                @Override // java.lang.Runnable
                public final void run() {
                    org.webrtc.EglRenderer.this.lambda$clearImage$6(f17, f18, f19, f27);
                }
            });
        }
    }

    public void createEglSurface(android.graphics.SurfaceTexture surfaceTexture) {
        createEglSurfaceInternal(surfaceTexture);
    }

    public void addFrameListener(final org.webrtc.EglRenderer.FrameListener frameListener, final float f17, final org.webrtc.RendererCommon.GlDrawer glDrawer, final boolean z17) {
        postToRenderThread(new java.lang.Runnable() { // from class: org.webrtc.EglRenderer$$e
            @Override // java.lang.Runnable
            public final void run() {
                org.webrtc.EglRenderer.this.lambda$addFrameListener$3(glDrawer, frameListener, f17, z17);
            }
        });
    }

    public void init(org.webrtc.EglBase.Context context, int[] iArr, org.webrtc.RendererCommon.GlDrawer glDrawer) {
        init(context, iArr, glDrawer, false);
    }
}
