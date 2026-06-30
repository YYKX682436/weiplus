package com.tencent.mm.plugin.sns.ui.widget.ad;

/* loaded from: classes4.dex */
public class AdRoundedCornerFrameLayout extends com.tencent.mm.ui.widget.RoundedCornerFrameLayout {

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f170928g;

    /* renamed from: h, reason: collision with root package name */
    public int f170929h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f170930i;

    public AdRoundedCornerFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f170928g = null;
        this.f170929h = 0;
        this.f170930i = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.widget.ad.AdRoundedCornerFrameLayout");
        android.view.ViewConfiguration.get(context).getScaledTouchSlop();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.widget.ad.AdRoundedCornerFrameLayout");
    }

    public void c(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsAdInfo", "com.tencent.mm.plugin.sns.ui.widget.ad.AdRoundedCornerFrameLayout");
        this.f170928g = snsInfo;
        this.f170929h = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsAdInfo", "com.tencent.mm.plugin.sns.ui.widget.ad.AdRoundedCornerFrameLayout");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dispatchTouchEvent", "com.tencent.mm.plugin.sns.ui.widget.ad.AdRoundedCornerFrameLayout");
        if (motionEvent.getAction() == 0 && this.f170930i) {
            int width = getWidth();
            int height = getHeight();
            int x17 = (int) motionEvent.getX();
            int y17 = (int) motionEvent.getY();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportClickCoordinate", "com.tencent.mm.plugin.sns.ui.widget.ad.AdRoundedCornerFrameLayout");
            com.tencent.mars.xlog.Log.i("AdRoundedCornerFrameLayout", "onDown, w=" + width + ", h=" + height + ", x=" + x17 + ", y=" + y17);
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f170928g;
            int i17 = this.f170929h;
            if (snsInfo == null) {
                com.tencent.mars.xlog.Log.e("AdRoundedCornerFrameLayout", "reportClickCoordinate, snsInfo==null, source=" + i17);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportClickCoordinate", "com.tencent.mm.plugin.sns.ui.widget.ad.AdRoundedCornerFrameLayout");
            } else {
                ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.sns.ui.widget.ad.w0(this, width, height, x17, y17, i17, snsInfo));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportClickCoordinate", "com.tencent.mm.plugin.sns.ui.widget.ad.AdRoundedCornerFrameLayout");
            }
        }
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dispatchTouchEvent", "com.tencent.mm.plugin.sns.ui.widget.ad.AdRoundedCornerFrameLayout");
        return dispatchTouchEvent;
    }

    public void setIsReportTouchDownPositon(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setIsReportTouchDownPositon", "com.tencent.mm.plugin.sns.ui.widget.ad.AdRoundedCornerFrameLayout");
        this.f170930i = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setIsReportTouchDownPositon", "com.tencent.mm.plugin.sns.ui.widget.ad.AdRoundedCornerFrameLayout");
    }

    public AdRoundedCornerFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f170928g = null;
        this.f170929h = 0;
        this.f170930i = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.widget.ad.AdRoundedCornerFrameLayout");
        android.view.ViewConfiguration.get(context).getScaledTouchSlop();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.widget.ad.AdRoundedCornerFrameLayout");
    }
}
