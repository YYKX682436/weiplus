package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class n9 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.o9 f180544d;

    public n9(com.tencent.mm.plugin.wallet_core.ui.o9 o9Var) {
        this.f180544d = o9Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletVertifyCodeUI", "forwardProcess2 and finish to reset mobile num!");
        com.tencent.mm.plugin.wallet_core.ui.o9 o9Var = this.f180544d;
        android.os.Bundle input = o9Var.f180565e.getInput();
        input.putInt("key_err_code", 408);
        com.tencent.mm.wallet_core.a.d(o9Var.f180565e, input);
        o9Var.f180565e.finish();
    }
}
