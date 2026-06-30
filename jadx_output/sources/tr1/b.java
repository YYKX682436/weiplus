package tr1;

/* loaded from: classes7.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f421370d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dn.m f421371e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f421372f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.biz.BizStartCdnUploadReq f421373g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(dn.m mVar, yz5.l lVar, com.tencent.pigeon.biz.BizStartCdnUploadReq bizStartCdnUploadReq, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f421371e = mVar;
        this.f421372f = lVar;
        this.f421373g = bizStartCdnUploadReq;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new tr1.b(this.f421371e, this.f421372f, this.f421373g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((tr1.b) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object Hi;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f421370d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            i95.m c17 = i95.n0.c(sx.b0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            dn.m mVar = this.f421371e;
            this.f421370d = 1;
            Hi = sx.b0.Hi((sx.b0) c17, mVar, 0L, null, this, 6, null);
            if (Hi == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            Hi = obj;
        }
        com.tencent.mm.modelcdntran.n1 n1Var = (com.tencent.mm.modelcdntran.n1) Hi;
        jz5.f0 f0Var = jz5.f0.f302826a;
        yz5.l lVar = this.f421372f;
        if (n1Var != null) {
            if (n1Var.f71103a == com.tencent.mm.modelcdntran.m1.f71079h) {
                dn.h hVar = n1Var.f71108f;
                long j17 = hVar != null ? hVar.field_fileLength : 0L;
                long j18 = hVar != null ? hVar.field_fileLength : 0L;
                java.lang.String str = hVar != null ? hVar.field_fileUrl : null;
                java.lang.String str2 = str == null ? "" : str;
                java.lang.String str3 = hVar != null ? hVar.field_thumbUrl : null;
                com.tencent.pigeon.biz.BizCdnUploadTaskCallback bizCdnUploadTaskCallback = new com.tencent.pigeon.biz.BizCdnUploadTaskCallback(this.f421373g.getMediaId(), new java.lang.Long(3L), null, null, str2, new java.lang.Long(j18), new java.lang.Long(j17), null, str3 == null ? "" : str3, 140, null);
                if (z65.c.a()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.BizInteractionCommentImgUploader", "uploadCommentCDNImpl success url: " + bizCdnUploadTaskCallback.getUrl());
                }
                lVar.invoke(bizCdnUploadTaskCallback);
                return f0Var;
            }
        }
        lVar.invoke(new com.tencent.pigeon.biz.BizCdnUploadTaskCallback(null, null, null, null, null, null, null, new java.lang.Long(n1Var != null ? n1Var.f71105c : -1), null, 383, null));
        return f0Var;
    }
}
