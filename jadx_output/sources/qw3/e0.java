package qw3;

/* loaded from: classes9.dex */
public class e0 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI f367154d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI bankRemitBankcardInputUI) {
        super(false);
        this.f367154d = bankRemitBankcardInputUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        java.util.ArrayList<? extends android.os.Parcelable> arrayList;
        com.tencent.mars.xlog.Log.i("MicroMsg.BankRemitBankcardInputUI", "click arrive time et");
        com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI bankRemitBankcardInputUI = this.f367154d;
        bankRemitBankcardInputUI.hideVKB();
        bankRemitBankcardInputUI.f156479f.e();
        if (com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI.W6(bankRemitBankcardInputUI)) {
            return;
        }
        android.content.Intent intent = new android.content.Intent(bankRemitBankcardInputUI.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSelectArriveTimeUI.class);
        com.tencent.mm.plugin.remittance.bankcard.model.BankcardElemParcel bankcardElemParcel = bankRemitBankcardInputUI.F;
        if (bankcardElemParcel != null && (arrayList = bankcardElemParcel.f156462o) != null) {
            intent.putParcelableArrayListExtra("key_arrive_time_parcel_list", arrayList);
        }
        com.tencent.mm.plugin.remittance.bankcard.model.EnterTimeParcel enterTimeParcel = bankRemitBankcardInputUI.E;
        if (enterTimeParcel != null) {
            intent.putExtra("key_select_arrive_time", enterTimeParcel.f156465d);
        }
        bankRemitBankcardInputUI.startActivityForResult(intent, 3);
    }
}
