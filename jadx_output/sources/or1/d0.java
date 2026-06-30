package or1;

/* loaded from: classes9.dex */
public class d0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactListUI f347471d;

    public d0(com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactListUI enterpriseBizContactListUI) {
        this.f347471d = enterpriseBizContactListUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactListUI enterpriseBizContactListUI = this.f347471d;
        enterpriseBizContactListUI.hideVKB();
        enterpriseBizContactListUI.finish();
        return true;
    }
}
