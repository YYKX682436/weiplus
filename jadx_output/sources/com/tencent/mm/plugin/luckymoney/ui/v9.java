package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class v9 implements com.tencent.mm.wallet_core.model.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI f147535a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.fa f147536b;

    public v9(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI, com.tencent.mm.plugin.luckymoney.ui.fa faVar) {
        this.f147535a = luckyMoneyNewDetailUI;
        this.f147536b = faVar;
    }

    @Override // com.tencent.mm.wallet_core.model.d
    public /* bridge */ /* synthetic */ void a(java.lang.Object obj) {
    }

    @Override // com.tencent.mm.wallet_core.model.d
    public void b(java.lang.Object obj, int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewDetailUIFunctionUIC", "[doGetExtraInfoCgi] errorCode: " + i17 + ", errorType:" + i18);
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.luckymoney.ui.u9(this.f147535a, (r45.vm3) obj, this.f147536b));
    }
}
