package com.tencent.mm.ui;

/* loaded from: classes14.dex */
public class x implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.AlertActivity f212535d;

    public x(com.tencent.mm.ui.AlertActivity alertActivity) {
        this.f212535d = alertActivity;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.ui.yk.c("MicroMsg.AlertActivity", "mTipsBuilder onDismiss", new java.lang.Object[0]);
        com.tencent.mm.ui.AlertActivity alertActivity = this.f212535d;
        android.content.DialogInterface.OnDismissListener onDismissListener = alertActivity.f196562d;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
        alertActivity.finish();
    }
}
