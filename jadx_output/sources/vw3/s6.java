package vw3;

/* loaded from: classes9.dex */
public final class s6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerUploadTestUI f441110d;

    public s6(com.tencent.mm.plugin.repairer.ui.RepairerUploadTestUI repairerUploadTestUI) {
        this.f441110d = repairerUploadTestUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.repairer.ui.RepairerUploadTestUI repairerUploadTestUI = this.f441110d;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = repairerUploadTestUI.g;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        repairerUploadTestUI.g = null;
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(repairerUploadTestUI);
        e4Var.f211776c = "上传失败";
        e4Var.c();
    }
}
