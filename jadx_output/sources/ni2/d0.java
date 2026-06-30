package ni2;

/* loaded from: classes3.dex */
public final class d0 extends com.tencent.mm.plugin.finder.live.widget.g {

    /* renamed from: h, reason: collision with root package name */
    public final qo0.c f337269h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f337270i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.CheckBox f337271m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f337272n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f337273o;

    /* renamed from: p, reason: collision with root package name */
    public int f337274p;

    /* renamed from: q, reason: collision with root package name */
    public hi2.b f337275q;

    /* renamed from: r, reason: collision with root package name */
    public int f337276r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(android.content.Context context, qo0.c statusMonitor) {
        super(context, false, null, false, 12, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f337269h = statusMonitor;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int j() {
        return com.tencent.mm.R.layout.anr;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int l() {
        return 8;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int n() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void p(android.view.View root) {
        kotlin.jvm.internal.o.g(root, "root");
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.eng);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f337270i = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = root.findViewById(com.tencent.mm.R.id.enc);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f337271m = (android.widget.CheckBox) findViewById2;
        android.view.View findViewById3 = root.findViewById(com.tencent.mm.R.id.enf);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f337272n = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = root.findViewById(com.tencent.mm.R.id.ene);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f337273o = findViewById4;
        findViewById4.setOnClickListener(new ni2.y(this));
        android.widget.CheckBox checkBox = this.f337271m;
        if (checkBox == null) {
            kotlin.jvm.internal.o.o("lisenceCheck");
            throw null;
        }
        checkBox.setOnCheckedChangeListener(new ni2.z(this));
        android.widget.TextView textView = this.f337270i;
        if (textView != null) {
            textView.setOnClickListener(new ni2.a0(this));
        } else {
            kotlin.jvm.internal.o.o("okBtn");
            throw null;
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public boolean r() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void t() {
        super.t();
        qo0.c.a(this.f337269h, qo0.b.U3, null, 2, null);
    }
}
