package sf2;

/* loaded from: classes10.dex */
public final class n0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f407223d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sf2.e1 f407224e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(sf2.e1 e1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f407224e = e1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new sf2.n0(this.f407224e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((sf2.n0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f407223d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f407223d = 1;
            if (sf2.e1.Z6(this.f407224e, this) == aVar) {
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
