package xt4;

/* loaded from: classes9.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_payu.order.ui.PayUMallOrderRecordListUI f457159d;

    public a(com.tencent.mm.plugin.wallet_payu.order.ui.PayUMallOrderRecordListUI payUMallOrderRecordListUI) {
        this.f457159d = payUMallOrderRecordListUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = com.tencent.mm.plugin.wallet_payu.order.ui.PayUMallOrderRecordListUI.f181271r;
        com.tencent.mm.plugin.wallet_payu.order.ui.PayUMallOrderRecordListUI payUMallOrderRecordListUI = this.f457159d;
        if (!payUMallOrderRecordListUI.f152856h) {
            payUMallOrderRecordListUI.f152853e.b();
        } else if (!payUMallOrderRecordListUI.f152860o) {
            payUMallOrderRecordListUI.f152853e.g();
            payUMallOrderRecordListUI.f152853e.setAdapter((android.widget.ListAdapter) payUMallOrderRecordListUI.f152854f);
            payUMallOrderRecordListUI.f152860o = true;
        }
        payUMallOrderRecordListUI.f152854f.notifyDataSetChanged();
    }
}
