package com.tencent.mm.plugin.finder.report;

/* loaded from: classes8.dex */
public final class y extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f125441d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(android.content.Context context, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f125441d = context;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.report.y(this.f125441d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.report.y yVar = (com.tencent.mm.plugin.finder.report.y) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        yVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        int Bi = ((lh3.n) ((kh3.f) i95.n0.c(kh3.f.class))).Bi();
        long j17 = Bi == 3 ? 1L : 0L;
        long iOSNetType = com.tencent.mars.comm.NetStatusUtil.is5G(this.f125441d) ? 5L : com.tencent.mars.comm.NetStatusUtil.getIOSNetType(r2);
        com.tencent.mm.autogen.mmdata.rpt.FinderIsDaWangStruct finderIsDaWangStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderIsDaWangStruct();
        finderIsDaWangStruct.f56960d = j17;
        finderIsDaWangStruct.f56961e = iOSNetType;
        finderIsDaWangStruct.k();
        com.tencent.mars.xlog.Log.i("FinderDaWangReporter", "[report24022] simType:" + Bi + ", info:" + finderIsDaWangStruct.n());
        return jz5.f0.f302826a;
    }
}
