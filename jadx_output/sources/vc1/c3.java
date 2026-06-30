package vc1;

/* loaded from: classes13.dex */
public class c3 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mapsdk.raster.model.Marker f434942d;

    /* renamed from: e, reason: collision with root package name */
    public double f434943e;

    /* renamed from: f, reason: collision with root package name */
    public double f434944f;

    /* renamed from: g, reason: collision with root package name */
    public double f434945g;

    /* renamed from: h, reason: collision with root package name */
    public double f434946h;

    /* renamed from: i, reason: collision with root package name */
    public float f434947i;

    /* renamed from: m, reason: collision with root package name */
    public float f434948m;

    /* renamed from: n, reason: collision with root package name */
    public float f434949n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f434950o;

    public c3(android.content.Context context) {
        super(context);
        this.f434943e = -1.0d;
        this.f434944f = -1.0d;
        this.f434945g = -1.0d;
        this.f434946h = -1.0d;
        this.f434947i = 900.0f;
        this.f434948m = 900.0f;
        this.f434949n = 0.0f;
        ((android.widget.ImageView) android.view.View.inflate(context, com.tencent.mm.R.layout.a3n, this).findViewById(com.tencent.mm.R.id.f487387oi0)).requestFocus();
    }

    private float getHeading() {
        return this.f434950o ? this.f434947i : this.f434949n;
    }

    public void a(float f17, float f18) {
        this.f434949n = f18;
        float heading = getHeading();
        com.tencent.mapsdk.raster.model.Marker marker = this.f434942d;
        if (marker != null) {
            marker.setRotation(heading);
        }
    }

    public double getLatitude() {
        return this.f434943e;
    }

    public double getLongitude() {
        return this.f434944f;
    }

    public com.tencent.mapsdk.raster.model.Marker getRealMarker() {
        return this.f434942d;
    }
}
