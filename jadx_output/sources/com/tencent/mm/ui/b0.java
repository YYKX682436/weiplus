package com.tencent.mm.ui;

/* loaded from: classes14.dex */
public class b0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.AlertActivity f197202d;

    public b0(com.tencent.mm.ui.AlertActivity alertActivity) {
        this.f197202d = alertActivity;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.ui.yk.c("MicroMsg.AlertActivity", "mTipsBuilder onDismiss", new java.lang.Object[0]);
        com.tencent.mm.ui.AlertActivity alertActivity = this.f197202d;
        android.content.DialogInterface.OnDismissListener onDismissListener = alertActivity.f196562d;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
        alertActivity.finish();
    }
}
