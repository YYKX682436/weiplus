package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f178127a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.j0 f178128b = null;

    public d(android.content.Context context) {
        this.f178127a = null;
        this.f178127a = context;
    }

    public void a(r45.ce4 ce4Var, com.tencent.mm.plugin.wallet.balance.ui.lqt.c cVar) {
        if (ce4Var == null || this.f178127a == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.LqtDialogHelper", "dialog or context is null");
            return;
        }
        int i17 = ce4Var.f371501e;
        if (i17 == 1) {
            if (ce4Var.f371502f == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.LqtDialogHelper", "dialog center_btn is null");
                return;
            }
            com.tencent.mm.ui.widget.dialog.j0 j0Var = this.f178128b;
            if (j0Var != null && j0Var.isShowing()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LqtDialogHelper", "old dialog is exits");
                return;
            }
            android.content.Context context = this.f178127a;
            java.lang.String str = ce4Var.f371500d;
            r45.de4 de4Var = ce4Var.f371502f;
            this.f178128b = db5.e1.E(context, str, "", de4Var.f372349d, false, new com.tencent.mm.plugin.wallet.balance.ui.lqt.b(this, context, de4Var, cVar));
            return;
        }
        if (i17 != 2) {
            com.tencent.mars.xlog.Log.w("MicroMsg.LqtDialogHelper", "unknown dialog type");
            return;
        }
        if (ce4Var.f371504h == null || ce4Var.f371503g == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.LqtDialogHelper", "dialog right_btn or left_btn is null");
            return;
        }
        com.tencent.mm.ui.widget.dialog.j0 j0Var2 = this.f178128b;
        if (j0Var2 != null && j0Var2.isShowing()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LqtDialogHelper", "old dialog is exits");
            return;
        }
        android.content.Context context2 = this.f178127a;
        java.lang.String str2 = ce4Var.f371500d;
        r45.de4 de4Var2 = ce4Var.f371504h;
        java.lang.String str3 = de4Var2.f372349d;
        r45.de4 de4Var3 = ce4Var.f371503g;
        this.f178128b = db5.e1.C(context2, str2, "", str3, de4Var3.f372349d, false, new com.tencent.mm.plugin.wallet.balance.ui.lqt.b(this, context2, de4Var2, cVar), new com.tencent.mm.plugin.wallet.balance.ui.lqt.b(this, context2, de4Var3, cVar));
    }
}
