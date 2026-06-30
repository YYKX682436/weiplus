package e05;

/* loaded from: classes9.dex */
public class s implements db5.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e05.t f246190a;

    public s(e05.t tVar) {
        this.f246190a = tVar;
    }

    @Override // db5.c1
    public void e(int i17) {
        e05.t tVar = this.f246190a;
        if (i17 == 0) {
            at4.x1 fj6 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj();
            java.lang.String str = tVar.f246191d.f188545i.field_bindSerial;
            fj6.getClass();
            tVar.f246191d.getClass();
            return;
        }
        if (i17 != 1) {
            return;
        }
        com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditDetailUI walletWXCreditDetailUI = tVar.f246191d;
        android.os.Bundle bundle = walletWXCreditDetailUI.f188544h.f213801c;
        bundle.putBoolean("offline_pay", false);
        bundle.putBoolean("key_is_show_detail", false);
        com.tencent.mm.wallet_core.a.j(walletWXCreditDetailUI, c05.s.class, bundle, null);
    }
}
