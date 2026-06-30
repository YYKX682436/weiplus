package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class sj implements com.tencent.mm.wallet_core.model.y1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f147425a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.View f147426b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MMPAGView f147427c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.wv3 f147428d;

    public sj(long j17, android.view.View view, com.tencent.mm.view.MMPAGView mMPAGView, r45.wv3 wv3Var) {
        this.f147425a = j17;
        this.f147426b = view;
        this.f147427c = mMPAGView;
        this.f147428d = wv3Var;
    }

    @Override // com.tencent.mm.wallet_core.model.y1
    public void a(com.tencent.mm.wallet_core.model.s1 s1Var) {
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f147425a;
        if (s1Var instanceof com.tencent.mm.wallet_core.model.r1) {
            java.lang.String str = ((com.tencent.mm.wallet_core.model.r1) s1Var).f213987a;
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNotHookReceiveUI", "downloadComplete success，file path: %s", str);
            this.f147426b.postDelayed(new com.tencent.mm.plugin.luckymoney.ui.rj(this, str, currentTimeMillis), 170L);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNotHookReceiveUI", "downloadComplete failed，errorCode: %s", java.lang.Integer.valueOf(((com.tencent.mm.wallet_core.model.q1) s1Var).f213985a));
        android.view.View view = this.f147426b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI$22", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI$22", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(28153, this.f147428d.f389501g.f390494x, 2, 2, java.lang.Long.valueOf(currentTimeMillis));
    }
}
