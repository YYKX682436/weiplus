package l0;

/* loaded from: classes14.dex */
public final class c2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f314095d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f314096e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l0.a3 f314097f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(java.lang.Object obj, l0.a3 a3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f314096e = obj;
        this.f314097f = a3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new l0.c2(this.f314096e, this.f314097f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((l0.c2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f314095d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            l0.a3 a3Var = this.f314097f;
            java.lang.Object b17 = a3Var.b();
            java.lang.Object obj2 = this.f314096e;
            if (!kotlin.jvm.internal.o.b(obj2, b17)) {
                this.f314095d = 1;
                z.p pVar = a3Var.f314028a;
                java.lang.Object a17 = ((kotlinx.coroutines.flow.x0) a3Var.f314037j).a(new l0.q2(obj2, a3Var, pVar), this);
                if (a17 != aVar) {
                    a17 = f0Var;
                }
                if (a17 == aVar) {
                    return aVar;
                }
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
