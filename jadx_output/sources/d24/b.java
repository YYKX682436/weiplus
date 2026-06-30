package d24;

/* loaded from: classes.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingAdditionBottom f225903d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f225904e;

    public b(com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingAdditionBottom settingAdditionBottom, in5.s0 s0Var) {
        this.f225903d = settingAdditionBottom;
        this.f225904e = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting_new/settings/SettingAdditionBottom$onBindView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = this.f225904e.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingAdditionBottom settingAdditionBottom = this.f225903d;
        settingAdditionBottom.getClass();
        boolean Jj = ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Jj("wxalite1af500fa066e5b60505c414cd42cacbc");
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_settings_personal_privacy_list_url, "https://support.weixin.qq.com/cgi-bin/mmsupport-bin/newreadtemplate?t=datalist/personal", true);
        if (Jj) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("appId", "wxalite1af500fa066e5b60505c414cd42cacbc");
            bundle.putString("query", "{\"t\":\"datalist/personal\"}");
            com.tencent.mars.xlog.Log.i("MircoMsg.SettingAdditionBottom", "open liteapp:wxalite1af500fa066e5b60505c414cd42cacbc,page:");
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).kk(context, bundle, true, false, new d24.a(settingAdditionBottom, context, Zi));
        } else {
            settingAdditionBottom.y7(context, Zi);
        }
        settingAdditionBottom.u7(settingAdditionBottom.getIntent(), "SettingGroup_Main_Bottom_PersonalList");
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting_new/settings/SettingAdditionBottom$onBindView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
