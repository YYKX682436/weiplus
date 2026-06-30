package pk2;

/* loaded from: classes3.dex */
public final class k5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f355909d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f355910e;

    /* renamed from: f, reason: collision with root package name */
    public int f355911f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ boolean f355912g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ pk2.l5 f355913h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f355914i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.LoadingSwitchBtn f355915m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f355916n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5(pk2.l5 l5Var, android.view.View view, com.tencent.mm.plugin.finder.view.LoadingSwitchBtn loadingSwitchBtn, pk2.o9 o9Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f355913h = l5Var;
        this.f355914i = view;
        this.f355915m = loadingSwitchBtn;
        this.f355916n = o9Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        pk2.k5 k5Var = new pk2.k5(this.f355913h, this.f355914i, this.f355915m, this.f355916n, continuation);
        k5Var.f355912g = ((java.lang.Boolean) obj).booleanValue();
        return k5Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pk2.k5) create(java.lang.Boolean.valueOf(((java.lang.Boolean) obj).booleanValue()), (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f355911f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            boolean z17 = this.f355912g;
            android.view.View view = this.f355914i;
            java.lang.String obj2 = ((android.widget.TextView) view.findViewById(com.tencent.mm.R.id.rbp)).getText().toString();
            android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.f485503ra4);
            kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
            pk2.l5 l5Var = this.f355913h;
            l5Var.v(obj2, findViewById, this.f355915m);
            pk2.o9 o9Var = this.f355916n;
            this.f355909d = o9Var;
            this.f355910e = l5Var;
            this.f355912g = z17;
            this.f355911f = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            o9Var.i(8388608, z17, true, new pk2.j5(o9Var, l5Var, new v65.n(rVar)));
            if (rVar.j() == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return java.lang.Boolean.TRUE;
    }
}
