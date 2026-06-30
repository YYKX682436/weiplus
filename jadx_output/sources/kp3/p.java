package kp3;

/* loaded from: classes14.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kp3.x f311020d;

    public p(kp3.x xVar) {
        this.f311020d = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kp3.f fVar;
        androidx.appcompat.app.AppCompatActivity activity = this.f311020d.getActivity();
        com.tencent.mm.plugin.palm.ui.PalmPrintMainUI palmPrintMainUI = activity instanceof com.tencent.mm.plugin.palm.ui.PalmPrintMainUI ? (com.tencent.mm.plugin.palm.ui.PalmPrintMainUI) activity : null;
        if (palmPrintMainUI == null || (fVar = palmPrintMainUI.f152881q) == null) {
            return;
        }
        fVar.E("palmFound");
    }
}
