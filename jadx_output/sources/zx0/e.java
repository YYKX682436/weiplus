package zx0;

/* loaded from: classes5.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f476999d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f477000e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.camstudio.MJAIGCSubmitRequest f477001f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zx0.f f477002g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(yx0.b8 b8Var, com.tencent.maas.camstudio.MJAIGCSubmitRequest mJAIGCSubmitRequest, zx0.f fVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f477000e = b8Var;
        this.f477001f = mJAIGCSubmitRequest;
        this.f477002g = fVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new zx0.e(this.f477000e, this.f477001f, this.f477002g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((zx0.e) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f476999d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f477000e.A = this.f477001f.f47852c;
            mx0.s sVar = mx0.s.f332297a;
            com.tencent.maas.camstudio.MJAIGCSubmitRequest mJAIGCSubmitRequest = this.f477001f;
            this.f476999d = 1;
            obj = sVar.d(mJAIGCSubmitRequest, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        rx0.d dVar = (rx0.d) obj;
        if (dVar.f400912a == null) {
            com.tencent.maas.camstudio.MJAIGCBridgeService H = this.f477000e.H();
            com.tencent.maas.camstudio.MJAIGCSubmitResponse mJAIGCSubmitResponse = dVar.f400913b;
            kotlin.jvm.internal.o.d(mJAIGCSubmitResponse);
            H.f(mJAIGCSubmitResponse);
            this.f477002g.f477004b.postValue(new rx0.a(rx0.b.f400906d, dVar, null));
        } else {
            this.f477000e.H().e(this.f477001f.f47850a, dVar.f400912a);
        }
        return jz5.f0.f302826a;
    }
}
