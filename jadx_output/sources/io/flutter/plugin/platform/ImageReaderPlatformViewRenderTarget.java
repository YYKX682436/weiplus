package io.flutter.plugin.platform;

/* loaded from: classes15.dex */
public class ImageReaderPlatformViewRenderTarget implements io.flutter.plugin.platform.PlatformViewRenderTarget {
    private static final int MAX_IMAGES = 4;
    private static final java.lang.String TAG = "ImageReaderPlatformViewRenderTarget";
    private android.media.ImageReader reader;
    private io.flutter.view.TextureRegistry.ImageTextureEntry textureEntry;
    private int bufferWidth = 0;
    private int bufferHeight = 0;
    private final android.os.Handler onImageAvailableHandler = new android.os.Handler();
    private final android.media.ImageReader.OnImageAvailableListener onImageAvailableListener = new android.media.ImageReader.OnImageAvailableListener() { // from class: io.flutter.plugin.platform.ImageReaderPlatformViewRenderTarget.1
        @Override // android.media.ImageReader.OnImageAvailableListener
        public void onImageAvailable(android.media.ImageReader imageReader) {
            android.media.Image image;
            try {
                image = imageReader.acquireLatestImage();
            } catch (java.lang.IllegalStateException e17) {
                io.flutter.Log.e(io.flutter.plugin.platform.ImageReaderPlatformViewRenderTarget.TAG, "onImageAvailable acquireLatestImage failed: " + e17.toString());
                image = null;
            }
            if (image == null) {
                return;
            }
            io.flutter.plugin.platform.ImageReaderPlatformViewRenderTarget.this.textureEntry.pushImage(image);
        }
    };

    public ImageReaderPlatformViewRenderTarget(io.flutter.view.TextureRegistry.ImageTextureEntry imageTextureEntry) {
        if (android.os.Build.VERSION.SDK_INT < 29) {
            throw new java.lang.UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
        }
        this.textureEntry = imageTextureEntry;
    }

    private void closeReader() {
        if (this.reader != null) {
            this.textureEntry.pushImage(null);
            this.reader.close();
            this.reader = null;
        }
    }

    public android.media.ImageReader createImageReader() {
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (i17 >= 33) {
            return createImageReader33();
        }
        if (i17 >= 29) {
            return createImageReader29();
        }
        throw new java.lang.UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
    }

    public android.media.ImageReader createImageReader29() {
        android.media.ImageReader newInstance = android.media.ImageReader.newInstance(this.bufferWidth, this.bufferHeight, 34, 4, 256L);
        newInstance.setOnImageAvailableListener(this.onImageAvailableListener, this.onImageAvailableHandler);
        return newInstance;
    }

    public android.media.ImageReader createImageReader33() {
        android.media.ImageReader.Builder builder = new android.media.ImageReader.Builder(this.bufferWidth, this.bufferHeight);
        builder.setMaxImages(4);
        builder.setImageFormat(34);
        builder.setUsage(256L);
        android.media.ImageReader build = builder.build();
        build.setOnImageAvailableListener(this.onImageAvailableListener, this.onImageAvailableHandler);
        return build;
    }

    @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
    public int getHeight() {
        return this.bufferHeight;
    }

    @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
    public long getId() {
        return this.textureEntry.id();
    }

    @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
    public android.view.Surface getSurface() {
        return this.reader.getSurface();
    }

    @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
    public int getWidth() {
        return this.bufferWidth;
    }

    @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
    public boolean isReleased() {
        return this.textureEntry == null;
    }

    @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
    public void release() {
        closeReader();
        this.textureEntry = null;
    }

    @Override // io.flutter.plugin.platform.PlatformViewRenderTarget
    public void resize(int i17, int i18) {
        if (this.reader != null && this.bufferWidth == i17 && this.bufferHeight == i18) {
            return;
        }
        closeReader();
        this.bufferWidth = i17;
        this.bufferHeight = i18;
        this.reader = createImageReader();
    }
}
