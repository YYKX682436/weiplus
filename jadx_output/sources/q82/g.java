package q82;

/* loaded from: classes12.dex */
public class g extends com.tencent.mm.plugin.fts.ui.a {
    @Override // t13.k
    public int getType() {
        return 128;
    }

    @Override // com.tencent.mm.plugin.fts.ui.a
    public p13.e l(int i17, long j17, t13.i iVar) {
        if (i17 >= iVar.f414570f.size() || i17 < 0) {
            return null;
        }
        p13.y yVar = (p13.y) iVar.f414570f.get(i17);
        p13.e eVar = new p13.e();
        eVar.f351079g = java.lang.String.valueOf(yVar.hashCode());
        eVar.f351075c = 12;
        return eVar;
    }

    @Override // com.tencent.mm.plugin.fts.ui.a
    public u13.g o(int i17, t13.i iVar) {
        q82.c cVar;
        int i18 = (i17 - iVar.f414565a) - 1;
        if (i18 >= iVar.f414570f.size() || i18 < 0) {
            cVar = null;
        } else {
            p13.y yVar = (p13.y) iVar.f414570f.get(i18);
            cVar = new q82.c(i17);
            cVar.f360738q = yVar;
            cVar.f423762e = iVar.f414571g;
            cVar.n(yVar.f351184b, yVar.f351185c);
            cVar.f360739r = false;
        }
        if (cVar != null) {
            cVar.f423767j = i18 + 1;
        }
        return cVar;
    }

    @Override // com.tencent.mm.plugin.fts.ui.a
    public p13.c q(com.tencent.mm.sdk.platformtools.n3 n3Var, java.util.HashSet hashSet) {
        p13.u uVar = new p13.u();
        uVar.f351140b = 1;
        uVar.f351141c = this.f138007i;
        uVar.f351147i = 1;
        uVar.f351148j = hashSet;
        uVar.f351152n = n3Var;
        uVar.f351151m = this;
        return ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(6, uVar);
    }

    @Override // com.tencent.mm.plugin.fts.ui.a
    public void s(p13.v vVar, java.util.HashSet hashSet) {
        if (k(vVar.f351160e)) {
            t13.i iVar = new t13.i();
            iVar.f414569e = -1;
            iVar.f414571g = vVar.f351159d;
            java.util.List list = vVar.f351160e;
            iVar.f414570f = list;
            if (list.size() > 1) {
                iVar.f414568d = true;
                iVar.f414570f = new java.util.ArrayList(iVar.f414570f.subList(0, 1));
            }
            this.f138009n.add(iVar);
        }
    }
}
