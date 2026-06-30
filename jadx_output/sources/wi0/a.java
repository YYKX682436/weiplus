package wi0;

/* loaded from: classes11.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f446131d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.flutter_voip_status.GetFinderImageFileRequest f446132e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f446133f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.tencent.pigeon.flutter_voip_status.GetFinderImageFileRequest getFinderImageFileRequest, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f446132e = getFinderImageFileRequest;
        this.f446133f = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new wi0.a(this.f446132e, this.f446133f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((wi0.a) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.pigeon.flutter_voip_status.GetFinderImageFileRequest getFinderImageFileRequest = this.f446132e;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f446131d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        yz5.l lVar = this.f446133f;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                java.lang.String username = getFinderImageFileRequest.getUsername();
                java.lang.String url = getFinderImageFileRequest.getUrl();
                java.lang.String urlToken = getFinderImageFileRequest.getUrlToken();
                java.lang.String decodeKey = getFinderImageFileRequest.getDecodeKey();
                this.f446131d = 1;
                obj = kotlinx.coroutines.l.g(kotlinx.coroutines.q1.f310570c, new vi0.g(username, url, urlToken, decodeKey, null), this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            java.lang.String str = (java.lang.String) obj;
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(new com.tencent.pigeon.flutter_voip_status.GetFinderImageFileResponse(str))));
            return f0Var;
        } catch (java.lang.Exception e17) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(e17))));
            return f0Var;
        }
    }
}
