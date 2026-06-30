package g4;

/* loaded from: classes5.dex */
public final class i4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f268375d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g4.j4 f268376e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u26.w f268377f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4(g4.j4 j4Var, u26.w wVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f268376e = j4Var;
        this.f268377f = wVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation completion) {
        kotlin.jvm.internal.o.g(completion, "completion");
        return new g4.i4(this.f268376e, this.f268377f, completion);
    }

    @Override // yz5.p
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((g4.i4) create(obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f268375d;
        u26.w wVar = this.f268377f;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                g4.h4 h4Var = new g4.h4(this, null);
                this.f268375d = 1;
                if (kotlinx.coroutines.z0.f(h4Var, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            u26.x0.a(wVar, null, 1, null);
        } catch (java.lang.Throwable th6) {
            wVar.s(th6);
        }
        return jz5.f0.f302826a;
    }
}
