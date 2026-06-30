package d92;

/* loaded from: classes5.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f227452d;

    public a(android.view.View view) {
        this.f227452d = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f227452d;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            int i17 = layoutParams.width;
            if (i17 > 0) {
                layoutParams.width = (int) (i17 * i65.a.j(view.getContext()));
            }
            int i18 = layoutParams.height;
            if (i18 > 0) {
                layoutParams.height = (int) (i18 * i65.a.j(view.getContext()));
            }
        }
    }
}
