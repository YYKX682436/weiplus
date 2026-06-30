package se2;

/* loaded from: classes3.dex */
public final class c implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f406839d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ se2.d f406840e;

    public c(android.view.View view, se2.d dVar) {
        this.f406839d = view;
        this.f406840e = dVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f406839d.setBackground(this.f406840e.f406845d);
    }
}
