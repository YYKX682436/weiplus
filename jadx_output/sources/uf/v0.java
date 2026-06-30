package uf;

/* loaded from: classes7.dex */
public final class v0 implements x91.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uf.c1 f427114d;

    public v0(uf.c1 c1Var) {
        this.f427114d = c1Var;
    }

    @Override // x91.a
    public void C2(x91.h hVar) {
        x91.c cVar;
        java.lang.String str = (hVar == null || (cVar = hVar.f452647a) == null) ? null : cVar.f452641i;
        if (str == null) {
            str = "";
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCastDeviceManager", "[reconnect]onAddDevice, udn = ".concat(str));
        uf.c1 c1Var = this.f427114d;
        if (hVar == null || r26.n0.N(str)) {
            yz5.l lVar = c1Var.f426987f;
            if (lVar != null) {
                lVar.invoke(java.lang.Boolean.FALSE);
                return;
            }
            return;
        }
        x91.c cVar2 = c1Var.c().f452647a;
        if (kotlin.jvm.internal.o.b(str, cVar2 != null ? cVar2.f452641i : null)) {
            yz5.l lVar2 = c1Var.f426987f;
            if (lVar2 != null) {
                lVar2.invoke(java.lang.Boolean.TRUE);
            }
            ((b06.b) c1Var.f426983b).a(c1Var, uf.c1.f426981m[0], hVar);
        }
    }

    @Override // x91.a
    public void K4(x91.h hVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCastDeviceManager", "[reconnect]onUpdateDevice");
    }

    @Override // x91.a
    public void q2(x91.h hVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCastDeviceManager", "[reconnect]onRemoveDevice");
    }
}
