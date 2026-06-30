package com.tencent.mm.plugin.sns.ad.landingpage.component.comp;

/* loaded from: classes4.dex */
public class d4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f162789d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.component.comp.e4 f162790e;

    public d4(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.e4 e4Var, android.graphics.Bitmap bitmap) {
        this.f162790e = e4Var;
        this.f162789d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent$3$1");
        com.tencent.mm.plugin.sns.ad.landingpage.component.comp.e4 e4Var = this.f162790e;
        android.graphics.Bitmap bitmap = this.f162789d;
        if (bitmap == null || bitmap.isRecycled()) {
            com.tencent.mm.plugin.sns.ad.landingpage.component.comp.g4 g4Var = e4Var.f162796f;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
            boolean z17 = g4Var.H;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
            com.tencent.mm.plugin.sns.ad.landingpage.component.comp.g4 g4Var2 = e4Var.f162796f;
            java.lang.String str = e4Var.f162794d;
            if (z17) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
                java.util.Map map = g4Var2.G;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
                ((java.util.HashMap) map).put(str, e4Var.f162795e);
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loadAvatarByUserName end, userName=");
            sb6.append(str);
            sb6.append(", bmp=null, isNeedRetry=");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
            boolean z18 = g4Var2.H;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
            sb6.append(z18);
            com.tencent.mars.xlog.Log.w("AdLandingSocialCardComponent", sb6.toString());
        } else {
            e4Var.f162795e.setImageBitmap(bitmap);
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(e4Var.f162795e, "alpha", 0.5f, 1.0f);
            ofFloat.setDuration(200L);
            ofFloat.start();
            com.tencent.mars.xlog.Log.i("AdLandingSocialCardComponent", "loadAvatarByUserName end, userName=" + e4Var.f162794d + ", w=" + bitmap.getWidth() + ", h=" + bitmap.getHeight());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent$3$1");
    }
}
