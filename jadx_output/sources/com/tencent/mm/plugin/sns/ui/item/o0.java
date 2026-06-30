package com.tencent.mm.plugin.sns.ui.item;

/* loaded from: classes4.dex */
public class o0 implements jb4.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f169396a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.item.p0 f169397b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f169398c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.item.q0 f169399d;

    public o0(com.tencent.mm.plugin.sns.ui.item.q0 q0Var, java.lang.String str, com.tencent.mm.plugin.sns.ui.item.p0 p0Var, java.lang.String str2) {
        this.f169399d = q0Var;
        this.f169396a = str;
        this.f169397b = p0Var;
        this.f169398c = str2;
    }

    @Override // jb4.u
    public void a(boolean z17, java.lang.String str, android.graphics.Bitmap bitmap, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFinish", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$4");
        if (str2 == null || !str2.equals(this.f169396a)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFinish", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$4");
            return;
        }
        com.tencent.mm.plugin.sns.ui.item.p0 p0Var = this.f169397b;
        if (bitmap != null) {
            p0Var.M0.setImageBitmap(bitmap);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.SphereImageView.SphereCardAdTimeLineItem", "show progressView");
            p0Var.N0.setVisibility(0);
            p0Var.N0.a();
            java.lang.String str3 = this.f169398c;
            if (android.text.TextUtils.isEmpty(str3)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SphereImageView.SphereCardAdTimeLineItem", "thumbUrl is empty");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.SphereImageView.SphereCardAdTimeLineItem", "no shot and thumb cache, start download thumb image");
                za4.t0.c(str3, false, 133, 0, new ed4.w(this));
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFinish", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$4");
    }

    @Override // jb4.u
    public void b(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$4");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$4");
    }
}
