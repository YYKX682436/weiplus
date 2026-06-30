package pu4;

/* loaded from: classes12.dex */
public class n extends com.tencent.mm.plugin.fts.ui.a {
    @Override // t13.k
    public int getType() {
        return 288;
    }

    @Override // com.tencent.mm.plugin.fts.ui.a
    public u13.g o(int i17, t13.i iVar) {
        int i18 = iVar.f414566b ? (i17 - iVar.f414565a) - 1 : 0;
        if (i18 < 0 || i18 >= iVar.f414570f.size()) {
            return null;
        }
        p13.y yVar = (p13.y) iVar.f414570f.get(i18);
        pu4.l lVar = new pu4.l(i17);
        lVar.f358447q = yVar;
        lVar.f423762e = iVar.f414571g;
        lVar.n(yVar.f351184b, yVar.f351185c);
        if (i18 == iVar.f414570f.size() - 1) {
            lVar.f423761d = false;
        }
        lVar.f423767j = i18 + 1;
        return lVar;
    }

    @Override // com.tencent.mm.plugin.fts.ui.a
    public p13.c q(com.tencent.mm.sdk.platformtools.n3 n3Var, java.util.HashSet hashSet) {
        p13.u uVar = new p13.u();
        uVar.f351141c = this.f138007i;
        uVar.f351145g = o13.d.f342223i;
        uVar.f351147i = 4;
        uVar.f351148j = hashSet;
        uVar.f351150l = r13.e.f368605d;
        uVar.f351151m = this;
        uVar.f351152n = n3Var;
        this.f138010o = hashSet;
        return ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(18, uVar);
    }

    @Override // com.tencent.mm.plugin.fts.ui.a
    public void s(p13.v vVar, java.util.HashSet hashSet) {
        java.util.List list = vVar.f351160e;
        if (list == null || list.isEmpty()) {
            return;
        }
        t13.i iVar = new t13.i();
        iVar.f414569e = -31;
        java.util.List list2 = vVar.f351160e;
        iVar.f414570f = list2;
        iVar.f414566b = k(list2);
        iVar.f414571g = vVar.f351159d;
        if (iVar.f414570f.size() > 3) {
            iVar.f414568d = true;
            iVar.f414570f = new java.util.ArrayList(iVar.f414570f.subList(0, 3));
        }
        if (k(vVar.f351160e)) {
            this.f138009n.add(iVar);
        }
    }
}
