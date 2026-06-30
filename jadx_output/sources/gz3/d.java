package gz3;

/* loaded from: classes15.dex */
public class d implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.history.ui.ScannerHistoryUI f277750d;

    public d(com.tencent.mm.plugin.scanner.history.ui.ScannerHistoryUI scannerHistoryUI) {
        this.f277750d = scannerHistoryUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        int i17 = com.tencent.mm.plugin.scanner.history.ui.ScannerHistoryUI.f158734i;
        com.tencent.mm.plugin.scanner.history.ui.ScannerHistoryUI scannerHistoryUI = this.f277750d;
        db5.e1.K(scannerHistoryUI, true, scannerHistoryUI.getString(com.tencent.mm.R.string.i9v), "", scannerHistoryUI.getString(com.tencent.mm.R.string.f490507x1), scannerHistoryUI.getString(com.tencent.mm.R.string.f490347sg), new gz3.f(scannerHistoryUI), new gz3.g(scannerHistoryUI));
        return true;
    }
}
