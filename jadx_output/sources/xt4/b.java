package xt4;

/* loaded from: classes9.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_payu.order.ui.PayUMallOrderRecordListUI f457160d;

    public b(com.tencent.mm.plugin.wallet_payu.order.ui.PayUMallOrderRecordListUI payUMallOrderRecordListUI) {
        this.f457160d = payUMallOrderRecordListUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = com.tencent.mm.plugin.wallet_payu.order.ui.PayUMallOrderRecordListUI.f181271r;
        this.f457160d.f152854f.notifyDataSetChanged();
    }
}
