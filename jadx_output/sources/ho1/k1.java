package ho1;

/* loaded from: classes9.dex */
public final class k1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ho1.q1 f282739a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f282740b;

    public k1(ho1.q1 q1Var, long j17) {
        this.f282739a = q1Var;
        this.f282740b = j17;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackup.RoamProviderImpl", "code = " + fVar.f70616b + ", type = " + fVar.f70615a + ", msg = " + fVar.f70617c);
        com.tencent.wechat.aff.affroam.g0 g0Var = this.f282739a.f282787a;
        if (g0Var == null) {
            return null;
        }
        g0Var.O1(this.f282740b, ((bo1.g) fVar.f70618d).toByteArray());
        return jz5.f0.f302826a;
    }
}
