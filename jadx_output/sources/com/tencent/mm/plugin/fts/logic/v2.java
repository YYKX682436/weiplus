package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public class v2 extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.logic.e3 f137710n;

    public v2(com.tencent.mm.plugin.fts.logic.e3 e3Var, com.tencent.mm.plugin.fts.logic.FTS5SearchServiceNotifyLogic$1 fTS5SearchServiceNotifyLogic$1) {
        this.f137710n = e3Var;
    }

    @Override // p13.c
    public java.lang.String getName() {
        return "DeleteAllServiceNotifyMsgTask";
    }

    @Override // p13.c
    public boolean i() {
        this.f137710n.f137517h.k(o13.d.f342219e);
        return true;
    }

    @Override // p13.c
    public java.lang.String j() {
        return java.lang.String.format("{mCount: %d}", 0);
    }
}
