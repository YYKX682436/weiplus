package yn1;

/* loaded from: classes11.dex */
public final class b1 implements vn1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yn1.r2 f463615a;

    public b1(yn1.r2 r2Var) {
        this.f463615a = r2Var;
    }

    @Override // vn1.a
    public void a(boolean z17) {
        com.tencent.mars.xlog.Log.i("MM.Mig.MigrationPlatformImpl", "[BLE] Scanning started: " + z17);
    }

    @Override // vn1.a
    public void b(java.lang.String deviceId, byte[] data) {
        kotlin.jvm.internal.o.g(deviceId, "deviceId");
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mars.xlog.Log.i("MM.Mig.MigrationPlatformImpl", "[BLE] Message received from " + deviceId + ", length: " + data.length);
        yn1.r2 r2Var = this.f463615a;
        if (r2Var.f463812c == null) {
            com.tencent.mars.xlog.Log.e("MM.Mig.MigrationPlatformImpl", "[BLE] bleAuthKey is null");
            return;
        }
        bw5.l2 parseFrom = new bw5.l2().parseFrom(data);
        try {
            byte[] bArr = r2Var.f463812c;
            kotlin.jvm.internal.o.d(bArr);
            byte[] AesGcmDecrypt = com.tencent.mm.jni.utils.UtilsJni.AesGcmDecrypt(bArr, (parseFrom.f29609f[2] ? parseFrom.f29608e : com.tencent.mm.protobuf.g.f192155b).g());
            com.tencent.wechat.aff.migration.g gVar = r2Var.f463810a;
            if (gVar != null) {
                gVar.d(deviceId, (parseFrom.f29609f[1] ? parseFrom.f29607d : bw5.m2.BLENotifyLoginAndConnectReq).f30051d, AesGcmDecrypt);
            } else {
                kotlin.jvm.internal.o.o("callback");
                throw null;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MM.Mig.MigrationPlatformImpl", "[BLE] Error decrypting message: " + e17);
        }
    }

    @Override // vn1.a
    public void c(java.lang.String deviceId) {
        kotlin.jvm.internal.o.g(deviceId, "deviceId");
        com.tencent.mars.xlog.Log.i("MM.Mig.MigrationPlatformImpl", "[BLE] Device disconnected: ".concat(deviceId));
        com.tencent.wechat.aff.migration.g gVar = this.f463615a.f463810a;
        if (gVar != null) {
            gVar.J(deviceId);
        } else {
            kotlin.jvm.internal.o.o("callback");
            throw null;
        }
    }

    @Override // vn1.a
    public void d(java.lang.String deviceId, java.lang.String deviceName, int i17) {
        kotlin.jvm.internal.o.g(deviceId, "deviceId");
        kotlin.jvm.internal.o.g(deviceName, "deviceName");
        com.tencent.mars.xlog.Log.i("MM.Mig.MigrationPlatformImpl", "[BLE] Device discovered: " + deviceId + ", name: " + deviceName + ", rssi: " + i17);
        com.tencent.wechat.aff.migration.g gVar = this.f463615a.f463810a;
        if (gVar != null) {
            gVar.w(deviceId, deviceName, i17);
        } else {
            kotlin.jvm.internal.o.o("callback");
            throw null;
        }
    }

    @Override // vn1.a
    public void e(java.lang.String deviceId) {
        kotlin.jvm.internal.o.g(deviceId, "deviceId");
        com.tencent.mars.xlog.Log.i("MM.Mig.MigrationPlatformImpl", "[BLE] Device connected: ".concat(deviceId));
        com.tencent.wechat.aff.migration.g gVar = this.f463615a.f463810a;
        if (gVar != null) {
            gVar.A(deviceId);
        } else {
            kotlin.jvm.internal.o.o("callback");
            throw null;
        }
    }

    @Override // vn1.a
    public void f(boolean z17) {
        com.tencent.mars.xlog.Log.i("MM.Mig.MigrationPlatformImpl", "[BLE] Advertising started: " + z17);
    }
}
