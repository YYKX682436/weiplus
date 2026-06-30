package pk2;

/* loaded from: classes3.dex */
public final class m1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f355978d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f355979e;

    /* renamed from: f, reason: collision with root package name */
    public int f355980f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ boolean f355981g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ pk2.n1 f355982h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f355983i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.LoadingSwitchBtn f355984m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f355985n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(pk2.n1 n1Var, android.view.View view, com.tencent.mm.plugin.finder.view.LoadingSwitchBtn loadingSwitchBtn, pk2.o9 o9Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f355982h = n1Var;
        this.f355983i = view;
        this.f355984m = loadingSwitchBtn;
        this.f355985n = o9Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        pk2.m1 m1Var = new pk2.m1(this.f355982h, this.f355983i, this.f355984m, this.f355985n, continuation);
        m1Var.f355981g = ((java.lang.Boolean) obj).booleanValue();
        return m1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pk2.m1) create(java.lang.Boolean.valueOf(((java.lang.Boolean) obj).booleanValue()), (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f355980f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            boolean z17 = this.f355981g;
            android.view.View view = this.f355983i;
            java.lang.String obj2 = ((android.widget.TextView) view.findViewById(com.tencent.mm.R.id.c9s)).getText().toString();
            android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.hw6);
            kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
            pk2.n1 n1Var = this.f355982h;
            n1Var.v(obj2, findViewById, this.f355984m);
            qk2.f.f(n1Var, false, 1, null);
            pk2.o9 o9Var = this.f355985n;
            this.f355978d = o9Var;
            this.f355979e = n1Var;
            this.f355981g = z17;
            this.f355980f = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            o9Var.i(512, !z17, n1Var.n(), new pk2.l1(z17, o9Var, n1Var, new v65.n(rVar)));
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
