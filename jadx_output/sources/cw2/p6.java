package cw2;

/* loaded from: classes10.dex */
public final class p6 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f223930a;

    /* renamed from: b, reason: collision with root package name */
    public int f223931b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f223932c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f223933d;

    /* renamed from: e, reason: collision with root package name */
    public long f223934e;

    /* renamed from: f, reason: collision with root package name */
    public final int f223935f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f223936g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f223937h;

    /* renamed from: i, reason: collision with root package name */
    public long f223938i;

    public p6(java.lang.String mediaId, int i17, java.lang.String decodeType, java.lang.String preloadType, long j17, int i18, java.lang.String viewType, java.lang.String specType, long j18) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(decodeType, "decodeType");
        kotlin.jvm.internal.o.g(preloadType, "preloadType");
        kotlin.jvm.internal.o.g(viewType, "viewType");
        kotlin.jvm.internal.o.g(specType, "specType");
        this.f223930a = mediaId;
        this.f223931b = i17;
        this.f223932c = decodeType;
        this.f223933d = preloadType;
        this.f223934e = j17;
        this.f223935f = i18;
        this.f223936g = viewType;
        this.f223937h = specType;
        this.f223938i = j18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cw2.p6)) {
            return false;
        }
        cw2.p6 p6Var = (cw2.p6) obj;
        return kotlin.jvm.internal.o.b(this.f223930a, p6Var.f223930a) && this.f223931b == p6Var.f223931b && kotlin.jvm.internal.o.b(this.f223932c, p6Var.f223932c) && kotlin.jvm.internal.o.b(this.f223933d, p6Var.f223933d) && this.f223934e == p6Var.f223934e && this.f223935f == p6Var.f223935f && kotlin.jvm.internal.o.b(this.f223936g, p6Var.f223936g) && kotlin.jvm.internal.o.b(this.f223937h, p6Var.f223937h) && this.f223938i == p6Var.f223938i;
    }

    public int hashCode() {
        return (((((((((((((((this.f223930a.hashCode() * 31) + java.lang.Integer.hashCode(this.f223931b)) * 31) + this.f223932c.hashCode()) * 31) + this.f223933d.hashCode()) * 31) + java.lang.Long.hashCode(this.f223934e)) * 31) + java.lang.Integer.hashCode(this.f223935f)) * 31) + this.f223936g.hashCode()) * 31) + this.f223937h.hashCode()) * 31) + java.lang.Long.hashCode(this.f223938i);
    }

    public java.lang.String toString() {
        return "DebugInfoData(mediaId=" + this.f223930a + ", position=" + this.f223931b + ", decodeType=" + this.f223932c + ", preloadType=" + this.f223933d + ", firstFrameTime=" + this.f223934e + ", bufferingCount=" + this.f223935f + ", viewType=" + this.f223936g + ", specType=" + this.f223937h + ", videoBitRate=" + this.f223938i + ')';
    }
}
