package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes8.dex */
public class nl implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsSearchAuthUI f161365d;

    public nl(com.tencent.mm.plugin.setting.ui.setting.SettingsSearchAuthUI settingsSearchAuthUI) {
        this.f161365d = settingsSearchAuthUI;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.tencent.mm.plugin.setting.ui.setting.SettingsSearchAuthUI settingsSearchAuthUI = this.f161365d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsSearchAuthUI$5", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        try {
            r45.ov6 item = settingsSearchAuthUI.f160641n.getItem(i17);
            if (item != null) {
                settingsSearchAuthUI.f160648u = i17;
                android.content.Intent intent = new android.content.Intent(settingsSearchAuthUI, (java.lang.Class<?>) com.tencent.mm.plugin.setting.ui.setting.SettingsDelAuthUI.class);
                intent.putExtra("key_user_auth_app", item.toByteArray());
                settingsSearchAuthUI.startActivityForResult(intent, 1000);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SettingsSearchAuthUI", e17, "", new java.lang.Object[0]);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsSearchAuthUI$5", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
