package j24;

/* loaded from: classes.dex */
public final class b implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting_new.settings.more.SettingSwitchAutoSaveVideo f297307a;

    public b(com.tencent.mm.plugin.setting.ui.setting_new.settings.more.SettingSwitchAutoSaveVideo settingSwitchAutoSaveVideo) {
        this.f297307a = settingSwitchAutoSaveVideo;
    }

    @Override // al5.c2
    public final void onStatusChange(boolean z17) {
        com.tencent.mm.plugin.setting.ui.setting_new.settings.more.SettingSwitchAutoSaveVideo settingSwitchAutoSaveVideo = this.f297307a;
        settingSwitchAutoSaveVideo.f161951h = z17;
        settingSwitchAutoSaveVideo.t7(settingSwitchAutoSaveVideo.getActivity().getIntent());
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WEIXIN_CAMERASAVEVIDEO_STATE_BOOLEAN, java.lang.Boolean.valueOf(z17));
    }
}
