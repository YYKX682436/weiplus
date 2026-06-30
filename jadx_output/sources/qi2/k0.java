package qi2;

/* loaded from: classes10.dex */
public final class k0 extends com.tencent.mm.plugin.finder.live.widget.g implements android.view.View.OnClickListener {

    /* renamed from: h, reason: collision with root package name */
    public final zh2.c f363553h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f363554i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f363555m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f363556n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f363557o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.k0 f363558p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.k0 f363559q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f363560r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f363561s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f363562t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(android.content.Context context, zh2.e userInterface, zh2.c pluginAbility) {
        super(context, false, null, false, 12, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(userInterface, "userInterface");
        kotlin.jvm.internal.o.g(pluginAbility, "pluginAbility");
        this.f363553h = pluginAbility;
        android.view.ViewGroup.LayoutParams layoutParams = this.f118384g.f444837d.getLayoutParams();
        if (layoutParams != null) {
            android.view.View view = this.f363554i;
            if (view != null) {
                layoutParams.height = (com.tencent.mm.ui.bl.b(view.getContext()).y * 3) / 4;
            } else {
                kotlin.jvm.internal.o.o("rootView");
                throw null;
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int j() {
        return com.tencent.mm.R.layout.dnx;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int l() {
        return 8;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public android.view.View m(android.view.ViewGroup root, zl2.u4 uiMode) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(uiMode, "uiMode");
        zl2.w4 w4Var = zl2.w4.f474017a;
        zl2.u4 u4Var = zl2.u4.f473990f;
        android.content.Context context = this.f118381d;
        return w4Var.b(com.tencent.mm.R.layout.dnx, root, false, u4Var, context, com.tencent.mm.ui.id.b(context));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/pk/FinderLiveAnchorWaitingPkPanelWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.f482335bp) {
            a();
            qo0.c.a(this.f363553h.f(), qo0.b.f365441y4, null, 2, null);
        } else {
            android.content.Context context = this.f118381d;
            fj2.j jVar = fj2.j.f263174a;
            if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.b5i) {
                this.f363558p = jVar.a(this.f363558p, context, new qi2.i0(this));
            } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.f484248r61) {
                fj2.s.c(fj2.s.f263183a, ml2.q2.D, null, null, 0, 0, 30, null);
                this.f363559q = jVar.c(this.f363559q, context, new qi2.j0(this));
            } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.f6c) {
                a();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/pk/FinderLiveAnchorWaitingPkPanelWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void p(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        this.f363554i = rootView;
        android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.hqq);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f363561s = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.tencent.mm.R.id.f6c);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f363562t = findViewById2;
        android.view.View findViewById3 = rootView.findViewById(com.tencent.mm.R.id.r9o);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f363560r = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = rootView.findViewById(com.tencent.mm.R.id.f482335bp);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f363555m = findViewById4;
        android.view.View findViewById5 = rootView.findViewById(com.tencent.mm.R.id.b5i);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f363556n = findViewById5;
        android.view.View findViewById6 = rootView.findViewById(com.tencent.mm.R.id.f484248r61);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f363557o = findViewById6;
        android.view.View view = this.f363555m;
        if (view == null) {
            kotlin.jvm.internal.o.o("acceptBtn");
            throw null;
        }
        view.setOnClickListener(this);
        android.view.View view2 = this.f363556n;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("cancelBtn");
            throw null;
        }
        view2.setOnClickListener(this);
        android.view.View view3 = this.f363562t;
        if (view3 == null) {
            kotlin.jvm.internal.o.o("leftLayout");
            throw null;
        }
        view3.setOnClickListener(this);
        android.view.View view4 = this.f363557o;
        if (view4 == null) {
            kotlin.jvm.internal.o.o("exitMicBtn");
            throw null;
        }
        view4.setOnClickListener(this);
        android.widget.TextView textView = this.f363561s;
        if (textView == null) {
            kotlin.jvm.internal.o.o("headerTitleText");
            throw null;
        }
        com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        android.widget.TextView textView2 = this.f363560r;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o("waittingTextView");
            throw null;
        }
        com.tencent.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
        ((com.tencent.mm.ui.widget.imageview.WeImageView) rootView.findViewById(com.tencent.mm.R.id.f6b)).setIconColor(this.f118381d.getResources().getColor(com.tencent.mm.R.color.f479106q5));
        ((com.tencent.mm.ui.widget.imageview.WeImageView) rootView.findViewById(com.tencent.mm.R.id.r8y)).s(com.tencent.mm.R.raw.icons_outlined_time, com.tencent.mm.R.color.Blue_100);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    @Override // com.tencent.mm.plugin.finder.live.widget.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void w() {
        /*
            Method dump skipped, instructions count: 705
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qi2.k0.w():void");
    }
}
