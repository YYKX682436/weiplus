package ml2;

/* loaded from: classes3.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f328122a;

    /* renamed from: b, reason: collision with root package name */
    public final long f328123b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f328124c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f328125d;

    /* renamed from: e, reason: collision with root package name */
    public final long f328126e;

    /* renamed from: f, reason: collision with root package name */
    public final long f328127f;

    /* renamed from: g, reason: collision with root package name */
    public final ml2.x1 f328128g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f328129h;

    /* renamed from: i, reason: collision with root package name */
    public final long f328130i;

    /* renamed from: j, reason: collision with root package name */
    public final long f328131j;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f328132k;

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f328133l;

    /* renamed from: m, reason: collision with root package name */
    public final int f328134m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f328135n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f328136o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f328137p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f328138q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.protocal.protobuf.FinderObject f328139r;

    public v0(long j17, long j18, java.lang.String str, java.lang.String str2, long j19, long j27, ml2.x1 actionType, java.lang.String str3, long j28, long j29, java.lang.String str4, java.lang.String str5, int i17, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, com.tencent.mm.protocal.protobuf.FinderObject finderObject, int i18, kotlin.jvm.internal.i iVar) {
        long j37 = (i18 & 1) != 0 ? 0L : j17;
        long j38 = (i18 & 2) != 0 ? 0L : j18;
        java.lang.String str10 = (i18 & 4) != 0 ? null : str;
        java.lang.String userName = (i18 & 8) != 0 ? "" : str2;
        long j39 = (i18 & 16) != 0 ? 0L : j19;
        long j47 = (i18 & 32) != 0 ? -1L : j27;
        java.lang.String commentscene = (i18 & 128) != 0 ? "" : str3;
        long j48 = (i18 & 256) != 0 ? 0L : j28;
        long j49 = (i18 & 512) != 0 ? 0L : j29;
        java.lang.String shareUserName = (i18 & 1024) != 0 ? "" : str4;
        java.lang.String str11 = (i18 & 2048) != 0 ? "" : str5;
        int i19 = (i18 & 4096) != 0 ? 0 : i17;
        java.lang.String clickTabContextId = (i18 & 8192) != 0 ? "" : str6;
        long j57 = j47;
        java.lang.String clickSubTabContextId = (i18 & 16384) != 0 ? "" : str7;
        java.lang.String chnlExtra = (32768 & i18) != 0 ? "" : str8;
        java.lang.String str12 = (i18 & 65536) != 0 ? null : str9;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = (i18 & 131072) != 0 ? null : finderObject;
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(actionType, "actionType");
        kotlin.jvm.internal.o.g(commentscene, "commentscene");
        kotlin.jvm.internal.o.g(shareUserName, "shareUserName");
        kotlin.jvm.internal.o.g(clickTabContextId, "clickTabContextId");
        kotlin.jvm.internal.o.g(clickSubTabContextId, "clickSubTabContextId");
        kotlin.jvm.internal.o.g(chnlExtra, "chnlExtra");
        this.f328122a = j37;
        this.f328123b = j38;
        this.f328124c = str10;
        this.f328125d = userName;
        this.f328126e = j39;
        this.f328127f = j57;
        this.f328128g = actionType;
        this.f328129h = commentscene;
        this.f328130i = j48;
        this.f328131j = j49;
        this.f328132k = shareUserName;
        this.f328133l = str11;
        this.f328134m = i19;
        this.f328135n = clickTabContextId;
        this.f328136o = clickSubTabContextId;
        this.f328137p = chnlExtra;
        this.f328138q = str12;
        this.f328139r = finderObject2;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ml2.v0)) {
            return false;
        }
        ml2.v0 v0Var = (ml2.v0) obj;
        return this.f328122a == v0Var.f328122a && this.f328123b == v0Var.f328123b && kotlin.jvm.internal.o.b(this.f328124c, v0Var.f328124c) && kotlin.jvm.internal.o.b(this.f328125d, v0Var.f328125d) && this.f328126e == v0Var.f328126e && this.f328127f == v0Var.f328127f && this.f328128g == v0Var.f328128g && kotlin.jvm.internal.o.b(this.f328129h, v0Var.f328129h) && this.f328130i == v0Var.f328130i && this.f328131j == v0Var.f328131j && kotlin.jvm.internal.o.b(this.f328132k, v0Var.f328132k) && kotlin.jvm.internal.o.b(this.f328133l, v0Var.f328133l) && this.f328134m == v0Var.f328134m && kotlin.jvm.internal.o.b(this.f328135n, v0Var.f328135n) && kotlin.jvm.internal.o.b(this.f328136o, v0Var.f328136o) && kotlin.jvm.internal.o.b(this.f328137p, v0Var.f328137p) && kotlin.jvm.internal.o.b(this.f328138q, v0Var.f328138q) && kotlin.jvm.internal.o.b(this.f328139r, v0Var.f328139r);
    }

    public int hashCode() {
        int hashCode = ((java.lang.Long.hashCode(this.f328122a) * 31) + java.lang.Long.hashCode(this.f328123b)) * 31;
        java.lang.String str = this.f328124c;
        int hashCode2 = (((((((((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f328125d.hashCode()) * 31) + java.lang.Long.hashCode(this.f328126e)) * 31) + java.lang.Long.hashCode(this.f328127f)) * 31) + this.f328128g.hashCode()) * 31) + this.f328129h.hashCode()) * 31) + java.lang.Long.hashCode(this.f328130i)) * 31) + java.lang.Long.hashCode(this.f328131j)) * 31) + this.f328132k.hashCode()) * 31;
        java.lang.String str2 = this.f328133l;
        int hashCode3 = (((((((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + java.lang.Integer.hashCode(this.f328134m)) * 31) + this.f328135n.hashCode()) * 31) + this.f328136o.hashCode()) * 31) + this.f328137p.hashCode()) * 31;
        java.lang.String str3 = this.f328138q;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = this.f328139r;
        return hashCode4 + (finderObject != null ? finderObject.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "HellVisitorClickData(feedId=" + this.f328122a + ", liveId=" + this.f328123b + ", dupFlag=" + this.f328124c + ", userName=" + this.f328125d + ", index=" + this.f328126e + ", onlineNum=" + this.f328127f + ", actionType=" + this.f328128g + ", commentscene=" + this.f328129h + ", enterStatus=" + this.f328130i + ", shareType=" + this.f328131j + ", shareUserName=" + this.f328132k + ", snsFeedid=" + this.f328133l + ", enterIconType=" + this.f328134m + ", clickTabContextId=" + this.f328135n + ", clickSubTabContextId=" + this.f328136o + ", chnlExtra=" + this.f328137p + ", contextId=" + this.f328138q + ", finderObject=" + this.f328139r + ')';
    }
}
