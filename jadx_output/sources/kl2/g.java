package kl2;

/* loaded from: classes3.dex */
public final class g extends com.tencent.mm.plugin.finder.live.widget.g {

    /* renamed from: h, reason: collision with root package name */
    public final jl2.b f308770h;

    /* renamed from: i, reason: collision with root package name */
    public final yz5.l f308771i;

    /* renamed from: m, reason: collision with root package name */
    public final yz5.a f308772m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f308773n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f308774o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f308775p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.CheckBox f308776q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f308777r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f308778s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f308779t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f308780u;

    /* renamed from: v, reason: collision with root package name */
    public long f308781v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(android.content.Context context, jl2.b service, yz5.l verifyCallback, yz5.a aVar) {
        super(context, false, null, false, 12, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(service, "service");
        kotlin.jvm.internal.o.g(verifyCallback, "verifyCallback");
        this.f308770h = service;
        this.f308771i = verifyCallback;
        this.f308772m = aVar;
        this.f308779t = "";
        this.f308780u = "";
        this.f118384g.c(null);
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int j() {
        return com.tencent.mm.R.layout.f488876dr1;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int l() {
        return 8;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void p(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.odb);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f308773n = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.tencent.mm.R.id.f485535i05);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f308774o = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = rootView.findViewById(com.tencent.mm.R.id.m3m);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f308775p = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = rootView.findViewById(com.tencent.mm.R.id.enc);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f308776q = (android.widget.CheckBox) findViewById4;
        android.view.View findViewById5 = rootView.findViewById(com.tencent.mm.R.id.enf);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f308777r = (android.widget.TextView) findViewById5;
        android.view.View findViewById6 = rootView.findViewById(com.tencent.mm.R.id.ene);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f308778s = findViewById6;
        findViewById6.setOnClickListener(new kl2.a(this));
        android.widget.CheckBox checkBox = this.f308776q;
        if (checkBox == null) {
            kotlin.jvm.internal.o.o("lisenceCheck");
            throw null;
        }
        checkBox.setOnCheckedChangeListener(new kl2.b(this));
        android.widget.TextView textView = this.f308773n;
        if (textView == null) {
            kotlin.jvm.internal.o.o("titleText");
            throw null;
        }
        com.tencent.mm.ui.fk.a(textView);
        android.widget.TextView textView2 = this.f308774o;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o("leftBtn");
            throw null;
        }
        com.tencent.mm.ui.fk.a(textView2);
        android.widget.TextView textView3 = this.f308775p;
        if (textView3 == null) {
            kotlin.jvm.internal.o.o("rightBtn");
            throw null;
        }
        com.tencent.mm.ui.fk.a(textView3);
        android.widget.TextView textView4 = this.f308774o;
        if (textView4 == null) {
            kotlin.jvm.internal.o.o("leftBtn");
            throw null;
        }
        textView4.setOnClickListener(new kl2.c(this));
        android.widget.TextView textView5 = this.f308775p;
        if (textView5 != null) {
            textView5.setOnClickListener(new kl2.d(this));
        } else {
            kotlin.jvm.internal.o.o("rightBtn");
            throw null;
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void t() {
        super.t();
        yz5.a aVar = this.f308772m;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final void y(java.lang.String id6, java.lang.String url, long j17) {
        kotlin.jvm.internal.o.g(id6, "id");
        kotlin.jvm.internal.o.g(url, "url");
        this.f308779t = id6;
        this.f308780u = url;
        this.f308781v = j17;
        w();
        android.widget.TextView textView = this.f308777r;
        if (textView == null) {
            kotlin.jvm.internal.o.o("lisenceTv");
            throw null;
        }
        java.lang.String string = textView.getContext().getResources().getString(com.tencent.mm.R.string.mqi);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        java.lang.String string2 = textView.getContext().getResources().getString(com.tencent.mm.R.string.dab, string);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        int L = r26.n0.L(string2, string, 0, false, 6, null);
        int length = string.length() + L;
        android.text.SpannableString spannableString = new android.text.SpannableString(string2);
        spannableString.setSpan(new kl2.f(this), L, length, 33);
        textView.setHighlightColor(textView.getContext().getResources().getColor(android.R.color.transparent));
        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        textView.setText(spannableString);
        android.widget.CheckBox checkBox = this.f308776q;
        if (checkBox == null) {
            kotlin.jvm.internal.o.o("lisenceCheck");
            throw null;
        }
        checkBox.setChecked(false);
        android.widget.TextView textView2 = this.f308775p;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o("rightBtn");
            throw null;
        }
        android.widget.CheckBox checkBox2 = this.f308776q;
        if (checkBox2 == null) {
            kotlin.jvm.internal.o.o("lisenceCheck");
            throw null;
        }
        textView2.setEnabled(checkBox2.isChecked());
        il2.s.f292086a.a(zl2.e5.f473743m, j17);
    }
}
