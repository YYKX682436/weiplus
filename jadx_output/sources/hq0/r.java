package hq0;

/* loaded from: classes7.dex */
public final class r extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f283050d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hq0.b0 f283051e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f283052f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f283053g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f283054h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f283055i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ iq0.e f283056m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(hq0.b0 b0Var, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, iq0.e eVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f283051e = b0Var;
        this.f283052f = str;
        this.f283053g = str2;
        this.f283054h = str3;
        this.f283055i = str4;
        this.f283056m = eVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new hq0.r(this.f283051e, this.f283052f, this.f283053g, this.f283054h, this.f283055i, this.f283056m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((hq0.r) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f283050d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f283050d = 1;
            if (kotlinx.coroutines.k1.b(com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        hq0.b0 b0Var = this.f283051e;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = b0Var.F;
        java.lang.String str = this.f283052f;
        if (concurrentHashMap.containsKey(str)) {
            b0Var.F.remove(str);
            com.tencent.mars.xlog.Log.e(b0Var.f282971y, "innerGenerateCover preload, bindFrameSetView timeout, : " + this.f283053g);
            ((mq0.v0) ((mq0.e0) i95.n0.c(mq0.e0.class))).wi("preloadCover", "endForce", this.f283054h, this.f283055i, this.f283056m.f293657a, this.f283053g, "");
            if (b0Var.F.isEmpty()) {
                if (!b0Var.I || b0Var.f283005t) {
                    com.tencent.mars.xlog.Log.i(b0Var.f282971y, "innerGenerateCover preload all force end, but isOnlyPreload is false");
                } else {
                    com.tencent.mars.xlog.Log.i(b0Var.f282971y, "innerGenerateCover preload all force end, auto destroy biz");
                    b0Var.destroy();
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
