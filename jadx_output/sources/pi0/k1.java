package pi0;

/* loaded from: classes4.dex */
public final class k1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f354633d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f354634e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f354635f;

    /* renamed from: g, reason: collision with root package name */
    public int f354636g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f354637h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f354638i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ pi0.l1 f354639m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(kotlin.jvm.internal.h0 h0Var, android.view.ViewGroup viewGroup, pi0.l1 l1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f354637h = h0Var;
        this.f354638i = viewGroup;
        this.f354639m = l1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new pi0.k1(this.f354637h, this.f354638i, this.f354639m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pi0.k1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.jvm.internal.h0 h0Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f354636g;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            android.view.ViewGroup viewGroup = this.f354638i;
            this.f354633d = viewGroup;
            pi0.l1 l1Var = this.f354639m;
            this.f354634e = l1Var;
            kotlin.jvm.internal.h0 h0Var2 = this.f354637h;
            this.f354635f = h0Var2;
            this.f354636g = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            viewGroup.post(new pi0.j1(viewGroup, l1Var, rVar));
            obj = rVar.j();
            if (obj == aVar) {
                return aVar;
            }
            h0Var = h0Var2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h0Var = (kotlin.jvm.internal.h0) this.f354635f;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        h0Var.f310123d = obj;
        return jz5.f0.f302826a;
    }
}
