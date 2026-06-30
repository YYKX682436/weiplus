package com.tencent.mm.plugin.setting.ui.setting_new.settings.friend_privacy;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting_new/settings/friend_privacy/SettingActivityItemBlackList;", "Ls24/a;", "Landroidx/appcompat/app/AppCompatActivity;", com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class SettingActivityItemBlackList extends s24.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingActivityItemBlackList(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // s24.f
    public void G7(android.content.Context context, android.content.Intent intent) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(intent, "intent");
        super.G7(context, intent);
        intent.putExtra("filter_type", c01.t7.a(getString(com.tencent.mm.R.string.fsb)).a());
        intent.putExtra("titile", getString(com.tencent.mm.R.string.ix6));
        intent.putExtra("list_attr", 32768);
        ((com.tencent.mm.app.y7) f14.g.b()).A(context, intent);
    }

    @Override // s24.a
    public java.lang.String L7() {
        return "com.tencent.mm.libmmui.R.string.group_blacklist";
    }

    @Override // s24.a
    public java.lang.String M7() {
        return "setting";
    }

    @Override // a24.i
    public java.lang.Integer Y6() {
        return 0;
    }

    @Override // a24.i
    public java.lang.String a7() {
        return "SettingGroup_Main_FriendPrivacy_BlackList";
    }

    @Override // a24.i
    public a24.u b7() {
        return new a24.u(com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupFriendPrivacy.class, com.tencent.mm.plugin.setting.ui.setting_new.settings.friend_privacy.SettingActivityItemPrivacySport.class);
    }

    @Override // s24.a, s24.f, a24.i
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // a24.i
    public int d7() {
        return com.tencent.mm.R.string.f493830p92;
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
}
