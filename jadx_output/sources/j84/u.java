package j84;

/* loaded from: classes4.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f298231d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j84.g0 f298232e;

    public u(android.app.Activity activity, j84.g0 g0Var) {
        this.f298231d = activity;
        this.f298232e = g0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent$setupScratchState$3$1");
        if (this.f298231d.isFinishing()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent$setupScratchState$3$1");
            return;
        }
        j84.g0 g0Var = this.f298232e;
        g0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("scratchSuccessJump", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = g0Var.f298199s;
        if (snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("scratchSuccessJump", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        } else if (g0Var.f298200t == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("scratchSuccessJump", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        } else {
            com.tencent.mm.plugin.sns.storage.ADXml adXml = snsInfo.getAdXml();
            s34.w0 w0Var = adXml != null ? adXml.adScratchCardInfo : null;
            if (w0Var == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("scratchSuccessJump", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
            } else {
                w64.n nVar = new w64.n(g0Var.f298200t, g0Var.f298196p, g0Var.f298197q, null, null);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getScratchSuccessActionInfo", "com.tencent.mm.plugin.sns.ad.adxml.AdScratchCardInfo");
                com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo = (com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo) ((com.tencent.mm.plugin.sns.storage.k0) w0Var.f402819p).a(w0Var, s34.w0.f402803r[1]);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getScratchSuccessActionInfo", "com.tencent.mm.plugin.sns.ad.adxml.AdScratchCardInfo");
                if (adClickActionInfo != null) {
                    adClickActionInfo.f162569a = 39;
                }
                nVar.n(adClickActionInfo, g0Var.f298199s);
                nVar.k(g0Var.F());
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("scratchSuccessJump", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
            }
        }
        g0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startCouponAnimation", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        if (g0Var.f298200t == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startCouponAnimation", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        } else {
            g0Var.j();
            g0Var.I();
            android.view.animation.PathInterpolator pathInterpolator = new android.view.animation.PathInterpolator(0.63f, 0.01f, 0.35f, 1.0f);
            android.widget.FrameLayout C = g0Var.C();
            if (C != null) {
                C.setAlpha(0.0f);
                C.setVisibility(0);
                android.view.ViewPropertyAnimator animate = C.animate();
                if (animate != null) {
                    animate.alpha(1.0f);
                    animate.setDuration(600L);
                    animate.setInterpolator(pathInterpolator);
                    animate.start();
                }
            }
            android.widget.LinearLayout G = g0Var.G();
            if (G != null) {
                float b17 = (-G.getX()) + i65.a.b(g0Var.f298200t, 12);
                android.view.ViewPropertyAnimator animate2 = G.animate();
                if (animate2 != null) {
                    animate2.translationX(b17);
                    animate2.setDuration(600L);
                    animate2.setInterpolator(pathInterpolator);
                    animate2.withEndAction(new j84.b0(g0Var));
                    animate2.start();
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startCouponAnimation", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent$setupScratchState$3$1");
    }
}
