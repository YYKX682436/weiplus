package com.tencent.mm.plugin.fts;

/* loaded from: classes12.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p13.c f138397d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f138398e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p13.c f138399f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f138400g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.b0 f138401h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(p13.c cVar, int i17, p13.c cVar2, int i18, com.tencent.mm.plugin.fts.b0 b0Var) {
        super(0);
        this.f138397d = cVar;
        this.f138398e = i17;
        this.f138399f = cVar2;
        this.f138400g = i18;
        this.f138401h = b0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("add base search task:");
        p13.c cVar = this.f138397d;
        sb6.append(cVar.getName());
        sb6.append('|');
        sb6.append(this.f138398e);
        sb6.append(" current:");
        sb6.append(this.f138399f.getName());
        sb6.append('|');
        sb6.append(this.f138400g);
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSThreadPoolQueue", sb6.toString());
        com.tencent.mm.plugin.fts.b0 b0Var = this.f138401h;
        com.tencent.mm.plugin.fts.b0.f(b0Var).add(cVar);
        b0Var.h();
        return jz5.f0.f302826a;
    }
}
