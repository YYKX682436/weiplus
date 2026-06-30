package p70;

/* loaded from: classes12.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f352456a;

    /* renamed from: b, reason: collision with root package name */
    public final int f352457b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f352458c;

    /* renamed from: d, reason: collision with root package name */
    public final k70.i0 f352459d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f352460e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f352461f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.ref.WeakReference f352462g;

    /* renamed from: h, reason: collision with root package name */
    public r15.b f352463h;

    public a(java.lang.String imgPath, int i17, java.lang.String toUsername, k70.i0 crossParams) {
        kotlin.jvm.internal.o.g(imgPath, "imgPath");
        kotlin.jvm.internal.o.g(toUsername, "toUsername");
        kotlin.jvm.internal.o.g(crossParams, "crossParams");
        this.f352456a = imgPath;
        this.f352457b = i17;
        this.f352458c = toUsername;
        this.f352459d = crossParams;
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.o.f(uuid, "toString(...)");
        this.f352460e = uuid;
        this.f352461f = new java.util.HashMap();
    }
}
