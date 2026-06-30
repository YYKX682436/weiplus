package qg5;

/* loaded from: classes.dex */
public final class d3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qg5.e3 f362946d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(qg5.e3 e3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f362946d = e3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qg5.d3(this.f362946d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((qg5.d3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        jz5.f0 f0Var = jz5.f0.f302826a;
        qg5.e3 e3Var = this.f362946d;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        try {
            e3Var.getClass();
            str = ((qg5.z2) ((ct.j3) i95.n0.c(ct.j3.class))).f363276r;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.YuanBaoChatRecordsReportFeatureService", "reportAdExposeSummarizeFile: exception", e17);
        }
        if (str == null) {
            return f0Var;
        }
        ((wj.j0) ((xj.i) i95.n0.c(xj.i.class))).mj(str, wj.w0.f446541d, null);
        return f0Var;
    }
}
