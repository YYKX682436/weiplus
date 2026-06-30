package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public class p3 extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public final long f137649n;

    public p3(com.tencent.mm.plugin.fts.logic.r3 r3Var, long j17) {
        this.f137649n = j17;
    }

    @Override // p13.c
    public java.lang.String getName() {
        return "FTSDeleteMsgLogic.DeleteSingleMsgTask";
    }

    @Override // p13.c
    public boolean i() {
        com.tencent.mm.plugin.fts.o oVar = ((com.tencent.mm.plugin.fts.d0) i95.n0.c(com.tencent.mm.plugin.fts.d0.class)).f137381f;
        if (oVar == null) {
            return true;
        }
        oVar.g(this.f137649n);
        return true;
    }
}
