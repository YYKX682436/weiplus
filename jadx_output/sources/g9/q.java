package g9;

/* loaded from: classes15.dex */
public final class q implements q8.e {

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.regex.Pattern f269647g = java.util.regex.Pattern.compile("LOCAL:([^,]+)");

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.regex.Pattern f269648h = java.util.regex.Pattern.compile("MPEGTS:(\\d+)");

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f269649a;

    /* renamed from: b, reason: collision with root package name */
    public final t9.a0 f269650b;

    /* renamed from: d, reason: collision with root package name */
    public q8.g f269652d;

    /* renamed from: f, reason: collision with root package name */
    public int f269654f;

    /* renamed from: c, reason: collision with root package name */
    public final t9.p f269651c = new t9.p();

    /* renamed from: e, reason: collision with root package name */
    public byte[] f269653e = new byte[1024];

    public q(java.lang.String str, t9.a0 a0Var) {
        this.f269649a = str;
        this.f269650b = a0Var;
    }

    @Override // q8.e
    public int a(q8.f fVar, q8.k kVar) {
        java.util.regex.Matcher matcher;
        java.lang.String d17;
        q8.b bVar = (q8.b) fVar;
        int i17 = (int) bVar.f360617b;
        int i18 = this.f269654f;
        byte[] bArr = this.f269653e;
        if (i18 == bArr.length) {
            this.f269653e = java.util.Arrays.copyOf(bArr, ((i17 != -1 ? i17 : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.f269653e;
        int i19 = this.f269654f;
        int c17 = bVar.c(bArr2, i19, bArr2.length - i19);
        if (c17 != -1) {
            int i27 = this.f269654f + c17;
            this.f269654f = i27;
            if (i17 == -1 || i27 != i17) {
                return 0;
            }
        }
        t9.p pVar = new t9.p(this.f269653e);
        try {
            p9.l.c(pVar);
            long j17 = 0;
            long j18 = 0;
            while (true) {
                java.lang.String d18 = pVar.d();
                if (android.text.TextUtils.isEmpty(d18)) {
                    while (true) {
                        java.lang.String d19 = pVar.d();
                        if (d19 == null) {
                            matcher = null;
                            break;
                        }
                        if (p9.l.f352853a.matcher(d19).matches()) {
                            do {
                                d17 = pVar.d();
                                if (d17 != null) {
                                }
                            } while (!d17.isEmpty());
                        } else {
                            matcher = p9.j.f352845b.matcher(d19);
                            if (matcher.matches()) {
                                break;
                            }
                        }
                    }
                    if (matcher == null) {
                        c(0L);
                    } else {
                        long b17 = p9.l.b(matcher.group(1));
                        long b18 = this.f269650b.b((((j17 + b17) - j18) * 90000) / 1000000);
                        q8.o c18 = c(b18 - b17);
                        byte[] bArr3 = this.f269653e;
                        int i28 = this.f269654f;
                        t9.p pVar2 = this.f269651c;
                        pVar2.u(bArr3, i28);
                        c18.a(pVar2, this.f269654f);
                        c18.b(b18, 1, this.f269654f, 0, null);
                    }
                    return -1;
                }
                if (d18.startsWith("X-TIMESTAMP-MAP")) {
                    java.util.regex.Matcher matcher2 = f269647g.matcher(d18);
                    if (!matcher2.find()) {
                        throw new m8.x("X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(d18));
                    }
                    java.util.regex.Matcher matcher3 = f269648h.matcher(d18);
                    if (!matcher3.find()) {
                        throw new m8.x("X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(d18));
                    }
                    j18 = p9.l.b(matcher2.group(1));
                    j17 = (java.lang.Long.parseLong(matcher3.group(1)) * 1000000) / 90000;
                }
            }
        } catch (i9.f e17) {
            throw new m8.x(e17);
        }
    }

    @Override // q8.e
    public void b(q8.g gVar) {
        this.f269652d = gVar;
        gVar.b(new q8.l(-9223372036854775807L));
    }

    public final q8.o c(long j17) {
        q8.o l17 = this.f269652d.l(0, 3);
        l17.c(com.google.android.exoplayer2.Format.i(null, "text/vtt", null, -1, 0, this.f269649a, -1, null, j17, java.util.Collections.emptyList()));
        this.f269652d.j();
        return l17;
    }

    @Override // q8.e
    public boolean e(q8.f fVar) {
        throw new java.lang.IllegalStateException();
    }

    @Override // q8.e
    public void release() {
    }

    @Override // q8.e
    public void seek(long j17, long j18) {
        throw new java.lang.IllegalStateException();
    }
}
