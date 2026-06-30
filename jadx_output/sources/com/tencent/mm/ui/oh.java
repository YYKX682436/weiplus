package com.tencent.mm.ui;

/* loaded from: classes9.dex */
public class oh extends android.database.DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.ServiceNotifySettingsUI f209477a;

    public oh(com.tencent.mm.ui.ServiceNotifySettingsUI serviceNotifySettingsUI) {
        this.f209477a = serviceNotifySettingsUI;
    }

    @Override // android.database.DataSetObserver
    public void onChanged() {
        com.tencent.mm.ui.ServiceNotifySettingsUI serviceNotifySettingsUI = this.f209477a;
        android.view.View findViewById = serviceNotifySettingsUI.findViewById(com.tencent.mm.R.id.i3_);
        int i17 = serviceNotifySettingsUI.f197059f.isEmpty() ? 4 : 0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/ui/ServiceNotifySettingsUI$3", "onChanged", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/ui/ServiceNotifySettingsUI$3", "onChanged", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
