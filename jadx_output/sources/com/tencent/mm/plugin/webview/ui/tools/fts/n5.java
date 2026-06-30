package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class n5 {

    /* renamed from: e, reason: collision with root package name */
    public static com.tencent.mm.plugin.webview.ui.tools.fts.n5 f184541e;

    /* renamed from: a, reason: collision with root package name */
    public q35.d f184542a;

    /* renamed from: b, reason: collision with root package name */
    public long f184543b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f184544c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f184545d = false;

    public void a(com.tencent.mm.plugin.webview.ui.tools.fts.m5 m5Var) {
        if (this.f184545d && this.f184542a != null) {
            com.tencent.mars.xlog.Log.i("WebSearchShakeCheckingManager", "startCheck , isInitShake.");
            return;
        }
        this.f184545d = true;
        q35.d dVar = new q35.d(com.tencent.mm.sdk.platformtools.x2.f193071a);
        this.f184542a = dVar;
        dVar.a(new com.tencent.mm.plugin.webview.ui.tools.fts.l5(this, m5Var));
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f184543b = android.os.SystemClock.elapsedRealtime();
    }
}
