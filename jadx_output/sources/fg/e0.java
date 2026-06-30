package fg;

/* loaded from: classes7.dex */
public final class e0 implements fg.g {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.inputmethod.InputConnection f261751a;

    /* renamed from: b, reason: collision with root package name */
    public final int f261752b;

    /* renamed from: c, reason: collision with root package name */
    public pl1.f f261753c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.widget.input.o2 f261754d;

    /* renamed from: e, reason: collision with root package name */
    public final nl1.b f261755e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.input.v4 f261756f;

    public e0(com.tencent.mm.plugin.appbrand.jsapi.t appBrandPage, android.view.inputmethod.InputConnection inputConnection, int i17) {
        kotlin.jvm.internal.o.g(appBrandPage, "appBrandPage");
        kotlin.jvm.internal.o.g(inputConnection, "inputConnection");
        this.f261751a = inputConnection;
        this.f261752b = i17;
        com.tencent.mm.plugin.appbrand.widget.input.o2 v17 = com.tencent.mm.plugin.appbrand.widget.input.o2.v(appBrandPage.getContentView(), appBrandPage instanceof com.tencent.mm.plugin.appbrand.page.v5 ? ((com.tencent.mm.plugin.appbrand.page.v5) appBrandPage).V1() : null);
        kotlin.jvm.internal.o.f(v17, "settleKeyboard(...)");
        this.f261754d = v17;
        this.f261755e = new fg.c0(this);
    }

    @Override // fg.g
    public void a(boolean z17) {
    }

    @Override // fg.g
    public void b() {
        com.tencent.mm.plugin.appbrand.widget.input.o2 o2Var = this.f261754d;
        o2Var.setXMode(this.f261752b);
        nl1.b bVar = this.f261755e;
        if (bVar == null) {
            return;
        }
        o2Var.setInputEventReceiver(bVar);
        o2Var.setVisibility(0);
    }

    @Override // fg.g
    public int c() {
        return this.f261754d.getMinimumHeight();
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
        pl1.f fVar = this.f261753c;
        if (fVar == null) {
            this.f261753c = (pl1.f) params;
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
        this.f261754d.setOnDoneListener(new fg.d0(l17));
    }

    @Override // fg.g
    public pl1.f getParams() {
        return this.f261753c;
    }

    @Override // fg.g
    public android.view.View getView() {
        return this.f261754d;
    }

    @Override // fg.g
    public void h(android.widget.EditText text) {
        kotlin.jvm.internal.o.g(text, "text");
    }

    @Override // fg.g
    public void hideKeyboard() {
        com.tencent.mm.plugin.appbrand.widget.input.o2 o2Var = this.f261754d;
        o2Var.setVisibility(8);
        android.widget.EditText editText = o2Var.f91582h;
        if (editText != null) {
            editText.clearFocus();
            o2Var.f91582h = null;
            o2Var.f91580f = null;
            o2Var.f91579e = false;
        }
    }

    @Override // fg.g
    public void i(pl1.f params) {
        kotlin.jvm.internal.o.g(params, "params");
        f(params);
    }

    @Override // fg.g
    public void j(boolean z17) {
        com.tencent.mm.plugin.appbrand.widget.input.o2 o2Var = this.f261754d;
        o2Var.setComponentView(z17);
        o2Var.w();
    }

    @Override // fg.g
    public void k(com.tencent.mm.plugin.appbrand.widget.input.p3 listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
    }

    @Override // fg.g
    public synchronized com.tencent.mm.plugin.appbrand.widget.input.v4 l() {
        com.tencent.mm.plugin.appbrand.widget.input.v4 v4Var;
        v4Var = this.f261756f;
        if (v4Var == null) {
            pl1.f fVar = this.f261753c;
            android.view.inputmethod.BaseInputConnection baseInputConnection = null;
            java.lang.String str = fVar != null ? fVar.R : null;
            android.view.inputmethod.InputConnection inputConnection = this.f261751a;
            android.view.inputmethod.BaseInputConnection baseInputConnection2 = inputConnection instanceof android.view.inputmethod.BaseInputConnection ? (android.view.inputmethod.BaseInputConnection) inputConnection : null;
            if (baseInputConnection2 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WebviewExtendNumberKeyboard", "getInputConnection, inputConnection: " + inputConnection);
            } else {
                baseInputConnection = baseInputConnection2;
            }
            v4Var = new com.tencent.mm.plugin.appbrand.widget.input.o(str, baseInputConnection);
            this.f261756f = v4Var;
        }
        return v4Var;
    }

    @Override // fg.g
    public void setText(java.lang.String str) {
    }
}
