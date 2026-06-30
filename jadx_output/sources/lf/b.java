package lf;

/* loaded from: classes13.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.map.geolocation.sapp.TencentLocationListener f318172d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.map.geolocation.sapp.TencentLocation f318173e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f318174f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f318175g;

    public b(lf.c cVar, com.tencent.map.geolocation.sapp.TencentLocationListener tencentLocationListener, com.tencent.map.geolocation.sapp.TencentLocation tencentLocation, int i17, java.lang.String str) {
        this.f318172d = tencentLocationListener;
        this.f318173e = tencentLocation;
        this.f318174f = i17;
        this.f318175g = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f318172d.onLocationChanged(this.f318173e, this.f318174f, this.f318175g);
    }
}
