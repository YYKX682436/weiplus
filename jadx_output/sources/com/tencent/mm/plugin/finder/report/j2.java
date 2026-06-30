package com.tencent.mm.plugin.finder.report;

/* loaded from: classes2.dex */
public final class j2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f125087d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f125087d = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.report.j2(this.f125087d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.report.j2 j2Var = (com.tencent.mm.plugin.finder.report.j2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        j2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.String a17 = com.tencent.mm.plugin.finder.report.p2.a(com.tencent.mm.plugin.finder.report.p2.f125237a);
        if (com.tencent.mm.vfs.w6.j(a17)) {
            com.tencent.mm.vfs.w6.h(a17);
            com.tencent.mars.xlog.Log.i("Finder.FinderPostReportLogic", "removeLoadingInfoFile source:" + this.f125087d);
        }
        return jz5.f0.f302826a;
    }
}
