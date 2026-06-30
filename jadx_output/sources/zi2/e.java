package zi2;

/* loaded from: classes3.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f473104d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zi2.w f473105e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(zi2.w wVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f473105e = wVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new zi2.e(this.f473105e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((zi2.e) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f473104d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            zi2.w wVar = this.f473105e;
            kotlinx.coroutines.flow.i2 i2Var = ((mm2.o4) wVar.P0(mm2.o4.class)).f329311f;
            zi2.d dVar = new zi2.d(wVar);
            this.f473104d = 1;
            kotlinx.coroutines.flow.q2 q2Var = (kotlinx.coroutines.flow.q2) i2Var;
            q2Var.getClass();
            if (kotlinx.coroutines.flow.q2.l(q2Var, dVar, this) == aVar) {
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
