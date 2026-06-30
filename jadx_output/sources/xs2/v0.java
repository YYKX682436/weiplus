package xs2;

/* loaded from: classes3.dex */
public final class v0 implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.PopupWindow.OnDismissListener f456391d;

    public v0(android.widget.PopupWindow.OnDismissListener onDismissListener) {
        this.f456391d = onDismissListener;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f456391d.onDismiss();
        xs2.w0.f456392a = null;
    }
}
