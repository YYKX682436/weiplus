package zw1;

/* loaded from: classes15.dex */
public class n4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ww1.b3 f476738d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ww1.a3 f476739e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f476740f;

    public n4(com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI, ww1.b3 b3Var, ww1.a3 a3Var, int i17) {
        this.f476738d = b3Var;
        this.f476739e = a3Var;
        this.f476740f = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        ww1.x2 x2Var = this.f476738d.N;
        x2Var.f450347f.add((ww1.b0) ((java.util.LinkedList) this.f476739e.f450113w).get(this.f476740f));
    }
}
