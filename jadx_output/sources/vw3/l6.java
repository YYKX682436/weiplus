package vw3;

/* loaded from: classes.dex */
public final class l6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerUploadTestUI f441026d;

    public l6(com.tencent.mm.plugin.repairer.ui.RepairerUploadTestUI repairerUploadTestUI) {
        this.f441026d = repairerUploadTestUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.repairer.ui.RepairerUploadTestUI repairerUploadTestUI = this.f441026d;
        repairerUploadTestUI.g = com.tencent.mm.ui.widget.dialog.u3.f(repairerUploadTestUI, "正在处理...", true, 0, null);
    }
}
