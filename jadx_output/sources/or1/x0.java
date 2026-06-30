package or1;

/* loaded from: classes4.dex */
public class x0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactPlainListUI f347594d;

    public x0(com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactPlainListUI enterpriseBizContactPlainListUI) {
        this.f347594d = enterpriseBizContactPlainListUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactPlainListUI enterpriseBizContactPlainListUI = this.f347594d;
        enterpriseBizContactPlainListUI.hideVKB();
        enterpriseBizContactPlainListUI.finish();
        return true;
    }
}
