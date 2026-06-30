package com.tencent.mm.plugin.sns.ad.landingpage.component.comp;

/* loaded from: classes4.dex */
public class w0 implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f1 f162970d;

    public w0(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f1 f1Var) {
        this.f162970d = f1Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLayoutChange", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent$2");
        com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f1 f1Var = this.f162970d;
        if (f1Var.A == null || view == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLayoutChange", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent$2");
            return;
        }
        int height = view.getHeight();
        int width = view.getWidth();
        if (width <= 1 || height <= 1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLayoutChange", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent$2");
            return;
        }
        android.widget.ImageView thumbView = f1Var.A.getThumbView();
        if (thumbView != null) {
            android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(width, height);
            layoutParams.addRule(13);
            thumbView.setLayoutParams(layoutParams);
            thumbView.removeOnLayoutChangeListener(this);
            com.tencent.mars.xlog.Log.i("MicroMsg.Sns.AdLandingGeneralVideoComponent", "thumb onLayout change, videoW is " + width + ", videoH is " + height);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLayoutChange", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent$2");
    }
}
