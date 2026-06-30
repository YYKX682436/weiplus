package j23;

/* loaded from: classes12.dex */
public class n extends com.tencent.mm.plugin.fts.ui.a {
    @Override // t13.k
    public int getType() {
        return 4352;
    }

    @Override // com.tencent.mm.plugin.fts.ui.a
    public u13.g o(int i17, t13.i iVar) {
        e23.u1 u1Var;
        int i18 = (i17 - iVar.f414565a) - 1;
        if (i18 >= iVar.f414570f.size() || i18 < 0) {
            u1Var = null;
        } else {
            p13.y yVar = (p13.y) iVar.f414570f.get(i18);
            u1Var = new e23.u1(19, i17);
            u1Var.f246839q = yVar;
            u1Var.f423762e = iVar.f414571g;
            u1Var.n(yVar.f351184b, yVar.f351185c);
        }
        if (u1Var != null) {
            u1Var.f423767j = i18 + 1;
        }
        return u1Var;
    }

    @Override // com.tencent.mm.plugin.fts.ui.a
    public p13.c q(com.tencent.mm.sdk.platformtools.n3 n3Var, java.util.HashSet hashSet) {
        p13.u uVar = new p13.u();
        uVar.f351141c = this.f138007i;
        uVar.f351145g = new int[]{131089, 131090};
        uVar.f351150l = r13.b.f368602d;
        uVar.f351148j = hashSet;
        uVar.f351151m = this;
        uVar.f351152n = n3Var;
        uVar.f351140b = 113;
        return ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(14, uVar);
    }

    @Override // com.tencent.mm.plugin.fts.ui.a
    public void s(p13.v vVar, java.util.HashSet hashSet) {
        if (k(vVar.f351160e)) {
            t13.i iVar = new t13.i();
            iVar.f414569e = -24;
            iVar.f414570f = vVar.f351160e;
            iVar.f414571g = vVar.f351159d;
            iVar.f414568d = false;
            this.f138009n.add(iVar);
        }
    }
}
