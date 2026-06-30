package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public class q3 extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f137657n;

    /* renamed from: o, reason: collision with root package name */
    public final long f137658o;

    public q3(com.tencent.mm.plugin.fts.logic.r3 r3Var, java.lang.String str, long j17) {
        this.f137657n = str;
        this.f137658o = j17;
    }

    @Override // p13.c
    public java.lang.String getName() {
        return "FTSDeleteMsgLogic.DeleteTalkerMsgByTimestamp";
    }

    @Override // p13.c
    public boolean i() {
        com.tencent.mm.plugin.fts.o oVar = ((com.tencent.mm.plugin.fts.d0) i95.n0.c(com.tencent.mm.plugin.fts.d0.class)).f137381f;
        if (oVar == null) {
            return true;
        }
        oVar.h(this.f137657n, this.f137658o);
        return true;
    }
}
