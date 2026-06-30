package qp5;

/* loaded from: classes9.dex */
public class c extends qp5.o {
    public c() {
        super(null);
    }

    @Override // qp5.o, rp5.b
    public boolean b() {
        return true;
    }

    @Override // qp5.o, rp5.b
    public java.lang.String e(com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView, java.lang.String str) {
        java.lang.String str2 = (java.lang.String) walletFormView.getTag();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str2 == null) {
            str2 = "";
        }
        return str2.replace("/", "");
    }
}
