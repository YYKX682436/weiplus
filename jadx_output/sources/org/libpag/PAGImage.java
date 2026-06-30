package org.libpag;

/* loaded from: classes13.dex */
public class PAGImage {
    private byte _hellAccFlag_;
    long nativeContext;

    static {
        b56.a.a("pag");
        nativeInit();
    }

    public PAGImage(long j17) {
        this.nativeContext = j17;
    }

    public static org.libpag.PAGImage FromAssets(android.content.res.AssetManager assetManager, java.lang.String str) {
        long LoadFromAssets = LoadFromAssets(assetManager, str);
        if (LoadFromAssets == 0) {
            return null;
        }
        return new org.libpag.PAGImage(LoadFromAssets);
    }

    public static org.libpag.PAGImage FromBitmap(android.graphics.Bitmap bitmap) {
        if (bitmap != null && bitmap.getConfig() == android.graphics.Bitmap.Config.ARGB_4444) {
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Boolean.FALSE);
            arrayList.add(config);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(bitmap, arrayList.toArray(), "org/libpag/PAGImage", "FromBitmap", "(Landroid/graphics/Bitmap;)Lorg/libpag/PAGImage;", "android/graphics/Bitmap_EXEC_", "copy", "(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap copy = bitmap.copy((android.graphics.Bitmap.Config) arrayList.get(0), ((java.lang.Boolean) arrayList.get(1)).booleanValue());
            yj0.a.e(bitmap, copy, "org/libpag/PAGImage", "FromBitmap", "(Landroid/graphics/Bitmap;)Lorg/libpag/PAGImage;", "android/graphics/Bitmap_EXEC_", "copy", "(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;");
            bitmap = copy;
        }
        long LoadFromBitmap = LoadFromBitmap(bitmap);
        if (LoadFromBitmap == 0) {
            return null;
        }
        return new org.libpag.PAGImage(LoadFromBitmap);
    }

    public static org.libpag.PAGImage FromBytes(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        long LoadFromBytes = LoadFromBytes(bArr, bArr.length);
        if (LoadFromBytes == 0) {
            return null;
        }
        return new org.libpag.PAGImage(LoadFromBytes);
    }

    public static org.libpag.PAGImage FromPath(java.lang.String str) {
        long LoadFromPath = LoadFromPath(str);
        if (LoadFromPath == 0) {
            return null;
        }
        return new org.libpag.PAGImage(LoadFromPath);
    }

    public static org.libpag.PAGImage FromTexture(int i17, int i18, int i19, int i27) {
        return FromTexture(i17, i18, i19, i27, false);
    }

    private static native long LoadFromAssets(android.content.res.AssetManager assetManager, java.lang.String str);

    private static native long LoadFromBitmap(android.graphics.Bitmap bitmap);

    private static native long LoadFromBytes(byte[] bArr, int i17);

    private static native long LoadFromPath(java.lang.String str);

    private static native long LoadFromTexture(int i17, int i18, int i19, int i27, boolean z17);

    private native void nativeFinalize();

    private native void nativeGetMatrix(float[] fArr);

    private static final native void nativeInit();

    private final native void nativeRelease();

    private native void nativeSetMatrix(float f17, float f18, float f19, float f27, float f28, float f29);

    public void finalize() {
        nativeFinalize();
    }

    public native int height();

    public android.graphics.Matrix matrix() {
        float[] fArr = new float[9];
        nativeGetMatrix(fArr);
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setValues(fArr);
        return matrix;
    }

    public void release() {
        nativeRelease();
    }

    public native int scaleMode();

    public void setMatrix(android.graphics.Matrix matrix) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        nativeSetMatrix(fArr[0], fArr[3], fArr[1], fArr[4], fArr[2], fArr[5]);
    }

    public native void setScaleMode(int i17);

    public native int width();

    public static org.libpag.PAGImage FromTexture(int i17, int i18, int i19, int i27, boolean z17) {
        long LoadFromTexture = LoadFromTexture(i17, i18, i19, i27, z17);
        if (LoadFromTexture == 0) {
            return null;
        }
        return new org.libpag.PAGImage(LoadFromTexture);
    }
}
