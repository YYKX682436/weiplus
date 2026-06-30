package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class LoadingMoreView extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f166324d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f166325e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.LinearLayout f166326f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.EndMaskView f166327g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.animation.Animation f166328h;

    public LoadingMoreView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f166328h = new android.view.animation.RotateAnimation(0.0f, 359.0f, 1, 0.5f, 1, 0.5f);
        this.f166324d = context;
        a();
    }

    public final void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.LoadingMoreView");
        android.view.View inflate = android.view.LayoutInflater.from(this.f166324d).inflate(com.tencent.mm.R.layout.csv, (android.view.ViewGroup) this, true);
        this.f166325e = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.f482881qn);
        this.f166326f = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.im9);
        this.f166327g = (com.tencent.mm.ui.EndMaskView) inflate.findViewById(com.tencent.mm.R.id.qij);
        this.f166326f.setVisibility(0);
        this.f166327g.setVisibility(8);
        android.view.animation.Animation animation = this.f166328h;
        animation.setDuration(1000L);
        animation.setRepeatCount(-1);
        animation.setInterpolator(new android.view.animation.LinearInterpolator());
        this.f166325e.startAnimation(animation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.LoadingMoreView");
    }

    public void b(int i17, java.lang.String tipsText) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onIsRecent", "com.tencent.mm.plugin.sns.ui.LoadingMoreView");
        this.f166326f.setVisibility(8);
        if (com.tencent.mm.sdk.platformtools.t8.K0(tipsText)) {
            this.f166327g.setVisibility(0);
            this.f166327g.b();
        } else {
            this.f166327g.setVisibility(0);
            com.tencent.mm.ui.EndMaskView endMaskView = this.f166327g;
            endMaskView.getClass();
            kotlin.jvm.internal.o.g(tipsText, "tipsText");
            android.widget.TextView textView = endMaskView.f196645d;
            textView.setText(tipsText);
            textView.setVisibility(0);
            endMaskView.f196647f.setVisibility(8);
            endMaskView.f196646e.setVisibility(8);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onIsRecent", "com.tencent.mm.plugin.sns.ui.LoadingMoreView");
    }

    public void c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startLoadingAnimation", "com.tencent.mm.plugin.sns.ui.LoadingMoreView");
        android.view.animation.Animation animation = this.f166328h;
        animation.cancel();
        animation.reset();
        this.f166325e.startAnimation(animation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startLoadingAnimation", "com.tencent.mm.plugin.sns.ui.LoadingMoreView");
    }

    public LoadingMoreView(android.content.Context context) {
        super(context);
        this.f166328h = new android.view.animation.RotateAnimation(0.0f, 359.0f, 1, 0.5f, 1, 0.5f);
        this.f166324d = context;
        a();
    }
}
