package i22;

/* loaded from: classes15.dex */
public final class b extends i22.w {

    /* renamed from: f, reason: collision with root package name */
    public final float f287929f;

    /* renamed from: g, reason: collision with root package name */
    public final float f287930g;

    public b() {
        android.content.res.Resources resources = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources();
        this.f287929f = resources.getDimension(com.tencent.mm.R.dimen.f480383we);
        this.f287930g = resources.getDimension(com.tencent.mm.R.dimen.f479672c9);
        d();
    }

    @Override // i22.w
    public float a() {
        return 0.0f;
    }

    @Override // i22.w
    public float b() {
        return this.f287929f;
    }

    @Override // i22.w
    public float c() {
        return this.f287930g;
    }

    @Override // i22.w
    public void d() {
        this.f288060b = (int) ((com.tencent.mm.sdk.platformtools.x2.f193075e.getDisplayMetrics().widthPixels - (2 * 0.0f)) / (this.f287929f + this.f287930g));
    }
}
