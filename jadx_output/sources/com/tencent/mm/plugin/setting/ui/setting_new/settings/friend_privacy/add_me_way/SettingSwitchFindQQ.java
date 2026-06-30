package com.tencent.mm.plugin.setting.ui.setting_new.settings.friend_privacy.add_me_way;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting_new/settings/friend_privacy/add_me_way/SettingSwitchFindQQ;", "Ls24/g;", "Landroidx/appcompat/app/AppCompatActivity;", com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class SettingSwitchFindQQ extends s24.g {

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f161933h;

    /* renamed from: i, reason: collision with root package name */
    public int f161934i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingSwitchFindQQ(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f161933h = new java.util.HashMap();
        this.f161934i = c01.z1.p();
        c01.z1.j();
        c01.z1.o();
    }

    public static final void A7(com.tencent.mm.plugin.setting.ui.setting_new.settings.friend_privacy.add_me_way.SettingSwitchFindQQ settingSwitchFindQQ, boolean z17, int i17, int i18) {
        if (z17) {
            settingSwitchFindQQ.f161934i = i17 | settingSwitchFindQQ.f161934i;
        } else {
            settingSwitchFindQQ.f161934i = (~i17) & settingSwitchFindQQ.f161934i;
        }
        settingSwitchFindQQ.f161933h.put(java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(z17 ? 1 : 2));
    }

    @Override // a24.i
    public java.lang.String a7() {
        return "SettingGroup_Main_FriendPrivacy_AddMeWay_FindByQQ";
    }

    @Override // a24.i
    public a24.u b7() {
        return new a24.u(com.tencent.mm.plugin.setting.ui.setting_new.settings.friend_privacy.SettingGroupAddMeWay.class, com.tencent.mm.plugin.setting.ui.setting_new.settings.friend_privacy.add_me_way.SettingSwitchFindMobile.class);
    }

    @Override // s24.g, a24.a, a24.i
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // a24.i
    public int d7() {
        return com.tencent.mm.R.string.p7z;
    }

    @Override // a24.i
    public java.lang.Class e7() {
        return com.tencent.mm.plugin.setting.ui.setting_new.settings.friend_privacy.SettingGroupAddMeWay.class;
    }

    @Override // a24.i
    /* renamed from: m7 */
    public int getF161972p() {
        return 3;
    }

    @Override // a24.i
    /* renamed from: q7 */
    public boolean getF161948p() {
        java.lang.Integer num = (java.lang.Integer) gm0.j1.u().c().l(9, null);
        if (com.tencent.mm.sdk.platformtools.f9.MeSetPrivacyAddByQQ.h() || num == null || num.intValue() == 0) {
            return false;
        }
        return (c01.e2.a0() && ((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode()) ? false : true;
    }

    @Override // s24.g
    /* renamed from: x7 */
    public al5.c2 getF161961h() {
        return new h24.g(this);
    }

    @Override // s24.g
    /* renamed from: y7 */
    public boolean getF161947n() {
        if ((c01.z1.p() & 8) != 0) {
            return !((c01.z1.p() & 16) != 0);
        }
        return true;
    }
}
