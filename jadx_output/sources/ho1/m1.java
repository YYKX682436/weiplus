package ho1;

/* loaded from: classes9.dex */
public final class m1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ho1.q1 f282755a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f282756b;

    public m1(ho1.q1 q1Var, long j17) {
        this.f282755a = q1Var;
        this.f282756b = j17;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackup.RoamProviderImpl", "getRoamBackupPackagesAsync Msg=" + fVar.f70617c + " Type=" + fVar.f70615a + " Code=" + fVar.f70616b);
        com.tencent.wechat.aff.affroam.g0 g0Var = this.f282755a.f282787a;
        if (g0Var == null) {
            return null;
        }
        g0Var.p1(this.f282756b, ((bo1.k) fVar.f70618d).toByteArray());
        return jz5.f0.f302826a;
    }
}
