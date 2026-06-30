package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class h9 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f180321d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.k9 f180322e;

    public h9(com.tencent.mm.plugin.wallet_core.ui.k9 k9Var, int i17) {
        this.f180322e = k9Var;
        this.f180321d = i17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.wallet_core.ui.k9 k9Var = this.f180322e;
        android.os.Bundle input = k9Var.f180383e.getInput();
        input.putInt("key_err_code", 417);
        boolean z17 = true;
        input.putBoolean("key_need_show_switch_phone", true);
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = k9Var.f180382d;
        if (bankcard != null && !bankcard.v0()) {
            z17 = false;
        }
        input.putBoolean("key_isbalance", z17);
        com.tencent.mm.wallet_core.a.d(k9Var.f180383e, input);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15443, 2, 2, java.lang.Integer.valueOf(this.f180321d));
    }
}
