package gq1;

/* loaded from: classes13.dex */
public class h implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gq1.o f274504d;

    public h(gq1.o oVar) {
        this.f274504d = oVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        gq1.o oVar = this.f274504d;
        if (oVar.f274522f.size() <= 0) {
            return false;
        }
        android.bluetooth.BluetoothAdapter bluetoothAdapter = oVar.f274524h;
        if (bluetoothAdapter != null) {
            bluetoothAdapter.stopLeScan(oVar);
        }
        if (!oVar.f274532s.e()) {
            return true;
        }
        oVar.f274532s.c(2000L, 2000L);
        return true;
    }
}
