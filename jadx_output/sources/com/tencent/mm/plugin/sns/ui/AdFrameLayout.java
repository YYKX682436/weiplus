package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class AdFrameLayout extends com.tencent.mm.ui.base.MMFrameLayout {

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.b f166186e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.c f166187f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.FrameLayout f166188g;

    public AdFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addView", "com.tencent.mm.plugin.sns.ui.AdFrameLayout");
        super.addView(view);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addView", "com.tencent.mm.plugin.sns.ui.AdFrameLayout");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.c cVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dispatchTouchEvent", "com.tencent.mm.plugin.sns.ui.AdFrameLayout");
        if (motionEvent.getAction() == 0 && (cVar = this.f166187f) != null) {
            com.tencent.mm.plugin.sns.ui.item.a aVar = (com.tencent.mm.plugin.sns.ui.item.a) cVar;
            aVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDispatchEvent", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$10");
            java.lang.String snsId = aVar.f169320a.getSnsId();
            com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder = aVar.f169321b;
            android.view.ViewGroup viewGroup = baseViewHolder.f169305x0;
            com.tencent.mm.plugin.sns.ui.AsyncTextView asyncTextView = baseViewHolder.f169276j;
            android.widget.TextView textView = baseViewHolder.D;
            l44.i iVar = l44.i.f316168a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("recordAdClickCoordinate", "com.tencent.mm.plugin.sns.ad.helper.AdClickCoordinateReportHelper");
            if (snsId == null || viewGroup == null || asyncTextView == null || textView == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("recordAdClickCoordinate", "com.tencent.mm.plugin.sns.ad.helper.AdClickCoordinateReportHelper");
            } else {
                viewGroup.getContext();
                com.tencent.mars.xlog.Log.i("AdClickCoordinateHelper", "AdFrameLayout dispatch event, snsId = " + snsId + ", eventX = " + motionEvent.getX() + ", eventY = " + motionEvent.getY() + ", eventRawX = " + motionEvent.getRawX() + ", eventRawY = " + motionEvent.getRawY());
                r45.r2 r2Var = new r45.r2();
                r2Var.f384451d = motionEvent.getX();
                r2Var.f384452e = motionEvent.getY();
                r2Var.f384453f = motionEvent.getRawX();
                r2Var.f384454g = motionEvent.getRawY();
                r2Var.f384457m = l44.i.f316169b;
                r2Var.f384458n = l44.i.f316170c;
                r2Var.f384455h = (float) viewGroup.getWidth();
                l44.i iVar2 = l44.i.f316168a;
                r2Var.f384456i = (iVar2.a(textView) + ((float) textView.getHeight())) - iVar2.a(asyncTextView);
                l44.i.f316171d.put(snsId, r2Var);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("recordAdClickCoordinate", "com.tencent.mm.plugin.sns.ad.helper.AdClickCoordinateReportHelper");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDispatchEvent", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$10");
        }
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dispatchTouchEvent", "com.tencent.mm.plugin.sns.ui.AdFrameLayout");
        return dispatchTouchEvent;
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("draw", "com.tencent.mm.plugin.sns.ui.AdFrameLayout");
        super.draw(canvas);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("draw", "com.tencent.mm.plugin.sns.ui.AdFrameLayout");
    }

    public android.widget.FrameLayout getAdFullFrameAnimContainer() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdFullFrameAnimContainer", "com.tencent.mm.plugin.sns.ui.AdFrameLayout");
        if (this.f166188g == null) {
            android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(getContext());
            this.f166188g = frameLayout;
            addView(frameLayout);
        }
        android.widget.FrameLayout frameLayout2 = this.f166188g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdFullFrameAnimContainer", "com.tencent.mm.plugin.sns.ui.AdFrameLayout");
        return frameLayout2;
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.AdFrameLayout");
        super.onConfigurationChanged(configuration);
        com.tencent.mm.plugin.sns.ui.b bVar = this.f166186e;
        if (bVar != null) {
            q74.d0 d0Var = (q74.d0) bVar;
            d0Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("notifyConfigurationChanged", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameLogic");
            com.tencent.mars.xlog.Log.i("SlideFullCardBreakFrameLogic", "notifyConfigurationChanged, calcProductCompBreakFrameLayoutParams");
            d0Var.f360443d.h();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notifyConfigurationChanged", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameLogic");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.AdFrameLayout");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.AdFrameLayout");
        super.onDetachedFromWindow();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.AdFrameLayout");
    }

    @Override // com.tencent.mm.ui.base.MMFrameLayout, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLayout", "com.tencent.mm.plugin.sns.ui.AdFrameLayout");
        java.lang.System.currentTimeMillis();
        super.onLayout(z17, i17, i18, i19, i27);
        android.widget.FrameLayout frameLayout = this.f166188g;
        if (frameLayout != null) {
            frameLayout.layout(0, 0, getWidth(), getHeight());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLayout", "com.tencent.mm.plugin.sns.ui.AdFrameLayout");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ui.AdFrameLayout");
        super.onMeasure(i17, i18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ui.AdFrameLayout");
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSizeChanged", "com.tencent.mm.plugin.sns.ui.AdFrameLayout");
        super.onSizeChanged(i17, i18, i19, i27);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSizeChanged", "com.tencent.mm.plugin.sns.ui.AdFrameLayout");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeView", "com.tencent.mm.plugin.sns.ui.AdFrameLayout");
        super.removeView(view);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeView", "com.tencent.mm.plugin.sns.ui.AdFrameLayout");
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("requestLayout", "com.tencent.mm.plugin.sns.ui.AdFrameLayout");
        super.requestLayout();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("requestLayout", "com.tencent.mm.plugin.sns.ui.AdFrameLayout");
    }

    public void setNotifyConfigurationChangedCallback(com.tencent.mm.plugin.sns.ui.b bVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setNotifyConfigurationChangedCallback", "com.tencent.mm.plugin.sns.ui.AdFrameLayout");
        this.f166186e = bVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setNotifyConfigurationChangedCallback", "com.tencent.mm.plugin.sns.ui.AdFrameLayout");
    }

    public void setOnDispatchTouchEventListener(com.tencent.mm.plugin.sns.ui.c cVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnDispatchTouchEventListener", "com.tencent.mm.plugin.sns.ui.AdFrameLayout");
        this.f166187f = cVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnDispatchTouchEventListener", "com.tencent.mm.plugin.sns.ui.AdFrameLayout");
    }
}
