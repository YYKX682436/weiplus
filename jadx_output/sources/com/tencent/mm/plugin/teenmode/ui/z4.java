package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes.dex */
public class z4 implements android.view.View.OnClickListener {
    public z4(com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMainBizAcct settingsTeenModeMainBizAcct) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMainBizAcct$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("intent_service_type", 251658241);
        j45.l.j(view.getContext(), "brandservice", ".ui.BrandServiceIndexUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMainBizAcct$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
