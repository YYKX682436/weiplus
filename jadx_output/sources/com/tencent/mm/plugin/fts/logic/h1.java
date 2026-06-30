package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public final class h1 extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f137556n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.logic.s1 f137557o;

    public h1(com.tencent.mm.plugin.fts.logic.s1 s1Var, java.lang.String userName) {
        kotlin.jvm.internal.o.g(userName, "userName");
        this.f137557o = s1Var;
        this.f137556n = userName;
    }

    @Override // p13.c
    public java.lang.String getName() {
        return "DeleteKefuContactTask";
    }

    @Override // p13.c
    public boolean i() {
        com.tencent.mm.plugin.fts.logic.s1 s1Var = this.f137557o;
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = s1Var.f137667h;
        java.lang.String str = this.f137556n;
        copyOnWriteArraySet.remove(str);
        w13.g gVar = s1Var.f137665f;
        if (gVar != null) {
            gVar.m0(new int[]{131089, 131090}, str);
        }
        com.tencent.mm.plugin.fts.logic.m3 ij6 = ((com.tencent.mm.plugin.fts.d0) i95.n0.c(com.tencent.mm.plugin.fts.d0.class)).ij();
        ij6.f137634g.m0(o13.d.f342228n, str);
        return true;
    }

    @Override // p13.c
    public java.lang.String j() {
        return "delete kefu contact " + this.f137556n;
    }
}
