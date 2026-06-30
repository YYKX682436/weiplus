package ft4;

/* loaded from: classes14.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f266697a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f266698b;

    /* renamed from: c, reason: collision with root package name */
    public int f266699c;

    /* renamed from: d, reason: collision with root package name */
    public int f266700d;

    /* renamed from: e, reason: collision with root package name */
    public int f266701e;

    /* renamed from: f, reason: collision with root package name */
    public final int f266702f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.LinearLayout f266703g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.LinearLayout f266704h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f266705i;

    /* renamed from: j, reason: collision with root package name */
    public final android.widget.TextView f266706j;

    /* renamed from: k, reason: collision with root package name */
    public final android.widget.LinearLayout f266707k;

    /* renamed from: l, reason: collision with root package name */
    public final android.view.ViewGroup f266708l;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f266709m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.TextView f266710n;

    public u(android.content.Context context, android.view.View root) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(root, "root");
        this.f266697a = context;
        this.f266698b = root;
        this.f266699c = 1;
        this.f266703g = (android.widget.LinearLayout) root.findViewById(com.tencent.mm.R.id.q2o);
        this.f266704h = (android.widget.LinearLayout) root.findViewById(com.tencent.mm.R.id.q2g);
        this.f266705i = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.q2i);
        this.f266706j = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.q2t);
        this.f266707k = (android.widget.LinearLayout) root.findViewById(com.tencent.mm.R.id.q2w);
        this.f266708l = (android.view.ViewGroup) root.findViewById(com.tencent.mm.R.id.q2h);
        this.f266709m = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.q2j);
        this.f266710n = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.q2u);
        this.f266702f = i65.a.B(context) - i65.a.b(context, 72);
    }

    public final void a(com.tencent.mm.wallet_core.ui.z1 z1Var) {
        if (z1Var != null) {
            this.f266704h.setOnClickListener(z1Var);
            this.f266708l.setOnClickListener(z1Var);
        }
    }

    public final void b(int i17, int i18, long j17, long j18) {
        java.lang.String str;
        this.f266700d = i17;
        this.f266701e = i18;
        android.widget.TextView textView = this.f266710n;
        android.widget.TextView textView2 = this.f266706j;
        if (j17 == 0 && j18 == 0) {
            textView2.setVisibility(8);
            textView.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            textView.setVisibility(0);
        }
        double d17 = 100;
        java.lang.Object[] objArr = {com.tencent.mm.wallet_core.ui.r1.o(java.lang.Math.abs(j18) / d17)};
        android.content.Context context = this.f266697a;
        java.lang.String string = context.getString(com.tencent.mm.R.string.f493543lh3, objArr);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        java.lang.String string2 = context.getString(com.tencent.mm.R.string.f493544lh4, com.tencent.mm.wallet_core.ui.r1.o(java.lang.Math.abs(j17) / d17));
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        java.lang.String str2 = string + "  " + string2;
        int i19 = this.f266699c;
        if (i19 == 1) {
            str = com.tencent.mm.wallet_core.ui.r1.r(context.getString(com.tencent.mm.R.string.ld_), com.tencent.mm.wallet_core.ui.r1.f(i17));
            kotlin.jvm.internal.o.d(str);
        } else if (i19 == 2) {
            str = com.tencent.mm.wallet_core.ui.r1.r(context.getString(com.tencent.mm.R.string.fcl), com.tencent.mm.wallet_core.ui.r1.f(i17));
            kotlin.jvm.internal.o.d(str);
        } else {
            java.lang.String r17 = com.tencent.mm.wallet_core.ui.r1.r(context.getString(com.tencent.mm.R.string.fcl), com.tencent.mm.wallet_core.ui.r1.f(i17));
            java.lang.String r18 = com.tencent.mm.wallet_core.ui.r1.r(context.getString(com.tencent.mm.R.string.fcl), com.tencent.mm.wallet_core.ui.r1.f(i18));
            if (i17 / 10000 == i18 / 10000) {
                r18 = com.tencent.mm.wallet_core.ui.r1.r(context.getString(com.tencent.mm.R.string.f492135fc2), com.tencent.mm.wallet_core.ui.r1.f(i18));
            }
            str = r17 + '-' + r18;
        }
        float measureText = textView2.getPaint().measureText(str2);
        android.widget.TextView textView3 = this.f266705i;
        float measureText2 = textView3.getPaint().measureText(str);
        int i27 = this.f266699c;
        android.widget.LinearLayout linearLayout = this.f266707k;
        android.widget.LinearLayout linearLayout2 = this.f266703g;
        if (i27 != 1 || measureText + measureText2 >= this.f266702f) {
            linearLayout2.setVisibility(8);
            linearLayout.setVisibility(0);
            textView.setText(str2);
            this.f266709m.setText(str);
            return;
        }
        linearLayout2.setVisibility(0);
        linearLayout.setVisibility(8);
        textView2.setText(str2);
        textView3.setText(str);
    }
}
