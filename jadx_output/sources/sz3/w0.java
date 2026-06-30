package sz3;

/* loaded from: classes8.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public long f414130a;

    /* renamed from: b, reason: collision with root package name */
    public int f414131b;

    /* renamed from: c, reason: collision with root package name */
    public long f414132c;

    /* renamed from: d, reason: collision with root package name */
    public int f414133d;

    /* renamed from: e, reason: collision with root package name */
    public sz3.a1 f414134e;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f414135f;

    /* renamed from: h, reason: collision with root package name */
    public int f414137h;

    /* renamed from: k, reason: collision with root package name */
    public android.graphics.RectF f414140k;

    /* renamed from: n, reason: collision with root package name */
    public int f414143n;

    /* renamed from: o, reason: collision with root package name */
    public int f414144o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f414145p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f414146q;

    /* renamed from: g, reason: collision with root package name */
    public int f414136g = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f414138i = -1;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f414139j = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f414141l = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f414142m = "";

    public final sz3.w0 a(sz3.w0 newProductItem) {
        kotlin.jvm.internal.o.g(newProductItem, "newProductItem");
        this.f414132c = newProductItem.f414132c;
        this.f414131b = newProductItem.f414131b;
        this.f414133d = newProductItem.f414133d;
        this.f414134e = newProductItem.f414134e;
        this.f414137h = newProductItem.f414137h;
        this.f414139j = newProductItem.f414139j;
        this.f414141l = newProductItem.f414141l;
        this.f414142m = newProductItem.f414142m;
        this.f414143n = newProductItem.f414143n;
        this.f414144o = newProductItem.f414144o;
        this.f414140k = newProductItem.f414140k;
        this.f414145p = newProductItem.f414145p;
        this.f414146q = newProductItem.f414146q;
        return this;
    }

    public java.lang.String toString() {
        java.lang.String format = java.lang.String.format("ScanProductRecognizeItem state: %s, trackId: %s, reqKey: %s, title: %s, imageUrl: %s, status: %s, categoryId: %s", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(this.f414137h), java.lang.Integer.valueOf(this.f414138i), this.f414139j, this.f414141l, this.f414142m, java.lang.Integer.valueOf(this.f414143n), java.lang.Integer.valueOf(this.f414144o)}, 7));
        kotlin.jvm.internal.o.f(format, "format(...)");
        return format;
    }
}
