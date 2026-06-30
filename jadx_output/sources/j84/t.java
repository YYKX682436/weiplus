package j84;

/* loaded from: classes4.dex */
public final class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j84.g0 f298229d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s34.w0 f298230e;

    public t(j84.g0 g0Var, s34.w0 w0Var) {
        this.f298229d = g0Var;
        this.f298230e = w0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent$setScratchedCouponClick$2");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/widget/adscratchcard/AdScratchCardComponent$setScratchedCouponClick$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMContext$p", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        j84.g0 g0Var = this.f298229d;
        android.content.Context context = g0Var.f298200t;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMContext$p", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSource", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSource", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        int i17 = g0Var.f298196p;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsAdStatistic", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsAdStatistic", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        w64.n nVar = new w64.n(context, i17, g0Var.f298197q, null, null);
        s34.w0 w0Var = this.f298230e;
        w0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getClickActionInfo", "com.tencent.mm.plugin.sns.ad.adxml.AdScratchCardInfo");
        com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo = (com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo) ((com.tencent.mm.plugin.sns.storage.k0) w0Var.f402818o).a(w0Var, s34.w0.f402803r[0]);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getClickActionInfo", "com.tencent.mm.plugin.sns.ad.adxml.AdScratchCardInfo");
        if (adClickActionInfo != null) {
            adClickActionInfo.f162569a = 40;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMSnsInfo$p", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = g0Var.f298199s;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMSnsInfo$p", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        nVar.n(adClickActionInfo, snsInfo);
        nVar.k(view);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/widget/adscratchcard/AdScratchCardComponent$setScratchedCouponClick$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent$setScratchedCouponClick$2");
    }
}
