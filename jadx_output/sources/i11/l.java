package i11;

/* loaded from: classes13.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f287121d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ double f287122e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ double f287123f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f287124g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ double f287125h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ double f287126i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ double f287127m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ i11.m f287128n;

    public l(i11.m mVar, boolean z17, double d17, double d18, int i17, double d19, double d27, double d28) {
        this.f287128n = mVar;
        this.f287121d = z17;
        this.f287122e = d17;
        this.f287123f = d18;
        this.f287124g = i17;
        this.f287125h = d19;
        this.f287126i = d27;
        this.f287127m = d28;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.os.Bundle bundle = new android.os.Bundle();
        i11.m mVar = this.f287128n;
        bundle.putString("indoor_building_floor", mVar.f287129b.f287109r);
        bundle.putString("indoor_building_id", mVar.f287129b.f287108q);
        bundle.putInt("indoor_building_type", mVar.f287129b.f287110s);
        i11.h.c(mVar.f287129b, this.f287121d, this.f287122e, this.f287123f, this.f287124g, this.f287125h, this.f287126i, this.f287127m, bundle);
    }
}
