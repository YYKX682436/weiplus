package od2;

/* loaded from: classes12.dex */
public class r extends com.tencent.mm.plugin.fts.ui.a {

    /* renamed from: p, reason: collision with root package name */
    public final java.util.ArrayList f344641p;

    /* renamed from: q, reason: collision with root package name */
    public int f344642q;

    public r(android.content.Context context, t13.j jVar, int i17) {
        super(context, jVar, i17);
        this.f344641p = new java.util.ArrayList();
        this.f344642q = 0;
    }

    @Override // t13.k
    public int getType() {
        return 133;
    }

    @Override // t13.b, t13.k
    public int i() {
        return this.f344642q;
    }

    @Override // com.tencent.mm.plugin.fts.ui.a
    public p13.e l(int i17, long j17, t13.i iVar) {
        if (i17 >= iVar.f414570f.size() || i17 < 0) {
            return null;
        }
        p13.y yVar = (p13.y) iVar.f414570f.get(i17);
        p13.e eVar = new p13.e();
        eVar.f351079g = java.lang.String.valueOf(yVar.hashCode());
        eVar.f351075c = 31;
        eVar.f351082j = yVar.f351187e;
        return eVar;
    }

    @Override // com.tencent.mm.plugin.fts.ui.a
    public u13.g o(int i17, t13.i iVar) {
        int i18 = (i17 - iVar.f414565a) - 1;
        u13.g p17 = (i18 >= iVar.f414570f.size() || i18 < 0) ? null : p(589824, i17, (p13.y) iVar.f414570f.get(i18), iVar);
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
        od2.o oVar = new od2.o(i18);
        oVar.f344634s = yVar;
        oVar.f423762e = iVar.f414571g;
        if (yVar.f351204v) {
            oVar.f344638w = this.f414559e.getResources().getString(com.tencent.mm.R.string.ito);
        }
        oVar.n(yVar.f351184b, yVar.f351185c);
        return oVar;
    }

    @Override // com.tencent.mm.plugin.fts.ui.a
    public p13.c q(com.tencent.mm.sdk.platformtools.n3 n3Var, java.util.HashSet hashSet) {
        p13.u uVar = new p13.u();
        uVar.f351141c = this.f138007i;
        uVar.f351150l = r13.d.f368604d;
        uVar.f351151m = this;
        uVar.f351152n = n3Var;
        uVar.f351148j = hashSet;
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSFinderFollowerUIUnit", "doSearch, request.query = " + uVar.f351141c);
        return ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(13, uVar);
    }

    @Override // com.tencent.mm.plugin.fts.ui.a
    public void s(p13.v vVar, java.util.HashSet hashSet) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSFinderFollowerUIUnit", "setResult, ftsResult.");
        java.util.ArrayList arrayList = this.f344641p;
        arrayList.clear();
        if (k(vVar.f351160e)) {
            this.f344642q = vVar.f351160e.size();
            t13.i iVar = new t13.i();
            iVar.f414569e = -23;
            java.util.List list = vVar.f351160e;
            iVar.f414570f = list;
            iVar.f414571g = vVar.f351159d;
            if (list.size() > 1) {
                iVar.f414568d = true;
                iVar.f414570f = new java.util.ArrayList(iVar.f414570f.subList(0, 1));
            }
            this.f138009n.add(iVar);
            java.util.Iterator it = iVar.f414570f.iterator();
            while (it.hasNext()) {
                arrayList.add(((p13.y) it.next()).f351187e);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.FTSFinderFollowerUIUnit", "setResult, userNames = " + arrayList);
        }
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ((com.tencent.mm.plugin.finder.service.s1) ((zy2.e6) i95.n0.c(zy2.e6.class))).Vi(arrayList, ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.d0.clicfg_search_finder_follow_expired_time_threshold, 300000L), null);
    }
}
