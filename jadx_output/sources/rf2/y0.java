package rf2;

/* loaded from: classes10.dex */
public final class y0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f394964d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rf2.o1 f394965e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.dm4 f394966f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(rf2.o1 o1Var, r45.dm4 dm4Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f394965e = o1Var;
        this.f394966f = dm4Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rf2.y0(this.f394965e, this.f394966f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rf2.y0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f394964d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            df2.un unVar = this.f394965e.f394837b;
            r45.dm4 dm4Var = this.f394966f;
            java.lang.String str = dm4Var != null ? dm4Var.f372575m : null;
            this.f394964d = 1;
            if (unVar.a7(str, true, this) == aVar) {
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
