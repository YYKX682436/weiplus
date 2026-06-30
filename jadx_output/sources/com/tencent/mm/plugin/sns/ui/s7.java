package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class s7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.p7 f170444d;

    public s7(com.tencent.mm.plugin.sns.ui.p7 p7Var) {
        this.f170444d = p7Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.PicWidget$3");
        java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.sns.ui.p7 p7Var = this.f170444d;
        java.util.ArrayList<java.lang.String> d17 = p7Var.f170164g.d();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.PicWidget");
        p7Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportPhotoInfo", "com.tencent.mm.plugin.sns.ui.PicWidget");
        for (java.lang.String str : d17) {
            com.tencent.mm.compatible.util.Exif fromFile = com.tencent.mm.compatible.util.Exif.fromFile(str);
            int i17 = (fromFile.latitude < 0.0d || fromFile.longitude < 0.0d) ? 0 : 1;
            java.lang.String str2 = fromFile.model;
            int i18 = fromFile.imageWidth;
            int i19 = fromFile.imageHeight;
            if (i18 <= 0 || i19 <= 0) {
                android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                com.tencent.mm.sdk.platformtools.x.J(str, options);
                int i27 = options.outWidth;
                i19 = options.outHeight;
                i18 = i27;
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15523, java.lang.Integer.valueOf(i17), str2, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf((int) fromFile.getUxtimeDatatimeOriginal()));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportPhotoInfo", "com.tencent.mm.plugin.sns.ui.PicWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.PicWidget");
        java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.PicWidget$3");
    }
}
