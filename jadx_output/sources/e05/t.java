package e05;

/* loaded from: classes9.dex */
public class t implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditDetailUI f246191d;

    public t(com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditDetailUI walletWXCreditDetailUI) {
        this.f246191d = walletWXCreditDetailUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        at4.x1 fj6 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj();
        com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditDetailUI walletWXCreditDetailUI = this.f246191d;
        java.lang.String str = walletWXCreditDetailUI.f188545i.field_bindSerial;
        fj6.getClass();
        db5.e1.h(this.f246191d, null, (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]), walletWXCreditDetailUI.getString(com.tencent.mm.R.string.f493536kn2), false, new e05.s(this));
        return true;
    }
}
