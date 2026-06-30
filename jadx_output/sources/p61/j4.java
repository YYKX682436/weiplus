package p61;

/* loaded from: classes4.dex */
public class j4 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.bind.ui.MobileFriendUI f352297d;

    public j4(com.tencent.mm.plugin.account.bind.ui.MobileFriendUI mobileFriendUI) {
        this.f352297d = mobileFriendUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.account.bind.ui.MobileFriendUI mobileFriendUI = this.f352297d;
        mobileFriendUI.hideVKB();
        mobileFriendUI.finish();
        return true;
    }
}
