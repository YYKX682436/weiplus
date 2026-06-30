package io.flutter.embedding.android;

/* loaded from: classes15.dex */
public class FlutterTextureView extends android.view.TextureView implements io.flutter.embedding.engine.renderer.RenderSurface {
    private static final java.lang.String TAG = "FlutterTextureView";
    private io.flutter.embedding.engine.renderer.FlutterRenderer flutterRenderer;
    private boolean isPaused;
    private boolean isSetExternalSurfaceTexture;
    private boolean isSurfaceAvailableForRendering;
    private boolean isSurfaceSwapOut;
    private java.lang.Runnable nextTextureUpdateCallback;
    private android.view.Surface renderSurface;
    private final android.view.TextureView.SurfaceTextureListener surfaceTextureListener;

    public FlutterTextureView(android.content.Context context) {
        this(context, null);
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
        if (this.flutterRenderer == null || getSurfaceTexture() == null) {
            throw new java.lang.IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getSurfaceTexture() are non-null.");
        }
        if (this.isSurfaceSwapOut) {
            io.flutter.Log.i(TAG, "already swap out this surface, not connect to renderer");
            return;
        }
        android.view.Surface surface = this.renderSurface;
        if (surface != null) {
            surface.release();
            this.renderSurface = null;
        }
        this.renderSurface = new android.view.Surface(getSurfaceTexture());
        io.flutter.Log.i(TAG, "connectSurfaceToRenderer, renderSurface:" + this.renderSurface + ", isSetExternalSurfaceTexture:" + this.isSetExternalSurfaceTexture);
        if (this.isSetExternalSurfaceTexture) {
            return;
        }
        this.flutterRenderer.startRenderingToSurface(this.renderSurface, this.isPaused);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void disconnectSurfaceFromRenderer() {
        io.flutter.embedding.engine.renderer.FlutterRenderer flutterRenderer = this.flutterRenderer;
        if (flutterRenderer == null) {
            throw new java.lang.IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
        }
        if (this.isSurfaceSwapOut) {
            io.flutter.Log.i(TAG, "already swap out this surface, ignore disconnect renderer");
            return;
        }
        flutterRenderer.stopRenderingToSurface(getRenderSurface());
        android.view.Surface surface = this.renderSurface;
        if (surface != null) {
            surface.release();
            this.renderSurface = null;
        }
    }

    private void init() {
        setSurfaceTextureListener(this.surfaceTextureListener);
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
        resume();
    }

    @Override // io.flutter.embedding.engine.renderer.RenderSurface
    public void detachFromRenderer() {
        if (this.flutterRenderer == null) {
            io.flutter.Log.w(TAG, "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            io.flutter.Log.i(TAG, "Disconnecting FlutterRenderer from Android surface.");
            disconnectSurfaceFromRenderer();
        }
        this.flutterRenderer = null;
    }

    @Override // io.flutter.embedding.engine.renderer.RenderSurface
    public io.flutter.embedding.engine.renderer.FlutterRenderer getAttachedRenderer() {
        return this.flutterRenderer;
    }

    @Override // io.flutter.embedding.engine.renderer.RenderSurface
    public android.view.Surface getRenderSurface() {
        return this.renderSurface;
    }

    @Override // io.flutter.embedding.engine.renderer.RenderSurface
    public boolean isAvailableForRendering() {
        return this.isSurfaceAvailableForRendering && this.renderSurface != null;
    }

    public boolean isSurfaceAvailableForRendering() {
        return this.isSurfaceAvailableForRendering;
    }

    @Override // io.flutter.embedding.engine.renderer.RenderSurface
    public void markSurfaceIsSwapOut(boolean z17) {
        io.flutter.Log.i(TAG, "markSurfaceIsSwapOut:" + z17);
        this.isSurfaceSwapOut = z17;
        if (z17) {
            this.nextTextureUpdateCallback = null;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.RenderSurface
    public void onRenderSurfaceNextUpdate(java.lang.Runnable runnable) {
        this.nextTextureUpdateCallback = runnable;
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
        if (isSurfaceAvailableForRendering()) {
            io.flutter.Log.i(TAG, "Surface is available for rendering. Connecting FlutterRenderer to Android surface.");
            connectSurfaceToRenderer();
        }
        this.isPaused = false;
    }

    public void setRenderSurface(android.view.Surface surface) {
        io.flutter.Log.i(TAG, "setRenderSurface:" + surface);
        this.renderSurface = surface;
    }

    @Override // android.view.TextureView
    public void setSurfaceTexture(android.graphics.SurfaceTexture surfaceTexture) {
        super.setSurfaceTexture(surfaceTexture);
        io.flutter.Log.i(TAG, "setSurfaceTexture:" + surfaceTexture + ", isAttachedToFlutterRenderer:" + shouldNotify());
        this.isSurfaceAvailableForRendering = true;
        this.isSetExternalSurfaceTexture = true;
        if (shouldNotify()) {
            connectSurfaceToRenderer();
        }
    }

    public FlutterTextureView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.isSurfaceAvailableForRendering = false;
        this.isPaused = false;
        this.isSurfaceSwapOut = false;
        this.nextTextureUpdateCallback = null;
        this.isSetExternalSurfaceTexture = false;
        this.surfaceTextureListener = new android.view.TextureView.SurfaceTextureListener() { // from class: io.flutter.embedding.android.FlutterTextureView.1
            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
                io.flutter.embedding.android.FlutterTextureView.this.isSurfaceAvailableForRendering = true;
                if (io.flutter.embedding.android.FlutterTextureView.this.shouldNotify()) {
                    io.flutter.embedding.android.FlutterTextureView.this.connectSurfaceToRenderer();
                }
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
                io.flutter.Log.i(io.flutter.embedding.android.FlutterTextureView.TAG, "SurfaceTextureListener.onSurfaceTextureDestroyed()");
                io.flutter.embedding.android.FlutterTextureView.this.isSurfaceAvailableForRendering = false;
                if (io.flutter.embedding.android.FlutterTextureView.this.shouldNotify()) {
                    io.flutter.embedding.android.FlutterTextureView.this.disconnectSurfaceFromRenderer();
                }
                if (io.flutter.embedding.android.FlutterTextureView.this.renderSurface != null) {
                    io.flutter.embedding.android.FlutterTextureView.this.renderSurface.release();
                    io.flutter.embedding.android.FlutterTextureView.this.renderSurface = null;
                }
                io.flutter.embedding.android.FlutterTextureView.this.isSetExternalSurfaceTexture = false;
                return true;
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
                if (io.flutter.embedding.android.FlutterTextureView.this.shouldNotify()) {
                    io.flutter.embedding.android.FlutterTextureView.this.changeSurfaceSize(i17, i18);
                }
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
                if (io.flutter.embedding.android.FlutterTextureView.this.isSurfaceSwapOut || io.flutter.embedding.android.FlutterTextureView.this.nextTextureUpdateCallback == null) {
                    return;
                }
                io.flutter.embedding.android.FlutterTextureView.this.nextTextureUpdateCallback.run();
                io.flutter.embedding.android.FlutterTextureView.this.nextTextureUpdateCallback = null;
            }
        };
        init();
    }
}
