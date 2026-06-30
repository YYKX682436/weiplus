package com.tencent.mm.plugin.login_exdevice.ui;

/* loaded from: classes10.dex */
public class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.login_exdevice.ui.LoginAsExDeviceUI f144994d;

    public e(com.tencent.mm.plugin.login_exdevice.ui.LoginAsExDeviceUI loginAsExDeviceUI) {
        this.f144994d = loginAsExDeviceUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/login_exdevice/ui/LoginAsExDeviceUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.login_exdevice.ui.LoginAsExDeviceUI loginAsExDeviceUI = this.f144994d;
        loginAsExDeviceUI.f144984t = false;
        android.view.View view2 = loginAsExDeviceUI.f144974g;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/login_exdevice/ui/LoginAsExDeviceUI$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/login_exdevice/ui/LoginAsExDeviceUI$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = loginAsExDeviceUI.f144976i;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/login_exdevice/ui/LoginAsExDeviceUI$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/login_exdevice/ui/LoginAsExDeviceUI$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view4 = loginAsExDeviceUI.f144975h;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(8);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/login_exdevice/ui/LoginAsExDeviceUI$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/login_exdevice/ui/LoginAsExDeviceUI$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        loginAsExDeviceUI.V6(0L);
        yj0.a.h(this, "com/tencent/mm/plugin/login_exdevice/ui/LoginAsExDeviceUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
