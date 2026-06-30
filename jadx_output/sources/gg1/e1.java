package gg1;

/* loaded from: classes7.dex */
public final class e1 implements x91.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gg1.k1 f271556d;

    public e1(gg1.k1 k1Var) {
        this.f271556d = k1Var;
    }

    @Override // x91.a
    public void C2(x91.h hVar) {
        x91.c cVar;
        java.lang.String str = (hVar == null || (cVar = hVar.f452647a) == null) ? null : cVar.f452641i;
        if (str == null) {
            str = "";
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoCast.VideoCastDeviceManager", "onAddDevice: udn = ".concat(str));
        gg1.k1 k1Var = this.f271556d;
        if (hVar == null || r26.n0.N(str)) {
            yz5.l lVar = k1Var.f271595h;
            if (lVar != null) {
                lVar.invoke(java.lang.Boolean.FALSE);
                return;
            }
            return;
        }
        x91.c cVar2 = k1Var.b().f452647a;
        if (kotlin.jvm.internal.o.b(str, cVar2 != null ? cVar2.f452641i : null)) {
            yz5.l lVar2 = k1Var.f271595h;
            if (lVar2 != null) {
                lVar2.invoke(java.lang.Boolean.TRUE);
            }
            ((b06.b) k1Var.f271590c).a(k1Var, gg1.k1.f271587k[0], hVar);
        }
    }

    @Override // x91.a
    public void K4(x91.h hVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoCast.VideoCastDeviceManager", "reconnect: onUpdateDevice");
    }

    @Override // x91.a
    public void q2(x91.h hVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoCast.VideoCastDeviceManager", "reconnect: onRemoveDevice");
    }
}
