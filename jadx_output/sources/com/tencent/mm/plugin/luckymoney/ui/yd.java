package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class yd implements com.tencent.mm.wallet_core.model.y1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f147734a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.View f147735b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.view.View f147736c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.wv3 f147737d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MMPAGView f147738e;

    public yd(long j17, android.view.View view, android.view.View view2, r45.wv3 wv3Var, com.tencent.mm.view.MMPAGView mMPAGView) {
        this.f147734a = j17;
        this.f147735b = view;
        this.f147736c = view2;
        this.f147737d = wv3Var;
        this.f147738e = mMPAGView;
    }

    @Override // com.tencent.mm.wallet_core.model.y1
    public void a(com.tencent.mm.wallet_core.model.s1 result) {
        kotlin.jvm.internal.o.g(result, "result");
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f147734a;
        if (result instanceof com.tencent.mm.wallet_core.model.r1) {
            java.lang.String str = ((com.tencent.mm.wallet_core.model.r1) result).f213987a;
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewReceiveUI", "downloadComplete success，file path: %s", str);
            android.view.View view = this.f147735b;
            if (view != null) {
                view.postDelayed(new com.tencent.mm.plugin.luckymoney.ui.xd(str, this.f147738e, this.f147737d, currentTimeMillis), 150L);
                return;
            }
            return;
        }
        com.tencent.mm.wallet_core.model.q1 q1Var = result instanceof com.tencent.mm.wallet_core.model.q1 ? (com.tencent.mm.wallet_core.model.q1) result : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewReceiveUI", "downloadComplete failed，errorCode: %s", q1Var != null ? java.lang.Integer.valueOf(q1Var.f213985a) : null);
        android.view.View view2 = this.f147736c;
        if (view2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewReceiveUI$Companion$renderEnvelopeDynamicStatic$2", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewReceiveUI$Companion$renderEnvelopeDynamicStatic$2", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[4];
        r45.xv3 xv3Var = this.f147737d.f389501g;
        objArr[0] = xv3Var != null ? xv3Var.f390494x : null;
        objArr[1] = 2;
        objArr[2] = 2;
        objArr[3] = java.lang.Long.valueOf(currentTimeMillis);
        g0Var.d(28153, objArr);
    }
}
