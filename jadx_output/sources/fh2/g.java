package fh2;

/* loaded from: classes3.dex */
public final class g extends com.tencent.mm.plugin.finder.live.widget.g {

    /* renamed from: h, reason: collision with root package name */
    public final gk2.e f262648h;

    /* renamed from: i, reason: collision with root package name */
    public final yz5.a f262649i;

    /* renamed from: m, reason: collision with root package name */
    public final yz5.a f262650m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f262651n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f262652o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f262653p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f262654q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(android.content.Context context, gk2.e buContext, yz5.a closeClick, yz5.a windowClose) {
        super(context, false, null, false, 14, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(buContext, "buContext");
        kotlin.jvm.internal.o.g(closeClick, "closeClick");
        kotlin.jvm.internal.o.g(windowClose, "windowClose");
        this.f262648h = buContext;
        this.f262649i = closeClick;
        this.f262650m = windowClose;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int j() {
        return com.tencent.mm.R.layout.dqb;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int l() {
        return 8;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void p(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.s7e);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f262651n = findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.tencent.mm.R.id.f483758bz2);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f262652o = findViewById2;
        android.view.View findViewById3 = rootView.findViewById(com.tencent.mm.R.id.f487736sa3);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f262653p = findViewById3;
        android.view.View findViewById4 = rootView.findViewById(com.tencent.mm.R.id.chx);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f262654q = (android.widget.TextView) findViewById4;
        android.view.View view = this.f262651n;
        if (view == null) {
            kotlin.jvm.internal.o.o("stopCloseBtn");
            throw null;
        }
        view.setOnClickListener(new fh2.d(this));
        android.view.View view2 = this.f262652o;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("closeBtn");
            throw null;
        }
        view2.setOnClickListener(new fh2.e(this));
        android.view.View view3 = this.f262653p;
        if (view3 == null) {
            kotlin.jvm.internal.o.o("windowCloseBtn");
            throw null;
        }
        view3.setOnClickListener(new fh2.f(this));
        android.widget.TextView textView = this.f262654q;
        if (textView != null) {
            com.tencent.mm.ui.fk.a(textView);
        } else {
            kotlin.jvm.internal.o.o("contentText");
            throw null;
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void w() {
        super.w();
        gk2.e eVar = this.f262648h;
        boolean S6 = ((om2.g) eVar.a(om2.g.class)).S6();
        android.content.Context context = this.f118381d;
        if (S6) {
            android.widget.TextView textView = this.f262654q;
            if (textView == null) {
                kotlin.jvm.internal.o.o("contentText");
                throw null;
            }
            textView.setText(context.getResources().getString(com.tencent.mm.R.string.mjp));
            y(1);
            return;
        }
        if (((om2.g) eVar.a(om2.g.class)).f346316w <= 0) {
            a();
            return;
        }
        android.widget.TextView textView2 = this.f262654q;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o("contentText");
            throw null;
        }
        textView2.setText(context.getResources().getString(com.tencent.mm.R.string.mj9, java.lang.Integer.valueOf(((om2.g) eVar.a(om2.g.class)).f346316w)));
        y(1);
    }

    public final void y(int i17) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        gk2.e eVar = this.f262648h;
        jSONObject.put("style", ((om2.g) eVar.a(om2.g.class)).S6() ? 3 : ((om2.g) eVar.a(om2.g.class)).f346316w > 0 ? 2 : 0);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0.hj((ml2.r0) c17, ml2.b4.X2, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
    }
}
