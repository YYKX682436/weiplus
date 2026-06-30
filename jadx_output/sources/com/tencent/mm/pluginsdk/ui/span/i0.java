package com.tencent.mm.pluginsdk.ui.span;

/* loaded from: classes10.dex */
public class i0 implements com.tencent.mm.ui.widget.dialog.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnDismissListener f191216d;

    public i0(android.content.DialogInterface.OnDismissListener onDismissListener) {
        this.f191216d = onDismissListener;
    }

    @Override // com.tencent.mm.ui.widget.dialog.c1
    public void onDismiss() {
        android.content.DialogInterface.OnDismissListener onDismissListener = this.f191216d;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(null);
        }
    }
}
