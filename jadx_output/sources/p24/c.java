package p24;

/* loaded from: classes.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting_new.settings.privacy_permission.SettingAdditionBottomPrivacy f351431d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f351432e;

    public c(com.tencent.mm.plugin.setting.ui.setting_new.settings.privacy_permission.SettingAdditionBottomPrivacy settingAdditionBottomPrivacy, kotlin.jvm.internal.h0 h0Var) {
        this.f351431d = settingAdditionBottomPrivacy;
        this.f351432e = h0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting_new/settings/privacy_permission/SettingAdditionBottomPrivacy$onBindView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.h0 h0Var = this.f351432e;
        java.lang.String str = (java.lang.String) h0Var.f310123d;
        com.tencent.mm.plugin.setting.ui.setting_new.settings.privacy_permission.SettingAdditionBottomPrivacy settingAdditionBottomPrivacy = this.f351431d;
        settingAdditionBottomPrivacy.getClass();
        if (r26.i0.p(str, "cn", true)) {
            java.lang.String string = settingAdditionBottomPrivacy.getContext().getString(com.tencent.mm.R.string.gba, "infopage", h0Var.f310123d);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            com.tencent.mm.plugin.setting.ui.setting_new.settings.privacy_permission.SettingAdditionBottomPrivacy.y7(settingAdditionBottomPrivacy, string);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting_new/settings/privacy_permission/SettingAdditionBottomPrivacy$onBindView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
