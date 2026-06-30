package com.tencent.mm.plugin.sns.ad.landingpage.component.comp;

/* loaded from: classes4.dex */
public class e4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f162794d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f162795e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.component.comp.g4 f162796f;

    public e4(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.g4 g4Var, java.lang.String str, android.widget.ImageView imageView) {
        this.f162796f = g4Var;
        this.f162794d = str;
        this.f162795e = imageView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent$3");
        android.graphics.Bitmap avatarByUserName = com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().getAvatarByUserName(this.f162794d, false);
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.d4(this, avatarByUserName));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent$3");
    }
}
