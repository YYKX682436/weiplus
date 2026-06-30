package hq1;

/* loaded from: classes7.dex */
public class i0 extends com.tencent.mm.sdk.platformtools.d8 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f283132h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ hq1.l0 f283133i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ hq1.m0 f283134j;

    public i0(hq1.m0 m0Var, boolean z17, hq1.l0 l0Var) {
        this.f283134j = m0Var;
        this.f283132h = z17;
        this.f283133i = l0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        if (r1 == null) goto L35;
     */
    @Override // com.tencent.mm.sdk.platformtools.d8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b() {
        /*
            r14 = this;
            hq1.m0 r0 = r14.f283134j
            android.content.Context r1 = r0.f283161a
            r2 = 0
            java.lang.String r3 = "MicroMsg.exdevice.NewBluetoothLEScanner"
            if (r1 != 0) goto L10
            java.lang.String r1 = "not found context"
            com.tencent.mars.xlog.Log.e(r3, r1)
            r1 = r2
            goto L1a
        L10:
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            java.lang.String r4 = "android.hardware.bluetooth_le"
            boolean r1 = r1.hasSystemFeature(r4)
        L1a:
            if (r1 != 0) goto L24
            java.lang.String r0 = "this phone is not support BLE"
            com.tencent.mars.xlog.Log.e(r3, r0)
            goto Lcb
        L24:
            android.bluetooth.le.BluetoothLeScanner r1 = r0.f283165e
            if (r1 != 0) goto L41
            android.bluetooth.BluetoothManager r1 = r0.f283164d
            android.bluetooth.BluetoothAdapter r1 = r1.getAdapter()
            if (r1 == 0) goto L3a
            android.bluetooth.le.BluetoothLeScanner r1 = r1.getBluetoothLeScanner()
            r0.f283165e = r1
            if (r1 != 0) goto L41
            goto Lcb
        L3a:
            java.lang.String r0 = "not found BluetoothScannner"
            com.tencent.mars.xlog.Log.e(r3, r0)
            goto Lcb
        L41:
            boolean r1 = lq1.a.e()
            r4 = 1
            if (r1 != 0) goto L4f
            java.lang.String r0 = "Bluetooth state off"
            com.tencent.mars.xlog.Log.i(r3, r0)
            goto Lca
        L4f:
            boolean r1 = r14.f283132h
            hq1.l0 r5 = r14.f283133i
            if (r1 == 0) goto L9a
            java.lang.String r1 = "[BluetoothTrace] start scan"
            com.tencent.mars.xlog.Log.i(r3, r1)
            java.lang.Throwable r1 = new java.lang.Throwable
            r1.<init>()
            java.lang.String r6 = "[BluetoothTrace] ble scan stacktrace"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.tencent.mars.xlog.Log.printErrStackTrace(r3, r1, r6, r2)
            boolean r1 = r0.f283163c
            if (r1 == 0) goto L73
            java.lang.String r1 = "ble has scan. just add callback and return"
            com.tencent.mars.xlog.Log.w(r3, r1)
            r0.a(r5)
            goto Lca
        L73:
            android.bluetooth.le.BluetoothLeScanner r6 = r0.f283165e
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r1.add(r0)
            java.util.Collections.reverse(r1)
            java.lang.Object[] r7 = r1.toArray()
            java.lang.String r8 = "com/tencent/mm/plugin/bluetooth/sdk/ble/NewBluetoothLEScanner"
            java.lang.String r9 = "scanImpl"
            java.lang.String r10 = "(ZLcom/tencent/mm/plugin/bluetooth/sdk/ble/NewBluetoothLEScanner$NewBleScanCallback;)Z"
            java.lang.String r11 = "android/bluetooth/le/BluetoothLeScanner"
            java.lang.String r12 = "startScan"
            java.lang.String r13 = "(Landroid/bluetooth/le/ScanCallback;)V"
            yj0.a.k(r6, r7, r8, r9, r10, r11, r12, r13)
            r0.a(r5)
            r0.f283163c = r4
            goto Lca
        L9a:
            boolean r1 = r0.f283163c
            java.util.ArrayList r6 = r0.f283162b
            if (r1 != 0) goto Lb2
            int r0 = r6.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "scan haven't started. just return, callback size = %d"
            com.tencent.mars.xlog.Log.w(r3, r1, r0)
            goto Lca
        Lb2:
            if (r5 != 0) goto Lba
            java.lang.String r1 = "callback is null"
            com.tencent.mars.xlog.Log.e(r3, r1)
            goto Lbd
        Lba:
            r6.remove(r5)
        Lbd:
            int r1 = r6.size()
            if (r1 > 0) goto Lca
            android.bluetooth.le.BluetoothLeScanner r1 = r0.f283165e
            r1.stopScan(r0)
            r0.f283163c = r2
        Lca:
            r2 = r4
        Lcb:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: hq1.i0.b():java.lang.Object");
    }
}
