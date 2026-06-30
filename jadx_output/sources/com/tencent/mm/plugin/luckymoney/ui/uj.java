package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class uj implements com.tencent.mm.wallet_core.model.y1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f147506a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.View f147507b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MMPAGView f147508c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.wv3 f147509d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f147510e;

    public uj(long j17, android.view.View view, com.tencent.mm.view.MMPAGView mMPAGView, r45.wv3 wv3Var, android.view.View view2) {
        this.f147506a = j17;
        this.f147507b = view;
        this.f147508c = mMPAGView;
        this.f147509d = wv3Var;
        this.f147510e = view2;
    }

    @Override // com.tencent.mm.wallet_core.model.y1
    public void a(com.tencent.mm.wallet_core.model.s1 s1Var) {
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f147506a;
        if (s1Var instanceof com.tencent.mm.wallet_core.model.r1) {
            java.lang.String str = ((com.tencent.mm.wallet_core.model.r1) s1Var).f213987a;
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNotHookReceiveUI", "downloadComplete success，file path: %s", str);
            this.f147507b.postDelayed(new com.tencent.mm.plugin.luckymoney.ui.tj(this, str, currentTimeMillis), 150L);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNotHookReceiveUI", "downloadComplete failed，errorCode: %s", java.lang.Integer.valueOf(((com.tencent.mm.wallet_core.model.q1) s1Var).f213985a));
        android.view.View view = this.f147510e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI$23", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI$23", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(28153, this.f147509d.f389501g.f390494x, 2, 2, java.lang.Long.valueOf(currentTimeMillis));
    }
}
