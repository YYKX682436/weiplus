package p61;

/* loaded from: classes4.dex */
public class b3 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.bind.ui.BindQQUI f352220d;

    public b3(com.tencent.mm.plugin.account.bind.ui.BindQQUI bindQQUI) {
        this.f352220d = bindQQUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.account.bind.ui.BindQQUI bindQQUI = this.f352220d;
        bindQQUI.hideVKB();
        bindQQUI.finish();
        return true;
    }
}
