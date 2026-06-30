package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class MaskLinearLayout extends android.widget.LinearLayout {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f166378h = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f166379d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Runnable f166380e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f166381f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f166382g;

    public MaskLinearLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f166381f = false;
        this.f166382g = new java.util.LinkedList();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.MaskLinearLayout");
        this.f166379d = new com.tencent.mm.sdk.platformtools.n3();
        this.f166380e = new com.tencent.mm.plugin.sns.ui.u5(this);
        super.setOnTouchListener(new com.tencent.mm.plugin.sns.ui.v5(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.MaskLinearLayout");
    }

    public static void a(com.tencent.mm.plugin.sns.ui.MaskLinearLayout maskLinearLayout) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout");
        maskLinearLayout.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateS", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout");
        if (maskLinearLayout.isPressed()) {
            maskLinearLayout.setBackgroundColor(maskLinearLayout.getResources().getColor(com.tencent.mm.R.color.FG_3));
        } else {
            maskLinearLayout.setBackgroundResource(0);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateS", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout");
    }

    public void b(com.tencent.mm.plugin.sns.ui.MaskImageView maskImageView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addChildId", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout");
        ((java.util.LinkedList) this.f166382g).add(maskImageView);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addChildId", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout");
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDraw", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout");
        super.onDraw(canvas);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDraw", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout");
    }

    @Override // android.view.View
    @java.lang.Deprecated
    public void setOnTouchListener(android.view.View.OnTouchListener onTouchListener) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnTouchListener", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout");
        iz5.a.g(null, false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnTouchListener", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout");
    }

    public void settouchEnable(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("settouchEnable", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout");
        this.f166381f = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("settouchEnable", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout");
    }
}
