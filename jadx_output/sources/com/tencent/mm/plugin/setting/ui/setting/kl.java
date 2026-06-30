package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes8.dex */
public class kl implements tj5.w {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsSearchAuthUI f161243d;

    public kl(com.tencent.mm.plugin.setting.ui.setting.SettingsSearchAuthUI settingsSearchAuthUI) {
        this.f161243d = settingsSearchAuthUI;
    }

    @Override // tj5.w
    public void onClickBackBtn(android.view.View view) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsSearchAuthUI", "click search back");
        this.f161243d.finish();
    }
}
