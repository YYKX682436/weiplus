package lp1;

/* loaded from: classes14.dex */
public final class b extends in5.s0 {

    /* renamed from: v, reason: collision with root package name */
    public static final int f320268v = qp1.e0.a(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv));

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.view.shadow.layout.WxShadowLinearLayout f320269n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.FrameLayout f320270o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.RoundCornerRelativeLayout f320271p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.plugin.ball.view.FloatBallRoundCornerFrameLayout f320272q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f320273r;

    /* renamed from: s, reason: collision with root package name */
    public final android.widget.RelativeLayout f320274s;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.View f320275t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.Boolean f320276u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.view.View view) {
        super(view);
        kotlin.jvm.internal.o.g(view, "view");
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.f483337sh2);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.view.shadow.layout.WxShadowLinearLayout wxShadowLinearLayout = (com.tencent.mm.view.shadow.layout.WxShadowLinearLayout) findViewById;
        this.f320269n = wxShadowLinearLayout;
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.f483334ad3);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.view.View findViewById3 = view.findViewById(com.tencent.mm.R.id.acy);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f320270o = (android.widget.FrameLayout) findViewById3;
        android.view.View findViewById4 = view.findViewById(com.tencent.mm.R.id.sgz);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f320271p = (com.tencent.mm.ui.widget.RoundCornerRelativeLayout) findViewById4;
        android.view.View findViewById5 = view.findViewById(com.tencent.mm.R.id.f483333sh0);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f320272q = (com.tencent.mm.plugin.ball.view.FloatBallRoundCornerFrameLayout) findViewById5;
        android.view.View findViewById6 = view.findViewById(com.tencent.mm.R.id.f483331ad1);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById6;
        this.f320273r = weImageView;
        android.view.View findViewById7 = view.findViewById(com.tencent.mm.R.id.f483332ad2);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) findViewById7;
        this.f320274s = relativeLayout;
        android.view.View findViewById8 = view.findViewById(com.tencent.mm.R.id.f483336sh1);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.f320275t = findViewById8;
        wxShadowLinearLayout.setBlurRadius(pp1.b.f357395d);
        ((com.tencent.mm.plugin.ball.view.FloatBallRoundCornerFrameLayout) findViewById2).setRadius(pp1.b.f357399h);
        android.content.Context context = view.getContext();
        qp1.g0.e(weImageView, qp1.e0.a(context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479672c9)), qp1.e0.a(context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479704cz)));
        y();
        qp1.g0.e(relativeLayout, qp1.c0.f365700i, qp1.c0.f365701j);
        wxShadowLinearLayout.a(false);
    }

    public final void x() {
        android.widget.RelativeLayout relativeLayout = this.f320274s;
        if (relativeLayout.getVisibility() != 8) {
            relativeLayout.setVisibility(8);
        }
        relativeLayout.setAlpha(0.0f);
    }

    public final void y() {
        int i17 = f320268v;
        this.f320271p.setRadius(i17);
        com.tencent.mm.plugin.ball.view.FloatBallRoundCornerFrameLayout floatBallRoundCornerFrameLayout = this.f320272q;
        floatBallRoundCornerFrameLayout.setRadius(i17);
        int i18 = com.tencent.mm.plugin.ball.view.ContentFloatBallCollapseView.f93385q;
        floatBallRoundCornerFrameLayout.a(com.tencent.mm.plugin.ball.view.ContentFloatBallCollapseView.f93387s, this.f293121e.getResources().getColor(com.tencent.mm.R.color.aku));
    }

    public final void z(android.view.View view, boolean z17) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = null;
        } else if (layoutParams instanceof android.widget.RelativeLayout.LayoutParams) {
            if (z17) {
                android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
                layoutParams2.removeRule(20);
                layoutParams2.addRule(21);
            } else {
                android.widget.RelativeLayout.LayoutParams layoutParams3 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
                layoutParams3.removeRule(21);
                layoutParams3.addRule(20);
            }
        }
        view.setLayoutParams(layoutParams);
    }
}
