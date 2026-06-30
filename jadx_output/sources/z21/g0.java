package z21;

/* loaded from: classes5.dex */
public final class g0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f469574d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z21.j0 f469575e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(z21.j0 j0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f469575e = j0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new z21.g0(this.f469575e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((z21.g0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f469574d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f469574d = 1;
            if (this.f469575e.l(this) == aVar) {
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
