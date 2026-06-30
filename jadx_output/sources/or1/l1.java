package or1;

/* loaded from: classes4.dex */
public class l1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.EnterpriseBizEntranceListUI f347526d;

    public l1(com.tencent.mm.plugin.brandservice.ui.EnterpriseBizEntranceListUI enterpriseBizEntranceListUI) {
        this.f347526d = enterpriseBizEntranceListUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.brandservice.ui.EnterpriseBizEntranceListUI enterpriseBizEntranceListUI = this.f347526d;
        enterpriseBizEntranceListUI.hideVKB();
        enterpriseBizEntranceListUI.finish();
        return true;
    }
}
