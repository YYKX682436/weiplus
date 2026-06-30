package com.tencent.mm.plugin.sns.ad.widget.living;

/* loaded from: classes4.dex */
public class FinderLivingAnimWrapper extends android.widget.FrameLayout {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f163653o = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f163654d;

    /* renamed from: e, reason: collision with root package name */
    public zy2.y7 f163655e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f163656f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f163657g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Set f163658h;

    /* renamed from: i, reason: collision with root package name */
    public int f163659i;

    /* renamed from: m, reason: collision with root package name */
    public int f163660m;

    /* renamed from: n, reason: collision with root package name */
    public volatile boolean f163661n;

    public FinderLivingAnimWrapper(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f163657g = false;
        this.f163658h = java.util.Collections.synchronizedSet(new java.util.HashSet());
        this.f163661n = false;
        c(context);
    }

    public static void a(com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper finderLivingAnimWrapper, java.util.List list) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
        finderLivingAnimWrapper.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("prepareConfigIconAsyn", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
        if (list != null && list.size() > 0) {
            java.util.Iterator it = list.iterator();
            java.util.ArrayList arrayList = null;
            java.util.ArrayList arrayList2 = null;
            while (it.hasNext()) {
                s34.q0 q0Var = (s34.q0) it.next();
                java.lang.String str = q0Var.iconUrl;
                java.util.Set set = finderLivingAnimWrapper.f163658h;
                if (!set.contains(str)) {
                    android.graphics.Bitmap i17 = za4.t0.i("adId_mm", q0Var.iconUrl);
                    if (i17 != null) {
                        if (arrayList == null) {
                            arrayList = new java.util.ArrayList();
                        }
                        if (arrayList2 == null) {
                            arrayList2 = new java.util.ArrayList();
                        }
                        arrayList.add(i17);
                        arrayList2.add(java.lang.Integer.valueOf(q0Var.f402743a));
                        set.add(q0Var.iconUrl);
                    } else {
                        a84.m.d(q0Var.iconUrl, new com.tencent.mm.plugin.sns.ad.widget.living.e0(finderLivingAnimWrapper, q0Var));
                    }
                }
            }
            if (finderLivingAnimWrapper.f163655e != null && arrayList != null && arrayList.size() > 0 && arrayList2.size() > 0) {
                try {
                    ((com.tencent.mm.plugin.finder.live.widget.FinderLiveConfettiView) finderLivingAnimWrapper.f163655e).b(arrayList, arrayList2);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.e("FinderLivingAnimWrapper", "addCustomBitmapsAndRate, exp=" + th6.toString());
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("prepareConfigIconAsyn", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
    }

    public static boolean e(s34.r0 r0Var, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showLivingAnim", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
        boolean z18 = false;
        if (r0Var == null) {
            com.tencent.mars.xlog.Log.e("FinderLivingAnimWrapper", "showLivingAnim but adLiveInfo is null, isLivingNow is " + z17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showLivingAnim", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
            return false;
        }
        com.tencent.mars.xlog.Log.i("FinderLivingAnimWrapper", "showLivingAnim, isLivingNow=" + z17 + ", showLikeAnimation=" + r0Var.f402752h + ", sdk_int=" + android.os.Build.VERSION.SDK_INT);
        if (z17 && r0Var.f402752h) {
            z18 = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showLivingAnim", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
        return z18;
    }

    public final void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doClear", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
        com.tencent.mars.xlog.Log.i("FinderLivingAnimWrapper", "doClear");
        try {
            zy2.y7 y7Var = this.f163655e;
            if (y7Var != null) {
                ((com.tencent.mm.plugin.finder.live.widget.FinderLiveConfettiView) y7Var).e();
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("FinderLivingAnimWrapper", "doClear, exp=" + android.util.Log.getStackTraceString(th6));
        }
        try {
            this.f163658h.clear();
        } catch (java.lang.Throwable th7) {
            com.tencent.mars.xlog.Log.e("FinderLivingAnimWrapper", "doClear, exp=" + android.util.Log.getStackTraceString(th7));
        }
        this.f163657g = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doClear", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(android.content.Context context) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
        this.f163654d = context;
        this.f163659i = i65.a.b(context, 60);
        this.f163660m = i65.a.b(this.f163654d, 35);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("listenDestroy", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
        try {
            if (context instanceof androidx.lifecycle.y) {
                ((androidx.lifecycle.y) context).mo133getLifecycle().a(new androidx.lifecycle.f() { // from class: com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper.1
                    @Override // androidx.lifecycle.f, androidx.lifecycle.h
                    public void onDestroy(androidx.lifecycle.y yVar) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper$1");
                        com.tencent.mars.xlog.Log.i("FinderLivingAnimWrapper", "onDestroy");
                        com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper finderLivingAnimWrapper = com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper.this;
                        int i17 = com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper.f163653o;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
                        finderLivingAnimWrapper.f163661n = true;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
                        com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper finderLivingAnimWrapper2 = com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper.this;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
                        finderLivingAnimWrapper2.b();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper$1");
                    }
                });
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("FinderLivingAnimWrapper", "listenDestroy, exp=" + e17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("listenDestroy", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1697, 50);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
    }

    public void d(s34.r0 r0Var, java.lang.String str, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAdLiveInfo", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
        try {
            this.f163659i = i17;
            this.f163660m = i18;
            com.tencent.mars.xlog.Log.i("FinderLivingAnimWrapper", "setAdLiveInfo, snsId=" + str + ", hash=" + hashCode());
            if (!android.text.TextUtils.isEmpty(this.f163656f) && !this.f163656f.equals(str)) {
                com.tencent.mars.xlog.Log.w("FinderLivingAnimWrapper", "setAdLiveInfo, snsId changed, old=" + this.f163656f + ", new=" + str);
                b();
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("FinderLivingAnimWrapper", "setAdLiveInfo, exp=" + android.util.Log.getStackTraceString(th6));
        }
        if (r0Var == null) {
            com.tencent.mars.xlog.Log.e("FinderLivingAnimWrapper", "adLiveInfo is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAdLiveInfo", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
            return;
        }
        this.f163656f = str;
        this.f163661n = false;
        if (this.f163655e == null) {
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            vd2.t3 t3Var = vd2.t3.f435921a;
            android.content.Context context = this.f163654d;
            kotlin.jvm.internal.o.g(context, "context");
            ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).getClass();
            com.tencent.mm.plugin.finder.live.widget.FinderLiveConfettiView finderLiveConfettiView = new com.tencent.mm.plugin.finder.live.widget.FinderLiveConfettiView(context);
            this.f163655e = finderLiveConfettiView;
            android.widget.FrameLayout view = finderLiveConfettiView.getView();
            if (view != null) {
                addView(view, new android.widget.FrameLayout.LayoutParams(-1, -1));
            } else {
                com.tencent.mars.xlog.Log.e("FinderLivingAnimWrapper", "mILiveView.getView()==null");
            }
        }
        zy2.y7 y7Var = this.f163655e;
        if (y7Var != null) {
            int i19 = (int) (r0Var.f402753i * 1000.0f);
            if (i19 <= 0) {
                i19 = 600;
            }
            y7Var.setInterval(i19);
            float f17 = r0Var.f402754j;
            if (f17 > 0.0f) {
                this.f163655e.setScale(f17);
            }
        }
        java.util.List<s34.q0> list = r0Var.likeAnimIconList;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("prepareIconAsynAndStart", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
        if (this.f163655e == null) {
            com.tencent.mars.xlog.Log.e("FinderLivingAnimWrapper", "prepareIconAsynAndStart, mILiveView==null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("prepareIconAsynAndStart", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
        } else {
            ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.sns.ad.widget.living.d0(this, list));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("prepareIconAsynAndStart", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAdLiveInfo", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
        super.onDetachedFromWindow();
        com.tencent.mars.xlog.Log.i("FinderLivingAnimWrapper", "onDetachedFromWindow, snsId=" + this.f163656f + ", hash=" + hashCode());
        this.f163661n = true;
        b();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setVisibility", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
        super.setVisibility(i17);
        if (i17 != 0 && this.f163655e != null) {
            com.tencent.mars.xlog.Log.i("FinderLivingAnimWrapper", "setVisibility=" + i17 + ", stopAndDestroy");
            b();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setVisibility", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
    }

    public FinderLivingAnimWrapper(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f163657g = false;
        this.f163658h = java.util.Collections.synchronizedSet(new java.util.HashSet());
        this.f163661n = false;
        c(context);
    }
}
