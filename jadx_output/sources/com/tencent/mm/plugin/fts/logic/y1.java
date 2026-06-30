package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public class y1 extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public final long f137742n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.logic.l2 f137743o;

    public y1(com.tencent.mm.plugin.fts.logic.l2 l2Var, long j17) {
        this.f137743o = l2Var;
        this.f137742n = j17;
    }

    @Override // p13.c
    public java.lang.String getName() {
        return "DeleteMessageTask";
    }

    @Override // p13.c
    public boolean i() {
        this.f137743o.f137609h.F(o13.d.f342215a, this.f137742n);
        return true;
    }

    @Override // p13.c
    public java.lang.String j() {
        return java.lang.String.format("{MsgId: %d}", java.lang.Long.valueOf(this.f137742n));
    }
}
