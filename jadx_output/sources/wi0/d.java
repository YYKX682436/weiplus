package wi0;

/* loaded from: classes4.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f446139d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.flutter_voip_status.GetSnsImageFileRequest f446140e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f446141f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.tencent.pigeon.flutter_voip_status.GetSnsImageFileRequest getSnsImageFileRequest, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f446140e = getSnsImageFileRequest;
        this.f446141f = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new wi0.d(this.f446140e, this.f446141f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((wi0.d) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.pigeon.flutter_voip_status.GetSnsImageFileRequest getSnsImageFileRequest = this.f446140e;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f446139d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        yz5.l lVar = this.f446141f;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlin.jvm.internal.o.b("", c01.z1.r());
                java.lang.String localId = getSnsImageFileRequest.getLocalId();
                java.lang.String snsId = getSnsImageFileRequest.getSnsId();
                java.lang.String mediaId = getSnsImageFileRequest.getMediaId();
                boolean requestThumb = getSnsImageFileRequest.getRequestThumb();
                this.f446139d = 1;
                obj = kotlinx.coroutines.l.g(kotlinx.coroutines.q1.f310570c, new xi0.e(localId, snsId, mediaId, requestThumb, null), this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(new com.tencent.pigeon.flutter_voip_status.GetSnsImageFileResponse((java.lang.String) obj))));
            return f0Var;
        } catch (java.lang.Exception e17) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(e17))));
            return f0Var;
        }
    }
}
