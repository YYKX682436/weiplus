package wi0;

/* loaded from: classes10.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f446144d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.flutter_voip_status.GetTextStatusImageFileRequest f446145e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f446146f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.tencent.pigeon.flutter_voip_status.GetTextStatusImageFileRequest getTextStatusImageFileRequest, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f446145e = getTextStatusImageFileRequest;
        this.f446146f = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new wi0.g(this.f446145e, this.f446146f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((wi0.g) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.pigeon.flutter_voip_status.GetTextStatusImageFileRequest getTextStatusImageFileRequest = this.f446145e;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f446144d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        yz5.l lVar = this.f446146f;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                java.lang.String username = getTextStatusImageFileRequest.getUsername();
                java.lang.String url = getTextStatusImageFileRequest.getUrl();
                java.lang.String statusId = getTextStatusImageFileRequest.getStatusId();
                this.f446144d = 1;
                obj = kotlinx.coroutines.l.g(kotlinx.coroutines.q1.f310570c, new yi0.d(statusId, url, username, null), this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(new com.tencent.pigeon.flutter_voip_status.GetTextStatusImageFileResponse((java.lang.String) obj))));
            return f0Var;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FlutterPluginTextStatusDataSource", "Failed to get image file: " + e17);
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(e17))));
            return f0Var;
        }
    }
}
