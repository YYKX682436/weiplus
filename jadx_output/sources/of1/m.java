package of1;

/* loaded from: classes8.dex */
public final class m extends of1.a implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.tools.s6 f344964h;

    /* renamed from: i, reason: collision with root package name */
    public long f344965i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f344966m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f344967n;

    /* renamed from: o, reason: collision with root package name */
    public int f344968o;

    /* renamed from: p, reason: collision with root package name */
    public int f344969p;

    /* renamed from: q, reason: collision with root package name */
    public byte[] f344970q;

    /* renamed from: r, reason: collision with root package name */
    public hy4.s f344971r;

    /* renamed from: s, reason: collision with root package name */
    public final kd0.p2 f344972s;

    /* renamed from: t, reason: collision with root package name */
    public final hy4.r f344973t;

    public m(com.tencent.mm.plugin.appbrand.jsapi.webview.o oVar) {
        super(oVar);
        this.f344970q = null;
        this.f344973t = new of1.l(this);
        kd0.x2 x2Var = (kd0.x2) i95.n0.c(kd0.x2.class);
        android.content.Context a17 = a();
        of1.b bVar = new of1.b(this);
        androidx.lifecycle.y lifecycleOwner = ((of1.w1) oVar).m533getPageView().getLifecycleOwner();
        ((jd0.q2) x2Var).getClass();
        this.f344972s = new com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic(a17, bVar, lifecycleOwner);
        try {
            com.tencent.mm.ui.tools.s6 s6Var = new com.tencent.mm.ui.tools.s6(a());
            this.f344964h = s6Var;
            s6Var.c(((of1.w1) oVar).getWebView(), this, null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.HTMLViewScanHelper", e17, "<init> initMenu() get exception", new java.lang.Object[0]);
            this.f344964h = null;
        }
    }

    public final java.lang.String b() {
        return ((com.tencent.mm.plugin.webview.core.r0) ((of1.x1) ((of1.w1) this.f344880d).getController())).Z();
    }

    public final boolean c(android.view.ContextMenu contextMenu, java.lang.String str) {
        boolean z17;
        boolean z18;
        try {
            z17 = this.f344882f.isSDCardAvailable();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.HTMLViewScanHelper", "onCreateContextMenu fail, ex = " + e17.getMessage());
            z17 = false;
        }
        if (!z17 || this.f344883g == null) {
            return true;
        }
        contextMenu.setHeaderTitle(com.tencent.mm.R.string.lax);
        try {
            z18 = this.f344882f.lb();
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.HTMLViewScanHelper", "get has setuin failed : %s", e18.getMessage());
            z18 = false;
        }
        boolean z19 = (this.f344883g.b().f192177d & 16384) > 0;
        boolean z27 = (this.f344883g.b().f192177d & 32768) > 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.HTMLViewScanHelper", "hasSetAcc = %b, canShareImage = %b, canFavImage = %b", java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z19), java.lang.Boolean.valueOf(z27));
        if (z18 && z19) {
            contextMenu.add(0, 0, 0, a().getString(com.tencent.mm.R.string.hr_)).setOnMenuItemClickListener(new of1.g(this));
        }
        contextMenu.add(0, 0, 0, a().getString(com.tencent.mm.R.string.i8c)).setOnMenuItemClickListener(new of1.h(this));
        if (z18 && z27) {
            contextMenu.add(0, 0, 0, a().getString(com.tencent.mm.R.string.hjg)).setOnMenuItemClickListener(new of1.j(this));
        }
        this.f344964h.f210721e.o(null);
        java.lang.String str2 = this.f344966m;
        if (str2 == null) {
            return false;
        }
        this.f344964h.f210721e.o(((com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic) this.f344972s).b(new of1.k(this, str2, str), this.f344968o, str2, 10));
        ((et.s) ((ft.f4) i95.n0.c(ft.f4.class))).wi(((of1.w1) this.f344880d).m533getPageView(), true, this.f344968o, this.f344966m, true, false, b());
        return true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        com.tencent.xweb.d1 hitTestResult;
        boolean z17 = view instanceof android.webkit.WebView;
        hy4.r rVar = this.f344973t;
        com.tencent.mm.ui.widget.MMWebView mMWebView = this.f344881e;
        if (z17) {
            com.tencent.xweb.d1 hitTestResult2 = mMWebView.getHitTestResult();
            if (hitTestResult2 == null) {
                return;
            }
            int i17 = hitTestResult2.f220239a;
            if (i17 == 5 || i17 == 8) {
                boolean c17 = c(contextMenu, hitTestResult2.f220240b);
                this.f344967n = hitTestResult2.f220240b;
                if (c17 || !this.f344883g.b().a()) {
                    return;
                }
                hy4.s sVar = new hy4.s();
                this.f344971r = sVar;
                sVar.a(mMWebView, rVar);
                return;
            }
            return;
        }
        if (!(view instanceof com.tencent.mm.ui.widget.MMWebView) || (hitTestResult = ((com.tencent.mm.ui.widget.MMWebView) view).getHitTestResult()) == null) {
            return;
        }
        int i18 = hitTestResult.f220239a;
        if (i18 == 5 || i18 == 8) {
            boolean c18 = c(contextMenu, hitTestResult.f220240b);
            this.f344967n = hitTestResult.f220240b;
            if (c18 || !this.f344883g.b().a()) {
                return;
            }
            hy4.s sVar2 = new hy4.s();
            this.f344971r = sVar2;
            sVar2.a(mMWebView, rVar);
        }
    }
}
