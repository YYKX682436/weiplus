package pk2;

/* loaded from: classes3.dex */
public final class c6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f355613d;

    /* renamed from: e, reason: collision with root package name */
    public int f355614e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ boolean f355615f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ pk2.d6 f355616g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f355617h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6(pk2.d6 d6Var, pk2.o9 o9Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f355616g = d6Var;
        this.f355617h = o9Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        pk2.c6 c6Var = new pk2.c6(this.f355616g, this.f355617h, continuation);
        c6Var.f355615f = ((java.lang.Boolean) obj).booleanValue();
        return c6Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pk2.c6) create(java.lang.Boolean.valueOf(((java.lang.Boolean) obj).booleanValue()), (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f355614e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            boolean z17 = this.f355615f;
            qk2.f.f(this.f355616g, false, 1, null);
            pk2.o9 o9Var = this.f355617h;
            this.f355613d = o9Var;
            this.f355615f = z17;
            this.f355614e = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            o9Var.i(512, !z17, true, new pk2.b6(z17, o9Var, new v65.n(rVar)));
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
