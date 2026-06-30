package io.flutter.embedding.android;

/* loaded from: classes15.dex */
public class FlutterSurfaceView extends android.view.SurfaceView implements io.flutter.embedding.engine.renderer.RenderSurface {
    private static final java.lang.String TAG = "FlutterSurfaceView";
    private io.flutter.embedding.engine.renderer.FlutterRenderer flutterRenderer;
    private boolean isPaused;
    private boolean isSurfaceAvailableForRendering;
    private boolean isSurfaceSwapOut;
    private java.lang.Runnable nextSurfaceUpdateCallback;
    private final boolean renderTransparently;
    private final android.view.SurfaceHolder.Callback surfaceCallback;
    private final io.flutter.embedding.android.SurfaceHolderCallbackCompat surfaceHolderCallbackCompat;

    public FlutterSurfaceView(android.content.Context context) {
        this(context, null, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void changeSurfaceSize(int i17, int i18) {
        if (this.flutterRenderer == null) {
            throw new java.lang.IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
        if (this.isSurfaceSwapOut) {
            io.flutter.Log.i(TAG, "already swap out this surface, ignore change surface size");
            return;
        }
        io.flutter.Log.i(TAG, "Notifying FlutterRenderer that Android surface size has changed to " + i17 + " x " + i18);
        this.flutterRenderer.surfaceChanged(i17, i18);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void connectSurfaceToRenderer() {
        java.lang.Runnable runnable;
        if (this.flutterRenderer == null || getHolder() == null) {
            throw new java.lang.IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getHolder() are non-null.");
        }
        if (this.isSurfaceSwapOut) {
            io.flutter.Log.i(TAG, "already swap out this surface, not connect to renderer");
            return;
        }
        io.flutter.Log.i(TAG, "connectSurfaceToRenderer");
        this.flutterRenderer.startRenderingToSurface(getHolder().getSurface(), this.isPaused);
        if (this.isSurfaceSwapOut || !this.isSurfaceAvailableForRendering || (runnable = this.nextSurfaceUpdateCallback) == null) {
            return;
        }
        runnable.run();
        this.nextSurfaceUpdateCallback = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void disconnectSurfaceFromRenderer() {
        if (this.flutterRenderer == null) {
            throw new java.lang.IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
        }
        io.flutter.Log.i(TAG, "disconnectSurfaceFromRenderer, isSurfaceAvailableForRendering: " + this.isSurfaceAvailableForRendering);
        if (this.isSurfaceSwapOut) {
            io.flutter.Log.i(TAG, "already swap out this surface, ignore disconnect renderer");
        }
    }

    private void init() {
        if (this.renderTransparently) {
            getHolder().setFormat(-2);
            setZOrderOnTop(true);
        }
        getHolder().addCallback(this.surfaceHolderCallbackCompat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean shouldNotify() {
        return (this.flutterRenderer == null || this.isPaused) ? false : true;
    }

    @Override // io.flutter.embedding.engine.renderer.RenderSurface
    public void attachToRenderer(io.flutter.embedding.engine.renderer.FlutterRenderer flutterRenderer) {
        io.flutter.Log.i(TAG, "Attaching to FlutterRenderer.");
        if (this.flutterRenderer != null) {
            io.flutter.Log.i(TAG, "Already connected to a FlutterRenderer. Detaching from old one and attaching to new one.");
            this.flutterRenderer.stopRenderingToSurface(getRenderSurface());
        }
        this.flutterRenderer = flutterRenderer;
        this.surfaceHolderCallbackCompat.onAttachToRenderer(flutterRenderer);
        resume();
    }

    @Override // io.flutter.embedding.engine.renderer.RenderSurface
    public void detachFromRenderer() {
        io.flutter.Log.v(TAG, "Detaching from FlutterRenderer.");
        if (this.flutterRenderer == null) {
            io.flutter.Log.w(TAG, "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            disconnectSurfaceFromRenderer();
        }
        this.surfaceHolderCallbackCompat.onDetachFromRenderer();
        this.flutterRenderer = null;
    }

    @Override // android.view.SurfaceView, android.view.View
    public boolean gatherTransparentRegion(android.graphics.Region region) {
        if (getAlpha() < 1.0f) {
            return false;
        }
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        int i17 = iArr[0];
        region.op(i17, iArr[1], (getRight() + i17) - getLeft(), (iArr[1] + getBottom()) - getTop(), android.graphics.Region.Op.DIFFERENCE);
        return true;
    }

    @Override // io.flutter.embedding.engine.renderer.RenderSurface
    public io.flutter.embedding.engine.renderer.FlutterRenderer getAttachedRenderer() {
        return this.flutterRenderer;
    }

    @Override // io.flutter.embedding.engine.renderer.RenderSurface
    public android.view.Surface getRenderSurface() {
        return getHolder().getSurface();
    }

    @Override // io.flutter.embedding.engine.renderer.RenderSurface
    public boolean isAvailableForRendering() {
        return this.isSurfaceAvailableForRendering && getHolder().getSurface() != null;
    }

    public boolean isSurfaceAvailableForRendering() {
        return this.isSurfaceAvailableForRendering;
    }

    @Override // io.flutter.embedding.engine.renderer.RenderSurface
    public void markSurfaceIsSwapOut(boolean z17) {
        java.lang.Runnable runnable;
        io.flutter.Log.i(TAG, "markSurfaceIsSwapOut:" + z17);
        this.isSurfaceSwapOut = z17;
        if (z17 || !this.isSurfaceAvailableForRendering || (runnable = this.nextSurfaceUpdateCallback) == null) {
            return;
        }
        runnable.run();
        this.nextSurfaceUpdateCallback = null;
    }

    @Override // io.flutter.embedding.engine.renderer.RenderSurface
    public void onRenderSurfaceNextUpdate(final java.lang.Runnable runnable) {
        if (this.isSurfaceSwapOut || !this.isSurfaceAvailableForRendering || runnable == null) {
            this.nextSurfaceUpdateCallback = runnable;
        } else {
            android.view.Choreographer.getInstance().postFrameCallback(new android.view.Choreographer.FrameCallback() { // from class: io.flutter.embedding.android.FlutterSurfaceView$$a
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j17) {
                    runnable.run();
                }
            });
        }
    }

    @Override // io.flutter.embedding.engine.renderer.RenderSurface
    public void pause() {
        if (this.flutterRenderer == null) {
            io.flutter.Log.w(TAG, "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.isPaused = true;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.RenderSurface
    public void resume() {
        if (this.flutterRenderer == null) {
            io.flutter.Log.w(TAG, "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        this.surfaceHolderCallbackCompat.onResume();
        if (isSurfaceAvailableForRendering()) {
            io.flutter.Log.v(TAG, "Surface is available for rendering. Connecting FlutterRenderer to Android surface.");
            connectSurfaceToRenderer();
        }
        this.isPaused = false;
    }

    public FlutterSurfaceView(android.content.Context context, boolean z17) {
        this(context, null, z17);
    }

    public FlutterSurfaceView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, false);
    }

    private FlutterSurfaceView(android.content.Context context, android.util.AttributeSet attributeSet, boolean z17) {
        super(context, attributeSet);
        this.isSurfaceAvailableForRendering = false;
        this.isPaused = false;
        this.isSurfaceSwapOut = false;
        this.nextSurfaceUpdateCallback = null;
        android.view.SurfaceHolder.Callback callback = new android.view.SurfaceHolder.Callback() { // from class: io.flutter.embedding.android.FlutterSurfaceView.1
            @Override // android.view.SurfaceHolder.Callback
            public void surfaceChanged(android.view.SurfaceHolder surfaceHolder, int i17, int i18, int i19) {
                io.flutter.Log.i(io.flutter.embedding.android.FlutterSurfaceView.TAG, "SurfaceHolder.Callback.surfaceChanged()");
                if (io.flutter.embedding.android.FlutterSurfaceView.this.shouldNotify()) {
                    io.flutter.Log.i(io.flutter.embedding.android.FlutterSurfaceView.TAG, "start dispatch nativeSurfaceChanged");
                    io.flutter.embedding.android.FlutterSurfaceView.this.changeSurfaceSize(i18, i19);
                    io.flutter.Log.i(io.flutter.embedding.android.FlutterSurfaceView.TAG, "end dispatch nativeSurfaceChanged");
                }
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
                io.flutter.Log.i(io.flutter.embedding.android.FlutterSurfaceView.TAG, "SurfaceHolder.Callback.startRenderingToSurface()");
                io.flutter.embedding.android.FlutterSurfaceView.this.isSurfaceAvailableForRendering = true;
                if (io.flutter.embedding.android.FlutterSurfaceView.this.shouldNotify()) {
                    io.flutter.Log.i(io.flutter.embedding.android.FlutterSurfaceView.TAG, "start dispatch nativeSurfaceCreated");
                    io.flutter.embedding.android.FlutterSurfaceView.this.connectSurfaceToRenderer();
                    io.flutter.Log.i(io.flutter.embedding.android.FlutterSurfaceView.TAG, "finished dispatch nativeSurfaceCreated");
                }
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
                io.flutter.Log.i(io.flutter.embedding.android.FlutterSurfaceView.TAG, "SurfaceHolder.Callback.stopRenderingToSurface()");
                io.flutter.embedding.android.FlutterSurfaceView.this.isSurfaceAvailableForRendering = false;
                if (io.flutter.embedding.android.FlutterSurfaceView.this.shouldNotify() && !io.flutter.embedding.android.FlutterSurfaceView.this.isSurfaceSwapOut) {
                    io.flutter.embedding.android.FlutterSurfaceView.this.disconnectSurfaceFromRenderer();
                }
                io.flutter.Log.i(io.flutter.embedding.android.FlutterSurfaceView.TAG, "surfaceDestroyed remove all msg");
            }
        };
        this.surfaceCallback = callback;
        this.renderTransparently = z17;
        this.surfaceHolderCallbackCompat = new io.flutter.embedding.android.SurfaceHolderCallbackCompat(callback, this, this.flutterRenderer);
        init();
    }
}
