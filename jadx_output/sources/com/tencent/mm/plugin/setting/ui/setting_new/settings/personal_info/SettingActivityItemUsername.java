package com.tencent.mm.plugin.setting.ui.setting_new.settings.personal_info;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting_new/settings/personal_info/SettingActivityItemUsername;", "Ls24/a;", "Landroidx/appcompat/app/AppCompatActivity;", com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class SettingActivityItemUsername extends s24.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingActivityItemUsername(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // s24.a
    public java.lang.String L7() {
        return ".ui.setting.SelectSexUI";
    }

    @Override // s24.a
    public java.lang.String M7() {
        return "setting";
    }

    @Override // a24.i
    public java.lang.String a7() {
        return "SettingGroup_Main_PersonalInfo_Username";
    }

    @Override // a24.i
    public a24.u b7() {
        return new a24.u(com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupPersonalInfo.class, com.tencent.mm.plugin.setting.ui.setting_new.settings.personal_info.SettingActivityItemMobile.class);
    }

    @Override // s24.a, s24.f, a24.i
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // a24.i
    public int d7() {
        return com.tencent.mm.R.string.p8q;
    }

    @Override // a24.i
    public java.lang.Class e7() {
        return com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupPersonalInfo.class;
    }

    @Override // a24.i
    /* renamed from: m7 */
    public int getF161972p() {
        return 2;
    }

    @Override // a24.i
    /* renamed from: n7 */
    public java.lang.String getF161965p() {
        java.lang.String c17 = c01.z1.c();
        java.lang.String r17 = c01.z1.r();
        return com.tencent.mm.sdk.platformtools.t8.K0(c17) ? com.tencent.mm.storage.z3.y3(r17) ? getString(com.tencent.mm.R.string.ium) : r17 : c17;
    }

    @Override // s24.a, a24.i
    public void r7(android.content.Context context, android.view.View itemView, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(itemView, "itemView");
        t7(getActivity().getIntent());
        if (com.tencent.mm.sdk.platformtools.t8.K0(c01.z1.c()) && com.tencent.mm.storage.z3.P3(c01.z1.r()) && ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("EnableModAlias", 0) == 0) {
            android.content.Intent intent = new android.content.Intent();
            intent.setClass(context, com.tencent.mm.plugin.setting.ui.setting.SettingsCreateAliasUI.class);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting_new/settings/personal_info/SettingActivityItemUsername", "onClick", "(Landroid/content/Context;Landroid/view/View;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/setting/ui/setting_new/settings/personal_info/SettingActivityItemUsername", "onClick", "(Landroid/content/Context;Landroid/view/View;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        if (((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("EnableModAlias", 0) != 0) {
            android.content.Intent intent2 = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.setting.ui.setting.SettingsAliasUI.class);
            intent2.putExtra("WizardRootClass", com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalInfoUI.class.getCanonicalName());
            com.tencent.mm.ui.MMWizardActivity.X6(context, intent2);
        }
    }
}
