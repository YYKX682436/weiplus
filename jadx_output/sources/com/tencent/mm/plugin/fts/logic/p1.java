package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public final class p1 implements l75.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.logic.s1 f137647d;

    public p1(com.tencent.mm.plugin.fts.logic.s1 s1Var) {
        this.f137647d = s1Var;
    }

    @Override // l75.z0
    public final void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        o13.y yVar;
        com.tencent.mm.plugin.fts.logic.s1 s1Var = this.f137647d;
        if (s1Var.f342207d && (obj instanceof java.lang.String)) {
            java.lang.String str = (java.lang.String) obj;
            if (com.tencent.mm.storage.z3.p4(str) || com.tencent.mm.storage.z3.z3(str)) {
                if (i17 == 2) {
                    o13.y yVar2 = s1Var.f137664e;
                    if (yVar2 != null) {
                        ((com.tencent.mm.plugin.fts.t) yVar2).b(s1Var.f137666g + 1, new com.tencent.mm.plugin.fts.logic.i1(s1Var, str, s1Var.f137669m));
                        return;
                    }
                    return;
                }
                if (i17 != 3) {
                    if (i17 == 5 && (yVar = s1Var.f137664e) != null) {
                        ((com.tencent.mm.plugin.fts.t) yVar).b(s1Var.f137666g + 1, new com.tencent.mm.plugin.fts.logic.h1(s1Var, str));
                        return;
                    }
                    return;
                }
                o13.y yVar3 = s1Var.f137664e;
                if (yVar3 != null) {
                    ((com.tencent.mm.plugin.fts.t) yVar3).b(s1Var.f137666g + 1, new com.tencent.mm.plugin.fts.logic.m1(s1Var, str));
                }
            }
        }
    }
}
