package ee4;

/* loaded from: classes4.dex */
public final class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ee4.c0 f251676d;

    public b0(ee4.c0 c0Var) {
        this.f251676d = c0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        java.lang.String str2;
        int i17;
        int i18;
        int i19;
        java.lang.String str3 = "run";
        java.lang.String str4 = "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCommitPc$commitInternal$1";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCommitPc$commitInternal$1");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ee4.c0 c0Var = this.f251676d;
        ee4.f1 n17 = c0Var.n();
        java.util.List paths = c0Var.m().v().d();
        n17.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportPhotoInfo", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicReportPc");
        kotlin.jvm.internal.o.g(paths, "paths");
        java.util.Iterator it = ((java.util.ArrayList) paths).iterator();
        while (it.hasNext()) {
            java.lang.String str5 = (java.lang.String) it.next();
            com.tencent.mm.compatible.util.Exif fromFile = com.tencent.mm.compatible.util.Exif.fromFile(str5);
            if (fromFile.latitude >= 0.0d) {
                str = str3;
                str2 = str4;
                if (fromFile.longitude >= 0.0d) {
                    i17 = 1;
                    java.lang.String str6 = fromFile.model;
                    i18 = fromFile.imageWidth;
                    i19 = fromFile.imageHeight;
                    if (i18 > 0 || i19 <= 0) {
                        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        com.tencent.mm.sdk.platformtools.x.J(str5, options);
                        int i27 = options.outWidth;
                        i19 = options.outHeight;
                        i18 = i27;
                    }
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15523, java.lang.Integer.valueOf(i17), str6, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf((int) fromFile.getUxtimeDatatimeOriginal()));
                    str3 = str;
                    str4 = str2;
                }
            } else {
                str = str3;
                str2 = str4;
            }
            i17 = 0;
            java.lang.String str62 = fromFile.model;
            i18 = fromFile.imageWidth;
            i19 = fromFile.imageHeight;
            if (i18 > 0) {
            }
            android.graphics.BitmapFactory.Options options2 = new android.graphics.BitmapFactory.Options();
            options2.inJustDecodeBounds = true;
            com.tencent.mm.sdk.platformtools.x.J(str5, options2);
            int i272 = options2.outWidth;
            i19 = options2.outHeight;
            i18 = i272;
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15523, java.lang.Integer.valueOf(i17), str62, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf((int) fromFile.getUxtimeDatatimeOriginal()));
            str3 = str;
            str4 = str2;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportPhotoInfo", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicReportPc");
        c0Var.f("report photo info cost " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str3, str4);
    }
}
