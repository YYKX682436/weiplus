package t74;

/* loaded from: classes4.dex */
public final class d2 {

    /* renamed from: a, reason: collision with root package name */
    public t74.b2 f416124a;

    /* renamed from: b, reason: collision with root package name */
    public t74.w1 f416125b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f416126c;

    public final void a(android.app.Activity activity, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        android.view.View view;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("bindAdFlipCardComponent", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardLogic");
        if (snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindAdFlipCardComponent", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardLogic");
            return;
        }
        if (this.f416124a == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindAdFlipCardComponent", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardLogic");
            return;
        }
        if (this.f416125b == null && snsInfo.isFlipCardAd()) {
            kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
            if (activity instanceof androidx.lifecycle.y) {
                h0Var.f310123d = activity;
            }
            t74.b2 b2Var = this.f416124a;
            if (b2Var != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemRootView", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardLogic$FlipCardContext");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemRootView", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardLogic$FlipCardContext");
                view = b2Var.f416109c;
            } else {
                view = null;
            }
            this.f416125b = new t74.c2(h0Var, view, this.f416124a);
            com.tencent.mars.xlog.Log.i("AdFlipCardLogic", "create ad flip card component");
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("refresh ad flip card component, oldSnsId is ");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo2 = this.f416126c;
        sb6.append(ca4.z0.t0(snsInfo2 != null ? snsInfo2.field_snsId : 0L));
        sb6.append(", newSnsId is ");
        sb6.append(ca4.z0.t0(snsInfo.field_snsId));
        com.tencent.mars.xlog.Log.i("AdFlipCardLogic", sb6.toString());
        this.f416126c = snsInfo;
        t74.w1 w1Var = this.f416125b;
        if (w1Var != null) {
            w1Var.f(snsInfo);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindAdFlipCardComponent", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardLogic");
    }

    public final void b(int i17) {
        android.view.ViewGroup.LayoutParams layoutParams;
        android.view.ViewGroup b17;
        android.view.ViewGroup c17;
        android.view.ViewGroup.LayoutParams layoutParams2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("calcTouchClickArea", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardLogic");
        t74.b2 b2Var = this.f416124a;
        if (b2Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calcTouchClickArea", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardLogic");
            return;
        }
        if (b2Var != null && (c17 = b2Var.c()) != null && (layoutParams2 = c17.getLayoutParams()) != null) {
            layoutParams2.width = i17;
            layoutParams2.height = (int) (i17 * 0.75f);
        }
        t74.b2 b2Var2 = this.f416124a;
        android.view.View findViewById = (b2Var2 == null || (b17 = b2Var2.b()) == null) ? null : b17.findViewById(com.tencent.mm.R.id.twz);
        if (findViewById != null && (layoutParams = findViewById.getLayoutParams()) != null) {
            layoutParams.width = i17;
            layoutParams.height = -2;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calcTouchClickArea", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardLogic");
    }

    public final void c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardLogic");
        t74.w1 w1Var = this.f416125b;
        if (w1Var != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
            com.tencent.mars.xlog.Log.i(w1Var.j(), "onAdRemoved");
            w1Var.f416272m0 = true;
            a84.t0.a(w1Var.f416291w0);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardLogic");
    }

    public final void d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardLogic");
        t74.w1 w1Var = this.f416125b;
        if (w1Var != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
            java.lang.String j17 = w1Var.j();
            try {
                com.tencent.mars.xlog.Log.i(w1Var.j(), "onUIDestroy");
                w1Var.m0(w1Var.f416261b0);
                w1Var.m0(w1Var.f416260a0);
            } catch (java.lang.Throwable th6) {
                ca4.q.c(j17, th6);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardLogic");
    }

    public final void e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pausePlayByActivity", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardLogic");
        t74.w1 w1Var = this.f416125b;
        if (w1Var != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pausePlayByActivity", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
            java.lang.String j17 = w1Var.j();
            try {
                com.tencent.mars.xlog.Log.i(w1Var.j(), "pausePlayByActivity");
                w1Var.f416297z0 = false;
                w1Var.K0();
            } catch (java.lang.Throwable th6) {
                ca4.q.c(j17, th6);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pausePlayByActivity", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pausePlayByActivity", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardLogic");
    }

    public final void f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startPlayByTimeline", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardLogic");
        t74.w1 w1Var = this.f416125b;
        if (w1Var != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startPlayByTimeline", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
            kotlinx.coroutines.y0 h17 = w1Var.h();
            if (h17 != null) {
                kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                kotlinx.coroutines.l.d(h17, ((t26.a) kotlinx.coroutines.internal.b0.f310484a).f415347h.plus(w1Var.A0), null, new t74.v1(w1Var, null), 2, null);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startPlayByTimeline", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startPlayByTimeline", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardLogic");
    }
}
