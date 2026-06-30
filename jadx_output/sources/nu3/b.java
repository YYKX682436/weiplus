package nu3;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f340187a;

    /* renamed from: b, reason: collision with root package name */
    public final long f340188b;

    /* renamed from: c, reason: collision with root package name */
    public final long f340189c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f340190d;

    /* renamed from: e, reason: collision with root package name */
    public final long f340191e;

    public b(long j17, long j18, long j19, java.lang.String fileFormat, long j27) {
        kotlin.jvm.internal.o.g(fileFormat, "fileFormat");
        this.f340187a = j17;
        this.f340188b = j18;
        this.f340189c = j19;
        this.f340190d = fileFormat;
        this.f340191e = j27;
    }

    public cl0.g a() {
        cl0.g gVar = new cl0.g();
        java.lang.Long valueOf = java.lang.Long.valueOf(d());
        if (!(valueOf.longValue() > 0)) {
            valueOf = null;
        }
        if (valueOf != null) {
            gVar.p("file_size", valueOf.longValue());
        }
        java.lang.Long valueOf2 = java.lang.Long.valueOf(f());
        if (!(valueOf2.longValue() > 0)) {
            valueOf2 = null;
        }
        if (valueOf2 != null) {
            gVar.p("width", valueOf2.longValue());
        }
        java.lang.Long valueOf3 = java.lang.Long.valueOf(e());
        if (!(valueOf3.longValue() > 0)) {
            valueOf3 = null;
        }
        if (valueOf3 != null) {
            gVar.p("height", valueOf3.longValue());
        }
        java.lang.String c17 = c();
        if (!(c17.length() > 0)) {
            c17 = null;
        }
        if (c17 != null) {
            gVar.h(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_FORMAT, c17);
        }
        java.lang.Long valueOf4 = java.lang.Long.valueOf(b());
        java.lang.Long l17 = valueOf4.longValue() > 0 ? valueOf4 : null;
        if (l17 != null) {
            gVar.p("duration", l17.longValue());
        }
        return gVar;
    }

    public long b() {
        return this.f340191e;
    }

    public java.lang.String c() {
        return this.f340190d;
    }

    public long d() {
        return this.f340187a;
    }

    public long e() {
        return this.f340189c;
    }

    public long f() {
        return this.f340188b;
    }

    public final java.lang.String g() {
        java.lang.String gVar = a().toString();
        kotlin.jvm.internal.o.f(gVar, "toString(...)");
        return r26.i0.u(gVar, ',', ';', false, 4, null);
    }

    public /* synthetic */ b(long j17, long j18, long j19, java.lang.String str, long j27, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? 0L : j17, (i17 & 2) != 0 ? 0L : j18, (i17 & 4) != 0 ? 0L : j19, (i17 & 8) != 0 ? "" : str, (i17 & 16) == 0 ? j27 : 0L);
    }
}
