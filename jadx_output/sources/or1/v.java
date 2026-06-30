package or1;

/* loaded from: classes.dex */
public class v implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.BrandServiceIndexUI f347588d;

    public v(com.tencent.mm.plugin.brandservice.ui.BrandServiceIndexUI brandServiceIndexUI) {
        this.f347588d = brandServiceIndexUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        int i17 = com.tencent.mm.plugin.brandservice.ui.BrandServiceIndexUI.f93993p;
        com.tencent.mm.plugin.brandservice.ui.BrandServiceIndexUI brandServiceIndexUI = this.f347588d;
        brandServiceIndexUI.getClass();
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) brandServiceIndexUI, 1, false);
        k0Var.f211872n = new or1.w(brandServiceIndexUI);
        k0Var.f211881s = new or1.x(brandServiceIndexUI);
        k0Var.v();
        return true;
    }
}
