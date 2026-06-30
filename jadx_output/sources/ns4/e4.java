package ns4;

/* loaded from: classes8.dex */
public final class e4 {

    /* renamed from: a, reason: collision with root package name */
    public final yz5.a f339513a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.dialog.y1 f339514b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.View f339515c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.LinearLayout f339516d;

    public e4(android.content.Context context, pr4.e parameter, yz5.a onBack) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(parameter, "parameter");
        kotlin.jvm.internal.o.g(onBack, "onBack");
        this.f339513a = onBack;
        com.tencent.mm.ui.widget.dialog.y1 y1Var = new com.tencent.mm.ui.widget.dialog.y1(context);
        this.f339514b = y1Var;
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.dds, null);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.aa9);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f339515c = findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.o_w);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f339516d = (android.widget.LinearLayout) findViewById2;
        y1Var.k(inflate);
        y1Var.f212037s = new ns4.c4(this);
        android.view.LayoutInflater from = android.view.LayoutInflater.from(context);
        java.util.List<java.lang.String> list = parameter.f357992f;
        int i17 = 0;
        for (java.lang.String str : list) {
            int i18 = i17 + 1;
            android.widget.LinearLayout linearLayout = this.f339516d;
            if (linearLayout == null) {
                kotlin.jvm.internal.o.o("tips");
                throw null;
            }
            android.view.View inflate2 = from.inflate(com.tencent.mm.R.layout.ddr, (android.view.ViewGroup) linearLayout, false);
            android.view.View findViewById3 = inflate2.findViewById(com.tencent.mm.R.id.o_1);
            kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
            android.widget.TextView textView = (android.widget.TextView) findViewById3;
            if (i17 != kz5.c0.h(list)) {
                android.view.ViewGroup.LayoutParams layoutParams = inflate2.getLayoutParams();
                kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                ((android.widget.LinearLayout.LayoutParams) layoutParams).bottomMargin = i65.a.b(context, 8);
            }
            os4.h.b(textView, str);
            android.widget.LinearLayout linearLayout2 = this.f339516d;
            if (linearLayout2 == null) {
                kotlin.jvm.internal.o.o("tips");
                throw null;
            }
            linearLayout2.addView(inflate2);
            i17 = i18;
        }
        android.view.View view = this.f339515c;
        if (view == null) {
            kotlin.jvm.internal.o.o("back_button");
            throw null;
        }
        view.setOnClickListener(new ns4.d4(this));
    }
}
