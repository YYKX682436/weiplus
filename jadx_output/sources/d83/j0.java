package d83;

/* loaded from: classes5.dex */
public final class j0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f226984d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d83.t0 f226985e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(java.lang.String str, d83.t0 t0Var) {
        super(0);
        this.f226984d = str;
        this.f226985e = t0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ILinkStreamController", "destroy stream: " + this.f226984d);
        d83.t0 t0Var = this.f226985e;
        java.lang.String str = this.f226984d;
        if (t0Var.f227022b == null) {
            synchronized (t0Var) {
                if (t0Var.f227022b == null) {
                    t0Var.f227022b = com.tencent.wechat.aff.ilink_stream.p.f217294b.d(t0Var.f227021a);
                    t0Var.f227027g.set(false);
                }
            }
        }
        d83.t0.a(t0Var);
        com.tencent.wechat.aff.ilink_stream.o oVar = t0Var.f227022b;
        if (oVar != null) {
            oVar.c(str);
        }
        return jz5.f0.f302826a;
    }
}
