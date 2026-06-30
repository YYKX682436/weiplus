package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class x7 implements qp5.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.n8 f180797a;

    public x7(com.tencent.mm.plugin.wallet_core.ui.n8 n8Var) {
        this.f180797a = n8Var;
    }

    @Override // qp5.t
    public void onInputValidChange(boolean z17) {
        if (z17) {
            this.f180797a.e();
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11977, 0, 0, 0, 0, 0, 0);
        }
    }
}
