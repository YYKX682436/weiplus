package dg4;

/* loaded from: classes15.dex */
public class c implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.subapp.ui.autoadd.AutoAddFriendUI f232355d;

    public c(com.tencent.mm.plugin.subapp.ui.autoadd.AutoAddFriendUI autoAddFriendUI) {
        this.f232355d = autoAddFriendUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f232355d.finish();
        return true;
    }
}
