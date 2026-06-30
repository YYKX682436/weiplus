package p61;

/* loaded from: classes5.dex */
public class u2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.bind.ui.BindMobileVerifyUI f352385d;

    public u2(com.tencent.mm.plugin.account.bind.ui.BindMobileVerifyUI bindMobileVerifyUI) {
        this.f352385d = bindMobileVerifyUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f352385d.finish();
        return true;
    }
}
