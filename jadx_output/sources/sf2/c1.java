package sf2;

/* loaded from: classes3.dex */
public final class c1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f407072d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sf2.e1 f407073e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(sf2.e1 e1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f407073e = e1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new sf2.c1(this.f407073e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((sf2.c1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f407072d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f407072d = 1;
            if (this.f407073e.n7(false, this) == aVar) {
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
