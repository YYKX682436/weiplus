package t21;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.modelcontrol.VideoTransPara f414707a;

    /* renamed from: b, reason: collision with root package name */
    public final long f414708b;

    /* renamed from: c, reason: collision with root package name */
    public final long f414709c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f414710d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f414711e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f414712f;

    /* renamed from: g, reason: collision with root package name */
    public final t21.x1 f414713g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f414714h;

    /* renamed from: i, reason: collision with root package name */
    public int f414715i;

    /* renamed from: j, reason: collision with root package name */
    public t21.d2 f414716j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f414717k;

    public c(com.tencent.mm.modelcontrol.VideoTransPara videoParam) {
        kotlin.jvm.internal.o.g(videoParam, "videoParam");
        this.f414707a = videoParam;
        this.f414708b = -1L;
        this.f414709c = -1L;
        this.f414712f = true;
        this.f414713g = new t21.x1(false, 0, 3, null);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t21.c) && kotlin.jvm.internal.o.b(this.f414707a, ((t21.c) obj).f414707a);
    }

    public int hashCode() {
        return this.f414707a.hashCode();
    }

    public java.lang.String toString() {
        return "CompositionVideoTranscodeParam(videoParam=" + this.f414707a + ')';
    }
}
