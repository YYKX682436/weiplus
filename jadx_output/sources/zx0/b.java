package zx0;

/* loaded from: classes5.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f476988d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.camstudio.MJAIGCTaskInfo f476989e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f476990f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.tencent.maas.camstudio.MJAIGCTaskInfo mJAIGCTaskInfo, yx0.b8 b8Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f476989e = mJAIGCTaskInfo;
        this.f476990f = b8Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new zx0.b(this.f476989e, this.f476990f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((zx0.b) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f476988d;
        com.tencent.maas.camstudio.MJAIGCTaskInfo mJAIGCTaskInfo = this.f476989e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mx0.s sVar = mx0.s.f332297a;
            this.f476988d = 1;
            obj = sVar.a(mJAIGCTaskInfo, com.tencent.maas.camstudio.MJAIGCCancelReason.Default, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.maas.instamovie.base.MJError mJError = (com.tencent.maas.instamovie.base.MJError) obj;
        yx0.b8 b8Var = this.f476990f;
        if (mJError == null) {
            b8Var.H().b(mJAIGCTaskInfo.f47860a);
        } else {
            b8Var.H().a(mJAIGCTaskInfo.f47860a, mJError);
        }
        return jz5.f0.f302826a;
    }
}
