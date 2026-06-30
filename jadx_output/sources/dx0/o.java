package dx0;

/* loaded from: classes5.dex */
public abstract class o {
    public static final android.graphics.Bitmap a(android.graphics.Bitmap bitmap, android.util.Size targetSize) {
        kotlin.jvm.internal.o.g(bitmap, "<this>");
        kotlin.jvm.internal.o.g(targetSize, "targetSize");
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (height == 0 || width == 0) {
            return null;
        }
        try {
            int width2 = (width - targetSize.getWidth()) / 2;
            if (width2 < 0) {
                width2 = 0;
            }
            int height2 = (height - targetSize.getHeight()) / 2;
            if (height2 < 0) {
                height2 = 0;
            }
            int width3 = targetSize.getWidth();
            int height3 = targetSize.getHeight();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(height3));
            arrayList.add(java.lang.Integer.valueOf(width3));
            arrayList.add(java.lang.Integer.valueOf(height2));
            arrayList.add(java.lang.Integer.valueOf(width2));
            arrayList.add(bitmap);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/timeline/thumbnail/MJThumbnailProviderManagerKt", "centerCropToSize", "(Landroid/graphics/Bitmap;Landroid/util/Size;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue(), ((java.lang.Integer) arrayList.get(3)).intValue(), ((java.lang.Integer) arrayList.get(4)).intValue());
            yj0.a.e(obj, createBitmap, "com/tencent/mm/mj_publisher/finder/movie_composing/timeline/thumbnail/MJThumbnailProviderManagerKt", "centerCropToSize", "(Landroid/graphics/Bitmap;Landroid/util/Size;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
            return createBitmap;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MJThumbnailProviderManager", "getCenterCropBitmap: ", e17);
            return null;
        }
    }

    public static final android.graphics.Bitmap b(android.graphics.Bitmap bitmap, android.util.Size targetSize) {
        kotlin.jvm.internal.o.g(bitmap, "<this>");
        kotlin.jvm.internal.o.g(targetSize, "targetSize");
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (height == 0 || width == 0) {
            return null;
        }
        float f17 = width;
        float f18 = height;
        float max = java.lang.Math.max(targetSize.getWidth() / f17, targetSize.getHeight() / f18);
        if (max == 1.0f) {
            return a(bitmap, targetSize);
        }
        android.graphics.Bitmap createScaledBitmap = android.graphics.Bitmap.createScaledBitmap(bitmap, (int) (f17 * max), (int) (f18 * max), false);
        kotlin.jvm.internal.o.f(createScaledBitmap, "createScaledBitmap(...)");
        try {
            return a(createScaledBitmap, targetSize);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MJThumbnailProviderManager", "getScaledCenterCropBitmap: ", e17);
            return null;
        }
    }

    public static final java.lang.String c(com.tencent.maas.model.time.MJTimeRange mJTimeRange) {
        kotlin.jvm.internal.o.g(mJTimeRange, "<this>");
        return "[start:" + mJTimeRange.getStartTime().toSeconds() + ", duration:" + mJTimeRange.getDuration().toSeconds() + ']';
    }
}
