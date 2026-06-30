package ix2;

/* loaded from: classes10.dex */
public final class d extends lr.o0 {

    /* renamed from: f, reason: collision with root package name */
    public final float f295353f;

    /* renamed from: g, reason: collision with root package name */
    public final float f295354g;

    /* renamed from: h, reason: collision with root package name */
    public final float f295355h;

    public d() {
        android.content.res.Resources resources = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources();
        this.f295353f = resources.getDimension(com.tencent.mm.R.dimen.f479706d1);
        this.f295354g = resources.getDimension(com.tencent.mm.R.dimen.f479691cq);
        this.f295355h = resources.getDimension(com.tencent.mm.R.dimen.f479688cn) - 1;
        resources.getDimension(com.tencent.mm.R.dimen.f479648bn);
        this.f320561b = 5;
        e();
    }

    @Override // lr.o0
    public float a() {
        return this.f295354g;
    }

    @Override // lr.o0
    public float b() {
        return this.f295353f;
    }

    @Override // lr.o0
    public float c() {
        return this.f295355h;
    }
}
