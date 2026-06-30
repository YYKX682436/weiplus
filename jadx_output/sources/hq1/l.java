package hq1;

/* loaded from: classes7.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.bluetooth.BluetoothDevice f283156d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f283157e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ byte[] f283158f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ hq1.n f283159g;

    public l(hq1.n nVar, android.bluetooth.BluetoothDevice bluetoothDevice, int i17, byte[] bArr) {
        this.f283159g = nVar;
        this.f283156d = bluetoothDevice;
        this.f283157e = i17;
        this.f283158f = bArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = 0;
        while (true) {
            hq1.n nVar = this.f283159g;
            if (i17 >= nVar.f283169e.size()) {
                return;
            }
            ((hq1.m) nVar.f283169e.get(i17)).b(this.f283156d, this.f283157e, this.f283158f);
            i17++;
        }
    }
}
