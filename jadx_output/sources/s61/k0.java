package s61;

/* loaded from: classes8.dex */
public class k0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.friend.ui.InviteFriendUI f403363d;

    public k0(com.tencent.mm.plugin.account.friend.ui.InviteFriendUI inviteFriendUI) {
        this.f403363d = inviteFriendUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f403363d.finish();
        return true;
    }
}
