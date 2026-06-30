package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class a6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.b6 f207439d;

    public a6(com.tencent.mm.ui.conversation.b6 b6Var) {
        this.f207439d = b6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.conversation.b6 b6Var = this.f207439d;
        com.tencent.mm.ui.widget.dialog.j0 j0Var = b6Var.f207479e.f208001d;
        if (j0Var != null && j0Var.isShowing()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.InitHelper", "update dialog is showing.");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.InitHelper", "show update dialog");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1429L, 27L, 1L, false);
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(com.tencent.mm.sdk.platformtools.x2.f193071a);
        u1Var.g(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f493423k43));
        u1Var.m(com.tencent.mm.R.string.k3l);
        u1Var.a(true);
        u1Var.b(new com.tencent.mm.ui.conversation.y5(this));
        u1Var.e(new com.tencent.mm.ui.conversation.z5(this));
        u1Var.q(false);
        b6Var.f207479e.f208001d = u1Var.f211998c;
        k35.n1.a();
    }
}
