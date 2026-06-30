package d24;

/* loaded from: classes.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingAdditionBottom f225906d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f225907e;

    public c(com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingAdditionBottom settingAdditionBottom, in5.s0 s0Var) {
        this.f225906d = settingAdditionBottom;
        this.f225907e = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting_new/settings/SettingAdditionBottom$onBindView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = this.f225907e.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingAdditionBottom settingAdditionBottom = this.f225906d;
        settingAdditionBottom.getClass();
        settingAdditionBottom.y7(context, ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_settings_privacy_third_party_list_url, "https://support.weixin.qq.com/cgi-bin/mmsupport-bin/newreadtemplate?t=datalist/shared", true));
        settingAdditionBottom.u7(settingAdditionBottom.getIntent(), "SettingGroup_Main_Bottom_ThirdPartyList");
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting_new/settings/SettingAdditionBottom$onBindView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
