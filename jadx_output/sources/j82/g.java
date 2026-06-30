package j82;

/* loaded from: classes8.dex */
public class g implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.offline.ui.FavOfflineWebViewUI f298156d;

    public g(com.tencent.mm.plugin.fav.offline.ui.FavOfflineWebViewUI favOfflineWebViewUI) {
        this.f298156d = favOfflineWebViewUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) this.f298156d.getContext(), 0, false);
        k0Var.f211872n = new j82.c(this);
        k0Var.f211874o = new j82.d(this);
        k0Var.f211881s = new j82.e(this);
        k0Var.f211884v = new j82.f(this);
        k0Var.v();
        return true;
    }
}
