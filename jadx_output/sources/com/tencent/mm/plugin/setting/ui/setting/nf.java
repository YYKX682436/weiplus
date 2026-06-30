package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes8.dex */
public class nf implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsManageAuthUI f161360d;

    public nf(com.tencent.mm.plugin.setting.ui.setting.SettingsManageAuthUI settingsManageAuthUI) {
        this.f161360d = settingsManageAuthUI;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        r45.ov6 item;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsManageAuthUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.plugin.setting.ui.setting.SettingsManageAuthUI settingsManageAuthUI = this.f161360d;
        if (!settingsManageAuthUI.f160489i && (item = settingsManageAuthUI.f160486f.getItem(i17)) != null) {
            android.content.Intent intent = new android.content.Intent(settingsManageAuthUI, (java.lang.Class<?>) com.tencent.mm.plugin.setting.ui.setting.SettingsModifyUserAuthUI.class);
            android.os.Parcelable.Creator<com.tencent.mm.plugin.setting.model.UserAuthItemParcelable> creator = com.tencent.mm.plugin.setting.model.UserAuthItemParcelable.CREATOR;
            java.util.LinkedList linkedList = item.f382563g;
            com.tencent.mm.plugin.setting.model.UserAuthItemParcelable[] newArray = creator.newArray(linkedList.size());
            for (int i18 = 0; i18 < linkedList.size(); i18++) {
                r45.pv6 pv6Var = (r45.pv6) linkedList.get(i18);
                com.tencent.mm.plugin.setting.model.UserAuthItemParcelable userAuthItemParcelable = new com.tencent.mm.plugin.setting.model.UserAuthItemParcelable();
                userAuthItemParcelable.f160054d = pv6Var.f383420d;
                userAuthItemParcelable.f160055e = pv6Var.f383421e;
                userAuthItemParcelable.f160056f = pv6Var.f383422f;
                userAuthItemParcelable.f160057g = pv6Var.f383423g;
                newArray[i18] = userAuthItemParcelable;
            }
            intent.putExtra(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_APPID, item.f382560d);
            intent.putExtra("app_name", item.f382561e);
            intent.putExtra("modify_scene", 1);
            intent.putParcelableArrayListExtra("app_auth_items", new java.util.ArrayList<>(java.util.Arrays.asList(newArray)));
            com.tencent.mm.plugin.setting.ui.setting.SettingsManageAuthUI settingsManageAuthUI2 = this.f161360d;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(settingsManageAuthUI2, arrayList2.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsManageAuthUI$2", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            settingsManageAuthUI2.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(settingsManageAuthUI2, "com/tencent/mm/plugin/setting/ui/setting/SettingsManageAuthUI$2", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsManageAuthUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
