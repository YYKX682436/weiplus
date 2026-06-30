package com.tencent.mm.plugin.setting.ui.setting_new.settings.friend_privacy;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting_new/settings/friend_privacy/SettingSwitchRecommendFriend;", "Ls24/g;", "Landroidx/appcompat/app/AppCompatActivity;", com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class SettingSwitchRecommendFriend extends s24.g {

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f161914h;

    /* renamed from: i, reason: collision with root package name */
    public int f161915i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f161916m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f161917n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingSwitchRecommendFriend(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f161914h = new java.util.HashMap();
        this.f161915i = c01.z1.p();
        int p17 = c01.z1.p();
        this.f161915i = p17;
        this.f161916m = !((p17 & 256) != 0);
        this.f161917n = (java.lang.String) gm0.j1.u().c().l(6, null);
    }

    @Override // a24.i
    public java.lang.String a7() {
        return "SettingGroup_Main_FriendPrivacy_RecommendFriend";
    }

    @Override // a24.i
    public a24.u b7() {
        return new a24.u(com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupFriendPrivacy.class, com.tencent.mm.plugin.setting.ui.setting_new.settings.friend_privacy.SettingGroupAddMeWay.class);
    }

    @Override // s24.g, a24.a, a24.i
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // a24.i
    public int d7() {
        return com.tencent.mm.R.string.p8x;
    }

    @Override // a24.i
    public java.lang.Class e7() {
        return com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupFriendPrivacy.class;
    }

    @Override // a24.i
    /* renamed from: m7 */
    public int getF161972p() {
        return 2;
    }

    @Override // a24.i
    /* renamed from: p7 */
    public java.lang.Integer getF161949q() {
        return java.lang.Integer.valueOf(com.tencent.mm.R.string.ixa);
    }

    @Override // a24.i
    /* renamed from: q7 */
    public boolean getF161948p() {
        java.lang.String str = this.f161917n;
        if (str != null) {
            return str.length() > 0;
        }
        return false;
    }

    @Override // s24.g
    /* renamed from: x7 */
    public al5.c2 getF161961h() {
        return new g24.b(this);
    }

    @Override // s24.g
    /* renamed from: y7, reason: from getter */
    public boolean getF161950h() {
        return this.f161916m;
    }
}
