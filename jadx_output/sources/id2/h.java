package id2;

/* loaded from: classes3.dex */
public final class h implements com.tencent.mm.ui.widget.dialog.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnDismissListener f290591a;

    public h(android.content.DialogInterface.OnDismissListener onDismissListener) {
        this.f290591a = onDismissListener;
    }

    @Override // com.tencent.mm.ui.widget.dialog.q3
    public final void dismiss() {
        id2.m.f290662a.d("154");
        android.content.DialogInterface.OnDismissListener onDismissListener = this.f290591a;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(null);
        }
    }
}
