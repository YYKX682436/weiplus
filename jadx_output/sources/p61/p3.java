package p61;

/* loaded from: classes8.dex */
public class p3 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.bind.ui.GoogleFriendUI f352347d;

    public p3(com.tencent.mm.plugin.account.bind.ui.GoogleFriendUI googleFriendUI) {
        this.f352347d = googleFriendUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f352347d.finish();
        return true;
    }
}
