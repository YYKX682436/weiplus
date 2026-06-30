package pk2;

/* loaded from: classes3.dex */
public final class p6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f356152d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f356153e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f356154f;

    /* renamed from: g, reason: collision with root package name */
    public int f356155g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ boolean f356156h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ pk2.q6 f356157i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f356158m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.view.View f356159n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6(pk2.q6 q6Var, pk2.o9 o9Var, android.view.View view, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f356157i = q6Var;
        this.f356158m = o9Var;
        this.f356159n = view;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        pk2.p6 p6Var = new pk2.p6(this.f356157i, this.f356158m, this.f356159n, continuation);
        p6Var.f356156h = ((java.lang.Boolean) obj).booleanValue();
        return p6Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pk2.p6) create(java.lang.Boolean.valueOf(((java.lang.Boolean) obj).booleanValue()), (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f356155g;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            boolean z17 = this.f356156h;
            qk2.f.f(this.f356157i, false, 1, null);
            pk2.o9 o9Var = this.f356158m;
            pk2.q6 q6Var = this.f356157i;
            android.view.View view = this.f356159n;
            this.f356152d = o9Var;
            this.f356153e = q6Var;
            this.f356154f = view;
            this.f356156h = z17;
            this.f356155g = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            o9Var.i(128, z17, true, new pk2.o6(z17, o9Var, q6Var, new v65.n(rVar), view));
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
