package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public class t1 extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.logic.FTS5SearchMessageLogic$4 f137681n;

    public t1(com.tencent.mm.plugin.fts.logic.FTS5SearchMessageLogic$4 fTS5SearchMessageLogic$4) {
        this.f137681n = fTS5SearchMessageLogic$4;
    }

    @Override // p13.c
    public boolean i() {
        this.f137681n.f137442d.f137609h.L(-200L, com.tencent.wcdb.core.Database.DictDefaultMatchValue);
        return true;
    }

    public java.lang.String toString() {
        return "ResetMessageCreateTimeCursor";
    }
}
