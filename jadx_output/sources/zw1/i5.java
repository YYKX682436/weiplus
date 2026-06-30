package zw1;

/* loaded from: classes15.dex */
public class i5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ww1.b3 f476665d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup.LayoutParams f476666e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ww1.a3 f476667f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI f476668g;

    public i5(com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI, ww1.b3 b3Var, android.view.ViewGroup.LayoutParams layoutParams, ww1.a3 a3Var) {
        this.f476668g = walletCollectQrCodeUI;
        this.f476665d = b3Var;
        this.f476666e = layoutParams;
        this.f476667f = a3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI.Q;
        com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI = this.f476668g;
        boolean J7 = walletCollectQrCodeUI.J7();
        ww1.a3 a3Var = this.f476667f;
        android.view.ViewGroup.LayoutParams layoutParams = this.f476666e;
        ww1.b3 b3Var = this.f476665d;
        if (!J7) {
            if (b3Var.f450139k.getHeight() != 0) {
                layoutParams.height = b3Var.f450139k.getHeight();
            } else {
                layoutParams.height = (int) a3Var.f450115y;
            }
        }
        float f17 = a3Var.f450115y;
        b3Var.f450139k.getHeight();
        b3Var.C.getHeight();
        i65.a.b(walletCollectQrCodeUI.getContext(), 1);
        b3Var.O.setLayoutParams(layoutParams);
        b3Var.O.setBackgroundResource(com.tencent.mm.R.drawable.f481281pd);
        b3Var.P.setBackgroundResource(com.tencent.mm.R.drawable.f481281pd);
    }
}
