package ho1;

/* loaded from: classes9.dex */
public final class p1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ho1.q1 f282780a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f282781b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f282782c;

    public p1(ho1.q1 q1Var, long j17, kotlin.jvm.internal.f0 f0Var) {
        this.f282780a = q1Var;
        this.f282781b = j17;
        this.f282782c = f0Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        bo1.m mVar = (bo1.m) fVar.f70618d;
        r45.ie ieVar = new r45.ie();
        ieVar.f376959d = fVar.f70616b;
        mVar.setBaseResponse(ieVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackup.RoamProviderImpl", "errType = " + fVar.f70615a + ", errCode = " + fVar.f70616b + ", errMsg = " + fVar.f70617c);
        java.util.LinkedList linkedList = ((bo1.m) fVar.f70618d).f23009d;
        if (linkedList.size() <= 0 || this.f282782c.f310116d == 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackup.RoamProviderImpl", "afterUpdate: size=" + linkedList.size());
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackup.RoamProviderImpl", "afterUpdate: size=" + linkedList.size() + ", pkgId=" + ((bo1.h) linkedList.getFirst()).f22995d + ", version=" + ((bo1.h) linkedList.getFirst()).f22996e);
        }
        com.tencent.wechat.aff.affroam.g0 g0Var = this.f282780a.f282787a;
        if (g0Var == null) {
            return null;
        }
        g0Var.C0(this.f282781b, ((bo1.m) fVar.f70618d).toByteArray());
        return jz5.f0.f302826a;
    }
}
