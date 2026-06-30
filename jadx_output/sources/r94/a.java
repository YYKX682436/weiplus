package r94;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f393451a = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_color_space_fix, true);

    public static void a(android.graphics.BitmapFactory.Options options, android.graphics.BitmapFactory.Options options2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkSupportWideColor", "com.tencent.mm.plugin.sns.bitmap.SnsBitmapUtil");
        if (android.os.Build.VERSION.SDK_INT > 26 && f393451a && options2 != null && (options2.outColorSpace == android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.DCI_P3) || options2.outColorSpace == android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.DISPLAY_P3))) {
            options.inPreferredColorSpace = android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.SRGB);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkSupportWideColor", "com.tencent.mm.plugin.sns.bitmap.SnsBitmapUtil");
    }

    public static android.graphics.Bitmap b(java.lang.String str, android.graphics.BitmapFactory.Options options, float f17) {
        android.graphics.Bitmap bitmap;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("decode", "com.tencent.mm.plugin.sns.bitmap.SnsBitmapUtil");
        java.lang.System.currentTimeMillis();
        android.graphics.Bitmap b17 = com.tencent.mm.memory.o.c().b(str, options);
        if (f17 == 0.0f) {
            java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("decode", "com.tencent.mm.plugin.sns.bitmap.SnsBitmapUtil");
            return b17;
        }
        if (b17 != null) {
            bitmap = com.tencent.mm.sdk.platformtools.x.s0(b17, true, f17 * b17.getWidth());
            java.lang.System.currentTimeMillis();
        } else {
            bitmap = null;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("decode", "com.tencent.mm.plugin.sns.bitmap.SnsBitmapUtil");
        return bitmap;
    }

    public static com.tencent.mm.memory.r c(java.lang.String str, android.graphics.BitmapFactory.Options options) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("decode", "com.tencent.mm.plugin.sns.bitmap.SnsBitmapUtil");
        java.lang.System.currentTimeMillis();
        android.graphics.Bitmap b17 = com.tencent.mm.memory.o.c().b(str, options);
        java.lang.System.currentTimeMillis();
        com.tencent.mm.memory.r c17 = com.tencent.mm.memory.r.c(b17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("decode", "com.tencent.mm.plugin.sns.bitmap.SnsBitmapUtil");
        return c17;
    }

    public static com.tencent.mm.memory.r d(java.lang.String str, android.graphics.BitmapFactory.Options options) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("decodeWithRotateByExif", "com.tencent.mm.plugin.sns.bitmap.SnsBitmapUtil");
        a(options, options);
        java.lang.System.currentTimeMillis();
        try {
            android.graphics.Bitmap b17 = com.tencent.mm.memory.o.c().b(str, options);
            if (b17 != null) {
                b17 = ca4.z0.j(str, b17);
            }
            java.lang.System.currentTimeMillis();
            com.tencent.mm.memory.r c17 = com.tencent.mm.memory.r.c(b17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("decodeWithRotateByExif", "com.tencent.mm.plugin.sns.bitmap.SnsBitmapUtil");
            return c17;
        } catch (java.lang.OutOfMemoryError e17) {
            ((com.tencent.mm.feature.performance.c2) ((ob0.h3) i95.n0.c(ob0.h3.class))).getClass();
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsBitmapUtil", "%s", com.tencent.mm.plugin.performance.watchdogs.b0.B.g());
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsBitmapUtil", "OutOfMemoryError e " + e17.getMessage());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("decodeWithRotateByExif", "com.tencent.mm.plugin.sns.bitmap.SnsBitmapUtil");
            return null;
        }
    }

    public static android.graphics.Bitmap e(java.lang.String str, android.graphics.BitmapFactory.Options options, android.graphics.BitmapFactory.Options options2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("decodeWithRotateByExifReturnBitmap", "com.tencent.mm.plugin.sns.bitmap.SnsBitmapUtil");
        a(options, options2);
        java.lang.System.currentTimeMillis();
        try {
            android.graphics.Bitmap b17 = com.tencent.mm.memory.o.c().b(str, options);
            if (b17 != null) {
                b17 = ca4.z0.j(str, b17);
            }
            java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("decodeWithRotateByExifReturnBitmap", "com.tencent.mm.plugin.sns.bitmap.SnsBitmapUtil");
            return b17;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SnsBitmapUtil", e17, "", new java.lang.Object[0]);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("decodeWithRotateByExifReturnBitmap", "com.tencent.mm.plugin.sns.bitmap.SnsBitmapUtil");
            return null;
        } catch (java.lang.OutOfMemoryError e18) {
            ((com.tencent.mm.feature.performance.c2) ((ob0.h3) i95.n0.c(ob0.h3.class))).getClass();
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsBitmapUtil", "%s", com.tencent.mm.plugin.performance.watchdogs.b0.B.g());
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsBitmapUtil", "OutOfMemoryError e " + e18.getMessage());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("decodeWithRotateByExifReturnBitmap", "com.tencent.mm.plugin.sns.bitmap.SnsBitmapUtil");
            return null;
        }
    }

    public static android.graphics.Bitmap f(java.lang.String str, android.graphics.Rect rect, android.graphics.BitmapFactory.Options options) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("regionDecodeWithRotateByExif", "com.tencent.mm.plugin.sns.bitmap.SnsBitmapUtil");
        java.lang.System.currentTimeMillis();
        android.graphics.Bitmap e17 = com.tencent.mm.memory.o.c().e(str, rect, options);
        if (e17 != null) {
            e17 = ca4.z0.j(str, e17);
        }
        java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("regionDecodeWithRotateByExif", "com.tencent.mm.plugin.sns.bitmap.SnsBitmapUtil");
        return e17;
    }
}
