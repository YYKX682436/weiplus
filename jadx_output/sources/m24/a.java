package m24;

/* loaded from: classes.dex */
public final class a implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting_new.settings.notify.scene_notification.SettingSwitchSceneShake f323090a;

    public a(com.tencent.mm.plugin.setting.ui.setting_new.settings.notify.scene_notification.SettingSwitchSceneShake settingSwitchSceneShake) {
        this.f323090a = settingSwitchSceneShake;
    }

    @Override // al5.c2
    public final void onStatusChange(boolean z17) {
        com.tencent.mm.plugin.setting.ui.setting_new.settings.notify.scene_notification.SettingSwitchSceneShake settingSwitchSceneShake = this.f323090a;
        settingSwitchSceneShake.f161963h = z17;
        settingSwitchSceneShake.t7(settingSwitchSceneShake.getActivity().getIntent());
        ip.l.l(settingSwitchSceneShake.f161963h);
    }
}
