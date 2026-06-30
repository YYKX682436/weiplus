package com.tencent.mm.ui;

/* loaded from: classes9.dex */
public class v0 extends android.database.DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.AppBrandNotifySettingsUI f211099a;

    public v0(com.tencent.mm.ui.AppBrandNotifySettingsUI appBrandNotifySettingsUI) {
        this.f211099a = appBrandNotifySettingsUI;
    }

    @Override // android.database.DataSetObserver
    public void onChanged() {
        com.tencent.mm.ui.AppBrandNotifySettingsUI appBrandNotifySettingsUI = this.f211099a;
        android.view.View findViewById = appBrandNotifySettingsUI.findViewById(com.tencent.mm.R.id.i3_);
        int i17 = appBrandNotifySettingsUI.f196581e.isEmpty() ? 4 : 0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/ui/AppBrandNotifySettingsUI$4", "onChanged", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/ui/AppBrandNotifySettingsUI$4", "onChanged", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
