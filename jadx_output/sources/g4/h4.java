package g4;

/* loaded from: classes5.dex */
public final class h4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f268358d;

    /* renamed from: e, reason: collision with root package name */
    public int f268359e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g4.i4 f268360f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(g4.i4 i4Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f268360f = i4Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation completion) {
        kotlin.jvm.internal.o.g(completion, "completion");
        g4.h4 h4Var = new g4.h4(this.f268360f, completion);
        h4Var.f268358d = obj;
        return h4Var;
    }

    @Override // yz5.p
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((g4.h4) create(obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f268359e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f268358d;
            g4.i4 i4Var = this.f268360f;
            g4.n4 n4Var = new g4.n4(y0Var, i4Var.f268377f);
            yz5.p pVar = i4Var.f268376e.f268394g.f268409f;
            this.f268359e = 1;
            if (pVar.invoke(n4Var, this) == aVar) {
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
