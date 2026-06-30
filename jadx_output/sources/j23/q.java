package j23;

/* loaded from: classes12.dex */
public class q extends com.tencent.mm.plugin.fts.ui.a {

    /* renamed from: p, reason: collision with root package name */
    public boolean f297279p;

    public q(android.content.Context context, t13.j jVar, int i17) {
        super(context, jVar, i17);
        this.f297279p = false;
    }

    @Override // t13.b, t13.k
    public boolean a(android.view.View view, u13.g gVar, boolean z17) {
        if (gVar instanceof e23.p0) {
            com.tencent.mm.plugin.fts.ui.x2.h(gVar, t(), this.f297279p);
            return false;
        }
        if (!(gVar instanceof e23.m0)) {
            return false;
        }
        com.tencent.mm.plugin.fts.ui.x2.h(gVar, t(), this.f297279p);
        return false;
    }

    @Override // t13.k
    public int getType() {
        return 112;
    }

    @Override // com.tencent.mm.plugin.fts.ui.a
    public p13.e l(int i17, long j17, t13.i iVar) {
        if (i17 >= iVar.f414570f.size() || i17 < 0) {
            return null;
        }
        p13.y yVar = (p13.y) iVar.f414570f.get(i17);
        p13.e eVar = new p13.e();
        eVar.f351079g = java.lang.String.valueOf(yVar.hashCode());
        if (yVar.f351187e.equals("create_talker_message\u200b")) {
            eVar.f351075c = 22;
            return eVar;
        }
        eVar.f351075c = 11;
        if (com.tencent.mm.storage.z3.o4(yVar.f351187e)) {
            eVar.f351080h = 5;
            return eVar;
        }
        if (yVar.f351187e.equals("appbrandcustomerservicemsg")) {
            eVar.f351080h = 6;
            return eVar;
        }
        if (com.tencent.mm.storage.z3.m4(yVar.f351187e)) {
            eVar.f351080h = 4;
            return eVar;
        }
        if (com.tencent.mm.storage.z3.R4(yVar.f351187e)) {
            eVar.f351080h = 2;
            return eVar;
        }
        if (com.tencent.mm.storage.z3.O4(yVar.f351187e)) {
            eVar.f351080h = 1;
            return eVar;
        }
        eVar.f351080h = 7;
        return eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.plugin.fts.ui.a
    public u13.g o(int i17, t13.i iVar) {
        e23.a0 a0Var;
        e23.a0 a0Var2;
        int i18 = i17 - iVar.f414565a;
        if (iVar.f414566b) {
            i18--;
        }
        if (i18 >= iVar.f414570f.size() || i18 < 0) {
            a0Var = null;
        } else {
            p13.y yVar = (p13.y) iVar.f414570f.get(i18);
            if (yVar.f351187e.equals("create_talker_message\u200b")) {
                a0Var = new e23.a0(i17);
                a0Var.f246771q = iVar.f414570f.size() == 1;
                this.f297279p = true;
            } else {
                if (com.tencent.mm.storage.z3.o4(yVar.f351187e) || com.tencent.mm.storage.z3.C3(yVar.f351187e)) {
                    e23.m0 m0Var = new e23.m0(i17);
                    m0Var.f246894q = yVar;
                    m0Var.n(yVar.f351184b, yVar.f351185c);
                    a0Var2 = m0Var;
                } else {
                    e23.p0 p0Var = new e23.p0(i17);
                    p0Var.f246925q = yVar;
                    p0Var.n(yVar.f351184b, yVar.f351185c);
                    a0Var2 = p0Var;
                }
                a0Var = a0Var2;
            }
        }
        if (a0Var != null) {
            a0Var.f423767j = i18 + 1;
            a0Var.f423762e = iVar.f414571g;
            if (i18 == iVar.f414570f.size() - 1) {
                a0Var.f423761d = false;
            }
        }
        return a0Var;
    }

    @Override // com.tencent.mm.plugin.fts.ui.a
    public p13.c q(com.tencent.mm.sdk.platformtools.n3 n3Var, java.util.HashSet hashSet) {
        this.f297279p = false;
        p13.u uVar = new p13.u();
        uVar.f351141c = this.f138007i;
        uVar.f351148j = hashSet;
        uVar.f351151m = this;
        uVar.f351152n = n3Var;
        uVar.f351140b = 1;
        uVar.f351147i = 3;
        return ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(3, uVar);
    }

    @Override // com.tencent.mm.plugin.fts.ui.a
    public void s(p13.v vVar, java.util.HashSet hashSet) {
        if (k(vVar.f351160e)) {
            vVar.f351160e.removeIf(new j23.q$$a());
            t13.i iVar = new t13.i();
            iVar.f414569e = -2;
            iVar.f414571g = vVar.f351159d;
            java.util.List list = vVar.f351160e;
            iVar.f414570f = list;
            if (list.size() > 3) {
                if (((p13.y) vVar.f351160e.get(3)).f351187e.equals("create_talker_message\u200b")) {
                    iVar.f414568d = false;
                    iVar.f414570f = new java.util.ArrayList(iVar.f414570f.subList(0, 4));
                } else {
                    iVar.f414568d = true;
                    iVar.f414570f = new java.util.ArrayList(iVar.f414570f.subList(0, 3));
                }
            } else if (vVar.f351160e.size() == 1 && ((p13.y) vVar.f351160e.get(0)).f351187e.equals("create_talker_message\u200b")) {
                iVar.f414566b = false;
            }
            this.f138009n.add(iVar);
        }
    }

    public int t() {
        return 0;
    }
}
