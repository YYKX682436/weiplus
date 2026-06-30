package n24;

/* loaded from: classes.dex */
public final class b implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting_new.settings.other.sns.SettingSwitchOnlyNoticeInteract f334316a;

    public b(com.tencent.mm.plugin.setting.ui.setting_new.settings.other.sns.SettingSwitchOnlyNoticeInteract settingSwitchOnlyNoticeInteract) {
        this.f334316a = settingSwitchOnlyNoticeInteract;
    }

    @Override // al5.c2
    public final void onStatusChange(boolean z17) {
        com.tencent.mm.plugin.setting.ui.setting_new.settings.other.sns.SettingSwitchOnlyNoticeInteract settingSwitchOnlyNoticeInteract = this.f334316a;
        settingSwitchOnlyNoticeInteract.f161975i = z17;
        settingSwitchOnlyNoticeInteract.t7(settingSwitchOnlyNoticeInteract.getActivity().getIntent());
        if (z17) {
            settingSwitchOnlyNoticeInteract.f161974h |= 274877906944L;
        } else {
            settingSwitchOnlyNoticeInteract.f161974h &= -274877906945L;
        }
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_EXT_STATUS2_LONG_SYNC, java.lang.Long.valueOf(settingSwitchOnlyNoticeInteract.f161974h));
        bn0.g.f22779a.g("USERINFO_EXT_STATUS2_LONG_SYNC", settingSwitchOnlyNoticeInteract.f161974h);
        int i17 = z17 ? 1 : 2;
        r45.p53 p53Var = new r45.p53();
        p53Var.f382761d = 98;
        p53Var.f382762e = i17;
        ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var));
    }
}
