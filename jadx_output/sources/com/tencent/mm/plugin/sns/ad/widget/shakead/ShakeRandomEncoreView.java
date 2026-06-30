package com.tencent.mm.plugin.sns.ad.widget.shakead;

/* loaded from: classes4.dex */
public class ShakeRandomEncoreView extends android.widget.LinearLayout implements androidx.lifecycle.x {

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f163849d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f163850e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f163851f;

    /* renamed from: g, reason: collision with root package name */
    public f54.d f163852g;

    /* renamed from: h, reason: collision with root package name */
    public a94.b0 f163853h;

    /* renamed from: i, reason: collision with root package name */
    public a94.x f163854i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f163855m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f163856n;

    public ShakeRandomEncoreView(android.content.Context context) {
        super(context);
        this.f163855m = false;
        this.f163856n = false;
        a(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(android.content.Context context) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView");
        setOrientation(0);
        setGravity(16);
        this.f163849d = context;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView");
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.cq9, this);
        this.f163850e = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.dga);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.dgb);
        this.f163851f = textView;
        ca4.m0.x0(textView, com.tencent.mm.R.dimen.a_h);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView");
        if (context instanceof androidx.lifecycle.y) {
            ((androidx.lifecycle.y) context).mo133getLifecycle().a(this);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView");
    }

    public void b() {
        f54.d dVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startListenShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView");
        if (this.f163855m || this.f163856n) {
            com.tencent.mars.xlog.Log.w("ShakeRandomEncoreView", "startListenShake, isUIPaused=" + this.f163856n + ", isDestroyed=" + this.f163855m);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startListenShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView");
            return;
        }
        a94.b0 b0Var = this.f163853h;
        if (b0Var == null) {
            com.tencent.mars.xlog.Log.w("ShakeRandomEncoreView", "startListenShake, shakeSensor==null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startListenShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView");
            return;
        }
        if (!b0Var.c()) {
            com.tencent.mars.xlog.Log.e("ShakeRandomEncoreView", "sensor not support");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1572, 4);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startListenShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView");
            return;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1572, 3);
        if (!this.f163853h.b() && (dVar = this.f163852g) != null) {
            int i17 = dVar.f259706d;
            int i18 = dVar.f259707e;
            if (i17 < 8) {
                i17 = 8;
            }
            if (i18 < 10) {
                i18 = 10;
            }
            com.tencent.mars.xlog.Log.i("ShakeRandomEncoreView", "startListenShake， min=" + i17 + ", max=" + i18);
            this.f163853h.d(new a94.z(this, i17, i18));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startListenShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView");
    }

    public void c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stopListenShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView");
        a94.b0 b0Var = this.f163853h;
        if (b0Var != null) {
            if (b0Var.b()) {
                com.tencent.mars.xlog.Log.i("ShakeRandomEncoreView", "stopListenShake");
            }
            this.f163853h.e();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stopListenShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView");
        super.onDetachedFromWindow();
        com.tencent.mars.xlog.Log.i("ShakeRandomEncoreView", "onDetachedFromWindow");
        this.f163855m = true;
        c();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView");
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_PAUSE)
    public void onUIPause() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView");
        com.tencent.mars.xlog.Log.i("ShakeRandomEncoreView", "onUIPause");
        this.f163856n = true;
        c();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView");
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_RESUME)
    public void onUIResume() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUIResume", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView");
        com.tencent.mars.xlog.Log.i("ShakeRandomEncoreView", "onUIResume");
        this.f163856n = false;
        b();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUIResume", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView");
    }

    public void setOnShakeListener(a94.x xVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnShakeListener", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView");
        this.f163854i = xVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnShakeListener", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView");
    }

    public ShakeRandomEncoreView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f163855m = false;
        this.f163856n = false;
        a(context);
    }
}
