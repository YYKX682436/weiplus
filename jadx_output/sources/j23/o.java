package j23;

/* loaded from: classes12.dex */
public class o extends com.tencent.mm.plugin.fts.ui.a {
    @Override // t13.k
    public int getType() {
        return 51;
    }

    @Override // com.tencent.mm.plugin.fts.ui.a
    public p13.e l(int i17, long j17, t13.i iVar) {
        if (i17 >= iVar.f414570f.size() || i17 < 0) {
            return null;
        }
        p13.y yVar = (p13.y) iVar.f414570f.get(i17);
        p13.e eVar = new p13.e();
        int i18 = yVar.f351184b;
        if (i18 == 131090) {
            eVar.f351075c = 33;
            eVar.f351079g = java.lang.String.valueOf(yVar.hashCode());
            eVar.f351080h = 1;
        } else {
            if (i18 != 131089) {
                return null;
            }
            eVar.f351075c = 33;
            eVar.f351079g = java.lang.String.valueOf(yVar.hashCode());
            eVar.f351080h = 2;
        }
        return eVar;
    }

    @Override // com.tencent.mm.plugin.fts.ui.a
    public u13.g o(int i17, t13.i iVar) {
        u13.g gVar;
        int i18 = (i17 - iVar.f414565a) - 1;
        if (i18 >= iVar.f414570f.size() || i18 < 0) {
            gVar = null;
        } else {
            p13.y yVar = (p13.y) iVar.f414570f.get(i18);
            gVar = p(131089, i17, yVar, iVar);
            gVar.n(yVar.f351184b, yVar.f351185c);
        }
        if (gVar != null) {
            gVar.f423767j = i18 + 1;
            if (i18 == iVar.f414570f.size() - 1) {
                gVar.f423761d = false;
            }
        }
        return gVar;
    }

    @Override // com.tencent.mm.plugin.fts.ui.a
    public u13.g p(int i17, int i18, p13.y yVar, t13.i iVar) {
        e23.u1 u1Var = new e23.u1(19, i18);
        u1Var.f246839q = yVar;
        u1Var.f423762e = iVar.f414571g;
        u1Var.n(yVar.f351184b, yVar.f351185c);
        return u1Var;
    }

    @Override // com.tencent.mm.plugin.fts.ui.a
    public p13.c q(com.tencent.mm.sdk.platformtools.n3 n3Var, java.util.HashSet hashSet) {
        p13.u uVar = new p13.u();
        uVar.f351140b = 112;
        uVar.f351147i = 3;
        uVar.f351141c = this.f138007i;
        uVar.f351148j = hashSet;
        uVar.f351150l = r13.b.f368602d;
        uVar.f351151m = this;
        uVar.f351152n = n3Var;
        return ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(14, uVar);
    }

    @Override // com.tencent.mm.plugin.fts.ui.a
    public void s(p13.v vVar, java.util.HashSet hashSet) {
        if (k(vVar.f351160e)) {
            t13.i iVar = new t13.i();
            java.util.List list = vVar.f351160e;
            iVar.f414570f = list;
            iVar.f414569e = -24;
            iVar.f414571g = vVar.f351159d;
            if (list.size() > 3) {
                iVar.f414568d = true;
                iVar.f414570f = new java.util.ArrayList(iVar.f414570f.subList(0, 3));
            }
            this.f138009n.add(iVar);
        }
    }
}
