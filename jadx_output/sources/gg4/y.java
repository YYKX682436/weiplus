package gg4;

/* loaded from: classes8.dex */
public class y implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.subapp.ui.pluginapp.InviteFriendsBy3rdUI f271785d;

    public y(com.tencent.mm.plugin.subapp.ui.pluginapp.InviteFriendsBy3rdUI inviteFriendsBy3rdUI) {
        this.f271785d = inviteFriendsBy3rdUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f271785d.finish();
        return true;
    }
}
