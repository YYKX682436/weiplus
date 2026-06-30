package eh0;

/* loaded from: classes5.dex */
public final class i {

    /* renamed from: j, reason: collision with root package name */
    public static final eh0.h f252877j = new eh0.h(null);

    /* renamed from: a, reason: collision with root package name */
    public final long f252878a;

    /* renamed from: b, reason: collision with root package name */
    public long f252879b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f252880c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f252881d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f252882e;

    /* renamed from: f, reason: collision with root package name */
    public final long f252883f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f252884g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.StringBuilder f252885h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f252886i;

    public i(long j17, long j18, java.lang.String str, java.lang.String str2, java.lang.String str3, long j19, java.lang.String initText, java.lang.StringBuilder streamText, boolean z17, int i17, kotlin.jvm.internal.i iVar) {
        j18 = (i17 & 2) != 0 ? 0L : j18;
        str = (i17 & 4) != 0 ? null : str;
        j19 = (i17 & 32) != 0 ? c01.id.c() : j19;
        initText = (i17 & 64) != 0 ? "" : initText;
        streamText = (i17 & 128) != 0 ? new java.lang.StringBuilder() : streamText;
        z17 = (i17 & 256) != 0 ? false : z17;
        kotlin.jvm.internal.o.g(initText, "initText");
        kotlin.jvm.internal.o.g(streamText, "streamText");
        this.f252878a = j17;
        this.f252879b = j18;
        this.f252880c = str;
        this.f252881d = str2;
        this.f252882e = str3;
        this.f252883f = j19;
        this.f252884g = initText;
        this.f252885h = streamText;
        this.f252886i = z17;
    }

    public final java.lang.String a() {
        java.lang.String sb6 = this.f252885h.toString();
        kotlin.jvm.internal.o.f(sb6, "toString(...)");
        return sb6;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eh0.i)) {
            return false;
        }
        eh0.i iVar = (eh0.i) obj;
        return this.f252878a == iVar.f252878a && this.f252879b == iVar.f252879b && kotlin.jvm.internal.o.b(this.f252880c, iVar.f252880c) && kotlin.jvm.internal.o.b(this.f252881d, iVar.f252881d) && kotlin.jvm.internal.o.b(this.f252882e, iVar.f252882e) && this.f252883f == iVar.f252883f && kotlin.jvm.internal.o.b(this.f252884g, iVar.f252884g) && kotlin.jvm.internal.o.b(this.f252885h, iVar.f252885h) && this.f252886i == iVar.f252886i;
    }

    public int hashCode() {
        int hashCode = ((java.lang.Long.hashCode(this.f252878a) * 31) + java.lang.Long.hashCode(this.f252879b)) * 31;
        java.lang.String str = this.f252880c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f252881d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f252882e;
        return ((((((((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + java.lang.Long.hashCode(this.f252883f)) * 31) + this.f252884g.hashCode()) * 31) + this.f252885h.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f252886i);
    }

    public java.lang.String toString() {
        return "StreamSession(msgSvrId=" + this.f252878a + ", msgId=" + this.f252879b + ", ilinkStreamId=" + this.f252880c + ", streamTicket=" + this.f252881d + ", talker=" + this.f252882e + ", createTime=" + this.f252883f + ", initText=" + this.f252884g + ", streamText=" + ((java.lang.Object) this.f252885h) + ", isThinking=" + this.f252886i + ')';
    }
}
