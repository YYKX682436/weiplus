package e60;

/* loaded from: classes10.dex */
public final class g1 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f249697a = "";

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f249698b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f249699c;

    /* renamed from: d, reason: collision with root package name */
    public int f249700d;

    /* renamed from: e, reason: collision with root package name */
    public int f249701e;

    /* renamed from: f, reason: collision with root package name */
    public int f249702f;

    /* renamed from: g, reason: collision with root package name */
    public int f249703g;

    public g1() {
        int dimension = (int) com.tencent.mm.sdk.platformtools.x2.f193075e.getDimension(com.tencent.mm.R.dimen.a1x);
        this.f249700d = dimension;
        this.f249701e = dimension;
        this.f249702f = 80;
    }

    public final void a(java.lang.String value) {
        kotlin.jvm.internal.o.g(value, "value");
        if (r26.p0.D0(value) != '/') {
            value = value.concat("/");
        }
        this.f249697a = value;
    }
}
