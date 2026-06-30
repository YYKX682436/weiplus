package j24;

/* loaded from: classes.dex */
public final class a implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting_new.settings.more.SettingSwitchAutoSaveImage f297306a;

    public a(com.tencent.mm.plugin.setting.ui.setting_new.settings.more.SettingSwitchAutoSaveImage settingSwitchAutoSaveImage) {
        this.f297306a = settingSwitchAutoSaveImage;
    }

    @Override // al5.c2
    public final void onStatusChange(boolean z17) {
        com.tencent.mm.plugin.setting.ui.setting_new.settings.more.SettingSwitchAutoSaveImage settingSwitchAutoSaveImage = this.f297306a;
        settingSwitchAutoSaveImage.f161950h = z17;
        settingSwitchAutoSaveImage.t7(settingSwitchAutoSaveImage.getActivity().getIntent());
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WEIXIN_CAMERASAVEIMAGE_STATE_BOOLEAN, java.lang.Boolean.valueOf(z17));
    }
}
