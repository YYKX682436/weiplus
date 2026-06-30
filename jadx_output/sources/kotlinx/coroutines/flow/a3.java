package kotlinx.coroutines.flow;

/* loaded from: classes3.dex */
public final class a3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f310194d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f310195e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.f3 f310196f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(kotlinx.coroutines.flow.f3 f3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f310196f = f3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.flow.a3 a3Var = new kotlinx.coroutines.flow.a3(this.f310196f, continuation);
        a3Var.f310195e = obj;
        return a3Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((kotlinx.coroutines.flow.a3) create((kotlinx.coroutines.flow.k) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f310194d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.z2 z2Var = new kotlinx.coroutines.flow.z2(new kotlin.jvm.internal.c0(), (kotlinx.coroutines.flow.k) this.f310195e);
            this.f310194d = 1;
            if (this.f310196f.a(z2Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        throw new jz5.d();
    }
}
