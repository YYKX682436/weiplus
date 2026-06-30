package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes.dex */
public class o3 extends vh4.m1 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeIntro f173095e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeIntro settingsTeenModeIntro, int i17, r35.m3 m3Var) {
        super(i17, m3Var);
        this.f173095e = settingsTeenModeIntro;
    }

    @Override // vh4.m1
    public void a(android.view.View view) {
        int i17 = com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeIntro.f172845h;
        com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeIntro settingsTeenModeIntro = this.f173095e;
        settingsTeenModeIntro.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", "https://support.weixin.qq.com/cgi-bin/mmsupportacctnodeweb-bin/pages/y1kiXZeyvPMAFbtW");
        j45.l.j(settingsTeenModeIntro, "webview", ".ui.tools.WebViewUI", intent, null);
    }
}
