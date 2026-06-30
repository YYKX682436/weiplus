package js1;

/* loaded from: classes4.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.api.TransferRequestInfo f301488d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zq1.g0 f301489e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.tencent.mm.plugin.brandservice.api.TransferRequestInfo transferRequestInfo, zq1.g0 g0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f301488d = transferRequestInfo;
        this.f301489e = g0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new js1.h(this.f301488d, this.f301489e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        js1.h hVar = (js1.h) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        hVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[transferRequestInMM] type: ");
        com.tencent.mm.plugin.brandservice.api.TransferRequestInfo transferRequestInfo = this.f301488d;
        sb6.append(transferRequestInfo.f93913d);
        com.tencent.mars.xlog.Log.i("MicroMsg.TransferRequestServiceImpl", sb6.toString());
        js1.s sVar = js1.s.f301499a;
        ((ku5.t0) ku5.t0.f312615d).h(new js1.o(transferRequestInfo, new js1.g(transferRequestInfo, this.f301489e, currentTimeMillis)), "TransferRequestTokenManager");
        return jz5.f0.f302826a;
    }
}
