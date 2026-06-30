package ku3;

/* loaded from: classes3.dex */
public final class e3 implements yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final zt3.a f312204d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.ViewGroup f312205e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f312206f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f312207g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f312208h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f312209i;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f312210m;

    /* renamed from: n, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f312211n;

    /* renamed from: o, reason: collision with root package name */
    public final int f312212o;

    /* renamed from: p, reason: collision with root package name */
    public final int f312213p;

    /* renamed from: q, reason: collision with root package name */
    public final int f312214q;

    /* renamed from: r, reason: collision with root package name */
    public final int f312215r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f312216s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f312217t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f312218u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f312219v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.TextView f312220w;

    /* renamed from: x, reason: collision with root package name */
    public float f312221x;

    /* renamed from: y, reason: collision with root package name */
    public int f312222y;

    public e3(zt3.a kitContext, android.view.ViewGroup parent, ju3.d0 status) {
        kotlin.jvm.internal.o.g(kitContext, "kitContext");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(status, "status");
        this.f312204d = kitContext;
        this.f312205e = parent;
        this.f312206f = jz5.h.b(new ku3.o2(this));
        this.f312207g = jz5.h.b(new ku3.p2(this));
        this.f312208h = jz5.h.b(new ku3.r2(this));
        this.f312209i = jz5.h.b(new ku3.q2(this));
        this.f312210m = i65.a.i(parent.getContext(), com.tencent.mm.R.drawable.f481087kd);
        this.f312211n = i65.a.i(parent.getContext(), com.tencent.mm.R.drawable.f481088ke);
        this.f312212o = i65.a.d(parent.getContext(), com.tencent.mm.R.color.BW_100_Alpha_0_5);
        this.f312213p = i65.a.d(parent.getContext(), com.tencent.mm.R.color.f478553an);
        this.f312214q = i65.a.f(parent.getContext(), com.tencent.mm.R.dimen.f479672c9);
        this.f312215r = i65.a.f(parent.getContext(), com.tencent.mm.R.dimen.f479673ca);
        this.f312222y = 1;
    }

    public static final void a(ku3.e3 e3Var, android.widget.TextView textView) {
        android.widget.TextView textView2 = e3Var.f312220w;
        if (textView2 != null) {
            textView2.setTextColor(e3Var.f312212o);
        }
        android.widget.TextView textView3 = e3Var.f312220w;
        if (textView3 != null) {
            textView3.setTextSize(0, e3Var.f312214q);
        }
        e3Var.f312220w = textView;
        if (textView != null) {
            textView.setTextColor(e3Var.f312213p);
        }
        if (textView != null) {
            textView.setTextSize(0, e3Var.f312215r);
        }
    }

    public final android.widget.TextView b(java.lang.String str) {
        android.widget.TextView textView = new android.widget.TextView(this.f312205e.getContext());
        textView.setText(str);
        return textView;
    }

    public final android.view.View c() {
        java.lang.Object value = ((jz5.n) this.f312206f).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    public final com.tencent.mm.ui.widget.imageview.WeImageView d() {
        java.lang.Object value = ((jz5.n) this.f312207g).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.mm.ui.widget.imageview.WeImageView) value;
    }

    public final android.view.View e() {
        java.lang.Object value = ((jz5.n) this.f312209i).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    public final android.view.ViewGroup f() {
        java.lang.Object value = ((jz5.n) this.f312208h).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.ViewGroup) value;
    }

    @Override // yt3.r2
    public void t(com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider) {
        kotlin.jvm.internal.o.g(configProvider, "configProvider");
        ku3.z2 z2Var = new ku3.z2(this);
        zt3.a aVar = this.f312204d;
        aVar.Q6(13, z2Var);
        aVar.Q6(10, new ku3.b3(this));
        aVar.R6(new ku3.d3(this));
        c().setOnClickListener(ku3.s2.f312407d);
        e().setBackground(this.f312211n);
        d().s(com.tencent.mm.R.raw.icons_menu_beauty, com.tencent.mm.R.color.f478773gt);
        android.view.ViewGroup viewGroup = this.f312205e;
        int b17 = i65.a.b(viewGroup.getContext(), 30);
        f().setPadding(b17, 0, b17, 0);
        e().setOnClickListener(new ku3.u2(this));
        java.lang.String r17 = i65.a.r(viewGroup.getContext(), com.tencent.mm.R.string.hmf);
        kotlin.jvm.internal.o.f(r17, "getString(...)");
        android.widget.TextView b18 = b(r17);
        b18.setTextColor(this.f312213p);
        b18.setTextSize(0, this.f312215r);
        b18.setGravity(17);
        b18.setOnClickListener(new ku3.v2(this));
        this.f312216s = b18;
        java.lang.String r18 = i65.a.r(viewGroup.getContext(), com.tencent.mm.R.string.hmb);
        kotlin.jvm.internal.o.f(r18, "getString(...)");
        android.widget.TextView b19 = b(r18);
        int i17 = this.f312212o;
        b19.setTextColor(i17);
        b19.setGravity(17);
        float f17 = this.f312214q;
        b19.setTextSize(0, f17);
        b19.setOnClickListener(new ku3.w2(this));
        this.f312217t = b19;
        java.lang.String r19 = i65.a.r(viewGroup.getContext(), com.tencent.mm.R.string.hmc);
        kotlin.jvm.internal.o.f(r19, "getString(...)");
        android.widget.TextView b27 = b(r19);
        b27.setTextColor(i17);
        b27.setGravity(17);
        b27.setTextSize(0, f17);
        b27.setOnClickListener(new ku3.x2(this));
        this.f312218u = b27;
        java.lang.String r27 = i65.a.r(viewGroup.getContext(), com.tencent.mm.R.string.hma);
        kotlin.jvm.internal.o.f(r27, "getString(...)");
        android.widget.TextView b28 = b(r27);
        b28.setTextColor(i17);
        b28.setGravity(17);
        b28.setTextSize(0, f17);
        b28.setOnClickListener(new ku3.y2(this));
        this.f312219v = b28;
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(0, -1, 1.0f);
        layoutParams.gravity = 16;
        f().addView(this.f312216s, layoutParams);
        f().addView(this.f312217t, layoutParams);
        f().addView(this.f312218u, layoutParams);
        f().addView(this.f312219v, layoutParams);
        this.f312220w = this.f312216s;
    }
}
