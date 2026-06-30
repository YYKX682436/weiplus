package sp1;

/* loaded from: classes8.dex */
public final class b extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public pp1.a f410947d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f410948e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.FrameLayout f410949f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f410950g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f410951h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f410952i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.plugin.ball.view.FloatBallRoundGradientFrameLayout f410953m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.content.Context context, pp1.a item) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(item, "item");
        this.f410947d = item;
        android.view.View.inflate(context, com.tencent.mm.R.layout.eey, this);
        setLayoutParams(new android.widget.RelativeLayout.LayoutParams(qp1.c0.f365694c, qp1.c0.f365695d));
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.tx_);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f410953m = (com.tencent.mm.plugin.ball.view.FloatBallRoundGradientFrameLayout) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.t0p);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f410948e = (android.widget.ImageView) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.t0o);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f410950g = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.sgt);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f410949f = (android.widget.FrameLayout) findViewById4;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.t0n);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.um8);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById6;
        this.f410951h = weImageView;
        android.view.View findViewById7 = findViewById(com.tencent.mm.R.id.um9);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f410952i = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById7;
        weImageView.setOnClickListener(new sp1.a(this));
        b(this.f410947d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.tencent.mm.plugin.ball.model.BallInfo getBallInfo() {
        return this.f410947d.f357393d;
    }

    private final int getRealBallType() {
        return getBallInfo().f93046d == 20 ? getBallInfo().f93047e : getBallInfo().f93046d;
    }

    public final void b(pp1.a item) {
        jz5.f0 f0Var;
        kotlin.jvm.internal.o.g(item, "item");
        this.f410947d = item;
        this.f410949f.setVisibility(0);
        android.widget.ImageView imageView = this.f410948e;
        imageView.setVisibility(0);
        int a17 = qp1.e0.a(getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479648bn));
        int d17 = i65.a.d(getContext(), com.tencent.mm.R.color.aby);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f410951h;
        weImageView.setContentDescription(weImageView.getResources().getString(com.tencent.mm.R.string.f493312lg0));
        weImageView.setPadding(a17, a17, a17, a17);
        weImageView.setIconColor(d17);
        qp1.g0 g0Var = qp1.g0.f365722a;
        int d18 = g0Var.d(getRealBallType());
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.f410952i;
        weImageView2.setImageResource(d18);
        weImageView2.setAlpha(0.5f);
        weImageView2.setIconColor(d17);
        weImageView2.setPadding(a17, a17, a17, a17);
        com.tencent.mm.plugin.ball.service.g gVar = com.tencent.mm.plugin.ball.service.g.f93161a;
        com.tencent.mm.plugin.ball.model.BallInfo info = getBallInfo();
        kotlin.jvm.internal.o.g(info, "info");
        java.lang.String e17 = info.e();
        kotlin.jvm.internal.o.f(e17, "generateHashKey(...)");
        android.graphics.Bitmap L = com.tencent.mm.sdk.platformtools.x.L(gVar.a(e17), 500, 500);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = this.f410950g;
        if (L != null) {
            imageView.setImageBitmap(L);
            weImageView3.setVisibility(8);
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            weImageView3.setImageResource(g0Var.d(getRealBallType()));
            weImageView3.setVisibility(0);
            imageView.setVisibility(8);
        }
        this.f410953m.setUseBottomGradient(true);
    }
}
