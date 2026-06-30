package ea1;

/* loaded from: classes12.dex */
public class o extends com.tencent.mm.plugin.fts.ui.a {
    @Override // t13.k
    public int getType() {
        return 144;
    }

    @Override // com.tencent.mm.plugin.fts.ui.a
    public p13.e l(int i17, long j17, t13.i iVar) {
        if (i17 >= iVar.f414570f.size() || i17 < 0) {
            return null;
        }
        p13.y yVar = (p13.y) iVar.f414570f.get(i17);
        p13.e eVar = new p13.e();
        eVar.f351079g = java.lang.String.valueOf(yVar.hashCode());
        eVar.f351075c = 19;
        com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo wi6 = ((et.i2) ((ft.l4) i95.n0.c(ft.l4.class))).wi(yVar.f351187e);
        if (wi6 == null) {
            return eVar;
        }
        eVar.f351082j = wi6.f76355w;
        return eVar;
    }

    @Override // com.tencent.mm.plugin.fts.ui.a
    public u13.g o(int i17, t13.i iVar) {
        int i18 = (i17 - iVar.f414565a) - 1;
        u13.g p17 = (i18 >= iVar.f414570f.size() || i18 < 0) ? null : p(393216, i17, (p13.y) iVar.f414570f.get(i18), iVar);
        if (p17 != null) {
            p17.f423767j = i18 + 1;
            if (i18 == iVar.f414570f.size() - 1) {
                p17.f423761d = false;
            }
        }
        return p17;
    }

    @Override // com.tencent.mm.plugin.fts.ui.a
    public u13.g p(int i17, int i18, p13.y yVar, t13.i iVar) {
        ea1.k kVar = new ea1.k(i18);
        kVar.f250531r = yVar;
        kVar.f423762e = iVar.f414571g;
        kVar.n(yVar.f351184b, yVar.f351185c);
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
            xVar.a("21ViewType", "1,");
            xVar.a("22OpType", "1,");
            xVar.a("23ResultCount", list.size() + ",");
            xVar.a("24ClickPos", ",");
            xVar.a("25ClickAppUserName", ",");
            com.tencent.mars.xlog.Log.i("MicroMsg.FTSWeAppUIUnit", "report oreh LocalSearchWeApp(13963), %s", xVar.c());
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13963, xVar);
        }
        if (k(vVar.f351160e)) {
            t13.i iVar = new t13.i();
            iVar.f414569e = -13;
            java.util.List list2 = vVar.f351160e;
            iVar.f414570f = list2;
            iVar.f414571g = vVar.f351159d;
            if (list2.size() > 1) {
                iVar.f414568d = true;
                iVar.f414570f = new java.util.ArrayList(iVar.f414570f.subList(0, 1));
            }
            this.f138009n.add(iVar);
        }
    }
}
