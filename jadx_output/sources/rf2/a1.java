package rf2;

/* loaded from: classes10.dex */
public final class a1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f394648d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rf2.o1 f394649e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.dm4 f394650f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(rf2.o1 o1Var, r45.dm4 dm4Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f394649e = o1Var;
        this.f394650f = dm4Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rf2.a1(this.f394649e, this.f394650f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rf2.a1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f394648d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            df2.un unVar = this.f394649e.f394837b;
            r45.dm4 dm4Var = this.f394650f;
            java.lang.String str = dm4Var != null ? dm4Var.f372575m : null;
            this.f394648d = 1;
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
