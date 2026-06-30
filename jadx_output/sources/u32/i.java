package u32;

/* loaded from: classes13.dex */
public final class i implements u32.a1 {

    /* renamed from: h, reason: collision with root package name */
    public static u32.i f424303h;

    /* renamed from: e, reason: collision with root package name */
    public final u32.x f424305e;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f424304d = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f424306f = new u32.b(this, u32.i1.a().f424310b.getSerialTag());

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Object f424307g = new java.lang.Object();

    public i(u32.x xVar) {
        this.f424305e = null;
        this.f424305e = xVar;
        f424303h = this;
    }

    public static boolean d(u32.i iVar, long j17) {
        iVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.BTDeviceManager", "startChannelImp deviceId = %d", java.lang.Long.valueOf(j17));
        if (v32.a.c("conneted_device", j17)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.exdevice.BTDeviceManager", "This deviceId is not call stop channel before startChannel, Call it");
            iVar.f(j17);
        }
        com.tencent.mm.plugin.exdevice.jni.Java2CExDevice.LongWrapper longWrapper = new com.tencent.mm.plugin.exdevice.jni.Java2CExDevice.LongWrapper();
        longWrapper.value = -1L;
        int createChannelV2 = com.tencent.mm.plugin.exdevice.jni.Java2CExDevice.createChannelV2(j17, longWrapper);
        u32.x xVar = iVar.f424305e;
        if (createChannelV2 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.BTDeviceManager", "Java2CExDevice.createChannelV2 Failed, ret = " + createChannelV2);
            ((u32.a2) xVar).g(j17, 1, 4, -1);
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.BTDeviceManager", "Create channel id is ok, deviceId = %d, channelId = %d", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(longWrapper.value));
        iVar.f424304d.put(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(longWrapper.value));
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.BTDeviceManager", "add the device to connected devices : [%d]", java.lang.Long.valueOf(j17));
        if (!v32.a.a("conneted_device", j17)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.BTDeviceManager", "addToSharedPreferences failed!!!");
            ((u32.a2) xVar).g(j17, 1, 4, -1);
            return false;
        }
        int startChannelServiceV2 = com.tencent.mm.plugin.exdevice.jni.Java2CExDevice.startChannelServiceV2(longWrapper.value);
        if (startChannelServiceV2 == 0) {
            return true;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.BTDeviceManager", "Java2CExDevice.startChannelServiceV2 Failed, ret = " + startChannelServiceV2);
        ((u32.a2) xVar).g(j17, 1, 4, -1);
        return false;
    }

    @Override // u32.a1
    public void a(int i17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.BTDeviceManager", "------onScanError------ error code = %d, error msg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i17));
        if (this.f424306f.post(new u32.a(this))) {
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.BTDeviceManager", "onScanError: mHandler.post failed!!!");
    }

    @Override // u32.a1
    public void b(java.lang.String str, java.lang.String str2, int i17, int i18, byte[] bArr) {
        u32.d dVar = new u32.d(str, str2, i18, bArr);
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f424306f;
        iz5.a.g(null, n3Var.sendMessage(n3Var.obtainMessage(1, 0, 0, dVar)));
    }

    @Override // u32.a1
    public void c(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.BTDeviceManager", "******onScanFinished******aBluetoothVersion = " + i17);
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f424306f;
        iz5.a.g(null, n3Var.sendMessage(n3Var.obtainMessage(2, 0, 0, null)));
    }

    public final long e(long j17) {
        java.util.HashMap hashMap = this.f424304d;
        if (!hashMap.containsValue(java.lang.Long.valueOf(j17))) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.BTDeviceManager", "Cannot find DeviceInfo by channelId");
            return -1L;
        }
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            if (j17 == ((java.lang.Long) entry.getValue()).longValue()) {
                return ((java.lang.Long) entry.getKey()).longValue();
            }
        }
        iz5.a.g(null, false);
        return -1L;
    }

    public final boolean f(long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.BTDeviceManager", "stopChannelImp deviceId = " + j17);
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.BTDeviceManager", "remove the device from connected devices : [%d]", java.lang.Long.valueOf(j17));
        if (!v32.a.d("conneted_device", j17)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.BTDeviceManager", "removeFromSharedPreferences failed!!!");
        }
        java.util.HashMap hashMap = this.f424304d;
        if (!hashMap.containsKey(java.lang.Long.valueOf(j17))) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.BTDeviceManager", "Cannot find deviceId in the map");
            return false;
        }
        com.tencent.mm.plugin.exdevice.jni.Java2CExDevice.stopChannelServiceV2(((java.lang.Long) hashMap.get(java.lang.Long.valueOf(j17))).longValue());
        com.tencent.mm.plugin.exdevice.jni.Java2CExDevice.destroyChannelV2(((java.lang.Long) hashMap.get(java.lang.Long.valueOf(j17))).longValue());
        return true;
    }
}
