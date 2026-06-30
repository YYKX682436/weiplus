package o24;

/* loaded from: classes2.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting_new.settings.personal_info.SettingActivityItemAvatar f342456d;

    public b(com.tencent.mm.plugin.setting.ui.setting_new.settings.personal_info.SettingActivityItemAvatar settingActivityItemAvatar) {
        this.f342456d = settingActivityItemAvatar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting_new/settings/personal_info/SettingActivityItemAvatar$avatarOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f342456d.N7();
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting_new/settings/personal_info/SettingActivityItemAvatar$avatarOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
