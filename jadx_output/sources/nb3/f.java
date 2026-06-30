package nb3;

/* loaded from: classes9.dex */
public class f implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.appbrand.ui.detail.WxaLuckyMoneyDetailUI f336049d;

    public f(com.tencent.mm.plugin.luckymoney.appbrand.ui.detail.WxaLuckyMoneyDetailUI wxaLuckyMoneyDetailUI) {
        this.f336049d = wxaLuckyMoneyDetailUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.luckymoney.appbrand.ui.detail.WxaLuckyMoneyDetailUI wxaLuckyMoneyDetailUI = this.f336049d;
        android.content.Intent intent = wxaLuckyMoneyDetailUI.f145016m;
        if (intent != null) {
            wxaLuckyMoneyDetailUI.setResult(0, intent);
        } else {
            wxaLuckyMoneyDetailUI.setResult(-1, null);
        }
        wxaLuckyMoneyDetailUI.finish();
        return true;
    }
}
