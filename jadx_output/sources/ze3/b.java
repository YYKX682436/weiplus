package ze3;

/* loaded from: classes12.dex */
public final class b implements qh3.a {

    /* renamed from: a, reason: collision with root package name */
    public final rh3.p f471780a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f471781b;

    /* renamed from: c, reason: collision with root package name */
    public long f471782c;

    /* renamed from: d, reason: collision with root package name */
    public long f471783d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f471784e;

    public b(rh3.p onePlayContext, java.lang.String mediaId, java.lang.String localPath) {
        kotlin.jvm.internal.o.g(onePlayContext, "onePlayContext");
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(localPath, "localPath");
        this.f471780a = onePlayContext;
        this.f471781b = localPath;
    }

    @Override // qh3.a
    public boolean a() {
        long j17 = this.f471782c;
        if (j17 > 0) {
            long j18 = this.f471783d;
            if (j18 > 0 && j18 == j17) {
                return true;
            }
        }
        return false;
    }

    @Override // qh3.a
    public long b() {
        return this.f471783d;
    }

    @Override // qh3.a
    public long c() {
        return this.f471782c;
    }

    @Override // qh3.a
    public void d(java.lang.String fileFormat) {
        kotlin.jvm.internal.o.g(fileFormat, "fileFormat");
        com.tencent.mars.xlog.Log.i(((rh3.q) this.f471780a).f("MemoryCache"), "updateFileFormat:".concat(fileFormat));
    }

    @Override // qh3.a
    public boolean e() {
        return this.f471784e;
    }

    @Override // qh3.a
    public void f(int i17) {
        com.tencent.mars.xlog.Log.i(((rh3.q) this.f471780a).f("MemoryCache"), "markStateError:" + i17);
    }

    @Override // qh3.a
    public void g(long j17, long j18, int i17) {
        this.f471782c = j18;
        this.f471783d = j17;
    }

    @Override // qh3.a
    public java.lang.String getFilePath() {
        return this.f471781b;
    }

    @Override // qh3.a
    public void h() {
        this.f471784e = true;
    }
}
