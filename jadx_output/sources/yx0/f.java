package yx0;

/* loaded from: classes5.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f467289d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467290e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(yx0.b8 b8Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f467290e = b8Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yx0.f(this.f467290e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f467289d;
        yx0.b8 this_run = this.f467290e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlin.jvm.internal.o.f(this_run, "$this_run");
            this.f467289d = 1;
            if (yx0.b8.b(this_run, "ImportPreviewAIGCReachMaxDuration", true, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        kotlin.jvm.internal.o.f(this_run, "$this_run");
        java.util.concurrent.locks.ReentrantLock reentrantLock = yx0.b8.f467171c2;
        this_run.f0("APP_AIGCRequestTimeout");
        kotlin.jvm.internal.o.f(this_run, "$this_run");
        this_run.n0();
        return jz5.f0.f302826a;
    }
}
