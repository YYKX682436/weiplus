package ni3;

/* loaded from: classes10.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f337719a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f337720b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f337721c;

    /* renamed from: d, reason: collision with root package name */
    public long f337722d;

    /* renamed from: e, reason: collision with root package name */
    public long f337723e;

    /* renamed from: f, reason: collision with root package name */
    public long f337724f;

    /* renamed from: g, reason: collision with root package name */
    public long f337725g;

    /* renamed from: h, reason: collision with root package name */
    public long f337726h;

    /* renamed from: i, reason: collision with root package name */
    public long f337727i;

    /* renamed from: j, reason: collision with root package name */
    public long f337728j;

    public r0(java.lang.String mediaId, java.lang.String filePath, boolean z17, long j17, long j18, long j19, long j27, long j28, long j29, long j37) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(filePath, "filePath");
        this.f337719a = mediaId;
        this.f337720b = filePath;
        this.f337721c = z17;
        this.f337722d = j17;
        this.f337723e = j18;
        this.f337724f = j19;
        this.f337725g = j27;
        this.f337726h = j28;
        this.f337727i = j29;
        this.f337728j = j37;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ni3.r0)) {
            return false;
        }
        ni3.r0 r0Var = (ni3.r0) obj;
        return kotlin.jvm.internal.o.b(this.f337719a, r0Var.f337719a) && kotlin.jvm.internal.o.b(this.f337720b, r0Var.f337720b) && this.f337721c == r0Var.f337721c && this.f337722d == r0Var.f337722d && this.f337723e == r0Var.f337723e && this.f337724f == r0Var.f337724f && this.f337725g == r0Var.f337725g && this.f337726h == r0Var.f337726h && this.f337727i == r0Var.f337727i && this.f337728j == r0Var.f337728j;
    }

    public int hashCode() {
        return (((((((((((((((((this.f337719a.hashCode() * 31) + this.f337720b.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f337721c)) * 31) + java.lang.Long.hashCode(this.f337722d)) * 31) + java.lang.Long.hashCode(this.f337723e)) * 31) + java.lang.Long.hashCode(this.f337724f)) * 31) + java.lang.Long.hashCode(this.f337725g)) * 31) + java.lang.Long.hashCode(this.f337726h)) * 31) + java.lang.Long.hashCode(this.f337727i)) * 31) + java.lang.Long.hashCode(this.f337728j);
    }

    public java.lang.String toString() {
        return "FeedPlayInfo(mediaId=" + this.f337719a + ", filePath=" + this.f337720b + ", isFirstPlay=" + this.f337721c + ", exposeTime=" + this.f337722d + ", playTime=" + this.f337723e + ", firstLoadTime=" + this.f337724f + ", firstFrameTime=" + this.f337725g + ", userFirstFrameTime=" + this.f337726h + ", bufferCount=" + this.f337727i + ", bufferTotalTime=" + this.f337728j + ')';
    }
}
