package ef;

/* loaded from: classes7.dex */
public final class q implements ef.e {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f252146d;

    /* renamed from: e, reason: collision with root package name */
    public final ef.c f252147e;

    /* renamed from: f, reason: collision with root package name */
    public int f252148f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.l f252149g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.widget.input.o2 f252150h;

    /* renamed from: i, reason: collision with root package name */
    public nl1.b f252151i;

    public q(android.view.View appBrandPageView, android.view.inputmethod.InputConnection inputConnection, ef.c keyboardAction) {
        kotlin.jvm.internal.o.g(appBrandPageView, "appBrandPageView");
        kotlin.jvm.internal.o.g(inputConnection, "inputConnection");
        kotlin.jvm.internal.o.g(keyboardAction, "keyboardAction");
        this.f252146d = appBrandPageView;
        this.f252147e = keyboardAction;
        ef.n nVar = new ef.n(this);
        com.tencent.mm.plugin.appbrand.widget.input.o2 v17 = com.tencent.mm.plugin.appbrand.widget.input.o2.v(appBrandPageView, null);
        v17.setOnDoneListener(nVar);
        this.f252150h = v17;
        this.f252151i = new ef.o(inputConnection);
    }

    @Override // ef.e
    public void a(boolean z17) {
    }

    @Override // ef.e
    public void b() {
        this.f252146d.requestFocus();
        int i17 = this.f252148f;
        com.tencent.mm.plugin.appbrand.widget.input.o2 o2Var = this.f252150h;
        o2Var.setXMode(i17);
        nl1.b bVar = this.f252151i;
        if (bVar != null) {
            o2Var.setInputEventReceiver(bVar);
            o2Var.setVisibility(0);
        }
        ((ef.i) this.f252147e).f252119a.d();
    }

    @Override // ef.e
    public int c() {
        return this.f252150h.getMinimumHeight();
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
        this.f252149g = l17;
    }

    @Override // ef.e
    public android.view.View getView() {
        return this.f252150h;
    }

    @Override // ef.e
    public void h(android.widget.EditText text) {
        kotlin.jvm.internal.o.g(text, "text");
    }

    @Override // ef.e
    public void hideKeyboard() {
        com.tencent.mm.plugin.appbrand.widget.input.o2 o2Var = this.f252150h;
        o2Var.setVisibility(8);
        android.widget.EditText editText = o2Var.f91582h;
        if (editText != null) {
            editText.clearFocus();
            o2Var.f91582h = null;
            o2Var.f91580f = null;
            o2Var.f91579e = false;
        }
        this.f252146d.clearFocus();
        ((ef.i) this.f252147e).f252119a.e(0);
    }

    @Override // ef.e
    public void i(android.view.inputmethod.InputConnection inputConnection) {
        kotlin.jvm.internal.o.g(inputConnection, "inputConnection");
        this.f252151i = new ef.p(inputConnection);
        b();
    }

    @Override // ef.e
    public void j(boolean z17) {
        com.tencent.mm.plugin.appbrand.widget.input.o2 o2Var = this.f252150h;
        o2Var.setComponentView(z17);
        o2Var.w();
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
        return this.f252150h.q();
    }

    @Override // ef.e
    public void setXMode(int i17) {
        this.f252148f = i17;
        this.f252150h.setXMode(i17);
    }
}
