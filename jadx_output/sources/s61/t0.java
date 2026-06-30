package s61;

/* loaded from: classes9.dex */
public class t0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.friend.ui.RecoverAccountUI1 f403391d;

    public t0(com.tencent.mm.plugin.account.friend.ui.RecoverAccountUI1 recoverAccountUI1) {
        this.f403391d = recoverAccountUI1;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f403391d.finish();
        return true;
    }
}
