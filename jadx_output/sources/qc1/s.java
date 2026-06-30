package qc1;

/* loaded from: classes7.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f361493d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.input.q0 f361494e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pl1.f f361495f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f361496g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f361497h;

    public s(qc1.v vVar, java.lang.ref.WeakReference weakReference, com.tencent.mm.plugin.appbrand.widget.input.q0 q0Var, pl1.f fVar, int i17, int i18) {
        this.f361493d = weakReference;
        this.f361494e = q0Var;
        this.f361495f = fVar;
        this.f361496g = i17;
        this.f361497h = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = (com.tencent.mm.plugin.appbrand.page.v5) this.f361493d.get();
        if (v5Var == null || v5Var.a2() == null) {
            return;
        }
        com.tencent.mm.plugin.appbrand.widget.input.q0 q0Var = this.f361494e;
        pl1.f fVar = this.f361495f;
        int i17 = this.f361496g;
        int i18 = this.f361497h;
        q0Var.f91609n = fVar;
        com.tencent.mm.plugin.appbrand.page.v5 v5Var2 = (com.tencent.mm.plugin.appbrand.page.v5) fVar.W.get();
        if (v5Var2 != null) {
            new com.tencent.mm.plugin.appbrand.widget.input.e1(v5Var2);
        }
        java.lang.ref.WeakReference weakReference = q0Var.f91609n.W;
        q0Var.f91610o = weakReference;
        com.tencent.mm.plugin.appbrand.page.v5 v5Var3 = weakReference == null ? null : (com.tencent.mm.plugin.appbrand.page.v5) weakReference.get();
        if (v5Var3 == null || v5Var3.a2() == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandInputInvokeHandler", "insertInputImpl, view not ready, return fail");
            q0Var.y();
            return;
        }
        com.tencent.mm.plugin.appbrand.widget.input.e4 a2Var = com.tencent.mm.plugin.appbrand.widget.input.m5.d(q0Var.f91609n.f356607u) ? new com.tencent.mm.plugin.appbrand.widget.input.a2(v5Var3.getF147807d()) : new com.tencent.mm.plugin.appbrand.widget.input.e2(v5Var3.getF147807d());
        q0Var.f91612q = a2Var;
        int i19 = q0Var.f91609n.Q;
        q0Var.f91611p = i19;
        a2Var.setInputId(i19);
        java.util.Map map = com.tencent.mm.plugin.appbrand.widget.input.r1.f91641d;
        com.tencent.mm.plugin.appbrand.widget.input.m.f91540a.e(v5Var3, q0Var);
        q0Var.A();
        com.tencent.mm.plugin.appbrand.widget.input.e4 e4Var = q0Var.f91612q;
        java.lang.String str = q0Var.f91609n.f356587a;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        e4Var.setText(str);
        if (com.tencent.mm.plugin.appbrand.widget.input.m5.d(q0Var.f91609n.f356609w)) {
            q0Var.r();
        }
        q0Var.f91612q.addTextChangedListener(new com.tencent.mm.plugin.appbrand.widget.input.j0(q0Var));
        q0Var.f91612q.setOnComposingDismissedListener(new com.tencent.mm.plugin.appbrand.widget.input.k0(q0Var));
        q0Var.f91612q.setOnKeyUpPostImeListener(new com.tencent.mm.plugin.appbrand.widget.input.l0(q0Var));
        if (!q0Var.k(q0Var.f91612q, q0Var.f91609n)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandInputInvokeHandler", "add custom view into webView failed");
            q0Var.y();
            return;
        }
        pl1.a aVar = q0Var.f91609n.V;
        if (aVar != null && !com.tencent.mm.sdk.platformtools.t8.L0(aVar.f356576b)) {
            com.tencent.mm.plugin.appbrand.widget.input.autofill.r.a(v5Var3, q0Var.f91612q, q0Var.f91609n.V);
        }
        if (!com.tencent.mm.plugin.appbrand.widget.input.m5.d(q0Var.f91609n.f356607u)) {
            com.tencent.mm.plugin.appbrand.widget.input.b.b(q0Var.f91612q, i17, i18);
        }
        if (com.tencent.mm.plugin.appbrand.widget.input.m5.d(q0Var.f91609n.f356607u)) {
            q0Var.f91612q.post(new com.tencent.mm.plugin.appbrand.widget.input.m0(q0Var));
        }
        if (com.tencent.mm.plugin.appbrand.widget.input.m5.d(q0Var.f91609n.f356607u)) {
            ((com.tencent.mm.plugin.appbrand.widget.input.a2) q0Var.f91612q).setAdjustKeyboardTo(q0Var.f91609n.C);
        }
        java.lang.String str2 = q0Var.f91609n.R;
        if ((com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT.equalsIgnoreCase(str2) || "encrypt-text".equalsIgnoreCase(str2)) || "textarea".equalsIgnoreCase(q0Var.f91609n.R)) {
            q0Var.q(false);
        } else {
            if (!"emoji".equalsIgnoreCase(q0Var.f91609n.R)) {
                iz5.a.h(java.lang.String.format(java.util.Locale.US, "Unrecognized type(%s) implementation removed from here", q0Var.f91609n.R));
                throw null;
            }
            q0Var.q(true);
        }
        q0Var.f91612q.setOnClickListener(new com.tencent.mm.plugin.appbrand.widget.input.t(q0Var));
        q0Var.x();
    }
}
