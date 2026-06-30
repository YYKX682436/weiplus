package qw3;

/* loaded from: classes9.dex */
public class v0 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitMoneyInputUI f367215d;

    public v0(com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitMoneyInputUI bankRemitMoneyInputUI) {
        this.f367215d = bankRemitMoneyInputUI;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        long j17;
        java.lang.String str = "0";
        if (editable.toString().startsWith(".")) {
            editable.insert(0, "0");
        }
        java.lang.String obj = editable.toString();
        int indexOf = obj.indexOf(".");
        int length = obj.length();
        com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitMoneyInputUI bankRemitMoneyInputUI = this.f367215d;
        if (indexOf >= 0 && length - indexOf > 2) {
            com.tencent.mm.wallet_core.ui.formview.WalletFormView.g(bankRemitMoneyInputUI.f156519m.getContentEt(), obj, indexOf + 3, length);
        }
        java.lang.String obj2 = editable.toString();
        if (com.tencent.mm.sdk.platformtools.t8.K0(obj2) || com.tencent.mm.sdk.platformtools.t8.F(obj2, 0.0d) <= 0.0d) {
            bankRemitMoneyInputUI.f156520n.setVisibility(8);
        } else {
            bankRemitMoneyInputUI.f156520n.setVisibility(0);
        }
        int i17 = com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitMoneyInputUI.R;
        bankRemitMoneyInputUI.getClass();
        double F = com.tencent.mm.sdk.platformtools.t8.F(obj2, 0.0d);
        long round = java.lang.Math.round(com.tencent.mm.sdk.platformtools.t8.F(obj2, 0.0d) * 100.0d);
        if (bankRemitMoneyInputUI.f156531y.f156457g >= 0 && round > 0) {
            double c17 = pw3.a.c(round + "", bankRemitMoneyInputUI.f156531y.f156457g + "");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
            sb6.append(c17);
            java.lang.String sb7 = sb6.toString();
            try {
                if (com.tencent.mm.sdk.platformtools.t8.F(sb7.trim(), 0.0d) != 0.0d) {
                    str = sb7.trim();
                }
                j17 = new java.math.BigDecimal(str).divide(new java.math.BigDecimal("10000"), 0, 4).longValue();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BankRemitUtil", e17, "", new java.lang.Object[0]);
                j17 = 0;
            }
            bankRemitMoneyInputUI.I = j17;
            com.tencent.mm.plugin.remittance.bankcard.model.BankcardElemParcel bankcardElemParcel = bankRemitMoneyInputUI.f156531y;
            int i18 = (int) bankcardElemParcel.f156464q;
            bankRemitMoneyInputUI.M = i18;
            long j18 = i18;
            if (j17 < j18 && bankcardElemParcel.f156457g > 0) {
                bankRemitMoneyInputUI.I = j18;
            }
            double a17 = pw3.a.a(bankRemitMoneyInputUI.I + "", "100", 2, 4);
            bankRemitMoneyInputUI.f156522p.setText(com.tencent.mm.wallet_core.ui.r1.m(a17));
            bankRemitMoneyInputUI.f156523q.setText(com.tencent.mm.wallet_core.ui.r1.m(F + a17));
        }
        bankRemitMoneyInputUI.c7();
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
