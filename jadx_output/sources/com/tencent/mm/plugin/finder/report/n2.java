package com.tencent.mm.plugin.finder.report;

/* loaded from: classes5.dex */
public final class n2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderFeedReportObject f125149d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f125149d = finderFeedReportObject;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.report.n2(this.f125149d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.report.n2 n2Var = (com.tencent.mm.plugin.finder.report.n2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        n2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        byte[] bArr;
        java.lang.Object m521constructorimpl;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.String a17 = com.tencent.mm.plugin.finder.report.p2.a(com.tencent.mm.plugin.finder.report.p2.f125237a);
        if (com.tencent.mm.vfs.w6.j(a17)) {
            com.tencent.mm.vfs.w6.h(a17);
        }
        java.util.LinkedList<r45.xp2> loadingInfoList = this.f125149d.getLoadingInfoList();
        kotlin.jvm.internal.o.f(loadingInfoList, "getLoadingInfoList(...)");
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = this.f125149d;
        synchronized (loadingInfoList) {
            bArr = null;
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                bArr = finderFeedReportObject.toByteArray();
                m521constructorimpl = kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
            } catch (java.lang.Throwable th6) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
            }
            java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
            if (m524exceptionOrNullimpl != null) {
                com.tencent.mars.xlog.Log.e("Finder.FinderPostReportLogic", m524exceptionOrNullimpl.getMessage());
            }
        }
        if (bArr != null) {
            com.tencent.mm.vfs.w6.S(a17, bArr, 0, bArr.length);
            com.tencent.mars.xlog.Log.i("Finder.FinderPostReportLogic", "saveLoadingInfoToFile");
        }
        return jz5.f0.f302826a;
    }
}
