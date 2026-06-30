package e0;

/* loaded from: classes10.dex */
public final class p1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f245666d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e0.f1 f245667e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f245668f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(e0.f1 f1Var, float f17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f245667e = f1Var;
        this.f245668f = f17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new e0.p1(this.f245667e, this.f245668f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((e0.p1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f245666d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            e0.f1 f1Var = this.f245667e;
            float f17 = this.f245668f;
            this.f245666d = 1;
            if (b0.o2.b(f1Var, f17, null, this, 2, null) == aVar) {
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
