package com.tencent.mm.plugin.webwx.ui;

/* loaded from: classes3.dex */
public class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webwx.ui.ExtDeviceWXLoginUI f187998d;

    public c(com.tencent.mm.plugin.webwx.ui.ExtDeviceWXLoginUI extDeviceWXLoginUI) {
        this.f187998d = extDeviceWXLoginUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webwx/ui/ExtDeviceWXLoginUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f187998d.C.setChecked(!r7.isChecked());
        yj0.a.h(this, "com/tencent/mm/plugin/webwx/ui/ExtDeviceWXLoginUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
