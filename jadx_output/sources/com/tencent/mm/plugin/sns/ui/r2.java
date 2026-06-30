package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public final class r2 extends com.tencent.mm.plugin.sns.model.f2 {

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.ImageView f170372c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f170373d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Bitmap f170374e;

    public r2(android.widget.ImageView iv6, java.lang.String path) {
        kotlin.jvm.internal.o.g(iv6, "iv");
        kotlin.jvm.internal.o.g(path, "path");
        this.f170372c = iv6;
        this.f170373d = path;
    }

    @Override // com.tencent.mm.plugin.sns.model.f2
    public java.lang.Object a(java.lang.Object[] objArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doInBackground", "com.tencent.mm.plugin.sns.ui.FinderPicWidget$ThumbLoader");
        java.lang.String[] params = (java.lang.String[]) objArr;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doInBackground", "com.tencent.mm.plugin.sns.ui.FinderPicWidget$ThumbLoader");
        kotlin.jvm.internal.o.g(params, "params");
        int nj6 = com.tencent.mm.plugin.sns.model.l4.nj();
        int nj7 = com.tencent.mm.plugin.sns.model.l4.nj();
        this.f170374e = com.tencent.mm.sdk.platformtools.x.T(this.f170373d, nj6, nj7, true);
        this.f170374e = com.tencent.mm.sdk.platformtools.x.w0(this.f170374e, com.tencent.mm.compatible.util.Exif.fromFile(r3).getOrientationInDegree());
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doInBackground", "com.tencent.mm.plugin.sns.ui.FinderPicWidget$ThumbLoader");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doInBackground", "com.tencent.mm.plugin.sns.ui.FinderPicWidget$ThumbLoader");
        return bool;
    }

    @Override // com.tencent.mm.plugin.sns.model.f2
    public java.util.concurrent.ExecutorService b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getExecutor", "com.tencent.mm.plugin.sns.ui.FinderPicWidget$ThumbLoader");
        java.util.concurrent.ExecutorService ij6 = com.tencent.mm.plugin.sns.model.l4.ij();
        kotlin.jvm.internal.o.f(ij6, "getMediaExecutor(...)");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getExecutor", "com.tencent.mm.plugin.sns.ui.FinderPicWidget$ThumbLoader");
        return ij6;
    }

    @Override // com.tencent.mm.plugin.sns.model.f2
    public void c(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.ui.FinderPicWidget$ThumbLoader");
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.ui.FinderPicWidget$ThumbLoader");
        super.c(java.lang.Boolean.valueOf(booleanValue));
        if (ca4.z0.f(this.f170374e)) {
            this.f170372c.setImageBitmap(this.f170374e);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.ui.FinderPicWidget$ThumbLoader");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.ui.FinderPicWidget$ThumbLoader");
    }
}
