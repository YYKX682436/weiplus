package vh0;

/* loaded from: classes8.dex */
public final class j3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f436890d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vh0.p3 f436891e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(vh0.p3 p3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f436891e = p3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vh0.j3(this.f436891e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((vh0.j3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f436890d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f436890d = 1;
            if (vh0.p3.Zi(this.f436891e, false, this) == aVar) {
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
