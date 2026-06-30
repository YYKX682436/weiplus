package com.tencent.mm.plugin.webwx.ui;

/* loaded from: classes11.dex */
public class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webwx.ui.ExtDeviceWXLoginUI f188005d;

    public f(com.tencent.mm.plugin.webwx.ui.ExtDeviceWXLoginUI extDeviceWXLoginUI) {
        this.f188005d = extDeviceWXLoginUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webwx/ui/ExtDeviceWXLoginUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.webwx.ui.ExtDeviceWXLoginUI extDeviceWXLoginUI = this.f188005d;
        if (extDeviceWXLoginUI.A.isChecked()) {
            extDeviceWXLoginUI.A.setChecked(!r9.isChecked());
        } else {
            androidx.appcompat.app.AppCompatActivity context = extDeviceWXLoginUI.getContext();
            java.lang.String str = extDeviceWXLoginUI.f187963f;
            java.lang.String string = extDeviceWXLoginUI.getContext().getString(com.tencent.mm.R.string.l7p);
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str != null) {
                string = str;
            }
            db5.e1.A(context, string, extDeviceWXLoginUI.getContext().getString(com.tencent.mm.R.string.l7r), extDeviceWXLoginUI.getContext().getString(com.tencent.mm.R.string.l7q), extDeviceWXLoginUI.getContext().getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.plugin.webwx.ui.d(this), new com.tencent.mm.plugin.webwx.ui.e(this));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/webwx/ui/ExtDeviceWXLoginUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
