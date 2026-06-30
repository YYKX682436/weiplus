package ho1;

/* loaded from: classes9.dex */
public final class l1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ho1.q1 f282747a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f282748b;

    public l1(ho1.q1 q1Var, long j17) {
        this.f282747a = q1Var;
        this.f282748b = j17;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackup.RoamProviderImpl", "[+] getIlinkDeviceBindingSessionAsync errCode = " + fVar.f70616b + ", errType = " + fVar.f70615a + ", errMsg = " + fVar.f70617c + ", isSucc = " + fVar.b());
        bo1.b bVar = (bo1.b) fVar.f70618d;
        com.tencent.wechat.aff.affroam.g0 g0Var = this.f282747a.f282787a;
        if (g0Var == null) {
            return null;
        }
        g0Var.X(this.f282748b, fVar.f70616b, bVar.toByteArray());
        return jz5.f0.f302826a;
    }
}
