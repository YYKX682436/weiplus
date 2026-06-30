package s61;

/* loaded from: classes9.dex */
public class w0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.friend.ui.RecoverFriendUI f403399d;

    public w0(com.tencent.mm.plugin.account.friend.ui.RecoverFriendUI recoverFriendUI) {
        this.f403399d = recoverFriendUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f403399d.finish();
        return true;
    }
}
