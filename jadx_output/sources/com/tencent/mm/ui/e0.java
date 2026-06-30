package com.tencent.mm.ui;

/* loaded from: classes14.dex */
public class e0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.AlertActivity f208355d;

    public e0(com.tencent.mm.ui.AlertActivity alertActivity) {
        this.f208355d = alertActivity;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        android.content.DialogInterface.OnCancelListener onCancelListener = this.f208355d.f196563e;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
        new android.os.Handler().postDelayed(new com.tencent.mm.ui.d0(this), 200L);
    }
}
