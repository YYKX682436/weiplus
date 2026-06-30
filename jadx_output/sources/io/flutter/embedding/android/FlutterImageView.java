package io.flutter.embedding.android;

/* loaded from: classes14.dex */
public class FlutterImageView extends android.view.View implements io.flutter.embedding.engine.renderer.RenderSurface {
    private static final java.lang.String TAG = "FlutterImageView";
    private byte _hellAccFlag_;
    private android.graphics.Bitmap currentBitmap;
    private android.media.Image currentImage;
    private io.flutter.embedding.engine.renderer.FlutterRenderer flutterRenderer;
    private android.media.ImageReader imageReader;
    private boolean isAttachedToFlutterRenderer;
    private boolean isAvailable;
    private io.flutter.embedding.android.FlutterImageView.SurfaceKind kind;

    /* renamed from: io.flutter.embedding.android.FlutterImageView$1, reason: invalid class name */
    /* loaded from: classes14.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$flutter$embedding$android$FlutterImageView$SurfaceKind;

        static {
            int[] iArr = new int[io.flutter.embedding.android.FlutterImageView.SurfaceKind.values().length];
            $SwitchMap$io$flutter$embedding$android$FlutterImageView$SurfaceKind = iArr;
            try {
                iArr[io.flutter.embedding.android.FlutterImageView.SurfaceKind.background.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$flutter$embedding$android$FlutterImageView$SurfaceKind[io.flutter.embedding.android.FlutterImageView.SurfaceKind.overlay.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes14.dex */
    public enum SurfaceKind {
        background,
        overlay
    }

    public FlutterImageView(android.content.Context context, int i17, int i18, io.flutter.embedding.android.FlutterImageView.SurfaceKind surfaceKind) {
        this(context, createImageReader(i17, i18), surfaceKind);
    }

    private void closeCurrentImage() {
        android.media.Image image = this.currentImage;
        if (image != null) {
            image.close();
            this.currentImage = null;
        }
    }

    private static android.media.ImageReader createImageReader(int i17, int i18) {
        int i19;
        int i27;
        if (i17 <= 0) {
            logW("ImageReader width must be greater than 0, but given width=%d, set width=1", java.lang.Integer.valueOf(i17));
            i19 = 1;
        } else {
            i19 = i17;
        }
        if (i18 <= 0) {
            logW("ImageReader height must be greater than 0, but given height=%d, set height=1", java.lang.Integer.valueOf(i18));
            i27 = 1;
        } else {
            i27 = i18;
        }
        return android.os.Build.VERSION.SDK_INT >= 29 ? android.media.ImageReader.newInstance(i19, i27, 1, 3, 768L) : android.media.ImageReader.newInstance(i19, i27, 1, 3);
    }

    private void init() {
        setAlpha(0.0f);
    }

    private static void logW(java.lang.String str, java.lang.Object... objArr) {
        io.flutter.Log.w(TAG, java.lang.String.format(java.util.Locale.US, str, objArr));
    }

