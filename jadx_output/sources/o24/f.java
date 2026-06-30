package o24;

/* loaded from: classes.dex */
public final class f implements zy2.nb {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting_new.settings.personal_info.SettingActivityItemFinderRecentLike f342459a;

    public f(com.tencent.mm.plugin.setting.ui.setting_new.settings.personal_info.SettingActivityItemFinderRecentLike settingActivityItemFinderRecentLike) {
        this.f342459a = settingActivityItemFinderRecentLike;
    }

    @Override // zy2.nb
    public void a(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        kotlin.jvm.internal.o.d(bool);
        boolean booleanValue = bool.booleanValue();
        com.tencent.mm.plugin.setting.ui.setting_new.settings.personal_info.SettingActivityItemFinderRecentLike settingActivityItemFinderRecentLike = this.f342459a;
        settingActivityItemFinderRecentLike.getClass();
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        boolean z17 = false;
        if ((!((gm0.j1.u().c().t(com.tencent.mm.storage.u3.USERINFO_USER_INFO_FINDER_SETTING_LONG_SYNC, 0L) & 1) != 0)) && booleanValue) {
            z17 = true;
        }
        settingActivityItemFinderRecentLike.f161979p = java.lang.Boolean.valueOf(z17);
        settingActivityItemFinderRecentLike.w7();
    }
}
