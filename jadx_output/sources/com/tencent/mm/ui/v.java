package com.tencent.mm.ui;

/* loaded from: classes14.dex */
public class v implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.AlertActivity f211098d;

    public v(com.tencent.mm.ui.AlertActivity alertActivity) {
        this.f211098d = alertActivity;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.ui.AlertActivity alertActivity = this.f211098d;
        android.content.DialogInterface.OnDismissListener onDismissListener = alertActivity.f196562d;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
        alertActivity.finish();
    }
}
