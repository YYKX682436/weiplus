package j23;

/* loaded from: classes12.dex */
public class a extends com.tencent.mm.plugin.fts.ui.a {
    @Override // t13.k
    public int getType() {
        return 8192;
    }

    @Override // com.tencent.mm.plugin.fts.ui.a
    public u13.g o(int i17, t13.i iVar) {
        e23.c cVar;
        int i18 = (i17 - iVar.f414565a) - 1;
        if (iVar.f414566b || i17 != 0) {
            cVar = null;
        } else {
            cVar = new e23.c(i17);
            cVar.f423762e = iVar.f414571g;
        }
        if (cVar != null) {
            cVar.f423767j = i18 + 1;
        }
        return cVar;
    }

    @Override // com.tencent.mm.plugin.fts.ui.a
    public p13.c q(com.tencent.mm.sdk.platformtools.n3 n3Var, java.util.HashSet hashSet) {
        return ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(2, p13.u.b(this.f138007i, new int[]{131072}, new int[]{16}, -1, hashSet, r13.b.f368602d, this, n3Var));
    }

    @Override // com.tencent.mm.plugin.fts.ui.a
    public void s(p13.v vVar, java.util.HashSet hashSet) {
        java.util.List list = this.f138009n;
        list.clear();
        t13.i iVar = new t13.i();
        iVar.f414569e = -4;
        iVar.f414566b = false;
        iVar.f414574j = 1;
        iVar.f414571g = vVar.f351159d;
        iVar.f414570f = new java.util.ArrayList();
        list.add(iVar);
    }
}
