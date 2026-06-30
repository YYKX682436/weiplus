package com.tencent.mm.plugin.finder.webview;

/* loaded from: classes8.dex */
public class n1 {

    /* renamed from: p, reason: collision with root package name */
    public static long f136895p;

    /* renamed from: q, reason: collision with root package name */
    public static com.tencent.mm.sdk.event.IListener f136896q;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f136898b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.xweb.d1 f136899c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.xweb.d1 f136900d;

    /* renamed from: e, reason: collision with root package name */
    public hy4.s f136901e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.k0 f136902f;

    /* renamed from: g, reason: collision with root package name */
    public final kd0.p2 f136903g;

    /* renamed from: h, reason: collision with root package name */
    public hy4.h0 f136904h;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.ref.WeakReference f136910n;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f136897a = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f136905i = "";

    /* renamed from: j, reason: collision with root package name */
    public final java.util.HashMap f136906j = new java.util.HashMap();

    /* renamed from: k, reason: collision with root package name */
    public java.lang.Long f136907k = 0L;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.Long f136908l = 0L;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Long f136909m = 0L;

    /* renamed from: o, reason: collision with root package name */
    public final hy4.r f136911o = new com.tencent.mm.plugin.finder.webview.w0(this);

    static {
        new java.util.HashMap();
        f136895p = 0L;
    }

    public n1(com.tencent.mm.plugin.finder.webview.q0 q0Var) {
        this.f136910n = new java.lang.ref.WeakReference(q0Var);
        if (f().getWebView() != null) {
            f().getWebView().setOnLongClickListener(new com.tencent.mm.plugin.finder.webview.a1(this));
        }
        kd0.x2 x2Var = (kd0.x2) i95.n0.c(kd0.x2.class);
        android.content.Context context = f().getContext();
        com.tencent.mm.plugin.finder.webview.y0 y0Var = new com.tencent.mm.plugin.finder.webview.y0(this);
        ((jd0.q2) x2Var).getClass();
        this.f136903g = new com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic(context, y0Var);
    }

    public static void a(com.tencent.mm.plugin.finder.webview.n1 n1Var, java.lang.String str) {
        n1Var.getClass();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        java.util.HashMap hashMap = n1Var.f136906j;
        if (hashMap.containsKey(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewLongClickHelper", "do cancelRecogQBar:" + str);
            try {
                com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.plugin.finder.webview.WebViewLongClickHelper$CancelRecogQBarData(str, ((java.lang.Long) hashMap.get(str)).longValue()), com.tencent.mm.plugin.finder.webview.l1.class, new com.tencent.mm.plugin.finder.webview.x0(n1Var));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebViewLongClickHelper", e17, "", new java.lang.Object[0]);
            }
        }
    }

    public final void b(int i17, com.tencent.mm.plugin.scanner.ImageQBarDataBean imageQBarDataBean) {
        java.lang.String str;
        hy4.h0 h0Var = this.f136904h;
        if (h0Var == null) {
            return;
        }
        h0Var.f286108b = this.f136905i;
        h0Var.f286110d = 40;
        if (imageQBarDataBean != null) {
            h0Var.f286109c = true;
            h0Var.f286113g = imageQBarDataBean.f158620e == 22 ? "WX_CODE" : "QR_CODE";
            h0Var.f286112f = imageQBarDataBean.f158619d;
        }
        if (android.webkit.URLUtil.isDataUrl(this.f136898b)) {
            try {
                str = kk.r.b(this.f136898b);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WebViewLongClickHelper", "getSHA1 ex %s", e17.getMessage());
                str = "";
            }
        } else {
            str = com.tencent.mm.sdk.platformtools.y9.a(this.f136898b);
        }
        hy4.h0 h0Var2 = this.f136904h;
        h0Var2.f286114h = str;
        h0Var2.a(i17);
    }

