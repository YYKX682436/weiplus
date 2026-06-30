package x44;

/* loaded from: classes4.dex */
public final class h0 implements j35.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x44.i0 f451833a;

    public h0(x44.i0 i0Var) {
        this.f451833a = i0Var;
    }

    @Override // j35.d
    public final void a(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onInstallApkResult", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.InstallDownloadTask$doAction$1$1");
        x44.i0 i0Var = this.f451833a;
        if (z17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$makeReturnOK", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.InstallDownloadTask");
            org.json.JSONObject l17 = i0Var.l();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$makeReturnOK", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.InstallDownloadTask");
            i0Var.b(l17);
        } else {
            com.tencent.mars.xlog.Log.w("SnsAdJs.InstallDownload", "install failed, check permission!!");
            i0Var.b(i0Var.g("install failed, check permission!!"));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onInstallApkResult", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.InstallDownloadTask$doAction$1$1");
    }
}
