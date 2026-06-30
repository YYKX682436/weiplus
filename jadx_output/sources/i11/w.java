package i11;

/* loaded from: classes13.dex */
public class w implements java.lang.Runnable {
    public w(i11.u uVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.map.geolocation.sapp.TencentLocationManager.getInstance(i11.u.f287150d, new android.util.Pair(com.tencent.map.geolocation.sapp.TencentLocationManager.TYPE_OAID, "")).removeUpdates(null);
    }
}
