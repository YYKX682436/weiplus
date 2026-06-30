package qw3;

/* loaded from: classes9.dex */
public class o1 implements db5.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.bankcard.model.TransferRecordParcel f367186a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSelectPayeeUI f367187b;

    public o1(com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSelectPayeeUI bankRemitSelectPayeeUI, com.tencent.mm.plugin.remittance.bankcard.model.TransferRecordParcel transferRecordParcel) {
        this.f367187b = bankRemitSelectPayeeUI;
        this.f367186a = transferRecordParcel;
    }

    @Override // db5.a1
    public boolean onFinish(java.lang.CharSequence charSequence) {
        com.tencent.mm.plugin.remittance.bankcard.model.TransferRecordParcel transferRecordParcel = this.f367186a;
        java.lang.String str = transferRecordParcel.f156476m;
        if ((str == null && charSequence == null) || (str != null && str.equals(charSequence))) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BankRemitSelectPayeeUI", "no change: %s, %s", transferRecordParcel.f156476m, charSequence);
            return true;
        }
        java.lang.String str2 = transferRecordParcel.f156470d;
        java.lang.String str3 = "" + ((java.lang.Object) charSequence);
        int i17 = com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSelectPayeeUI.f156538q;
        com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSelectPayeeUI bankRemitSelectPayeeUI = this.f367187b;
        bankRemitSelectPayeeUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.BankRemitSelectPayeeUI", "do modify remark: %s", str3);
        bankRemitSelectPayeeUI.doSceneProgress(new ow3.h(str2, str3), true);
        return true;
    }
}
