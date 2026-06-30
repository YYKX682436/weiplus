package uc5;

/* loaded from: classes10.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f426495d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f426496e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ uc5.n f426497f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f426498g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f426499h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ uc5.r0 f426500i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(android.view.View view, java.lang.String str, uc5.n nVar, android.content.Context context, java.lang.Object obj, uc5.r0 r0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f426495d = view;
        this.f426496e = str;
        this.f426497f = nVar;
        this.f426498g = context;
        this.f426499h = obj;
        this.f426500i = r0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new uc5.i(this.f426495d, this.f426496e, this.f426497f, this.f426498g, this.f426499h, this.f426500i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((uc5.i) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.Object tag = this.f426495d.getTag(com.tencent.mm.R.id.uhn);
        boolean b17 = kotlin.jvm.internal.o.b(tag instanceof java.lang.String ? (java.lang.String) tag : null, this.f426496e);
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (!b17) {
            return f0Var;
        }
        android.content.Context context = this.f426498g;
        kotlin.jvm.internal.o.f(context, "$context");
        uc5.r0 r0Var = this.f426500i;
        uc5.n nVar = this.f426497f;
        java.lang.Object obj2 = this.f426499h;
        nVar.s(context, obj2, r0Var);
        uc5.f fVar = nVar.f426532h;
        java.lang.String str = fVar != null ? fVar.f426482a : null;
        if (str == null) {
            str = "";
        }
        if (!r26.n0.N(str)) {
            kotlin.jvm.internal.o.f(context, "$context");
            nVar.n(context, obj2, str);
        }
        return f0Var;
    }
}
