package t84;

/* loaded from: classes4.dex */
public abstract class i {
    public static android.graphics.Bitmap a(int i17, int i18, int i19, int i27) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createColorBitmap", "com.tencent.mm.plugin.sns.ad.widget.gllib.Utils");
        if (i17 == 0 || i18 == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createColorBitmap", "com.tencent.mm.plugin.sns.ad.widget.gllib.Utils");
            return null;
        }
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/widget/gllib/Utils", "createColorBitmap", "(IIII)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/sns/ad/widget/gllib/Utils", "createColorBitmap", "(IIII)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        createBitmap.eraseColor(i19);
        if (i27 == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createColorBitmap", "com.tencent.mm.plugin.sns.ad.widget.gllib.Utils");
            return createBitmap;
        }
        android.graphics.Bitmap s07 = com.tencent.mm.sdk.platformtools.x.s0(createBitmap, true, i27);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createColorBitmap", "com.tencent.mm.plugin.sns.ad.widget.gllib.Utils");
        return s07;
    }

    public static int b(android.graphics.Bitmap bitmap) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initTexture", "com.tencent.mm.plugin.sns.ad.widget.gllib.Utils");
        if (bitmap == null) {
            com.tencent.mars.xlog.Log.i("Utils", "initTexture, bmp==null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initTexture", "com.tencent.mm.plugin.sns.ad.widget.gllib.Utils");
            return 0;
        }
        com.tencent.mars.xlog.Log.i("Utils", "initTexture, bmp.w=" + bitmap.getWidth() + ", bmp.h=" + bitmap.getHeight());
        try {
            int[] iArr = new int[1];
            android.opengl.GLES20.glGenTextures(1, iArr, 0);
            int i17 = iArr[0];
            if (i17 == 0) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initTexture", "com.tencent.mm.plugin.sns.ad.widget.gllib.Utils");
                return 0;
            }
            android.opengl.GLES20.glBindTexture(3553, i17);
            android.opengl.GLES20.glTexParameterf(3553, 10241, 9728.0f);
            android.opengl.GLES20.glTexParameterf(3553, com.google.android.gms.gcm.Task.EXTRAS_LIMIT_BYTES, 9728.0f);
            android.opengl.GLES20.glTexParameterf(3553, 10242, 33071.0f);
            android.opengl.GLES20.glTexParameterf(3553, 10243, 33071.0f);
            android.opengl.GLUtils.texImage2D(3553, 0, bitmap, 0);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initTexture", "com.tencent.mm.plugin.sns.ad.widget.gllib.Utils");
            return i17;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("Utils", "initTexture exp:" + android.util.Log.getStackTraceString(th6));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initTexture", "com.tencent.mm.plugin.sns.ad.widget.gllib.Utils");
            return 0;
        }
    }
}
