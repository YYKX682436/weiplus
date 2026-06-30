package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class lc implements com.tencent.mm.wallet_core.model.y1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f147133a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI f147134b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.wv3 f147135c;

    public lc(long j17, com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI, r45.wv3 wv3Var) {
        this.f147133a = j17;
        this.f147134b = luckyMoneyNewPrepareUI;
        this.f147135c = wv3Var;
    }

    @Override // com.tencent.mm.wallet_core.model.y1
    public void a(com.tencent.mm.wallet_core.model.s1 result) {
        kotlin.jvm.internal.o.g(result, "result");
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f147133a;
        boolean z17 = result instanceof com.tencent.mm.wallet_core.model.r1;
        r45.wv3 wv3Var = this.f147135c;
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI = this.f147134b;
        if (z17) {
            java.lang.ref.WeakReference weakReference = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI.f146241x2;
            java.lang.String str = ((com.tencent.mm.wallet_core.model.r1) result).f213987a;
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUI", "downloadComplete success，file path: %s", str);
            com.tencent.mm.plugin.luckymoney.model.n3.f145460a.h(3, str, luckyMoneyNewPrepareUI.C);
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[4];
            r45.xv3 xv3Var = wv3Var.f389501g;
            objArr[0] = xv3Var != null ? xv3Var.f390492v : null;
            objArr[1] = 1;
            objArr[2] = 4;
            objArr[3] = java.lang.Long.valueOf(currentTimeMillis);
            g0Var.d(28153, objArr);
            return;
        }
        com.tencent.mm.wallet_core.model.q1 q1Var = result instanceof com.tencent.mm.wallet_core.model.q1 ? (com.tencent.mm.wallet_core.model.q1) result : null;
        java.lang.Integer valueOf = q1Var != null ? java.lang.Integer.valueOf(q1Var.f213985a) : null;
        java.lang.ref.WeakReference weakReference2 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI.f146241x2;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUI", "downloadComplete failed，errorCode: %s", valueOf);
        android.view.View view = luckyMoneyNewPrepareUI.B;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewPrepareUI$renderEnvelopDynamic$3", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewPrepareUI$renderEnvelopDynamic$3", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr2 = new java.lang.Object[4];
        r45.xv3 xv3Var2 = wv3Var.f389501g;
        objArr2[0] = xv3Var2 != null ? xv3Var2.f390492v : null;
        objArr2[1] = 2;
        objArr2[2] = 4;
        objArr2[3] = java.lang.Long.valueOf(currentTimeMillis);
        g0Var2.d(28153, objArr2);
    }
}
