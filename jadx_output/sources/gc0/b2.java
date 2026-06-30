package gc0;

/* loaded from: classes5.dex */
public final class b2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.FlowLayout f270102d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f270103e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gc0.p2 f270104f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f270105g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.a f270106h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ gc0.b0 f270107i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.l f270108m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yz5.a f270109n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(com.tencent.mm.ui.base.FlowLayout flowLayout, java.util.List list, gc0.p2 p2Var, boolean z17, yz5.a aVar, gc0.b0 b0Var, yz5.l lVar, yz5.a aVar2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f270102d = flowLayout;
        this.f270103e = list;
        this.f270104f = p2Var;
        this.f270105g = z17;
        this.f270106h = aVar;
        this.f270107i = b0Var;
        this.f270108m = lVar;
        this.f270109n = aVar2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gc0.b2(this.f270102d, this.f270103e, this.f270104f, this.f270105g, this.f270106h, this.f270107i, this.f270108m, this.f270109n, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        gc0.b2 b2Var = (gc0.b2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        b2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        yz5.a aVar;
        pz5.a aVar2 = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.ui.base.FlowLayout flowLayout = this.f270102d;
        android.content.Context context = flowLayout.getContext();
        for (r45.kl5 kl5Var : this.f270103e) {
            java.lang.String string = kl5Var.getString(0);
            if (string != null) {
                kotlin.jvm.internal.o.d(context);
                android.view.View O6 = gc0.p2.O6(this.f270104f, context, string);
                if (O6 != null) {
                    gc0.p2 p2Var = this.f270104f;
                    O6.setOnClickListener(new gc0.a2(this.f270108m, string, p2Var, kl5Var, this.f270109n));
                    flowLayout.addView(O6);
                    p2Var.f270248m.a(kl5Var, O6, 1, this.f270107i.f270099a);
                }
            }
        }
        if (flowLayout.getChildCount() > 0) {
            flowLayout.setVisibility(0);
        } else {
            flowLayout.setVisibility(8);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("initRecommendRemark() hasResult = ");
        boolean z17 = this.f270105g;
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.RecommendRemarkUIC", sb6.toString());
        if (!z17 && (aVar = this.f270106h) != null) {
            aVar.invoke();
        }
        return jz5.f0.f302826a;
    }
}
