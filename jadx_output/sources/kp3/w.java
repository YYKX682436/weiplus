package kp3;

/* loaded from: classes14.dex */
public final class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kp3.x f311047d;

    public w(kp3.x xVar) {
        this.f311047d = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kp3.f fVar;
        kp3.x xVar = this.f311047d;
        androidx.appcompat.app.AppCompatActivity activity = xVar.getActivity();
        com.tencent.mm.plugin.palm.ui.PalmPrintMainUI palmPrintMainUI = activity instanceof com.tencent.mm.plugin.palm.ui.PalmPrintMainUI ? (com.tencent.mm.plugin.palm.ui.PalmPrintMainUI) activity : null;
        if (palmPrintMainUI != null && (fVar = palmPrintMainUI.f152881q) != null) {
            fVar.E("pageExit");
        }
        xVar.onPause();
    }
}
