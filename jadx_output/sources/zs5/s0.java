package zs5;

/* loaded from: classes15.dex */
public class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zs5.u0 f475474d;

    public s0(zs5.u0 u0Var) {
        this.f475474d = u0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f475474d.f475491e) {
            zs5.q0 q0Var = zs5.q0.f475461a;
            boolean d17 = q0Var.d();
            com.tencent.mars.xlog.Log.i("MicroMsg.WxFileDecodeQueue", "releaseWxFileQRCodeDecoder releaseQBar hasInit: %s", java.lang.Boolean.valueOf(d17));
            if (d17) {
                q0Var.release();
            }
        }
    }
}
