package h4;

/* loaded from: classes5.dex */
public final class x extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public int f278706d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h4.y f278707e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u26.w f278708f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(h4.y yVar, u26.w wVar, kotlin.coroutines.Continuation continuation) {
        super(3, continuation);
        this.f278707e = yVar;
        this.f278708f = wVar;
    }

    @Override // yz5.q
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        kotlinx.coroutines.flow.k create = (kotlinx.coroutines.flow.k) obj;
        kotlin.coroutines.Continuation continuation = (kotlin.coroutines.Continuation) obj3;
        kotlin.jvm.internal.o.g(create, "$this$create");
        kotlin.jvm.internal.o.g(continuation, "continuation");
        return new h4.x(this.f278707e, this.f278708f, continuation).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f278706d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            h4.r rVar = (h4.r) this.f278707e.f278711f.f278712a.getValue();
            this.f278706d = 1;
            rVar.getClass();
            java.lang.Object t17 = ((u26.o) rVar.f278686a.f278678a).t(new h4.p(this.f278708f), this);
            if (t17 != aVar) {
                t17 = f0Var;
            }
            if (t17 != aVar) {
                t17 = f0Var;
            }
            if (t17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return f0Var;
    }
}
