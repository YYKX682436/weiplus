package io.flutter.plugin.platform;

/* loaded from: classes15.dex */
public class SurfaceTexturePlatformViewRenderTarget implements io.flutter.plugin.platform.PlatformViewRenderTarget {
    private static final java.lang.String TAG = "SurfaceTexturePlatformViewRenderTarget";
    private android.view.Surface surface;
    private android.graphics.SurfaceTexture surfaceTexture;
    private final io.flutter.view.TextureRegistry.SurfaceTextureEntry surfaceTextureEntry;
    private final io.flutter.view.TextureRegistry.OnTrimMemoryListener trimMemoryListener;
    private int bufferWidth = 0;
    private int bufferHeight = 0;
    private boolean shouldRecreateSurfaceForLowMemory = false;

    public SurfaceTexturePlatformViewRenderTarget(io.flutter.view.TextureRegistry.SurfaceTextureEntry surfaceTextureEntry) {
        io.flutter.view.TextureRegistry.OnTrimMemoryListener onTrimMemoryListener = new io.flutter.view.TextureRegistry.OnTrimMemoryListener() { // from class: io.flutter.plugin.platform.SurfaceTexturePlatformViewRenderTarget.1
            @Override // io.flutter.view.TextureRegistry.OnTrimMemoryListener
            public void onTrimMemory(int i17) {
                if (i17 != 80 || android.os.Build.VERSION.SDK_INT < 29) {
                    return;
                }
                io.flutter.plugin.platform.SurfaceTexturePlatformViewRenderTarget.this.shouldRecreateSurfaceForLowMemory = true;
            }
        };
        this.trimMemoryListener = onTrimMemoryListener;
        this.surfaceTextureEntry = surfaceTextureEntry;
        this.surfaceTexture = surfaceTextureEntry.surfaceTexture();
        surfaceTextureEntry.setOnTrimMemoryListener(onTrimMemoryListener);
    }

    private void recreateSurfaceIfNeeded() {
        android.view.Surface surface = this.surface;
        if (surface == null || this.shouldRecreateSurfaceForLowMemory) {
            if (surface != null) {
                surface.release();
                this.surface = null;
            }
            this.surface = createSurface();
            this.shouldRecreateSurfaceForLowMemory = false;
        }
    }

    public android.view.Surface createSurface() {
        return new android.view.Surface(this.surfaceTexture);
    }

    @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
    public int getHeight() {
        return this.bufferHeight;
    }

    @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
    public long getId() {
        return this.surfaceTextureEntry.id();
    }

    @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
    public android.view.Surface getSurface() {
        recreateSurfaceIfNeeded();
        android.graphics.SurfaceTexture surfaceTexture = this.surfaceTexture;
        if (surfaceTexture == null || surfaceTexture.isReleased()) {
            return null;
        }
        return this.surface;
    }

    @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
    public int getWidth() {
        return this.bufferWidth;
    }

    @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
    public boolean isReleased() {
        return this.surfaceTexture == null;
    }

    @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
    public void release() {
        this.surfaceTexture = null;
        android.view.Surface surface = this.surface;
        if (surface != null) {
            surface.release();
            this.surface = null;
        }
    }

    @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
    public void resize(int i17, int i18) {
        this.bufferWidth = i17;
        this.bufferHeight = i18;
        android.graphics.SurfaceTexture surfaceTexture = this.surfaceTexture;
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(i17, i18);
        }
    }
}
