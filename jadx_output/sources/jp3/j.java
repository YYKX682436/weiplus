package jp3;

/* loaded from: classes14.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f301004d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dn.m f301005e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f301006f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ jp3.k f301007g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f301008h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.t45 f301009i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kp3.g f301010m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(dn.m mVar, java.lang.String str, jp3.k kVar, java.lang.String str2, r45.t45 t45Var, kp3.g gVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f301005e = mVar;
        this.f301006f = str;
        this.f301007g = kVar;
        this.f301008h = str2;
        this.f301009i = t45Var;
        this.f301010m = gVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new jp3.j(this.f301005e, this.f301006f, this.f301007g, this.f301008h, this.f301009i, this.f301010m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((jp3.j) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object Hi;
        dn.h hVar;
        byte[] bArr;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f301004d;
        dn.m mVar = this.f301005e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            jp3.t.f301029a.b(mVar.field_mediaId);
            i95.m c17 = i95.n0.c(sx.b0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            dn.m mVar2 = this.f301005e;
            this.f301004d = 1;
            Hi = sx.b0.Hi((sx.b0) c17, mVar2, 0L, null, this, 6, null);
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
        boolean z17 = n1Var == null;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (!z17 && n1Var.f71103a == com.tencent.mm.modelcdntran.m1.f71079h) {
            jp3.t tVar = jp3.t.f301029a;
            java.lang.String str = mVar.field_mediaId;
            java.lang.String str2 = mVar.field_fileId;
            java.lang.String str3 = this.f301006f;
            java.lang.Integer num = new java.lang.Integer(0);
            dn.h hVar2 = n1Var.f71108f;
            tVar.e(str, str2, str3, num, hVar2 != null ? new java.lang.Long(hVar2.field_fileLength) : null);
            dn.h hVar3 = n1Var.f71108f;
            java.lang.String str4 = hVar3 != null ? hVar3.field_fileId : null;
            if (str4 == null) {
                str4 = "";
            }
            java.lang.String str5 = str4;
            java.lang.String str6 = hVar3 != null ? hVar3.field_aesKey : null;
            com.tencent.mars.xlog.Log.i("MicroMsg.PalmPrintLogic", "[doUploadFailResult] cdn upload success, mediaId:" + mVar.field_mediaId + ", fileId: " + str5);
            jp3.g gVar = jp3.g.f301000a;
            if (str6 != null) {
                bArr = str6.getBytes(r26.c.f368865a);
                kotlin.jvm.internal.o.f(bArr, "getBytes(...)");
            } else {
                bArr = null;
            }
            java.lang.String f17 = gVar.f(bArr, "0425f42ebcd1f19badf9b41753227383721e2df2a36b36420cda9b46d9f9c72f6025b2bc388defa7cb1c6482b156e7c9c44ffdd5a16a82f007e1e929a178769554");
            java.lang.String f18 = gVar.f(this.f301007g.f301014g, "0425f42ebcd1f19badf9b41753227383721e2df2a36b36420cda9b46d9f9c72f6025b2bc388defa7cb1c6482b156e7c9c44ffdd5a16a82f007e1e929a178769554");
            boolean z18 = f17.length() == 0;
            java.lang.String str7 = this.f301008h;
            if (!z18) {
                if (!(f18.length() == 0)) {
                    tVar.d("uploadonlineopenresource");
                    java.lang.String str8 = this.f301006f;
                    r45.t45 t45Var = this.f301009i;
                    kp3.g gVar2 = this.f301010m;
                    new ip3.c(str8, f17, f18, str5, t45Var, gVar2 != null ? gVar2.f310990b : null).l().K(new jp3.i(this.f301006f, str7));
                }
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.PalmPrintLogic", "[doUploadFailResult] error, encrypt key failed. encryptedCdnKey.len:" + f17.length() + "，encryptedPalmFileKey.len:" + f18.length());
            gVar.a(str7);
            return f0Var;
        }
        jp3.t.f301029a.e(mVar.field_mediaId, mVar.field_fileId, this.f301006f, new java.lang.Integer(-1), (n1Var == null || (hVar = n1Var.f71108f) == null) ? null : new java.lang.Long(hVar.field_fileLength));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[doUploadFailResult] cdn upload failed, mediaId: ");
        sb6.append(mVar.field_mediaId);
        sb6.append(", ret：");
        sb6.append(n1Var != null ? new java.lang.Integer(n1Var.f71105c) : null);
        sb6.append(", action: ");
        sb6.append(n1Var != null ? n1Var.f71103a : null);
        com.tencent.mars.xlog.Log.e("MicroMsg.PalmPrintLogic", sb6.toString());
        return f0Var;
    }
}
