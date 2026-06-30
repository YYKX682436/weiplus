package n3;

/* loaded from: classes12.dex */
public class y implements android.view.MenuItem.OnActionExpandListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n3.a0 f334440d;

    public y(n3.a0 a0Var) {
        this.f334440d = a0Var;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public boolean onMenuItemActionCollapse(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.fav.ui.f5 f5Var = (com.tencent.mm.plugin.fav.ui.f5) this.f334440d;
        f5Var.getClass();
        int i17 = com.tencent.mm.plugin.fav.ui.FavSearchUI.N;
        com.tencent.mm.plugin.fav.ui.FavSearchUI favSearchUI = f5Var.f100846a;
        if (favSearchUI.a7()) {
            return false;
        }
        favSearchUI.finish();
        return true;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public boolean onMenuItemActionExpand(android.view.MenuItem menuItem) {
        this.f334440d.getClass();
        return true;
    }
}
