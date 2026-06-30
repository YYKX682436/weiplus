package dq0;

/* loaded from: classes7.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fq0.x f242333d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f242334e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dq0.a0 f242335f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(fq0.x xVar, yz5.l lVar, dq0.a0 a0Var) {
        super(0);
        this.f242333d = xVar;
        this.f242334e = lVar;
        this.f242335f = a0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("preLayout finish ");
        fq0.x xVar = this.f242333d;
        sb6.append(xVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", sb6.toString());
        this.f242334e.invoke(java.lang.Double.valueOf(vp0.b.b(java.lang.Integer.valueOf(xVar.f265483g))));
        if (!xVar.f265489m) {
            this.f242335f.v(xVar);
        }
        return jz5.f0.f302826a;
    }
}
