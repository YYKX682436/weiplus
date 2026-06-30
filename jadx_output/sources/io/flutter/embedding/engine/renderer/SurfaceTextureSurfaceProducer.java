package io.flutter.embedding.engine.renderer;

/* loaded from: classes15.dex */
final class SurfaceTextureSurfaceProducer implements io.flutter.view.TextureRegistry.SurfaceProducer, io.flutter.view.TextureRegistry.GLTextureConsumer {
    private final io.flutter.embedding.engine.FlutterJNI flutterJNI;
    private final android.os.Handler handler;

    /* renamed from: id, reason: collision with root package name */
    private final long f293232id;
    private boolean released;
    private int requestBufferWidth;
    private int requestedBufferHeight;
    private android.view.Surface surface;
    private final io.flutter.view.TextureRegistry.SurfaceTextureEntry texture;

    public SurfaceTextureSurfaceProducer(long j17, android.os.Handler handler, io.flutter.embedding.engine.FlutterJNI flutterJNI, io.flutter.view.TextureRegistry.SurfaceTextureEntry surfaceTextureEntry) {
        this.f293232id = j17;
        this.handler = handler;
        this.flutterJNI = flutterJNI;
        this.texture = surfaceTextureEntry;
    }

    public android.view.Surface createSurface(android.graphics.SurfaceTexture surfaceTexture) {
        return new android.view.Surface(surfaceTexture);
    }

    public void finalize() {
        try {
            if (this.released) {
                return;
            }
            release();
            this.handler.post(new io.flutter.embedding.engine.renderer.FlutterRenderer.TextureFinalizerRunnable(this.f293232id, this.flutterJNI));
        } finally {
            super.finalize();
        }
    }

    @Override // io.flutter.view.TextureRegistry.SurfaceProducer
    public android.view.Surface getForcedNewSurface() {
        this.surface = null;
        return getSurface();
    }

    @Override // io.flutter.view.TextureRegistry.SurfaceProducer
    public int getHeight() {
        return this.requestedBufferHeight;
    }

    @Override // io.flutter.view.TextureRegistry.SurfaceProducer
    public android.view.Surface getSurface() {
        android.view.Surface surface = this.surface;
        if (surface == null || !surface.isValid()) {
            this.surface = createSurface(this.texture.surfaceTexture());
        }
        return this.surface;
    }

    @Override // io.flutter.view.TextureRegistry.GLTextureConsumer
    public android.graphics.SurfaceTexture getSurfaceTexture() {
        return this.texture.surfaceTexture();
    }

    @Override // io.flutter.view.TextureRegistry.SurfaceProducer
    public int getWidth() {
        return this.requestBufferWidth;
    }

    @Override // io.flutter.view.TextureRegistry.SurfaceProducer
    public boolean handlesCropAndRotation() {
        return true;
    }

    @Override // io.flutter.view.TextureRegistry.TextureEntry
    public long id() {
        return this.f293232id;
    }

    @Override // io.flutter.view.TextureRegistry.TextureEntry
    public void release() {
        this.texture.release();
        android.view.Surface surface = this.surface;
        if (surface != null) {
            surface.release();
            this.surface = null;
        }
        this.released = true;
    }

    @Override // io.flutter.view.TextureRegistry.SurfaceProducer
    public void scheduleFrame() {
        this.flutterJNI.markTextureFrameAvailable(this.f293232id);
    }

    @Override // io.flutter.view.TextureRegistry.SurfaceProducer
    public void setCallback(io.flutter.view.TextureRegistry.SurfaceProducer.Callback callback) {
    }

    @Override // io.flutter.view.TextureRegistry.TextureEntry
    public void setOnFrameAvailableListener(io.flutter.view.TextureRegistry.OnFrameAvailableListener onFrameAvailableListener) {
        this.texture.setOnFrameAvailableListener(onFrameAvailableListener);
    }

    @Override // io.flutter.view.TextureRegistry.SurfaceProducer
    public void setSize(int i17, int i18) {
        this.requestBufferWidth = i17;
        this.requestedBufferHeight = i18;
        getSurfaceTexture().setDefaultBufferSize(i17, i18);
    }
}
