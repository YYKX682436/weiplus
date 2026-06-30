package com.tencent.mm.plugin.wallet.pay.ui;

/* loaded from: classes9.dex */
public class z implements db5.z0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pay.ui.a0 f178821a;

    public z(com.tencent.mm.plugin.wallet.pay.ui.a0 a0Var) {
        this.f178821a = a0Var;
    }

    @Override // db5.z0
    public void a(int i17) {
        com.tencent.mm.plugin.wallet.pay.ui.a0 a0Var = this.f178821a;
        a0Var.f178744b.f178705r = (com.tencent.mm.plugin.wallet_core.model.Bankcard) a0Var.f178743a.get(i17);
        a0Var.f178744b.X6();
    }
}
