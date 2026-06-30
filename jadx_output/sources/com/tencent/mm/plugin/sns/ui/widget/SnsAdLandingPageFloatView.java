package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes4.dex */
public class SnsAdLandingPageFloatView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f170800d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f170801e;

    /* renamed from: f, reason: collision with root package name */
    public ab4.b0 f170802f;

    /* renamed from: g, reason: collision with root package name */
    public za4.g0 f170803g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 f170804h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.List f170805i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Map f170806m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f170807n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f170808o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f170809p;

    /* renamed from: q, reason: collision with root package name */
    public final android.animation.AnimatorSet f170810q;

    /* renamed from: r, reason: collision with root package name */
    public final android.animation.ValueAnimator f170811r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f170812s;

    public SnsAdLandingPageFloatView(android.content.Context context) {
        super(context, null);
        this.f170806m = new java.util.HashMap();
        this.f170810q = new android.animation.AnimatorSet();
        this.f170811r = android.animation.ValueAnimator.ofFloat(1.0f, 0.4f).setDuration(100L);
        this.f170812s = true;
    }

    public static /* synthetic */ android.view.View a(com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView snsAdLandingPageFloatView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
        android.view.View view = snsAdLandingPageFloatView.f170809p;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
        return view;
    }

    public static /* synthetic */ boolean b(com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView snsAdLandingPageFloatView, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
        snsAdLandingPageFloatView.f170807n = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
        return z17;
    }

    public static /* synthetic */ java.lang.String c(com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView snsAdLandingPageFloatView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
        java.lang.String str = snsAdLandingPageFloatView.f170800d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
        return str;
    }

    public static /* synthetic */ com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 d(com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView snsAdLandingPageFloatView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 a2Var = snsAdLandingPageFloatView.f170804h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
        return a2Var;
    }

    public void e(android.os.Bundle bundle, za4.g0 g0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
        if (bundle == null || g0Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
            return;
        }
        try {
            java.util.Map map = g0Var.f471084d;
            this.f170800d = bundle.getString("sns_float_component_id");
            this.f170801e = bundle.getString("sns_landing_pages_canvas_ext");
            za4.g0 g0Var2 = new za4.g0();
            this.f170803g = g0Var2;
            g0Var2.f471081a = g0Var.f471081a;
            boolean z17 = true;
            g0Var2.f471085e = true;
            g0Var2.f471086f = 0;
            if (a84.b0.f(map)) {
                ab4.d0 d0Var = (ab4.d0) ((java.util.LinkedHashMap) map).get(this.f170800d);
                if (d0Var != null && za4.z0.r(d0Var.f2827q)) {
                    ab4.b0 b0Var = (ab4.b0) d0Var;
                    this.f170802f = b0Var;
                    this.f170803g.f471083c.add(b0Var);
                    this.f170803g.f471084d.putAll(map);
                    if (this.f170802f.I >= 1) {
                        z17 = false;
                    }
                    this.f170812s = z17;
                }
            }
            f();
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsAdLandingPageFloatView", "the init from helper has something wrong!!");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
    }

    public final void f() {
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
        if (this.f170803g != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initPage", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
            ab4.b0 b0Var = this.f170802f;
            if (b0Var != null) {
                if (b0Var.K > 0) {
                    setBackground(null);
                }
                try {
                    i17 = ca4.n0.e(this.f170803g.f471081a, 0);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SnsAdLandingPageFloatView", "parseColor exp=" + e17.toString() + ", colorStr=" + this.f170803g.f471081a);
                    i17 = 0;
                }
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 a17 = com.tencent.mm.plugin.sns.ui.ta.a(getContext(), this.f170802f, this, i17);
                this.f170804h = a17;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(nd1.s0.NAME, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBaseComponent");
                a17.f165051f = i17;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(nd1.s0.NAME, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBaseComponent");
                android.view.View x17 = this.f170804h.x();
                this.f170809p = x17;
                addView(x17);
                this.f170804h.g();
                if (this.f170802f.f2814J <= 0) {
                    setOnTouchListener(new com.tencent.mm.plugin.sns.ui.widget.o0(this));
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initPage", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSomeData", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
            if (this.f170803g != null && !com.tencent.mm.sdk.platformtools.t8.K0(this.f170801e)) {
                java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(this.f170801e, "adCardItemList", null);
                int i18 = 0;
                while (true) {
                    java.lang.String str = ".adCardItemList.cardItem";
                    if (i18 > 0) {
                        str = ".adCardItemList.cardItem" + i18;
                    }
                    if (!d17.containsKey(str + ".cardTpId")) {
                        break;
                    }
                    java.lang.String str2 = (java.lang.String) d17.get(str + ".cardTpId");
                    if (str2 == null) {
                        str2 = "";
                    }
                    java.lang.String str3 = (java.lang.String) d17.get(str + ".cardExt");
                    java.lang.String str4 = str3 != null ? str3 : "";
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(str2) && !com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
                        ((java.util.HashMap) this.f170806m).put(str2, str4);
                    }
                    i18++;
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSomeData", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
            android.animation.ValueAnimator duration = android.animation.ValueAnimator.ofFloat(0.4f, 0.96f).setDuration(getAnimationTimeFactor() * 200);
            duration.setInterpolator(new android.view.animation.OvershootInterpolator());
            android.animation.ValueAnimator duration2 = android.animation.ValueAnimator.ofFloat(0.96f, 1.0f).setDuration(getAnimationTimeFactor() * 100);
            duration.addUpdateListener(new com.tencent.mm.plugin.sns.ui.widget.j0(this));
            duration2.addUpdateListener(new com.tencent.mm.plugin.sns.ui.widget.k0(this));
            android.animation.Animator[] animatorArr = {duration, duration2};
            android.animation.AnimatorSet animatorSet = this.f170810q;
            animatorSet.playSequentially(animatorArr);
            animatorSet.addListener(new com.tencent.mm.plugin.sns.ui.widget.l0(this));
            com.tencent.mm.plugin.sns.ui.widget.m0 m0Var = new com.tencent.mm.plugin.sns.ui.widget.m0(this);
            android.animation.ValueAnimator valueAnimator = this.f170811r;
            valueAnimator.addUpdateListener(m0Var);
            valueAnimator.addListener(new com.tencent.mm.plugin.sns.ui.widget.n0(this));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
    }

    public void g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
        if (this.f170803g != null) {
            this.f170804h.M();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
    }

    public java.util.List<com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2> getAllComp() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAllComp", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
        java.util.List<com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2> list = this.f170805i;
        if (list != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAllComp", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
            return list;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f170805i = arrayList;
        arrayList.add(this.f170804h);
        za4.z0.e(this.f170805i);
        java.util.List<com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2> list2 = this.f170805i;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAllComp", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
        return list2;
    }

    public long getAnimationTimeFactor() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAnimationTimeFactor", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
        long j17 = this.f170812s ? 1L : 0L;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAnimationTimeFactor", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
        return j17;
    }

    public SnsAdLandingPageFloatView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, -1);
        this.f170806m = new java.util.HashMap();
        this.f170810q = new android.animation.AnimatorSet();
        this.f170811r = android.animation.ValueAnimator.ofFloat(1.0f, 0.4f).setDuration(100L);
        this.f170812s = true;
    }

    public SnsAdLandingPageFloatView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17, -1);
        this.f170806m = new java.util.HashMap();
        this.f170810q = new android.animation.AnimatorSet();
        this.f170811r = android.animation.ValueAnimator.ofFloat(1.0f, 0.4f).setDuration(100L);
        this.f170812s = true;
    }
}
