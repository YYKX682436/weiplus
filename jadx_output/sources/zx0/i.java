package zx0;

/* loaded from: classes5.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f477016d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.camstudio.MJCDNUploadRequest f477017e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zx0.j f477018f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f477019g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.tencent.maas.camstudio.MJCDNUploadRequest mJCDNUploadRequest, zx0.j jVar, yx0.b8 b8Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f477017e = mJCDNUploadRequest;
        this.f477018f = jVar;
        this.f477019g = b8Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new zx0.i(this.f477017e, this.f477018f, this.f477019g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((zx0.i) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f477016d;
        com.tencent.maas.camstudio.MJCDNUploadRequest mJCDNUploadRequest = this.f477017e;
        boolean z17 = true;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.f1 b17 = ky0.h.f313479a.b(kz5.b0.c(mJCDNUploadRequest.f47871c), ly0.p.f322228d, null);
            this.f477016d = 1;
            obj = ((kotlinx.coroutines.g1) b17).k(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.lang.String str = (java.lang.String) kz5.n0.Z((java.util.List) obj);
        com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingCorePlugin-CDNBridgeServiceListener", "cdnUrl:" + str);
        if (str != null && str.length() != 0) {
            z17 = false;
        }
        yx0.b8 b8Var = this.f477019g;
        if (z17) {
            this.f477018f.getClass();
            java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.m58);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            b8Var.I().d(mJCDNUploadRequest.f47869a, new com.tencent.maas.instamovie.base.MJError(com.tencent.maas.instamovie.base.MJError.MaasEC.NetworkFailed.getErrorCode(), string));
        } else {
            b8Var.I().e(new com.tencent.maas.camstudio.MJCDNUploadResult(mJCDNUploadRequest.f47869a, str));
        }
        return jz5.f0.f302826a;
    }
}
