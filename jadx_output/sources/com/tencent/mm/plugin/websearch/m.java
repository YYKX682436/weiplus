package com.tencent.mm.plugin.websearch;

/* loaded from: classes.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ su4.r1 f181564d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.websearch.o f181565e;

    public m(su4.r1 r1Var, com.tencent.mm.plugin.websearch.o oVar) {
        this.f181564d = r1Var;
        this.f181565e = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        su4.r1 r1Var = this.f181564d;
        gm0.j1.d().g(new su4.x1(r1Var));
        com.tencent.mm.plugin.websearch.o oVar = this.f181565e;
        java.lang.String imageSearchSessionId = r1Var.E;
        kotlin.jvm.internal.o.f(imageSearchSessionId, "imageSearchSessionId");
        oVar.c(6, imageSearchSessionId, r1Var.f413066f, 0, this.f181565e.a(r1Var.C));
    }
}
