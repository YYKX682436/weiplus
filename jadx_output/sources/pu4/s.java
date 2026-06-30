package pu4;

/* loaded from: classes12.dex */
public class s extends pu4.u {
    @Override // pu4.u, t13.k
    public int getType() {
        return 4384;
    }

    @Override // pu4.u, com.tencent.mm.plugin.fts.ui.a
    public p13.c q(com.tencent.mm.sdk.platformtools.n3 n3Var, java.util.HashSet hashSet) {
        p13.u uVar = new p13.u();
        uVar.f351141c = this.f138007i;
        uVar.f351145g = o13.d.f342222h;
        uVar.f351148j = hashSet;
        uVar.f351150l = r13.e.f368605d;
        uVar.f351151m = this;
        uVar.f351152n = n3Var;
        this.f138010o = hashSet;
        return ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(17, uVar);
    }

    @Override // pu4.u, com.tencent.mm.plugin.fts.ui.a
    public void s(p13.v vVar, java.util.HashSet hashSet) {
        java.util.List list = vVar.f351160e;
        if (list == null || list.isEmpty()) {
            return;
        }
        t13.i iVar = new t13.i();
        iVar.f414569e = -32;
        iVar.f414570f = vVar.f351160e;
        iVar.f414566b = false;
        iVar.f414571g = vVar.f351159d;
        this.f138009n.add(iVar);
    }
}
