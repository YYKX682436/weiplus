package l70;

/* loaded from: classes12.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f316800a;

    /* renamed from: b, reason: collision with root package name */
    public final s70.c f316801b;

    /* renamed from: c, reason: collision with root package name */
    public final j15.d f316802c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f316803d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f316804e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f316805f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f316806g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f316807h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f316808i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.HashMap f316809j;

    /* renamed from: k, reason: collision with root package name */
    public final java.util.Map f316810k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f316811l;

    /* renamed from: m, reason: collision with root package name */
    public l70.a f316812m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.ref.WeakReference f316813n;

    /* renamed from: o, reason: collision with root package name */
    public int f316814o;

    /* renamed from: p, reason: collision with root package name */
    public final long f316815p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f316816q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f316817r;

    public d(boolean z17, s70.c imgType, j15.d imgMsg, java.lang.String imgUsername, java.lang.String mediaId, java.lang.String downloadPath) {
        kotlin.jvm.internal.o.g(imgType, "imgType");
        kotlin.jvm.internal.o.g(imgMsg, "imgMsg");
        kotlin.jvm.internal.o.g(imgUsername, "imgUsername");
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(downloadPath, "downloadPath");
        this.f316800a = z17;
        this.f316801b = imgType;
        this.f316802c = imgMsg;
        this.f316803d = imgUsername;
        this.f316804e = mediaId;
        this.f316805f = downloadPath;
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.o.f(uuid, "toString(...)");
        this.f316806g = uuid;
        this.f316807h = true;
        this.f316808i = "MsgImgDownload";
        this.f316809j = new java.util.HashMap();
        this.f316810k = new java.util.LinkedHashMap();
        this.f316814o = 1;
        this.f316815p = 300000L;
        this.f316817r = true;
    }
}
