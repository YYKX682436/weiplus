package s72;

/* loaded from: classes10.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f404066d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s72.j0 f404067e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f404068f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(s72.j0 j0Var, yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f404067e = j0Var;
        this.f404068f = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new s72.j(this.f404067e, this.f404068f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((s72.j) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f404066d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f404066d = 1;
            if (this.f404067e.V6(this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.f404068f.invoke();
        return jz5.f0.f302826a;
    }
}
