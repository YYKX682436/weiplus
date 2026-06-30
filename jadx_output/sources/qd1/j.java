package qd1;

/* loaded from: classes7.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f361640d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.v5 f361641e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f361642f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f361643g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f361644h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f361645i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f361646m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f361647n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f361648o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f361649p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f361650q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f361651r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f361652s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f361653t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ qd1.p f361654u;

    public j(qd1.p pVar, com.tencent.mm.plugin.appbrand.e9 e9Var, com.tencent.mm.plugin.appbrand.page.v5 v5Var, boolean z17, java.lang.String str, java.lang.String str2, boolean z18, java.lang.String str3, int i17, int i18, boolean z19, java.lang.String str4, int i19, int i27, org.json.JSONObject jSONObject) {
        this.f361654u = pVar;
        this.f361640d = e9Var;
        this.f361641e = v5Var;
        this.f361642f = z17;
        this.f361643g = str;
        this.f361644h = str2;
        this.f361645i = z18;
        this.f361646m = str3;
        this.f361647n = i17;
        this.f361648o = i18;
        this.f361649p = z19;
        this.f361650q = str4;
        this.f361651r = i19;
        this.f361652s = i27;
        this.f361653t = jSONObject;
    }

    @Override // java.lang.Runnable
    public void run() {
        fl1.g2 dialogContainer;
        android.view.inputmethod.InputMethodManager inputMethodManager;
        android.view.View currentFocus;
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f361640d;
        if (e9Var.isRunning()) {
            com.tencent.mm.plugin.appbrand.widget.k0 w07 = e9Var.t3().w0();
            com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f361641e;
            v5Var.I1().a(com.tencent.mm.plugin.appbrand.page.bb.MODAL);
            if (this.f361642f) {
                com.tencent.mm.plugin.appbrand.AppBrandRuntime t37 = e9Var.t3();
                if (t37.f74814w == null) {
                    fl1.c0 c0Var = new fl1.c0(t37.f74795d, ((fl1.c0) t37.getDialogContainer()).getShareContext());
                    t37.f74814w = c0Var;
                    c0Var.setShouldBringSelfToFrontWhenDialogShown(false);
                    com.tencent.mm.plugin.appbrand.ef.UpperDialogContainer.a(t37, t37.f74814w);
                }
                dialogContainer = t37.f74814w;
            } else {
                dialogContainer = e9Var.t3().getDialogContainer();
            }
            final fl1.b bVar = new fl1.b(e9Var.getF147807d());
            java.lang.String str = this.f361643g;
            boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
            boolean z17 = this.f361645i;
            java.lang.String str2 = this.f361644h;
            if (!K0) {
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str2) || z17) {
                    bVar.setTitle(str);
                } else {
                    bVar.t(str);
                }
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str2) && !z17) {
                bVar.t(str2);
            }
            bVar.A(this.f361646m, true, new qd1.k(this, bVar, w07));
            boolean z18 = this.f361649p;
            if (z18) {
                bVar.w(this.f361650q, false, new qd1.l(this, w07));
            }
            bVar.setOnCancelListener(new qd1.m(this, w07));
            bVar.B(this.f361651r);
            if (z18) {
                bVar.x(this.f361652s);
            }
            if (z17) {
                bVar.f211837r.setVisibility(0);
                if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                    java.lang.String optString = this.f361653t.optString("placeholderText");
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
                        bVar.f211837r.setVisibility(0);
                        bVar.f211837r.setHint(optString);
                    }
                } else {
                    bVar.f211837r.setVisibility(0);
                    bVar.f211837r.setText(str2);
                }
                com.tencent.mm.plugin.appbrand.widget.input.l2 e17 = com.tencent.mm.plugin.appbrand.widget.input.h1.e(v5Var.getContentView());
                qd1.o oVar = new qd1.o(bVar, e9Var, null);
                e17.a(oVar);
                bVar.setOnDismissListener(new qd1.n(this, w07, e17, oVar));
            }
            ((fl1.c0) dialogContainer).c(bVar);
            int i17 = this.f361647n;
            if (i17 != -1) {
                w07.getClass();
                w07.f91748b.put(i17, bVar);
            }
            if (z17) {
                bVar.f211837r.requestFocus();
                android.content.Context f147807d = v5Var.getF147807d();
                android.app.Activity activity = f147807d instanceof android.app.Activity ? (android.app.Activity) f147807d : null;
                if (activity != null && (inputMethodManager = (android.view.inputmethod.InputMethodManager) activity.getSystemService("input_method")) != null && (currentFocus = activity.getCurrentFocus()) != null && currentFocus.getWindowToken() != null) {
                    inputMethodManager.toggleSoftInput(0, 2);
                }
                e9Var.j(new java.lang.Runnable() { // from class: qd1.j$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        fl1.b.this.f211837r.requestFocus();
                    }
                }, 500L);
            }
        }
    }
}
