package ku3;

/* loaded from: classes3.dex */
public final class i5 implements yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final zt3.a f312262d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.ViewGroup f312263e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f312264f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f312265g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f312266h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f312267i;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f312268m;

    /* renamed from: n, reason: collision with root package name */
    public final int f312269n;

    /* renamed from: o, reason: collision with root package name */
    public final int f312270o;

    /* renamed from: p, reason: collision with root package name */
    public final int f312271p;

    /* renamed from: q, reason: collision with root package name */
    public final int f312272q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f312273r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f312274s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f312275t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f312276u;

    /* renamed from: v, reason: collision with root package name */
    public float f312277v;

    /* renamed from: w, reason: collision with root package name */
    public int f312278w;

    public i5(zt3.a kitContext, android.view.ViewGroup parent, ju3.d0 status) {
        kotlin.jvm.internal.o.g(kitContext, "kitContext");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(status, "status");
        this.f312262d = kitContext;
        this.f312263e = parent;
        this.f312264f = jz5.h.b(new ku3.e5(this));
        this.f312265g = jz5.h.b(new ku3.f5(this));
        this.f312266h = jz5.h.b(new ku3.h5(this));
        this.f312267i = jz5.h.b(new ku3.g5(this));
        this.f312268m = i65.a.i(parent.getContext(), com.tencent.mm.R.drawable.f481088ke);
        this.f312269n = i65.a.d(parent.getContext(), com.tencent.mm.R.color.BW_100_Alpha_0_5);
        this.f312270o = i65.a.d(parent.getContext(), com.tencent.mm.R.color.f478553an);
        this.f312271p = i65.a.f(parent.getContext(), com.tencent.mm.R.dimen.f479672c9);
        this.f312272q = i65.a.f(parent.getContext(), com.tencent.mm.R.dimen.f479673ca);
        this.f312278w = 3;
    }

    public static final void a(ku3.i5 i5Var, android.widget.TextView textView) {
        android.widget.TextView textView2 = i5Var.f312276u;
        if (textView2 != null) {
            textView2.setTextColor(i5Var.f312269n);
        }
        android.widget.TextView textView3 = i5Var.f312276u;
        if (textView3 != null) {
            textView3.setTextSize(0, i5Var.f312271p);
        }
        i5Var.f312276u = textView;
        if (textView != null) {
            textView.setTextColor(i5Var.f312270o);
        }
        if (textView != null) {
            textView.setTextSize(0, i5Var.f312272q);
        }
    }

    public final android.view.View b() {
        java.lang.Object value = ((jz5.n) this.f312264f).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    public final com.tencent.mm.ui.widget.imageview.WeImageView c() {
        java.lang.Object value = ((jz5.n) this.f312265g).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.mm.ui.widget.imageview.WeImageView) value;
    }

    public final android.view.ViewGroup d() {
        java.lang.Object value = ((jz5.n) this.f312266h).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.ViewGroup) value;
    }

    @Override // yt3.r2
    public void t(com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider) {
        kotlin.jvm.internal.o.g(configProvider, "configProvider");
        ku3.t4 t4Var = new ku3.t4(this);
        zt3.a aVar = this.f312262d;
        aVar.Q6(14, t4Var);
        aVar.Q6(10, new ku3.v4(this));
        aVar.R6(new ku3.x4(this));
        b().setOnClickListener(ku3.y4.f312489d);
        jz5.g gVar = this.f312267i;
        java.lang.Object value = ((jz5.n) gVar).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        ((android.view.View) value).setBackground(this.f312268m);
        c().s(com.tencent.mm.R.raw.icons_menu_ratio_16_9, com.tencent.mm.R.color.f478773gt);
        android.view.ViewGroup viewGroup = this.f312263e;
        int b17 = i65.a.b(viewGroup.getContext(), 55);
        d().setPadding(b17, 0, b17, 0);
        java.lang.Object value2 = ((jz5.n) gVar).getValue();
        kotlin.jvm.internal.o.f(value2, "getValue(...)");
        ((android.view.View) value2).setOnClickListener(new ku3.a5(this));
        java.lang.String r17 = i65.a.r(viewGroup.getContext(), com.tencent.mm.R.string.hmh);
        kotlin.jvm.internal.o.f(r17, "getString(...)");
        android.widget.TextView textView = new android.widget.TextView(viewGroup.getContext());
        textView.setText(r17);
        int i17 = this.f312269n;
        textView.setTextColor(i17);
        textView.setGravity(8388627);
        float f17 = this.f312271p;
        textView.setTextSize(0, f17);
        textView.setOnClickListener(new ku3.b5(this));
        this.f312273r = textView;
        java.lang.String r18 = i65.a.r(viewGroup.getContext(), com.tencent.mm.R.string.hmi);
        kotlin.jvm.internal.o.f(r18, "getString(...)");
        android.widget.TextView textView2 = new android.widget.TextView(viewGroup.getContext());
        textView2.setText(r18);
        textView2.setTextColor(i17);
        textView2.setGravity(17);
        textView2.setTextSize(0, f17);
        textView2.setOnClickListener(new ku3.c5(this));
        this.f312274s = textView2;
        java.lang.String r19 = i65.a.r(viewGroup.getContext(), com.tencent.mm.R.string.hmg);
        kotlin.jvm.internal.o.f(r19, "getString(...)");
        android.widget.TextView textView3 = new android.widget.TextView(viewGroup.getContext());
        textView3.setText(r19);
        textView3.setTextColor(this.f312270o);
        textView3.setGravity(8388629);
        textView3.setTextSize(0, this.f312272q);
        textView3.setOnClickListener(new ku3.d5(this));
        this.f312275t = textView3;
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(0, -1, 1.0f);
        layoutParams.gravity = 16;
        d().addView(this.f312273r, layoutParams);
        d().addView(this.f312274s, layoutParams);
        d().addView(this.f312275t, layoutParams);
        this.f312276u = this.f312275t;
    }
}
