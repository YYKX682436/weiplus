package fg;

/* loaded from: classes7.dex */
public final class o0 implements fg.g {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.inputmethod.InputConnection f261794a;

    /* renamed from: b, reason: collision with root package name */
    public pl1.f f261795b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.widget.input.y3 f261796c;

    /* renamed from: d, reason: collision with root package name */
    public final nl1.b f261797d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.input.v4 f261798e;

    public o0(com.tencent.mm.plugin.appbrand.jsapi.t appBrandPage, android.view.inputmethod.InputConnection inputConnection, int i17) {
        kotlin.jvm.internal.o.g(appBrandPage, "appBrandPage");
        kotlin.jvm.internal.o.g(inputConnection, "inputConnection");
        this.f261794a = inputConnection;
        com.tencent.mm.plugin.appbrand.widget.input.y3 v17 = com.tencent.mm.plugin.appbrand.widget.input.y3.v(appBrandPage.getContentView(), appBrandPage instanceof com.tencent.mm.plugin.appbrand.page.v5 ? ((com.tencent.mm.plugin.appbrand.page.v5) appBrandPage).V1() : null);
        kotlin.jvm.internal.o.f(v17, "settleKeyboard(...)");
        this.f261796c = v17;
        this.f261797d = new fg.m0(this);
    }

    @Override // fg.g
    public void a(boolean z17) {
    }

    @Override // fg.g
    public void b() {
        this.f261796c.w(this.f261797d);
    }

    @Override // fg.g
    public int c() {
        return this.f261796c.getMinimumHeight();
    }

    @Override // fg.g
    public void d(int i17) {
    }

    @Override // fg.g
    public boolean e(android.widget.EditText text) {
        kotlin.jvm.internal.o.g(text, "text");
        return true;
    }

    @Override // fg.g
    public void f(pl1.i params) {
        kotlin.jvm.internal.o.g(params, "params");
        pl1.f fVar = this.f261795b;
        if (fVar == null) {
            this.f261795b = (pl1.f) params;
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
        this.f261796c.setOnDoneListener(new fg.n0(l17));
    }

    @Override // fg.g
    public pl1.f getParams() {
        return this.f261795b;
    }

    @Override // fg.g
    public android.view.View getView() {
        return this.f261796c;
    }

    @Override // fg.g
    public void h(android.widget.EditText text) {
        kotlin.jvm.internal.o.g(text, "text");
    }

    @Override // fg.g
    public void hideKeyboard() {
        this.f261796c.u();
    }

    @Override // fg.g
    public void i(pl1.f params) {
        kotlin.jvm.internal.o.g(params, "params");
        f(params);
    }

    @Override // fg.g
    public void j(boolean z17) {
    }

    @Override // fg.g
    public void k(com.tencent.mm.plugin.appbrand.widget.input.p3 listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
    }

    @Override // fg.g
    public synchronized com.tencent.mm.plugin.appbrand.widget.input.v4 l() {
        com.tencent.mm.plugin.appbrand.widget.input.v4 v4Var;
        v4Var = this.f261798e;
        if (v4Var == null) {
            pl1.f fVar = this.f261795b;
            android.view.inputmethod.BaseInputConnection baseInputConnection = null;
            java.lang.String str = fVar != null ? fVar.R : null;
            android.view.inputmethod.InputConnection inputConnection = this.f261794a;
            android.view.inputmethod.BaseInputConnection baseInputConnection2 = inputConnection instanceof android.view.inputmethod.BaseInputConnection ? (android.view.inputmethod.BaseInputConnection) inputConnection : null;
            if (baseInputConnection2 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WebviewExtendWcPayNumberKeyboard", "getInputConnection, inputConnection: " + inputConnection);
            } else {
                baseInputConnection = baseInputConnection2;
            }
            v4Var = new com.tencent.mm.plugin.appbrand.widget.input.o(str, baseInputConnection);
            this.f261798e = v4Var;
        }
        return v4Var;
    }

    @Override // fg.g
    public void setText(java.lang.String str) {
    }
}
