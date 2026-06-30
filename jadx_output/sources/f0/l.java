package f0;

/* loaded from: classes14.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f258144d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f0.l2 f258145e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(f0.l2 l2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f258145e = l2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new f0.l(this.f258145e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((f0.l) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f258144d;
        f0.l2 l2Var = this.f258145e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            z.e eVar = l2Var.f258148b;
            p2.m mVar = new p2.m(l2Var.f258149c);
            this.f258144d = 1;
            if (eVar.f(mVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        ((n0.q4) l2Var.f258150d).setValue(java.lang.Boolean.FALSE);
        return jz5.f0.f302826a;
    }
}
