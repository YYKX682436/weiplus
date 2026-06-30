package com.tencent.mm.ui.widget.dialog;

/* loaded from: classes14.dex */
public class b4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.e4 f211751d;

    public b4(com.tencent.mm.ui.widget.dialog.e4 e4Var) {
        this.f211751d = e4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.widget.dialog.e4 e4Var = this.f211751d;
        try {
            com.tencent.mm.ui.widget.dialog.f4 f4Var = e4Var.f211774a;
            if (f4Var == null || !f4Var.isShowing()) {
                return;
            }
            e4Var.f211774a.dismiss();
        } catch (java.lang.IllegalArgumentException e17) {
            com.tencent.mm.ui.yk.b("MicroMsg.WeToast", "IllegalArgumentException %s", e17);
        } catch (java.lang.Exception e18) {
            com.tencent.mm.ui.yk.b("MicroMsg.WeToast", "Exception %s", e18);
        }
    }
}
