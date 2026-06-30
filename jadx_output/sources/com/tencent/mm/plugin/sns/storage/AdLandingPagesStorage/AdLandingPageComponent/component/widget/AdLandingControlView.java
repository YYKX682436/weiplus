package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget;

/* loaded from: classes12.dex */
public class AdLandingControlView extends com.tencent.mm.ui.base.MMPageControlView {
    public AdLandingControlView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.tencent.mm.ui.base.MMPageControlView
    public void a(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("generatePageControl", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingControlView");
        removeAllViews();
        int i18 = this.f197514e;
        if (i17 >= i18) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("generatePageControl", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingControlView");
            return;
        }
        for (int i19 = 0; i19 < i18; i19++) {
            this.f197516g = null;
            java.util.Map map = this.f197515f;
            if (i17 == i19) {
                if (((java.util.HashMap) map).size() > i19) {
                    this.f197516g = (android.widget.ImageView) ((java.util.HashMap) map).get(java.lang.Integer.valueOf(i19));
                }
                if (this.f197516g == null) {
                    this.f197516g = (android.widget.ImageView) android.view.View.inflate(this.f197513d, this.f197517h, null).findViewById(com.tencent.mm.R.id.jmn);
                    ((java.util.HashMap) map).put(java.lang.Integer.valueOf(i19), this.f197516g);
                }
                this.f197516g.setSelected(true);
            } else {
                if (((java.util.HashMap) map).size() > i19) {
                    this.f197516g = (android.widget.ImageView) ((java.util.HashMap) map).get(java.lang.Integer.valueOf(i19));
                }
                if (this.f197516g == null) {
                    this.f197516g = (android.widget.ImageView) android.view.View.inflate(this.f197513d, this.f197517h, null).findViewById(com.tencent.mm.R.id.jmn);
                    ((java.util.HashMap) map).put(java.lang.Integer.valueOf(i19), this.f197516g);
                }
                this.f197516g.setSelected(false);
            }
            addView(this.f197516g);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("generatePageControl", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingControlView");
    }
}
