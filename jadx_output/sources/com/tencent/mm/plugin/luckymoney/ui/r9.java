package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class r9 implements com.tencent.mm.plugin.wallet_core.ui.c7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI f147375a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.model.k f147376b;

    public r9(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI, com.tencent.mm.plugin.luckymoney.model.k kVar) {
        this.f147375a = luckyMoneyNewDetailUI;
        this.f147376b = kVar;
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.c7
    public final void a(android.view.View view) {
        com.tencent.mm.wallet_core.ui.r1.V(this.f147375a.getContext(), this.f147376b.f145363f, true);
    }
}
