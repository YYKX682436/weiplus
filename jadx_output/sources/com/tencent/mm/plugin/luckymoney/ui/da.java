package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes3.dex */
public final class da implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.fa f146836a;

    public da(com.tencent.mm.plugin.luckymoney.ui.fa faVar) {
        this.f146836a = faVar;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewDetailUIFunctionUIC", "[doShowUpRightCornerLiteApp] OpenLiteApp failed");
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.luckymoney.ui.ca(this.f146836a));
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewDetailUIFunctionUIC", "[doShowUpRightCornerLiteApp] OpenLiteApp success");
    }
}
