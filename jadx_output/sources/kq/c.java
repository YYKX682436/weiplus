package kq;

/* loaded from: classes12.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f311180a;

    /* renamed from: b, reason: collision with root package name */
    public final long f311181b;

    /* renamed from: c, reason: collision with root package name */
    public final long f311182c;

    /* renamed from: d, reason: collision with root package name */
    public final int f311183d;

    /* renamed from: e, reason: collision with root package name */
    public final int f311184e;

    /* renamed from: f, reason: collision with root package name */
    public final long f311185f;

    /* renamed from: g, reason: collision with root package name */
    public final long f311186g;

    /* renamed from: h, reason: collision with root package name */
    public final int f311187h;

    /* renamed from: i, reason: collision with root package name */
    public final long f311188i;

    public c(int i17, long j17, long j18, int i18, int i19, long j19, long j27, int i27, long j28, int i28, kotlin.jvm.internal.i iVar) {
        int i29 = (i28 & 1) != 0 ? 0 : i17;
        long j29 = (i28 & 2) != 0 ? 300L : j17;
        long j37 = (i28 & 4) != 0 ? com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT : j18;
        int i37 = (i28 & 8) != 0 ? 15 : i18;
        int i38 = (i28 & 16) != 0 ? 120 : i19;
        long j38 = (i28 & 32) != 0 ? 200L : j19;
        long j39 = (i28 & 64) != 0 ? 50L : j27;
        int i39 = (i28 & 128) != 0 ? 4 : i27;
        long j47 = (i28 & 256) != 0 ? 15000L : j28;
        this.f311180a = i29;
        this.f311181b = j29;
        this.f311182c = j37;
        this.f311183d = i37;
        this.f311184e = i38;
        this.f311185f = j38;
        this.f311186g = j39;
        this.f311187h = i39;
        this.f311188i = j47;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kq.c)) {
            return false;
        }
        kq.c cVar = (kq.c) obj;
        return this.f311180a == cVar.f311180a && this.f311181b == cVar.f311181b && this.f311182c == cVar.f311182c && this.f311183d == cVar.f311183d && this.f311184e == cVar.f311184e && this.f311185f == cVar.f311185f && this.f311186g == cVar.f311186g && this.f311187h == cVar.f311187h && this.f311188i == cVar.f311188i;
    }

    public int hashCode() {
        return (((((((((((((((java.lang.Integer.hashCode(this.f311180a) * 31) + java.lang.Long.hashCode(this.f311181b)) * 31) + java.lang.Long.hashCode(this.f311182c)) * 31) + java.lang.Integer.hashCode(this.f311183d)) * 31) + java.lang.Integer.hashCode(this.f311184e)) * 31) + java.lang.Long.hashCode(this.f311185f)) * 31) + java.lang.Long.hashCode(this.f311186g)) * 31) + java.lang.Integer.hashCode(this.f311187h)) * 31) + java.lang.Long.hashCode(this.f311188i);
    }

    public java.lang.String toString() {
        return "DownloadConfig(maxRetryCount=" + this.f311180a + ", baseDelayMs=" + this.f311181b + ", maxDelayMs=" + this.f311182c + ", cgiChunkMaxRetryCount=" + this.f311183d + ", cgiChunkMaxLoopCycles=" + this.f311184e + ", cgiChunkRetryBaseDelayMs=" + this.f311185f + ", cgiChunkRetryExpMinDelayMs=" + this.f311186g + ", cgiChunkRetryExpMaxShift=" + this.f311187h + ", cdnTimeoutMs=" + this.f311188i + ')';
    }
}
