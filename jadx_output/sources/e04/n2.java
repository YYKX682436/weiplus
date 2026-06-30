package e04;

/* loaded from: classes15.dex */
public final class n2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e04.o2 f246031d;

    public n2(e04.o2 o2Var) {
        this.f246031d = o2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e04.o2 o2Var = this.f246031d;
        boolean z17 = o2Var.f246037d;
        if (o2Var.f246037d) {
            return;
        }
        com.tencent.mm.plugin.scanner.view.s sVar = o2Var.f246039f;
        if (sVar != null) {
            ((com.tencent.mm.plugin.scanner.ui.BaseScanUI) sVar).u7(true, true, o2Var.f246038e);
        }
        e04.m2 m2Var = o2Var.f246040g;
        if (m2Var != null) {
            m2Var.onShow();
        }
    }
}
