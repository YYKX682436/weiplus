package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes4.dex */
public final class mk implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalInfoPreviewUI f161334d;

    public mk(com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalInfoPreviewUI settingsPersonalInfoPreviewUI) {
        this.f161334d = settingsPersonalInfoPreviewUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsPersonalInfoPreviewUI$initView$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.List y07 = e71.k.wi().y0();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(y07, 10));
        java.util.Iterator it = y07.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalInfoPreviewUI settingsPersonalInfoPreviewUI = this.f161334d;
            if (!hasNext) {
                androidx.appcompat.app.AppCompatActivity context = settingsPersonalInfoPreviewUI.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                java.lang.String string = settingsPersonalInfoPreviewUI.getString(com.tencent.mm.R.string.isk);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                java.lang.String string2 = settingsPersonalInfoPreviewUI.getString(com.tencent.mm.R.string.iwd);
                kotlin.jvm.internal.o.f(string2, "getString(...)");
                new com.tencent.mm.plugin.setting.ui.setting.hk(settingsPersonalInfoPreviewUI, context, string, string2, new java.util.ArrayList(arrayList2)).show();
                yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsPersonalInfoPreviewUI$initView$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            e71.h hVar = (e71.h) it.next();
            java.lang.String field_name = hVar.field_name;
            kotlin.jvm.internal.o.f(field_name, "field_name");
            java.lang.String field_devicetype = hVar.field_devicetype;
            kotlin.jvm.internal.o.f(field_devicetype, "field_devicetype");
            arrayList2.add(new com.tencent.mm.plugin.setting.ui.setting.ik(settingsPersonalInfoPreviewUI, field_name, field_devicetype, k35.m1.f(settingsPersonalInfoPreviewUI.getContext(), hVar.field_createtime * 1000, true, false).toString()));
        }
    }
}
