package nu3;

/* loaded from: classes4.dex */
public final class c extends nu3.b {

    /* renamed from: f, reason: collision with root package name */
    public final long f340192f;

    /* renamed from: g, reason: collision with root package name */
    public final long f340193g;

    /* renamed from: h, reason: collision with root package name */
    public final long f340194h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f340195i;

    /* renamed from: j, reason: collision with root package name */
    public final long f340196j;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c(long r12, long r14, long r16, java.lang.String r18, long r19, int r21, kotlin.jvm.internal.i r22) {
        /*
            r11 = this;
            r0 = r11
            r1 = r21 & 1
            r2 = 0
            if (r1 == 0) goto L9
            r4 = r2
            goto La
        L9:
            r4 = r12
        La:
            r1 = r21 & 2
            if (r1 == 0) goto L10
            r6 = r2
            goto L11
        L10:
            r6 = r14
        L11:
            r1 = r21 & 4
            if (r1 == 0) goto L17
            r8 = r2
            goto L19
        L17:
            r8 = r16
        L19:
            r1 = r21 & 8
            if (r1 == 0) goto L20
            java.lang.String r1 = ""
            goto L22
        L20:
            r1 = r18
        L22:
            r10 = r21 & 16
            if (r10 == 0) goto L27
            goto L29
        L27:
            r2 = r19
        L29:
            java.lang.String r10 = "fileFormat"
            kotlin.jvm.internal.o.g(r1, r10)
            r12 = r11
            r13 = r4
            r15 = r6
            r17 = r8
            r19 = r1
            r20 = r2
            r12.<init>(r13, r15, r17, r19, r20)
            r0.f340192f = r4
            r0.f340193g = r6
            r0.f340194h = r8
            r0.f340195i = r1
            r0.f340196j = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nu3.c.<init>(long, long, long, java.lang.String, long, int, kotlin.jvm.internal.i):void");
    }

    @Override // nu3.b
    public cl0.g a() {
        cl0.g a17 = super.a();
        if (a17.has("file_size")) {
            a17.remove("file_size");
            a17.p("wxam_file_size", this.f340192f);
        }
        return a17;
    }

    @Override // nu3.b
    public long b() {
        return this.f340196j;
    }

    @Override // nu3.b
    public java.lang.String c() {
        return this.f340195i;
    }

    @Override // nu3.b
    public long d() {
        return this.f340192f;
    }

    @Override // nu3.b
    public long e() {
        return this.f340194h;
    }

    @Override // nu3.b
    public long f() {
        return this.f340193g;
    }
}
