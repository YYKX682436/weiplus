package j23;

/* loaded from: classes12.dex */
public class j extends j23.q {

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f297274q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.storage.a3 f297275r;

    @Override // j23.q, t13.k
    public int getType() {
        return 160;
    }

    @Override // com.tencent.mm.plugin.fts.ui.a
    public e23.g0 m(int i17, t13.i iVar) {
        e23.o oVar = new e23.o(i17);
        oVar.f246917v = this.f297274q;
        oVar.f246919x = 0;
        java.util.Iterator it = iVar.f414570f.iterator();
        while (it.hasNext()) {
            java.lang.Object obj = ((p13.y) it.next()).f351197o;
            if (obj instanceof java.lang.Integer) {
                oVar.f246919x += ((java.lang.Integer) obj).intValue();
            }
        }
        return oVar;
    }

    @Override // j23.q, com.tencent.mm.plugin.fts.ui.a
    public u13.g o(int i17, t13.i iVar) {
        u13.g gVar;
        int i18 = i17 - iVar.f414565a;
        if (iVar.f414566b) {
            i18--;
        }
        if (i18 >= iVar.f414570f.size() || i18 < 0) {
            gVar = null;
        } else {
            p13.y yVar = (p13.y) iVar.f414570f.get(i18);
            if (yVar.f351187e.equals("create_talker_message\u200b")) {
                e23.a0 a0Var = new e23.a0(i17);
                a0Var.f423761d = false;
                a0Var.f246772r = this.f297274q;
                this.f297279p = true;
                gVar = a0Var;
            } else if (yVar.f351187e.equals("no_result\u200b")) {
                gVar = new e23.j0(i17);
            } else {
                e23.k kVar = new e23.k(i18);
                kVar.f246925q = yVar;
                kVar.f423762e = iVar.f414571g;
                kVar.B = this.f297275r;
                kVar.n(yVar.f351184b, yVar.f351185c);
                gVar = kVar;
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
        java.lang.String str = this.f297274q;
        uVar.f351142d = str;
        uVar.f351151m = this;
        uVar.f351152n = n3Var;
        if (str.equals("opencustomerservicemsg")) {
            uVar.f351140b = 114;
        } else if (com.tencent.mm.storage.z3.C3(this.f297274q)) {
            uVar.f351140b = nd1.w0.CTRL_INDEX;
        } else {
            uVar.f351140b = 3;
        }
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
