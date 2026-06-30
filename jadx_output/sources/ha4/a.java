package ha4;

/* loaded from: classes4.dex */
public abstract class a {
    public static com.tencent.mm.memory.r a(android.graphics.Bitmap bitmap, java.lang.String str, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("blurPath", "com.tencent.mm.plugin.sns.lucky.model.BlurHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("blurBitmap", "com.tencent.mm.plugin.sns.lucky.model.BlurHelper");
        com.tencent.mm.memory.r c17 = com.tencent.mm.memory.r.c(com.tencent.mm.sdk.platformtools.x.X(bitmap, i18));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("blurBitmap", "com.tencent.mm.plugin.sns.lucky.model.BlurHelper");
        if (c17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BlurHelper", "returnBitmap error2 ");
        }
        if (c17 != null) {
            c17.f68974h = false;
            new android.graphics.Canvas(c17.f68970d).drawColor(i17);
        }
        try {
            c17.f68974h = false;
            com.tencent.mm.sdk.platformtools.x.D0(c17.f68970d, 70, android.graphics.Bitmap.CompressFormat.JPEG, str, false);
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BlurHelper", "error for exception " + e17.getMessage());
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BlurHelper", e17, "", new java.lang.Object[0]);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BlurHelper", "blur done bitmap  " + c17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("blurPath", "com.tencent.mm.plugin.sns.lucky.model.BlurHelper");
        return c17;
    }

    public static com.tencent.mm.memory.r b(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.memory.r a17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("blurPath", "com.tencent.mm.plugin.sns.lucky.model.BlurHelper");
        int argb = android.graphics.Color.argb(51, 255, 255, 255);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("blurPath", "com.tencent.mm.plugin.sns.lucky.model.BlurHelper");
        com.tencent.mm.memory.r p17 = ca4.z0.p(str);
        if (p17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BlurHelper", "returnBitmap error1 ");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("blurPath", "com.tencent.mm.plugin.sns.lucky.model.BlurHelper");
            a17 = null;
        } else {
            p17.f68974h = false;
            a17 = a(p17.f68970d, str2, argb, 55);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("blurPath", "com.tencent.mm.plugin.sns.lucky.model.BlurHelper");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("blurPath", "com.tencent.mm.plugin.sns.lucky.model.BlurHelper");
        return a17;
    }
}
