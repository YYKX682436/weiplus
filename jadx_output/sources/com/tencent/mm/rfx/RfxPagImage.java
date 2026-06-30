package com.tencent.mm.rfx;

/* loaded from: classes13.dex */
public class RfxPagImage {
    private byte _hellAccFlag_;
    long nativeContext;

    static {
        tq5.k.a("xlabeffect");
        nativeInit();
    }

    public RfxPagImage(long j17) {
        this.nativeContext = j17;
    }

    public static com.tencent.mm.rfx.RfxPagImage FromAssets(android.content.res.AssetManager assetManager, java.lang.String str) {
        long LoadFromAssets = LoadFromAssets(assetManager, str);
        if (LoadFromAssets == 0) {
            return null;
        }
        return new com.tencent.mm.rfx.RfxPagImage(LoadFromAssets);
    }

    public static com.tencent.mm.rfx.RfxPagImage FromBitmap(android.graphics.Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        android.graphics.Bitmap.Config config = bitmap.getConfig();
        if (android.os.Build.VERSION.SDK_INT >= 26 && config == android.graphics.Bitmap.Config.HARDWARE) {
            return null;
        }
        if (config != android.graphics.Bitmap.Config.ALPHA_8 && (config != android.graphics.Bitmap.Config.ARGB_8888 || !bitmap.isPremultiplied())) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            android.graphics.Bitmap.Config config2 = android.graphics.Bitmap.Config.ARGB_8888;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config2);
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(height));
            arrayList.add(java.lang.Integer.valueOf(width));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/rfx/RfxPagImage", "FromBitmap", "(Landroid/graphics/Bitmap;)Lcom/tencent/mm/rfx/RfxPagImage;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj, createBitmap, "com/tencent/mm/rfx/RfxPagImage", "FromBitmap", "(Landroid/graphics/Bitmap;)Lcom/tencent/mm/rfx/RfxPagImage;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            new android.graphics.Canvas(createBitmap).drawBitmap(bitmap, 0.0f, 0.0f, new android.graphics.Paint());
            bitmap = createBitmap;
        }
        long LoadFromBitmap = LoadFromBitmap(bitmap);
        if (LoadFromBitmap == 0) {
            return null;
        }
        return new com.tencent.mm.rfx.RfxPagImage(LoadFromBitmap);
    }

    public static com.tencent.mm.rfx.RfxPagImage FromBytes(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        long LoadFromBytes = LoadFromBytes(bArr, bArr.length);
        if (LoadFromBytes == 0) {
            return null;
        }
        return new com.tencent.mm.rfx.RfxPagImage(LoadFromBytes);
    }

    public static com.tencent.mm.rfx.RfxPagImage FromPath(java.lang.String str) {
        long LoadFromPath = LoadFromPath(str);
        if (LoadFromPath == 0) {
            return null;
        }
        return new com.tencent.mm.rfx.RfxPagImage(LoadFromPath);
    }

    private static native long LoadFromAssets(android.content.res.AssetManager assetManager, java.lang.String str);

    private static native long LoadFromBitmap(android.graphics.Bitmap bitmap);

    private static native long LoadFromBytes(byte[] bArr, int i17);

    private static native long LoadFromPath(java.lang.String str);

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
}
