package zf5;

/* loaded from: classes9.dex */
public final class a implements vg3.o4 {
    @Override // vg3.o4
    public void M(com.tencent.mm.storage.z3 z3Var, com.tencent.mm.storage.z3 z3Var2, r45.tn4 tn4Var, byte[] bArr, boolean z17) {
    }

    @Override // vg3.o4
    public void b0(com.tencent.mm.storage.z3 z3Var, com.tencent.mm.storage.z3 z3Var2, r45.tn4 tn4Var, byte[] bArr, boolean z17) {
    }

    @Override // vg3.o4
    public void m1(com.tencent.mm.storage.z3 z3Var, r45.xb0 xb0Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("del contact, talker: ");
        sb6.append(z3Var != null ? z3Var.d1() : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.ConvBoxContactAssemblerImpl", sb6.toString());
        qy.i iVar = (qy.i) i95.n0.c(qy.i.class);
        java.lang.String d17 = z3Var != null ? z3Var.d1() : null;
        ((py.a) iVar).getClass();
        if (c01.v1.y(d17)) {
            if (((xf5.c) ((qy.j) i95.n0.c(qy.j.class))).Ai() == 0) {
                ((com.tencent.mm.storage.m4) c01.d9.b().r()).k("conversationboxservice");
            } else {
                ((xf5.c) ((qy.j) i95.n0.c(qy.j.class))).aj(false);
            }
        }
    }
}
