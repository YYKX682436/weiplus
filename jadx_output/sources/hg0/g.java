package hg0;

/* loaded from: classes12.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f281317a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f281318b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f281319c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f281320d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f281321e;

    /* renamed from: f, reason: collision with root package name */
    public final long f281322f;

    /* renamed from: g, reason: collision with root package name */
    public volatile java.lang.String f281323g;

    public g(java.lang.String fileName, boolean z17, boolean z18, boolean z19, boolean z27, long j17, java.lang.String otherInfo, int i17, kotlin.jvm.internal.i iVar) {
        otherInfo = (i17 & 64) != 0 ? "" : otherInfo;
        kotlin.jvm.internal.o.g(fileName, "fileName");
        kotlin.jvm.internal.o.g(otherInfo, "otherInfo");
        this.f281317a = fileName;
        this.f281318b = z17;
        this.f281319c = z18;
        this.f281320d = z19;
        this.f281321e = z27;
        this.f281322f = j17;
        this.f281323g = otherInfo;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hg0.g)) {
            return false;
        }
        hg0.g gVar = (hg0.g) obj;
        return kotlin.jvm.internal.o.b(this.f281317a, gVar.f281317a) && this.f281318b == gVar.f281318b && this.f281319c == gVar.f281319c && this.f281320d == gVar.f281320d && this.f281321e == gVar.f281321e && this.f281322f == gVar.f281322f && kotlin.jvm.internal.o.b(this.f281323g, gVar.f281323g);
    }

    public int hashCode() {
        return (((((((((((this.f281317a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f281318b)) * 31) + java.lang.Boolean.hashCode(this.f281319c)) * 31) + java.lang.Boolean.hashCode(this.f281320d)) * 31) + java.lang.Boolean.hashCode(this.f281321e)) * 31) + java.lang.Long.hashCode(this.f281322f)) * 31) + this.f281323g.hashCode();
    }

    public java.lang.String toString() {
        return "Session(fileName=" + this.f281317a + ", isNewDownload=" + this.f281318b + ", isGroupChat=" + this.f281319c + ", firstUseCgi=" + this.f281320d + ", lastUseCgi=" + this.f281321e + ", startTicks=" + this.f281322f + ", otherInfo=" + this.f281323g + ')';
    }
}
