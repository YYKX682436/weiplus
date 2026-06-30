package i22;

/* loaded from: classes15.dex */
public final class b1 extends i22.w {

    /* renamed from: f, reason: collision with root package name */
    public final float f287945f;

    /* renamed from: g, reason: collision with root package name */
    public final float f287946g;

    /* renamed from: h, reason: collision with root package name */
    public final float f287947h;

    public b1() {
        android.content.res.Resources resources = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources();
        this.f287945f = resources.getDimension(com.tencent.mm.R.dimen.f480386wh);
        this.f287946g = resources.getDimension(com.tencent.mm.R.dimen.f479688cn);
        this.f287947h = resources.getDimension(com.tencent.mm.R.dimen.f479738dv);
        this.f288063e = (int) resources.getDimension(com.tencent.mm.R.dimen.f480385wg);
        this.f288060b = 4;
        d();
    }

    @Override // i22.w
    public float a() {
        return this.f287946g;
    }

    @Override // i22.w
    public float b() {
        return this.f287945f;
    }

    @Override // i22.w
    public float c() {
        return this.f287947h;
    }
}
