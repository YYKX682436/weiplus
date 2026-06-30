package in5;

/* loaded from: classes3.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f293127a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.res.Resources f293128b;

    /* renamed from: c, reason: collision with root package name */
    public in5.q f293129c;

    /* renamed from: d, reason: collision with root package name */
    public int f293130d;

    /* renamed from: e, reason: collision with root package name */
    public int f293131e;

    /* renamed from: f, reason: collision with root package name */
    public int f293132f;

    /* renamed from: g, reason: collision with root package name */
    public int f293133g;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f293134h;

    /* renamed from: i, reason: collision with root package name */
    public int f293135i;

    public t0(android.content.Context mContext) {
        kotlin.jvm.internal.o.g(mContext, "mContext");
        this.f293127a = mContext;
        android.content.res.Resources resources = mContext.getResources();
        kotlin.jvm.internal.o.f(resources, "getResources(...)");
        this.f293128b = resources;
        this.f293129c = in5.q.f293113d;
        this.f293134h = r3;
        this.f293130d = 0;
        int[] iArr = {-1};
        this.f293135i = -1;
    }

    public final in5.u0 a() {
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setColor(this.f293135i);
        return new in5.u0(this.f293129c, this.f293134h, paint, this.f293130d, this.f293131e, this.f293132f, this.f293133g, 0, null);
    }

    public final in5.t0 b(int i17) {
        this.f293135i = b3.l.getColor(this.f293127a, i17);
        return this;
    }

    public final in5.t0 c(int i17) {
        this.f293134h[0] = b3.l.getColor(this.f293127a, i17);
        return this;
    }

    public final in5.t0 d(int i17) {
        this.f293130d = this.f293128b.getDimensionPixelSize(i17);
        return this;
    }
}
