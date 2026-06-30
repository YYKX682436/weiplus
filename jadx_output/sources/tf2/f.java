package tf2;

/* loaded from: classes5.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public long f418916d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f418917e;

    /* renamed from: f, reason: collision with root package name */
    public int f418918f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f418919g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(kotlin.jvm.internal.h0 h0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f418919g = h0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new tf2.f(this.f418919g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((tf2.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        long j17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f418918f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mars.xlog.Log.i("FinderLivePkGiftAnimationScheduleController", "#inQueueReady-viewScopeLaunch wait to time out start");
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            kotlin.jvm.internal.h0 h0Var = this.f418919g;
            this.f418917e = h0Var;
            this.f418916d = currentTimeMillis;
            this.f418918f = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            p05.x0 x0Var = (p05.x0) h0Var.f310123d;
            if (x0Var != null) {
                ((tf2.g) x0Var).f418921b = new v65.n(rVar);
            }
            if (rVar.j() == aVar) {
                return aVar;
            }
            j17 = currentTimeMillis;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j17 = this.f418916d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mars.xlog.Log.i("FinderLivePkGiftAnimationScheduleController", "#inQueueReady-viewScopeLaunch wait to time out end. interval=" + (java.lang.System.currentTimeMillis() - j17));
        return jz5.f0.f302826a;
    }
}
