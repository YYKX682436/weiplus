package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public class n2 extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.logic.q2 f137640n;

    public n2(com.tencent.mm.plugin.fts.logic.q2 q2Var) {
        this.f137640n = q2Var;
    }

    @Override // p13.c
    public java.lang.String getName() {
        return "DeleteSOSHistoryTask";
    }

    @Override // p13.c
    public boolean i() {
        ((com.tencent.mm.plugin.fts.o) this.f137640n.f137654e.f442219g).i(java.lang.String.format("DELETE FROM %s ;", "FTS5MetaSOSHistory"));
        return true;
    }
}
