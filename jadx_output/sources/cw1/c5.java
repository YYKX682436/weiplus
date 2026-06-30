package cw1;

/* loaded from: classes12.dex */
public class c5 extends com.tencent.mm.ui.widget.dialog.n2 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingOldUI f222850e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c5(com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingOldUI cleanChattingOldUI, java.lang.String[] strArr, int i17) {
        super(strArr, i17);
        this.f222850e = cleanChattingOldUI;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p2
    public boolean d(int i17) {
        this.f222850e.f95755w = true;
        this.f222850e.f95751s = com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingOldUI.C[i17];
        ku5.u0 u0Var = ku5.t0.f312615d;
        final com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingOldUI cleanChattingOldUI = this.f222850e;
        ((ku5.t0) u0Var).b(new java.lang.Runnable() { // from class: cw1.c5$$a
            @Override // java.lang.Runnable
            public final void run() {
                long[] jArr = com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingOldUI.B;
                com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingOldUI.this.W6();
            }
        }, "CleanChattingLoad");
        super.d(i17);
        return true;
    }
}
