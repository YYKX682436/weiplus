package xt2;

/* loaded from: classes3.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f456833d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f456834e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f456835f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f456836g;

    /* renamed from: h, reason: collision with root package name */
    public int f456837h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MMPAGView f456838i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f456839m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ xt2.m f456840n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f456841o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.tencent.mm.view.MMPAGView mMPAGView, android.widget.ImageView imageView, xt2.m mVar, kotlin.jvm.internal.h0 h0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f456838i = mMPAGView;
        this.f456839m = imageView;
        this.f456840n = mVar;
        this.f456841o = h0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xt2.k(this.f456838i, this.f456839m, this.f456840n, this.f456841o, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((xt2.k) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f456837h;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.view.MMPAGView mMPAGView = this.f456838i;
            mMPAGView.setVisibility(0);
            android.widget.ImageView imageView = this.f456839m;
            imageView.setVisibility(8);
            xt2.m mVar = this.f456840n;
            this.f456833d = mVar;
            kotlin.jvm.internal.h0 h0Var = this.f456841o;
            this.f456834e = h0Var;
            this.f456835f = mMPAGView;
            this.f456836g = imageView;
            this.f456837h = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            v65.n nVar = new v65.n(rVar);
            java.lang.String str = mVar.f456882n;
            java.lang.String str2 = "play animate before " + ((java.lang.String) h0Var.f310123d);
            int i18 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.i(str, str2, null);
            mMPAGView.a(new xt2.j(mVar, h0Var, nVar, imageView));
            mMPAGView.g();
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
