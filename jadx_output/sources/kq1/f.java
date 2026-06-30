package kq1;

/* loaded from: classes13.dex */
public class f extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f311241a;

    public f(java.lang.String str, kq1.n nVar) {
        super(str);
        this.f311241a = null;
        this.f311241a = new java.lang.ref.WeakReference(nVar);
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        kq1.n nVar = (kq1.n) this.f311241a.get();
        if (nVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.exdevice.BluetoothSDKManager", "null == BluetoothSdkManager");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.BluetoothSDKManager", "handleMessage Message.What = " + message.what);
        switch (message.what) {
            case 0:
                kq1.m mVar = (kq1.m) message.obj;
                ((u32.p) nVar.f311257d).d(mVar.f311245a, mVar.f311246b);
                return;
            case 1:
                kq1.k kVar = (kq1.k) message.obj;
                kq1.o oVar = nVar.f311257d;
                long j17 = kVar.f311248a;
                ((u32.p) oVar).getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.BluetoothSDKAdapter", "---onRecv--- sessionId = " + j17);
                com.tencent.mm.plugin.exdevice.jni.Java2CExDevice.onBluetoothRecvDataV2(j17, kVar.f311249b);
                return;
            case 2:
                kq1.o oVar2 = nVar.f311257d;
                int i17 = message.arg1;
                u32.p pVar = (u32.p) oVar2;
                pVar.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.BluetoothSDKAdapter", "---onScanFinished--- aBluetoothVersion =%d", java.lang.Integer.valueOf(i17));
                java.util.Vector vector = pVar.f424341b;
                if (vector.isEmpty()) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.exdevice.BluetoothSDKAdapter", "mScanCallbackList is empty");
                    return;
                }
                java.util.Iterator it = vector.iterator();
                while (it.hasNext()) {
                    u32.a1 a1Var = (u32.a1) it.next();
                    if (a1Var != null) {
                        a1Var.c(i17);
                    }
                }
                vector.clear();
                return;
            case 3:
                kq1.l lVar = (kq1.l) message.obj;
                kq1.o oVar3 = nVar.f311257d;
                java.lang.String str = lVar.f311250a;
                java.lang.String str2 = lVar.f311251b;
                int i18 = message.arg1;
                int i19 = lVar.f311252c;
                byte[] bArr = lVar.f311253d;
                java.util.Vector vector2 = ((u32.p) oVar3).f424341b;
                if (vector2.isEmpty()) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.exdevice.BluetoothSDKAdapter", "mScanCallbackList is empty");
                    return;
                }
                java.util.Iterator it6 = vector2.iterator();
                while (it6.hasNext()) {
                    ((u32.a1) it6.next()).b(str, str2, i18, i19, bArr);
                }
                return;
            case 4:
                kq1.i iVar = (kq1.i) message.obj;
                ((u32.p) nVar.f311257d).c(iVar.f311245a, iVar.f311246b);
                return;
            case 5:
                kq1.j jVar = (kq1.j) message.obj;
                kq1.o oVar4 = nVar.f311257d;
                long j18 = jVar.f311247a;
                ((u32.p) oVar4).getClass();
                com.tencent.mm.plugin.exdevice.jni.Java2CExDevice.onBluetoothErrorV2(j18, 0);
                return;
            case 6:
                kq1.g gVar = (kq1.g) message.obj;
                kq1.o oVar5 = nVar.f311257d;
                long j19 = gVar.f311243b;
                long j27 = gVar.f311242a;
                long j28 = gVar.f311244c;
                u32.p pVar2 = (u32.p) oVar5;
                pVar2.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.BluetoothSDKAdapter", "---onSessionCreate--- aSessionId = " + j19 + " aDeviceID = " + j27);
                java.util.HashMap hashMap = pVar2.f424342c;
                iz5.a.g(null, hashMap.containsKey(java.lang.Long.valueOf(j27)));
                java.util.HashMap hashMap2 = pVar2.f424343d;
                if (!hashMap2.containsKey(java.lang.Long.valueOf(j19))) {
                    hashMap2.put(java.lang.Long.valueOf(j19), (java.lang.Integer) hashMap.get(java.lang.Long.valueOf(j27)));
                }
                com.tencent.mm.plugin.exdevice.jni.Java2CExDevice.onBluetoothSessionCreatedV2(j27, j28, j19);
                return;
            default:
                return;
        }
    }
}
