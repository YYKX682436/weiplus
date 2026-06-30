package m24;

/* loaded from: classes.dex */
public final class b implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting_new.settings.notify.scene_notification.SettingSwitchSceneSound f323091a;

    public b(com.tencent.mm.plugin.setting.ui.setting_new.settings.notify.scene_notification.SettingSwitchSceneSound settingSwitchSceneSound) {
        this.f323091a = settingSwitchSceneSound;
    }

    @Override // al5.c2
    public final void onStatusChange(boolean z17) {
        com.tencent.mm.plugin.setting.ui.setting_new.settings.notify.scene_notification.SettingSwitchSceneSound settingSwitchSceneSound = this.f323091a;
        settingSwitchSceneSound.f161964h = z17;
        settingSwitchSceneSound.t7(settingSwitchSceneSound.getActivity().getIntent());
        ip.l.p(settingSwitchSceneSound.f161964h);
    }
}
