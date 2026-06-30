package zw1;

/* loaded from: classes15.dex */
public class o4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ww1.b3 f476749d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f476750e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI f476751f;

    public o4(com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI, ww1.b3 b3Var, int i17) {
        this.f476751f = walletCollectQrCodeUI;
        this.f476749d = b3Var;
        this.f476750e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        ww1.x2 x2Var = this.f476749d.N;
        int i17 = this.f476750e;
        x2Var.a(i17);
        this.f476751f.y7(i17);
    }
}
