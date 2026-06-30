package qw3;

/* loaded from: classes9.dex */
public class z0 implements com.tencent.mm.plugin.remittance.ui.m7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qw3.a1 f367229a;

    public z0(qw3.a1 a1Var) {
        this.f367229a = a1Var;
    }

    @Override // com.tencent.mm.plugin.remittance.ui.m7
    public void onResult(boolean z17, java.lang.String str, java.lang.String str2) {
        if (z17) {
            return;
        }
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
        qw3.a1 a1Var = this.f367229a;
        if (K0) {
            a1Var.f367140b.G = "";
        } else {
            a1Var.f367140b.G = str;
        }
        com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitMoneyInputUI bankRemitMoneyInputUI = a1Var.f367140b;
        int i17 = com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitMoneyInputUI.R;
        bankRemitMoneyInputUI.d7();
    }
}
