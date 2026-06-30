package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class o implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.l f180545d;

    public o(com.tencent.mm.plugin.wallet_core.ui.l lVar) {
        this.f180545d = lVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.wallet_core.ui.l lVar = this.f180545d;
        android.app.Dialog dialog = lVar.f180389i;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        lVar.f180389i.dismiss();
    }
}
