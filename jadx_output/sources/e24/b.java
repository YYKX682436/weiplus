package e24;

/* loaded from: classes.dex */
public final class b implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting_new.settings.chatting.SettingSwitchChatSaveViewed f247009a;

    public b(com.tencent.mm.plugin.setting.ui.setting_new.settings.chatting.SettingSwitchChatSaveViewed settingSwitchChatSaveViewed) {
        this.f247009a = settingSwitchChatSaveViewed;
    }

    @Override // al5.c2
    public final void onStatusChange(boolean z17) {
        com.tencent.mm.plugin.setting.ui.setting_new.settings.chatting.SettingSwitchChatSaveViewed settingSwitchChatSaveViewed = this.f247009a;
        settingSwitchChatSaveViewed.f161904i = z17;
        settingSwitchChatSaveViewed.t7(settingSwitchChatSaveViewed.getActivity().getIntent());
        boolean z18 = !z17;
        settingSwitchChatSaveViewed.getClass();
        long i17 = c01.z1.i();
        long j17 = z18 ? i17 & (-137438953473L) : i17 | 137438953472L;
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_EXT_STATUS2_LONG_SYNC, java.lang.Long.valueOf(j17));
        bn0.g.f22779a.g("USERINFO_EXT_STATUS2_LONG_SYNC", j17);
        int i18 = z18 ? 2 : 1;
        r45.p53 p53Var = new r45.p53();
        p53Var.f382761d = 97;
        p53Var.f382762e = i18;
        ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var));
        ((g90.s) ((h90.v) i95.n0.c(h90.v.class))).qj(!z17, settingSwitchChatSaveViewed.f161903h == 1);
    }
}
