package com.tencent.mm.plugin.setting.ui.setting_new.settings.friend_privacy;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting_new/settings/friend_privacy/SettingSwitchNeedVerify;", "Ls24/g;", "Landroidx/appcompat/app/AppCompatActivity;", com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class SettingSwitchNeedVerify extends s24.g {

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f161911h;

    /* renamed from: i, reason: collision with root package name */
    public int f161912i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f161913m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingSwitchNeedVerify(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f161911h = new java.util.HashMap();
        this.f161912i = c01.z1.p();
        int p17 = c01.z1.p();
        this.f161912i = p17;
        this.f161913m = (p17 & 32) != 0;
    }

    @Override // a24.i
    public java.lang.String a7() {
        return "SettingGroup_Main_FriendPrivacy_NeedVerify";
    }

    @Override // a24.i
    public a24.u b7() {
        return new a24.u(com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupFriendPrivacy.class, null);
    }

    @Override // s24.g, a24.a, a24.i
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // a24.i
    public int d7() {
        return com.tencent.mm.R.string.itu;
    }

    @Override // a24.i
    public java.lang.Class e7() {
        return com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupFriendPrivacy.class;
    }

    @Override // a24.i
    public int m7() {
        return 2;
    }

    @Override // s24.g
    /* renamed from: x7 */
    public al5.c2 getF161960h() {
        return new g24.a(this);
    }

    @Override // s24.g
    /* renamed from: y7, reason: from getter */
    public boolean getF161916m() {
        return this.f161913m;
    }
}
