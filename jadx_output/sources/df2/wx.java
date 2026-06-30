package df2;

/* loaded from: classes.dex */
public final class wx extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f231730d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.cy f231731e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ az2.f f231732f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f231733g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f231734h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.v12 f231735i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wx(xg2.h hVar, kotlin.coroutines.Continuation continuation, df2.cy cyVar, az2.f fVar, kotlin.jvm.internal.h0 h0Var, android.content.Context context, r45.v12 v12Var) {
        super(2, continuation);
        this.f231730d = hVar;
        this.f231731e = cyVar;
        this.f231732f = fVar;
        this.f231733g = h0Var;
        this.f231734h = context;
        this.f231735i = v12Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.wx(this.f231730d, continuation, this.f231731e, this.f231732f, this.f231733g, this.f231734h, this.f231735i);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        df2.wx wxVar = (df2.wx) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        wxVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i(this.f231731e.f229915m, "showAlertDialog cgi succ");
        this.f231732f.b();
        com.tencent.mm.ui.widget.dialog.j0 j0Var = (com.tencent.mm.ui.widget.dialog.j0) this.f231733g.f310123d;
        if (j0Var != null) {
            j0Var.dismiss();
        }
        android.content.Context context = this.f231734h;
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(context);
        r45.v12 v12Var = this.f231735i;
        java.lang.String str = v12Var.f387800g;
        if (str == null || str.length() == 0) {
            java.lang.String str2 = v12Var.f387801h;
            u1Var.g(str2 != null ? str2 : "");
        } else {
            u1Var.u(v12Var.f387800g);
            java.lang.String str3 = v12Var.f387801h;
            u1Var.g(str3 != null ? str3 : "");
        }
        u1Var.n(context.getResources().getString(com.tencent.mm.R.string.d3z));
        u1Var.q(false);
        return jz5.f0.f302826a;
    }
}
