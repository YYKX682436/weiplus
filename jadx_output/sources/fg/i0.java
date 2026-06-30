package fg;

/* loaded from: classes7.dex */
public final class i0 implements fg.g {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.t f261770a;

    /* renamed from: b, reason: collision with root package name */
    public yz5.r f261771b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.widget.input.f3 f261772c;

    /* renamed from: d, reason: collision with root package name */
    public pl1.f f261773d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f261774e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f261775f;

    /* renamed from: g, reason: collision with root package name */
    public final fg.f f261776g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f261777h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.w f261778i;

    public i0(com.tencent.mm.plugin.appbrand.jsapi.t appBrandPage, android.view.inputmethod.InputConnection inputConnection) {
        kotlin.jvm.internal.o.g(appBrandPage, "appBrandPage");
        kotlin.jvm.internal.o.g(inputConnection, "inputConnection");
        this.f261770a = appBrandPage;
        com.tencent.mm.plugin.appbrand.widget.input.d3 d3Var = com.tencent.mm.plugin.appbrand.widget.input.f3.f91442n;
        android.view.View contentView = appBrandPage.getContentView();
        kotlin.jvm.internal.o.f(contentView, "getContentView(...)");
        com.tencent.mm.plugin.appbrand.widget.input.f3 b17 = d3Var.b(contentView, false, null);
        kotlin.jvm.internal.o.d(b17);
        this.f261772c = b17;
        android.content.Context context = appBrandPage.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        this.f261776g = new fg.f(context, inputConnection);
        this.f261778i = new fg.f0(this);
    }

    @Override // fg.g
    public void a(boolean z17) {
    }

    @Override // fg.g
    public void b() {
        java.lang.String str;
        c01.l2 b17;
        java.lang.Integer num;
        boolean z17 = true;
        this.f261775f = true;
        pl1.f fVar = this.f261773d;
        com.tencent.mm.plugin.appbrand.jsapi.t tVar = this.f261770a;
        if (fVar == null || (num = fVar.X) == null) {
            str = null;
        } else {
            str = java.lang.String.format("AppBrandSecureInput#%s#%s", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(tVar.getComponentId()), num}, 2));
            kotlin.jvm.internal.o.f(str, "format(...)");
        }
        this.f261777h = str;
        tVar.w(this.f261778i);
        java.lang.String str2 = this.f261777h;
        java.lang.String f17 = (str2 == null || (b17 = c01.n2.d().b(str2)) == null) ? null : b17.f("SecureInputValue", null);
        if (f17 != null && f17.length() != 0) {
            z17 = false;
        }
        com.tencent.mm.plugin.appbrand.widget.input.f3 f3Var = this.f261772c;
        fg.f fVar2 = this.f261776g;
        if (z17 || this.f261774e) {
            fVar2.setText((java.lang.CharSequence) null);
            android.widget.EditText attachedInputWidget = f3Var.getAttachedInputWidget();
            if (attachedInputWidget != null) {
                attachedInputWidget.setText((java.lang.CharSequence) null);
            }
        } else {
            fVar2.setText(f17);
            android.widget.EditText attachedInputWidget2 = f3Var.getAttachedInputWidget();
            if (attachedInputWidget2 != null) {
                attachedInputWidget2.setText(f17);
            }
        }
        fVar2.setListener(new fg.h0(this));
        f3Var.u(fVar2);
        this.f261775f = false;
    }

    @Override // fg.g
    public int c() {
        return this.f261772c.getMinimumHeight();
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
        pl1.f fVar = this.f261773d;
        if (fVar == null) {
            this.f261773d = (pl1.f) params;
        } else {
            kotlin.jvm.internal.o.d(fVar);
            fVar.a(params);
            com.tencent.mm.plugin.appbrand.widget.input.h6.f91482a.a(fVar, params);
        }
        fg.f fVar2 = this.f261776g;
        pl1.f fVar3 = this.f261773d;
        pl1.f fVar4 = fVar2.A;
        if (fVar4 == null) {
            kotlin.jvm.internal.o.e(fVar3, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.widget.input.params.InsertParams");
            fVar2.A = fVar3;
        } else if (fVar3 != null) {
            fVar4.a(fVar3);
            com.tencent.mm.plugin.appbrand.widget.input.h6.f91482a.a(fVar3, fVar3);
        }
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        pl1.f fVar5 = fVar2.A;
        java.lang.Integer num = fVar5 != null ? fVar5.I : null;
        h0Var.f310123d = num;
        if (num != null) {
            fVar2.f261758w.setInputLength(num.intValue(), ((java.lang.Number) h0Var.f310123d).intValue());
            fVar2.setMaxEms(((java.lang.Number) h0Var.f310123d).intValue());
        }
        ((ku5.t0) ku5.t0.f312615d).B(new fg.e(h0Var, fVar2));
    }

    @Override // fg.g
    public void g(yz5.l l17) {
        kotlin.jvm.internal.o.g(l17, "l");
    }

    @Override // fg.g
    public pl1.f getParams() {
        return this.f261773d;
    }

    @Override // fg.g
    public android.view.View getView() {
        return this.f261772c;
    }

    @Override // fg.g
    public void h(android.widget.EditText text) {
        kotlin.jvm.internal.o.g(text, "text");
    }

    @Override // fg.g
    public void hideKeyboard() {
        java.lang.String str;
        android.text.Editable m17 = m();
        java.lang.String obj = m17 != null ? m17.toString() : null;
        if (obj != null && (str = this.f261777h) != null) {
            c01.n2.d().c(str, true).k("SecureInputValue", obj);
        }
        com.tencent.mm.plugin.appbrand.widget.input.f3 f3Var = this.f261772c;
        f3Var.setVisibility(8);
        android.widget.EditText editText = f3Var.f91447h;
        if (editText != null) {
            editText.clearFocus();
            f3Var.f91447h = null;
            f3Var.f91448i = null;
            f3Var.f91449m = false;
        }
    }

    @Override // fg.g
    public void i(pl1.f params) {
        kotlin.jvm.internal.o.g(params, "params");
        f(params);
    }

    @Override // fg.g
    public void j(boolean z17) {
        com.tencent.mm.plugin.appbrand.jsapi.t tVar = this.f261770a;
        this.f261772c.v(z17, tVar instanceof com.tencent.mm.plugin.appbrand.page.v5 ? ((com.tencent.mm.plugin.appbrand.page.v5) tVar).V1() : null);
    }

    @Override // fg.g
    public void k(com.tencent.mm.plugin.appbrand.widget.input.p3 listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
    }

    @Override // fg.g
    public /* bridge */ /* synthetic */ com.tencent.mm.plugin.appbrand.widget.input.v4 l() {
        return null;
    }

    public final android.text.Editable m() {
        android.widget.EditText attachedInputWidget = this.f261772c.getAttachedInputWidget();
        kotlin.jvm.internal.o.e(attachedInputWidget, "null cannot be cast to non-null type com.tencent.luggage.xweb_ext.extendplugin.input.DelegateEditText");
        return ((fg.f) attachedInputWidget).getRealText$luggage_xweb_ext_release();
    }

    @Override // fg.g
    public void setText(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            this.f261774e = true;
        }
    }
}
