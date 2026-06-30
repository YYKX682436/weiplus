package com.tencent.mm.pluginsdk.ui.span;

/* loaded from: classes.dex */
public class s0 implements com.tencent.mm.ui.widget.dialog.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnDismissListener f191285d;

    public s0(android.content.DialogInterface.OnDismissListener onDismissListener) {
        this.f191285d = onDismissListener;
    }

    @Override // com.tencent.mm.ui.widget.dialog.c1
    public void onDismiss() {
        android.content.DialogInterface.OnDismissListener onDismissListener = this.f191285d;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(null);
        }
    }
}
