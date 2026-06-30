package fg;

/* loaded from: classes7.dex */
public final class b0 extends com.tencent.xweb.XWebExtendInputClient {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f261724a;

    /* renamed from: b, reason: collision with root package name */
    public final long f261725b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f261726c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.page.oa f261727d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.input.l2 f261728e;

    /* renamed from: f, reason: collision with root package name */
    public fg.g f261729f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.EditText f261730g;

    /* renamed from: h, reason: collision with root package name */
    public int f261731h;

    /* renamed from: i, reason: collision with root package name */
    public int f261732i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f261733j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f261734k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.Integer f261735l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f261736m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f261737n;

    /* renamed from: o, reason: collision with root package name */
    public int f261738o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f261739p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f261740q;

    /* renamed from: r, reason: collision with root package name */
    public int f261741r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.widget.input.w5 f261742s;

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.widget.input.k2 f261743t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(com.tencent.xweb.i2 view) {
        super(view);
        kotlin.jvm.internal.o.g(view, "view");
        this.f261724a = "WebViewExtendInputClient";
        this.f261725b = 250L;
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        this.f261726c = z65.c.a();
        this.f261742s = new com.tencent.mm.plugin.appbrand.widget.input.w5(new fg.t(this));
        this.f261743t = new fg.s(this);
    }

    public final void a(boolean z17, fg.g gVar) {
        java.lang.String str;
        com.tencent.mm.plugin.appbrand.widget.input.v4 l17;
        java.lang.String message;
        if (!this.f261733j) {
            com.tencent.mars.xlog.Log.w(this.f261724a, "send confirm after keyboard hide");
            return;
        }
        java.lang.String str2 = null;
        pl1.f params = gVar != null ? gVar.getParams() : null;
        java.lang.String str3 = params != null ? params.R : null;
        java.util.Map map = com.tencent.mm.plugin.appbrand.widget.input.r1.f91641d;
        if ("encrypt-text".equalsIgnoreCase(str3) || com.tencent.mm.plugin.appbrand.widget.input.r1.e(str3)) {
            com.tencent.mars.xlog.Log.i(this.f261724a, "onKeyboardComplete, do encrypt");
            if (gVar != null) {
                try {
                    l17 = gVar.l();
                } catch (com.tencent.mm.plugin.appbrand.widget.input.k4 e17) {
                    com.tencent.mars.xlog.Log.e(this.f261724a, "onKeyboardComplete, encrypt fail since " + e17);
                    message = e17.getMessage();
                }
            } else {
                l17 = null;
            }
            com.tencent.mm.plugin.appbrand.page.oa oaVar = this.f261727d;
            str2 = com.tencent.mm.plugin.appbrand.widget.input.l4.b(l17, oaVar != null ? oaVar.a() : null, params);
            message = null;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            if (str2 != null) {
                jSONObject.put("encryptedValue", str2);
            }
            if (message != null) {
                jSONObject.put("encryptError", message);
            }
            str = jSONObject.toString();
        } else {
            str = "";
        }
        kotlin.jvm.internal.o.d(str);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("(function(){    var focusElement = document.activeElement;    if(focusElement){        if(focusElement.onkeyboardconfirm){            focusElement.onkeyboardconfirm(");
        sb6.append(str);
        sb6.append(");        }");
        sb6.append(z17 ? "" : "        focusElement.blur();");
        sb6.append("    }})();");
        evaluateJavascript(sb6.toString(), fg.j.f261779a);
    }

    public final fg.g b(android.view.inputmethod.InputConnection inputConnection) {
        synchronized (this.f261724a) {
            fg.g gVar = this.f261729f;
            if (gVar != null) {
                return gVar;
            }
            java.lang.String str = this.f261740q;
            fg.g gVar2 = null;
            if (str == null) {
                return null;
            }
            if (e(str) && inputConnection == null) {
                return null;
            }
            com.tencent.mm.plugin.appbrand.page.oa oaVar = this.f261727d;
            if (oaVar != null) {
                if ((oaVar != null ? oaVar.a() : null) != null) {
                    java.lang.String str2 = this.f261740q;
                    kotlin.jvm.internal.o.d(str2);
                    fg.g c17 = c(str2, inputConnection);
                    this.f261729f = c17;
                    this.f261730g = new android.widget.EditText(c17.getView().getContext());
                    c17.k(new fg.m(c17, this));
                    gVar2 = this.f261729f;
                }
            }
            return gVar2;
        }
    }

