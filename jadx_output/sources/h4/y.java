package h4;

/* loaded from: classes5.dex */
public final class y extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f278709d;

    /* renamed from: e, reason: collision with root package name */
    public int f278710e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h4.z f278711f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(h4.z zVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f278711f = zVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation completion) {
        kotlin.jvm.internal.o.g(completion, "completion");
        h4.y yVar = new h4.y(this.f278711f, completion);
        yVar.f278709d = obj;
        return yVar;
    }

    @Override // yz5.p
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((h4.y) create(obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f278710e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.k kVar = (kotlinx.coroutines.flow.k) this.f278709d;
            u26.w a17 = u26.z.a(Integer.MAX_VALUE, null, null, 6, null);
            kotlinx.coroutines.flow.g0 g0Var = new kotlinx.coroutines.flow.g0(new kotlinx.coroutines.flow.m2(new h4.v(new kotlinx.coroutines.flow.i0(new h4.w(this, a17, null), kotlinx.coroutines.flow.l.g(a17)), null)), new h4.x(this, a17, null));
            this.f278710e = 1;
            if (g0Var.a(kVar, this) == aVar) {
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
