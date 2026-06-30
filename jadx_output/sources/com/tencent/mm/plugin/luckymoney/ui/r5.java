package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class r5 implements com.tencent.mm.wallet_core.model.y1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatting.component.ListScrollPAGView f147367a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.wv3 f147368b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.view.View f147369c;

    public r5(com.tencent.mm.plugin.luckymoney.ui.t5 t5Var, com.tencent.mm.chatting.component.ListScrollPAGView listScrollPAGView, r45.wv3 wv3Var, android.view.View view) {
        this.f147367a = listScrollPAGView;
        this.f147368b = wv3Var;
        this.f147369c = view;
    }

    @Override // com.tencent.mm.wallet_core.model.y1
    public void a(com.tencent.mm.wallet_core.model.s1 s1Var) {
        boolean z17 = s1Var instanceof com.tencent.mm.wallet_core.model.r1;
        r45.wv3 wv3Var = this.f147368b;
        if (z17) {
            java.lang.String str = ((com.tencent.mm.wallet_core.model.r1) s1Var).f213987a;
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyHistoryEnvelopeUI", "downloadComplete success，file path: %s", str);
            com.tencent.mm.plugin.luckymoney.model.n3.f145460a.f(1, str, this.f147367a);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(28153, wv3Var.f389501g.f390494x, 1, 6);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyHistoryEnvelopeUI", "downloadComplete failed，errorCode: %s", java.lang.Integer.valueOf(((com.tencent.mm.wallet_core.model.q1) s1Var).f213985a));
        android.view.View view = this.f147369c;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem$8", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem$8", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(28153, wv3Var.f389501g.f390494x, 2, 6);
    }
}
