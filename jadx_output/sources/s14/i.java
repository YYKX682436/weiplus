package s14;

/* loaded from: classes.dex */
public final class i implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.permission.SettingVoiceAssistantPermissionUI f402150a;

    public i(com.tencent.mm.plugin.setting.ui.setting.permission.SettingVoiceAssistantPermissionUI settingVoiceAssistantPermissionUI) {
        this.f402150a = settingVoiceAssistantPermissionUI;
    }

    @Override // al5.c2
    public final void onStatusChange(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoiceAssistantPermission", "onSwitchChanged: user toggled switch to " + z17);
        int i17 = com.tencent.mm.plugin.setting.ui.setting.permission.SettingVoiceAssistantPermissionUI.f161440f;
        this.f402150a.getClass();
        int i18 = z17 ? 1 : 2;
        com.tencent.mars.xlog.Log.i("MicroMsg.VoiceAssistantPermission", "doSetVoiceAssistantEnable: enable = " + z17 + ", writing value = " + i18 + " to ConfigStorage");
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_OVC_VOICE_ASSISTANT_SWITCH_INT_SYNC, java.lang.Integer.valueOf(i18));
    }
}
