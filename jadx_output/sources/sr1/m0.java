package sr1;

/* loaded from: classes12.dex */
public class m0 extends com.tencent.mm.plugin.fts.ui.a {
    @Override // t13.k
    public int getType() {
        return 4209;
    }

    @Override // com.tencent.mm.plugin.fts.ui.a
    public u13.g o(int i17, t13.i iVar) {
        u13.g gVar;
        int i18 = (i17 - iVar.f414565a) - 1;
        if (i18 >= iVar.f414570f.size() || i18 < 0) {
            gVar = null;
        } else {
            p13.y yVar = (p13.y) iVar.f414570f.get(i18);
            gVar = p(yVar.f351184b, i17, yVar, iVar);
            gVar.n(yVar.f351184b, yVar.f351185c);
        }
        if (gVar != null) {
            gVar.f423767j = i18 + 1;
        }
        return gVar;
    }

    @Override // com.tencent.mm.plugin.fts.ui.a
    public u13.g p(int i17, int i18, p13.y yVar, t13.i iVar) {
        sr1.a0 a0Var = new sr1.a0(4209, i18);
        a0Var.f411447q = yVar;
        a0Var.f423762e = iVar.f414571g;
        a0Var.n(yVar.f351184b, yVar.f351185c);
        return a0Var;
    }

    @Override // com.tencent.mm.plugin.fts.ui.a
    public p13.c q(com.tencent.mm.sdk.platformtools.n3 n3Var, java.util.HashSet hashSet) {
        hashSet.add("gh_43f2581f6fd6");
        hashSet.addAll(com.tencent.mm.storage.z3.u3());
        if (1 == ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_minishop_plugin_enabled, 1)) {
            hashSet.add("gh_579db1f2cf89");
        }
        hashSet.add("gh_25d9ac85a4bc");
        return ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(2, p13.u.b(this.f138007i, new int[]{2097171}, null, -1, hashSet, r13.b.f368602d, this, n3Var));
    }

    @Override // com.tencent.mm.plugin.fts.ui.a
    public void s(p13.v vVar, java.util.HashSet hashSet) {
        if (k(vVar.f351160e)) {
            t13.i iVar = new t13.i();
            iVar.f414569e = -27;
            iVar.f414571g = vVar.f351159d;
            iVar.f414570f = vVar.f351160e;
            this.f138009n.add(iVar);
        }
    }
}
