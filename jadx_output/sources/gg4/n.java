package gg4;

/* loaded from: classes11.dex */
public class n implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.subapp.ui.pluginapp.ContactSearchResultUI f271764d;

    public n(com.tencent.mm.plugin.subapp.ui.pluginapp.ContactSearchResultUI contactSearchResultUI) {
        this.f271764d = contactSearchResultUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f271764d.finish();
        return true;
    }
}
