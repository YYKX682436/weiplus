package pb1;

/* loaded from: classes7.dex */
public class k extends android.bluetooth.le.ScanCallback {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f353156a;

    public k(pb1.x xVar) {
        this.f353156a = new java.lang.ref.WeakReference(xVar);
    }

    @Override // android.bluetooth.le.ScanCallback
    public void onBatchScanResults(java.util.List list) {
        if (((pb1.x) this.f353156a.get()) == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.ScanResultCompat((android.bluetooth.le.ScanResult) it.next()));
        }
    }

    @Override // android.bluetooth.le.ScanCallback
    public void onScanFailed(int i17) {
        pb1.x xVar = (pb1.x) this.f353156a.get();
        if (xVar != null) {
            com.tencent.mars.xlog.Log.e(((pb1.e) xVar).f353134a.f353140a, "[onScanResult]onScanFailed, errorCode:%d", java.lang.Integer.valueOf(i17));
        }
    }

    @Override // android.bluetooth.le.ScanCallback
    public void onScanResult(int i17, android.bluetooth.le.ScanResult scanResult) {
        pb1.x xVar = (pb1.x) this.f353156a.get();
        if (xVar != null) {
            xVar.a(i17, new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.ScanResultCompat(scanResult));
        }
    }
}
