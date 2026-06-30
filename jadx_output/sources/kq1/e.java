package kq1;

/* loaded from: classes13.dex */
public class e extends hq1.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kq1.n f311240a;

    public e(kq1.n nVar) {
        this.f311240a = nVar;
    }

    @Override // hq1.h
    public void a(long j17, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.BluetoothSDKManager", "***BLE onConnected*** SessionId = " + j17 + " Connected = " + z17);
        iz5.a.g(null, kq1.n.a(this.f311240a, 4, 0, 0, new kq1.i(j17, z17)));
    }

    @Override // hq1.h
    public void b(long j17, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.BluetoothSDKManager", "***BLE onSend*** SessionId = " + j17 + " success = " + z17);
        iz5.a.g(null, kq1.n.a(this.f311240a, 0, 0, 0, new kq1.m(j17, z17)));
    }
}
