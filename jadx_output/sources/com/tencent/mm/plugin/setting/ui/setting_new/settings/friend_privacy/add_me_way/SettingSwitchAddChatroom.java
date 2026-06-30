package com.tencent.mm.plugin.setting.ui.setting_new.settings.friend_privacy.add_me_way;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting_new/settings/friend_privacy/add_me_way/SettingSwitchAddChatroom;", "Ls24/g;", "Landroidx/appcompat/app/AppCompatActivity;", com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class SettingSwitchAddChatroom extends s24.g {

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f161918h;

    /* renamed from: i, reason: collision with root package name */
    public long f161919i;

    /* renamed from: m, reason: collision with root package name */
    public final int f161920m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingSwitchAddChatroom(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f161918h = new java.util.HashMap();
        c01.z1.p();
        this.f161919i = c01.z1.j();
        c01.z1.o();
        this.f161920m = com.tencent.mm.R.string.f493032iq4;
    }

    @Override // a24.i
    public java.lang.Integer Y6() {
        return java.lang.Integer.valueOf(this.f161920m);
    }

    @Override // a24.i
    public java.lang.String a7() {
        return "SettingGroup_Main_FriendPrivacy_AddMeWay_AddByChatroom";
    }

    @Override // a24.i
    public a24.u b7() {
        return new a24.u(com.tencent.mm.plugin.setting.ui.setting_new.settings.friend_privacy.SettingGroupAddMeWay.class, com.tencent.mm.plugin.setting.ui.setting_new.settings.friend_privacy.add_me_way.SettingSwitchFindGoogle.class);
    }

    @Override // s24.g, a24.a, a24.i
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // a24.i
    public int d7() {
        return com.tencent.mm.R.string.p7l;
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

    @Override // s24.g
    /* renamed from: x7 */
    public al5.c2 getF161961h() {
        return new h24.a(this);
    }

    @Override // s24.g
    /* renamed from: y7 */
    public boolean getF161990i() {
        return (c01.z1.j() & 1) == 0;
    }
}
