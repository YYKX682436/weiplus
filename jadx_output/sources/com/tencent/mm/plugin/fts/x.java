package com.tencent.mm.plugin.fts;

/* loaded from: classes12.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p13.c f138402d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.b0 f138403e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(p13.c cVar, com.tencent.mm.plugin.fts.b0 b0Var) {
        super(0);
        this.f138402d = cVar;
        this.f138403e = b0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("add base search task:");
        p13.c cVar = this.f138402d;
        sb6.append(cVar.getName());
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSThreadPoolQueue", sb6.toString());
        com.tencent.mm.plugin.fts.b0 b0Var = this.f138403e;
        com.tencent.mm.plugin.fts.b0.f(b0Var).add(cVar);
        b0Var.h();
        return jz5.f0.f302826a;
    }
}
