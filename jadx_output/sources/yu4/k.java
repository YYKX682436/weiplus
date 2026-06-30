package yu4;

/* loaded from: classes8.dex */
public final class k extends androidx.appcompat.app.i0 implements com.tencent.mm.ui.tools.c5 {

    /* renamed from: f, reason: collision with root package name */
    public final r45.xi0 f465881f;

    /* renamed from: g, reason: collision with root package name */
    public final ur.l f465882g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f465883h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f465884i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f465885m;

    /* renamed from: n, reason: collision with root package name */
    public yu4.n f465886n;

    /* renamed from: o, reason: collision with root package name */
    public yu4.o f465887o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f465888p;

    /* renamed from: q, reason: collision with root package name */
    public long f465889q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f465890r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(android.content.Context context, r45.xi0 homeContext, ur.l listener) {
        super(context, com.tencent.mm.R.style.f494157fp);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(homeContext, "homeContext");
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f465881f = homeContext;
        this.f465882g = listener;
        this.f465883h = "MicroMsg.WebSearch.EmojiSearchDialog";
        this.f465888p = "com.tencent.mm.Intent.ACTION_NET_STATS";
    }

    public final void D(r45.sn3 shareContent, java.lang.String str) {
        kotlin.jvm.internal.o.g(shareContent, "shareContent");
        com.tencent.mars.xlog.Log.i(this.f465883h, "onSearchShare " + shareContent.toJSON() + '}');
        pm0.v.X(new yu4.f(this, shareContent, str));
    }

    public final void E(java.lang.String id6) {
        kotlin.jvm.internal.o.g(id6, "id");
        if (this.f465890r == null) {
            this.f465890r = com.tencent.mm.ui.widget.dialog.u3.f(getContext(), getContext().getString(com.tencent.mm.R.string.ggc), true, 0, new yu4.g(this));
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f465890r;
        if (u3Var == null || u3Var.isShowing()) {
            return;
        }
        u3Var.show();
    }

    public final void F(r45.lw5 emoticon, r45.rn3 request, byte[] bArr) {
        kotlin.jvm.internal.o.g(emoticon, "emoticon");
        kotlin.jvm.internal.o.g(request, "request");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f465889q = android.os.SystemClock.elapsedRealtime();
        o25.q1 q1Var = (o25.q1) i95.n0.c(o25.q1.class);
        android.content.Context context = getContext();
        r45.xi0 xi0Var = this.f465881f;
        ((r35.k1) q1Var).Bi(context, xi0Var.f390123o, emoticon.toByteArray(), null, xi0Var.f390125q, this.f465889q, bArr, new yu4.h(this, request));
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        this.f465889q = 0L;
        com.tencent.mm.sdk.platformtools.t8.t0(this.f465884i);
        super.dismiss();
        android.content.Intent intent = new android.content.Intent(this.f465888p);
        intent.putExtra("ui", yu4.k.class.getSimpleName());
        intent.putExtra("opCode", 4);
        getContext().sendBroadcast(intent);
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        android.view.View findViewById;
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator rotation;
        android.view.ViewPropertyAnimator duration;
        android.widget.TextView textView;
        if (!this.f465885m) {
            dismiss();
            return;
        }
        android.view.View view = this.f465884i;
        if (view != null && (textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.odf)) != null) {
            textView.setText(com.tencent.mm.R.string.bxv);
        }
        android.view.View view2 = this.f465884i;
        if (view2 != null && (findViewById = view2.findViewById(com.tencent.mm.R.id.f483758bz2)) != null && (animate = findViewById.animate()) != null && (rotation = animate.rotation(0.0f)) != null && (duration = rotation.setDuration(200L)) != null) {
            duration.start();
        }
        yu4.o oVar = this.f465887o;
        if (oVar != null) {
            oVar.f465909g.animate().translationX(i65.a.B(oVar.H())).setDuration(300L).start();
        }
        this.f465885m = false;
    }

    @Override // androidx.appcompat.app.i0, android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.view.Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        android.view.Window window2 = getWindow();
        if (window2 != null) {
            window2.addFlags(67108864);
        }
        android.view.Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(48);
        }
        android.view.Window window4 = getWindow();
        if (window4 != null) {
            window4.setDimAmount(0.5f);
        }
        android.view.Window window5 = getWindow();
        if (window5 != null) {
            window5.setWindowAnimations(com.tencent.mm.R.style.f494075dq);
        }
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.a7d, (android.view.ViewGroup) null);
        setContentView(inflate, new android.view.ViewGroup.LayoutParams(-1, -1));
        inflate.findViewById(com.tencent.mm.R.id.f484220df2).setOnTouchListener(new yu4.a(this));
        inflate.findViewById(com.tencent.mm.R.id.f483758bz2).setOnClickListener(new yu4.b(this));
        ((android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.meb)).setOnClickListener(new yu4.c(inflate));
        ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.odf)).setTextSize(0, i65.a.f(getContext(), com.tencent.mm.R.dimen.f479850gz) * i65.a.m(getContext()));
        this.f465886n = new yu4.n(this, this.f465881f, this.f465882g, inflate);
        setOnShowListener(new yu4.d(this));
        setOnDismissListener(new yu4.e(this));
        setCancelable(true);
        this.f465884i = inflate;
        android.content.Intent intent = new android.content.Intent(this.f465888p);
        intent.putExtra("ui", yu4.k.class.getSimpleName());
        intent.putExtra("opCode", 3);
        getContext().sendBroadcast(intent);
    }

    @Override // com.tencent.mm.ui.tools.c5
    public void w2(int i17, boolean z17) {
        yu4.n nVar = this.f465886n;
        if (nVar != null) {
            nVar.f465905q = a06.d.b(i17 / i65.a.g(nVar.f465895d.getContext()));
            nVar.f465901m.e(nVar.a(), nVar.f465905q);
        }
    }
}
