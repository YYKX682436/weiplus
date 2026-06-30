package ni2;

/* loaded from: classes3.dex */
public final class e2 extends com.tencent.mm.plugin.finder.live.widget.g {

    /* renamed from: h, reason: collision with root package name */
    public final yz5.a f337283h;

    /* renamed from: i, reason: collision with root package name */
    public final yz5.a f337284i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f337285m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f337286n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f337287o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f337288p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(android.content.Context context, gk2.e buContext, yz5.a closeClick, yz5.a windowClose) {
        super(context, false, null, false, 14, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(buContext, "buContext");
        kotlin.jvm.internal.o.g(closeClick, "closeClick");
        kotlin.jvm.internal.o.g(windowClose, "windowClose");
        this.f337283h = closeClick;
        this.f337284i = windowClose;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int j() {
        return com.tencent.mm.R.layout.ec_;
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
        this.f337285m = findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.tencent.mm.R.id.f483758bz2);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f337286n = findViewById2;
        android.view.View findViewById3 = rootView.findViewById(com.tencent.mm.R.id.f487736sa3);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f337287o = findViewById3;
        android.view.View findViewById4 = rootView.findViewById(com.tencent.mm.R.id.chx);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f337288p = (android.widget.TextView) findViewById4;
        android.view.View view = this.f337285m;
        if (view == null) {
            kotlin.jvm.internal.o.o("stopCloseBtn");
            throw null;
        }
        view.setOnClickListener(new ni2.b2(this));
        android.view.View view2 = this.f337286n;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("closeBtn");
            throw null;
        }
        view2.setOnClickListener(new ni2.c2(this));
        android.view.View view3 = this.f337287o;
        if (view3 == null) {
            kotlin.jvm.internal.o.o("windowCloseBtn");
            throw null;
        }
        view3.setOnClickListener(new ni2.d2(this));
        android.widget.TextView textView = this.f337288p;
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
        y(1);
    }

    public final void y(int i17) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        jSONObject.put("style", 1);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0.hj((ml2.r0) c17, ml2.b4.X2, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
    }
}
