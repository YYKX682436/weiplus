package q24;

/* loaded from: classes.dex */
public final class a implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting_new.settings.video.SettingGroupUseMobileData f359821a;

    public a(com.tencent.mm.plugin.setting.ui.setting_new.settings.video.SettingGroupUseMobileData settingGroupUseMobileData) {
        this.f359821a = settingGroupUseMobileData;
    }

    @Override // al5.c2
    public final void onStatusChange(boolean z17) {
        com.tencent.mm.plugin.setting.ui.setting_new.settings.video.SettingGroupUseMobileData settingGroupUseMobileData = this.f359821a;
        settingGroupUseMobileData.f161990i = z17;
        settingGroupUseMobileData.t7(settingGroupUseMobileData.getActivity().getIntent());
        if (z17) {
            settingGroupUseMobileData.f161989h &= -137438953473L;
        } else {
            settingGroupUseMobileData.f161989h |= 137438953472L;
        }
        int i17 = z17 ? 1 : 2;
        r45.p53 p53Var = new r45.p53();
        p53Var.f382761d = 58;
        p53Var.f382762e = i17;
        ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var));
        gm0.j1.u().c().w(147457, java.lang.Long.valueOf(settingGroupUseMobileData.f161989h));
    }
}
