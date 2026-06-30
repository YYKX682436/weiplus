package j23;

/* loaded from: classes12.dex */
public class e extends com.tencent.mm.plugin.fts.ui.a {
    @Override // t13.k
    public int getType() {
        return 4128;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.plugin.fts.ui.a
    public u13.g o(int i17, t13.i iVar) {
        e23.x xVar;
        int i18 = (i17 - iVar.f414565a) - 1;
        if (i18 >= iVar.f414570f.size() || i18 < 0) {
            xVar = null;
        } else {
            p13.y yVar = (p13.y) iVar.f414570f.get(i18);
            if (yVar.f351187e.equals("create_chatroom\u200b")) {
                xVar = new e23.x(i17);
                xVar.f423762e = iVar.f414571g;
            } else {
                e23.s1 s1Var = new e23.s1(i17);
                s1Var.f246958q = yVar;
                s1Var.f423762e = iVar.f414571g;
                s1Var.n(yVar.f351184b, yVar.f351185c);
                xVar = s1Var;
            }
        }
        if (xVar != null) {
            xVar.f423767j = i18 + 1;
        }
        return xVar;
    }

    @Override // com.tencent.mm.plugin.fts.ui.a
    public p13.c q(com.tencent.mm.sdk.platformtools.n3 n3Var, java.util.HashSet hashSet) {
        p13.u uVar = new p13.u();
        uVar.f351140b = 32;
        uVar.f351141c = this.f138007i;
        uVar.f351148j = hashSet;
        uVar.f351150l = r13.a.f368601d;
        uVar.f351151m = this;
        uVar.f351152n = n3Var;
        return ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(2, uVar);
    }

    @Override // com.tencent.mm.plugin.fts.ui.a
    public void s(p13.v vVar, java.util.HashSet hashSet) {
        if (k(vVar.f351160e)) {
            t13.i iVar = new t13.i();
            iVar.f414569e = -3;
            iVar.f414570f = vVar.f351160e;
            iVar.f414571g = vVar.f351159d;
            iVar.f414568d = false;
            this.f138009n.add(iVar);
        }
    }
}
