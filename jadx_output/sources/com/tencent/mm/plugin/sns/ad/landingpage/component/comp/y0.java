package com.tencent.mm.plugin.sns.ad.landingpage.component.comp;

/* loaded from: classes4.dex */
public class y0 implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f162985d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f1 f162986e;

    public y0(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f1 f1Var, android.view.View view) {
        this.f162986e = f1Var;
        this.f162985d = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        int height;
        int width;
        int width2;
        int height2;
        com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f1 f1Var = this.f162986e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLayoutChange", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent$4");
        try {
            height = view.getHeight();
            width = view.getWidth();
            width2 = f1Var.f162806z.getWidth();
            height2 = f1Var.f162806z.getHeight();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Sns.AdLandingGeneralVideoComponent", "onLayoutChange, exp=" + e17.toString());
        }
        if (width > 1 && height > 1 && width2 != 0 && height2 != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Sns.AdLandingGeneralVideoComponent", "onLayoutChange, video.w=" + view.getWidth() + ", h=" + view.getHeight() + ", container.w=" + width2 + ", h=" + height2 + ", container.padding=" + ca4.m0.K(f1Var.f162806z));
            android.widget.ImageView thumbView = f1Var.A.getThumbView();
            if (thumbView != null) {
                android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(width, height);
                layoutParams.addRule(13);
                thumbView.setLayoutParams(layoutParams);
            }
            android.view.View view2 = this.f162985d;
            if (height == height2) {
                view2.removeOnLayoutChangeListener(this);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLayoutChange", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent$4");
                return;
            }
            if (height >= width && height2 >= width2 && java.lang.Math.abs(height - height2) <= 2) {
                android.view.ViewGroup.LayoutParams layoutParams2 = f1Var.f162806z.getLayoutParams();
                layoutParams2.height = height;
                f1Var.f162806z.setLayoutParams(layoutParams2);
                com.tencent.mars.xlog.Log.i("MicroMsg.Sns.AdLandingGeneralVideoComponent", "onLayoutChange, reset VideoContainer.height");
            }
            view2.removeOnLayoutChangeListener(this);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLayoutChange", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent$4");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLayoutChange", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent$4");
    }
}
