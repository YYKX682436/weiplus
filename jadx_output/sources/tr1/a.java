package tr1;

/* loaded from: classes7.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.biz.BizStartCdnUploadReq f421369d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.tencent.pigeon.biz.BizStartCdnUploadReq bizStartCdnUploadReq, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f421369d = bizStartCdnUploadReq;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new tr1.a(this.f421369d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        tr1.a aVar = (tr1.a) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        aVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateCommentImg cancel mediaId:");
        com.tencent.pigeon.biz.BizStartCdnUploadReq bizStartCdnUploadReq = this.f421369d;
        sb6.append(bizStartCdnUploadReq.getMediaId());
        com.tencent.mars.xlog.Log.i("MicroMsg.BizInteractionCommentImgUploader", sb6.toString());
        sx.b0 b0Var = (sx.b0) i95.n0.c(sx.b0.class);
        if (b0Var != null) {
            java.lang.String mediaId = bizStartCdnUploadReq.getMediaId();
            if (mediaId == null) {
                mediaId = "";
            }
            ((rx.f) b0Var).Bi(mediaId);
        }
        return jz5.f0.f302826a;
    }
}
