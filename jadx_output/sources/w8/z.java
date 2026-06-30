package w8;

/* loaded from: classes15.dex */
public final class z implements w8.w {

    /* renamed from: a, reason: collision with root package name */
    public t9.a0 f443797a;

    /* renamed from: b, reason: collision with root package name */
    public q8.o f443798b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f443799c;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
    
        if (r5 != com.tencent.wcdb.core.Database.DictDefaultMatchValue) goto L15;
     */
    @Override // w8.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(t9.p r12) {
        /*
            r11 = this;
            boolean r0 = r11.f443799c
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 != 0) goto L29
            t9.a0 r0 = r11.f443797a
            long r3 = r0.c()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L14
            return
        L14:
            q8.o r0 = r11.f443798b
            t9.a0 r3 = r11.f443797a
            long r3 = r3.c()
            r5 = 0
            java.lang.String r6 = "application/x-scte35"
            com.google.android.exoplayer2.Format r3 = com.google.android.exoplayer2.Format.e(r5, r6, r3)
            r0.c(r3)
            r0 = 1
            r11.f443799c = r0
        L29:
            int r0 = r12.f416542c
            int r3 = r12.f416541b
            int r8 = r0 - r3
            q8.o r0 = r11.f443798b
            r0.a(r12, r8)
            q8.o r4 = r11.f443798b
            t9.a0 r12 = r11.f443797a
            long r5 = r12.f416491c
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 == 0) goto L41
            long r1 = r12.f416491c
            goto L4d
        L41:
            long r5 = r12.f416489a
            r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r12 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r12 == 0) goto L4d
            goto L4e
        L4d:
            r5 = r1
        L4e:
            r7 = 1
            r9 = 0
            r10 = 0
            r4.b(r5, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w8.z.a(t9.p):void");
    }

    @Override // w8.w
    public void c(t9.a0 a0Var, q8.g gVar, w8.g0 g0Var) {
        this.f443797a = a0Var;
        g0Var.a();
        g0Var.b();
        q8.o l17 = gVar.l(g0Var.f443644d, 4);
        this.f443798b = l17;
        g0Var.b();
        l17.c(com.google.android.exoplayer2.Format.f(g0Var.f443645e, com.tencent.thumbplayer.tmediacodec.util.MimeTypes.APPLICATION_SCTE35, null, -1, null));
    }
}
