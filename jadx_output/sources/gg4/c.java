package gg4;

/* loaded from: classes4.dex */
public class c implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.subapp.ui.pluginapp.AddMoreFriendsByOtherWayUI f271740d;

    public c(com.tencent.mm.plugin.subapp.ui.pluginapp.AddMoreFriendsByOtherWayUI addMoreFriendsByOtherWayUI) {
        this.f271740d = addMoreFriendsByOtherWayUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f271740d.finish();
        return true;
    }
}
