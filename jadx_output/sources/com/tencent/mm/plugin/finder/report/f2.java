package com.tencent.mm.plugin.finder.report;

/* loaded from: classes10.dex */
public final class f2 extends qz5.l implements yz5.p {
    public f2(kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.report.f2(continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.tencent.mm.plugin.finder.report.f2((kotlin.coroutines.Continuation) obj2).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        byte[] N;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.finder.report.p2 p2Var = com.tencent.mm.plugin.finder.report.p2.f125237a;
        java.lang.String a17 = com.tencent.mm.plugin.finder.report.p2.a(p2Var);
        boolean j17 = com.tencent.mm.vfs.w6.j(a17);
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (!j17 || (N = com.tencent.mm.vfs.w6.N(a17, 0, -1)) == null) {
            return f0Var;
        }
        try {
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = new com.tencent.mm.protocal.protobuf.FinderFeedReportObject();
            finderFeedReportObject.parseFrom(N);
            com.tencent.mm.autogen.mmdata.rpt.FinderPostStruct finderPostStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderPostStruct();
            com.tencent.mm.plugin.finder.report.p2.e(p2Var, finderPostStruct, 0, 6, finderFeedReportObject, null, false, 48, null);
            finderPostStruct.k();
            ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Zk(finderPostStruct);
            com.tencent.mm.vfs.w6.h(a17);
            com.tencent.mars.xlog.Log.i("Finder.FinderPostReportLogic", "checkReportKillProcExit");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Finder.FinderPostReportLogic", e17, "checkReportKillProcExit", new java.lang.Object[0]);
        }
        return f0Var;
    }
}
