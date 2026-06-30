package com.tencent.mm.plugin.sns.ad.widget.dragad;

/* loaded from: classes2.dex */
public class AdLinearLayout extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.FrameLayout f163575d;

    public AdLinearLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLayout", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdLinearLayout");
        super.onLayout(z17, i17, i18, i19, i27);
        android.widget.FrameLayout frameLayout = this.f163575d;
        if (frameLayout != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getParentPaddingLeft", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdLinearLayout");
            int i28 = 0;
            for (android.view.ViewParent parent = frameLayout.getParent(); parent instanceof android.view.View; parent = parent.getParent()) {
                i28 += ((android.view.View) parent).getPaddingLeft();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getParentPaddingLeft", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdLinearLayout");
            android.widget.FrameLayout frameLayout2 = this.f163575d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getParentPaddingRight", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdLinearLayout");
            int i29 = 0;
            for (android.view.ViewParent parent2 = frameLayout2.getParent(); parent2 instanceof android.view.View; parent2 = parent2.getParent()) {
                i29 += ((android.view.View) parent2).getPaddingRight();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getParentPaddingRight", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdLinearLayout");
            int i37 = this.f163575d.getLayoutParams().height;
            if (i37 <= 0) {
                i37 = getHeight();
            }
            this.f163575d.layout(-i28, 0, getWidth() + i29, i37);
            com.tencent.mars.xlog.Log.i("AdLinearLayout", "w=" + getWidth() + ",h=" + getHeight() + ", container.w=" + this.f163575d.getWidth() + ", container.h=" + this.f163575d.getHeight() + ", paddingLeft=" + i28 + ", paddingRight=" + i29);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLayout", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdLinearLayout");
    }

    public void setAdFullFrameContainer(android.widget.FrameLayout frameLayout) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAdFullFrameContainer", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdLinearLayout");
        this.f163575d = frameLayout;
        addView(frameLayout, new android.widget.FrameLayout.LayoutParams(0, 0));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAdFullFrameContainer", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdLinearLayout");
    }

    public AdLinearLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
