package of1;

/* loaded from: classes8.dex */
public class d implements com.tencent.mm.ui.widget.dialog.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ of1.e f344901d;

    public d(of1.e eVar) {
        this.f344901d = eVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.c1
    public void onDismiss() {
        com.tencent.mm.plugin.webview.stub.v0 v0Var;
        of1.e eVar = this.f344901d;
        of1.m mVar = eVar.f344906d;
        mVar.f344967n = null;
        mVar.f344966m = null;
        ((com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic) mVar.f344972s).n();
        of1.m mVar2 = eVar.f344906d;
        hy4.s sVar = mVar2.f344971r;
        if (sVar == null || (v0Var = mVar2.f344882f) == null) {
            return;
        }
        try {
            v0Var.b6(sVar.f286196c);
            eVar.f344906d.f344971r.b();
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.HTMLViewScanHelper", "cancel capture failed");
        }
    }
}
