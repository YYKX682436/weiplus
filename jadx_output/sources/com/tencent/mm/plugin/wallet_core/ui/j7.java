package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class j7 implements qp5.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.v7 f180361a;

    public j7(com.tencent.mm.plugin.wallet_core.ui.v7 v7Var) {
        this.f180361a = v7Var;
    }

    @Override // qp5.t
    public void onInputValidChange(boolean z17) {
        if (z17) {
            this.f180361a.e();
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11977, 0, 0, 0, 0, 0, 0);
        }
    }
}
