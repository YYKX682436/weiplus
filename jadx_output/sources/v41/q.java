package v41;

/* loaded from: classes15.dex */
public final class q extends v41.c implements l75.q0 {

    /* renamed from: h, reason: collision with root package name */
    public final android.view.ViewGroup f433224h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f433225i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f433226m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.ImageView f433227n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.TextView f433228o;

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.TextView f433229p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.TextView f433230q;

    /* renamed from: r, reason: collision with root package name */
    public j41.u f433231r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(android.app.Activity context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f433204d = context;
        android.view.View findViewById = context.findViewById(com.tencent.mm.R.id.c_4);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById;
        this.f433224h = viewGroup;
        viewGroup.setVisibility(0);
        android.view.View findViewById2 = context.findViewById(com.tencent.mm.R.id.c_w);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.view.View findViewById3 = context.findViewById(com.tencent.mm.R.id.c_5);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById3;
        this.f433225i = textView;
        android.view.View findViewById4 = context.findViewById(com.tencent.mm.R.id.c_3);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById4;
        this.f433226m = textView2;
        android.view.View findViewById5 = context.findViewById(com.tencent.mm.R.id.f483758bz2);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        android.view.View findViewById6 = context.findViewById(com.tencent.mm.R.id.f485462hr4);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById6;
        this.f433227n = imageView;
        android.view.View findViewById7 = context.findViewById(com.tencent.mm.R.id.hr6);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        android.widget.TextView textView3 = (android.widget.TextView) findViewById7;
        this.f433228o = textView3;
        android.view.View findViewById8 = context.findViewById(com.tencent.mm.R.id.f485463hr5);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.f433229p = (android.widget.TextView) findViewById8;
        android.view.View findViewById9 = context.findViewById(com.tencent.mm.R.id.f485461hr3);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        this.f433230q = (android.widget.TextView) findViewById9;
        ((i41.l) i95.n0.c(i41.l.class)).Ui().add(this);
        com.tencent.mm.ui.bk.r0(((android.widget.TextView) findViewById2).getPaint(), 0.8f);
        com.tencent.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
        ((android.widget.TextView) findViewById5).setOnClickListener(new v41.n(this));
        textView.setVisibility(8);
        imageView.setVisibility(8);
        textView3.setVisibility(8);
        textView2.setEnabled(false);
    }

    public static final void h(v41.q qVar) {
        qVar.g(0, "");
    }

    @Override // v41.c, v41.s
    public void a() {
        super.a();
    }

    @Override // v41.s
    public void b() {
        ku5.u0 u0Var = ku5.t0.f312615d;
        v41.o oVar = new v41.o(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(oVar, 400L, false);
    }

    @Override // v41.c, v41.s
    public void c(int i17, int i18, j41.i0 confirmData) {
        java.lang.String str;
        android.view.ViewPropertyAnimator alpha;
        android.view.ViewPropertyAnimator duration;
        android.view.ViewPropertyAnimator startDelay;
        com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest openIMKefuStartConversationRequest;
        kotlin.jvm.internal.o.g(confirmData, "confirmData");
        super.c(i17, i18, confirmData);
        j41.u uVar = confirmData.f297643d;
        this.f433231r = uVar;
        v41.p pVar = new v41.p(this, i17);
        android.widget.TextView textView = this.f433226m;
        textView.setOnClickListener(pVar);
        this.f433225i.setVisibility(0);
        android.widget.ImageView imageView = this.f433227n;
        imageView.setVisibility(0);
        android.widget.TextView textView2 = this.f433228o;
        textView2.setVisibility(0);
        textView.setEnabled(true);
        if (uVar == null || (str = ((k41.g0) uVar).field_nickname) == null) {
            str = "";
        }
        textView2.setText(str);
        kotlin.jvm.internal.o.d(uVar);
        k41.g0 g0Var = (k41.g0) uVar;
        i(g0Var.field_openImAppId, ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).fj(g0Var.field_openImAppId, g0Var.field_openImDescWordingId));
        java.lang.String str2 = confirmData.f297645f;
        boolean z17 = str2 == null || str2.length() == 0;
        android.widget.TextView textView3 = this.f433230q;
        if (z17) {
            textView3.setVisibility(8);
        } else {
            textView3.setText(confirmData.f297645f);
            textView3.setVisibility(0);
        }
        com.tencent.mm.pluginsdk.ui.u.a(imageView, g0Var.field_username);
        android.view.ViewGroup viewGroup = this.f433224h;
        viewGroup.setVisibility(0);
        l41.m mVar = this.f433205e;
        int i19 = -1;
        if (mVar != null && (openIMKefuStartConversationRequest = ((l41.j1) mVar).f315844c) != null) {
            i19 = openIMKefuStartConversationRequest.f72274f;
        }
        if (!(i19 == 3 || i19 == 5)) {
            viewGroup.setAlpha(1.0f);
            return;
        }
        viewGroup.setAlpha(0.0f);
        android.view.ViewPropertyAnimator animate = viewGroup.animate();
        if (animate == null || (alpha = animate.alpha(1.0f)) == null || (duration = alpha.setDuration(200L)) == null || (startDelay = duration.setStartDelay(100L)) == null) {
            return;
        }
        startDelay.start();
    }

