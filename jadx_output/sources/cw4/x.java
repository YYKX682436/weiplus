package cw4;

/* loaded from: classes4.dex */
public final class x implements androidx.lifecycle.y {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.lifecycle.b0 f224290d = new androidx.lifecycle.b0(this, true);

    /* renamed from: e, reason: collision with root package name */
    public final androidx.lifecycle.j0 f224291e = new androidx.lifecycle.j0();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashSet f224292f = new java.util.HashSet();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f224293g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f224294h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public int f224295i;

    public final void a() {
        while (true) {
            java.util.LinkedList linkedList = this.f224294h;
            if (linkedList.size() >= 8) {
                return;
            }
            java.util.LinkedList linkedList2 = this.f224293g;
            if (linkedList2.isEmpty()) {
                return;
            }
            cw4.a0 a0Var = (cw4.a0) kz5.n0.X(linkedList2);
            if (linkedList2.size() > 0) {
                linkedList2.remove(0);
            }
            linkedList.add(a0Var);
            int i17 = this.f224295i + 1;
            this.f224295i = i17;
            if (i17 > 2000) {
                linkedList2.clear();
                com.tencent.mars.xlog.Log.e("MicroMsg.WebTransCgiLogic", "cgi num over limit! %d", 2000);
                return;
            }
            try {
                java.util.LinkedList linkedList3 = new java.util.LinkedList();
                java.util.Iterator it = a0Var.f224193a.iterator();
                while (it.hasNext()) {
                    cw4.z zVar = (cw4.z) it.next();
                    r45.cq6 cq6Var = new r45.cq6();
                    cq6Var.f371791d = 1;
                    cq6Var.f371792e = zVar.f224307b;
                    cq6Var.f371794g = 17;
                    linkedList3.add(cq6Var);
                }
                r45.jp3 jp3Var = new r45.jp3();
                jp3Var.f378007e = linkedList3;
                jp3Var.f378006d = linkedList3.size();
                jp3Var.f378008f = com.tencent.mm.sdk.platformtools.m2.c(com.tencent.mm.sdk.platformtools.x2.f193071a);
                com.tencent.mars.xlog.Log.i("MicroMsg.WebTransCgiLogic", "request.msgCount = " + jp3Var.f378006d + ", request.TargetLang = " + jp3Var.f378008f);
                com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
                lVar.f70664a = jp3Var;
                lVar.f70665b = new r45.kp3();
                lVar.f70666c = "/cgi-bin/micromsg-bin/gettranstext";
                lVar.f70667d = 631;
                lVar.f70668e = 0;
                lVar.f70669f = 0;
                com.tencent.mm.modelbase.o a17 = lVar.a();
                int hashCode = jp3Var.hashCode();
                this.f224292f.add(java.lang.Integer.valueOf(hashCode));
                com.tencent.mars.xlog.Log.i("MicroMsg.WebTransCgiLogic", "translate: reqStringList size = " + linkedList3.size() + " hashcode = " + hashCode);
                ((h80.i) ((com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class))).wi(a17, new cw4.v(this, a0Var, hashCode));
            } catch (java.lang.Exception unused) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WebTransCgiLogic", "translate: do cgi failed！！！");
                linkedList.remove(a0Var);
            }
        }
    }

    @Override // androidx.lifecycle.y
    /* renamed from: getLifecycle */
    public androidx.lifecycle.o mo133getLifecycle() {
        return this.f224290d;
    }
}
