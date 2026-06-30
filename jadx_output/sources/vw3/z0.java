package vw3;

/* loaded from: classes.dex */
public final class z0 implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerFileListUI f441201a;

    public z0(com.tencent.mm.plugin.repairer.ui.RepairerFileListUI repairerFileListUI) {
        this.f441201a = repairerFileListUI;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        if (z17) {
            com.tencent.mm.plugin.repairer.ui.RepairerFileListUI repairerFileListUI = this.f441201a;
            repairerFileListUI.e = com.tencent.mm.ui.widget.dialog.u3.f(repairerFileListUI, "正在处理...", true, 0, null);
            pm0.v.K(null, new vw3.y0(repairerFileListUI));
        }
    }
}
