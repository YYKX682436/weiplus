package dg3;

/* loaded from: classes3.dex */
public final class j implements com.tencent.mm.ui.widget.dialog.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dg3.k f232331a;

    public j(dg3.k kVar) {
        this.f232331a = kVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.b1
    public final void a() {
        dg3.k kVar = this.f232331a;
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
