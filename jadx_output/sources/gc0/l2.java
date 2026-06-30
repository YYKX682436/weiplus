package gc0;

/* loaded from: classes5.dex */
public final class l2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f270207d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f270208e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f270209f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f270210g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ gc0.p2 f270211h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.kl5 f270212i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f270213m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yz5.l f270214n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f270215o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(android.widget.ImageView imageView, android.graphics.Bitmap bitmap, android.view.View view, android.view.View view2, gc0.p2 p2Var, r45.kl5 kl5Var, java.lang.String str, yz5.l lVar, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f270207d = imageView;
        this.f270208e = bitmap;
        this.f270209f = view;
        this.f270210g = view2;
        this.f270211h = p2Var;
        this.f270212i = kl5Var;
        this.f270213m = str;
        this.f270214n = lVar;
        this.f270215o = str2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gc0.l2(this.f270207d, this.f270208e, this.f270209f, this.f270210g, this.f270211h, this.f270212i, this.f270213m, this.f270214n, this.f270215o, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        gc0.l2 l2Var = (gc0.l2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        l2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        android.view.View view = this.f270210g;
        gc0.p2 p2Var = this.f270211h;
        android.view.View contentView = this.f270209f;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        try {
            this.f270207d.setImageBitmap(this.f270208e);
            db5.d5 d5Var = new db5.d5(contentView, -2, -2, false);
            d5Var.setOutsideTouchable(false);
            d5Var.showAsDropDown(view);
            contentView.setOnClickListener(new gc0.i2(this.f270214n, this.f270215o, p2Var, d5Var));
            gc0.e1 e1Var = p2Var.f270248m;
            r45.kl5 kl5Var = this.f270212i;
            kotlin.jvm.internal.o.f(contentView, "$contentView");
            e1Var.a(kl5Var, contentView, 3, this.f270213m);
            p2Var.f270242d = new gc0.j2(d5Var);
            p2Var.f270243e = new gc0.k2(d5Var, view);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RecommendRemarkUIC", jz5.a.b(th6));
        }
        return jz5.f0.f302826a;
    }
}
