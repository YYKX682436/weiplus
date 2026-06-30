package df2;

/* loaded from: classes3.dex */
public final class em extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f230069d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.tb2 f230070e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f230071f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ df2.hm f230072g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public em(r45.tb2 tb2Var, android.view.ViewGroup viewGroup, df2.hm hmVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f230070e = tb2Var;
        this.f230071f = viewGroup;
        this.f230072g = hmVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.em(this.f230070e, this.f230071f, this.f230072g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.em) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f230069d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            long max = java.lang.Math.max(this.f230070e.getInteger(3), 0) * 1000;
            this.f230069d = 1;
            if (kotlinx.coroutines.k1.b(max, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.f230071f.setVisibility(8);
        df2.hm.Z6(this.f230072g);
        return jz5.f0.f302826a;
    }
}
