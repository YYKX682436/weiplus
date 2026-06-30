package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public final class n1 extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public int f137638n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.logic.s1 f137639o;

    public n1(com.tencent.mm.plugin.fts.logic.s1 s1Var) {
        this.f137639o = s1Var;
    }

    @Override // p13.c
    public java.lang.String getName() {
        return "UpdateKefuContactTask";
    }

    @Override // p13.c
    public boolean i() {
        o13.v fj6;
        com.tencent.mm.plugin.fts.logic.s1 s1Var = this.f137639o;
        for (java.lang.String str : new java.util.HashSet(s1Var.f137667h)) {
            kotlin.jvm.internal.o.d(str);
            s1Var.getClass();
            o13.z zVar = (o13.z) i95.n0.c(o13.z.class);
            long b17 = (zVar == null || (fj6 = ((com.tencent.mm.plugin.fts.d0) zVar).fj()) == null) ? 0L : ((com.tencent.mm.plugin.fts.p) fj6).b(str);
            w13.g gVar = s1Var.f137665f;
            if (gVar != null) {
                gVar.M(str, b17);
            }
            s1Var.f137667h.remove(str);
            this.f137638n++;
        }
        return true;
    }

    @Override // p13.c
    public java.lang.String j() {
        return "update kefu contact count: " + this.f137638n;
    }
}
