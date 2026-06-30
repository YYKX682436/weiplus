package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public final class o1 implements l75.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.logic.s1 f137643d;

    public o1(com.tencent.mm.plugin.fts.logic.s1 s1Var) {
        this.f137643d = s1Var;
    }

    @Override // l75.z0
    public final void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        o13.y yVar;
        com.tencent.mm.plugin.fts.logic.s1 s1Var = this.f137643d;
        if (s1Var.f342207d && (obj instanceof java.lang.String)) {
            java.lang.String str = (java.lang.String) obj;
            if (com.tencent.mm.storage.z3.z3(str)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SearchKefuContactLogic", "onContactChangeListener " + obj + ", " + i17);
                if ((i17 == 3 || i17 == 4) && (yVar = s1Var.f137664e) != null) {
                    ((com.tencent.mm.plugin.fts.t) yVar).b(s1Var.f137666g + 1, new com.tencent.mm.plugin.fts.logic.i1(s1Var, str, s1Var.f137669m));
                }
            }
        }
    }
}
