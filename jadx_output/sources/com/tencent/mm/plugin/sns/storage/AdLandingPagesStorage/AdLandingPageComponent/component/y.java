package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

/* loaded from: classes4.dex */
public class y extends com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 {
    public final android.view.ViewGroup A;
    public com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.o2 B;
    public boolean C;
    public int D;
    public final boolean E;
    public boolean F;
    public final com.tencent.mm.sdk.event.IListener G;
    public final boolean H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f165829J;
    public android.animation.AnimatorSet K;
    public android.animation.AnimatorSet L;
    public final android.os.Handler M;

    /* renamed from: s, reason: collision with root package name */
    public final android.content.Context f165830s;

    /* renamed from: t, reason: collision with root package name */
    public final ab4.j0 f165831t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f165832u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.ImageView f165833v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.TextView f165834w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.TextView f165835x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.FrameLayout f165836y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.ui.widget.RoundedCornerFrameLayout f165837z;

    /* JADX WARN: Multi-variable type inference failed */
    public y(android.content.Context context, ab4.j0 j0Var, android.view.ViewGroup viewGroup) {
        super(context, j0Var, viewGroup);
        this.C = false;
        this.D = 0;
        this.G = null;
        this.H = false;
        this.I = false;
        this.f165829J = false;
        this.K = null;
        this.L = null;
        this.M = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.t(this, android.os.Looper.getMainLooper());
        this.f165830s = context;
        this.A = viewGroup;
        this.f165831t = j0Var;
        this.E = j0Var.f2827q == 141;
        boolean z17 = j0Var.f2826p == 1;
        this.H = z17;
        h();
        k();
        com.tencent.mars.xlog.Log.i("AdLandingFloatBarCompWrapper", "refreshView, cid=" + j0Var.f2817d + ", hash=" + hashCode());
        if ((context instanceof androidx.lifecycle.y) && z17) {
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper$1 adLandingFloatBarCompWrapper$1 = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper$1(this, (androidx.lifecycle.y) context);
            this.G = adLandingFloatBarCompWrapper$1;
            adLandingFloatBarCompWrapper$1.alive();
        }
    }

    public static /* synthetic */ boolean O(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.y yVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        boolean z17 = yVar.I;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        return z17;
    }

    public static /* synthetic */ boolean P(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.y yVar, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$202", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        yVar.f165829J = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$202", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        return z17;
    }

