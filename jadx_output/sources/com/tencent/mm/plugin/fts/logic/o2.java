package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public class o2 extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f137644n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.logic.q2 f137645o;

    public o2(com.tencent.mm.plugin.fts.logic.q2 q2Var) {
        this.f137645o = q2Var;
    }

    @Override // p13.c
    public java.lang.String getName() {
        return "DeleteSOSHistoryTask";
    }

    @Override // p13.c
    public boolean i() {
        w13.i iVar = this.f137645o.f137654e;
        java.lang.String str = this.f137644n;
        iVar.getClass();
        java.lang.String format = java.lang.String.format("DELETE FROM %s WHERE key = ?", "FTS5MetaSOSHistory");
        ((com.tencent.mm.plugin.fts.o) iVar.f442219g).j(format, new java.lang.String[]{str});
        return true;
    }
}
