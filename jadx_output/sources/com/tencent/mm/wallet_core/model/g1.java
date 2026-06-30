package com.tencent.mm.wallet_core.model;

/* loaded from: classes9.dex */
public class g1 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.model.h1 f213902d;

    public g1(com.tencent.mm.wallet_core.model.h1 h1Var) {
        this.f213902d = h1Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.wallet_core.model.h1 h1Var = this.f213902d;
        android.app.Dialog dialog = h1Var.f213907p;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        h1Var.f213907p.dismiss();
    }
}
