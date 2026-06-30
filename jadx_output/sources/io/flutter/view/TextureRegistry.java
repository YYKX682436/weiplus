package io.flutter.view;

/* loaded from: classes15.dex */
public interface TextureRegistry {

    /* loaded from: classes6.dex */
    public interface GLTextureConsumer {
        android.graphics.SurfaceTexture getSurfaceTexture();
    }

    /* loaded from: classes13.dex */
    public interface ImageConsumer {
        android.media.Image acquireLatestImage();
    }

    /* loaded from: classes15.dex */
    public interface ImageTextureEntry extends io.flutter.view.TextureRegistry.TextureEntry {
        void pushImage(android.media.Image image);
    }

    /* loaded from: classes15.dex */
    public interface OnFrameAvailableListener {
        void onFrameAvailable(boolean z17);
    }

    /* loaded from: classes7.dex */
    public interface OnFrameConsumedListener {
        void onFrameConsumed();
    }

    /* loaded from: classes15.dex */
    public interface OnTrimMemoryListener {
        void onTrimMemory(int i17);
    }

    /* loaded from: classes6.dex */
    public enum SurfaceLifecycle {
        manual,
        resetInBackground
    }

    /* loaded from: classes15.dex */
    public interface SurfaceProducer extends io.flutter.view.TextureRegistry.TextureEntry {

        /* loaded from: classes15.dex */
        public interface Callback {
            default void onSurfaceAvailable() {
                onSurfaceCreated();
            }

            default void onSurfaceCleanup() {
                onSurfaceDestroyed();
            }

            @java.lang.Deprecated(forRemoval = true, since = "Flutter 3.27")
            default void onSurfaceCreated() {
            }

            @java.lang.Deprecated(forRemoval = true, since = "Flutter 3.28")
            default void onSurfaceDestroyed() {
            }
        }

        android.view.Surface getForcedNewSurface();

        int getHeight();

        android.view.Surface getSurface();

        int getWidth();

        boolean handlesCropAndRotation();

        void scheduleFrame();

        void setCallback(io.flutter.view.TextureRegistry.SurfaceProducer.Callback callback);

        void setSize(int i17, int i18);
    }

    /* loaded from: classes15.dex */
    public interface SurfaceTextureEntry extends io.flutter.view.TextureRegistry.TextureEntry {
        default void setOnFrameConsumedListener(io.flutter.view.TextureRegistry.OnFrameConsumedListener onFrameConsumedListener) {
        }

        default void setOnTrimMemoryListener(io.flutter.view.TextureRegistry.OnTrimMemoryListener onTrimMemoryListener) {
        }

        android.graphics.SurfaceTexture surfaceTexture();
    }

    /* loaded from: classes7.dex */
    public interface TextureEntry {
        long id();

        void release();

        default void setOnFrameAvailableListener(io.flutter.view.TextureRegistry.OnFrameAvailableListener onFrameAvailableListener) {
        }
    }

    io.flutter.view.TextureRegistry.ImageTextureEntry createImageTexture();

    default io.flutter.view.TextureRegistry.SurfaceProducer createSurfaceProducer() {
        return createSurfaceProducer(io.flutter.view.TextureRegistry.SurfaceLifecycle.manual);
    }

    io.flutter.view.TextureRegistry.SurfaceProducer createSurfaceProducer(io.flutter.view.TextureRegistry.SurfaceLifecycle surfaceLifecycle);

    io.flutter.view.TextureRegistry.SurfaceTextureEntry createSurfaceTexture();

    default void onTrimMemory(int i17) {
    }

    io.flutter.view.TextureRegistry.SurfaceTextureEntry registerSurfaceTexture(android.graphics.SurfaceTexture surfaceTexture);
}
