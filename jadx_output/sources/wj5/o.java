package wj5;

/* loaded from: classes3.dex */
public final class o implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.RelativeLayout f446829d;

    public o(android.widget.RelativeLayout relativeLayout) {
        this.f446829d = relativeLayout;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 0) {
            this.f446829d.performClick();
        }
    }
}
