package ns2;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f339355a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f339356b;

    /* renamed from: c, reason: collision with root package name */
    public final r45.h32 f339357c;

    /* renamed from: d, reason: collision with root package name */
    public final r45.qt2 f339358d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f339359e;

    /* renamed from: f, reason: collision with root package name */
    public final long f339360f;

    /* renamed from: g, reason: collision with root package name */
    public final int f339361g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f339362h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f339363i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f339364j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f339365k;

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f339366l;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f339367m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f339368n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.Integer f339369o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.Integer f339370p;

    public b(android.content.Context context, java.lang.String username, r45.h32 liveNoticeInfo, r45.qt2 reportContextObj, java.lang.String commentScene, long j17, int i17, java.lang.String refPageType, boolean z17, boolean z18, boolean z19, java.lang.String fromQrcode, java.lang.String str, java.lang.String activityId, java.lang.Integer num, java.lang.Integer num2) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(liveNoticeInfo, "liveNoticeInfo");
        kotlin.jvm.internal.o.g(reportContextObj, "reportContextObj");
        kotlin.jvm.internal.o.g(commentScene, "commentScene");
        kotlin.jvm.internal.o.g(refPageType, "refPageType");
        kotlin.jvm.internal.o.g(fromQrcode, "fromQrcode");
        kotlin.jvm.internal.o.g(activityId, "activityId");
        this.f339355a = context;
        this.f339356b = username;
        this.f339357c = liveNoticeInfo;
        this.f339358d = reportContextObj;
        this.f339359e = commentScene;
        this.f339360f = j17;
        this.f339361g = i17;
        this.f339362h = refPageType;
        this.f339363i = z17;
        this.f339364j = z18;
        this.f339365k = z19;
        this.f339366l = fromQrcode;
        this.f339367m = str;
        this.f339368n = activityId;
        this.f339369o = num;
        this.f339370p = num2;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ns2.b)) {
            return false;
        }
        ns2.b bVar = (ns2.b) obj;
        return kotlin.jvm.internal.o.b(this.f339355a, bVar.f339355a) && kotlin.jvm.internal.o.b(this.f339356b, bVar.f339356b) && kotlin.jvm.internal.o.b(this.f339357c, bVar.f339357c) && kotlin.jvm.internal.o.b(this.f339358d, bVar.f339358d) && kotlin.jvm.internal.o.b(this.f339359e, bVar.f339359e) && this.f339360f == bVar.f339360f && this.f339361g == bVar.f339361g && kotlin.jvm.internal.o.b(this.f339362h, bVar.f339362h) && this.f339363i == bVar.f339363i && this.f339364j == bVar.f339364j && this.f339365k == bVar.f339365k && kotlin.jvm.internal.o.b(this.f339366l, bVar.f339366l) && kotlin.jvm.internal.o.b(this.f339367m, bVar.f339367m) && kotlin.jvm.internal.o.b(this.f339368n, bVar.f339368n) && kotlin.jvm.internal.o.b(this.f339369o, bVar.f339369o) && kotlin.jvm.internal.o.b(this.f339370p, bVar.f339370p);
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((this.f339355a.hashCode() * 31) + this.f339356b.hashCode()) * 31) + this.f339357c.hashCode()) * 31) + this.f339358d.hashCode()) * 31) + this.f339359e.hashCode()) * 31) + java.lang.Long.hashCode(this.f339360f)) * 31) + java.lang.Integer.hashCode(this.f339361g)) * 31) + this.f339362h.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f339363i)) * 31) + java.lang.Boolean.hashCode(this.f339364j)) * 31) + java.lang.Boolean.hashCode(this.f339365k)) * 31) + this.f339366l.hashCode()) * 31;
        java.lang.String str = this.f339367m;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f339368n.hashCode()) * 31;
        java.lang.Integer num = this.f339369o;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        java.lang.Integer num2 = this.f339370p;
        return hashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "ReserveContext(context=" + this.f339355a + ", username=" + this.f339356b + ", liveNoticeInfo=" + this.f339357c + ", reportContextObj=" + this.f339358d + ", commentScene=" + this.f339359e + ", fromFeedId=" + this.f339360f + ", fromCommentScene=" + this.f339361g + ", refPageType=" + this.f339362h + ", isSelfFlag=" + this.f339363i + ", previewOnly=" + this.f339364j + ", isHalfScreenMode=" + this.f339365k + ", fromQrcode=" + this.f339366l + ", promotionToken=" + this.f339367m + ", activityId=" + this.f339368n + ", scene=" + this.f339369o + ", pullSource=" + this.f339370p + ')';
    }
}
