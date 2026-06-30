package od2;

/* loaded from: classes12.dex */
public class l extends com.tencent.mm.plugin.fts.ui.a {

    /* renamed from: p, reason: collision with root package name */
    public final java.util.ArrayList f344624p;

    public l(android.content.Context context, t13.j jVar, int i17) {
        super(context, jVar, i17);
        this.f344624p = new java.util.ArrayList();
    }

    @Override // t13.k
    public int getType() {
        return 8224;
    }

    @Override // com.tencent.mm.plugin.fts.ui.a
    public u13.g o(int i17, t13.i iVar) {
        od2.o oVar;
        int i18 = (i17 - iVar.f414565a) - 1;
        if (i18 >= iVar.f414570f.size() || i18 < 0) {
            oVar = null;
        } else {
            p13.y yVar = (p13.y) iVar.f414570f.get(i18);
            oVar = new od2.o(i17);
            oVar.f344634s = yVar;
            oVar.f423762e = iVar.f414571g;
            oVar.n(yVar.f351184b, yVar.f351185c);
        }
        if (oVar != null) {
            oVar.f423767j = i18 + 1;
        }
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
        return ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(13, uVar);
    }

    @Override // com.tencent.mm.plugin.fts.ui.a
    public void s(p13.v vVar, java.util.HashSet hashSet) {
        java.util.List list = vVar.f351160e;
        java.util.ArrayList arrayList = this.f344624p;
        arrayList.clear();
        if (k(vVar.f351160e)) {
            t13.i iVar = new t13.i();
            iVar.f414569e = -23;
            iVar.f414571g = vVar.f351159d;
            iVar.f414570f = vVar.f351160e;
            this.f138009n.add(iVar);
            java.util.Iterator it = iVar.f414570f.iterator();
            while (it.hasNext()) {
                java.lang.String str = ((p13.y) it.next()).f351187e;
                if (str != null) {
                    arrayList.add(str);
                }
            }
        }
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ((com.tencent.mm.plugin.finder.service.s1) ((zy2.e6) i95.n0.c(zy2.e6.class))).Vi(arrayList, ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.d0.clicfg_search_finder_follow_expired_time_threshold, 300000L), null);
    }
}
