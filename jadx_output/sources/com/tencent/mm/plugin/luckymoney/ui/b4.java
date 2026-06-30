package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes3.dex */
public final class b4 implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.d4 f146737a;

    public b4(com.tencent.mm.plugin.luckymoney.ui.d4 d4Var) {
        this.f146737a = d4Var;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyDetailUIFunctionUIC", "[doShowUpRightCornerLiteApp] OpenLiteApp failed");
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.luckymoney.ui.a4(this.f146737a));
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyDetailUIFunctionUIC", "[doShowUpRightCornerLiteApp] OpenLiteApp success");
    }
}
