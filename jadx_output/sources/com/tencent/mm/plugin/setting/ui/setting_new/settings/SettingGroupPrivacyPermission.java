package com.tencent.mm.plugin.setting.ui.setting_new.settings;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting_new/settings/SettingGroupPrivacyPermission;", "Ls24/e;", "Landroidx/appcompat/app/AppCompatActivity;", com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class SettingGroupPrivacyPermission extends s24.e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingGroupPrivacyPermission(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // s24.f
    public void G7(android.content.Context context, android.content.Intent intent) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(intent, "intent");
        super.G7(context, intent);
        pf5.j0.a(intent, com.tencent.mm.plugin.setting.ui.setting_new.uic.g.class);
    }

    @Override // a24.i
    public java.lang.String a7() {
        return "SettingGroup_Main_PrivacyPermission";
    }

    @Override // a24.i
    public a24.u b7() {
        return new a24.u(com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupMain.class, com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupAccountInfo.class);
    }

    @Override // s24.e, s24.f, a24.i
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // a24.i
    public int d7() {
        return com.tencent.mm.R.string.f493076ix0;
    }

    @Override // a24.i
    public java.lang.Class e7() {
        return com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupMain.class;
    }

    @Override // a24.i
    public int m7() {
        return 1;
    }

    @Override // a24.i
    public boolean q7() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_settings_personal_privacy_switcher, 1) != 0;
    }
}