    public static /* synthetic */ boolean R(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.y yVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        boolean z17 = yVar.F;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        return z17;
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public boolean D(org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        ab4.j0 j0Var = this.f165831t;
        if (j0Var == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("kvReport, mFloatBarInfo==null?");
            sb6.append(j0Var == null);
            com.tencent.mars.xlog.Log.e("AdLandingFloatBarCompWrapper", sb6.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
            return false;
        }
        if (!super.D(jSONObject)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
            return false;
        }
        try {
            jSONObject.put("clickCount", this.D);
            com.tencent.mars.xlog.Log.i("AdLandingFloatBarCompWrapper", "kv=" + jSONObject.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("AdLandingFloatBarCompWrapper", e17, "", new java.lang.Object[0]);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
            return false;
        }
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void K() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        super.K();
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.o2 o2Var = this.B;
        if (o2Var != null) {
            o2Var.K();
        }
        com.tencent.mars.xlog.Log.i("AdLandingFloatBarCompWrapper", "viewWillAppear");
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.o2 o2Var2 = this.B;
        if ((o2Var2 instanceof com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.j5) && !((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.j5) o2Var2).W().isEnabled()) {
            this.C = false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void L() {
        com.tencent.mm.sdk.event.IListener iListener;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        super.L();
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.o2 o2Var = this.B;
        if (o2Var != null) {
            o2Var.L();
        }
        this.M.removeCallbacksAndMessages(null);
        if (this.H && (iListener = this.G) != null) {
            iListener.dead();
        }
        android.animation.AnimatorSet animatorSet = this.L;
        if (animatorSet != null) {
            animatorSet.end();
            this.L.removeAllListeners();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void M() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        super.M();
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.o2 o2Var = this.B;
        if (o2Var != null) {
            o2Var.M();
        }
        com.tencent.mars.xlog.Log.i("AdLandingFloatBarCompWrapper", "viewWillDisappear, exposureCount=" + r() + ", stayTime=" + w());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
    }

    public void S() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("animationFloatBarExitSnsNativeUI", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        if (X()) {
            this.F = true;
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.o2 o2Var = this.B;
            android.view.View W = o2Var instanceof com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z2 ? ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z2) o2Var).W() : o2Var instanceof com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4 ? ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4) o2Var).x() : null;
            if (W != null && this.B.x() != null) {
                W.clearAnimation();
                this.B.x().clearAnimation();
                if (W.getVisibility() == 0) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(W, arrayList.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper", "animationFloatBarExitSnsNativeUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    W.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(W, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper", "animationFloatBarExitSnsNativeUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    this.B.M();
                }
            }
            if (this.f165832u.getVisibility() == 0) {
                this.f165832u.clearAnimation();
                android.view.View view = this.f165832u;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper", "animationFloatBarExitSnsNativeUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper", "animationFloatBarExitSnsNativeUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                M();
            }
        } else if (this.H) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doHide", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
            T(false, false);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doHide", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        } else {
            V(false, 0L);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("animationFloatBarExitSnsNativeUI", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
    }

    public void T(boolean z17, boolean z18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doHide", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        if (this.f165832u.getVisibility() == 0) {
            com.tencent.mars.xlog.Log.i("AdLandingFloatBarCompWrapper", "mContentView doHide ");
            android.view.View view = this.f165832u;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper", "doHide", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper", "doHide", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            M();
            this.f165832u.clearAnimation();
            if (z17) {
                android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.5f);
                translateAnimation.setDuration(400L);
                if (z18) {
                    android.view.View view2 = this.f165832u;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper", "doHide", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper", "doHide", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View view3 = this.f165832u;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(java.lang.Float.valueOf(1.0f));
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper", "doHide", "(ZZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view3.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
                    yj0.a.f(view3, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper", "doHide", "(ZZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    translateAnimation.setAnimationListener(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u(this));
                } else {
                    translateAnimation.setAnimationListener(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.v(this));
                }
                this.f165832u.startAnimation(translateAnimation);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doHide", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
    }

    public void U(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doShow", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        if (this.f165832u.getVisibility() != 0) {
            com.tencent.mars.xlog.Log.i("AdLandingFloatBarCompWrapper", "mContentView doShow ");
            android.view.View view = this.f165832u;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper", "doShow", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper", "doShow", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            K();
            this.f165832u.clearAnimation();
            if (z17) {
                android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.5f, 1, 0.0f);
                translateAnimation.setInterpolator(new android.view.animation.OvershootInterpolator(1.0f));
                translateAnimation.setDuration(700L);
                this.f165832u.startAnimation(translateAnimation);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doShow", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
    }

    public void V(boolean z17, long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hide", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hide", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        if (this.H) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hide", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        } else {
            android.os.Handler handler = this.M;
            handler.removeCallbacksAndMessages(null);
            handler.sendMessageDelayed(handler.obtainMessage(2, java.lang.Boolean.valueOf(z17)), j17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hide", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hide", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
    }

    public final void W() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hideViews", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.o2 o2Var = this.B;
        android.view.View W = o2Var instanceof com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z2 ? ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z2) o2Var).W() : o2Var instanceof com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4 ? ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4) o2Var).x() : null;
        if (W != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(W, arrayList.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper", "hideViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            W.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(W, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper", "hideViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view = this.f165832u;
        if (view != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper", "hideViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper", "hideViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hideViews", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
    }

    public boolean X() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isAnimationFloatBar", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAnimationFloatBar", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        return this.E;
    }

    public boolean Y() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isForHalfScreenType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        ab4.j0 j0Var = this.f165831t;
        if (j0Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isForHalfScreenType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
            return false;
        }
        boolean z17 = j0Var.f2826p == 2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isForHalfScreenType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        return z17;
    }

    public boolean Z() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isShowing", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        if (!X()) {
            r3 = this.f165832u.getVisibility() == 0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isShowing", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
            return r3;
        }
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.o2 o2Var = this.B;
        android.widget.Button W = o2Var instanceof com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z2 ? ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z2) o2Var).W() : o2Var instanceof com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4 ? ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4) o2Var).r0() : null;
        if ((W == null || W.getVisibility() != 0) && this.f165832u.getVisibility() != 0) {
            r3 = false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isShowing", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        return r3;
    }

