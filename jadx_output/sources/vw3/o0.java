package vw3;

/* loaded from: classes.dex */
public final class o0 implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerFileListUI f441046a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.r6 f441047b;

    public o0(com.tencent.mm.plugin.repairer.ui.RepairerFileListUI repairerFileListUI, com.tencent.mm.vfs.r6 r6Var) {
        this.f441046a = repairerFileListUI;
        this.f441047b = r6Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        if (z17) {
            com.tencent.mm.plugin.repairer.ui.RepairerFileListUI repairerFileListUI = this.f441046a;
            repairerFileListUI.e = com.tencent.mm.ui.widget.dialog.u3.f(repairerFileListUI, "正在压缩...", true, 0, null);
            pm0.v.K(null, new vw3.n0(this.f441047b, repairerFileListUI));
        }
    }
}
