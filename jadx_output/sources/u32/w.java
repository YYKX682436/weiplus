package u32;

/* loaded from: classes13.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f424390a = new java.util.HashMap();

    public boolean a(long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExdeviceInfoManager", "delDeviceAuthFlag, device id = %d", java.lang.Long.valueOf(j17));
        u32.v d17 = d(j17);
        if (d17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExdeviceInfoManager", "getExDeviceInfo failed!!!");
            return false;
        }
        d17.f424384f = false;
        return true;
    }

    public final byte[] b(long j17, int i17) {
        if (j17 < 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExdeviceInfoManager", "device is lower than 0");
            return null;
        }
        java.util.HashMap hashMap = this.f424390a;
        u32.v vVar = (u32.v) hashMap.get(java.lang.Long.valueOf(j17));
        if (vVar == null) {
            f(j17);
            vVar = (u32.v) hashMap.get(java.lang.Long.valueOf(j17));
        }
        if (vVar == null) {
            return null;
        }
        if (i17 == 1) {
            return vVar.f424382d;
        }
        if (i17 == 2) {
            return vVar.f424380b;
        }
        if (i17 != 3) {
            return null;
        }
        return vVar.f424381c;
    }

    public int c(long j17) {
        java.util.HashMap hashMap = this.f424390a;
        if (hashMap.containsKey(java.lang.Long.valueOf(j17))) {
            return ((u32.v) hashMap.get(java.lang.Long.valueOf(j17))).f424383e;
        }
        return 0;
    }

    public u32.v d(long j17) {
        java.util.HashMap hashMap = this.f424390a;
        if (!hashMap.containsKey(java.lang.Long.valueOf(j17))) {
            f(j17);
        }
        return (u32.v) hashMap.get(java.lang.Long.valueOf(j17));
    }

    public u32.v e(long j17) {
        java.util.HashMap hashMap = this.f424390a;
        if (hashMap.containsKey(java.lang.Long.valueOf(j17))) {
            return (u32.v) hashMap.get(java.lang.Long.valueOf(j17));
        }
        u32.v vVar = new u32.v();
        vVar.f424379a = j17;
        vVar.f424382d = null;
        vVar.f424380b = null;
        vVar.f424381c = null;
        vVar.f424383e = 0;
        vVar.f424384f = false;
        vVar.f424385g = 0L;
        hashMap.put(java.lang.Long.valueOf(j17), vVar);
        return vVar;
    }

    public final void f(long j17) {
        v32.b b17 = com.tencent.mm.plugin.exdevice.model.l3.Ui().b1(j17 + "");
        if (b17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExdeviceInfoManager", "get harddevice info from db failed : %d", java.lang.Long.valueOf(j17));
            return;
        }
        u32.v vVar = new u32.v();
        vVar.f424379a = j17;
        vVar.f424382d = b17.field_authBuf;
        vVar.f424380b = b17.field_sessionKey;
        vVar.f424381c = b17.field_sessionBuf;
        vVar.f424383e = 0;
        vVar.f424384f = false;
        this.f424390a.put(java.lang.Long.valueOf(j17), vVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExdeviceInfoManager", "not contains the device info, device id = %d, load from db", java.lang.Long.valueOf(j17));
    }

    public boolean g(long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExdeviceInfoManager", "isDeviceAuthed, device id = %d", java.lang.Long.valueOf(j17));
        u32.v d17 = d(j17);
        if (d17 != null) {
            return d17.f424384f;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExdeviceInfoManager", "getExDeviceInfo failed!!!");
        return false;
    }

    public final void h(long j17, byte[] bArr, int i17) {
        if (j17 < 0 || bArr == null || bArr.length == 0) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = java.lang.Long.valueOf(j17);
            objArr[1] = java.lang.Boolean.valueOf(bArr == null);
            objArr[2] = java.lang.Integer.valueOf(bArr == null ? -1 : bArr.length);
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExdeviceInfoManager", "device id low than 0 or authbuf is null, deviceid = %d, buffer == null : %b, buffer length = %d", objArr);
            return;
        }
        java.util.HashMap hashMap = this.f424390a;
        u32.v vVar = (u32.v) hashMap.get(java.lang.Long.valueOf(j17));
        if (vVar == null) {
            vVar = new u32.v();
            vVar.f424379a = j17;
        }
        if (i17 == 1) {
            vVar.f424382d = bArr;
        } else if (i17 == 2) {
            vVar.f424380b = bArr;
        } else if (i17 != 3) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExdeviceInfoManager", "unkown buffer type : %d", java.lang.Integer.valueOf(i17));
        } else {
            vVar.f424381c = bArr;
        }
        hashMap.put(java.lang.Long.valueOf(j17), vVar);
    }

    public boolean i(long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExdeviceInfoManager", "setDeviceAuthFlag, device id = %d", java.lang.Long.valueOf(j17));
        u32.v d17 = d(j17);
        if (d17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExdeviceInfoManager", "getExDeviceInfo failed!!!");
            return false;
        }
        d17.f424384f = true;
        return true;
    }
}
