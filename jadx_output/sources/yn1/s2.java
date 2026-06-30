package yn1;

/* loaded from: classes11.dex */
public final class s2 implements vn1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yn1.a4 f463829a;

    public s2(yn1.a4 a4Var) {
        this.f463829a = a4Var;
    }

    @Override // vn1.a
    public void a(boolean z17) {
        com.tencent.mars.xlog.Log.i(this.f463829a.f463606a, "[BLE] Scanning started: " + z17);
    }

    @Override // vn1.a
    public void b(java.lang.String deviceId, byte[] data) {
        kotlin.jvm.internal.o.g(deviceId, "deviceId");
        kotlin.jvm.internal.o.g(data, "data");
        yn1.a4 a4Var = this.f463829a;
        com.tencent.mars.xlog.Log.i(a4Var.f463606a, "[BLE] Message received from " + deviceId + ", length: " + data.length);
        byte[] bArr = a4Var.f463610e;
        java.lang.String str = a4Var.f463606a;
        if (bArr == null) {
            com.tencent.mars.xlog.Log.e(str, "[BLE] bleAuthKey is null");
            return;
        }
        try {
            bw5.l2 parseFrom = new bw5.l2().parseFrom(data);
            byte[] bArr2 = a4Var.f463610e;
            kotlin.jvm.internal.o.d(bArr2);
            byte[] AesGcmDecrypt = com.tencent.mm.jni.utils.UtilsJni.AesGcmDecrypt(bArr2, (parseFrom.f29609f[2] ? parseFrom.f29608e : com.tencent.mm.protobuf.g.f192155b).g());
            com.tencent.wechat.aff.migration.a aVar = a4Var.f463609d;
            if (aVar != null) {
                aVar.d(deviceId, (parseFrom.f29609f[1] ? parseFrom.f29607d : bw5.m2.BLENotifyLoginAndConnectReq).f30051d, AesGcmDecrypt);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(str, "[BLE] Error decrypting message: " + e17);
        }
    }

    @Override // vn1.a
    public void c(java.lang.String deviceId) {
        kotlin.jvm.internal.o.g(deviceId, "deviceId");
        yn1.a4 a4Var = this.f463829a;
        com.tencent.mars.xlog.Log.i(a4Var.f463606a, "[BLE] Device disconnected: ".concat(deviceId));
        com.tencent.wechat.aff.migration.a aVar = a4Var.f463609d;
        if (aVar != null) {
            aVar.J(deviceId);
        }
    }

    @Override // vn1.a
    public void d(java.lang.String deviceId, java.lang.String deviceName, int i17) {
        kotlin.jvm.internal.o.g(deviceId, "deviceId");
        kotlin.jvm.internal.o.g(deviceName, "deviceName");
        yn1.a4 a4Var = this.f463829a;
        com.tencent.mars.xlog.Log.i(a4Var.f463606a, "[BLE] Device discovered: " + deviceId + ", name: " + deviceName + ", rssi: " + i17);
        com.tencent.wechat.aff.migration.a aVar = a4Var.f463609d;
        if (aVar != null) {
            aVar.w(deviceId, deviceName, i17);
        }
    }

    @Override // vn1.a
    public void e(java.lang.String deviceId) {
        kotlin.jvm.internal.o.g(deviceId, "deviceId");
        yn1.a4 a4Var = this.f463829a;
        com.tencent.mars.xlog.Log.i(a4Var.f463606a, "[BLE] Device connected: ".concat(deviceId));
        com.tencent.wechat.aff.migration.a aVar = a4Var.f463609d;
        if (aVar != null) {
            aVar.A(deviceId);
        }
    }

    @Override // vn1.a
    public void f(boolean z17) {
        com.tencent.mars.xlog.Log.i(this.f463829a.f463606a, "[BLE] Advertising started: " + z17);
    }
}
