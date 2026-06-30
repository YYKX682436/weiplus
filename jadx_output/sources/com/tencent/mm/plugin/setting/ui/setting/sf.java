package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes8.dex */
public class sf implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f161540d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.uf f161541e;

    public sf(com.tencent.mm.plugin.setting.ui.setting.uf ufVar, int i17) {
        this.f161541e = ufVar;
        this.f161540d = i17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsManageAuthUI$AuthListAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.setting.ui.setting.uf ufVar = this.f161541e;
        int i17 = this.f161540d;
        if (ufVar.getItem(i17) != null) {
            k14.w wVar = new k14.w(ufVar.getItem(i17).f382560d, 1);
            android.app.ProgressDialog progressDialog = ufVar.f161611e.f160487g;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
            gm0.j1.d().g(wVar);
            com.tencent.mm.plugin.setting.ui.setting.SettingsManageAuthUI settingsManageAuthUI = ufVar.f161611e;
            settingsManageAuthUI.f160487g = db5.e1.Q(settingsManageAuthUI, "", settingsManageAuthUI.getString(com.tencent.mm.R.string.f490552yb), false, true, new com.tencent.mm.plugin.setting.ui.setting.rf(this, wVar));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsManageAuthUI$AuthListAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
