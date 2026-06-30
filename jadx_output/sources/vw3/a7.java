package vw3;

/* loaded from: classes12.dex */
public final class a7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerUploadTestUI f440883d;

    public a7(com.tencent.mm.plugin.repairer.ui.RepairerUploadTestUI repairerUploadTestUI) {
        this.f440883d = repairerUploadTestUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.repairer.ui.RepairerUploadTestUI repairerUploadTestUI = this.f440883d;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = repairerUploadTestUI.g;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        repairerUploadTestUI.g = null;
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(repairerUploadTestUI);
        e4Var.f211776c = "发送失败";
        e4Var.c();
    }
}
