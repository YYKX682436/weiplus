package gl4;

/* loaded from: classes11.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f272857d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gl4.z f272858e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f272859f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qk.y8 f272860g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(gl4.z zVar, android.content.Context context, qk.y8 y8Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f272858e = zVar;
        this.f272859f = context;
        this.f272860g = y8Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gl4.i(this.f272858e, this.f272859f, this.f272860g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gl4.i) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object b17;
        r45.ie baseResponse;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f272857d;
        gl4.z zVar = this.f272858e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f272857d = 1;
            b17 = zVar.b(null, 2, this);
            if (b17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            b17 = obj;
        }
        bw5.y80 y80Var = (bw5.y80) b17;
        boolean z17 = (y80Var == null || (baseResponse = y80Var.getBaseResponse()) == null || baseResponse.f376959d != 0) ? false : true;
        android.content.Context context = this.f272859f;
        qk.y8 y8Var = this.f272860g;
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TingMembershipHelper", "joinMembershipByBindQQMusicVIP success");
            if ((y80Var.f35403h[3] ? y80Var.f35400e : new bw5.r70()) != null) {
                gl4.z zVar2 = this.f272858e;
                android.content.Context context2 = this.f272859f;
                bw5.r70 r70Var = y80Var.f35403h[3] ? y80Var.f35400e : new bw5.r70();
                android.widget.ImageView imageView = new android.widget.ImageView(context);
                imageView.setImageResource(com.tencent.mm.R.raw.checkbox_selected);
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479723df);
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(dimensionPixelSize, dimensionPixelSize);
                marginLayoutParams.topMargin = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479706d1);
                marginLayoutParams.bottomMargin = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn);
                imageView.setLayoutParams(marginLayoutParams);
                gl4.z.c(zVar2, context2, r70Var, null, imageView, hl4.a.f282102e, 0, new gl4.f(y8Var), new gl4.g(y8Var), null, new gl4.h(y8Var), 292, null);
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.TingMembershipHelper", "joinMembershipByBindQQMusicVIP success but succHalfPanel invalid");
                gl4.z.a(y8Var);
            }
        } else {
            if (y8Var != null) {
                y8Var.a(new qk.ea(qk.ga.f364136f, null));
            }
            zVar.getClass();
            db5.t7.g(context, context.getString(com.tencent.mm.R.string.lgg));
        }
        return jz5.f0.f302826a;
    }
}
