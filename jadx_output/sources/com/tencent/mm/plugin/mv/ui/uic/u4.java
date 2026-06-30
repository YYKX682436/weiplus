package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class u4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.c3 f151475d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.v4 f151476e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4(com.tencent.mm.plugin.mv.ui.uic.c3 c3Var, com.tencent.mm.plugin.mv.ui.uic.v4 v4Var) {
        super(1);
        this.f151475d = c3Var;
        this.f151476e = v4Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.List liveList = (java.util.List) obj;
        kotlin.jvm.internal.o.g(liveList, "liveList");
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = liveList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            gm3.c cVar = (gm3.c) it.next();
            hashMap.put(cVar.f273543d, cVar);
            r45.kj2 kj2Var = new r45.kj2();
            kj2Var.set(0, cVar.f273543d);
            kj2Var.set(1, 0);
            kj2Var.set(2, 0);
            linkedList.add(kj2Var);
        }
        r45.ss4 ss4Var = (r45.ss4) this.f151475d.f151077g.getValue();
        if (ss4Var != null) {
            boolean z17 = liveList.size() > 1;
            com.tencent.mm.plugin.mv.ui.uic.v4 v4Var = this.f151476e;
            v4Var.f151499s = z17;
            r45.ss4 O6 = com.tencent.mm.plugin.mv.ui.uic.v4.O6(v4Var, ss4Var, linkedList, hashMap);
            fm3.u.A.c(O6, com.tencent.mm.plugin.mv.ui.uic.s4.f151438d);
            d75.b.g(new com.tencent.mm.plugin.mv.ui.uic.t4(v4Var, O6));
        }
        return jz5.f0.f302826a;
    }
}
