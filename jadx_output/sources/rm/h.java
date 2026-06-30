package rm;

/* loaded from: classes8.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f397376d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f397377e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f397378f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f397379g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f397380h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.iam.biz.g f397381i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.iam.biz.v1 f397382m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(int i17, com.tencent.mm.ipcinvoker.r rVar, boolean z17, boolean z18, com.tencent.wechat.iam.biz.g gVar, com.tencent.wechat.iam.biz.v1 v1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f397377e = i17;
        this.f397378f = rVar;
        this.f397379g = z17;
        this.f397380h = z18;
        this.f397381i = gVar;
        this.f397382m = v1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rm.h(this.f397377e, this.f397378f, this.f397379g, this.f397380h, this.f397381i, this.f397382m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rm.h) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object f17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f397376d;
        com.tencent.mm.ipcinvoker.r rVar = this.f397378f;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                rm.g gVar = new rm.g(this.f397381i, this.f397382m, null);
                this.f397376d = 1;
                f17 = kotlinx.coroutines.z0.f(gVar, this);
                if (f17 == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                f17 = obj;
            }
            jz5.l lVar = (jz5.l) f17;
            boolean booleanValue = ((java.lang.Boolean) lVar.f302833d).booleanValue();
            com.tencent.wechat.iam.biz.w1 w1Var = (com.tencent.wechat.iam.biz.w1) lVar.f302834e;
            java.lang.String str = w1Var != null ? w1Var.f217804f[1] ? w1Var.f217802d : "" : null;
            java.lang.String str2 = str == null ? "" : str;
            java.lang.String str3 = w1Var != null ? w1Var.f217804f[2] ? w1Var.f217803e : "" : null;
            java.lang.String str4 = str3 == null ? "" : str3;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkCanCreatePhotoAccount done, scene=");
            sb6.append(this.f397377e);
            sb6.append(", sceneEnabled=");
            sb6.append(booleanValue);
            sb6.append(", registerLen=");
            sb6.append(str2.length());
            sb6.append(", switchLen=");
            sb6.append(str4.length());
            com.tencent.mars.xlog.Log.i("MicroMsg.CheckCanCreatePhotoAccountTask", sb6.toString());
            if (rVar != null) {
                rVar.a(new com.tencent.mm.brandService.CheckCanCreatePhotoAccountResponse(true, this.f397379g, this.f397380h, booleanValue, str2, str4, ""));
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CheckCanCreatePhotoAccountTask", e17, "checkCanCreatePhotoAccount exception", new java.lang.Object[0]);
            if (rVar != null) {
                boolean z17 = this.f397379g;
                boolean z18 = this.f397380h;
                java.lang.String message = e17.getMessage();
                if (message == null) {
                    message = "exception";
                }
                rVar.a(new com.tencent.mm.brandService.CheckCanCreatePhotoAccountResponse(false, z17, z18, false, "", "", message));
            }
        }
        return jz5.f0.f302826a;
    }
}
