package x8;

/* loaded from: classes15.dex */
public final class a implements q8.e, q8.m {

    /* renamed from: a, reason: collision with root package name */
    public q8.g f452464a;

    /* renamed from: b, reason: collision with root package name */
    public q8.o f452465b;

    /* renamed from: c, reason: collision with root package name */
    public x8.b f452466c;

    /* renamed from: d, reason: collision with root package name */
    public int f452467d;

    /* renamed from: e, reason: collision with root package name */
    public int f452468e;

    @Override // q8.e
    public int a(q8.f fVar, q8.k kVar) {
        if (this.f452466c == null) {
            x8.b a17 = x8.d.a(fVar);
            this.f452466c = a17;
            if (a17 == null) {
                throw new m8.x("Unsupported or unrecognized wav header.");
            }
            int i17 = a17.f452470b;
            int i18 = a17.f452473e * i17;
            int i19 = a17.f452469a;
            this.f452465b.c(com.google.android.exoplayer2.Format.b(null, com.tencent.thumbplayer.tmediacodec.util.MimeTypes.AUDIO_RAW, null, i18 * i19, 32768, i19, i17, a17.f452474f, null, null, 0, null));
            this.f452467d = this.f452466c.f452472d;
        }
        x8.b bVar = this.f452466c;
        if (!((bVar.f452475g == 0 || bVar.f452476h == 0) ? false : true)) {
            fVar.getClass();
            bVar.getClass();
            q8.b bVar2 = (q8.b) fVar;
            bVar2.f360620e = 0;
            t9.p pVar = new t9.p(8);
            x8.c a18 = x8.c.a(fVar, pVar);
            while (true) {
                int f17 = t9.d0.f(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
                int i27 = a18.f452477a;
                long j17 = a18.f452478b;
                if (i27 == f17) {
                    bVar2.f(8);
                    bVar.f452475g = bVar2.f360618c;
                    bVar.f452476h = j17;
                    this.f452464a.b(this);
                    break;
                }
                long j18 = j17 + 8;
                int f18 = t9.d0.f("RIFF");
                int i28 = a18.f452477a;
                if (i28 == f18) {
                    j18 = 12;
                }
                if (j18 > 2147483647L) {
                    throw new m8.x("Chunk is too large (~2GB+) to skip; id: " + i28);
                }
                bVar2.f((int) j18);
                a18 = x8.c.a(fVar, pVar);
            }
        }
        int d17 = this.f452465b.d(fVar, 32768 - this.f452468e, true);
        if (d17 != -1) {
            this.f452468e += d17;
        }
        int i29 = this.f452468e;
        int i37 = this.f452467d;
        int i38 = i29 / i37;
        if (i38 > 0) {
            long j19 = ((((q8.b) fVar).f360618c - i29) * 1000000) / this.f452466c.f452471c;
            int i39 = i38 * i37;
            int i47 = i29 - i39;
            this.f452468e = i47;
            this.f452465b.b(j19, 1, i39, i47, null);
        }
        return d17 == -1 ? -1 : 0;
    }

    @Override // q8.e
    public void b(q8.g gVar) {
        this.f452464a = gVar;
        this.f452465b = gVar.l(0, 1);
        this.f452466c = null;
        gVar.j();
    }

    @Override // q8.m
    public boolean c() {
        return true;
    }

    @Override // q8.m
    public long d(long j17) {
        x8.b bVar = this.f452466c;
        long j18 = (j17 * bVar.f452471c) / 1000000;
        long j19 = bVar.f452472d;
        return java.lang.Math.min((j18 / j19) * j19, bVar.f452476h - j19) + bVar.f452475g;
    }

    @Override // q8.e
    public boolean e(q8.f fVar) {
        return x8.d.a(fVar) != null;
    }

    @Override // q8.m
    public long g() {
        return ((this.f452466c.f452476h / r0.f452472d) * 1000000) / r0.f452470b;
    }

    @Override // q8.e
    public void release() {
    }

    @Override // q8.e
    public void seek(long j17, long j18) {
        this.f452468e = 0;
    }
}
