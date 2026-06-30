package j23;

/* loaded from: classes12.dex */
public class b0 extends j23.q {

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f297270q;

    @Override // j23.q, t13.b, t13.k
    public boolean a(android.view.View view, u13.g gVar, boolean z17) {
        super.a(view, gVar, z17);
        if (gVar instanceof e23.i) {
            int i17 = 0;
            while (true) {
                java.util.List list = this.f138009n;
                if (i17 >= list.size()) {
                    break;
                }
                t13.i iVar = (t13.i) list.get(i17);
                if (iVar.f414567c == gVar.f423759b) {
                    iVar.f414572h = !iVar.f414572h;
                    break;
                }
                i17++;
            }
        }
        return true;
    }

    @Override // j23.q, t13.k
    public int getType() {
        return 176;
    }

    @Override // com.tencent.mm.plugin.fts.ui.a, t13.k
    public int j(int i17) {
        java.util.List list = this.f138009n;
        int size = list.size();
        for (int i18 = 0; i18 < size; i18++) {
            t13.i iVar = (t13.i) list.get(i18);
            iVar.f414565a = i17;
            if (iVar.f414566b) {
                i17++;
            }
            if (iVar.f414570f.size() > 3) {
                i17 = iVar.f414572h ? i17 + 3 : i17 + iVar.f414570f.size();
                iVar.f414567c = i17;
                if (iVar.f414568d) {
                    i17++;
                }
            } else {
                i17 += iVar.f414570f.size();
                iVar.f414567c = i17;
            }
        }
        return i17;
    }

    @Override // com.tencent.mm.plugin.fts.ui.a
    public e23.g0 m(int i17, t13.i iVar) {
        e23.n1 n1Var = new e23.n1(i17);
        p13.y yVar = iVar.f414573i;
        n1Var.A = yVar;
        n1Var.f423762e = yVar.f351203u;
        return n1Var;
    }

    @Override // com.tencent.mm.plugin.fts.ui.a
    public e23.s0 n(int i17, t13.i iVar) {
        e23.i iVar2 = new e23.i(i17);
        iVar2.f246868s = com.tencent.mm.R.string.ffy;
        iVar2.f246869t = iVar.f414572h;
        return iVar2;
    }

    @Override // j23.q, com.tencent.mm.plugin.fts.ui.a
    public u13.g o(int i17, t13.i iVar) {
        int i18 = iVar.f414566b ? (i17 - iVar.f414565a) - 1 : i17 - iVar.f414565a;
        if (i18 < 0 || i18 >= iVar.f414570f.size()) {
            return null;
        }
        p13.y yVar = (p13.y) iVar.f414570f.get(i18);
        if (yVar.f351187e.equals("no_result\u200b")) {
            return new e23.j0(i17);
        }
        e23.p1 p1Var = new e23.p1(i17);
        p1Var.f246925q = yVar;
        p1Var.B = iVar.f414573i;
        p1Var.f423762e = yVar.f351203u;
        p1Var.f423764g = -14;
        p1Var.C = 2;
        p1Var.n(yVar.f351184b, yVar.f351185c);
        return p1Var;
    }

    @Override // j23.q, com.tencent.mm.plugin.fts.ui.a
    public p13.c q(com.tencent.mm.sdk.platformtools.n3 n3Var, java.util.HashSet hashSet) {
        this.f297279p = false;
        p13.u uVar = new p13.u();
        uVar.f351141c = this.f138007i;
        uVar.f351150l = r13.e.f368605d;
        uVar.f351143e = this.f297270q;
        uVar.f351151m = this;
        uVar.f351152n = n3Var;
        uVar.f351140b = 10;
        return ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(3, uVar);
    }

    @Override // j23.q, com.tencent.mm.plugin.fts.ui.a
    public void s(p13.v vVar, java.util.HashSet hashSet) {
        if (vVar.f351158c != 0) {
            return;
        }
        int size = vVar.f351160e.size();
        java.util.List list = this.f138009n;
        if (size <= 0) {
            t13.i iVar = new t13.i();
            iVar.f414569e = -2;
            iVar.f414571g = vVar.f351159d;
            iVar.f414566b = false;
            p13.y yVar = new p13.y();
            yVar.f351187e = "no_result\u200b";
            java.util.ArrayList arrayList = new java.util.ArrayList();
            iVar.f414570f = arrayList;
            arrayList.add(yVar);
            list.add(iVar);
            return;
        }
        for (int i17 = 0; i17 < vVar.f351160e.size(); i17++) {
            t13.i iVar2 = new t13.i();
            iVar2.f414566b = true;
            p13.y yVar2 = (p13.y) vVar.f351160e.get(i17);
            iVar2.f414573i = yVar2;
            iVar2.f414571g = vVar.f351159d;
            java.util.List list2 = (java.util.List) yVar2.f351197o;
            iVar2.f414570f = list2;
            if (list2.size() <= 3 || i17 == vVar.f351160e.size() - 1) {
                iVar2.f414572h = false;
                iVar2.f414568d = false;
            } else {
                iVar2.f414572h = true;
                iVar2.f414568d = true;
            }
            list.add(iVar2);
        }
    }

    @Override // j23.q
    public int t() {
        return 2;
    }
}
