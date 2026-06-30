package com.tencent.mm.plugin.webwx.ui;

/* loaded from: classes3.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f188007d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webwx.ui.ExtDeviceWXLoginUI f188008e;

    public g(com.tencent.mm.plugin.webwx.ui.ExtDeviceWXLoginUI extDeviceWXLoginUI, java.lang.String str) {
        this.f188008e = extDeviceWXLoginUI;
        this.f188007d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webwx.ui.ExtDeviceWXLoginUI extDeviceWXLoginUI = this.f188008e;
        if (extDeviceWXLoginUI.f187978x != null) {
            int i17 = extDeviceWXLoginUI.f187975u;
            int i18 = 0;
            if (i17 == 0) {
                extDeviceWXLoginUI.f187979y.setVisibility(8);
            } else if (i17 == 1) {
                extDeviceWXLoginUI.f187979y.setText(extDeviceWXLoginUI.f187976v);
                extDeviceWXLoginUI.f187979y.setVisibility(0);
            } else if (i17 == 2) {
                extDeviceWXLoginUI.f187979y.setVisibility(8);
                com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
                com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_MULTI_DEVICE_NOT_KICK_OUT_SHOWN_BOOLEAN_SYNC;
                if (!c17.o(u3Var, false)) {
                    android.view.View findViewById = extDeviceWXLoginUI.findViewById(com.tencent.mm.R.id.mz9);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/webwx/ui/ExtDeviceWXLoginUI", "updateTipsArea", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/plugin/webwx/ui/ExtDeviceWXLoginUI", "updateTipsArea", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    gm0.j1.u().c().x(u3Var, java.lang.Boolean.TRUE);
                }
            }
            java.lang.String str = this.f188007d;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                extDeviceWXLoginUI.f187978x.setVisibility(8);
            } else {
                extDeviceWXLoginUI.f187978x.setVisibility(0);
                extDeviceWXLoginUI.f187978x.setText(str);
            }
            if (extDeviceWXLoginUI.f187979y.getVisibility() == 0 || !com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                int b17 = i65.a.b(extDeviceWXLoginUI, 292) - extDeviceWXLoginUI.B.getMeasuredHeight();
                if (extDeviceWXLoginUI.f187977w.getVisibility() == 0) {
                    b17 = (b17 - i65.a.b(extDeviceWXLoginUI, 28)) - extDeviceWXLoginUI.f187977w.getMeasuredHeight();
                }
                if (extDeviceWXLoginUI.B.getVisibility() == 0) {
                    b17 = (b17 - i65.a.b(extDeviceWXLoginUI, 4)) - extDeviceWXLoginUI.B.getMeasuredHeight();
                }
                if (extDeviceWXLoginUI.f187980z.getVisibility() == 0) {
                    b17 = (b17 - i65.a.b(extDeviceWXLoginUI, 4)) - extDeviceWXLoginUI.f187980z.getMeasuredHeight();
                }
                if (extDeviceWXLoginUI.f187979y.getVisibility() == 0) {
                    b17 -= i65.a.b(extDeviceWXLoginUI, 12);
                }
                if (extDeviceWXLoginUI.f187978x.getVisibility() == 0) {
                    b17 -= i65.a.b(extDeviceWXLoginUI, 12);
                }
                if (extDeviceWXLoginUI.Y6(b17, 14, str) || extDeviceWXLoginUI.Y6(b17, 13, str) || extDeviceWXLoginUI.Y6(b17, 12, str)) {
                    return;
                }
                float b18 = i65.a.b(extDeviceWXLoginUI, 12);
                extDeviceWXLoginUI.f187979y.setTextSize(0, b18);
                extDeviceWXLoginUI.f187978x.setTextSize(0, b18);
                int b19 = b17 / i65.a.b(extDeviceWXLoginUI, 12);
                int measuredWidth = extDeviceWXLoginUI.f187978x.getMeasuredWidth();
                if (extDeviceWXLoginUI.f187978x.getVisibility() == 0) {
                    int measureText = (int) extDeviceWXLoginUI.f187978x.getPaint().measureText(str);
                    if (measuredWidth > 0) {
                        i18 = 0 + (measureText / measuredWidth);
                        if (measureText % measuredWidth > 0) {
                            i18++;
                        }
                    }
                }
                if (b19 > i18) {
                    extDeviceWXLoginUI.f187979y.setMaxLines(b19 - i18);
                } else {
                    extDeviceWXLoginUI.f187978x.setMaxLines(b19 - 1);
                    extDeviceWXLoginUI.f187979y.setMaxLines(1);
                }
            }
        }
    }
}
