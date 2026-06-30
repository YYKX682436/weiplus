package fp3;

/* loaded from: classes9.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.WalletGetBulletinEvent f265329d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.order.ui.MallOrderRecordListUI f265330e;

    public s(com.tencent.mm.plugin.order.ui.MallOrderRecordListUI mallOrderRecordListUI, com.tencent.mm.autogen.events.WalletGetBulletinEvent walletGetBulletinEvent) {
        this.f265330e = mallOrderRecordListUI;
        this.f265329d = walletGetBulletinEvent;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.autogen.events.WalletGetBulletinEvent walletGetBulletinEvent = this.f265329d;
        if (com.tencent.mm.sdk.platformtools.t8.K0(walletGetBulletinEvent.f54956h.f6994a)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletOrderListUI", "no bulletin data");
            return;
        }
        android.widget.TextView textView = (android.widget.TextView) this.f265330e.findViewById(com.tencent.mm.R.id.af7);
        am.j10 j10Var = walletGetBulletinEvent.f54956h;
        com.tencent.mm.wallet_core.ui.r1.s0(null, textView, j10Var.f6994a, j10Var.f6995b, j10Var.f6996c);
    }
}
