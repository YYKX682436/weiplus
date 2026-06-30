package com.tencent.mm.plugin.login_exdevice.ui;

/* loaded from: classes10.dex */
public class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.login_exdevice.ui.LoginAsExDeviceUI f144996d;

    public h(com.tencent.mm.plugin.login_exdevice.ui.LoginAsExDeviceUI loginAsExDeviceUI) {
        this.f144996d = loginAsExDeviceUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/login_exdevice/ui/LoginAsExDeviceUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.login_exdevice.ui.LoginAsExDeviceUI.f144970y;
        this.f144996d.V6(0L);
        yj0.a.h(this, "com/tencent/mm/plugin/login_exdevice/ui/LoginAsExDeviceUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