    @Override // v41.c, v41.s
    public void d(l41.m confirmController) {
        kotlin.jvm.internal.o.g(confirmController, "confirmController");
        super.d(confirmController);
        this.f433224h.setVisibility(0);
        android.app.Activity activity = this.f433204d;
        if (activity instanceof com.tencent.mm.ui.MMActivity) {
            kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            com.tencent.mm.ui.ga controller = ((com.tencent.mm.ui.MMActivity) activity).getController();
            android.app.Activity activity2 = this.f433204d;
            kotlin.jvm.internal.o.d(activity2);
            controller.G0(activity2.getResources().getColor(com.tencent.mm.R.color.aaw));
        }
    }

    @Override // v41.c, v41.s
    public void e() {
        l41.m mVar = this.f433205e;
        boolean z17 = false;
        if (mVar != null && ((l41.j1) mVar).i()) {
            z17 = true;
        }
        if (z17) {
            super.e();
        }
    }

    @Override // v41.c, v41.s
    public void f() {
        l41.m mVar = this.f433205e;
        boolean z17 = false;
        if (mVar != null && ((l41.j1) mVar).h()) {
            z17 = true;
        }
        if (z17) {
            super.f();
        }
    }

    public final void i(java.lang.String str, java.lang.String str2) {
        boolean z17 = str2 == null || str2.length() == 0;
        android.widget.TextView textView = this.f433229p;
        if (z17) {
            textView.setText("");
            textView.setVisibility(8);
            return;
        }
        if (kotlin.jvm.internal.o.b("3552365301", str)) {
            str2 = "@" + str2;
        }
        textView.setText(str2);
        textView.setVisibility(0);
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        if ((str == null || str.length() == 0) || w0Var == null) {
            return;
        }
        java.lang.Object obj = w0Var.f316976d;
        if (obj instanceof u41.k) {
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.openim.storage.OpenIMWordingInfo");
            u41.k kVar = (u41.k) obj;
            java.lang.String str2 = kVar.field_appid;
            j41.u uVar = this.f433231r;
            if (kotlin.jvm.internal.o.b(str2, uVar != null ? ((k41.g0) uVar).field_openImAppId : null)) {
                java.lang.String str3 = kVar.field_wordingId;
                j41.u uVar2 = this.f433231r;
                if (kotlin.jvm.internal.o.b(str3, uVar2 != null ? ((k41.g0) uVar2).field_openImDescWordingId : null)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMKefuConfirmFullUIModelImpl", "onNotifyChange openImAppId: %s, wordingId: %s, wording: %s", kVar.field_appid, kVar.field_wordingId, kVar.field_wording);
                    i(kVar.field_appid, kVar.field_wording);
                }
            }
        }
    }

    @Override // v41.c, v41.s
    public void release() {
        this.f433204d = null;
        ((i41.l) i95.n0.c(i41.l.class)).Ui().remove(this);
    }
}
