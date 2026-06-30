package gz3;

/* loaded from: classes15.dex */
public class e implements db5.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f277751a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.history.ui.ScannerHistoryUI f277752b;

    public e(com.tencent.mm.plugin.scanner.history.ui.ScannerHistoryUI scannerHistoryUI, int i17) {
        this.f277752b = scannerHistoryUI;
        this.f277751a = i17;
    }

    @Override // db5.c1
    public void e(int i17) {
        if (i17 != 0) {
            return;
        }
        com.tencent.mm.plugin.scanner.history.ui.ScannerHistoryUI scannerHistoryUI = this.f277752b;
        fz3.a aVar = (fz3.a) scannerHistoryUI.f158737f.getItem(this.f277751a);
        if (aVar != null) {
            com.tencent.mm.plugin.scanner.m1.Ai().Bi().delete(aVar, new java.lang.String[0]);
            scannerHistoryUI.T6();
            scannerHistoryUI.f158737f.f();
        }
    }
}
