package ef;

/* loaded from: classes7.dex */
public final class w implements ef.e {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f252158d;

    /* renamed from: e, reason: collision with root package name */
    public final ef.c f252159e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.l f252160f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.widget.input.y3 f252161g;

    /* renamed from: h, reason: collision with root package name */
    public nl1.b f252162h;

    public w(android.view.View appBrandPageView, android.view.inputmethod.InputConnection inputConnection, ef.c keyboardAction) {
        kotlin.jvm.internal.o.g(appBrandPageView, "appBrandPageView");
        kotlin.jvm.internal.o.g(inputConnection, "inputConnection");
        kotlin.jvm.internal.o.g(keyboardAction, "keyboardAction");
        this.f252158d = appBrandPageView;
        this.f252159e = keyboardAction;
        ef.t tVar = new ef.t(this);
        com.tencent.mm.plugin.appbrand.widget.input.y3 v17 = com.tencent.mm.plugin.appbrand.widget.input.y3.v(appBrandPageView, null);
        v17.setOnDoneListener(tVar);
        this.f252161g = v17;
        this.f252162h = new ef.u(inputConnection);
    }

    @Override // ef.e
    public void a(boolean z17) {
    }

    @Override // ef.e
    public void b() {
        this.f252158d.requestFocus();
        this.f252161g.w(this.f252162h);
        ((ef.i) this.f252159e).f252119a.d();
    }

    @Override // ef.e
    public int c() {
        return this.f252161g.getMinimumHeight();
    }

    @Override // ef.e
    public void d(int i17) {
    }

    @Override // ef.e
    public boolean e(android.widget.EditText text) {
        kotlin.jvm.internal.o.g(text, "text");
        return true;
    }

    @Override // ef.e
    public void f(pl1.i params) {
        kotlin.jvm.internal.o.g(params, "params");
    }

    @Override // ef.e
    public void g(yz5.l l17) {
        kotlin.jvm.internal.o.g(l17, "l");
        this.f252160f = l17;
    }

    @Override // ef.e
    public android.view.View getView() {
        return this.f252161g;
    }

    @Override // ef.e
    public void h(android.widget.EditText text) {
        kotlin.jvm.internal.o.g(text, "text");
    }

    @Override // ef.e
    public void hideKeyboard() {
        this.f252161g.u();
        this.f252158d.clearFocus();
        ((ef.i) this.f252159e).f252119a.e(0);
    }

    @Override // ef.e
    public void i(android.view.inputmethod.InputConnection inputConnection) {
        kotlin.jvm.internal.o.g(inputConnection, "inputConnection");
        this.f252162h = new ef.v(inputConnection);
        b();
    }

    @Override // ef.e
    public void j(boolean z17) {
    }

    @Override // ef.e
    public void k(com.tencent.mm.plugin.appbrand.widget.input.p3 listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
    }

    @Override // ef.e
    public void m(com.tencent.mm.plugin.appbrand.widget.input.p3 p3Var) {
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.u4
    public boolean q() {
        return this.f252161g.q();
    }

    @Override // ef.e
    public void setXMode(int i17) {
    }
}
