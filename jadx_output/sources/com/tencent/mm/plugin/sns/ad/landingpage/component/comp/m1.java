package com.tencent.mm.plugin.sns.ad.landingpage.component.comp;

/* loaded from: classes3.dex */
public class m1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f162893d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f162894e;

    public m1(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent adLandingHBCardComponent, java.lang.String str, android.widget.ImageView imageView) {
        this.f162893d = str;
        this.f162894e = imageView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$6");
        android.graphics.Bitmap avatarByUserName = com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().getAvatarByUserName(this.f162893d, false);
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.l1(this, avatarByUserName));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$6");
    }
}
