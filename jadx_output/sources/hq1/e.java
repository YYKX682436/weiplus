package hq1;

/* loaded from: classes7.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.bluetooth.BluetoothDevice f283101d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f283102e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ byte[] f283103f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ hq1.g f283104g;

    public e(hq1.g gVar, android.bluetooth.BluetoothDevice bluetoothDevice, int i17, byte[] bArr) {
        this.f283104g = gVar;
        this.f283101d = bluetoothDevice;
        this.f283102e = i17;
        this.f283103f = bArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        hq1.j.a(this.f283104g.f283107a, this.f283101d, this.f283102e, this.f283103f);
    }
}
