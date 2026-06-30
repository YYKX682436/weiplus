package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class gn implements com.tencent.mm.wallet_core.model.y1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f146966a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.wv3 f146967b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.co f146968c;

    public gn(com.tencent.mm.plugin.luckymoney.ui.co coVar, long j17, r45.wv3 wv3Var) {
        this.f146968c = coVar;
        this.f146966a = j17;
        this.f146967b = wv3Var;
    }

    @Override // com.tencent.mm.wallet_core.model.y1
    public void a(com.tencent.mm.wallet_core.model.s1 s1Var) {
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f146966a;
        boolean z17 = s1Var instanceof com.tencent.mm.wallet_core.model.r1;
        r45.wv3 wv3Var = this.f146967b;
        com.tencent.mm.plugin.luckymoney.ui.co coVar = this.f146968c;
        if (z17) {
            java.lang.String str = ((com.tencent.mm.wallet_core.model.r1) s1Var).f213987a;
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "downloadComplete success，file path: %s", str);
            coVar.f146817p = false;
            if (coVar.f146809e == 1) {
                com.tencent.mm.plugin.luckymoney.model.n3.f145460a.g(1, str, coVar.f146814m, true);
            } else {
                com.tencent.mm.plugin.luckymoney.model.n3.f145460a.g(1, str, coVar.f146814m, coVar.itemView.isSelected());
            }
            r45.xv3 xv3Var = wv3Var.f389501g;
            if (xv3Var != null) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(28153, xv3Var.f390494x, 1, 5, java.lang.Long.valueOf(currentTimeMillis));
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "downloadComplete failed，errorCode: %s", java.lang.Integer.valueOf(((com.tencent.mm.wallet_core.model.q1) s1Var).f213985a));
        android.view.View view = coVar.f146813i;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH$13", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH$13", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        r45.xv3 xv3Var2 = wv3Var.f389501g;
        if (xv3Var2 != null) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(28153, xv3Var2.f390494x, 2, 5, java.lang.Long.valueOf(currentTimeMillis));
        }
    }
}
