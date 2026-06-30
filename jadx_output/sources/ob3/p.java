package ob3;

/* loaded from: classes5.dex */
public class p implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare.WxaLuckyMoneyPrepareUI f344079d;

    public p(com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare.WxaLuckyMoneyPrepareUI wxaLuckyMoneyPrepareUI) {
        this.f344079d = wxaLuckyMoneyPrepareUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        android.content.Intent putExtra = new android.content.Intent().putExtra("result_error_code", -1).putExtra("result_error_msg", "fail:system error {{user cancel}}");
        com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare.WxaLuckyMoneyPrepareUI wxaLuckyMoneyPrepareUI = this.f344079d;
        wxaLuckyMoneyPrepareUI.setResult(0, putExtra);
        wxaLuckyMoneyPrepareUI.finish();
        return true;
    }
}
