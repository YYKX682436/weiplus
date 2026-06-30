package zw1;

/* loaded from: classes9.dex */
public class k0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.CollectHKMainUI f476685d;

    public k0(com.tencent.mm.plugin.collect.ui.CollectHKMainUI collectHKMainUI) {
        this.f476685d = collectHKMainUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.wallet_core.ui.r1.V(this.f476685d.getContext(), "https://hkwallet.moneydata.hk/hybrid/www/weixin/f2f/zh_hk/faq.shtml", true);
        return false;
    }
}
