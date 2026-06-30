package k72;

/* loaded from: classes14.dex */
public class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ byte[][] f304702d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k72.d0 f304703e;

    public a0(k72.d0 d0Var, byte[][] bArr) {
        this.f304703e = d0Var;
        this.f304702d = bArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            h72.s.e().k();
            for (byte[] bArr : this.f304702d) {
                h72.s e17 = h72.s.e();
                e17.f279469c.postToWorker(new h72.p(e17, bArr));
            }
            h72.s.e().l(new k72.z(this));
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FaceCheckVideoRecordMgr", e18, "recordFrameImpl error", new java.lang.Object[0]);
            k72.b0 b0Var = this.f304703e.f304716f;
            if (b0Var != null) {
                ((k72.r) b0Var).a();
            }
        }
    }
}
