package g4;

/* loaded from: classes5.dex */
public final class o3 extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public int f268472d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g4.q3 f268473e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g4.j3 f268474f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(g4.q3 q3Var, g4.j3 j3Var, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.f268473e = q3Var;
        this.f268474f = j3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation completion) {
        kotlin.jvm.internal.o.g(completion, "completion");
        return new g4.o3(this.f268473e, this.f268474f, completion);
    }

    @Override // yz5.l
    public final java.lang.Object invoke(java.lang.Object obj) {
        return ((g4.o3) create((kotlin.coroutines.Continuation) obj)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f268472d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            g4.j3 j3Var = this.f268474f;
            this.f268473e.f268512b = j3Var.f268390b;
            kotlinx.coroutines.flow.j jVar = j3Var.f268389a;
            g4.n3 n3Var = new g4.n3(this);
            this.f268472d = 1;
            if (jVar.a(n3Var, this) == aVar) {
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
