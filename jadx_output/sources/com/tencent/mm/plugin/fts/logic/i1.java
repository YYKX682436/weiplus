package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public final class i1 extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f137562n;

    /* renamed from: o, reason: collision with root package name */
    public final int f137563o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.logic.s1 f137564p;

    public i1(com.tencent.mm.plugin.fts.logic.s1 s1Var, java.lang.String userName, int i17) {
        kotlin.jvm.internal.o.g(userName, "userName");
        this.f137564p = s1Var;
        this.f137562n = userName;
        this.f137563o = i17;
    }

    @Override // p13.c
    public java.lang.String getName() {
        return "InsertKefuContactTask";
    }

    @Override // p13.c
    public boolean i() {
        java.lang.String str = this.f137562n;
        boolean p47 = com.tencent.mm.storage.z3.p4(str);
        com.tencent.mm.plugin.fts.logic.s1 s1Var = this.f137564p;
        if (p47) {
            dm.u8 Di = ((l41.b2) ((j41.y) i95.n0.c(j41.y.class))).Di(str);
            kotlin.jvm.internal.o.d(Di);
            com.tencent.mm.plugin.fts.logic.s1.k(s1Var, Di, this.f137563o);
        } else {
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
            kotlin.jvm.internal.o.d(n17);
            com.tencent.mm.plugin.fts.logic.s1.j(s1Var, n17);
        }
        return true;
    }

    @Override // p13.c
    public java.lang.String j() {
        return "insert kefu contact " + this.f137562n;
    }
}
