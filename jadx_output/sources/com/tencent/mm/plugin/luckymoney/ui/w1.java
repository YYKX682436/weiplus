package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class w1 implements com.tencent.mm.plugin.wallet_core.ui.c7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.model.k f147628a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI f147629b;

    public w1(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI luckyMoneyDetailUI, com.tencent.mm.plugin.luckymoney.model.k kVar) {
        this.f147629b = luckyMoneyDetailUI;
        this.f147628a = kVar;
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.c7
    public void a(android.view.View view) {
        com.tencent.mm.wallet_core.ui.r1.V(this.f147629b.getContext(), this.f147628a.f145363f, true);
    }
}
