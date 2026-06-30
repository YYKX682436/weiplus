package dk2;

/* loaded from: classes3.dex */
public final class i1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.p f233598a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f233599b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f233600c;

    public i1(yz5.p pVar, int i17, dk2.r4 r4Var) {
        this.f233598a = pVar;
        this.f233599b = i17;
        this.f233600c = r4Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.util.LinkedList list;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (fVar.f70615a == 0 && fVar.f70616b == 0 && (list = ((r45.bq1) fVar.f70618d).getList(1)) != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                java.util.LinkedList<r45.kv1> list2 = ((r45.yp1) it.next()).getList(4);
                if (list2 != null) {
                    for (r45.kv1 kv1Var : list2) {
                        ce2.g gVar = ce2.i.U1;
                        kotlin.jvm.internal.o.d(kv1Var);
                        ce2.i b17 = gVar.b(kv1Var);
                        b17.field_flag |= 2;
                        ((com.tencent.mm.feature.finder.live.v4) i95.n0.c(com.tencent.mm.feature.finder.live.v4.class)).Oj().J0(b17);
                        java.lang.String str = this.f233600c.f234009d;
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dumpRemoteGift ");
                        int i17 = ek2.z.f253577z;
                        sb6.append(ek2.k3.f253492a.c(kv1Var));
                        com.tencent.mars.xlog.Log.i(str, sb6.toString());
                        dk2.u7.f234181a.a(b17);
                    }
                }
            }
        }
        yz5.p pVar = this.f233598a;
        if (pVar == null) {
            return null;
        }
        pVar.invoke(java.lang.Boolean.TRUE, java.lang.Integer.valueOf(this.f233599b));
        return jz5.f0.f302826a;
    }
}
