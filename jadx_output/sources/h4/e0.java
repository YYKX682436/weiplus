package h4;

/* loaded from: classes14.dex */
public final class e0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f278645d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h4.g0 f278646e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(h4.g0 g0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f278646e = g0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation completion) {
        kotlin.jvm.internal.o.g(completion, "completion");
        return new h4.e0(this.f278646e, completion);
    }

    @Override // yz5.p
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((h4.e0) create(obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f278645d;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.flow.l0 l0Var = new kotlinx.coroutines.flow.l0(this.f278646e.f278658c, new h4.b0(this, null));
                h4.d0 d0Var = new h4.d0(this);
                this.f278645d = 1;
                if (l0Var.a(d0Var, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
        } catch (u26.g0 unused) {
        }
        return jz5.f0.f302826a;
    }
}
