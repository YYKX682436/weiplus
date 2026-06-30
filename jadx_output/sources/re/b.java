package re;

/* loaded from: classes7.dex */
public final class b implements com.tencent.mm.plugin.appbrand.widget.input.k2, com.tencent.mm.plugin.appbrand.jsapi.x, com.tencent.mm.plugin.appbrand.jsapi.v, com.tencent.mm.plugin.appbrand.jsapi.w, fg.h {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.page.v5 f394260d;

    /* renamed from: f, reason: collision with root package name */
    public int f394262f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.input.l2 f394263g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f394264h;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.p1 f394261e = new com.tencent.mm.plugin.appbrand.jsapi.p1();

    /* renamed from: i, reason: collision with root package name */
    public boolean f394265i = true;

    public b(com.tencent.mm.plugin.appbrand.page.v5 v5Var, kotlin.jvm.internal.i iVar) {
        this.f394260d = v5Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.k2
    public void a(boolean z17) {
        this.f394264h = z17;
        if (!this.f394265i) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageViewKeyboardHeightEmitter", "onKeyboardStateChanged been called, but interrupted");
            return;
        }
        int i17 = z17 ? this.f394262f : 0;
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f394260d;
        com.tencent.mm.plugin.appbrand.e9 v37 = v5Var.v3();
        kotlin.jvm.internal.o.f(v37, "getService(...)");
        this.f394261e.x(i17, v37, v5Var, null);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.x
    public void b() {
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f394260d;
        if (v5Var.getContentView() == null) {
            return;
        }
        android.view.View contentView = v5Var.getContentView();
        kotlin.jvm.internal.o.d(contentView);
        com.tencent.mm.plugin.appbrand.widget.input.l2 e17 = com.tencent.mm.plugin.appbrand.widget.input.h1.e(contentView);
        this.f394263g = e17;
        if (e17 != null) {
            e17.a(this);
        }
        fg.p0 p0Var = fg.p0.f261801a;
        fg.p0.f261802b.add(this);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.v
    public void c() {
        if (this.f394264h) {
            com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f394260d;
            if (v5Var.v3() != null) {
                com.tencent.mm.plugin.appbrand.e9 v37 = v5Var.v3();
                kotlin.jvm.internal.o.f(v37, "getService(...)");
                this.f394261e.x(0, v37, v5Var, null);
            }
        }
        com.tencent.mm.plugin.appbrand.widget.input.l2 l2Var = this.f394263g;
        if (l2Var != null) {
            l2Var.g(this);
        }
        this.f394263g = null;
        fg.p0 p0Var = fg.p0.f261801a;
        kotlin.jvm.internal.m0.a(fg.p0.f261802b).remove(this);
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.k2
    public void d(int i17) {
        this.f394262f = i17;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.k2
    public int getHeight() {
        return this.f394262f;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.w
    public void onDestroy() {
        com.tencent.mm.plugin.appbrand.widget.input.l2 l2Var = this.f394263g;
        if (l2Var != null) {
            l2Var.g(this);
        }
        fg.p0 p0Var = fg.p0.f261801a;
        kotlin.jvm.internal.m0.a(fg.p0.f261802b).remove(this);
    }
}
