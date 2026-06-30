package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes4.dex */
public final class lk implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalInfoPreviewUI f161299d;

    public lk(com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalInfoPreviewUI settingsPersonalInfoPreviewUI) {
        this.f161299d = settingsPersonalInfoPreviewUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsPersonalInfoPreviewUI$initView$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalInfoPreviewUI settingsPersonalInfoPreviewUI = this.f161299d;
        java.util.List<s71.b> list = settingsPersonalInfoPreviewUI.f160599e;
        if (list != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list, 10));
            for (s71.b bVar : list) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                if (!android.text.TextUtils.isEmpty(bVar.f403972f)) {
                    sb6.append(bVar.f403972f);
                }
                if (!android.text.TextUtils.isEmpty(bVar.f403973g)) {
                    sb6.append(" ");
                    sb6.append(bVar.f403973g);
                }
                if (!android.text.TextUtils.isEmpty(bVar.f403974h)) {
                    sb6.append(" ");
                    sb6.append(bVar.f403974h);
                }
                if (!android.text.TextUtils.isEmpty(bVar.f403980q)) {
                    sb6.append(" ");
                    sb6.append(bVar.f403980q);
                }
                if (!android.text.TextUtils.isEmpty(bVar.f403976m)) {
                    sb6.append(" ");
                    sb6.append(bVar.f403976m);
                }
                java.lang.String str = bVar.f403977n + (char) 65292 + bVar.f403978o;
                java.lang.String sb7 = sb6.toString();
                kotlin.jvm.internal.o.f(sb7, "toString(...)");
                arrayList2.add(new com.tencent.mm.plugin.setting.ui.setting.ik(settingsPersonalInfoPreviewUI, str, sb7, ""));
            }
            androidx.appcompat.app.AppCompatActivity context = settingsPersonalInfoPreviewUI.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            java.lang.String string = settingsPersonalInfoPreviewUI.getString(com.tencent.mm.R.string.ipa);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            java.lang.String string2 = settingsPersonalInfoPreviewUI.getString(com.tencent.mm.R.string.iwc);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            new com.tencent.mm.plugin.setting.ui.setting.hk(settingsPersonalInfoPreviewUI, context, string, string2, new java.util.ArrayList(arrayList2)).show();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsPersonalInfoPreviewUI$initView$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
