package s70;

/* loaded from: classes12.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f403944a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f403945b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f403946c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f403947d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f403948e;

    /* renamed from: f, reason: collision with root package name */
    public int f403949f;

    /* renamed from: g, reason: collision with root package name */
    public final k70.i0 f403950g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f403951h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f403952i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.ref.WeakReference f403953j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.ref.WeakReference f403954k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.ref.WeakReference f403955l;

    public g(java.lang.String uploadId, java.lang.String imgXml, java.lang.String fromUsername, java.lang.String toUsername, java.lang.String clientImgId, int i17, k70.i0 crossParams, int i18, kotlin.jvm.internal.i iVar) {
        if ((i18 & 1) != 0) {
            uploadId = java.util.UUID.randomUUID().toString();
            kotlin.jvm.internal.o.f(uploadId, "toString(...)");
        }
        kotlin.jvm.internal.o.g(uploadId, "uploadId");
        kotlin.jvm.internal.o.g(imgXml, "imgXml");
        kotlin.jvm.internal.o.g(fromUsername, "fromUsername");
        kotlin.jvm.internal.o.g(toUsername, "toUsername");
        kotlin.jvm.internal.o.g(clientImgId, "clientImgId");
        kotlin.jvm.internal.o.g(crossParams, "crossParams");
        this.f403944a = uploadId;
        this.f403945b = imgXml;
        this.f403946c = fromUsername;
        this.f403947d = toUsername;
        this.f403948e = clientImgId;
        this.f403949f = i17;
        this.f403950g = crossParams;
        this.f403951h = new java.util.LinkedHashMap();
        this.f403952i = true;
    }
}
