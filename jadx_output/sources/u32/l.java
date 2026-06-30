package u32;

/* loaded from: classes13.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u32.p f424319d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f424320e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f424321f;

    public l(u32.p pVar, long j17, long j18) {
        this.f424319d = pVar;
        this.f424320e = j17;
        this.f424321f = j18;
    }

    @Override // java.lang.Runnable
    public void run() {
        int intValue;
        long j17 = this.f424320e;
        long j18 = this.f424321f;
        u32.p pVar = this.f424319d;
        java.util.HashMap hashMap = pVar.f424342c;
        if (hashMap.containsKey(java.lang.Long.valueOf(j17))) {
            pVar.f424340a.b(j17, j18, ((java.lang.Integer) hashMap.get(java.lang.Long.valueOf(j17))).intValue());
            return;
        }
        java.util.HashMap hashMap2 = u32.i1.a().f424309a;
        if (hashMap2.containsKey(java.lang.Long.valueOf(j17))) {
            intValue = ((java.lang.Integer) hashMap2.get(java.lang.Long.valueOf(j17))).intValue();
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.MMExDevicePushCore", "getBluetoothVersionByDeviceId Failed!!! Cannot find BLuetoothVersion by DeviceInfo(%d)", java.lang.Long.valueOf(j17));
            intValue = -1;
        }
        boolean z17 = true;
        iz5.a.g(null, -1 != intValue);
        java.lang.String f17 = a42.i.f(j17);
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.BluetoothSDKAdapter", "insertDeviceIdTypeMap deviceid = %s, BTVersion = %d", f17, java.lang.Integer.valueOf(intValue));
        iz5.a.d(null, f17);
        if (1 != intValue && intValue != 0) {
            z17 = false;
        }
        iz5.a.g(null, z17);
        long h17 = a42.i.h(f17);
        if (!hashMap.containsKey(java.lang.Long.valueOf(h17))) {
            hashMap.put(java.lang.Long.valueOf(h17), java.lang.Integer.valueOf(intValue));
        }
        pVar.f424340a.b(j17, j18, intValue);
    }
}
