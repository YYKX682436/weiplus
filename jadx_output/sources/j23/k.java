package j23;

/* loaded from: classes12.dex */
public class k extends j23.b0 {

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f297276r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f297277s;

    /* renamed from: t, reason: collision with root package name */
    public int f297278t;

    @Override // j23.b0, j23.q, t13.k
    public int getType() {
        return 192;
    }

    @Override // j23.b0, com.tencent.mm.plugin.fts.ui.a
    public e23.g0 m(int i17, t13.i iVar) {
        e23.r rVar = new e23.r(i17);
        rVar.A = iVar.f414573i;
        rVar.f246952z = this.f297277s;
        return rVar;
    }

    @Override // j23.b0, j23.q, com.tencent.mm.plugin.fts.ui.a
    public u13.g o(int i17, t13.i iVar) {
        int i18 = iVar.f414566b ? (i17 - iVar.f414565a) - 1 : i17 - iVar.f414565a;
        if (i18 < 0 || i18 >= iVar.f414570f.size()) {
            return null;
        }
        p13.y yVar = (p13.y) iVar.f414570f.get(i18);
        if (yVar.f351187e.equals("no_result\u200b")) {
            return new e23.j0(i17);
        }
        e23.t tVar = new e23.t(i17);
        tVar.f246925q = yVar;
        tVar.f423762e = yVar.f351203u;
        tVar.n(yVar.f351184b, yVar.f351185c);
        return tVar;
    }

    @Override // j23.b0, j23.q, com.tencent.mm.plugin.fts.ui.a
    public p13.c q(com.tencent.mm.sdk.platformtools.n3 n3Var, java.util.HashSet hashSet) {
        this.f297279p = false;
        p13.u uVar = new p13.u();
        uVar.f351141c = this.f138007i;
        uVar.f351150l = r13.e.f368605d;
        uVar.f351142d = this.f297277s;
        uVar.f351143e = this.f297270q;
        uVar.f351144f = this.f297276r;
        uVar.f351151m = this;
        uVar.f351152n = n3Var;
        uVar.f351140b = 11;
        return ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(3, uVar);
    }

    @Override // j23.b0, j23.q
    public int t() {
        return this.f297278t;
    }
}
