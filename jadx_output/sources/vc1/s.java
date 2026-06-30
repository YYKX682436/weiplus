package vc1;

/* loaded from: classes13.dex */
public class s implements o91.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f435159a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f435160b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f435161c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f435162d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mapsdk.raster.model.Marker f435163e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f435164f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f435165g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ vc1.p1 f435166h;

    public s(vc1.p1 p1Var, float f17, float f18, android.widget.ImageView imageView, java.lang.String str, com.tencent.mapsdk.raster.model.Marker marker, android.widget.FrameLayout frameLayout, boolean z17) {
        this.f435166h = p1Var;
        this.f435159a = f17;
        this.f435160b = f18;
        this.f435161c = imageView;
        this.f435162d = str;
        this.f435163e = marker;
        this.f435164f = frameLayout;
        this.f435165g = z17;
    }

    @Override // o91.b
    public void a(android.graphics.Bitmap bitmap) {
        if (bitmap == null) {
            this.f435166h.T(this.f435162d, this.f435163e, this.f435161c, this.f435164f, this.f435165g);
            return;
        }
        vc1.p1 p1Var = this.f435166h;
        p1Var.t(this.f435159a, this.f435160b, bitmap, this.f435161c);
        p1Var.Z(this.f435162d, this.f435163e, this.f435164f);
    }
}
