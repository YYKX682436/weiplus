package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.animation.Interpolator f186787d;

    /* renamed from: e, reason: collision with root package name */
    public final int f186788e;

    /* renamed from: f, reason: collision with root package name */
    public final int f186789f;

    /* renamed from: g, reason: collision with root package name */
    public final long f186790g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f186791h = true;

    /* renamed from: i, reason: collision with root package name */
    public long f186792i = -1;

    /* renamed from: m, reason: collision with root package name */
    public int f186793m = -1;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.LogoWebViewWrapper f186794n;

    public r(com.tencent.mm.plugin.webview.ui.tools.LogoWebViewWrapper logoWebViewWrapper, int i17, int i18, long j17) {
        this.f186794n = logoWebViewWrapper;
        this.f186789f = i17;
        this.f186788e = i18;
        this.f186787d = logoWebViewWrapper.f183615q ? new android.view.animation.AccelerateInterpolator() : new android.view.animation.DecelerateInterpolator();
        this.f186790g = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        long j17 = this.f186792i;
        int i17 = this.f186788e;
        com.tencent.mm.plugin.webview.ui.tools.LogoWebViewWrapper logoWebViewWrapper = this.f186794n;
        if (j17 == -1) {
            this.f186792i = java.lang.System.currentTimeMillis();
        } else {
            long j18 = this.f186790g;
            long max = j18 > 0 ? java.lang.Math.max(java.lang.Math.min(((java.lang.System.currentTimeMillis() - this.f186792i) * 1000) / j18, 1000L), 0L) : 500L;
            int round = this.f186789f - java.lang.Math.round((r0 - i17) * this.f186787d.getInterpolation(((float) max) / 1000.0f));
            this.f186793m = round;
            logoWebViewWrapper.a(round);
            com.tencent.mm.plugin.webview.ui.tools.q qVar = logoWebViewWrapper.f183617s;
            if (qVar != null) {
                ((com.tencent.mm.plugin.webview.ui.tools.s7) qVar).c(this.f186793m, false);
            }
        }
        if (!this.f186791h || i17 == this.f186793m) {
            return;
        }
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.u0.m(logoWebViewWrapper, this);
    }
}
