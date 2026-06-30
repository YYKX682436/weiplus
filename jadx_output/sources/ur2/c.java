package ur2;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.appcompat.app.AppCompatActivity f430384a;

    /* renamed from: b, reason: collision with root package name */
    public final ry2.e f430385b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f430386c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.dialog.y1 f430387d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f430388e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f430389f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f430390g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f430391h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f430392i;

    public c(androidx.appcompat.app.AppCompatActivity activity, ry2.e eVar, java.lang.String title, final yz5.a aVar) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(title, "title");
        this.f430384a = activity;
        this.f430385b = eVar;
        this.f430386c = title;
        com.tencent.mm.ui.widget.dialog.y1 y1Var = new com.tencent.mm.ui.widget.dialog.y1(activity);
        this.f430387d = y1Var;
        android.view.View inflate = android.view.LayoutInflater.from(activity).inflate(com.tencent.mm.R.layout.ede, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f430388e = inflate;
        y1Var.f212044z = true;
        y1Var.o(aVar != null ? new com.tencent.mm.ui.widget.dialog.h2(aVar) { // from class: ur2.b

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ yz5.a f430383a;

            {
                kotlin.jvm.internal.o.g(aVar, "function");
                this.f430383a = aVar;
            }

            @Override // com.tencent.mm.ui.widget.dialog.h2
            public final /* synthetic */ void onDismiss() {
                this.f430383a.invoke();
            }
        } : null);
        y1Var.l(inflate, new android.widget.FrameLayout.LayoutParams(-1, -2));
    }

    public final void a(java.lang.String str, java.lang.String str2) {
        mn2.g1 g1Var = mn2.g1.f329975a;
        vo0.d a17 = g1Var.a();
        mn2.n nVar = new mn2.n(str, null, 2, null);
        android.widget.ImageView imageView = this.f430390g;
        if (imageView == null) {
            kotlin.jvm.internal.o.o("avatarIv");
            throw null;
        }
        a17.c(nVar, imageView, g1Var.h(mn2.f1.f329957h));
        android.widget.TextView textView = this.f430389f;
        if (textView == null) {
            kotlin.jvm.internal.o.o("nickTv");
            throw null;
        }
        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(this.f430384a, str2));
    }

    public final void b() {
        jz5.f0 f0Var;
        jz5.f0 f0Var2;
        android.view.View view = this.f430388e;
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.u1s);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f430392i = findViewById;
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.u1q);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f430391h = findViewById2;
        android.view.View findViewById3 = view.findViewById(com.tencent.mm.R.id.u1r);
        findViewById3.getLayoutParams().height = findViewById3.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479706d1);
        android.view.View findViewById4 = view.findViewById(com.tencent.mm.R.id.tso);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f430390g = (android.widget.ImageView) findViewById4;
        android.view.View findViewById5 = view.findViewById(com.tencent.mm.R.id.tsn);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f430389f = (android.widget.TextView) findViewById5;
        android.view.View findViewById6 = view.findViewById(com.tencent.mm.R.id.tsp);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById6;
        ry2.e eVar = this.f430385b;
        imageView.setImageDrawable(eVar != null ? eVar.e() : null);
        android.view.View findViewById7 = view.findViewById(com.tencent.mm.R.id.tsm);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        com.tencent.mm.ui.fk.b((android.widget.TextView) findViewById7);
        java.lang.String str = this.f430386c;
        boolean z17 = str.length() == 0;
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f430384a;
        if (z17) {
            str = appCompatActivity.getString(com.tencent.mm.R.string.ok8);
            kotlin.jvm.internal.o.f(str, "getString(...)");
        }
        ((android.widget.TextView) view.findViewById(com.tencent.mm.R.id.tsq)).setText(str);
        android.view.View view2 = this.f430392i;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("headIndicatorLine");
            throw null;
        }
        android.content.res.Resources resources = view2.getContext().getResources();
        float dimension = resources.getDimension(com.tencent.mm.R.dimen.f479727dj);
        float dimension2 = resources.getDimension(com.tencent.mm.R.dimen.f479688cn);
        float dimension3 = resources.getDimension(com.tencent.mm.R.dimen.f479646bl);
        com.tencent.mm.ui.widget.dialog.y1 y1Var = this.f430387d;
        com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior = y1Var.f212036r;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.f44453z = new ur2.a(this, dimension, dimension3, dimension2);
        }
        java.lang.String e17 = xy2.c.e(appCompatActivity);
        ya2.b2 b17 = !com.tencent.mm.sdk.platformtools.t8.K0(e17) ? ya2.h.f460484a.b(e17) : null;
        if (b17 != null) {
            r45.xk b18 = ya2.d.b(b17, true);
            f0Var = jz5.f0.f302826a;
            if (b18 != null) {
                a(b18.getString(2), b18.getString(1));
                f0Var2 = f0Var;
            } else {
                f0Var2 = null;
            }
            if (f0Var2 == null) {
                a(b17.field_avatarUrl, b17.w0());
            }
            android.widget.ImageView imageView2 = this.f430390g;
            if (imageView2 == null) {
                kotlin.jvm.internal.o.o("avatarIv");
                throw null;
            }
            imageView2.setVisibility(0);
            android.widget.TextView textView = this.f430389f;
            if (textView == null) {
                kotlin.jvm.internal.o.o("nickTv");
                throw null;
            }
            textView.setVisibility(0);
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            android.widget.ImageView imageView3 = this.f430390g;
            if (imageView3 == null) {
                kotlin.jvm.internal.o.o("avatarIv");
                throw null;
            }
            imageView3.setVisibility(8);
            android.widget.TextView textView2 = this.f430389f;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("nickTv");
                throw null;
            }
            textView2.setVisibility(8);
        }
        y1Var.s();
    }
}
