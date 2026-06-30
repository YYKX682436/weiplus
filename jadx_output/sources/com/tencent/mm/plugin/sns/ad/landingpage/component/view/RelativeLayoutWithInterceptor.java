package com.tencent.mm.plugin.sns.ad.landingpage.component.view;

/* loaded from: classes.dex */
public class RelativeLayoutWithInterceptor extends android.widget.RelativeLayout {
    public RelativeLayoutWithInterceptor(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.RelativeLayoutWithInterceptor");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.RelativeLayoutWithInterceptor");
        return true;
    }

    public void setEventInterceptor(g54.x xVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setEventInterceptor", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.RelativeLayoutWithInterceptor");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setEventInterceptor", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.RelativeLayoutWithInterceptor");
    }

    public RelativeLayoutWithInterceptor(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
