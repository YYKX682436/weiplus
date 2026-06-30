package gq1;

/* loaded from: classes13.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f274514d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.bluetooth.BluetoothDevice f274515e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gq1.d f274516f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gq1.o f274517g;

    public n(gq1.o oVar, int i17, android.bluetooth.BluetoothDevice bluetoothDevice, gq1.d dVar) {
        this.f274517g = oVar;
        this.f274514d = i17;
        this.f274515e = bluetoothDevice;
        this.f274516f = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f274517g.f274520d.a(null, this.f274514d, this.f274515e.getAddress(), this.f274516f);
    }
}
