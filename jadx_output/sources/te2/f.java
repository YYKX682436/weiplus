package te2;

/* loaded from: classes3.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f417987d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ te2.l f417988e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.kv1 f417989f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dk2.g f417990g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(te2.l lVar, r45.kv1 kv1Var, dk2.g gVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f417988e = lVar;
        this.f417989f = kv1Var;
        this.f417990g = gVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new te2.f(this.f417988e, this.f417989f, this.f417990g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((te2.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f417987d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f417987d = 1;
            if (kotlinx.coroutines.k1.b(1250L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        te2.l.c(this.f417988e, this.f417989f.getString(0), 1, this.f417990g.f233467b);
        te2.l.f(this.f417988e, this.f417989f.getString(0), this.f417990g.f233467b, 1);
        return jz5.f0.f302826a;
    }
}
