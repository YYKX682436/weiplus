package org.libpag;

/* loaded from: classes3.dex */
public class TraceImage {
    private byte _hellAccFlag_;

    public static void Trace(java.lang.String str, java.nio.ByteBuffer byteBuffer, int i17, int i18) {
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "org/libpag/TraceImage", "Trace", "(Ljava/lang/String;Ljava/nio/ByteBuffer;II)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "org/libpag/TraceImage", "Trace", "(Ljava/lang/String;Ljava/nio/ByteBuffer;II)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        createBitmap.copyPixelsFromBuffer(byteBuffer);
        createBitmap.getWidth();
        createBitmap.getHeight();
    }
}
