package i11;

/* loaded from: classes13.dex */
public class v implements com.tencent.map.geolocation.sapp.internal.LocationLogCallback {
    public v(i11.u uVar) {
    }

    @Override // com.tencent.map.geolocation.sapp.internal.LocationLogCallback
    public void onLog(int i17, java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        if (i17 == 4) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SLocationManager", "tag:%s msg:%s", str, str2);
            return;
        }
        if (i17 == 5) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SLocationManager", "tag:%s msg:%s", str, str2);
            return;
        }
        if (i17 != 6) {
            return;
        }
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = str;
        objArr[1] = str2;
        objArr[2] = th6 != null ? th6.getMessage() : "";
        com.tencent.mars.xlog.Log.e("MicroMsg.SLocationManager", "tag:%s msg:%s th:%s", objArr);
    }
}
