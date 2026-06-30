package j23;

/* loaded from: classes12.dex */
public class i extends com.tencent.mm.plugin.fts.ui.a {

    /* renamed from: p, reason: collision with root package name */
    public boolean f297273p;

    public i(android.content.Context context, t13.j jVar, int i17) {
        super(context, jVar, i17);
        this.f297273p = false;
    }

    @Override // t13.k
    public int getType() {
        return 32;
    }

    @Override // com.tencent.mm.plugin.fts.ui.a
    public p13.e l(int i17, long j17, t13.i iVar) {
        if (i17 >= iVar.f414570f.size() || i17 < 0) {
            return null;
        }
        p13.y yVar = (p13.y) iVar.f414570f.get(i17);
        p13.e eVar = new p13.e();
        eVar.f351079g = java.lang.String.valueOf(yVar.hashCode());
        int i18 = yVar.f351184b;
        if (i18 != 131072 && i18 != 131081) {
            return null;
        }
        eVar.f351075c = 3;
        return eVar;
    }

    @Override // com.tencent.mm.plugin.fts.ui.a
    public u13.g o(int i17, t13.i iVar) {
        int i18;
        u13.g gVar = null;
        if (iVar.f414566b) {
            i18 = (i17 - iVar.f414565a) - 1;
            if (i18 < iVar.f414570f.size() && i18 >= 0) {
                p13.y yVar = (p13.y) iVar.f414570f.get(i18);
                u13.g p17 = p(yVar.f351184b, i17, yVar, iVar);
                if (p17 != null) {
                    p17.n(yVar.f351184b, yVar.f351185c);
                }
                gVar = p17;
            }
        } else {
            i18 = 0;
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
        int i19 = yVar.f351184b;
        if (i19 != 131072 && i19 != 131081) {
            return null;
        }
        e23.u1 u1Var = new e23.u1(i18);
        u1Var.f246839q = yVar;
        u1Var.f423762e = iVar.f414571g;
        u1Var.n(yVar.f351184b, yVar.f351185c);
        return u1Var;
    }

    @Override // com.tencent.mm.plugin.fts.ui.a
    public p13.c q(com.tencent.mm.sdk.platformtools.n3 n3Var, java.util.HashSet hashSet) {
        p13.u uVar = new p13.u();
        if (this.f297273p) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSContactUIUnit", "fts: search by pinyin: %s", this.f138007i);
            uVar.f351140b = 65;
        } else {
            uVar.f351140b = 64;
        }
        uVar.f351141c = this.f138007i;
        uVar.f351150l = r13.b.f368602d;
        uVar.f351145g = new int[]{131072, 131081};
        uVar.f351147i = 3;
        uVar.f351148j = hashSet;
        uVar.f351151m = this;
        uVar.f351152n = n3Var;
        this.f138010o = hashSet;
        return ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(2, uVar);
    }

    @Override // com.tencent.mm.plugin.fts.ui.a
    public void s(p13.v vVar, java.util.HashSet hashSet) {
        java.util.Set Ui = ((vh0.f3) ((vh0.n1) i95.n0.c(vh0.n1.class))).Ui();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (p13.y yVar : vVar.f351160e) {
            java.lang.String str = yVar.f351187e;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str == null) {
                str = "";
            }
            if (!((java.util.HashSet) Ui).contains(str)) {
                arrayList.add(yVar);
            }
        }
        t13.i iVar = new t13.i();
        iVar.f414569e = -4;
        iVar.f414570f = arrayList;
        iVar.f414566b = k(arrayList);
        iVar.f414571g = vVar.f351159d;
        if (iVar.f414570f.size() > 3) {
            iVar.f414568d = true;
            iVar.f414570f = new java.util.ArrayList(iVar.f414570f.subList(0, 3));
        }
        if (k(arrayList)) {
            this.f138009n.add(iVar);
        }
    }
}
