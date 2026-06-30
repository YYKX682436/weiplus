package pb1;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.ScanResultCompat f353127a;

    public a(com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.ScanResultCompat theResult) {
        kotlin.jvm.internal.o.g(theResult, "theResult");
        this.f353127a = theResult;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0050 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            java.lang.Class<pb1.a> r1 = pb1.a.class
            if (r6 == 0) goto Ld
            java.lang.Class r2 = r6.getClass()
            goto Le
        Ld:
            r2 = 0
        Le:
            boolean r1 = kotlin.jvm.internal.o.b(r1, r2)
            r2 = 0
            if (r1 != 0) goto L16
            return r2
        L16:
            java.lang.String r1 = "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.BleScanPrinter.Companion.ScanResult"
            kotlin.jvm.internal.o.e(r6, r1)
            pb1.a r6 = (pb1.a) r6
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.ScanResultCompat r1 = r5.f353127a
            android.bluetooth.BluetoothDevice r3 = r1.a()
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.ScanResultCompat r6 = r6.f353127a
            android.bluetooth.BluetoothDevice r4 = r6.a()
            boolean r3 = pb1.w.b(r3, r4)
            if (r3 == 0) goto L4c
            pb1.z r1 = r1.f80107e
            pb1.z r6 = r6.f80107e
            if (r1 != 0) goto L37
            if (r6 == 0) goto L45
        L37:
            if (r1 == 0) goto L47
            if (r6 == 0) goto L47
            byte[] r1 = r1.f353170g
            byte[] r6 = r6.f353170g
            boolean r6 = java.util.Arrays.equals(r1, r6)
            if (r6 == 0) goto L47
        L45:
            r6 = r0
            goto L48
        L47:
            r6 = r2
        L48:
            if (r6 == 0) goto L4c
            r6 = r0
            goto L4d
        L4c:
            r6 = r2
        L4d:
            if (r6 != 0) goto L50
            return r2
        L50:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: pb1.a.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        java.lang.Object[] objArr = new java.lang.Object[2];
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.ScanResultCompat scanResultCompat = this.f353127a;
        objArr[0] = scanResultCompat.a();
        pb1.z zVar = scanResultCompat.f80107e;
        objArr[1] = java.lang.Integer.valueOf(java.util.Arrays.hashCode(zVar != null ? zVar.f353170g : null));
        return java.util.Arrays.hashCode(objArr);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("{rssi: ");
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.ScanResultCompat scanResultCompat = this.f353127a;
        sb6.append(scanResultCompat.f80108f);
        sb6.append(", timestampNanos: ");
        sb6.append(scanResultCompat.f80109g);
        sb6.append('}');
        return sb6.toString();
    }
}
