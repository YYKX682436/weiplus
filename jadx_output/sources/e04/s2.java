package e04;

/* loaded from: classes12.dex */
public final class s2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f246087d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f246088e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f246089f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f246090g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f246091h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e04.q2 f246092i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, e04.q2 q2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f246088e = str;
        this.f246089f = str2;
        this.f246090g = str3;
        this.f246091h = i17;
        this.f246092i = q2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new e04.s2(this.f246088e, this.f246089f, this.f246090g, this.f246091h, this.f246092i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((e04.s2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f246087d;
        java.lang.String uploadPath = this.f246088e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.vfs.r6 s17 = new com.tencent.mm.vfs.r6(uploadPath).s();
            if (!(s17 != null && s17.m()) && s17 != null) {
                s17.J();
            }
            kotlin.jvm.internal.o.f(uploadPath, "$uploadPath");
            this.f246087d = 1;
            oz5.n nVar = new oz5.n(pz5.f.b(this));
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            options.inJustDecodeBounds = false;
            android.graphics.Bitmap J2 = com.tencent.mm.sdk.platformtools.x.J(this.f246089f, options);
            if (J2 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ScanImageUtils", "convertHevcToJpeg bitmap null");
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                nVar.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE));
            } else {
                try {
                    java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                    J2.compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                    com.tencent.mm.vfs.w6.R(uploadPath, byteArrayOutputStream.toByteArray());
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    nVar.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.TRUE));
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ScanImageUtils", e17, "convertHevcToJpeg exception", new java.lang.Object[0]);
                    kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                    nVar.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE));
                }
            }
            obj = nVar.a();
            pz5.a aVar2 = pz5.a.f359186d;
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationCdnService", "addUploadTask convertHevcToJpeg success: %s, exist: %s, uploadPath: %s", java.lang.Boolean.valueOf(booleanValue), java.lang.Boolean.valueOf(com.tencent.mm.vfs.w6.j(uploadPath)), uploadPath);
        java.lang.String str = this.f246090g;
        e04.q2 q2Var = this.f246092i;
        if (booleanValue) {
            e04.t2.f246106a.b(str, uploadPath, this.f246091h, q2Var);
        } else {
            e04.r2 r2Var = new e04.r2();
            r2Var.f246079a = 1;
            q2Var.a(str, r2Var);
        }
        return jz5.f0.f302826a;
    }
}
