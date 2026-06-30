package sc3;

/* loaded from: classes7.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc3.k1 f406542d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f406543e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(sc3.k1 k1Var, long j17) {
        super(0);
        this.f406542d = k1Var;
        this.f406543e = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if (this.f406542d.S) {
            sc3.k1 k1Var = this.f406542d;
            if (!k1Var.f406474J) {
                try {
                    com.tencent.mars.xlog.Log.i(k1Var.Q, "heartbeat tick#" + this.f406543e + " onPing localStatus:" + this.f406542d.G + " instanceName:" + this.f406542d.f406476e);
                    this.f406542d.H0().Oe();
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.w(this.f406542d.Q, "heartbeat tick#" + this.f406543e + " throwable: " + th6);
                }
                return jz5.f0.f302826a;
            }
        }
        com.tencent.mars.xlog.Log.i(this.f406542d.Q, "heartbeat tick#" + this.f406543e + " aborted before IPC: started=" + this.f406542d.S + ", destroying=" + this.f406542d.f406474J);
        return jz5.f0.f302826a;
    }
}
