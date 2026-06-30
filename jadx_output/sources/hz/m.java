package hz;

/* loaded from: classes9.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f286233a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f286234b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f286235c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f286236d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f286237e;

    /* renamed from: f, reason: collision with root package name */
    public oi3.g f286238f;

    /* renamed from: g, reason: collision with root package name */
    public qi3.f0 f286239g;

    /* renamed from: h, reason: collision with root package name */
    public qi3.i0 f286240h;

    /* renamed from: i, reason: collision with root package name */
    public qi3.d0 f286241i;

    /* renamed from: j, reason: collision with root package name */
    public qi3.k0 f286242j;

    public m(java.lang.String toUserName, java.lang.String contentUserName) {
        kotlin.jvm.internal.o.g(toUserName, "toUserName");
        kotlin.jvm.internal.o.g(contentUserName, "contentUserName");
        this.f286233a = toUserName;
        this.f286234b = contentUserName;
        if (!(!r26.n0.N(toUserName))) {
            throw new java.lang.IllegalArgumentException("toUserName must not be blank".toString());
        }
        if (!(!r26.n0.N(contentUserName))) {
            throw new java.lang.IllegalArgumentException("contentUserName must not be blank".toString());
        }
        new java.util.LinkedHashMap();
    }
}
