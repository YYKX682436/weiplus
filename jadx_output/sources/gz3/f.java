package gz3;

/* loaded from: classes15.dex */
public class f implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.history.ui.ScannerHistoryUI f277753d;

    public f(com.tencent.mm.plugin.scanner.history.ui.ScannerHistoryUI scannerHistoryUI) {
        this.f277753d = scannerHistoryUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        com.tencent.mm.plugin.scanner.m1.Ai().Bi().f477706d.A("ScanHistoryItem", "delete from ScanHistoryItem");
        int i18 = com.tencent.mm.plugin.scanner.history.ui.ScannerHistoryUI.f158734i;
        com.tencent.mm.plugin.scanner.history.ui.ScannerHistoryUI scannerHistoryUI = this.f277753d;
        scannerHistoryUI.T6();
        scannerHistoryUI.f158737f.f();
    }
}
