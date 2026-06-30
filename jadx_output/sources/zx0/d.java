package zx0;

/* loaded from: classes5.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f476995d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.camstudio.MJAIGCTaskInfo f476996e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f476997f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zx0.f f476998g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.tencent.maas.camstudio.MJAIGCTaskInfo mJAIGCTaskInfo, yx0.b8 b8Var, zx0.f fVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f476996e = mJAIGCTaskInfo;
        this.f476997f = b8Var;
        this.f476998g = fVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new zx0.d(this.f476996e, this.f476997f, this.f476998g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((zx0.d) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f476995d;
        com.tencent.maas.camstudio.MJAIGCTaskInfo mJAIGCTaskInfo = this.f476996e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mx0.s sVar = mx0.s.f332297a;
            this.f476995d = 1;
            obj = sVar.f(mJAIGCTaskInfo, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        rx0.c cVar = (rx0.c) obj;
        com.tencent.maas.instamovie.base.MJError mJError = cVar.f400909a;
        yx0.b8 b8Var = this.f476997f;
        if (mJError == null) {
            com.tencent.maas.camstudio.MJAIGCBridgeService H = b8Var.H();
            com.tencent.maas.camstudio.MJAIGCQueryResponse mJAIGCQueryResponse = cVar.f400910b;
            kotlin.jvm.internal.o.d(mJAIGCQueryResponse);
            H.d(mJAIGCQueryResponse);
            zx0.f fVar = this.f476998g;
            rx0.a aVar2 = (rx0.a) fVar.f477004b.getValue();
            fVar.f477004b.postValue(new rx0.a(rx0.b.f400907e, aVar2 != null ? aVar2.f400904b : null, cVar));
        } else {
            b8Var.H().c(mJAIGCTaskInfo.f47860a, cVar.f400909a);
        }
        return jz5.f0.f302826a;
    }
}
