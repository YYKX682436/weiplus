package fg;

/* loaded from: classes7.dex */
public final class l0 implements fg.g {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.inputmethod.InputConnection f261784a;

    /* renamed from: b, reason: collision with root package name */
    public pl1.f f261785b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.widget.input.u3 f261786c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.input.v4 f261787d;

    public l0(com.tencent.mm.plugin.appbrand.jsapi.t appBrandPage, android.view.inputmethod.InputConnection inputConnection) {
        kotlin.jvm.internal.o.g(appBrandPage, "appBrandPage");
        this.f261784a = inputConnection;
        com.tencent.mm.plugin.appbrand.widget.input.u3 G = com.tencent.mm.plugin.appbrand.widget.input.u3.G(appBrandPage.getContentView(), null, appBrandPage instanceof com.tencent.mm.plugin.appbrand.page.v5 ? ((com.tencent.mm.plugin.appbrand.page.v5) appBrandPage).V1() : null);
        kotlin.jvm.internal.o.f(G, "settleKeyboard(...)");
        this.f261786c = G;
    }

    @Override // fg.g
    public void a(boolean z17) {
        this.f261786c.a(z17);
    }

    @Override // fg.g
    public void b() {
    }

    @Override // fg.g
    public int c() {
        return this.f261786c.getMinimumHeight();
    }

    @Override // fg.g
    public void d(int i17) {
        this.f261786c.d(i17);
    }

    @Override // fg.g
    public boolean e(android.widget.EditText text) {
        kotlin.jvm.internal.o.g(text, "text");
        return this.f261786c.e(text);
    }

    @Override // fg.g
    public void f(pl1.i params) {
        kotlin.jvm.internal.o.g(params, "params");
        pl1.f fVar = this.f261785b;
        if (fVar == null) {
            this.f261785b = (pl1.f) params;
            return;
        }
        kotlin.jvm.internal.o.d(fVar);
        fVar.a(params);
        com.tencent.mm.plugin.appbrand.widget.input.h6.f91482a.a(fVar, params);
        com.tencent.mm.plugin.appbrand.widget.input.l4.a(fVar, params);
    }

    @Override // fg.g
    public void g(yz5.l l17) {
        kotlin.jvm.internal.o.g(l17, "l");
        this.f261786c.setOnDoneListener(new fg.k0(l17));
    }

    @Override // fg.g
    public pl1.f getParams() {
        return this.f261785b;
    }

    @Override // fg.g
    public android.view.View getView() {
        return this.f261786c;
    }

    @Override // fg.g
    public void h(android.widget.EditText text) {
        kotlin.jvm.internal.o.g(text, "text");
        this.f261786c.f91691x = text;
    }

    @Override // fg.g
    public void hideKeyboard() {
    }

    @Override // fg.g
    public void i(pl1.f params) {
        kotlin.jvm.internal.o.g(params, "params");
        f(params);
    }

    @Override // fg.g
    public void j(boolean z17) {
        com.tencent.mm.plugin.appbrand.widget.input.u3 u3Var = this.f261786c;
        u3Var.setComponentView(z17);
        u3Var.M();
    }

    @Override // fg.g
    public void k(com.tencent.mm.plugin.appbrand.widget.input.p3 listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f261786c.k(listener);
    }

    @Override // fg.g
    public synchronized com.tencent.mm.plugin.appbrand.widget.input.v4 l() {
        com.tencent.mm.plugin.appbrand.widget.input.v4 v4Var;
        v4Var = this.f261787d;
        if (v4Var == null) {
            pl1.f fVar = this.f261785b;
            android.view.inputmethod.BaseInputConnection baseInputConnection = null;
            java.lang.String str = fVar != null ? fVar.R : null;
            android.view.inputmethod.InputConnection inputConnection = this.f261784a;
            android.view.inputmethod.BaseInputConnection baseInputConnection2 = inputConnection instanceof android.view.inputmethod.BaseInputConnection ? (android.view.inputmethod.BaseInputConnection) inputConnection : null;
            if (baseInputConnection2 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WebviewExtendSoftKeyboard", "getInputConnection, inputConnection: " + inputConnection);
            } else {
                baseInputConnection = baseInputConnection2;
            }
            v4Var = new com.tencent.mm.plugin.appbrand.widget.input.o(str, baseInputConnection);
            this.f261787d = v4Var;
        }
        return v4Var;
    }

    @Override // fg.g
    public void setText(java.lang.String str) {
    }
}
