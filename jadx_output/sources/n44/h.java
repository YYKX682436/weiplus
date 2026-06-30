package n44;

/* loaded from: classes8.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n44.i f334942d;

    public h(n44.i iVar) {
        this.f334942d = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenH5Helper$releaseWebView$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getWebViewController$p", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenH5Helper");
        com.tencent.mm.plugin.webview.ui.tools.widget.z1 z1Var = this.f334942d.f334951s;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getWebViewController$p", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenH5Helper");
        if (z1Var != null) {
            ((com.tencent.mm.plugin.webview.ui.tools.widget.o4) z1Var).l();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenH5Helper$releaseWebView$1");
    }
}
