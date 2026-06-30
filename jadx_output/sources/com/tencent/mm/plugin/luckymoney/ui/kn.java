package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class kn implements com.tencent.mm.wallet_core.model.y1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f147114a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.wv3 f147115b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.co f147116c;

    public kn(com.tencent.mm.plugin.luckymoney.ui.co coVar, long j17, r45.wv3 wv3Var) {
        this.f147116c = coVar;
        this.f147114a = j17;
        this.f147115b = wv3Var;
    }

    @Override // com.tencent.mm.wallet_core.model.y1
    public void a(com.tencent.mm.wallet_core.model.s1 s1Var) {
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f147114a;
        boolean z17 = s1Var instanceof com.tencent.mm.wallet_core.model.r1;
        r45.wv3 wv3Var = this.f147115b;
        com.tencent.mm.plugin.luckymoney.ui.co coVar = this.f147116c;
        if (z17) {
            java.lang.String str = ((com.tencent.mm.wallet_core.model.r1) s1Var).f213987a;
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "downloadComplete success，file path: %s", str);
            if (coVar.f146809e == 1) {
                com.tencent.mm.plugin.luckymoney.model.n3.f145460a.g(1, str, coVar.f146819r, true);
            } else {
                com.tencent.mm.plugin.luckymoney.model.n3.f145460a.g(1, str, coVar.f146819r, coVar.itemView.isSelected());
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(28153, wv3Var.f389501g.f390494x, 1, 5, java.lang.Long.valueOf(currentTimeMillis));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "downloadComplete failed，errorCode: %s", java.lang.Integer.valueOf(((com.tencent.mm.wallet_core.model.q1) s1Var).f213985a));
        android.view.View view = coVar.f146818q;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH$17", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH$17", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        r45.xv3 xv3Var = wv3Var.f389501g;
        if (xv3Var != null) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(28153, xv3Var.f390494x, 2, 5, java.lang.Long.valueOf(currentTimeMillis));
        }
    }
}
