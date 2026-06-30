package n44;

/* loaded from: classes8.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n44.i f334925d;

    public e(n44.i iVar) {
        this.f334925d = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenH5Helper$createHalfScreen$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getWebViewController$p", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenH5Helper");
        n44.i iVar = this.f334925d;
        com.tencent.mm.plugin.webview.ui.tools.widget.z1 z1Var = iVar.f334951s;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getWebViewController$p", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenH5Helper");
        com.tencent.mm.ui.widget.MMWebView d17 = z1Var != null ? ((com.tencent.mm.plugin.webview.ui.tools.widget.o4) z1Var).d() : null;
        if (d17 != null) {
            a84.y0.b(iVar.e(), d17, 0);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenH5Helper$createHalfScreen$1");
    }
}
