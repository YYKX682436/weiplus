package zo1;

/* loaded from: classes5.dex */
public final class h2 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.PackageDeleteConfirmUI f474632d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f474633e;

    public h2(com.tencent.mm.plugin.backup.roambackup.ui.pkg.PackageDeleteConfirmUI packageDeleteConfirmUI, com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        this.f474632d = packageDeleteConfirmUI;
        this.f474633e = k0Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mars.xlog.Log.i("PackageDeleteConfirmUI", "on menu item clicked, idx=" + i17);
        if (i17 == 0) {
            com.tencent.mm.plugin.backup.roambackup.ui.pkg.PackageDeleteConfirmUI.U6(this.f474632d);
        }
        this.f474633e.u();
    }
}
