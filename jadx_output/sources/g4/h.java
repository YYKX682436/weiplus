package g4;

/* loaded from: classes5.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f268320d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g4.m4 f268321e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g4.w4 f268322f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f268323g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(g4.m4 m4Var, g4.w4 w4Var, kotlin.jvm.internal.f0 f0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f268321e = m4Var;
        this.f268322f = w4Var;
        this.f268323g = f0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation completion) {
        kotlin.jvm.internal.o.g(completion, "completion");
        return new g4.h(this.f268321e, this.f268322f, this.f268323g, completion);
    }

    @Override // yz5.p
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((g4.h) create(obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f268320d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.j g17 = kotlinx.coroutines.flow.l.g(this.f268322f.f268602a);
            g4.g gVar = new g4.g(this);
            this.f268320d = 1;
            if (((kotlinx.coroutines.flow.e) g17).a(gVar, this) == aVar) {
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
