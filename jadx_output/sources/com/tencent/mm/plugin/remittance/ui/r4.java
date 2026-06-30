package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class r4 implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.model.v0 f157917a;

    public r4(com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI remittanceDetailUI, com.tencent.mm.plugin.remittance.model.v0 v0Var) {
        this.f157917a = v0Var;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mm.plugin.remittance.model.v0 v0Var = this.f157917a;
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceDetailUI", "[jump] StartLiteApp() fail appid: %s, page: %s", v0Var.f157040e, v0Var.f157041f);
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mm.plugin.remittance.model.v0 v0Var = this.f157917a;
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceDetailUI", "[jump] StartLiteApp() success appid: %s, page: %s", v0Var.f157040e, v0Var.f157041f);
    }
}
