package gl;

/* loaded from: classes14.dex */
public final class e implements android.bluetooth.BluetoothProfile.ServiceListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gl.i f272737a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.bluetooth.BluetoothAdapter f272738b;

    public e(gl.i iVar, android.bluetooth.BluetoothAdapter bluetoothAdapter) {
        this.f272737a = iVar;
        this.f272738b = bluetoothAdapter;
    }

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public void onServiceConnected(int i17, android.bluetooth.BluetoothProfile bluetoothProfile) {
        kotlin.jvm.internal.o.e(bluetoothProfile, "null cannot be cast to non-null type android.bluetooth.BluetoothHeadset");
        gl.i iVar = this.f272737a;
        iVar.f272761o = (android.bluetooth.BluetoothHeadset) bluetoothProfile;
        com.tencent.mars.xlog.Log.i("MicroMsg.AudioRouteManager", "bt onServiceConnected " + iVar.f272761o);
    }

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public void onServiceDisconnected(int i17) {
        gl.i iVar = this.f272737a;
        android.bluetooth.BluetoothHeadset bluetoothHeadset = iVar.f272761o;
        if (bluetoothHeadset == null) {
            return;
        }
        this.f272738b.closeProfileProxy(1, bluetoothHeadset);
        com.tencent.mars.xlog.Log.i("MicroMsg.AudioRouteManager", "bt closeProfileProxy " + bluetoothHeadset);
        iVar.f272761o = null;
    }
}
