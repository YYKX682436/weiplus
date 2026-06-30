package oh3;

/* loaded from: classes5.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f345442d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ oh3.q f345443e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f345444f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(oh3.q qVar, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f345443e = qVar;
        this.f345444f = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new oh3.n(this.f345443e, this.f345444f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((oh3.n) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f345442d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = gm0.j1.b().f273245h.f273145e;
            if (lifecycleScope == null) {
                return null;
            }
            kotlinx.coroutines.r2 d17 = kotlinx.coroutines.l.d(lifecycleScope, null, null, new oh3.m(this.f345443e, this.f345444f, null), 3, null);
            this.f345442d = 1;
            if (((kotlinx.coroutines.c3) d17).C(this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
