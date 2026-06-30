package j84;

/* loaded from: classes4.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f298209a;

    /* renamed from: b, reason: collision with root package name */
    public j84.g0 f298210b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f298211c;

    public i0(int i17) {
        this.f298209a = i17;
    }

    public final void a(android.app.Activity activity, android.view.View view, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, i64.b1 b1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("bindAdScratchCardComponent", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardLogic");
        if (snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindAdScratchCardComponent", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardLogic");
            return;
        }
        com.tencent.mars.xlog.Log.i("AdScratchCardLogic", "bindAdScratchCardComponent");
        if (snsInfo.getAdXml().adScratchCardInfo != null) {
            s34.w0 w0Var = snsInfo.getAdXml().adScratchCardInfo;
            bm5.o1 o1Var = bm5.o1.f22719a;
            if (o1Var.h(new com.tencent.mm.repairer.config.ad.RepairerConfigAdScratchCardNotSaveStatus()) == 1) {
                com.tencent.mars.xlog.Log.i("AdScratchCardLogic", "RepairerConfigAdScratchCardNotSaveStatus==1");
            } else {
                s34.w0.f402802q.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getScratchStatus", "com.tencent.mm.plugin.sns.ad.adxml.AdScratchCardInfo$Companion");
                r6 = o1Var.h(new com.tencent.mm.repairer.config.ad.RepairerConfigAdScratchCardNotSaveStatus()) != 1 ? kotlin.jvm.internal.o.b("true", p34.o.d(a84.d0.c(snsInfo), "scratchStatus")) : false;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getScratchStatus", "com.tencent.mm.plugin.sns.ad.adxml.AdScratchCardInfo$Companion");
            }
            w0Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setScratched", "com.tencent.mm.plugin.sns.ad.adxml.AdScratchCardInfo");
            w0Var.f402817n = r6;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setScratched", "com.tencent.mm.plugin.sns.ad.adxml.AdScratchCardInfo");
        }
        if (this.f298210b == null && snsInfo.getAdXml().adScratchCardInfo != null) {
            kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
            if (activity instanceof androidx.lifecycle.y) {
                h0Var.f310123d = activity;
            }
            com.tencent.mars.xlog.Log.i("AdScratchCardLogic", "create adScratchCardComponent");
            this.f298210b = new j84.h0(h0Var, view, b1Var, this.f298209a);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("refresh ad AdScratchCard, oldSnsId is ");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo2 = this.f298211c;
        sb6.append(ca4.z0.t0(snsInfo2 != null ? snsInfo2.field_snsId : 0L));
        sb6.append(", newSnsId is ");
        sb6.append(ca4.z0.t0(snsInfo.field_snsId));
        com.tencent.mars.xlog.Log.i("AdScratchCardLogic", sb6.toString());
        this.f298211c = snsInfo;
        j84.g0 g0Var = this.f298210b;
        if (g0Var != null) {
            g0Var.f(snsInfo);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindAdScratchCardComponent", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardLogic");
    }

    public final void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reset", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardLogic");
        com.tencent.mars.xlog.Log.i("AdScratchCardLogic", "resetUI");
        j84.g0 g0Var = this.f298210b;
        if (g0Var != null) {
            g0Var.H();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reset", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardLogic");
    }
}
