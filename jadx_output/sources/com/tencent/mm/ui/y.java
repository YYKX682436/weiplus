package com.tencent.mm.ui;

/* loaded from: classes14.dex */
public class y implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.AlertActivity f212568d;

    public y(com.tencent.mm.ui.AlertActivity alertActivity) {
        this.f212568d = alertActivity;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.ui.AlertActivity alertActivity = this.f212568d;
        android.content.DialogInterface.OnCancelListener onCancelListener = alertActivity.f196563e;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
        alertActivity.finish();
    }
}
