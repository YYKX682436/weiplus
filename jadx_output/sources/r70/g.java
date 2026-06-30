package r70;

/* loaded from: classes12.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f393099a;

    /* renamed from: b, reason: collision with root package name */
    public int f393100b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f393101c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f393102d;

    /* renamed from: e, reason: collision with root package name */
    public final k70.i0 f393103e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f393104f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f393105g;

    /* renamed from: h, reason: collision with root package name */
    public int f393106h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f393107i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f393108j;

    public g(java.lang.String imgPath, int i17, java.lang.String fromUsername, java.lang.String toUsername, k70.i0 crossParams) {
        kotlin.jvm.internal.o.g(imgPath, "imgPath");
        kotlin.jvm.internal.o.g(fromUsername, "fromUsername");
        kotlin.jvm.internal.o.g(toUsername, "toUsername");
        kotlin.jvm.internal.o.g(crossParams, "crossParams");
        this.f393099a = imgPath;
        this.f393100b = i17;
        this.f393101c = fromUsername;
        this.f393102d = toUsername;
        this.f393103e = crossParams;
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.o.f(uuid, "toString(...)");
        this.f393104f = uuid;
        this.f393105g = uuid;
        this.f393107i = new java.util.HashMap();
        this.f393108j = "msg_raw_img_send";
    }
}
