package com.tencent.mm.plugin.websearch;

/* loaded from: classes.dex */
public class y implements java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public su4.a f181724d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ThreadPoolExecutor f181725e = new java.util.concurrent.ThreadPoolExecutor(0, 10, 120, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.ArrayBlockingQueue(32));

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.websearch.x f181726f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.websearch.a0 f181727g;

    public y(com.tencent.mm.plugin.websearch.a0 a0Var, com.tencent.mm.plugin.websearch.r rVar) {
        this.f181727g = a0Var;
    }

    public void a(su4.r1 r1Var) {
        com.tencent.mm.plugin.websearch.x xVar = this.f181726f;
        if (xVar != null) {
            xVar.f181713e = true;
        }
        com.tencent.mm.plugin.websearch.x xVar2 = new com.tencent.mm.plugin.websearch.x(this, null);
        this.f181726f = xVar2;
        xVar2.f181712d = r1Var;
        this.f181727g.f181428h = r1Var;
        this.f181725e.execute(this.f181726f);
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        return 0;
    }
}
