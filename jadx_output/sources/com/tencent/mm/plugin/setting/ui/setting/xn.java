package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes.dex */
public class xn implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsUI f161765a;

    public xn(com.tencent.mm.plugin.setting.ui.setting.SettingsUI settingsUI) {
        this.f161765a = settingsUI;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsUI", "OpenLiteApp fail");
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_settings_personal_privacy_list_url, "https://support.weixin.qq.com/cgi-bin/mmsupport-bin/newreadtemplate?t=datalist/personal", true);
        if (com.tencent.mm.sdk.platformtools.t8.K0(Zi)) {
            return;
        }
        com.tencent.mm.plugin.report.service.b1.f158148a.c();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("showShare", false);
        intent.putExtra("rawUrl", Zi);
        intent.putExtra("show_feedback", false);
        intent.putExtra("show_bottom", false);
        intent.putExtra("needRedirect", false);
        intent.putExtra("neverGetA8Key", false);
        j45.l.j(this.f161765a.getContext(), "webview", ".ui.tools.WebViewUI", intent, null);
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsUI", "OpenLiteApp success");
    }
}
