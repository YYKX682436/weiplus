package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class cg implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.f9 f160914d;

    public cg(com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindMoreUI settingsManageFindMoreUI, com.tencent.mm.sdk.platformtools.f9 f9Var) {
        this.f160914d = f9Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsManageFindMoreUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f160914d.j(view.getContext());
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsManageFindMoreUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