    public final fg.g c(java.lang.String str, android.view.inputmethod.InputConnection inputConnection) {
        if (com.tencent.mm.plugin.appbrand.widget.input.r1.f(str)) {
            com.tencent.mm.plugin.appbrand.page.oa oaVar = this.f261727d;
            kotlin.jvm.internal.o.d(oaVar);
            com.tencent.mm.plugin.appbrand.jsapi.t a17 = oaVar.a();
            kotlin.jvm.internal.o.f(a17, "getAppBrandPage(...)");
            kotlin.jvm.internal.o.d(inputConnection);
            return new fg.e0(a17, inputConnection, this.f261741r);
        }
        if (kotlin.jvm.internal.o.b(str, "safe-password")) {
            com.tencent.mm.plugin.appbrand.page.oa oaVar2 = this.f261727d;
            kotlin.jvm.internal.o.d(oaVar2);
            com.tencent.mm.plugin.appbrand.jsapi.t a18 = oaVar2.a();
            kotlin.jvm.internal.o.f(a18, "getAppBrandPage(...)");
            kotlin.jvm.internal.o.d(inputConnection);
            fg.i0 i0Var = new fg.i0(a18, inputConnection);
            i0Var.f261771b = new fg.o(this);
            return i0Var;
        }
        if (!com.tencent.mm.plugin.appbrand.widget.input.r1.g(str)) {
            com.tencent.mm.plugin.appbrand.page.oa oaVar3 = this.f261727d;
            kotlin.jvm.internal.o.d(oaVar3);
            com.tencent.mm.plugin.appbrand.jsapi.t a19 = oaVar3.a();
            kotlin.jvm.internal.o.f(a19, "getAppBrandPage(...)");
            return new fg.l0(a19, inputConnection);
        }
        com.tencent.mm.plugin.appbrand.page.oa oaVar4 = this.f261727d;
        kotlin.jvm.internal.o.d(oaVar4);
        com.tencent.mm.plugin.appbrand.jsapi.t a27 = oaVar4.a();
        kotlin.jvm.internal.o.f(a27, "getAppBrandPage(...)");
        kotlin.jvm.internal.o.d(inputConnection);
        return new fg.o0(a27, inputConnection, this.f261741r);
    }

    public final int d(int i17) {
        fg.g b17 = b(null);
        if (b17 == null || !this.f261734k) {
            return i17;
        }
        int c17 = b17.c();
        if (c17 != 0 && c17 != this.f261731h) {
            this.f261731h = c17;
        }
        return i17 + this.f261731h;
    }

    public final boolean e(java.lang.String str) {
        return com.tencent.mm.plugin.appbrand.widget.input.r1.f(str) || kotlin.jvm.internal.o.b(str, "safe-password") || com.tencent.mm.plugin.appbrand.widget.input.r1.g(str);
    }

    @Override // com.tencent.xweb.XWebExtendInputClient
    public int getToolBarHeight(int i17) {
        com.tencent.mm.plugin.appbrand.page.oa oaVar = this.f261727d;
        if (oaVar != null) {
            kotlin.jvm.internal.o.d(oaVar);
            if (oaVar.a() != null) {
                com.tencent.mm.plugin.appbrand.page.oa oaVar2 = this.f261727d;
                kotlin.jvm.internal.o.d(oaVar2);
                if (com.tencent.mm.plugin.appbrand.utils.f5.c(oaVar2.a().getContentView())) {
                    return 0;
                }
                return d(i17);
            }
        }
        return 0;
    }

