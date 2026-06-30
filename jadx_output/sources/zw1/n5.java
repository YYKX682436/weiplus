package zw1;

/* loaded from: classes15.dex */
public class n5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.Toast f476741d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.o90 f476742e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI f476743f;

    public n5(com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI, android.widget.Toast toast, r45.o90 o90Var) {
        this.f476743f = walletCollectQrCodeUI;
        this.f476741d = toast;
        this.f476742e = o90Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f476741d.cancel();
        r45.o90 o90Var = this.f476742e;
        if (o90Var != null) {
            int i17 = com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI.Q;
            this.f476743f.L7(o90Var, 0, false, null);
        }
    }
}
