package gz3;

/* loaded from: classes15.dex */
public class c implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.history.ui.ScannerHistoryUI f277749d;

    public c(com.tencent.mm.plugin.scanner.history.ui.ScannerHistoryUI scannerHistoryUI) {
        this.f277749d = scannerHistoryUI;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        if (i17 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ScannerHistoryUI", "onItemLongClick pos is 0");
            return true;
        }
        if (i17 > 0) {
            i17--;
        }
        com.tencent.mm.plugin.scanner.history.ui.ScannerHistoryUI scannerHistoryUI = this.f277749d;
        if (i17 >= scannerHistoryUI.f158737f.getCount()) {
            return true;
        }
        db5.e1.e(scannerHistoryUI, scannerHistoryUI.getResources().getString(com.tencent.mm.R.string.aud), null, scannerHistoryUI.getResources().getString(com.tencent.mm.R.string.f490367t0), new gz3.e(scannerHistoryUI, i17));
        return true;
    }
}
