package e24;

/* loaded from: classes.dex */
public final class e implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting_new.settings.chatting.SettingSwitchVoicePlayMode f247012a;

    public e(com.tencent.mm.plugin.setting.ui.setting_new.settings.chatting.SettingSwitchVoicePlayMode settingSwitchVoicePlayMode) {
        this.f247012a = settingSwitchVoicePlayMode;
    }

    @Override // al5.c2
    public final void onStatusChange(boolean z17) {
        com.tencent.mm.plugin.setting.ui.setting_new.settings.chatting.SettingSwitchVoicePlayMode settingSwitchVoicePlayMode = this.f247012a;
        settingSwitchVoicePlayMode.f161907h = z17;
        settingSwitchVoicePlayMode.t7(settingSwitchVoicePlayMode.getActivity().getIntent());
        gm0.j1.u().c().w(26, java.lang.Boolean.valueOf(z17));
    }
}
