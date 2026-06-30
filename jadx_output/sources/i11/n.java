package i11;

/* loaded from: classes13.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f287130d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ double f287131e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ double f287132f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f287133g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ double f287134h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ double f287135i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ double f287136m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ i11.o f287137n;

    public n(i11.o oVar, boolean z17, double d17, double d18, int i17, double d19, double d27, double d28) {
        this.f287137n = oVar;
        this.f287130d = z17;
        this.f287131e = d17;
        this.f287132f = d18;
        this.f287133g = i17;
        this.f287134h = d19;
        this.f287135i = d27;
        this.f287136m = d28;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.os.Bundle bundle = new android.os.Bundle();
        i11.o oVar = this.f287137n;
        bundle.putString("indoor_building_floor", oVar.f287138b.f287109r);
        bundle.putString("indoor_building_id", oVar.f287138b.f287108q);
        bundle.putInt("indoor_building_type", oVar.f287138b.f287110s);
        i11.h.c(oVar.f287138b, this.f287130d, this.f287131e, this.f287132f, this.f287133g, this.f287134h, this.f287135i, this.f287136m, bundle);
    }
}
