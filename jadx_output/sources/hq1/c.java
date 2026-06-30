package hq1;

/* loaded from: classes13.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.bluetooth.BluetoothDevice f283094d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f283095e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ byte[] f283096f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ hq1.d f283097g;

    public c(hq1.d dVar, android.bluetooth.BluetoothDevice bluetoothDevice, int i17, byte[] bArr) {
        this.f283097g = dVar;
        this.f283094d = bluetoothDevice;
        this.f283095e = i17;
        this.f283096f = bArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        hq1.j.a(this.f283097g.f283099a, this.f283094d, this.f283095e, this.f283096f);
    }
}
