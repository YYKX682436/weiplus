package pk2;

/* loaded from: classes3.dex */
public final class j0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f355851d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f355852e;

    /* renamed from: f, reason: collision with root package name */
    public int f355853f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ boolean f355854g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ pk2.k0 f355855h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f355856i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.LoadingSwitchBtn f355857m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f355858n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(pk2.k0 k0Var, android.view.View view, com.tencent.mm.plugin.finder.view.LoadingSwitchBtn loadingSwitchBtn, pk2.o9 o9Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f355855h = k0Var;
        this.f355856i = view;
        this.f355857m = loadingSwitchBtn;
        this.f355858n = o9Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        pk2.j0 j0Var = new pk2.j0(this.f355855h, this.f355856i, this.f355857m, this.f355858n, continuation);
        j0Var.f355854g = ((java.lang.Boolean) obj).booleanValue();
        return j0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pk2.j0) create(java.lang.Boolean.valueOf(((java.lang.Boolean) obj).booleanValue()), (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f355853f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            boolean z17 = this.f355854g;
            android.view.View view = this.f355856i;
            java.lang.String obj2 = ((android.widget.TextView) view.findViewById(com.tencent.mm.R.id.rbp)).getText().toString();
            android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.f485503ra4);
            kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
            pk2.k0 k0Var = this.f355855h;
            k0Var.v(obj2, findViewById, this.f355857m);
            pk2.o9 o9Var = this.f355858n;
            this.f355851d = o9Var;
            this.f355852e = k0Var;
            this.f355854g = z17;
            this.f355853f = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            o9Var.i(8388608, z17, k0Var.n(), new pk2.i0(o9Var, k0Var, z17, new v65.n(rVar)));
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
