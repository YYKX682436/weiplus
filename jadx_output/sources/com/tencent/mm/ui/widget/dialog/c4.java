package com.tencent.mm.ui.widget.dialog;

/* loaded from: classes11.dex */
public class c4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.e4 f211760d;

    public c4(com.tencent.mm.ui.widget.dialog.e4 e4Var) {
        this.f211760d = e4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.widget.dialog.e4 e4Var = this.f211760d;
        try {
            com.tencent.mm.ui.widget.dialog.f4 f4Var = e4Var.f211774a;
            if (f4Var == null || !f4Var.isShowing()) {
                return;
            }
            e4Var.f211774a.dismiss();
        } catch (java.lang.Throwable th6) {
            com.tencent.mm.ui.yk.d("MicroMsg.WeToast", th6, "showOnWindow err", new java.lang.Object[0]);
        }
    }
}
