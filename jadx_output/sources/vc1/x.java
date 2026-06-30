package vc1;

/* loaded from: classes13.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vc1.q2 f435193d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o91.d f435194e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f435195f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mapsdk.raster.model.Marker f435196g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f435197h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f435198i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f435199m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f435200n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f435201o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ vc1.p1 f435202p;

    public x(vc1.p1 p1Var, vc1.q2 q2Var, o91.d dVar, java.lang.String str, com.tencent.mapsdk.raster.model.Marker marker, android.widget.ImageView imageView, android.widget.FrameLayout frameLayout, boolean z17, float f17, float f18) {
        this.f435202p = p1Var;
        this.f435193d = q2Var;
        this.f435194e = dVar;
        this.f435195f = str;
        this.f435196g = marker;
        this.f435197h = imageView;
        this.f435198i = frameLayout;
        this.f435199m = z17;
        this.f435200n = f17;
        this.f435201o = f18;
    }

    @Override // java.lang.Runnable
    public void run() {
        vc1.q2 q2Var = this.f435193d;
        com.tencent.mars.xlog.Log.i("MicroMsg.Map.DefaultTencentMapView", "iconPath is %s", q2Var.f435134e);
        o91.d dVar = this.f435194e;
        if (dVar == null) {
            this.f435202p.T(this.f435195f, this.f435196g, this.f435197h, this.f435198i, this.f435199m);
            com.tencent.mars.xlog.Log.e("MicroMsg.Map.DefaultTencentMapView", "iconPath is null or imageLoader is null");
        } else {
            java.lang.String str = q2Var.f435134e;
            ((qd.b) dVar).c(str, null, new vc1.w(this, str));
        }
    }
}
