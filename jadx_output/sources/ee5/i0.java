package ee5;

/* loaded from: classes9.dex */
public final class i0 implements l01.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zd5.k f251923d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ae5.a f251924e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ee5.n0 f251925f;

    public i0(zd5.k kVar, ae5.a aVar, ee5.n0 n0Var) {
        this.f251923d = kVar;
        this.f251924e = aVar;
        this.f251925f = n0Var;
    }

    @Override // l01.u
    public void b() {
        n11.a.b().h(this.f251924e.f4385n, ((ee5.a) this.f251923d).f251789m, this.f251925f.f251977s);
    }

    @Override // l01.u
    public void d() {
    }

    @Override // l01.i0
    public java.lang.String key() {
        return "SEARCH#" + ik1.i0.a(this);
    }

    @Override // l01.u
    public void onBitmapLoaded(android.graphics.Bitmap bitmap) {
        zd5.k kVar = this.f251923d;
        if (bitmap == null || bitmap.isRecycled()) {
            n11.a.b().h(this.f251924e.f4385n, ((ee5.a) kVar).f251789m, this.f251925f.f251977s);
        } else {
            ((ee5.a) kVar).f251789m.setImageBitmap(bitmap);
        }
    }
}