    private void updateCurrentBitmap() {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            android.hardware.HardwareBuffer hardwareBuffer = this.currentImage.getHardwareBuffer();
            this.currentBitmap = android.graphics.Bitmap.wrapHardwareBuffer(hardwareBuffer, android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.SRGB));
            hardwareBuffer.close();
            return;
        }
        android.media.Image.Plane[] planes = this.currentImage.getPlanes();
        if (planes.length != 1) {
            return;
        }
        android.media.Image.Plane plane = planes[0];
        int rowStride = plane.getRowStride() / plane.getPixelStride();
        int height = this.currentImage.getHeight();
        android.graphics.Bitmap bitmap = this.currentBitmap;
        if (bitmap == null || bitmap.getWidth() != rowStride || this.currentBitmap.getHeight() != height) {
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(height));
            arrayList.add(java.lang.Integer.valueOf(rowStride));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "io/flutter/embedding/android/FlutterImageView", "updateCurrentBitmap", "()V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj, createBitmap, "io/flutter/embedding/android/FlutterImageView", "updateCurrentBitmap", "()V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            this.currentBitmap = createBitmap;
        }
        java.nio.ByteBuffer buffer = plane.getBuffer();
        buffer.rewind();
        this.currentBitmap.copyPixelsFromBuffer(buffer);
    }

    public boolean acquireLatestImage() {
        if (!this.isAttachedToFlutterRenderer) {
            return false;
        }
        android.media.Image acquireLatestImage = this.imageReader.acquireLatestImage();
        if (acquireLatestImage != null) {
            closeCurrentImage();
            this.currentImage = acquireLatestImage;
            invalidate();
        }
        return acquireLatestImage != null;
    }

    @Override // io.flutter.embedding.engine.renderer.RenderSurface
    public void attachToRenderer(io.flutter.embedding.engine.renderer.FlutterRenderer flutterRenderer) {
        if (io.flutter.embedding.android.FlutterImageView.AnonymousClass1.$SwitchMap$io$flutter$embedding$android$FlutterImageView$SurfaceKind[this.kind.ordinal()] == 1) {
            flutterRenderer.swapSurface(this.imageReader.getSurface());
        }
        setAlpha(1.0f);
        this.flutterRenderer = flutterRenderer;
        this.isAttachedToFlutterRenderer = true;
    }

    public void closeImageReader() {
        this.imageReader.close();
        this.isAvailable = false;
    }

    @Override // io.flutter.embedding.engine.renderer.RenderSurface
    public void detachFromRenderer() {
        if (this.isAttachedToFlutterRenderer) {
            setAlpha(0.0f);
            acquireLatestImage();
            this.currentBitmap = null;
            closeCurrentImage();
            invalidate();
            this.isAttachedToFlutterRenderer = false;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.RenderSurface
    public io.flutter.embedding.engine.renderer.FlutterRenderer getAttachedRenderer() {
        return this.flutterRenderer;
    }

    public android.media.ImageReader getImageReader() {
        return this.imageReader;
    }

    @Override // io.flutter.embedding.engine.renderer.RenderSurface
    public android.view.Surface getRenderSurface() {
        return this.imageReader.getSurface();
    }

    public android.view.Surface getSurface() {
        return this.imageReader.getSurface();
    }

    @Override // io.flutter.embedding.engine.renderer.RenderSurface
    public boolean isAvailableForRendering() {
        return this.imageReader != null && this.isAvailable;
    }

    @Override // io.flutter.embedding.engine.renderer.RenderSurface
    public void markSurfaceIsSwapOut(boolean z17) {
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        if (this.currentImage != null) {
            updateCurrentBitmap();
        }
        android.graphics.Bitmap bitmap = this.currentBitmap;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (android.graphics.Paint) null);
        }
    }

    @Override // io.flutter.embedding.engine.renderer.RenderSurface
    public void onRenderSurfaceNextUpdate(java.lang.Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        if (!(i17 == this.imageReader.getWidth() && i18 == this.imageReader.getHeight()) && this.kind == io.flutter.embedding.android.FlutterImageView.SurfaceKind.background && this.isAttachedToFlutterRenderer) {
            resizeIfNeeded(i17, i18);
            this.flutterRenderer.swapSurface(this.imageReader.getSurface());
        }
    }

    @Override // io.flutter.embedding.engine.renderer.RenderSurface
    public void pause() {
    }

    public void resizeIfNeeded(int i17, int i18) {
        if (this.flutterRenderer == null) {
            return;
        }
        if (i17 == this.imageReader.getWidth() && i18 == this.imageReader.getHeight()) {
            return;
        }
        closeCurrentImage();
        closeImageReader();
        this.imageReader = createImageReader(i17, i18);
        this.isAvailable = true;
    }

    @Override // io.flutter.embedding.engine.renderer.RenderSurface
    public void resume() {
    }

    public FlutterImageView(android.content.Context context) {
        this(context, 1, 1, io.flutter.embedding.android.FlutterImageView.SurfaceKind.background);
    }

    public FlutterImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, 1, 1, io.flutter.embedding.android.FlutterImageView.SurfaceKind.background);
    }

    public FlutterImageView(android.content.Context context, android.media.ImageReader imageReader, io.flutter.embedding.android.FlutterImageView.SurfaceKind surfaceKind) {
        super(context, null);
        this.isAvailable = false;
        this.isAttachedToFlutterRenderer = false;
        this.imageReader = imageReader;
        this.kind = surfaceKind;
        init();
        this.isAvailable = true;
    }
}
