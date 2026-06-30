package qw3;

/* loaded from: classes9.dex */
public class u extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI f367210d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI bankRemitBankcardInputUI) {
        super(false);
        this.f367210d = bankRemitBankcardInputUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI bankRemitBankcardInputUI = this.f367210d;
        if (bankRemitBankcardInputUI.L || !bankRemitBankcardInputUI.M) {
            bankRemitBankcardInputUI.a7(true);
        } else {
            android.content.Intent intent = new android.content.Intent(bankRemitBankcardInputUI.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSelectPayeeUI.class);
            java.util.ArrayList<? extends android.os.Parcelable> arrayList = bankRemitBankcardInputUI.f156489s;
            if (arrayList != null) {
                intent.putParcelableArrayListExtra("key_self_transfer_record_list", arrayList);
            }
            java.util.ArrayList<? extends android.os.Parcelable> arrayList2 = bankRemitBankcardInputUI.f156490t;
            if (arrayList2 != null) {
                intent.putParcelableArrayListExtra("key_freq_transfer_record_list", arrayList2);
            }
            bankRemitBankcardInputUI.startActivityForResult(intent, 1);
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14673, 3);
    }
}
