package lj2;

/* loaded from: classes10.dex */
public final class r0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f318925d;

    /* renamed from: e, reason: collision with root package name */
    public final gk2.e f318926e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f318927f;

    /* renamed from: g, reason: collision with root package name */
    public final zh2.c f318928g;

    /* renamed from: h, reason: collision with root package name */
    public int f318929h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f318930i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View f318931m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View f318932n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f318933o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.Map f318934p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f318935q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f318936r;

    public r0(android.content.Context context, gk2.e liveData, android.view.View parentRoot, zh2.c pluginAbility) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(liveData, "liveData");
        kotlin.jvm.internal.o.g(parentRoot, "parentRoot");
        kotlin.jvm.internal.o.g(pluginAbility, "pluginAbility");
        this.f318925d = context;
        this.f318926e = liveData;
        this.f318927f = parentRoot;
        this.f318928g = pluginAbility;
        this.f318929h = 1;
        android.view.View findViewById = parentRoot.findViewById(com.tencent.mm.R.id.tm8);
        this.f318930i = findViewById;
        android.view.View findViewById2 = findViewById != null ? findViewById.findViewById(com.tencent.mm.R.id.tmb) : null;
        this.f318931m = findViewById2;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = findViewById != null ? (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById.findViewById(com.tencent.mm.R.id.tmc) : null;
        android.widget.TextView textView = findViewById != null ? (android.widget.TextView) findViewById.findViewById(com.tencent.mm.R.id.tmd) : null;
        android.view.View findViewById3 = findViewById != null ? findViewById.findViewById(com.tencent.mm.R.id.tm9) : null;
        this.f318932n = findViewById3;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = findViewById != null ? (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById.findViewById(com.tencent.mm.R.id.tm_) : null;
        android.widget.TextView textView2 = findViewById != null ? (android.widget.TextView) findViewById.findViewById(com.tencent.mm.R.id.tma) : null;
        android.view.View findViewById4 = findViewById != null ? findViewById.findViewById(com.tencent.mm.R.id.tme) : null;
        this.f318933o = findViewById4;
        java.util.Map k17 = kz5.c1.k(new jz5.l(1, new lj2.z0(findViewById2, weImageView, textView)), new jz5.l(3, new lj2.z0(findViewById3, weImageView2, textView2)), new jz5.l(2, new lj2.z0(findViewById4, findViewById != null ? (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById.findViewById(com.tencent.mm.R.id.tmf) : null, findViewById != null ? (android.widget.TextView) findViewById.findViewById(com.tencent.mm.R.id.tmg) : null)));
        this.f318934p = k17;
        this.f318935q = jz5.h.b(new lj2.q0(this));
        if (findViewById == null) {
            com.tencent.mars.xlog.Log.e("FinderLiveSetMicModeWidget", "root is null");
        }
        java.util.Iterator it = k17.entrySet().iterator();
        while (it.hasNext()) {
            android.view.View view = ((lj2.z0) ((java.util.Map.Entry) it.next()).getValue()).f318968a;
            if (view != null) {
                view.setOnClickListener(this);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0064 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(int r13) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lj2.r0.a(int):void");
    }

    public final void b(int i17) {
        android.content.Context context = this.f318925d;
        int d17 = i65.a.d(context, com.tencent.mm.R.color.adg);
        int d18 = i65.a.d(context, com.tencent.mm.R.color.Brand_100);
        int d19 = i65.a.d(context, com.tencent.mm.R.color.Brand_Alpha_0_1);
        java.util.Map map = this.f318934p;
        for (lj2.z0 z0Var : map.values()) {
            android.view.View view = z0Var.f318968a;
            if (view != null) {
                view.setBackground(null);
            }
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = z0Var.f318969b;
            if (weImageView != null) {
                weImageView.setIconColor(d17);
            }
            android.widget.TextView textView = z0Var.f318970c;
            if (textView != null) {
                textView.setTextColor(d17);
            }
            if (textView != null) {
                com.tencent.mm.ui.fk.c(textView);
            }
        }
        lj2.z0 z0Var2 = (lj2.z0) map.get(java.lang.Integer.valueOf(i17));
        if (z0Var2 != null) {
            android.view.View view2 = z0Var2.f318968a;
            if (view2 != null) {
                view2.setBackgroundColor(d19);
            }
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = z0Var2.f318969b;
            if (weImageView2 != null) {
                weImageView2.setIconColor(d18);
            }
            android.widget.TextView textView2 = z0Var2.f318970c;
            if (textView2 != null) {
                textView2.setTextColor(d18);
            }
            if (textView2 != null) {
                com.tencent.mm.ui.fk.b(textView2);
            }
        }
        jz5.g gVar = this.f318935q;
        if (i17 == 2 || i17 == 3) {
            ((lj2.n) ((jz5.n) gVar).getValue()).c();
            this.f318936r = true;
        } else {
            ((lj2.n) ((jz5.n) gVar).getValue()).a();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/widget/FinderLiveSetMicModeWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (kotlin.jvm.internal.o.b(view, this.f318931m)) {
            a(1);
        } else if (kotlin.jvm.internal.o.b(view, this.f318932n)) {
            a(3);
        } else if (kotlin.jvm.internal.o.b(view, this.f318933o)) {
            a(2);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/widget/FinderLiveSetMicModeWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
