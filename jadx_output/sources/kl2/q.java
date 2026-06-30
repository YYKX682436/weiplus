package kl2;

/* loaded from: classes3.dex */
public final class q extends com.tencent.mm.plugin.finder.live.widget.g {

    /* renamed from: h, reason: collision with root package name */
    public final jl2.a f308804h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f308805i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f308806m;

    /* renamed from: n, reason: collision with root package name */
    public long f308807n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f308808o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f308809p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(android.content.Context context, jl2.a service) {
        super(context, false, null, false, 12, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(service, "service");
        this.f308804h = service;
        this.f308808o = "";
        this.f308809p = "";
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public android.view.View b() {
        return h();
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int j() {
        return com.tencent.mm.R.layout.dst;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void p(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.odb);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f308805i = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.tencent.mm.R.id.rtr);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f308806m = (android.widget.TextView) findViewById2;
        android.widget.TextView textView = this.f308805i;
        if (textView == null) {
            kotlin.jvm.internal.o.o("titleText");
            throw null;
        }
        com.tencent.mm.ui.fk.a(textView);
        android.widget.TextView textView2 = this.f308806m;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o("btnText");
            throw null;
        }
        com.tencent.mm.ui.fk.a(textView2);
        android.widget.TextView textView3 = this.f308806m;
        if (textView3 != null) {
            textView3.setOnClickListener(new kl2.p(this));
        } else {
            kotlin.jvm.internal.o.o("btnText");
            throw null;
        }
    }
}
