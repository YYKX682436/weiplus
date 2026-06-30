package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes9.dex */
public class e3 implements com.tencent.mm.plugin.wallet_core.ui.c7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.rr6 f178994a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pwd.ui.WalletUniversalPayOrderUI f178995b;

    public e3(com.tencent.mm.plugin.wallet.pwd.ui.WalletUniversalPayOrderUI walletUniversalPayOrderUI, r45.rr6 rr6Var) {
        this.f178995b = walletUniversalPayOrderUI;
        this.f178994a = rr6Var;
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.c7
    public void a(android.view.View view) {
        com.tencent.mm.wallet_core.ui.r1.V(this.f178995b.getContext(), this.f178994a.f385158h.f370603e, true);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16343, 11);
    }
}
