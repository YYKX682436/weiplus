package qi2;

/* loaded from: classes10.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f363658a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.TextView f363659b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.ImageView f363660c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f363661d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f363662e;

    /* renamed from: f, reason: collision with root package name */
    public fj2.k f363663f;

    /* renamed from: g, reason: collision with root package name */
    public km2.q f363664g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.ViewGroup f363665h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f363666i;

    /* renamed from: j, reason: collision with root package name */
    public final android.widget.TextView f363667j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f363668k;

    public z(qi2.c0 c0Var, android.view.View root) {
        kotlin.jvm.internal.o.g(root, "root");
        this.f363658a = root;
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.f486322kw4);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f363659b = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = root.findViewById(com.tencent.mm.R.id.nzc);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f363660c = (android.widget.ImageView) findViewById2;
        android.view.View findViewById3 = root.findViewById(com.tencent.mm.R.id.nze);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f363661d = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = root.findViewById(com.tencent.mm.R.id.nzf);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById4;
        this.f363662e = textView;
        this.f363663f = fj2.k.f263175d;
        android.view.View findViewById5 = root.findViewById(com.tencent.mm.R.id.f482343bx);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById5;
        this.f363665h = viewGroup;
        android.view.View findViewById6 = root.findViewById(com.tencent.mm.R.id.f482334bo);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f363666i = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById6;
        android.view.View findViewById7 = root.findViewById(com.tencent.mm.R.id.f482345c0);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f363667j = (android.widget.TextView) findViewById7;
        this.f363668k = true;
        viewGroup.setVisibility(8);
        textView.setOnClickListener(new qi2.x(this, c0Var));
    }

    public final void a(fj2.k teamType) {
        kotlin.jvm.internal.o.g(teamType, "teamType");
        this.f363663f = teamType;
        int i17 = qi2.y.f363656a[teamType.ordinal()];
        android.widget.TextView textView = this.f363667j;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f363666i;
        android.widget.TextView textView2 = this.f363659b;
        android.view.View view = this.f363658a;
        if (i17 == 1) {
            textView2.setText(view.getContext().getResources().getString(com.tencent.mm.R.string.eg8));
            textView2.setTextColor(view.getContext().getResources().getColor(com.tencent.mm.R.color.f479098px));
            weImageView.setIconColor(view.getContext().getResources().getColor(com.tencent.mm.R.color.f479098px));
            textView.setTextColor(view.getContext().getResources().getColor(com.tencent.mm.R.color.f479098px));
            return;
        }
        textView2.setText(view.getContext().getResources().getString(com.tencent.mm.R.string.eg7));
        textView2.setTextColor(android.graphics.Color.parseColor("#6467F0"));
        weImageView.setIconColor(android.graphics.Color.parseColor("#6467F0"));
        textView.setTextColor(android.graphics.Color.parseColor("#6467F0"));
    }

    public final void b(boolean z17) {
        this.f363668k = z17;
        android.widget.TextView textView = this.f363662e;
        if (z17) {
            textView.setTextColor(android.graphics.Color.parseColor("#576B95"));
        } else {
            textView.setTextColor(android.graphics.Color.parseColor("#80576B95"));
        }
    }
}
