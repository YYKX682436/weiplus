package dg3;

/* loaded from: classes3.dex */
public final class i implements com.tencent.mm.ui.widget.dialog.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dg3.k f232330d;

    public i(dg3.k kVar) {
        this.f232330d = kVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.c1
    public final void onDismiss() {
        dg3.k kVar = this.f232330d;
        kVar.f232332d = null;
        kd0.p2 p2Var = kVar.f232333e;
        if (p2Var != null) {
            ((com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic) p2Var).n();
        }
        cg3.a aVar = (cg3.a) kVar.U6(cg3.a.class);
        if (aVar != null) {
            aVar.cancel();
        }
    }
}
