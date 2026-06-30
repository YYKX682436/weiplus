package i11;

/* loaded from: classes13.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.map.geolocation.sapp.TencentLocationListener f287155d;

    public x(i11.u uVar, com.tencent.map.geolocation.sapp.TencentLocationListener tencentLocationListener) {
        this.f287155d = tencentLocationListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.map.geolocation.sapp.TencentLocationManager.getInstance(i11.u.f287150d, new android.util.Pair(com.tencent.map.geolocation.sapp.TencentLocationManager.TYPE_OAID, "")).removeUpdates(this.f287155d);
    }
}
