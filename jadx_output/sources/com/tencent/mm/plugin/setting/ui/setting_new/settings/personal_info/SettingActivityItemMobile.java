package com.tencent.mm.plugin.setting.ui.setting_new.settings.personal_info;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting_new/settings/personal_info/SettingActivityItemMobile;", "Ls24/a;", "Landroidx/appcompat/app/AppCompatActivity;", com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class SettingActivityItemMobile extends s24.a {

    /* renamed from: p, reason: collision with root package name */
    public final int f161981p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingActivityItemMobile(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f161981p = 3;
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
        return "SettingGroup_Main_PersonalInfo_Mobile";
    }

    @Override // a24.i
    public a24.u b7() {
        return new a24.u(com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupPersonalInfo.class, com.tencent.mm.plugin.setting.ui.setting_new.settings.personal_info.SettingActivityItemDistrict.class);
    }

    @Override // s24.a, s24.f, a24.i
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // a24.i
    public int d7() {
        return com.tencent.mm.R.string.p8l;
    }

    @Override // a24.i
    public java.lang.Class e7() {
        return com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupPersonalInfo.class;
    }

    @Override // a24.i
    /* renamed from: h7, reason: from getter */
    public int getF161978p() {
        return this.f161981p;
    }

    @Override // a24.i
    /* renamed from: m7 */
    public int getF161972p() {
        return 2;
    }

    @Override // a24.i
    /* renamed from: n7 */
    public java.lang.String getF161965p() {
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(6, null);
        return (str == null || str.length() <= 0) ? getString(com.tencent.mm.R.string.ipy) : com.tencent.mm.ui.fg.a(str);
    }

    @Override // s24.a, a24.i
    public void r7(android.content.Context context, android.view.View itemView, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(itemView, "itemView");
        t7(getActivity().getIntent());
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI.class);
        intent.putExtra("key_upload_scene", 4);
        intent.putExtra("key_resource_ui", true);
        com.tencent.mm.ui.MMWizardActivity.X6(context, intent);
    }
}
