package kl2;

/* loaded from: classes3.dex */
public final class n extends com.tencent.mm.plugin.finder.live.widget.g {

    /* renamed from: h, reason: collision with root package name */
    public final jl2.a f308791h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f308792i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f308793m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f308794n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f308795o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f308796p;

    /* renamed from: q, reason: collision with root package name */
    public long f308797q;

    /* renamed from: r, reason: collision with root package name */
    public zl2.d5 f308798r;

    /* renamed from: s, reason: collision with root package name */
    public final int f308799s;

    /* renamed from: t, reason: collision with root package name */
    public mm2.p5 f308800t;

    /* renamed from: u, reason: collision with root package name */
    public long f308801u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(android.content.Context context, jl2.a service) {
        super(context, false, null, false, 12, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(service, "service");
        this.f308791h = service;
        this.f308798r = zl2.d5.f473723d;
        this.f118384g.c(null);
        dk2.ef efVar = dk2.ef.f233372a;
        int i17 = dk2.ef.Q;
        this.f308799s = i17 <= 0 ? 1000 : i17;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int j() {
        return com.tencent.mm.R.layout.ayi;
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
        this.f308792i = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.tencent.mm.R.id.chx);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f308793m = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = rootView.findViewById(com.tencent.mm.R.id.m1m);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f308794n = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = rootView.findViewById(com.tencent.mm.R.id.f485535i05);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f308795o = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = rootView.findViewById(com.tencent.mm.R.id.m3m);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f308796p = (android.widget.TextView) findViewById5;
        android.widget.TextView textView = this.f308792i;
        if (textView == null) {
            kotlin.jvm.internal.o.o("titleText");
            throw null;
        }
        com.tencent.mm.ui.bk.s0(textView.getPaint());
        android.widget.TextView textView2 = this.f308795o;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o("leftBtn");
            throw null;
        }
        textView2.setOnClickListener(new kl2.h(this));
        android.widget.TextView textView3 = this.f308796p;
        if (textView3 != null) {
            textView3.setOnClickListener(new kl2.i(this));
        } else {
            kotlin.jvm.internal.o.o("rightBtn");
            throw null;
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void s() {
        il2.r rVar = (il2.r) this.f308791h;
        rVar.getClass();
        ((mm2.v5) rVar.P0(mm2.v5.class)).f329488n.postValue(mm2.r5.f329380a);
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void w() {
        super.w();
        this.f308801u = java.lang.System.currentTimeMillis() + 100;
        com.tencent.mars.xlog.Log.i("RestrictConsumeDialogWidget", "openPanel curTime: " + this.f308801u);
    }
}
