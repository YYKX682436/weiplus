package e24;

/* loaded from: classes.dex */
public final class a implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting_new.settings.chatting.SettingSwitchChatAutoSync f247008a;

    public a(com.tencent.mm.plugin.setting.ui.setting_new.settings.chatting.SettingSwitchChatAutoSync settingSwitchChatAutoSync) {
        this.f247008a = settingSwitchChatAutoSync;
    }

    @Override // al5.c2
    public final void onStatusChange(boolean z17) {
        com.tencent.mm.plugin.setting.ui.setting_new.settings.chatting.SettingSwitchChatAutoSync settingSwitchChatAutoSync = this.f247008a;
        settingSwitchChatAutoSync.f161902h = z17;
        settingSwitchChatAutoSync.t7(settingSwitchChatAutoSync.getActivity().getIntent());
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WEIXIN_MUL_TERMINAL_AUTOSYNC_BOOLEAN, java.lang.Boolean.valueOf(z17));
    }
}
