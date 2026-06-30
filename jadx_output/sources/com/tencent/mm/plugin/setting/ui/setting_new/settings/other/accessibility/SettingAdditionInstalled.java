package com.tencent.mm.plugin.setting.ui.setting_new.settings.other.accessibility;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting_new/settings/other/accessibility/SettingAdditionInstalled;", "Ls24/f;", "Landroidx/appcompat/app/AppCompatActivity;", com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class SettingAdditionInstalled extends s24.f {

    /* renamed from: p, reason: collision with root package name */
    public final int f161971p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingAdditionInstalled(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f161971p = 3;
    }

    @Override // a24.i
    public java.lang.String a7() {
        return "SettingGroup_Main_Other_Accessibility_Installed";
    }

    @Override // a24.i
    public a24.u b7() {
        return new a24.u(com.tencent.mm.plugin.setting.ui.setting_new.settings.other.SettingGroupAccessibilityItem.class, null);
    }

    @Override // s24.f, a24.i
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // a24.i
    public int d7() {
        return -1;
    }

    @Override // a24.i
    public java.lang.Class e7() {
        return com.tencent.mm.plugin.setting.ui.setting_new.settings.other.SettingGroupAccessibilityItem.class;
    }

    @Override // a24.i
    /* renamed from: m7, reason: from getter */
    public int getF161971p() {
        return this.f161971p;
    }

    @Override // a24.i
    /* renamed from: p7 */
    public java.lang.Integer getF161949q() {
        return java.lang.Integer.valueOf(com.tencent.mm.R.string.iwp);
    }

    @Override // a24.i
    /* renamed from: q7 */
    public boolean getF161948p() {
        return new com.tencent.mm.plugin.setting.ui.setting_new.settings.other.accessibility.SettingActivityItemBusinessCollection(getActivity()).getF161948p() || new com.tencent.mm.plugin.setting.ui.setting_new.settings.other.accessibility.SettingActivityItemFaceBook(getActivity()).getF161948p() || new com.tencent.mm.plugin.setting.ui.setting_new.settings.other.accessibility.SettingActivityItemHKPay(getActivity()).getF161948p() || new com.tencent.mm.plugin.setting.ui.setting_new.settings.other.accessibility.SettingActivityItemMiniShop(getActivity()).getF161948p() || new com.tencent.mm.plugin.setting.ui.setting_new.settings.other.accessibility.SettingActivityItemMiniShop(getActivity()).getF161948p() || new com.tencent.mm.plugin.setting.ui.setting_new.settings.other.accessibility.SettingActivityItemPayCollection(getActivity()).getF161948p() || new com.tencent.mm.plugin.setting.ui.setting_new.settings.other.accessibility.SettingActivityItemPay(getActivity()).getF161948p() || new com.tencent.mm.plugin.setting.ui.setting_new.settings.other.accessibility.SettingActivityItemPluginLinkedIn(getActivity()).getF161948p() || new com.tencent.mm.plugin.setting.ui.setting_new.settings.other.accessibility.SettingActivityItemQQMail(getActivity()).getF161948p() || new com.tencent.mm.plugin.setting.ui.setting_new.settings.other.accessibility.SettingActivityItemQQAssistant(getActivity()).getF161948p() || new com.tencent.mm.plugin.setting.ui.setting_new.settings.other.accessibility.SettingActivityItemReaderAppNews(getActivity()).getF161948p() || new com.tencent.mm.plugin.setting.ui.setting_new.settings.other.accessibility.SettingActivityItemSport(getActivity()).getF161948p() || new com.tencent.mm.plugin.setting.ui.setting_new.settings.other.accessibility.SettingActivityItemWxGame(getActivity()).getF161948p();
    }

    @Override // a24.i
    public void r7(android.content.Context context, android.view.View itemView, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(itemView, "itemView");
    }

    @Override // s24.f
    public java.lang.Integer y7() {
        return java.lang.Integer.valueOf(com.tencent.mm.R.raw.setting_plugin_install);
    }

    @Override // s24.f
    public boolean z7() {
        return false;
    }
}
