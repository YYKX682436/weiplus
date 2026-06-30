package pk2;

/* loaded from: classes3.dex */
public final class q1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f356178d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f356179e;

    /* renamed from: f, reason: collision with root package name */
    public int f356180f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ boolean f356181g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ pk2.r1 f356182h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f356183i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.LoadingSwitchBtn f356184m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f356185n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f356186o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(pk2.r1 r1Var, android.view.View view, com.tencent.mm.plugin.finder.view.LoadingSwitchBtn loadingSwitchBtn, boolean z17, pk2.o9 o9Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f356182h = r1Var;
        this.f356183i = view;
        this.f356184m = loadingSwitchBtn;
        this.f356185n = z17;
        this.f356186o = o9Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        pk2.q1 q1Var = new pk2.q1(this.f356182h, this.f356183i, this.f356184m, this.f356185n, this.f356186o, continuation);
        q1Var.f356181g = ((java.lang.Boolean) obj).booleanValue();
        return q1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pk2.q1) create(java.lang.Boolean.valueOf(((java.lang.Boolean) obj).booleanValue()), (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f356180f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            boolean z17 = this.f356181g;
            android.view.View view = this.f356183i;
            java.lang.String obj2 = ((android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f485553i31)).getText().toString();
            android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.hx7);
            kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
            com.tencent.mm.plugin.finder.view.LoadingSwitchBtn loadingSwitchBtn = this.f356184m;
            pk2.r1 r1Var = this.f356182h;
            r1Var.v(obj2, findViewById, loadingSwitchBtn);
            qk2.f.f(r1Var, false, 1, null);
            pk2.o9 o9Var = this.f356186o;
            this.f356178d = o9Var;
            this.f356179e = r1Var;
            this.f356181g = z17;
            this.f356180f = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            v65.n nVar = new v65.n(rVar);
            if (this.f356185n) {
                db5.t7.b(o9Var.f356078d, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.lum));
                nVar.a(java.lang.Boolean.FALSE);
            } else {
                com.tencent.mars.xlog.Log.i(o9Var.f356072a, "enable/disable link mic. curEnableLinkMic:" + ((mm2.o4) o9Var.c(mm2.o4.class)).k7());
                o9Var.i(64, z17, r1Var.n(), new pk2.p1(z17, o9Var, r1Var, nVar));
            }
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
