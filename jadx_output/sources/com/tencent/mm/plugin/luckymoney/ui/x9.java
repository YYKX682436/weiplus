package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes3.dex */
public final class x9 implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.fa f147679a;

    public x9(com.tencent.mm.plugin.luckymoney.ui.fa faVar) {
        this.f147679a = faVar;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewDetailUIFunctionUIC", "[doRedpacketPersonEntranceStyle] startLiteApp failed");
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.luckymoney.ui.w9(this.f147679a));
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewDetailUIFunctionUIC", "[doRedpacketPersonEntranceStyle] startLiteApp success ");
    }
}
