package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes9.dex */
public class v0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.offline.ui.a1 f152739d;

    public v0(com.tencent.mm.plugin.offline.ui.a1 a1Var) {
        this.f152739d = a1Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.offline.ui.a1 a1Var = this.f152739d;
        com.tencent.mm.plugin.wallet_core.ui.n8 n8Var = a1Var.f152579c;
        if (n8Var != null) {
            n8Var.dismiss();
            a1Var.f152579c = null;
        }
    }
}
