package com.tencent.mm.plugin.setting.ui.setting_new.settings.friend_privacy.privacy_sns;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting_new/settings/friend_privacy/privacy_sns/SettingActivityItemEditTimelineGroup;", "Ls24/a;", "Landroidx/appcompat/app/AppCompatActivity;", com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SettingActivityItemEditTimelineGroup extends s24.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingActivityItemEditTimelineGroup(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // s24.a
    public java.lang.String L7() {
        return ".ui.SnsTagPartlyUI";
    }

    @Override // s24.a
    public java.lang.String M7() {
        return "sns";
    }

    @Override // a24.i
    public java.lang.String a7() {
        return "SettingGroup_Main_FriendPrivacy_PrivacySns_EditGroup";
    }

    @Override // a24.i
    public a24.u b7() {
        return new a24.u(com.tencent.mm.plugin.setting.ui.setting_new.settings.friend_privacy.SettingActivityItemPrivacySns.class, com.tencent.mm.plugin.setting.ui.setting_new.settings.friend_privacy.privacy_sns.SettingActivityItemTimelineBlackPermiss.class);
    }

    @Override // s24.a, s24.f, a24.i
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // a24.i
    public int d7() {
        return com.tencent.mm.R.string.nnj;
    }

    @Override // a24.i
    public java.lang.Class e7() {
        return com.tencent.mm.plugin.setting.ui.setting_new.settings.friend_privacy.SettingActivityItemPrivacySns.class;
    }

    @Override // a24.i
    /* renamed from: m7 */
    public int getF161972p() {
        return 3;
    }

    @Override // a24.i
    /* renamed from: q7 */
    public boolean getF161948p() {
        java.lang.Object l17 = gm0.j1.u().c().l(335873, java.lang.Boolean.TRUE);
        kotlin.jvm.internal.o.e(l17, "null cannot be cast to non-null type kotlin.Boolean");
        return ((java.lang.Boolean) l17).booleanValue() && ((com.tencent.mm.plugin.sns.storage.r2) p94.w0.f()).W0();
    }
}
