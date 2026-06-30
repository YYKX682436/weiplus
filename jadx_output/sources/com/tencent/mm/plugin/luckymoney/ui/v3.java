package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class v3 implements com.tencent.mm.wallet_core.model.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI f147523a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.d4 f147524b;

    public v3(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI luckyMoneyDetailUI, com.tencent.mm.plugin.luckymoney.ui.d4 d4Var) {
        this.f147523a = luckyMoneyDetailUI;
        this.f147524b = d4Var;
    }

    @Override // com.tencent.mm.wallet_core.model.d
    public /* bridge */ /* synthetic */ void a(java.lang.Object obj) {
    }

    @Override // com.tencent.mm.wallet_core.model.d
    public void b(java.lang.Object obj, int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyDetailUIFunctionUIC", "[doGetExtraInfoCgi] errorCode: " + i17 + ", errorType:" + i18);
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.luckymoney.ui.u3(this.f147523a, (r45.vm3) obj, this.f147524b));
    }
}
