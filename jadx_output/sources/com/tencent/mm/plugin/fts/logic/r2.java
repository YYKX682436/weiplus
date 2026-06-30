package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public class r2 extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.logic.FTS5SearchServiceNotifyLogic$1 f137662n;

    public r2(com.tencent.mm.plugin.fts.logic.FTS5SearchServiceNotifyLogic$1 fTS5SearchServiceNotifyLogic$1) {
        this.f137662n = fTS5SearchServiceNotifyLogic$1;
    }

    @Override // p13.c
    public boolean i() {
        this.f137662n.f137444d.f137517h.L(-201L, com.tencent.wcdb.core.Database.DictDefaultMatchValue);
        return true;
    }

    public java.lang.String toString() {
        return "ResetNotifyServiceCreateTimeCursor";
    }
}
