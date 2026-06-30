package gg4;

/* loaded from: classes4.dex */
public class l implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.subapp.ui.pluginapp.AddMoreFriendsUI f271762d;

    public l(com.tencent.mm.plugin.subapp.ui.pluginapp.AddMoreFriendsUI addMoreFriendsUI) {
        this.f271762d = addMoreFriendsUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f271762d.finish();
        return true;
    }
}
