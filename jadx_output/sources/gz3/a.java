package gz3;

/* loaded from: classes15.dex */
public class a implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.history.ui.ScannerHistoryUI f277747d;

    public a(com.tencent.mm.plugin.scanner.history.ui.ScannerHistoryUI scannerHistoryUI) {
        this.f277747d = scannerHistoryUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f277747d.finish();
        return true;
    }
}
