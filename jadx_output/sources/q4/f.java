package q4;

/* loaded from: classes13.dex */
public class f implements p4.f {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f360013d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f360014e;

    /* renamed from: f, reason: collision with root package name */
    public final p4.c f360015f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f360016g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Object f360017h = new java.lang.Object();

    /* renamed from: i, reason: collision with root package name */
    public q4.e f360018i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f360019m;

    public f(android.content.Context context, java.lang.String str, p4.c cVar, boolean z17) {
        this.f360013d = context;
        this.f360014e = str;
        this.f360015f = cVar;
        this.f360016g = z17;
    }

    public final q4.e a() {
        q4.e eVar;
        synchronized (this.f360017h) {
            if (this.f360018i == null) {
                q4.c[] cVarArr = new q4.c[1];
                if (this.f360014e == null || !this.f360016g) {
                    this.f360018i = new q4.e(this.f360013d, this.f360014e, cVarArr, this.f360015f);
                } else {
                    this.f360018i = new q4.e(this.f360013d, new java.io.File(this.f360013d.getNoBackupFilesDir(), this.f360014e).getAbsolutePath(), cVarArr, this.f360015f);
                }
                this.f360018i.setWriteAheadLoggingEnabled(this.f360019m);
            }
            eVar = this.f360018i;
        }
        return eVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a().close();
    }

    @Override // p4.f
    public p4.b d0() {
        return a().b();
    }

    @Override // p4.f
    public void setWriteAheadLoggingEnabled(boolean z17) {
        synchronized (this.f360017h) {
            q4.e eVar = this.f360018i;
            if (eVar != null) {
                eVar.setWriteAheadLoggingEnabled(z17);
            }
            this.f360019m = z17;
        }
    }
}
