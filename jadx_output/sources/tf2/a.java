package tf2;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f418886a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f418887b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f418888c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f418889d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f418890e;

    /* renamed from: f, reason: collision with root package name */
    public final int f418891f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f418892g;

    /* renamed from: h, reason: collision with root package name */
    public final int f418893h;

    /* renamed from: i, reason: collision with root package name */
    public final long f418894i;

    /* renamed from: j, reason: collision with root package name */
    public final int f418895j;

    public a(java.lang.String animationId, java.lang.String url, java.lang.String urlResMd5, java.lang.String fromUsername, java.lang.String toUsername, int i17, java.lang.String giftId, int i18, long j17, int i19) {
        kotlin.jvm.internal.o.g(animationId, "animationId");
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(urlResMd5, "urlResMd5");
        kotlin.jvm.internal.o.g(fromUsername, "fromUsername");
        kotlin.jvm.internal.o.g(toUsername, "toUsername");
        kotlin.jvm.internal.o.g(giftId, "giftId");
        this.f418886a = animationId;
        this.f418887b = url;
        this.f418888c = urlResMd5;
        this.f418889d = fromUsername;
        this.f418890e = toUsername;
        this.f418891f = i17;
        this.f418892g = giftId;
        this.f418893h = i18;
        this.f418894i = j17;
        this.f418895j = i19;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tf2.a)) {
            return false;
        }
        tf2.a aVar = (tf2.a) obj;
        return kotlin.jvm.internal.o.b(this.f418886a, aVar.f418886a) && kotlin.jvm.internal.o.b(this.f418887b, aVar.f418887b) && kotlin.jvm.internal.o.b(this.f418888c, aVar.f418888c) && kotlin.jvm.internal.o.b(this.f418889d, aVar.f418889d) && kotlin.jvm.internal.o.b(this.f418890e, aVar.f418890e) && this.f418891f == aVar.f418891f && kotlin.jvm.internal.o.b(this.f418892g, aVar.f418892g) && this.f418893h == aVar.f418893h && this.f418894i == aVar.f418894i && this.f418895j == aVar.f418895j;
    }

    public int hashCode() {
        return (((((((((((((((((this.f418886a.hashCode() * 31) + this.f418887b.hashCode()) * 31) + this.f418888c.hashCode()) * 31) + this.f418889d.hashCode()) * 31) + this.f418890e.hashCode()) * 31) + java.lang.Integer.hashCode(this.f418891f)) * 31) + this.f418892g.hashCode()) * 31) + java.lang.Integer.hashCode(this.f418893h)) * 31) + java.lang.Long.hashCode(this.f418894i)) * 31) + java.lang.Integer.hashCode(this.f418895j);
    }

    public java.lang.String toString() {
        return "ScheduleQueueData(animationId=" + this.f418886a + ", url=" + this.f418887b + ", urlResMd5=" + this.f418888c + ", fromUsername=" + this.f418889d + ", toUsername=" + this.f418890e + ", upgradeNum=" + this.f418891f + ", giftId=" + this.f418892g + ", foregroundHeightPercentage=" + this.f418893h + ", attackGiftNumber=" + this.f418894i + ", timestamp=" + this.f418895j + ')';
    }
}
