package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes14.dex */
public class AsyncMaskImageView extends android.widget.ImageView {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f166213h = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f166214d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Runnable f166215e;

    /* renamed from: f, reason: collision with root package name */
    public final int f166216f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f166217g;

    public AsyncMaskImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f166216f = 90;
        this.f166217g = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.AsyncMaskImageView");
        this.f166214d = new com.tencent.mm.sdk.platformtools.n3();
        this.f166215e = new com.tencent.mm.plugin.sns.ui.s0(this);
        super.setOnTouchListener(new com.tencent.mm.plugin.sns.ui.t0(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.AsyncMaskImageView");
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.ui.AsyncMaskImageView");
        super.onAttachedToWindow();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.ui.AsyncMaskImageView");
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.AsyncMaskImageView");
        super.onDetachedFromWindow();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.AsyncMaskImageView");
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDraw", "com.tencent.mm.plugin.sns.ui.AsyncMaskImageView");
        super.onDraw(canvas);
        if (isPressed()) {
            canvas.drawARGB(this.f166216f, 0, 0, 0);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDraw", "com.tencent.mm.plugin.sns.ui.AsyncMaskImageView");
    }

    @Override // android.view.View
    @java.lang.Deprecated
    public void setOnTouchListener(android.view.View.OnTouchListener onTouchListener) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnTouchListener", "com.tencent.mm.plugin.sns.ui.AsyncMaskImageView");
        iz5.a.g(null, false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnTouchListener", "com.tencent.mm.plugin.sns.ui.AsyncMaskImageView");
    }

    public void settouchEnable(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("settouchEnable", "com.tencent.mm.plugin.sns.ui.AsyncMaskImageView");
        this.f166217g = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("settouchEnable", "com.tencent.mm.plugin.sns.ui.AsyncMaskImageView");
    }
}
