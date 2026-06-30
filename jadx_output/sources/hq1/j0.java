package hq1;

/* loaded from: classes7.dex */
public class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.bluetooth.BluetoothDevice f283147d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f283148e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ byte[] f283149f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ hq1.m0 f283150g;

    public j0(hq1.m0 m0Var, android.bluetooth.BluetoothDevice bluetoothDevice, int i17, byte[] bArr) {
        this.f283150g = m0Var;
        this.f283147d = bluetoothDevice;
        this.f283148e = i17;
        this.f283149f = bArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = 0;
        while (true) {
            hq1.m0 m0Var = this.f283150g;
            if (i17 >= m0Var.f283162b.size()) {
                return;
            }
            hq1.g gVar = (hq1.g) ((hq1.l0) m0Var.f283162b.get(i17));
            gVar.getClass();
            android.bluetooth.BluetoothDevice bluetoothDevice = this.f283147d;
            bluetoothDevice.getName();
            bluetoothDevice.getAddress();
            a42.i.h(bluetoothDevice.getAddress());
            gVar.f283107a.f283138d.post(new hq1.e(gVar, bluetoothDevice, this.f283148e, this.f283149f));
            i17++;
        }
    }
}
