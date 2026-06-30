package zk4;

/* loaded from: classes11.dex */
public final class g extends com.tencent.unit_rc.BaseObject implements b66.o {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // b66.o
    public void y0(b66.n nVar) {
        zk4.l lVar = zk4.l.f473538a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPlayingTaskChanged task: ");
        sb6.append(nVar != null ? ((b66.q) nVar).d() : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.Ting.TingController", sb6.toString());
        zk4.l lVar2 = zk4.l.f473538a;
        com.tencent.unit_rc.BaseObjectDef baseObjectDef = zk4.l.f473540c;
        if (baseObjectDef != null) {
            ((b66.q) baseObjectDef).j(zk4.l.f473542e);
        }
        jm4.g3 g3Var = zk4.l.f473540c;
        if (g3Var != null) {
            urgen.ur_0025.UR_C8FE.UR_A25F(((jm4.h3) g3Var).getCppPointer(), zk4.l.f473543f);
        }
        jm4.g3 g3Var2 = nVar instanceof jm4.g3 ? (jm4.g3) nVar : 0;
        zk4.l.f473540c = g3Var2;
        if (g3Var2 != 0) {
            ((b66.q) g3Var2).a(zk4.l.f473542e);
        }
        jm4.g3 g3Var3 = zk4.l.f473540c;
        if (g3Var3 != null) {
            urgen.ur_0025.UR_C8FE.UR_EC58(((jm4.h3) g3Var3).getCppPointer(), zk4.l.f473543f);
        }
    }
}
