package hr3;

/* loaded from: classes.dex */
public final class je implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.pf f283700d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f283701e;

    public je(hr3.pf pfVar, android.widget.TextView textView) {
        this.f283700d = pfVar;
        this.f283701e = textView;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 0) {
            hr3.pf pfVar = this.f283700d;
            hr3.pf.P6(pfVar, 3, 0);
            pfVar.Y6("", "");
            this.f283701e.setVisibility(8);
        }
    }
}
