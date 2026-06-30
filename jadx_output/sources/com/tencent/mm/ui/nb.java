package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class nb implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnClickListener f209410d;

    public nb(android.content.DialogInterface.OnClickListener onClickListener) {
        this.f209410d = onClickListener;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.sdk.platformtools.c3.b("show_wap_adviser");
        android.content.DialogInterface.OnClickListener onClickListener = this.f209410d;
        if (onClickListener != null) {
            onClickListener.onClick(dialogInterface, 0);
        }
    }
}