    @Override // com.tencent.xweb.XWebExtendInputClient
    public void onExtraInfoChanged(java.lang.String str) {
        org.json.JSONObject jSONObject;
        if (str != null) {
            pl1.f fVar = new pl1.f();
            com.tencent.mars.xlog.Log.i("TextAreaInfo", "totalInfo:".concat(str));
            try {
                jSONObject = new org.json.JSONObject(str);
            } catch (java.lang.Exception unused) {
                com.tencent.mars.xlog.Log.e("TextAreaInfo", "TextAreaInfo convert to json error");
                jSONObject = new org.json.JSONObject();
            }
            try {
                if (jSONObject.has("element-tag")) {
                    jSONObject.getString("element-tag");
                }
            } catch (org.json.JSONException unused2) {
                com.tencent.mars.xlog.Log.e("TextAreaInfo", "TextAreaInfo add elementTag error");
            }
            try {
                if (jSONObject.has("keyboard-type")) {
                    java.lang.String string = jSONObject.getString("keyboard-type");
                    kotlin.jvm.internal.o.f(string, "getString(...)");
                    fVar.R = string;
                }
            } catch (org.json.JSONException unused3) {
                com.tencent.mars.xlog.Log.e("TextAreaInfo", "TextAreaInfo add keyboardType error");
            }
            try {
                if (jSONObject.has("cursor-spacing")) {
                    fVar.f356611y = java.lang.Integer.valueOf(ik1.w.k(jSONObject, "cursor-spacing"));
                }
            } catch (java.lang.NumberFormatException unused4) {
                com.tencent.mars.xlog.Log.e("TextAreaInfo", "TextAreaInfo get cursor-spacing parseInt error");
            } catch (org.json.JSONException unused5) {
                com.tencent.mars.xlog.Log.e("TextAreaInfo", "TextAreaInfo get cursor-spacing error");
            } catch (java.lang.Exception unused6) {
                com.tencent.mars.xlog.Log.e("TextAreaInfo", "TextAreaInfo get cursor-spacing parseInt error");
            }
            try {
                if (jSONObject.has("adjust-position")) {
                    fVar.B = java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.t8.y(jSONObject.getString("adjust-position"), true));
                }
            } catch (org.json.JSONException unused7) {
                com.tencent.mars.xlog.Log.e("TextAreaInfo", "TextAreaInfo get adjust-position error");
            } catch (java.lang.Exception unused8) {
                com.tencent.mars.xlog.Log.e("TextAreaInfo", "TextAreaInfo get adjust-position error");
            }
            try {
                if (jSONObject.has("show-confirm-bar")) {
                    com.tencent.mm.sdk.platformtools.t8.y(jSONObject.getString("show-confirm-bar"), false);
                }
            } catch (org.json.JSONException unused9) {
                com.tencent.mars.xlog.Log.e("TextAreaInfo", "TextAreaInfo get show-confirm-bar error");
            } catch (java.lang.Exception unused10) {
                com.tencent.mars.xlog.Log.e("TextAreaInfo", "TextAreaInfo get show-confirm-bar error");
            }
            try {
                if (jSONObject.has("password")) {
                    com.tencent.mm.sdk.platformtools.t8.y(jSONObject.getString("password"), false);
                }
            } catch (org.json.JSONException unused11) {
                com.tencent.mars.xlog.Log.e("TextAreaInfo", "TextAreaInfo get password error");
            } catch (java.lang.Exception unused12) {
                com.tencent.mars.xlog.Log.e("TextAreaInfo", "TextAreaInfo get password error");
            }
            try {
                if (jSONObject.has("show-cover-view")) {
                    com.tencent.mm.sdk.platformtools.t8.y(jSONObject.getString("show-cover-view"), false);
                }
            } catch (org.json.JSONException unused13) {
                com.tencent.mars.xlog.Log.e("TextAreaInfo", "TextAreaInfo get show-cover-view error");
            } catch (java.lang.Exception unused14) {
                com.tencent.mars.xlog.Log.e("TextAreaInfo", "TextAreaInfo get show-cover-view error");
            }
            try {
                if (jSONObject.has("confirm-hold")) {
                    com.tencent.mm.sdk.platformtools.t8.y(jSONObject.getString("confirm-hold"), false);
                }
            } catch (org.json.JSONException unused15) {
                com.tencent.mars.xlog.Log.e("TextAreaInfo", "TextAreaInfo get confirm-hold error");
            } catch (java.lang.Exception unused16) {
                com.tencent.mars.xlog.Log.e("TextAreaInfo", "TextAreaInfo get confirm-hold error");
            }
            com.tencent.mm.plugin.appbrand.widget.input.h6.d(jSONObject, fVar);
            com.tencent.mm.plugin.appbrand.widget.input.l4.d(jSONObject, fVar);
            fg.g b17 = b(null);
            if (b17 != null) {
                b17.f(fVar);
            }
        }
    }

    @Override // com.tencent.xweb.XWebExtendInputClient
    public boolean onHideKeyboard(java.lang.String str, android.view.inputmethod.InputConnection inputConnection) {
        android.view.View contentView;
        android.view.ViewTreeObserver viewTreeObserver;
        fg.g b17;
        if (this.f261726c && inputConnection != null) {
            boolean z17 = inputConnection instanceof android.view.inputmethod.BaseInputConnection;
        }
        this.f261733j = false;
        if (this.f261727d != null && (b17 = b(null)) != null) {
            b17.hideKeyboard();
            b17.a(false);
        }
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            com.tencent.mm.plugin.appbrand.widget.input.w5 w5Var = this.f261742s;
            w5Var.a();
            com.tencent.mm.plugin.appbrand.page.oa oaVar = this.f261727d;
            kotlin.jvm.internal.o.d(oaVar);
            com.tencent.mm.plugin.appbrand.jsapi.t a17 = oaVar.a();
            if (a17 != null && (contentView = a17.getContentView()) != null && (viewTreeObserver = contentView.getViewTreeObserver()) != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(w5Var);
            }
        } else {
            com.tencent.mm.plugin.appbrand.widget.input.l2 l2Var = this.f261728e;
            if (l2Var != null) {
                l2Var.g(this.f261743t);
            }
        }
        fg.p0.f261801a.a(true);
        this.f261740q = null;
        this.f261729f = null;
        this.f261734k = false;
        this.f261735l = null;
        this.f261736m = null;
        return false;
    }

    @Override // com.tencent.xweb.XWebExtendInputClient
    public boolean onShowKeyboard(java.lang.String str, java.lang.String extendInfo, android.view.inputmethod.InputConnection inputConnection, android.os.ResultReceiver resultReceiver) {
        android.view.View contentView;
        android.view.ViewTreeObserver viewTreeObserver;
        kotlin.jvm.internal.o.g(extendInfo, "extendInfo");
        if (this.f261726c && inputConnection != null) {
            boolean z17 = inputConnection instanceof android.view.inputmethod.BaseInputConnection;
        }
        this.f261733j = true;
        fg.i iVar = new fg.i(extendInfo);
        sf.c cVar = sf.c.f406939a;
        pl1.f fVar = iVar.f261768d;
        java.lang.Integer num = fVar.X;
        if (num == null) {
            num = -1;
        }
        cVar.c(new sf.a(0, num.intValue()));
        com.tencent.mm.plugin.appbrand.widget.input.l2 l2Var = this.f261728e;
        if (l2Var == null) {
            com.tencent.mm.plugin.appbrand.page.oa oaVar = this.f261727d;
            kotlin.jvm.internal.o.d(oaVar);
            l2Var = com.tencent.mm.plugin.appbrand.widget.input.h1.e(oaVar.a().getContentView());
        }
        this.f261728e = l2Var;
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            com.tencent.mm.plugin.appbrand.page.oa oaVar2 = this.f261727d;
            kotlin.jvm.internal.o.d(oaVar2);
            com.tencent.mm.plugin.appbrand.jsapi.t a17 = oaVar2.a();
            if (a17 != null && (contentView = a17.getContentView()) != null && (viewTreeObserver = contentView.getViewTreeObserver()) != null) {
                com.tencent.mm.plugin.appbrand.widget.input.w5 w5Var = this.f261742s;
                viewTreeObserver.removeOnGlobalLayoutListener(w5Var);
                viewTreeObserver.addOnGlobalLayoutListener(w5Var);
            }
        } else if (l2Var != null) {
            l2Var.a(this.f261743t);
        }
        fg.p0.f261801a.a(false);
        this.f261739p = iVar.f261769e;
        java.lang.String str2 = iVar.f261765a;
        this.f261740q = str2;
        this.f261741r = com.tencent.mm.sdk.platformtools.t8.j1((java.lang.Integer) com.tencent.mm.plugin.appbrand.widget.input.r1.f91641d.get(str2), 0);
        boolean z18 = iVar.f261766b;
        this.f261734k = z18;
        this.f261735l = fVar.X;
        this.f261736m = str;
        boolean e17 = e(this.f261740q);
        if (this.f261727d == null) {
            return false;
        }
        fg.g b17 = b(inputConnection);
        if (b17 != null) {
            if (z18) {
                b17.j(iVar.f261767c);
            }
            b17.g(new fg.v(this, b17));
            b17.i(fVar);
            b17.setText(this.f261736m);
            b17.b();
            if (z18) {
                b17.getView().postDelayed(new fg.y(this, b17, iVar, e17), 200L);
            } else if (e17) {
                b17.a(z18);
                b17.getView().post(new fg.a0(b17, this));
            }
        }
        return e17;
    }

    @Override // com.tencent.xweb.XWebExtendInputClient
    public boolean onShowKeyboardConfig(java.lang.String str, int i17, int i18, java.lang.String str2, int i19, int i27, android.view.inputmethod.EditorInfo outAttrs) {
        java.lang.String str3 = this.f261724a;
        kotlin.jvm.internal.o.g(outAttrs, "outAttrs");
        pl1.c cVar = null;
        try {
            cVar = (pl1.c) pl1.e.a(new org.json.JSONObject(str2).optString("confirm-type", null), pl1.c.class);
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.w(str3, "onShowKeyboardConfig, get confirm-type error");
        }
        if (cVar == null) {
            return false;
        }
        com.tencent.mars.xlog.Log.i(str3, "onShowKeyboardConfig, confirmType: " + cVar);
        if (pl1.c.RETURN != cVar) {
            outAttrs.imeOptions &= -1073741825;
        }
        int i28 = outAttrs.imeOptions;
        int i29 = cVar.f356583d;
        outAttrs.imeOptions = i28 | i29;
        this.f261738o = i29;
        return false;
    }

    @Override // com.tencent.xweb.XWebExtendInputClient
    public boolean performEditorAction(int i17) {
        if (i17 == 0 || i17 != this.f261738o) {
            return true;
        }
        com.tencent.mars.xlog.Log.i(this.f261724a, "performEditorAction, confirmHold: " + this.f261739p);
        a(this.f261739p, this.f261729f);
        return false;
    }
}
