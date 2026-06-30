package pk2;

/* loaded from: classes3.dex */
public final class b0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f355561d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f355562e;

    /* renamed from: f, reason: collision with root package name */
    public int f355563f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ boolean f355564g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f355565h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ pk2.d0 f355566i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(pk2.o9 o9Var, pk2.d0 d0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f355565h = o9Var;
        this.f355566i = d0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        pk2.b0 b0Var = new pk2.b0(this.f355565h, this.f355566i, continuation);
        b0Var.f355564g = ((java.lang.Boolean) obj).booleanValue();
        return b0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pk2.b0) create(java.lang.Boolean.valueOf(((java.lang.Boolean) obj).booleanValue()), (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f355563f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            boolean z17 = this.f355564g;
            pk2.o9 o9Var = this.f355565h;
            this.f355561d = o9Var;
            pk2.d0 d0Var = this.f355566i;
            this.f355562e = d0Var;
            this.f355564g = z17;
            this.f355563f = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            o9Var.i(268435456, !z17, d0Var.n(), new pk2.a0(new v65.n(rVar)));
            obj = rVar.j();
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
