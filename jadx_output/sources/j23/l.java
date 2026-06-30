package j23;

/* loaded from: classes12.dex */
public class l extends com.tencent.mm.plugin.fts.ui.a {
    @Override // t13.k
    public int getType() {
        return 64;
    }

    @Override // com.tencent.mm.plugin.fts.ui.a
    public u13.g o(int i17, t13.i iVar) {
        int i18 = (i17 - iVar.f414565a) - 1;
        u13.g p17 = (i18 >= iVar.f414570f.size() || i18 < 0) ? null : p(262144, i17, (p13.y) iVar.f414570f.get(i18), iVar);
        if (p17 != null) {
            p17.f423767j = i18 + 1;
        }
        return p17;
    }

    @Override // com.tencent.mm.plugin.fts.ui.a
    public u13.g p(int i17, int i18, p13.y yVar, t13.i iVar) {
        e23.d0 d0Var = new e23.d0(i18);
        d0Var.f246809q = yVar;
        d0Var.f423762e = iVar.f414571g;
        d0Var.n(yVar.f351184b, yVar.f351185c);
        return d0Var;
    }

    @Override // com.tencent.mm.plugin.fts.ui.a
    public p13.c q(com.tencent.mm.sdk.platformtools.n3 n3Var, java.util.HashSet hashSet) {
        hashSet.add("62");
        if (u11.c.f((java.lang.String) gm0.j1.u().c().l(274436, null))) {
            hashSet.add("65");
        }
        ((zq1.a0) gm0.j1.s(zq1.a0.class)).getClass();
        hashSet.add("63");
        ((ab5.a) ((com.tencent.mm.plugin.appbrand.service.b5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.b5.class))).getClass();
        if (!(((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p("appbrandcustomerservicemsg") != null)) {
            hashSet.add(java.lang.String.valueOf(69));
        }
        if (!((ab5.j) ((com.tencent.mm.plugin.appbrand.service.j5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.j5.class))).wi()) {
            hashSet.add(java.lang.String.valueOf(71));
        }
        if (!((l41.b2) ((j41.y) i95.n0.c(j41.y.class))).wi()) {
            hashSet.add(java.lang.String.valueOf(74));
        }
        if (!((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n("gh_b4af18eac3d5", true).r2()) {
            hashSet.add(java.lang.String.valueOf(73));
        }
        if (!((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n("gh_e087bb5b95e6", true).r2()) {
            hashSet.add(java.lang.String.valueOf(76));
        }
        p13.u uVar = new p13.u();
        uVar.f351141c = this.f138007i;
        uVar.f351152n = n3Var;
        uVar.f351148j = hashSet;
        uVar.f351151m = this;
        uVar.f351140b = 98;
        uVar.f351150l = r13.c.f368603d;
        return ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(4, uVar);
    }

    @Override // com.tencent.mm.plugin.fts.ui.a
    public void s(p13.v vVar, java.util.HashSet hashSet) {
        if (k(vVar.f351160e)) {
            t13.i iVar = new t13.i();
            iVar.f414569e = -6;
            iVar.f414571g = vVar.f351159d;
            iVar.f414570f = vVar.f351160e;
            iVar.f414568d = false;
            this.f138009n.add(iVar);
        }
    }
}
