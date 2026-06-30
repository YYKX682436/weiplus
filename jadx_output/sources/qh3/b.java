package qh3;

/* loaded from: classes15.dex */
public class b implements qh3.a {

    /* renamed from: a, reason: collision with root package name */
    public final rh3.p f363445a;

    /* renamed from: b, reason: collision with root package name */
    public final wh3.b f363446b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f363447c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f363448d;

    /* renamed from: e, reason: collision with root package name */
    public yz0.a f363449e;

    public b(rh3.p onePlayContext, wh3.b mediaSource, java.lang.String originMediaId, java.lang.String playMediaId) {
        kotlin.jvm.internal.o.g(onePlayContext, "onePlayContext");
        kotlin.jvm.internal.o.g(mediaSource, "mediaSource");
        kotlin.jvm.internal.o.g(originMediaId, "originMediaId");
        kotlin.jvm.internal.o.g(playMediaId, "playMediaId");
        this.f363445a = onePlayContext;
        this.f363446b = mediaSource;
        this.f363447c = originMediaId;
        this.f363448d = playMediaId;
        yz0.a a17 = xz0.b.f458171a.a(mediaSource.f445965a, false);
        java.lang.String value = mediaSource.f445966b;
        kotlin.jvm.internal.o.g(value, "value");
        a17.field_url = value;
        this.f363449e = a17;
        boolean j17 = com.tencent.mm.vfs.w6.j(a17.t0());
        com.tencent.mars.xlog.Log.i(i(), "create ResourceLoaderProxy, cache:" + this.f363449e + " mediaCache path:" + this.f363449e.t0() + ", exists:" + j17 + ' ');
        int i17 = this.f363449e.field_state;
        if (i17 == -2 || i17 == -1 || i17 == 0) {
            j();
        } else if ((i17 == 2 || i17 == 3) && !j17) {
            j();
        }
    }

    @Override // qh3.a
    public boolean a() {
        yz0.a aVar = this.f363449e;
        return aVar.field_totalSize > 0 && aVar.field_cacheSize > 0 && aVar.field_state == 3;
    }

    @Override // qh3.a
    public long b() {
        return this.f363449e.field_cacheSize;
    }

    @Override // qh3.a
    public long c() {
        return this.f363449e.field_totalSize;
    }

    @Override // qh3.a
    public void d(java.lang.String fileFormat) {
        kotlin.jvm.internal.o.g(fileFormat, "fileFormat");
        com.tencent.mars.xlog.Log.i(i(), "updateFileFormat fileFormat:".concat(fileFormat));
        yz0.a a17 = xz0.b.f458171a.a(this.f363448d, false);
        if (!kotlin.jvm.internal.o.b(a17.field_specFormat, fileFormat)) {
            a17.field_specFormat = fileFormat;
        }
        k();
    }

    @Override // qh3.a
    public boolean e() {
        return this.f363449e.field_moovReady;
    }

    @Override // qh3.a
    public void f(int i17) {
        com.tencent.mars.xlog.Log.i(i(), "markStateError retCode:" + i17);
        xz0.b bVar = xz0.b.f458171a;
        yz0.a a17 = bVar.a(this.f363448d, false);
        a17.field_cacheSize = a17.field_cacheSize;
        a17.field_totalSize = a17.field_totalSize;
        a17.field_state = a17.field_state;
        java.lang.String str = this.f363448d;
        java.lang.String str2 = this.f363447c;
        java.lang.String str3 = this.f363446b.f445966b;
        int i18 = a17.field_codecFormat;
        java.lang.String str4 = a17.field_specFormat;
        if (str4 == null) {
            str4 = "";
        }
        bVar.c(str, str2, str3, i18, str4, 0, 0L, 0L, -1, a17.field_duration, "", "");
        k();
    }

    @Override // qh3.a
    public void g(long j17, long j18, int i17) {
        com.tencent.mars.xlog.Log.i(i(), "updateProgressMemory cacheSize:" + j17 + " totalSize:" + j18 + " state:" + i17);
        yz0.a a17 = xz0.b.f458171a.a(this.f363448d, false);
        a17.field_cacheSize = j17;
        a17.field_totalSize = j18;
        a17.field_state = i17;
        k();
    }

    @Override // qh3.a
    public java.lang.String getFilePath() {
        return this.f363449e.t0();
    }

    @Override // qh3.a
    public void h() {
        com.tencent.mars.xlog.Log.i(i(), "updateMoovReady");
        xz0.b.f458171a.a(this.f363448d, false).field_moovReady = true;
        k();
    }

    public final java.lang.String i() {
        return ((rh3.q) this.f363445a).f("FVFDbCache");
    }

    public final void j() {
        com.tencent.mars.xlog.Log.i(i(), "resetMediaCache");
        xz0.b bVar = xz0.b.f458171a;
        yz0.a a17 = bVar.a(this.f363448d, false);
        a17.field_cacheSize = a17.field_cacheSize;
        a17.field_totalSize = a17.field_totalSize;
        a17.field_state = a17.field_state;
        java.lang.String str = this.f363448d;
        java.lang.String str2 = this.f363447c;
        java.lang.String str3 = this.f363446b.f445966b;
        int i17 = a17.field_codecFormat;
        java.lang.String str4 = a17.field_specFormat;
        if (str4 == null) {
            str4 = "";
        }
        bVar.c(str, str2, str3, i17, str4, 0, 0L, 0L, 1, a17.field_duration, "", "");
        k();
    }

    public final void k() {
        this.f363449e = xz0.b.f458171a.a(this.f363448d, false);
    }
}