    public final void a0(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.o2 o2Var, android.view.View view, android.widget.Button button, android.widget.Button button2, com.tencent.mm.plugin.sns.ui.widget.SnsTextProgressBar snsTextProgressBar, ab4.u uVar, float f17, int i17, int i18) {
        android.animation.ObjectAnimator objectAnimator;
        android.animation.ObjectAnimator objectAnimator2;
        android.animation.ObjectAnimator objectAnimator3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("playEnterSnsAdNativeAnimation", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        android.animation.AnimatorSet animatorSet = this.K;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
        this.K = animatorSet2;
        animatorSet2.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view, "translationY", f17, 0.0f);
        ofFloat.setDuration(300L);
        ofFloat.setStartDelay(1000L);
        this.f165829J = true;
        ofFloat.addListener(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.w(this, o2Var, snsTextProgressBar, button, button2, view));
        ofFloat.addUpdateListener(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.x(this, uVar, button));
        android.graphics.drawable.GradientDrawable gradientDrawable = (android.graphics.drawable.GradientDrawable) view.getBackground();
        android.content.Context context = this.f165049d;
        android.animation.ObjectAnimator ofInt = android.animation.ObjectAnimator.ofInt(gradientDrawable, "color", i65.a.d(context, com.tencent.mm.R.color.BW_0_Alpha_0_2), android.graphics.Color.parseColor(uVar.M));
        ofInt.setEvaluator(new android.animation.ArgbEvaluator());
        ofInt.setDuration(500L);
        ofInt.setStartDelay(1000L);
        android.animation.ObjectAnimator ofInt2 = android.animation.ObjectAnimator.ofInt((android.graphics.drawable.GradientDrawable) button.getBackground(), "color", i65.a.d(context, com.tencent.mm.R.color.BW_0_Alpha_0_2), android.graphics.Color.parseColor(uVar.M));
        ofInt2.setEvaluator(new android.animation.ArgbEvaluator());
        ofInt2.setDuration(500L);
        ofInt2.setStartDelay(1000L);
        if (button2 != null) {
            objectAnimator = android.animation.ObjectAnimator.ofInt((android.graphics.drawable.GradientDrawable) button2.getBackground(), "color", i65.a.d(context, com.tencent.mm.R.color.BW_0_Alpha_0_2), android.graphics.Color.parseColor(uVar.M));
            objectAnimator.setEvaluator(new android.animation.ArgbEvaluator());
            objectAnimator.setDuration(500L);
            objectAnimator.setStartDelay(1000L);
        } else {
            objectAnimator = null;
        }
        if (snsTextProgressBar != null) {
            objectAnimator2 = android.animation.ObjectAnimator.ofInt((android.graphics.drawable.GradientDrawable) snsTextProgressBar.getProgressDrawable(), "color", i65.a.d(context, com.tencent.mm.R.color.BW_0_Alpha_0_2), android.graphics.Color.parseColor(uVar.M));
            objectAnimator2.setEvaluator(new android.animation.ArgbEvaluator());
            objectAnimator2.setDuration(500L);
            objectAnimator2.setStartDelay(1000L);
        } else {
            objectAnimator2 = null;
        }
        android.animation.ObjectAnimator ofInt3 = android.animation.ObjectAnimator.ofInt(button, "textColor", i65.a.d(context, com.tencent.mm.R.color.aaw), android.graphics.Color.parseColor(uVar.I));
        ofInt3.setEvaluator(new android.animation.ArgbEvaluator());
        ofInt3.setDuration(500L);
        ofInt3.setStartDelay(1000L);
        if (button2 != null) {
            objectAnimator3 = android.animation.ObjectAnimator.ofInt(button2, "textColor", i65.a.d(context, com.tencent.mm.R.color.aaw), android.graphics.Color.parseColor(uVar.I));
            objectAnimator3.setEvaluator(new android.animation.ArgbEvaluator());
            objectAnimator3.setDuration(500L);
            objectAnimator3.setStartDelay(1000L);
        } else {
            objectAnimator3 = null;
        }
        ofInt3.addUpdateListener(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m(this, uVar, button));
        android.animation.AnimatorSet animatorSet3 = this.L;
        if (animatorSet3 != null) {
            animatorSet3.cancel();
        }
        this.L = new android.animation.AnimatorSet();
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(this.f165832u, "alpha", 0.0f, 1.0f);
        android.animation.ObjectAnimator objectAnimator4 = objectAnimator2;
        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(view, "translationX", 0.0f, ((this.f165058p - i17) / 2) - i65.a.b(context, 28));
        android.animation.ValueAnimator ofInt4 = android.animation.ValueAnimator.ofInt(i65.a.b(context, 190), i17);
        android.animation.ValueAnimator ofInt5 = android.animation.ValueAnimator.ofInt(i65.a.b(context, 40), i18);
        ofInt4.addUpdateListener(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.n(this, view, uVar, button));
        ofInt5.addUpdateListener(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.o(this, view));
        this.L.play(ofFloat2).with(ofFloat3).with(ofInt4).with(ofInt5);
        this.L.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        this.L.setDuration(1000L);
        this.L.setStartDelay(1500L);
        this.L.addListener(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.p(this, view, i17, i18));
        if (objectAnimator == null || objectAnimator4 == null || objectAnimator3 == null) {
            this.K.play(ofInt2).with(ofInt).with(ofInt3).after(ofFloat).before(this.L);
        } else {
            this.K.play(ofInt2).with(ofInt).with(objectAnimator).with(objectAnimator4).with(ofInt3).with(objectAnimator3).after(ofFloat).before(this.L);
        }
        this.K.start();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("playEnterSnsAdNativeAnimation", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
    }

    public void b0(boolean z17, long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("show", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        if (this.H) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("show", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
            return;
        }
        android.os.Handler handler = this.M;
        handler.removeCallbacksAndMessages(null);
        handler.sendMessageDelayed(handler.obtainMessage(1, java.lang.Boolean.valueOf(z17)), j17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("show", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
    }

    public void c0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showAnimationFloatBar", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        if (this.H) {
            if (!this.I) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showAnimationFloatBar", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
                return;
            } else if (this.f165829J) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showAnimationFloatBar", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
                return;
            }
        }
        try {
            e0();
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = (com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI) this.f165830s;
            snsAdNativeLandingPagesUI.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isOnPause", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            boolean z17 = snsAdNativeLandingPagesUI.X1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isOnPause", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            if (!z17) {
                K();
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdLandingFloatBarCompWrapper", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showAnimationFloatBar", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d0() {
        /*
            Method dump skipped, instructions count: 611
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.y.d0():void");
    }

    public final void e0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showViews", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.o2 o2Var = this.B;
        android.view.View W = o2Var instanceof com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z2 ? ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z2) o2Var).W() : o2Var instanceof com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4 ? ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4) o2Var).x() : null;
        if (W != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(W, arrayList.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper", "showViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            W.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(W, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper", "showViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view = this.f165832u;
        if (view != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper", "showViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper", "showViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showViews", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        android.content.Context context = this.f165830s;
        android.view.LayoutInflater from = android.view.LayoutInflater.from(context);
        android.view.ViewGroup viewGroup = this.A;
        android.view.View inflate = from.inflate(com.tencent.mm.R.layout.cpg, viewGroup, false);
        this.f165832u = inflate;
        this.f165833v = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.f485023g94);
        this.f165834w = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.g9a);
        this.f165835x = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f485022g93);
        this.f165836y = (android.widget.FrameLayout) inflate.findViewById(com.tencent.mm.R.id.g8v);
        ((com.tencent.mm.ui.widget.RoundedCornerFrameLayout) inflate.findViewById(com.tencent.mm.R.id.g8q)).setRadius(i65.a.b(context, 8));
        com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout = (com.tencent.mm.ui.widget.RoundedCornerFrameLayout) inflate.findViewById(com.tencent.mm.R.id.g8r);
        this.f165837z = roundedCornerFrameLayout;
        roundedCornerFrameLayout.setRadius(i65.a.b(context, 4));
        viewGroup.addView(this.f165832u);
        if (this.E) {
            android.view.ViewGroup.LayoutParams layoutParams = this.f165832u.getLayoutParams();
            if (layoutParams instanceof android.widget.FrameLayout.LayoutParams) {
                android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
                layoutParams2.bottomMargin = i65.a.b(context, 42);
                this.f165832u.setLayoutParams(layoutParams2);
            }
        }
        android.view.View view = this.f165832u;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper", "createView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper", "createView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void k() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        ab4.j0 j0Var = this.f165831t;
        if (android.text.TextUtils.isEmpty(j0Var.iconUrl)) {
            this.f165837z.setVisibility(8);
        } else {
            java.lang.String str = j0Var.iconUrl;
            za4.t0.c(str, false, j0Var.f2818e, 0, new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.q(this, str));
        }
        if (android.text.TextUtils.isEmpty(j0Var.G)) {
            this.f165834w.setVisibility(8);
        } else {
            this.f165834w.setText(j0Var.G);
            this.f165834w.setVisibility(0);
        }
        if (android.text.TextUtils.isEmpty(j0Var.H)) {
            this.f165835x.setVisibility(8);
        } else {
            this.f165835x.setText(j0Var.H);
            this.f165835x.setVisibility(0);
        }
        if (!android.text.TextUtils.isEmpty(j0Var.F)) {
            try {
                this.f165832u.setBackgroundColor(android.graphics.Color.parseColor(j0Var.F));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("AdLandingFloatBarCompWrapper", "refreshView backgroundColor, exp=" + e17.toString() + ", color=" + j0Var.F);
            }
        } else if (!android.text.TextUtils.isEmpty(j0Var.backgroundImg)) {
            za4.t0.c(j0Var.backgroundImg, false, j0Var.f2818e, 0, new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.r(this));
        }
        if (!android.text.TextUtils.isEmpty(j0Var.I)) {
            try {
                this.f165834w.setTextColor(android.graphics.Color.parseColor(j0Var.I));
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("AdLandingFloatBarCompWrapper", "refreshView titleColor, exp=" + e18.toString() + ", color=" + j0Var.I);
            }
        }
        if (!android.text.TextUtils.isEmpty(j0Var.f2848J)) {
            try {
                this.f165835x.setTextColor(android.graphics.Color.parseColor(j0Var.f2848J));
            } catch (java.lang.Exception e19) {
                com.tencent.mars.xlog.Log.e("AdLandingFloatBarCompWrapper", "refreshView descColor, exp=" + e19.toString() + ", color=" + j0Var.f2848J);
            }
        }
        this.f165836y.removeAllViews();
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 a17 = com.tencent.mm.plugin.sns.ui.ta.a(this.f165830s, j0Var.P, this.f165836y, 0);
        if (a17 instanceof com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.o2) {
            this.B = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.o2) a17;
        } else {
            com.tencent.mars.xlog.Log.e("AdLandingFloatBarCompWrapper", "btnComp=" + a17);
        }
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.o2 o2Var = this.B;
        boolean z17 = this.E;
        boolean z18 = this.H;
        if (o2Var != null) {
            if (o2Var instanceof com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z2) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAutoSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
                ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z2) o2Var).f165863z = true;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAutoSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
            } else if (o2Var instanceof com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAutoSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
                ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4) o2Var).X = true;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAutoSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
                if (z17 || z18) {
                    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4 u4Var = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4) this.B;
                    u4Var.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFloatBarAnimationEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
                    u4Var.E = false;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFloatBarAnimationEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
                }
            }
            android.view.View x17 = this.B.x();
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.o2 o2Var2 = this.B;
            android.widget.Button button = o2Var2 instanceof com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z2 ? (android.widget.Button) x17.findViewById(com.tencent.mm.R.id.n4n) : o2Var2 instanceof com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4 ? (android.widget.Button) x17.findViewById(com.tencent.mm.R.id.f484115d31) : null;
            if ((this.B instanceof com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z2) && button != null) {
                button.setMaxLines(1);
                androidx.core.widget.a0.b(button, 1, (int) button.getTextSize(), 1, 0);
            }
            this.f165836y.addView(x17);
        }
        this.C = j0Var.K;
        this.f165832u.setOnClickListener(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.s(this));
        if (!z18 && !Y()) {
            d0();
        } else if (z17) {
            W();
        } else {
            android.view.View view = this.f165832u;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper", "fillItem", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper", "fillItem", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
    }
}
