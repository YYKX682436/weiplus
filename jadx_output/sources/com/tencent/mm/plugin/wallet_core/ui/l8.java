package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class l8 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.DialogInterface.OnCancelListener f180411d;

    public l8(android.content.DialogInterface.OnCancelListener onCancelListener, com.tencent.mm.plugin.wallet_core.ui.x7 x7Var) {
        this.f180411d = null;
        this.f180411d = onCancelListener;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.wallet_core.ui.n8.u(false);
        android.content.DialogInterface.OnCancelListener onCancelListener = this.f180411d;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
