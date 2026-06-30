package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes.dex */
public class u4 implements h45.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMain f173157a;

    public u4(com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMain settingsTeenModeMain) {
        this.f173157a = settingsTeenModeMain;
    }

    @Override // h45.i
    public void onKindaBusinessCallback(android.content.Intent intent) {
        if (intent.getStringExtra("event").equals("teenagerPayDetailUIPage_Back")) {
            int i17 = com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMain.I;
            this.f173157a.V6();
        }
    }
}
