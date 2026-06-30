package pk2;

/* loaded from: classes3.dex */
public final class y extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f356379d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f356380e;

    /* renamed from: f, reason: collision with root package name */
    public int f356381f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ boolean f356382g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f356383h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f356384i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ pk2.d0 f356385m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.LoadingSwitchBtn f356386n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f356387o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f356388p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(android.view.View view, boolean z17, pk2.d0 d0Var, com.tencent.mm.plugin.finder.view.LoadingSwitchBtn loadingSwitchBtn, boolean z18, pk2.o9 o9Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f356383h = view;
        this.f356384i = z17;
        this.f356385m = d0Var;
        this.f356386n = loadingSwitchBtn;
        this.f356387o = z18;
        this.f356388p = o9Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        pk2.y yVar = new pk2.y(this.f356383h, this.f356384i, this.f356385m, this.f356386n, this.f356387o, this.f356388p, continuation);
        yVar.f356382g = ((java.lang.Boolean) obj).booleanValue();
        return yVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pk2.y) create(java.lang.Boolean.valueOf(((java.lang.Boolean) obj).booleanValue()), (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        int i17;
        pz5.a aVar = pz5.a.f359186d;
        int i18 = this.f356381f;
        if (i18 != 0) {
            if (i18 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        boolean z17 = this.f356382g;
        android.view.View view = this.f356383h;
        pk2.d0 d0Var = this.f356385m;
        if (z17 && this.f356384i) {
            d0Var.w(1, this.f356386n.f211363x ? 1 : 2, !this.f356387o ? 1 : 0);
            i17 = 0;
        } else {
            i17 = 8;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/AnchorCommentOption$addItem$1$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/moreaction/AnchorCommentOption$addItem$1$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        qk2.f.f(d0Var, false, 1, null);
        pk2.o9 o9Var = this.f356388p;
        this.f356379d = o9Var;
        this.f356380e = d0Var;
        this.f356382g = z17;
        this.f356381f = 1;
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
        rVar.k();
        o9Var.i(8, !z17, d0Var.n(), new pk2.x(z17, d0Var, o9Var, new v65.n(rVar)));
        java.lang.Object j17 = rVar.j();
        return j17 == aVar ? aVar : j17;
    }
}
