package p24;

/* loaded from: classes.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting_new.settings.privacy_permission.SettingAdditionBottomPrivacy f351433d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f351434e;

    public d(com.tencent.mm.plugin.setting.ui.setting_new.settings.privacy_permission.SettingAdditionBottomPrivacy settingAdditionBottomPrivacy, kotlin.jvm.internal.h0 h0Var) {
        this.f351433d = settingAdditionBottomPrivacy;
        this.f351434e = h0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting_new/settings/privacy_permission/SettingAdditionBottomPrivacy$onBindView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.setting.ui.setting_new.settings.privacy_permission.SettingAdditionBottomPrivacy settingAdditionBottomPrivacy = this.f351433d;
        java.lang.String string = settingAdditionBottomPrivacy.getContext().getString(com.tencent.mm.R.string.gbc, com.tencent.mm.sdk.platformtools.m2.d(), this.f351434e.f310123d, "setting", 0, 0);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        com.tencent.mm.plugin.setting.ui.setting_new.settings.privacy_permission.SettingAdditionBottomPrivacy.y7(settingAdditionBottomPrivacy, string);
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting_new/settings/privacy_permission/SettingAdditionBottomPrivacy$onBindView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
