package hg;

/* loaded from: classes7.dex */
public class h extends com.tencent.xweb.XWebExtendTextAreaClient {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.page.oa f281297a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.input.l2 f281298b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.input.u3 f281299c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.EditText f281300d;

    /* renamed from: e, reason: collision with root package name */
    public int f281301e;

    /* renamed from: f, reason: collision with root package name */
    public int f281302f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f281303g;

    /* renamed from: h, reason: collision with root package name */
    public int f281304h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f281305i;

    /* renamed from: j, reason: collision with root package name */
    public int f281306j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f281307k;

    /* renamed from: l, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.widget.input.w5 f281308l;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.widget.input.p3 f281309m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.widget.input.k2 f281310n;

    public h(com.tencent.xweb.i2 i2Var) {
        super(i2Var);
        this.f281301e = 0;
        this.f281302f = 0;
        this.f281303g = false;
        this.f281304h = -1;
        this.f281305i = false;
        this.f281306j = 0;
        this.f281307k = false;
        this.f281308l = new com.tencent.mm.plugin.appbrand.widget.input.w5(new hg.a(this));
        this.f281309m = new hg.b(this);
        this.f281310n = new hg.c(this);
    }

    public final void a(boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("(function(){    var focusElement = document.activeElement;    if(focusElement){        if(focusElement.onkeyboardconfirm){            focusElement.onkeyboardconfirm();        }");
        sb6.append(!z17 ? "        focusElement.blur();" : "");
        sb6.append("    }})();");
        evaluateJavascript(sb6.toString(), new hg.f(this));
    }

    public final com.tencent.mm.plugin.appbrand.widget.input.u3 b() {
        synchronized ("WebViewExtendTextAreaClient") {
            com.tencent.mm.plugin.appbrand.widget.input.u3 u3Var = this.f281299c;
            if (u3Var != null) {
                return u3Var;
            }
            if (!this.f281303g) {
                return null;
            }
            com.tencent.mm.plugin.appbrand.page.oa oaVar = this.f281297a;
            if (oaVar == null || oaVar.a() == null) {
                return null;
            }
            com.tencent.mm.plugin.appbrand.widget.input.u3 G = com.tencent.mm.plugin.appbrand.widget.input.u3.G(this.f281297a.a().getContentView(), null, (this.f281297a.a() == null || !(this.f281297a.a() instanceof com.tencent.mm.plugin.appbrand.page.v5)) ? null : ((com.tencent.mm.plugin.appbrand.page.v5) this.f281297a.a()).V1());
            this.f281299c = G;
            if (G != null) {
                this.f281300d = new android.widget.EditText(com.tencent.mm.plugin.appbrand.jsapi.coverview.d.a(this.f281299c.getContext()));
                this.f281299c.k(this.f281309m);
            }
            return this.f281299c;
        }
    }

    public final int c(int i17) {
        if (b() == null) {
            return 0;
        }
        int minimumHeight = this.f281299c.getMinimumHeight();
        if (minimumHeight != 0 && minimumHeight != this.f281301e) {
            this.f281301e = minimumHeight;
        }
        return i17 + this.f281301e;
    }

    @Override // com.tencent.xweb.XWebExtendTextAreaClient
    public int getToolBarHeight(int i17) {
        com.tencent.mm.plugin.appbrand.page.oa oaVar = this.f281297a;
        if (oaVar == null || oaVar.a() == null || com.tencent.mm.plugin.appbrand.utils.f5.c(this.f281297a.a().getContentView())) {
            return 0;
        }
        return c(i17);
    }

    @Override // com.tencent.xweb.XWebExtendTextAreaClient
    public boolean onHideKeyboard(java.lang.String str, android.view.inputmethod.InputConnection inputConnection) {
        com.tencent.mm.plugin.appbrand.widget.input.u3 b17;
        if (this.f281297a != null && (b17 = b()) != null) {
            b17.a(false);
        }
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            com.tencent.mm.plugin.appbrand.widget.input.w5 w5Var = this.f281308l;
            w5Var.a();
            if (this.f281297a.a() != null && this.f281297a.a().getContentView() != null && this.f281297a.a().getContentView().getViewTreeObserver() != null) {
                this.f281297a.a().getContentView().getViewTreeObserver().removeOnGlobalLayoutListener(w5Var);
            }
        } else {
            com.tencent.mm.plugin.appbrand.widget.input.l2 l2Var = this.f281298b;
            if (l2Var != null) {
                l2Var.g(this.f281310n);
            }
        }
        fg.p0.f261801a.a(true);
        this.f281303g = false;
        com.tencent.mm.plugin.appbrand.widget.input.u3 u3Var = this.f281299c;
        if (u3Var != null) {
            u3Var.m(this.f281309m);
        }
        this.f281299c = null;
        this.f281304h = -1;
        return false;
    }

    @Override // com.tencent.xweb.XWebExtendTextAreaClient
    public boolean onShowKeyboard(java.lang.String str, android.view.inputmethod.InputConnection inputConnection, android.os.ResultReceiver resultReceiver) {
        com.tencent.mm.plugin.appbrand.widget.input.u3 b17;
        boolean z17;
        this.f281303g = true;
        hg.g gVar = new hg.g(this, str);
        sf.c cVar = sf.c.f406939a;
        int i17 = gVar.f281296f;
        cVar.c(new sf.a(1, i17));
        if (this.f281298b == null) {
            this.f281298b = com.tencent.mm.plugin.appbrand.widget.input.h1.e(this.f281297a.a().getContentView());
        }
        if (android.os.Build.VERSION.SDK_INT < 33) {
            com.tencent.mm.plugin.appbrand.widget.input.l2 l2Var = this.f281298b;
            if (l2Var != null) {
                l2Var.a(this.f281310n);
            }
        } else if (this.f281297a.a() != null && this.f281297a.a().getContentView() != null && this.f281297a.a().getContentView().getViewTreeObserver() != null) {
            android.view.ViewTreeObserver viewTreeObserver = this.f281297a.a().getContentView().getViewTreeObserver();
            com.tencent.mm.plugin.appbrand.widget.input.w5 w5Var = this.f281308l;
            viewTreeObserver.removeOnGlobalLayoutListener(w5Var);
            viewTreeObserver.addOnGlobalLayoutListener(w5Var);
        }
        fg.p0.f261801a.a(false);
        this.f281307k = gVar.f281295e;
        this.f281304h = i17;
        if (this.f281297a != null && (b17 = b()) != null && (z17 = gVar.f281292b)) {
            b17.setComponentView(gVar.f281294d);
            b17.M();
            b17.setCanSmileyInput(!gVar.f281293c && "emoji".equals(gVar.f281291a));
            b17.setShowDoneButton(z17);
            b17.setOnDoneListener(new hg.d(this));
            b17.postDelayed(new hg.e(this, b17, gVar), 200L);
        }
        return false;
    }

    @Override // com.tencent.xweb.XWebExtendTextAreaClient
    public boolean onShowKeyboardConfig(int i17, int i18, java.lang.String str, int i19, int i27, android.view.inputmethod.EditorInfo editorInfo) {
        pl1.c cVar = null;
        try {
            cVar = (pl1.c) pl1.e.a(new org.json.JSONObject(str).optString("confirm-type", null), pl1.c.class);
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.w("WebViewExtendTextAreaClient", "onShowKeyboardConfig, get confirm-type error");
        }
        if (cVar == null) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("WebViewExtendTextAreaClient", "onShowKeyboardConfig, confirmType: " + cVar);
        if (pl1.c.RETURN != cVar) {
            editorInfo.imeOptions &= -1073741825;
        }
        int i28 = editorInfo.imeOptions;
        int i29 = cVar.f356583d;
        editorInfo.imeOptions = i28 | i29;
        this.f281306j = i29;
        return false;
    }

    @Override // com.tencent.xweb.XWebExtendTextAreaClient
    public boolean performEditorAction(int i17) {
        if (i17 == 0 || i17 != this.f281306j) {
            return true;
        }
        com.tencent.mars.xlog.Log.i("WebViewExtendTextAreaClient", "performEditorAction, confirmHold: " + this.f281307k);
        a(this.f281307k);
        return false;
    }
}
