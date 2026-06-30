package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes9.dex */
public class v implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.id_verify.RealnameDialogActivity f179516d;

    public v(com.tencent.mm.plugin.wallet_core.id_verify.RealnameDialogActivity realnameDialogActivity) {
        this.f179516d = realnameDialogActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        this.f179516d.finish();
    }
}
