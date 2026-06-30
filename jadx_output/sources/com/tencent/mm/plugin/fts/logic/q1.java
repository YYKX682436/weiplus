package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public final class q1 implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.logic.s1 f137653d;

    public q1(com.tencent.mm.plugin.fts.logic.s1 s1Var) {
        this.f137653d = s1Var;
    }

    @Override // l75.q0
    public final void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        com.tencent.mm.plugin.fts.logic.s1 s1Var = this.f137653d;
        if (s1Var.f342207d && w0Var != null && (w0Var.f316976d instanceof java.lang.String)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SearchKefuContactLogic", "onKefuContactChangeListener, " + w0Var.f316976d + ", " + w0Var.f316974b);
            int i17 = w0Var.f316974b;
            if (i17 == 3 || i17 == 4) {
                java.lang.Object obj = w0Var.f316976d;
                kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.String");
                java.lang.String str2 = (java.lang.String) obj;
                o13.y yVar = s1Var.f137664e;
                if (yVar != null) {
                    ((com.tencent.mm.plugin.fts.t) yVar).b(s1Var.f137666g + 1, new com.tencent.mm.plugin.fts.logic.i1(s1Var, str2, s1Var.f137669m));
                }
            }
        }
    }
}
