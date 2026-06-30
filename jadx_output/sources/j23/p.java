package j23;

/* loaded from: classes12.dex */
public class p extends j23.q {
    @Override // j23.q, t13.k
    public int getType() {
        return 4176;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j23.q, com.tencent.mm.plugin.fts.ui.a
    public u13.g o(int i17, t13.i iVar) {
        u13.g gVar;
        e23.m0 m0Var;
        int i18 = i17 - iVar.f414565a;
        if (iVar.f414566b) {
            i18--;
        }
        if (i18 >= iVar.f414570f.size() || i18 < 0) {
            gVar = null;
        } else {
            p13.y yVar = (p13.y) iVar.f414570f.get(i18);
            if (yVar.f351187e.equals("create_talker_message\u200b")) {
                gVar = new e23.a0(i17);
                gVar.f423761d = false;
                this.f297279p = true;
            } else if (yVar.f351187e.equals("no_result\u200b")) {
                gVar = new e23.j0(i17);
            } else {
                if (com.tencent.mm.storage.z3.o4(yVar.f351187e) || com.tencent.mm.storage.z3.C3(yVar.f351187e)) {
                    e23.m0 m0Var2 = new e23.m0(i17);
                    m0Var2.f246894q = yVar;
                    m0Var2.n(yVar.f351184b, yVar.f351185c);
                    m0Var = m0Var2;
                } else {
                    e23.p0 p0Var = new e23.p0(i17);
                    p0Var.f246925q = yVar;
                    p0Var.n(yVar.f351184b, yVar.f351185c);
                    m0Var = p0Var;
                }
                gVar = m0Var;
            }
        }
        if (gVar != null) {
            gVar.f423767j = i18 + 1;
            gVar.f423762e = iVar.f414571g;
        }
        return gVar;
    }

    @Override // j23.q, com.tencent.mm.plugin.fts.ui.a
    public p13.c q(com.tencent.mm.sdk.platformtools.n3 n3Var, java.util.HashSet hashSet) {
        this.f297279p = false;
        p13.u uVar = new p13.u();
        uVar.f351141c = this.f138007i;
        uVar.f351148j = hashSet;
        uVar.f351151m = this;
        uVar.f351152n = n3Var;
        return ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(3, uVar);
    }

    @Override // j23.q, com.tencent.mm.plugin.fts.ui.a
    public void s(p13.v vVar, java.util.HashSet hashSet) {
        java.util.List list = vVar.f351160e;
        if (k(list)) {
            int size = list.size();
            java.util.List list2 = this.f138009n;
            if (size > 0) {
                p13.y yVar = (p13.y) list.get(0);
                if (yVar.f351187e.equals("create_talker_message\u200b")) {
                    t13.i iVar = new t13.i();
                    iVar.f414566b = false;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    iVar.f414570f = arrayList;
                    arrayList.add(yVar);
                    iVar.f414571g = vVar.f351159d;
                    iVar.f414569e = -2;
                    list2.add(iVar);
                    list.remove(0);
                }
            }
            t13.i iVar2 = new t13.i();
            iVar2.f414569e = -2;
            iVar2.f414571g = vVar.f351159d;
            if (list.size() == 0) {
                iVar2.f414566b = false;
                p13.y yVar2 = new p13.y();
                yVar2.f351187e = "no_result\u200b";
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                iVar2.f414570f = arrayList2;
                arrayList2.add(yVar2);
            } else {
                iVar2.f414570f = list;
            }
            list2.add(iVar2);
        }
    }
}
