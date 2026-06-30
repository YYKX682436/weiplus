package gx0;

/* loaded from: classes3.dex */
public final class he extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f276511d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.bf f276512e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public he(gx0.bf bfVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f276512e = bfVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.he(this.f276512e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.he) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f276511d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            gx0.ge geVar = new gx0.ge(this.f276512e, null);
            this.f276511d = 1;
            if (kotlinx.coroutines.l.g(g3Var, geVar, this) == aVar) {
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
