package com.tencent.mm.ui;

/* loaded from: classes14.dex */
public class s implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.AlertActivity f209755d;

    public s(com.tencent.mm.ui.AlertActivity alertActivity) {
        this.f209755d = alertActivity;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        android.content.DialogInterface.OnDismissListener onDismissListener = this.f209755d.f196562d;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
        new android.os.Handler().postDelayed(new com.tencent.mm.ui.r(this), 200L);
    }
}
