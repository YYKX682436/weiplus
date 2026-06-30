package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes.dex */
public final class g3 extends vh4.m1 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.SettingsSysTeenModeIntro f173010e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(com.tencent.mm.plugin.teenmode.ui.SettingsSysTeenModeIntro settingsSysTeenModeIntro) {
        super(1, null);
        this.f173010e = settingsSysTeenModeIntro;
    }

    @Override // vh4.m1
    public void a(android.view.View widget) {
        kotlin.jvm.internal.o.g(widget, "widget");
        int i17 = com.tencent.mm.plugin.teenmode.ui.SettingsSysTeenModeIntro.f172832s;
        com.tencent.mm.plugin.teenmode.ui.SettingsSysTeenModeIntro settingsSysTeenModeIntro = this.f173010e;
        settingsSysTeenModeIntro.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", "https://support.weixin.qq.com/cgi-bin/mmsupportacctnodeweb-bin/pages/2n2Z0Mw68qnx3PT9");
        j45.l.j(settingsSysTeenModeIntro, "webview", ".ui.tools.WebViewUI", intent, null);
    }
}
