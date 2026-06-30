package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class vi extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f133245d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f133246e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f133247f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f133248g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f133249h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vi(android.view.ViewGroup viewGroup, android.content.Context context, float f17, java.util.List list, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f133246e = viewGroup;
        this.f133247f = context;
        this.f133248g = f17;
        this.f133249h = list;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.view.vi(this.f133246e, this.f133247f, this.f133248g, this.f133249h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.view.vi) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f133245d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            android.view.ViewGroup viewGroup = this.f133246e;
            viewGroup.setVisibility(0);
            s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
            float f17 = com.tencent.mm.plugin.finder.view.xi.f133334d;
            float f18 = this.f133248g;
            os5.u uVar = new os5.u((int) (f17 * f18), (int) (com.tencent.mm.plugin.finder.view.xi.f133332b * f18), (int) (com.tencent.mm.plugin.finder.view.xi.f133333c * f18));
            ((com.tencent.mm.feature.finder.live.v4) w0Var).getClass();
            android.content.Context context = this.f133247f;
            kotlin.jvm.internal.o.g(context, "context");
            xt2.k1 k1Var = new xt2.k1(context, uVar);
            k1Var.b("FinderQuickShareProductDialog", viewGroup);
            int a17 = i65.a.a(context, 162.0f);
            com.tencent.mars.xlog.Log.i("FinderQuickShareProductDialog", "parse showbox " + this.f133249h + " with space " + a17);
            java.util.List list = this.f133249h;
            android.view.ViewGroup viewGroup2 = this.f133246e;
            this.f133245d = 1;
            if (os5.v.a(k1Var, "FinderQuickShareProductDialog", list, false, viewGroup2, a17, null, this, 32, null) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
