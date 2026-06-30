package ml2;

/* loaded from: classes3.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f328156a;

    /* renamed from: b, reason: collision with root package name */
    public final long f328157b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f328158c;

    /* renamed from: d, reason: collision with root package name */
    public final long f328159d;

    /* renamed from: e, reason: collision with root package name */
    public final long f328160e;

    /* renamed from: f, reason: collision with root package name */
    public final ml2.x1 f328161f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f328162g;

    /* renamed from: h, reason: collision with root package name */
    public final long f328163h;

    /* renamed from: i, reason: collision with root package name */
    public final long f328164i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f328165j;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f328166k;

    /* renamed from: l, reason: collision with root package name */
    public final long f328167l;

    /* renamed from: m, reason: collision with root package name */
    public final ml2.i4 f328168m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f328169n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f328170o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f328171p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f328172q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f328173r;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.String f328174s;

    public w0(long j17, long j18, java.lang.String str, long j19, long j27, ml2.x1 actionType, java.lang.String str2, long j28, long j29, java.lang.String str3, java.lang.String str4, long j37, ml2.i4 enterType, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, int i17, kotlin.jvm.internal.i iVar) {
        long j38 = (i17 & 1) != 0 ? 0L : j17;
        long j39 = (i17 & 2) != 0 ? 0L : j18;
        java.lang.String userName = (i17 & 4) != 0 ? "" : str;
        long j47 = (i17 & 8) != 0 ? 0L : j19;
        long j48 = (i17 & 16) != 0 ? -1L : j27;
        java.lang.String commentscene = (i17 & 64) != 0 ? "" : str2;
        long j49 = (i17 & 128) != 0 ? 0L : j28;
        long j57 = (i17 & 256) != 0 ? 0L : j29;
        java.lang.String shareUserName = (i17 & 512) != 0 ? "" : str3;
        java.lang.String snsFeedid = (i17 & 1024) != 0 ? "" : str4;
        long j58 = j48;
        java.lang.String sessionBuf = (i17 & 8192) != 0 ? "" : str5;
        java.lang.String clickTabContextId = (i17 & 16384) != 0 ? "" : str6;
        long j59 = j47;
        java.lang.String clickSubTabContextId = (i17 & 32768) != 0 ? "" : str7;
        java.lang.String chnlExtra = (65536 & i17) != 0 ? "" : str8;
        long j66 = j39;
        java.lang.String talkerUsername = (i17 & 131072) != 0 ? "" : str9;
        java.lang.String gmsgId = (i17 & 262144) != 0 ? "" : str10;
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(actionType, "actionType");
        kotlin.jvm.internal.o.g(commentscene, "commentscene");
        kotlin.jvm.internal.o.g(shareUserName, "shareUserName");
        kotlin.jvm.internal.o.g(snsFeedid, "snsFeedid");
        kotlin.jvm.internal.o.g(enterType, "enterType");
        kotlin.jvm.internal.o.g(sessionBuf, "sessionBuf");
        kotlin.jvm.internal.o.g(clickTabContextId, "clickTabContextId");
        kotlin.jvm.internal.o.g(clickSubTabContextId, "clickSubTabContextId");
        kotlin.jvm.internal.o.g(chnlExtra, "chnlExtra");
        kotlin.jvm.internal.o.g(talkerUsername, "talkerUsername");
        kotlin.jvm.internal.o.g(gmsgId, "gmsgId");
        this.f328156a = j38;
        this.f328157b = j66;
        this.f328158c = userName;
        this.f328159d = j59;
        this.f328160e = j58;
        this.f328161f = actionType;
        this.f328162g = commentscene;
        this.f328163h = j49;
        this.f328164i = j57;
        this.f328165j = shareUserName;
        this.f328166k = snsFeedid;
        this.f328167l = j37;
        this.f328168m = enterType;
        this.f328169n = sessionBuf;
        this.f328170o = clickTabContextId;
        this.f328171p = clickSubTabContextId;
        this.f328172q = chnlExtra;
        this.f328173r = talkerUsername;
        this.f328174s = gmsgId;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ml2.w0)) {
            return false;
        }
        ml2.w0 w0Var = (ml2.w0) obj;
        return this.f328156a == w0Var.f328156a && this.f328157b == w0Var.f328157b && kotlin.jvm.internal.o.b(this.f328158c, w0Var.f328158c) && this.f328159d == w0Var.f328159d && this.f328160e == w0Var.f328160e && this.f328161f == w0Var.f328161f && kotlin.jvm.internal.o.b(this.f328162g, w0Var.f328162g) && this.f328163h == w0Var.f328163h && this.f328164i == w0Var.f328164i && kotlin.jvm.internal.o.b(this.f328165j, w0Var.f328165j) && kotlin.jvm.internal.o.b(this.f328166k, w0Var.f328166k) && this.f328167l == w0Var.f328167l && this.f328168m == w0Var.f328168m && kotlin.jvm.internal.o.b(this.f328169n, w0Var.f328169n) && kotlin.jvm.internal.o.b(this.f328170o, w0Var.f328170o) && kotlin.jvm.internal.o.b(this.f328171p, w0Var.f328171p) && kotlin.jvm.internal.o.b(this.f328172q, w0Var.f328172q) && kotlin.jvm.internal.o.b(this.f328173r, w0Var.f328173r) && kotlin.jvm.internal.o.b(this.f328174s, w0Var.f328174s);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((java.lang.Long.hashCode(this.f328156a) * 31) + java.lang.Long.hashCode(this.f328157b)) * 31) + this.f328158c.hashCode()) * 31) + java.lang.Long.hashCode(this.f328159d)) * 31) + java.lang.Long.hashCode(this.f328160e)) * 31) + this.f328161f.hashCode()) * 31) + this.f328162g.hashCode()) * 31) + java.lang.Long.hashCode(this.f328163h)) * 31) + java.lang.Long.hashCode(this.f328164i)) * 31) + this.f328165j.hashCode()) * 31) + this.f328166k.hashCode()) * 31) + java.lang.Long.hashCode(this.f328167l)) * 31) + this.f328168m.hashCode()) * 31) + this.f328169n.hashCode()) * 31) + this.f328170o.hashCode()) * 31) + this.f328171p.hashCode()) * 31) + this.f328172q.hashCode()) * 31) + this.f328173r.hashCode()) * 31) + this.f328174s.hashCode();
    }

    public java.lang.String toString() {
        return "HellVisitorEnterData(feedId=" + this.f328156a + ", liveId=" + this.f328157b + ", userName=" + this.f328158c + ", index=" + this.f328159d + ", onlineNum=" + this.f328160e + ", actionType=" + this.f328161f + ", commentscene=" + this.f328162g + ", enterStatus=" + this.f328163h + ", shareType=" + this.f328164i + ", shareUserName=" + this.f328165j + ", snsFeedid=" + this.f328166k + ", enterTime=" + this.f328167l + ", enterType=" + this.f328168m + ", sessionBuf=" + this.f328169n + ", clickTabContextId=" + this.f328170o + ", clickSubTabContextId=" + this.f328171p + ", chnlExtra=" + this.f328172q + ", talkerUsername=" + this.f328173r + ", gmsgId=" + this.f328174s + ')';
    }
}
