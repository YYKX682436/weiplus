package vw3;

/* loaded from: classes.dex */
public final class g7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerXLogUI f440969d;

    public g7(com.tencent.mm.plugin.repairer.ui.RepairerXLogUI repairerXLogUI) {
        this.f440969d = repairerXLogUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.repairer.ui.RepairerXLogUI repairerXLogUI = this.f440969d;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = repairerXLogUI.d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        repairerXLogUI.d = null;
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(repairerXLogUI);
        e4Var.f211776c = "清理日志文件成功";
        e4Var.c();
    }
}
