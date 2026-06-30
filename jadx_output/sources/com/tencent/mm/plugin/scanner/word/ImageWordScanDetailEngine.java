package com.tencent.mm.plugin.scanner.word;

/* loaded from: classes15.dex */
public class ImageWordScanDetailEngine implements g04.j, androidx.lifecycle.x {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.MMActivity f160016d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.lifecycle.j0 f160017e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f160018f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f160019g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f160020h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f160021i;

    public ImageWordScanDetailEngine(com.tencent.mm.ui.MMActivity mMActivity, boolean z17) {
        this(mMActivity);
        this.f160021i = z17;
    }

    public static void a(com.tencent.mm.plugin.scanner.word.ImageWordScanDetailEngine imageWordScanDetailEngine, g04.i iVar, g04.l lVar) {
        imageWordScanDetailEngine.getClass();
        java.lang.String str = iVar != null ? iVar.f267464a : "";
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageWordScanDetailEngine", "onScanEnd path = %s, result = %s", str, lVar.f267469a);
        ((ku5.t0) ku5.t0.f312615d).B(new g04.e(imageWordScanDetailEngine, str, lVar));
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
    private void onActivityDestroy() {
        this.f160020h = true;
        this.f160018f.clear();
        this.f160016d.mo133getLifecycle().c(this);
        ((ku5.t0) ku5.t0.f312615d).A("WordDetectThread");
        this.f160016d = null;
        this.f160019g.clear();
        if (this.f160021i) {
            boolean z17 = gx5.f.f277458a;
            ((ku5.t0) ku5.t0.f312615d).h(new gx5.c(), "WordDetectThread");
        }
    }

    public void b(java.lang.String str, g04.h hVar) {
        g04.i iVar = new g04.i(str);
        g04.a aVar = new g04.a(this, hVar);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ImageWordScanDetailEngine", "input is  nil");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageWordScanDetailEngine", "image word scan called, session: %s, input: %s", java.lang.Long.valueOf(currentTimeMillis), str);
        if (!this.f160017e.hasObservers()) {
            com.tencent.mm.ui.MMActivity mMActivity = this.f160016d;
            if (mMActivity == null || mMActivity.isFinishing()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ImageWordScanDetailEngine", "activity destroy called, just return");
                return;
            }
            this.f160017e.observe(this.f160016d, new g04.b(this));
        }
        ((ku5.t0) ku5.t0.f312615d).A("WordDetectThread");
        ((ku5.t0) ku5.t0.f312615d).h(new g04.c(this, str, aVar, iVar, currentTimeMillis), "WordDetectThread");
    }

    public ImageWordScanDetailEngine(com.tencent.mm.ui.MMActivity mMActivity) {
        this.f160017e = new androidx.lifecycle.j0();
        this.f160018f = new java.util.concurrent.ConcurrentHashMap();
        this.f160019g = new java.util.concurrent.ConcurrentHashMap();
        this.f160020h = false;
        this.f160021i = true;
        mMActivity.mo133getLifecycle().a(this);
        this.f160016d = mMActivity;
        this.f160020h = false;
    }
}
