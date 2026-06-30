package zs5;

/* loaded from: classes9.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zs5.y f475456d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.aff.iam_scan.j0 f475457e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f475458f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(zs5.y yVar, com.tencent.wechat.aff.iam_scan.j0 j0Var, long j17) {
        super(0);
        this.f475456d = yVar;
        this.f475457e = j0Var;
        this.f475458f = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.HashMap hashMap = this.f475456d.f475518s;
        com.tencent.wechat.aff.iam_scan.j0 j0Var = this.f475457e;
        com.tencent.mars.xlog.Log.i("MicroMsg.AffScanDecodeQueue", "notifyScanEventAsync sessionId: " + this.f475458f + ", eventType: " + j0Var.f217076d + ", bufferKey: " + j0Var.f217077e + ", remove: " + ((java.nio.ByteBuffer) hashMap.remove(java.lang.Long.valueOf(j0Var.f217077e))));
        return jz5.f0.f302826a;
    }
}
