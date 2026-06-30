package mq0;

/* loaded from: classes7.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f330573a;

    /* renamed from: b, reason: collision with root package name */
    public long f330574b;

    /* renamed from: c, reason: collision with root package name */
    public long f330575c;

    /* renamed from: d, reason: collision with root package name */
    public long f330576d;

    /* renamed from: e, reason: collision with root package name */
    public double f330577e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f330578f;

    /* renamed from: g, reason: collision with root package name */
    public long f330579g;

    /* renamed from: h, reason: collision with root package name */
    public long f330580h;

    /* renamed from: i, reason: collision with root package name */
    public long f330581i;

    /* renamed from: j, reason: collision with root package name */
    public long f330582j;

    public k0(java.lang.String frameSetRootId, long j17, long j18, long j19, double d17, java.util.concurrent.ConcurrentHashMap concurrentHashMap, long j27, long j28, long j29, long j37, int i17, kotlin.jvm.internal.i iVar) {
        long j38 = (i17 & 2) != 0 ? 0L : j17;
        long j39 = (i17 & 4) != 0 ? 0L : j18;
        long j47 = (i17 & 8) != 0 ? 0L : j19;
        double d18 = (i17 & 16) != 0 ? 0.0d : d17;
        java.util.concurrent.ConcurrentHashMap renderStartMap = (i17 & 32) != 0 ? new java.util.concurrent.ConcurrentHashMap() : concurrentHashMap;
        long j48 = (i17 & 64) != 0 ? 0L : j27;
        long j49 = (i17 & 128) != 0 ? 0L : j28;
        long j57 = (i17 & 256) != 0 ? 0L : j29;
        long j58 = (i17 & 512) != 0 ? 0L : j37;
        kotlin.jvm.internal.o.g(frameSetRootId, "frameSetRootId");
        kotlin.jvm.internal.o.g(renderStartMap, "renderStartMap");
        this.f330573a = frameSetRootId;
        this.f330574b = j38;
        this.f330575c = j39;
        this.f330576d = j47;
        this.f330577e = d18;
        this.f330578f = renderStartMap;
        this.f330579g = j48;
        this.f330580h = j49;
        this.f330581i = j57;
        this.f330582j = j58;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mq0.k0)) {
            return false;
        }
        mq0.k0 k0Var = (mq0.k0) obj;
        return kotlin.jvm.internal.o.b(this.f330573a, k0Var.f330573a) && this.f330574b == k0Var.f330574b && this.f330575c == k0Var.f330575c && this.f330576d == k0Var.f330576d && java.lang.Double.compare(this.f330577e, k0Var.f330577e) == 0 && kotlin.jvm.internal.o.b(this.f330578f, k0Var.f330578f) && this.f330579g == k0Var.f330579g && this.f330580h == k0Var.f330580h && this.f330581i == k0Var.f330581i && this.f330582j == k0Var.f330582j;
    }

    public int hashCode() {
        return (((((((((((((((((this.f330573a.hashCode() * 31) + java.lang.Long.hashCode(this.f330574b)) * 31) + java.lang.Long.hashCode(this.f330575c)) * 31) + java.lang.Long.hashCode(this.f330576d)) * 31) + java.lang.Double.hashCode(this.f330577e)) * 31) + this.f330578f.hashCode()) * 31) + java.lang.Long.hashCode(this.f330579g)) * 31) + java.lang.Long.hashCode(this.f330580h)) * 31) + java.lang.Long.hashCode(this.f330581i)) * 31) + java.lang.Long.hashCode(this.f330582j);
    }

    public java.lang.String toString() {
        return "MagicCardFrameSetCacheReportInfo(frameSetRootId=" + this.f330573a + ", totalCacheNum=" + this.f330574b + ", missCacheNum=" + this.f330575c + ", hitCacheNum=" + this.f330576d + ", totalRenderTime=" + this.f330577e + ", renderStartMap=" + this.f330578f + ", renderNum=" + this.f330579g + ", exposeNum=" + this.f330580h + ", entryStartTime=" + this.f330581i + ", sceneActiveTime=" + this.f330582j + ')';
    }
}
