package n24;

/* loaded from: classes.dex */
public final class a implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting_new.settings.other.sns.SettingSwitchAutoPlayVideo f334315a;

    public a(com.tencent.mm.plugin.setting.ui.setting_new.settings.other.sns.SettingSwitchAutoPlayVideo settingSwitchAutoPlayVideo) {
        this.f334315a = settingSwitchAutoPlayVideo;
    }

    @Override // al5.c2
    public final void onStatusChange(boolean z17) {
        com.tencent.mm.plugin.setting.ui.setting_new.settings.other.sns.SettingSwitchAutoPlayVideo settingSwitchAutoPlayVideo = this.f334315a;
        settingSwitchAutoPlayVideo.f161973h = z17;
        settingSwitchAutoPlayVideo.t7(settingSwitchAutoPlayVideo.getActivity().getIntent());
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WEIXIN_SNSAUTOPLAY_AUTOSYNC_BOOLEAN, java.lang.Boolean.valueOf(z17));
    }
}
