package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class pn implements com.tencent.mm.wallet_core.model.y1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f147328a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.wv3 f147329b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.co f147330c;

    public pn(com.tencent.mm.plugin.luckymoney.ui.co coVar, long j17, r45.wv3 wv3Var) {
        this.f147330c = coVar;
        this.f147328a = j17;
        this.f147329b = wv3Var;
    }

    @Override // com.tencent.mm.wallet_core.model.y1
    public void a(com.tencent.mm.wallet_core.model.s1 s1Var) {
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f147328a;
        boolean z17 = s1Var instanceof com.tencent.mm.wallet_core.model.r1;
        r45.wv3 wv3Var = this.f147329b;
        com.tencent.mm.plugin.luckymoney.ui.co coVar = this.f147330c;
        if (z17) {
            java.lang.String str = ((com.tencent.mm.wallet_core.model.r1) s1Var).f213987a;
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "[renderEnvelopeAtmosphereDynamic] downloadComplete success，file path: %s", str);
            com.tencent.mm.plugin.luckymoney.model.n3.f145460a.g(10, str, coVar.f146825x, coVar.itemView.isSelected());
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(28153, wv3Var.f389501g.F, 1, 9, java.lang.Long.valueOf(currentTimeMillis));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "[renderEnvelopeAtmosphereDynamic] downloadComplete failed，errorCode: %s", java.lang.Integer.valueOf(((com.tencent.mm.wallet_core.model.q1) s1Var).f213985a));
        android.view.View view = coVar.f146823v;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH$21", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH$21", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        r45.xv3 xv3Var = wv3Var.f389501g;
        if (xv3Var != null) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(28153, xv3Var.F, 2, 9, java.lang.Long.valueOf(currentTimeMillis));
        }
    }
}
