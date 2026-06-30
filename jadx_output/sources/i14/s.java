package i14;

/* loaded from: classes12.dex */
public class s extends com.tencent.mm.plugin.fts.ui.a {
    @Override // t13.k
    public int getType() {
        return 129;
    }

    @Override // com.tencent.mm.plugin.fts.ui.a
    public p13.e l(int i17, long j17, t13.i iVar) {
        if (i17 >= iVar.f414570f.size() || i17 < 0) {
            return null;
        }
        p13.y yVar = (p13.y) iVar.f414570f.get(i17);
        p13.e eVar = new p13.e();
        eVar.f351079g = yVar.f351187e;
        eVar.f351075c = 39;
        eVar.f351080h = 1;
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
            gVar = p(yVar.f351184b, i17, yVar, iVar);
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
        i14.k kVar = new i14.k(i18, 129);
        kVar.f287331q = yVar;
        kVar.f423762e = iVar.f414571g;
        kVar.n(yVar.f351184b, yVar.f351185c);
        return kVar;
    }

    @Override // com.tencent.mm.plugin.fts.ui.a
    public p13.c q(com.tencent.mm.sdk.platformtools.n3 n3Var, java.util.HashSet hashSet) {
        return ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(16, p13.u.b(this.f138007i, new int[]{786432}, null, 2, hashSet, null, this, n3Var));
    }

    @Override // com.tencent.mm.plugin.fts.ui.a
    public void s(p13.v vVar, java.util.HashSet hashSet) {
        if (k(vVar.f351160e)) {
            t13.i iVar = new t13.i();
            iVar.f414569e = -30;
            java.util.List list = vVar.f351160e;
            iVar.f414570f = list;
            iVar.f414571g = vVar.f351159d;
            if (list.size() > 1) {
                iVar.f414568d = true;
                iVar.f414570f = new java.util.ArrayList(iVar.f414570f.subList(0, 1));
            }
            this.f138009n.add(iVar);
        }
    }
}
