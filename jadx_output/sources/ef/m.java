package ef;

/* loaded from: classes7.dex */
public final class m implements ef.d {

    /* renamed from: a, reason: collision with root package name */
    public ef.b f252124a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.input.l2 f252125b;

    /* renamed from: c, reason: collision with root package name */
    public ef.e f252126c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.EditText f252127d;

    /* renamed from: e, reason: collision with root package name */
    public int f252128e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f252129f;

    /* renamed from: g, reason: collision with root package name */
    public int f252130g;

    /* renamed from: h, reason: collision with root package name */
    public int f252131h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f252132i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.Integer f252133j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.Integer f252134k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f252135l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f252136m;

    /* renamed from: n, reason: collision with root package name */
    public int f252137n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f252138o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.widget.input.p3 f252139p;

    /* renamed from: q, reason: collision with root package name */
    public final ef.c f252140q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.Runnable f252141r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.widget.input.k2 f252142s;

    public m() {
        df.h hVar = df.h.f229470a;
        this.f252139p = new ef.h(this);
        this.f252140q = new ef.i(this);
        this.f252141r = new ef.j(this);
        this.f252142s = new ef.g(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00ae A[Catch: all -> 0x00c0, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:11:0x0013, B:16:0x001a, B:20:0x0020, B:22:0x0026, B:24:0x0030, B:26:0x003c, B:28:0x0040, B:30:0x0046, B:32:0x005c, B:33:0x0061, B:35:0x0065, B:37:0x006d, B:39:0x0073, B:40:0x007a, B:41:0x0078, B:42:0x0084, B:45:0x008b, B:47:0x0095, B:49:0x00a0, B:54:0x00ae, B:56:0x00b2, B:57:0x00ba), top: B:3:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ef.e a(android.view.inputmethod.InputConnection r5) {
        /*
            r4 = this;
            java.lang.String r0 = "WebViewExtendInputClient"
            monitor-enter(r0)
            ef.e r1 = r4.f252126c     // Catch: java.lang.Throwable -> Lc0
            if (r1 == 0) goto L13
            java.lang.String r2 = r4.f252135l     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r3 = r4.f252136m     // Catch: java.lang.Throwable -> Lc0
            boolean r2 = kotlin.jvm.internal.o.b(r2, r3)     // Catch: java.lang.Throwable -> Lc0
            if (r2 == 0) goto L13
            monitor-exit(r0)
            return r1
        L13:
            java.lang.String r1 = r4.f252135l     // Catch: java.lang.Throwable -> Lc0
            r2 = 0
            if (r1 != 0) goto L1a
            monitor-exit(r0)
            return r2
        L1a:
            boolean r3 = r4.f252129f     // Catch: java.lang.Throwable -> Lc0
            if (r3 != 0) goto L20
            monitor-exit(r0)
            return r2
        L20:
            boolean r1 = com.tencent.mm.plugin.appbrand.widget.input.r1.f(r1)     // Catch: java.lang.Throwable -> Lc0
            if (r1 != 0) goto L38
            java.lang.String r1 = r4.f252135l     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r3 = "safe-password"
            boolean r1 = kotlin.jvm.internal.o.b(r1, r3)     // Catch: java.lang.Throwable -> Lc0
            if (r1 != 0) goto L38
            java.lang.String r1 = r4.f252135l     // Catch: java.lang.Throwable -> Lc0
            boolean r1 = com.tencent.mm.plugin.appbrand.widget.input.r1.g(r1)     // Catch: java.lang.Throwable -> Lc0
            if (r1 == 0) goto L3c
        L38:
            if (r5 != 0) goto L3c
            monitor-exit(r0)
            return r2
        L3c:
            ef.b r1 = r4.f252124a     // Catch: java.lang.Throwable -> Lc0
            if (r1 == 0) goto L8b
            android.view.View r1 = r1.a()     // Catch: java.lang.Throwable -> Lc0
            if (r1 == 0) goto L8b
            java.lang.String r1 = r4.f252135l     // Catch: java.lang.Throwable -> Lc0
            kotlin.jvm.internal.o.d(r1)     // Catch: java.lang.Throwable -> Lc0
            ef.e r5 = r4.b(r1, r5)     // Catch: java.lang.Throwable -> Lc0
            r4.f252126c = r5     // Catch: java.lang.Throwable -> Lc0
            ef.b r5 = r4.f252124a     // Catch: java.lang.Throwable -> Lc0
            kotlin.jvm.internal.o.d(r5)     // Catch: java.lang.Throwable -> Lc0
            android.view.View r5 = r5.a()     // Catch: java.lang.Throwable -> Lc0
            if (r5 == 0) goto L61
            ef.f r1 = ef.f.f252116d     // Catch: java.lang.Throwable -> Lc0
            r5.setOnApplyWindowInsetsListener(r1)     // Catch: java.lang.Throwable -> Lc0
        L61:
            ef.e r5 = r4.f252126c     // Catch: java.lang.Throwable -> Lc0
            if (r5 == 0) goto L84
            android.widget.EditText r1 = new android.widget.EditText     // Catch: java.lang.Throwable -> Lc0
            android.view.View r2 = r5.getView()     // Catch: java.lang.Throwable -> Lc0
            if (r2 == 0) goto L78
            android.content.Context r2 = r2.getContext()     // Catch: java.lang.Throwable -> Lc0
            if (r2 == 0) goto L78
            android.content.Context r2 = com.tencent.mm.plugin.appbrand.jsapi.coverview.d.a(r2)     // Catch: java.lang.Throwable -> Lc0
            goto L7a
        L78:
            android.content.Context r2 = com.tencent.mm.sdk.platformtools.x2.f193071a     // Catch: java.lang.Throwable -> Lc0
        L7a:
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lc0
            r4.f252127d = r1     // Catch: java.lang.Throwable -> Lc0
            com.tencent.mm.plugin.appbrand.widget.input.p3 r1 = r4.f252139p     // Catch: java.lang.Throwable -> Lc0
            r5.k(r1)     // Catch: java.lang.Throwable -> Lc0
        L84:
            java.lang.String r5 = r4.f252135l     // Catch: java.lang.Throwable -> Lc0
            r4.f252136m = r5     // Catch: java.lang.Throwable -> Lc0
            ef.e r2 = r4.f252126c     // Catch: java.lang.Throwable -> Lc0
            goto Lbe
        L8b:
            java.lang.String r5 = r4.f252135l     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r1 = r4.f252136m     // Catch: java.lang.Throwable -> Lc0
            boolean r5 = kotlin.jvm.internal.o.b(r5, r1)     // Catch: java.lang.Throwable -> Lc0
            if (r5 != 0) goto Lbe
            java.lang.String r5 = r4.f252135l     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r1 = "text"
            boolean r1 = r1.equalsIgnoreCase(r5)     // Catch: java.lang.Throwable -> Lc0
            if (r1 != 0) goto Lab
            java.lang.String r1 = "encrypt-text"
            boolean r5 = r1.equalsIgnoreCase(r5)     // Catch: java.lang.Throwable -> Lc0
            if (r5 == 0) goto La9
            goto Lab
        La9:
            r5 = 0
            goto Lac
        Lab:
            r5 = 1
        Lac:
            if (r5 != 0) goto Lbe
            ef.e r5 = r4.f252126c     // Catch: java.lang.Throwable -> Lc0
            if (r5 == 0) goto Lba
            int r1 = r4.f252137n     // Catch: java.lang.Throwable -> Lc0
            r5.setXMode(r1)     // Catch: java.lang.Throwable -> Lc0
            r5.b()     // Catch: java.lang.Throwable -> Lc0
        Lba:
            java.lang.String r5 = r4.f252135l     // Catch: java.lang.Throwable -> Lc0
            r4.f252136m = r5     // Catch: java.lang.Throwable -> Lc0
        Lbe:
            monitor-exit(r0)
            return r2
        Lc0:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ef.m.a(android.view.inputmethod.InputConnection):ef.e");
    }

    public final ef.e b(java.lang.String str, android.view.inputmethod.InputConnection inputConnection) {
        ef.b bVar = this.f252124a;
        if ((bVar != null ? bVar.a() : null) == null) {
            return new ef.a();
        }
        boolean f17 = com.tencent.mm.plugin.appbrand.widget.input.r1.f(str);
        ef.c cVar = this.f252140q;
        if (f17) {
            ef.b bVar2 = this.f252124a;
            kotlin.jvm.internal.o.d(bVar2);
            android.view.View a17 = bVar2.a();
            kotlin.jvm.internal.o.d(a17);
            kotlin.jvm.internal.o.d(inputConnection);
            ef.q qVar = new ef.q(a17, inputConnection, cVar);
            qVar.setXMode(this.f252137n);
            return qVar;
        }
        if (!com.tencent.mm.plugin.appbrand.widget.input.r1.g(str)) {
            ef.b bVar3 = this.f252124a;
            kotlin.jvm.internal.o.d(bVar3);
            return new ef.s(bVar3, cVar);
        }
        ef.b bVar4 = this.f252124a;
        kotlin.jvm.internal.o.d(bVar4);
        android.view.View a18 = bVar4.a();
        kotlin.jvm.internal.o.d(a18);
        kotlin.jvm.internal.o.d(inputConnection);
        return new ef.w(a18, inputConnection, cVar);
    }

    public boolean c(java.lang.String str, android.view.inputmethod.InputConnection inputConnection) {
        ef.e a17;
        com.tencent.mars.xlog.Log.i("WebViewExtendInputClient", "onHideKeyboard");
        if (this.f252124a != null && (a17 = a(null)) != null) {
            a17.hideKeyboard();
            a17.a(false);
        }
        e(0);
        com.tencent.mm.plugin.appbrand.widget.input.l2 l2Var = this.f252125b;
        if (l2Var != null) {
            l2Var.g(this.f252142s);
        }
        this.f252135l = null;
        this.f252133j = null;
        this.f252134k = null;
        this.f252129f = false;
        ef.e eVar = this.f252126c;
        if (eVar != null) {
            eVar.m(this.f252139p);
        }
        this.f252126c = null;
        return false;
    }

    public final void d() {
        android.view.View a17;
        android.view.View a18;
        int i17 = this.f252131h;
        java.lang.Runnable runnable = this.f252141r;
        if (i17 == 0) {
            ef.b bVar = this.f252124a;
            if (bVar == null || (a18 = bVar.a()) == null) {
                return;
            }
            a18.post(runnable);
            return;
        }
        ef.b bVar2 = this.f252124a;
        if (bVar2 == null || (a17 = bVar2.a()) == null) {
            return;
        }
        a17.postOnAnimationDelayed(runnable, 100L);
    }

    public final void e(java.lang.Integer num) {
        int systemWindowInsetBottom;
        int i17;
        android.graphics.Insets insets;
        ef.b bVar = this.f252124a;
        android.app.Activity a17 = q75.a.a(bVar != null ? bVar.b() : null);
        if (a17 == null) {
            com.tencent.mars.xlog.Log.w("WebViewExtendInputClient", "send keyboard height, but activity is null");
            return;
        }
        ef.b bVar2 = this.f252124a;
        if (bVar2 == null || bVar2.a() == null) {
            return;
        }
        android.view.WindowInsets b17 = com.tencent.mm.ui.qk.b(a17);
        int i18 = android.os.Build.VERSION.SDK_INT;
        int c17 = i18 >= 30 ? (b17 == null || (insets = b17.getInsets(android.view.WindowInsets.Type.navigationBars())) == null) ? com.tencent.mm.ui.bl.c(a17) : insets.bottom : !this.f252138o ? 0 : com.tencent.mm.ui.bl.c(a17);
        if (b17 != null) {
            if (num != null) {
                i17 = num.intValue();
            } else {
                if (i18 >= 30) {
                    android.graphics.Insets insets2 = b17.getInsets(android.view.WindowInsets.Type.ime());
                    kotlin.jvm.internal.o.f(insets2, "getInsets(...)");
                    systemWindowInsetBottom = insets2.bottom;
                } else {
                    systemWindowInsetBottom = b17.getSystemWindowInsetBottom();
                }
                i17 = systemWindowInsetBottom - c17;
            }
            if (i18 < 30 && (i17 == 0 || i17 == com.tencent.mm.ui.bl.c(a17))) {
                ku5.u0 u0Var = ku5.t0.f312615d;
                ef.l lVar = new ef.l(this, a17);
                ku5.t0 t0Var = (ku5.t0) u0Var;
                t0Var.getClass();
                t0Var.z(lVar, 250L, false);
            }
            df.w0 w0Var = df.w0.f229569a;
            java.lang.Integer num2 = this.f252134k;
            int intValue = num2 != null ? num2.intValue() : -1;
            java.util.Iterator it = df.w0.f229578j.iterator();
            while (it.hasNext()) {
                df.w1 w1Var = ((df.o1) ((df.t0) it.next())).f229529a;
                com.tencent.skyline.SkylineRuntime skylineRuntime = w1Var.f229582f;
                if (skylineRuntime != null) {
                    skylineRuntime.updateKeyboardStatus(w1Var.f229580d, intValue, 0.0d, i17 * 1.0d, 250, java.lang.System.currentTimeMillis());
                }
            }
        }
    }
}
