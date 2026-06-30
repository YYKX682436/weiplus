package wj5;

/* loaded from: classes5.dex */
public final class h implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wj5.i f446804d;

    public h(wj5.i iVar) {
        this.f446804d = iVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.lang.Integer valueOf = menuItem != null ? java.lang.Integer.valueOf(menuItem.getItemId()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            c01.v1.F(this.f446804d.f446805e.x());
        }
    }
}
