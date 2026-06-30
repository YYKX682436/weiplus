package ef;

/* loaded from: classes7.dex */
public final class s implements ef.e {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f252153d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.widget.input.u3 f252154e;

    public s(ef.b appBrandXWebKeyboard, ef.c keyboardAction) {
        kotlin.jvm.internal.o.g(appBrandXWebKeyboard, "appBrandXWebKeyboard");
        kotlin.jvm.internal.o.g(keyboardAction, "keyboardAction");
        android.view.View a17 = appBrandXWebKeyboard.a();
        kotlin.jvm.internal.o.d(a17);
        this.f252153d = a17;
        com.tencent.mm.plugin.appbrand.widget.input.u3 G = com.tencent.mm.plugin.appbrand.widget.input.u3.G(a17, appBrandXWebKeyboard.b(), null);
        kotlin.jvm.internal.o.f(G, "settleKeyboard(...)");
        this.f252154e = G;
    }

    @Override // ef.e
    public void a(boolean z17) {
        this.f252154e.a(z17);
    }

    @Override // ef.e
    public void b() {
        android.view.View view = this.f252153d;
        view.requestFocus();
        android.view.inputmethod.InputMethodManager b17 = com.tencent.mm.plugin.appbrand.widget.input.m5.b(view);
        if (b17.showSoftInput(view, 1)) {
            return;
        }
        b17.showSoftInput(view, 2);
    }

    @Override // ef.e
    public int c() {
        return this.f252154e.getMinimumHeight();
    }

    @Override // ef.e
    public void d(int i17) {
        this.f252154e.d(i17);
    }

    @Override // ef.e
    public boolean e(android.widget.EditText text) {
        kotlin.jvm.internal.o.g(text, "text");
        return this.f252154e.e(text);
    }

    @Override // ef.e
    public void f(pl1.i params) {
        kotlin.jvm.internal.o.g(params, "params");
    }

    @Override // ef.e
    public void g(yz5.l l17) {
        kotlin.jvm.internal.o.g(l17, "l");
        this.f252154e.setOnDoneListener(new ef.r(l17));
    }

    @Override // ef.e
    public android.view.View getView() {
        return this.f252154e;
    }

    @Override // ef.e
    public void h(android.widget.EditText text) {
        kotlin.jvm.internal.o.g(text, "text");
        this.f252154e.f91691x = text;
    }

    @Override // ef.e
    public void hideKeyboard() {
        android.view.View view = this.f252153d;
        com.tencent.mm.plugin.appbrand.widget.input.m5.b(view).hideSoftInputFromWindow(view.getWindowToken(), 0);
        view.clearFocus();
    }

    @Override // ef.e
    public void i(android.view.inputmethod.InputConnection inputConnection) {
        kotlin.jvm.internal.o.g(inputConnection, "inputConnection");
    }

    @Override // ef.e
    public void j(boolean z17) {
        com.tencent.mm.plugin.appbrand.widget.input.u3 u3Var = this.f252154e;
        u3Var.setComponentView(z17);
        u3Var.M();
    }

    @Override // ef.e
    public void k(com.tencent.mm.plugin.appbrand.widget.input.p3 listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f252154e.k(listener);
    }

    @Override // ef.e
    public void m(com.tencent.mm.plugin.appbrand.widget.input.p3 p3Var) {
        this.f252154e.m(p3Var);
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.u4
    public boolean q() {
        return this.f252154e.q();
    }

    @Override // ef.e
    public void setXMode(int i17) {
    }
}
