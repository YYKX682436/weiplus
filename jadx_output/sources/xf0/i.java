package xf0;

/* loaded from: classes12.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f454173a;

    /* renamed from: b, reason: collision with root package name */
    public final xf0.f f454174b;

    /* renamed from: c, reason: collision with root package name */
    public final y15.d f454175c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f454176d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f454177e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f454178f;

    /* renamed from: g, reason: collision with root package name */
    public final t21.v2 f454179g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f454180h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f454181i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f454182j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f454183k;

    /* renamed from: l, reason: collision with root package name */
    public final java.util.Map f454184l;

    /* renamed from: m, reason: collision with root package name */
    public xf0.e f454185m;

    /* renamed from: n, reason: collision with root package name */
    public final int f454186n;

    /* renamed from: o, reason: collision with root package name */
    public final long f454187o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f454188p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.modelcdntran.v2 f454189q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f454190r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f454191s;

    public i(boolean z17, xf0.f videoType, y15.d videoMsg, java.lang.String videoUsername, java.lang.String mediaId, java.lang.String downloadPath, t21.v2 v2Var, boolean z18) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(videoType, "videoType");
        kotlin.jvm.internal.o.g(videoMsg, "videoMsg");
        kotlin.jvm.internal.o.g(videoUsername, "videoUsername");
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(downloadPath, "downloadPath");
        this.f454173a = z17;
        this.f454174b = videoType;
        this.f454175c = videoMsg;
        this.f454176d = videoUsername;
        this.f454177e = mediaId;
        this.f454178f = downloadPath;
        this.f454179g = v2Var;
        this.f454180h = z18;
        this.f454181i = true;
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.o.f(uuid, "toString(...)");
        this.f454182j = uuid;
        int ordinal = videoType.ordinal();
        if (ordinal == 0) {
            str = "MsgThumbVideoDownload";
        } else {
            if (ordinal != 1) {
                throw new jz5.j();
            }
            str = "MsgOriginVideoDownload";
        }
        this.f454183k = str;
        this.f454184l = new java.util.LinkedHashMap();
        this.f454186n = 1;
        this.f454187o = -1L;
        this.f454188p = "";
        this.f454191s = true;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xf0.i)) {
            return false;
        }
        xf0.i iVar = (xf0.i) obj;
        return this.f454173a == iVar.f454173a && this.f454174b == iVar.f454174b && kotlin.jvm.internal.o.b(this.f454175c, iVar.f454175c) && kotlin.jvm.internal.o.b(this.f454176d, iVar.f454176d) && kotlin.jvm.internal.o.b(this.f454177e, iVar.f454177e) && kotlin.jvm.internal.o.b(this.f454178f, iVar.f454178f) && kotlin.jvm.internal.o.b(this.f454179g, iVar.f454179g) && this.f454180h == iVar.f454180h;
    }

    public int hashCode() {
        int hashCode = ((((((((((java.lang.Boolean.hashCode(this.f454173a) * 31) + this.f454174b.hashCode()) * 31) + this.f454175c.hashCode()) * 31) + this.f454176d.hashCode()) * 31) + this.f454177e.hashCode()) * 31) + this.f454178f.hashCode()) * 31;
        t21.v2 v2Var = this.f454179g;
        return ((hashCode + (v2Var == null ? 0 : v2Var.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f454180h);
    }

    public java.lang.String toString() {
        return "MsgVideoDownloadParams(isTp=" + this.f454173a + ", videoType=" + this.f454174b + ", videoMsg=" + this.f454175c + ", videoUsername=" + this.f454176d + ", mediaId=" + this.f454177e + ", downloadPath=" + this.f454178f + ", videoInfo=" + this.f454179g + ", notifyDB=" + this.f454180h + ')';
    }
}
