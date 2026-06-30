package h4;

/* loaded from: classes5.dex */
public final class w extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f278703d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h4.y f278704e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u26.w f278705f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(h4.y yVar, u26.w wVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f278704e = yVar;
        this.f278705f = wVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation completion) {
        kotlin.jvm.internal.o.g(completion, "completion");
        return new h4.w(this.f278704e, this.f278705f, completion);
    }

    @Override // yz5.p
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((h4.w) create(obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f278703d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            h4.r rVar = (h4.r) this.f278704e.f278711f.f278712a.getValue();
            this.f278703d = 1;
            rVar.getClass();
            java.lang.Object t17 = ((u26.o) rVar.f278686a.f278678a).t(new h4.k(this.f278705f), this);
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
