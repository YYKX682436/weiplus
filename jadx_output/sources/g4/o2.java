package g4;

/* loaded from: classes5.dex */
public final class o2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f268468d;

    /* renamed from: e, reason: collision with root package name */
    public int f268469e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g4.p2 f268470f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ u26.w f268471g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(g4.p2 p2Var, u26.w wVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f268470f = p2Var;
        this.f268471g = wVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation completion) {
        kotlin.jvm.internal.o.g(completion, "completion");
        g4.o2 o2Var = new g4.o2(this.f268470f, this.f268471g, completion);
        o2Var.f268468d = obj;
        return o2Var;
    }

    @Override // yz5.p
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((g4.o2) create(obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f268469e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f268468d;
            kotlinx.coroutines.flow.j g17 = kotlinx.coroutines.flow.l.g(this.f268471g);
            g4.n2 n2Var = new g4.n2(this, y0Var);
            this.f268469e = 1;
            if (((kotlinx.coroutines.flow.e) g17).a(n2Var, this) == aVar) {
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
