package g4;

/* loaded from: classes5.dex */
public final class y extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f268623d;

    /* renamed from: e, reason: collision with root package name */
    public int f268624e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.r2 f268625f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.p f268626g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(kotlinx.coroutines.r2 r2Var, yz5.p pVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f268625f = r2Var;
        this.f268626g = pVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation completion) {
        kotlin.jvm.internal.o.g(completion, "completion");
        g4.y yVar = new g4.y(this.f268625f, this.f268626g, completion);
        yVar.f268623d = obj;
        return yVar;
    }

    @Override // yz5.p
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((g4.y) create(obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f268624e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            g4.m4 m4Var = (g4.m4) this.f268623d;
            this.f268625f.p(new g4.x(m4Var));
            this.f268624e = 1;
            if (this.f268626g.invoke(m4Var, this) == aVar) {
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
