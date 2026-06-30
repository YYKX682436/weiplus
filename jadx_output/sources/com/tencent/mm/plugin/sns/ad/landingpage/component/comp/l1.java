package com.tencent.mm.plugin.sns.ad.landingpage.component.comp;

/* loaded from: classes3.dex */
public class l1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f162878d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.component.comp.m1 f162879e;

    public l1(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.m1 m1Var, android.graphics.Bitmap bitmap) {
        this.f162879e = m1Var;
        this.f162878d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$6$1");
        android.graphics.Bitmap bitmap = this.f162878d;
        if (bitmap != null && !bitmap.isRecycled()) {
            com.tencent.mm.plugin.sns.ad.landingpage.component.comp.m1 m1Var = this.f162879e;
            m1Var.f162894e.setImageBitmap(bitmap);
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(m1Var.f162894e, "alpha", 0.5f, 1.0f);
            ofFloat.setDuration(200L);
            ofFloat.start();
            com.tencent.mars.xlog.Log.i("AdLandingHBCardComponent", "loadAvatarByUserName end, userName=" + m1Var.f162893d + ", w=" + bitmap.getWidth() + ", h=" + bitmap.getHeight());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$6$1");
    }
}
