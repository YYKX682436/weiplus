package com.tencent.mm.pluginsdk.ui.span;

/* loaded from: classes.dex */
public class t0 implements com.tencent.mm.ui.widget.dialog.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnDismissListener f191286a;

    public t0(android.content.DialogInterface.OnDismissListener onDismissListener) {
        this.f191286a = onDismissListener;
    }

    @Override // com.tencent.mm.ui.widget.dialog.b1
    public void a() {
        android.content.DialogInterface.OnDismissListener onDismissListener = this.f191286a;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(null);
        }
    }
}
