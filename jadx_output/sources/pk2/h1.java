package pk2;

/* loaded from: classes3.dex */
public final class h1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f355799d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f355800e;

    /* renamed from: f, reason: collision with root package name */
    public int f355801f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ boolean f355802g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ pk2.i1 f355803h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f355804i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.LoadingSwitchBtn f355805m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f355806n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(pk2.i1 i1Var, android.view.View view, com.tencent.mm.plugin.finder.view.LoadingSwitchBtn loadingSwitchBtn, pk2.o9 o9Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f355803h = i1Var;
        this.f355804i = view;
        this.f355805m = loadingSwitchBtn;
        this.f355806n = o9Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        pk2.h1 h1Var = new pk2.h1(this.f355803h, this.f355804i, this.f355805m, this.f355806n, continuation);
        h1Var.f355802g = ((java.lang.Boolean) obj).booleanValue();
        return h1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pk2.h1) create(java.lang.Boolean.valueOf(((java.lang.Boolean) obj).booleanValue()), (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f355801f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            boolean z17 = this.f355802g;
            android.view.View view = this.f355804i;
            java.lang.String obj2 = ((android.widget.TextView) view.findViewById(com.tencent.mm.R.id.onh)).getText().toString();
            android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.f485507hx3);
            kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
            pk2.i1 i1Var = this.f355803h;
            i1Var.v(obj2, findViewById, this.f355805m);
            pk2.o9 o9Var = this.f355806n;
            this.f355799d = o9Var;
            this.f355800e = i1Var;
            this.f355802g = z17;
            this.f355801f = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            o9Var.i(2097152, !z17, i1Var.n(), new pk2.g1(o9Var, i1Var, z17, new v65.n(rVar)));
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
