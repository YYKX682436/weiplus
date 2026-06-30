package ym3;

/* loaded from: classes.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f463167d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ym3.f f463168e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v65.i f463169f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ym3.c f463170g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ym3.d f463171h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ym3.n f463172i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.i2 f463173m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ym3.f fVar, v65.i iVar, ym3.c cVar, ym3.d dVar, ym3.n nVar, kotlinx.coroutines.flow.i2 i2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f463168e = fVar;
        this.f463169f = iVar;
        this.f463170g = cVar;
        this.f463171h = dVar;
        this.f463172i = nVar;
        this.f463173m = i2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ym3.l(this.f463168e, this.f463169f, this.f463170g, this.f463171h, this.f463172i, this.f463173m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ym3.l) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f463167d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.j a17 = this.f463168e.a(this.f463169f, this.f463170g);
            ym3.k kVar = new ym3.k(this.f463171h, this.f463172i, this.f463170g, this.f463173m, this.f463169f);
            this.f463167d = 1;
            if (a17.a(kVar, this) == aVar) {
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
