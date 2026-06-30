package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class vb extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI f147538d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f147539e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vb(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI, com.tencent.mm.modelbase.m1 m1Var) {
        super(false);
        this.f147538d = luckyMoneyNewPrepareUI;
        this.f147539e = m1Var;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View v17) {
        kotlin.jvm.internal.o.g(v17, "v");
        com.tencent.mm.wallet_core.ui.r1.V(this.f147538d.getContext(), ((com.tencent.mm.plugin.luckymoney.model.x5) this.f147539e).f145700o, false);
    }
}