    public final android.content.Context c() {
        return f().getContext();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0042, code lost:
    
        if (r0.startsWith("http://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fy9) + "/s") != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d() {
        /*
            r7 = this;
            java.lang.String r0 = r7.f136905i
            java.lang.String r1 = "/s"
            java.lang.String r2 = "http://"
            java.lang.String r3 = "https://"
            r4 = 0
            boolean r5 = com.tencent.mm.sdk.platformtools.t8.K0(r0)     // Catch: java.lang.Exception -> L46
            if (r5 != 0) goto L50
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L46
            r5.<init>(r3)     // Catch: java.lang.Exception -> L46
            r3 = 2131769611(0x7f10390b, float:1.9170502E38)
            java.lang.String r6 = com.tencent.mm.sdk.platformtools.t9.a(r3)     // Catch: java.lang.Exception -> L46
            r5.append(r6)     // Catch: java.lang.Exception -> L46
            r5.append(r1)     // Catch: java.lang.Exception -> L46
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L46
            boolean r5 = r0.startsWith(r5)     // Catch: java.lang.Exception -> L46
            if (r5 != 0) goto L44
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L46
            r5.<init>(r2)     // Catch: java.lang.Exception -> L46
            java.lang.String r2 = com.tencent.mm.sdk.platformtools.t9.a(r3)     // Catch: java.lang.Exception -> L46
            r5.append(r2)     // Catch: java.lang.Exception -> L46
            r5.append(r1)     // Catch: java.lang.Exception -> L46
            java.lang.String r1 = r5.toString()     // Catch: java.lang.Exception -> L46
            boolean r0 = r0.startsWith(r1)     // Catch: java.lang.Exception -> L46
            if (r0 == 0) goto L50
        L44:
            r4 = 1
            goto L50
        L46:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r2 = "MicroMsg.WebViewLongClickHelper"
            java.lang.String r3 = "isMpUrl"
            com.tencent.mars.xlog.Log.printErrStackTrace(r2, r0, r3, r1)
        L50:
            if (r4 == 0) goto L54
            r0 = 5
            return r0
        L54:
            r0 = 3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.webview.n1.d():int");
    }

    public final boolean e() {
        try {
            return f().getInvoke().isSDCardAvailable();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewLongClickHelper", "onCreateContextMenu fail, ex = " + e17.getMessage());
            return false;
        }
    }

    public final com.tencent.mm.plugin.finder.webview.q0 f() {
        return (com.tencent.mm.plugin.finder.webview.q0) this.f136910n.get();
    }

    public final boolean g() {
        try {
            if (f().getInvoke() != null) {
                return f().getInvoke().Yh();
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.WebViewLongClickHelper", "invoker is null");
            return false;
        } catch (android.os.RemoteException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewLongClickHelper", "unable get config for Scan QRCode" + e17.getMessage());
            return false;
        }
    }

    public final boolean h() {
        return f() == null || f().getIsReleased();
    }

    public final boolean i(java.lang.String str) {
        if (h()) {
            return false;
        }
        if (!e()) {
            return true;
        }
        this.f136898b = str;
        if (this.f136902f == null) {
            this.f136902f = new com.tencent.mm.ui.widget.dialog.k0(f().getContext(), 1, false);
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f136902f;
        k0Var.f211872n = new com.tencent.mm.plugin.finder.webview.b1(this);
        k0Var.f211881s = new com.tencent.mm.plugin.finder.webview.c1(this, str);
        k0Var.p(new com.tencent.mm.plugin.finder.webview.d1(this));
        if (!f().getIsReleased()) {
            this.f136902f.v();
        }
        return this.f136902f.i();
    }

    public final boolean j(com.tencent.xweb.d1 d1Var) {
        boolean i17 = i(d1Var.f220240b);
        if (com.tencent.mm.sdk.platformtools.t8.L0(this.f136897a) && f().getPerm().b().a() && g()) {
            this.f136900d = d1Var;
            hy4.s sVar = new hy4.s();
            this.f136901e = sVar;
            sVar.a(f().getWebView(), this.f136911o);
        }
        return i17;
    }

    public final boolean k(com.tencent.xweb.d1 d1Var) {
        boolean i17 = i(d1Var.f220240b);
        if (com.tencent.mm.sdk.platformtools.t8.L0(this.f136897a) && f().getPerm().b().a() && g()) {
            this.f136899c = d1Var;
            hy4.s sVar = new hy4.s();
            this.f136901e = sVar;
            sVar.a(f().getWebView(), this.f136911o);
        }
        return i17;
    }
}
