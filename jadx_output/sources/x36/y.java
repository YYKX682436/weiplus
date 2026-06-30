package x36;

/* loaded from: classes14.dex */
public final class y implements x36.h0 {

    /* renamed from: d, reason: collision with root package name */
    public final x36.k f451717d;

    /* renamed from: e, reason: collision with root package name */
    public x36.c0 f451718e;

    /* renamed from: f, reason: collision with root package name */
    public int f451719f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f451720g;

    /* renamed from: h, reason: collision with root package name */
    public long f451721h;

    /* renamed from: i, reason: collision with root package name */
    public final x36.m f451722i;

    public y(x36.m upstream) {
        kotlin.jvm.internal.o.g(upstream, "upstream");
        this.f451722i = upstream;
        x36.k buffer = upstream.getBuffer();
        this.f451717d = buffer;
        x36.c0 c0Var = buffer.f451693d;
        this.f451718e = c0Var;
        this.f451719f = c0Var != null ? c0Var.f451658b : -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        if (r5 == r7.f451658b) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0069  */
    @Override // x36.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long B(x36.k r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.o.g(r9, r0)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r2 < 0) goto Lf
            r5 = r4
            goto L10
        Lf:
            r5 = r3
        L10:
            if (r5 == 0) goto L81
            boolean r5 = r8.f451720g
            r5 = r5 ^ r4
            if (r5 == 0) goto L75
            x36.c0 r5 = r8.f451718e
            x36.k r6 = r8.f451717d
            if (r5 == 0) goto L2a
            x36.c0 r7 = r6.f451693d
            if (r5 != r7) goto L2b
            int r5 = r8.f451719f
            kotlin.jvm.internal.o.d(r7)
            int r7 = r7.f451658b
            if (r5 != r7) goto L2b
        L2a:
            r3 = r4
        L2b:
            if (r3 == 0) goto L69
            if (r2 != 0) goto L30
            return r0
        L30:
            long r0 = r8.f451721h
            r2 = 1
            long r0 = r0 + r2
            x36.m r2 = r8.f451722i
            boolean r0 = r2.d(r0)
            if (r0 != 0) goto L40
            r9 = -1
            return r9
        L40:
            x36.c0 r0 = r8.f451718e
            if (r0 != 0) goto L51
            x36.c0 r0 = r6.f451693d
            if (r0 == 0) goto L51
            r8.f451718e = r0
            kotlin.jvm.internal.o.d(r0)
            int r0 = r0.f451658b
            r8.f451719f = r0
        L51:
            long r0 = r6.f451694e
            long r2 = r8.f451721h
            long r0 = r0 - r2
            long r10 = java.lang.Math.min(r10, r0)
            x36.k r2 = r8.f451717d
            long r4 = r8.f451721h
            r3 = r9
            r6 = r10
            r2.b(r3, r4, r6)
            long r0 = r8.f451721h
            long r0 = r0 + r10
            r8.f451721h = r0
            return r10
        L69:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L75:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L81:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "byteCount < 0: "
            r9.<init>(r0)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: x36.y.B(x36.k, long):long");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f451720g = true;
    }

    @Override // x36.h0
    public x36.j0 h() {
        return this.f451722i.h();
    }
}
