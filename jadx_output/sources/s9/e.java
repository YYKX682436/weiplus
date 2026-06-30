package s9;

/* loaded from: classes7.dex */
public final class e implements r9.i {

    /* renamed from: a, reason: collision with root package name */
    public final s9.c f404916a;

    /* renamed from: b, reason: collision with root package name */
    public final long f404917b;

    /* renamed from: c, reason: collision with root package name */
    public final int f404918c;

    /* renamed from: d, reason: collision with root package name */
    public r9.n f404919d;

    /* renamed from: e, reason: collision with root package name */
    public java.io.File f404920e;

    /* renamed from: f, reason: collision with root package name */
    public java.io.OutputStream f404921f;

    /* renamed from: g, reason: collision with root package name */
    public java.io.FileOutputStream f404922g;

    /* renamed from: h, reason: collision with root package name */
    public long f404923h;

    /* renamed from: i, reason: collision with root package name */
    public long f404924i;

    /* renamed from: j, reason: collision with root package name */
    public t9.t f404925j;

    public e(s9.c cVar, long j17, int i17) {
        cVar.getClass();
        this.f404916a = cVar;
        this.f404917b = j17;
        this.f404918c = i17;
    }

    public final void a() {
        java.io.OutputStream outputStream = this.f404921f;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            this.f404922g.getFD().sync();
            t9.d0.d(this.f404921f);
            this.f404921f = null;
            java.io.File file = this.f404920e;
            this.f404920e = null;
            this.f404916a.j(file);
        } catch (java.lang.Throwable th6) {
            t9.d0.d(this.f404921f);
            this.f404921f = null;
            java.io.File file2 = this.f404920e;
            this.f404920e = null;
            file2.delete();
            throw th6;
        }
    }

    public final void b() {
        long j17 = this.f404919d.f393387e;
        long j18 = this.f404917b;
        if (j17 != -1) {
            j18 = java.lang.Math.min(j17 - this.f404924i, j18);
        }
        s9.c cVar = this.f404916a;
        r9.n nVar = this.f404919d;
        this.f404920e = cVar.e(nVar.f393388f, nVar.f393385c + this.f404924i, j18);
        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(this.f404920e);
        this.f404922g = fileOutputStream;
        int i17 = this.f404918c;
        if (i17 > 0) {
            t9.t tVar = this.f404925j;
            if (tVar == null) {
                this.f404925j = new t9.t(this.f404922g, i17);
            } else {
                tVar.a(fileOutputStream);
            }
            this.f404921f = this.f404925j;
        } else {
            this.f404921f = fileOutputStream;
        }
        this.f404923h = 0L;
    }
}
