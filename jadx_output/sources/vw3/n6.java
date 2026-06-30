package vw3;

/* loaded from: classes9.dex */
public final class n6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerUploadTestUI f441043d;

    public n6(com.tencent.mm.plugin.repairer.ui.RepairerUploadTestUI repairerUploadTestUI) {
        this.f441043d = repairerUploadTestUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(this.f441043d);
        e4Var.f211776c = "上传失败";
        e4Var.c();
    }
}
