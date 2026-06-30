package ea1;

/* loaded from: classes12.dex */
public class m extends com.tencent.mm.plugin.fts.ui.a {
    @Override // t13.k
    public int getType() {
        return 4224;
    }

    @Override // com.tencent.mm.plugin.fts.ui.a
    public u13.g o(int i17, t13.i iVar) {
        ea1.k kVar;
        int i18 = (i17 - iVar.f414565a) - 1;
        if (i18 >= iVar.f414570f.size() || i18 < 0) {
            kVar = null;
        } else {
            p13.y yVar = (p13.y) iVar.f414570f.get(i18);
            kVar = new ea1.k(i17);
            kVar.f250531r = yVar;
            kVar.f423762e = iVar.f414571g;
            kVar.n(yVar.f351184b, yVar.f351185c);
        }
        if (kVar != null) {
            kVar.f423767j = i18 + 1;
        }
        return kVar;
    }

    @Override // com.tencent.mm.plugin.fts.ui.a
    public p13.c q(com.tencent.mm.sdk.platformtools.n3 n3Var, java.util.HashSet hashSet) {
        p13.u uVar = new p13.u();
        uVar.f351141c = this.f138007i;
        uVar.f351150l = r13.d.f368604d;
        uVar.f351151m = this;
        uVar.f351152n = n3Var;
        uVar.f351148j = hashSet;
        return ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(7, uVar);
    }

    @Override // com.tencent.mm.plugin.fts.ui.a
    public void s(p13.v vVar, java.util.HashSet hashSet) {
        java.util.List list = vVar.f351160e;
        if (list != null && !list.isEmpty()) {
            m21.x xVar = new m21.x();
            java.lang.String str = this.f138007i;
            if (str != null) {
                str = str.replaceAll(",", " ");
            }
            xVar.a("20KeyWordId", str + ",");
            xVar.a("21ViewType", "2,");
            xVar.a("22OpType", "1,");
            xVar.a("23ResultCount", list.size() + ",");
            xVar.a("24ClickPos", ",");
            xVar.a("25ClickAppUserName", ",");
            com.tencent.mars.xlog.Log.i("MicroMsg.FTSWeAppDetailUIUnit", "report oreh LocalSearchWeApp(13963), %s", xVar.c());
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13963, xVar);
        }
        if (k(vVar.f351160e)) {
            t13.i iVar = new t13.i();
            iVar.f414569e = -13;
            iVar.f414571g = vVar.f351159d;
            iVar.f414570f = vVar.f351160e;
            this.f138009n.add(iVar);
        }
    }
}
