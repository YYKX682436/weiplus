package hr5;

/* loaded from: classes15.dex */
public final class a1 {
    public zq5.n A;
    public zq5.n B;
    public long C;
    public zq5.n D;
    public gr5.i0 E;
    public zq5.n F;
    public int G;
    public hr5.n H;
    public hr5.m I;

    /* renamed from: J, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f284276J;

    /* renamed from: a, reason: collision with root package name */
    public final zq5.k f284277a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f284278b;

    /* renamed from: c, reason: collision with root package name */
    public final hr5.a f284279c;

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f284280d;

    /* renamed from: e, reason: collision with root package name */
    public long f284281e;

    /* renamed from: f, reason: collision with root package name */
    public long f284282f;

    /* renamed from: g, reason: collision with root package name */
    public long f284283g;

    /* renamed from: h, reason: collision with root package name */
    public gr5.n f284284h;

    /* renamed from: i, reason: collision with root package name */
    public gr5.b f284285i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f284286j;

    /* renamed from: k, reason: collision with root package name */
    public gr5.e0 f284287k;

    /* renamed from: l, reason: collision with root package name */
    public final gr5.h0 f284288l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f284289m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f284290n;

    /* renamed from: o, reason: collision with root package name */
    public final gr5.y f284291o;

    /* renamed from: p, reason: collision with root package name */
    public gr5.d f284292p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f284293q;

    /* renamed from: r, reason: collision with root package name */
    public final gr5.f f284294r;

    /* renamed from: s, reason: collision with root package name */
    public zq5.v f284295s;

    /* renamed from: t, reason: collision with root package name */
    public zq5.v f284296t;

    /* renamed from: u, reason: collision with root package name */
    public zq5.v f284297u;

    /* renamed from: v, reason: collision with root package name */
    public float f284298v;

    /* renamed from: w, reason: collision with root package name */
    public float f284299w;

    /* renamed from: x, reason: collision with root package name */
    public float f284300x;

    /* renamed from: y, reason: collision with root package name */
    public zq5.n f284301y;

    /* renamed from: z, reason: collision with root package name */
    public zq5.n f284302z;

    public a1(zq5.k logger, java.lang.String module, hr5.a animationAdapter, yz5.l onTransformChanged) {
        kotlin.jvm.internal.o.g(logger, "logger");
        kotlin.jvm.internal.o.g(module, "module");
        kotlin.jvm.internal.o.g(animationAdapter, "animationAdapter");
        kotlin.jvm.internal.o.g(onTransformChanged, "onTransformChanged");
        this.f284277a = logger;
        this.f284278b = module;
        this.f284279c = animationAdapter;
        this.f284280d = onTransformChanged;
        int i17 = zq5.g.f475066c;
        long j17 = zq5.g.f475065b;
        this.f284281e = j17;
        this.f284282f = j17;
        this.f284283g = j17;
        int i18 = gr5.n.f274941a;
        this.f284284h = gr5.m.f274935b;
        int i19 = gr5.b.f274909a;
        this.f284285i = gr5.a.f274903e;
        gr5.h0.f274930a.getClass();
        this.f284288l = gr5.f0.f274926b;
        this.f284290n = true;
        gr5.y yVar = gr5.y.f274954b;
        this.f284291o = gr5.y.f274954b;
        this.f284294r = gr5.f.f274920e;
        zq5.v vVar = zq5.v.f475094f;
        zq5.v vVar2 = zq5.v.f475094f;
        this.f284295s = vVar2;
        this.f284296t = vVar2;
        this.f284297u = vVar2;
        this.f284298v = 1.0f;
        this.f284299w = 1.0f;
        this.f284300x = 1.0f;
        zq5.n nVar = zq5.n.f475081e;
        this.f284301y = nVar;
        this.f284302z = nVar;
        this.A = nVar;
        this.B = nVar;
        this.C = zq5.s.b(zq5.q.f475086b);
        this.D = nVar;
        gr5.i0 i0Var = gr5.i0.f274931c;
        this.E = gr5.i0.f274931c;
        this.F = nVar;
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        this.f284276J = kotlinx.coroutines.z0.a(kotlinx.coroutines.internal.b0.f310484a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0085 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(hr5.a1 r6, zq5.v r7, java.lang.Integer r8, gr5.d r9, java.lang.String r10, kotlin.coroutines.Continuation r11) {
        /*
            r6.getClass()
            boolean r0 = r11 instanceof hr5.q
            if (r0 == 0) goto L16
            r0 = r11
            hr5.q r0 = (hr5.q) r0
            int r1 = r0.f284455i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f284455i = r1
            goto L1b
        L16:
            hr5.q r0 = new hr5.q
            r0.<init>(r6, r11)
        L1b:
            java.lang.Object r11 = r0.f284453g
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f284455i
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L43
            if (r2 != r4) goto L3b
            java.lang.Object r6 = r0.f284452f
            r10 = r6
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r6 = r0.f284451e
            r8 = r6
            java.lang.Integer r8 = (java.lang.Integer) r8
            java.lang.Object r6 = r0.f284450d
            hr5.a1 r6 = (hr5.a1) r6
            kotlin.ResultKt.throwOnFailure(r11)     // Catch: java.lang.Throwable -> L39
            goto L79
        L39:
            r7 = move-exception
            goto L8b
        L3b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L43:
            kotlin.ResultKt.throwOnFailure(r11)
            if (r9 != 0) goto L4a
            gr5.d r9 = r6.f284292p
        L4a:
            zq5.v r11 = r6.f284296t
            if (r8 == 0) goto L55
            int r2 = r8.intValue()
            r6.f(r2)
        L55:
            zq5.k r2 = r6.f284277a     // Catch: java.lang.Throwable -> L39
            hr5.r r5 = new hr5.r     // Catch: java.lang.Throwable -> L39
            r5.<init>(r6, r10)     // Catch: java.lang.Throwable -> L39
            r2.a(r5)     // Catch: java.lang.Throwable -> L39
            hr5.a r2 = r6.f284279c     // Catch: java.lang.Throwable -> L39
            hr5.t r5 = new hr5.t     // Catch: java.lang.Throwable -> L39
            r5.<init>(r11, r7, r6, r10)     // Catch: java.lang.Throwable -> L39
            hr5.u r7 = hr5.u.f284474d     // Catch: java.lang.Throwable -> L39
            r0.f284450d = r6     // Catch: java.lang.Throwable -> L39
            r0.f284451e = r8     // Catch: java.lang.Throwable -> L39
            r0.f284452f = r10     // Catch: java.lang.Throwable -> L39
            r0.f284455i = r4     // Catch: java.lang.Throwable -> L39
            fr5.p0 r2 = (fr5.p0) r2     // Catch: java.lang.Throwable -> L39
            java.lang.Object r7 = r2.a(r9, r5, r7, r0)     // Catch: java.lang.Throwable -> L39
            if (r7 != r1) goto L79
            goto L8a
        L79:
            zq5.k r7 = r6.f284277a     // Catch: java.lang.Throwable -> L39
            hr5.v r9 = new hr5.v     // Catch: java.lang.Throwable -> L39
            r9.<init>(r6, r10)     // Catch: java.lang.Throwable -> L39
            r7.a(r9)     // Catch: java.lang.Throwable -> L39
            if (r8 == 0) goto L88
            r6.f(r3)
        L88:
            jz5.f0 r1 = jz5.f0.f302826a
        L8a:
            return r1
        L8b:
            if (r8 == 0) goto L90
            r6.f(r3)
        L90:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: hr5.a1.a(hr5.a1, zq5.v, java.lang.Integer, gr5.d, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:177:0x05f8, code lost:
    
        if (r2 == false) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d1, code lost:
    
        if (r10.f284423j != r3.f284423j) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e5, code lost:
    
        if ((r10.f284424k == r3.f284424k) == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01b5, code lost:
    
        if (r7 <= zq5.g.b(r13)) goto L103;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0264 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x05bd  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x063a  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0642  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0701  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0706  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x024d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(hr5.a1 r56, java.lang.String r57, boolean r58, int r59, java.lang.Object r60) {
        /*
            Method dump skipped, instructions count: 1934
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hr5.a1.e(hr5.a1, java.lang.String, boolean, int, java.lang.Object):void");
    }

    public final gr5.f b() {
        long j17 = this.f284281e;
        gr5.f fVar = this.f284294r;
        kotlin.jvm.internal.o.g(fVar, "<this>");
        if (!(fVar.f274921a <= 0.0f && fVar.f274922b <= 0.0f && fVar.f274923c <= 0.0f && fVar.f274924d <= 0.0f)) {
            return fVar;
        }
        zq5.h.c(j17);
        return gr5.f.f274920e;
    }

    public final long c(long j17, float f17) {
        gr5.f fVar;
        long j18 = this.f284281e;
        long j19 = this.f284282f;
        gr5.n nVar = this.f284284h;
        gr5.b bVar = this.f284285i;
        boolean z17 = this.f284286j;
        boolean z18 = this.f284293q;
        gr5.f b17 = b();
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(this.f284286j);
        if (valueOf == null || valueOf.booleanValue()) {
            fVar = new gr5.f(b17.f274923c, b17.f274922b, b17.f274921a, b17.f274924d);
        } else {
            fVar = b17;
        }
        zq5.e d17 = zq5.o.d(hr5.b1.f(j18, j19, nVar, bVar, z17, 0, f17, z18, fVar));
        return zq5.m.b(j17, new zq5.n(d17.f475061a, d17.f475062b, d17.f475063c, d17.f475064d));
    }

    public final float d(float f17, boolean z17) {
        float c17 = this.f284298v / this.f284295s.c();
        float c18 = this.f284300x / this.f284295s.c();
        if (!z17) {
            return e06.p.e(f17, c17, c18);
        }
        float c19 = this.f284296t.c();
        if (f17 > c18) {
            float f18 = f17 - c19;
            float f19 = 2.0f * c18;
            if (f17 >= f19) {
                return f19;
            }
            return c19 + (f18 * (1 - ((f17 - c18) / (f19 - c18))) * 0.5f);
        }
        if (f17 >= c17) {
            return f17;
        }
        float f27 = f17 - c19;
        float f28 = c17 / 2.0f;
        if (f17 <= f28) {
            return f28;
        }
        return c19 + (f27 * (1 - ((f17 - c17) / (f28 - c17))) * 0.5f);
    }

    public final void f(int i17) {
        zq5.b.d();
        this.G = i17;
        this.f284280d.invoke(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.String r8, kotlin.coroutines.Continuation r9) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hr5.a1.g(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c9 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(long r14, boolean r16, gr5.d r17, kotlin.coroutines.Continuation r18) {
        /*
            Method dump skipped, instructions count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hr5.a1.h(long, boolean, gr5.d, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final long i(long j17) {
        zq5.b.d();
        long j18 = this.f284281e;
        zq5.g gVar = new zq5.g(j18);
        if (!zq5.h.c(j18)) {
            gVar = null;
        }
        if (gVar == null) {
            return zq5.l.f475077b;
        }
        long j19 = gVar.f475067a;
        long j27 = this.f284282f;
        zq5.g gVar2 = zq5.h.c(j27) ? new zq5.g(j27) : null;
        if (gVar2 == null) {
            return zq5.l.f475077b;
        }
        zq5.v vVar = this.f284296t;
        gr5.n contentScale = this.f284284h;
        gr5.b alignment = this.f284285i;
        boolean z17 = this.f284286j;
        float c17 = vVar.c();
        kotlin.jvm.internal.o.g(contentScale, "contentScale");
        kotlin.jvm.internal.o.g(alignment, "alignment");
        if (!zq5.h.b(j19)) {
            long j28 = gVar2.f475067a;
            if (!zq5.h.b(j28)) {
                long a17 = zq5.h.b(j19) ? zq5.l.f475077b : zq5.l.a(zq5.l.d(j17, vVar.f475096b), c17);
                if (zq5.h.b(j19) || zq5.h.b(j28)) {
                    return zq5.l.f475077b;
                }
                long d17 = zq5.h.d(j28, 0);
                zq5.n b17 = hr5.b1.b(j19, d17, contentScale, alignment, z17, 0);
                long d18 = zq5.l.d(a17, zq5.m.a(b17.f475082a, b17.f475083b));
                long a18 = contentScale.a(zq5.h.g(d17), zq5.h.g(j19));
                long a19 = zq5.m.a(zq5.l.b(d18) / zq5.q.b(a18), zq5.l.c(d18) / zq5.q.c(a18));
                long g17 = zq5.h.g(d17);
                return zq5.m.c(zq5.m.b(a19, new zq5.n(0.0f, 0.0f, zq5.t.b(g17), zq5.t.a(g17))), zq5.h.g(j28), 0);
            }
        }
        return zq5.l.f475077b;
    }

    public final void j(zq5.v vVar) {
        long j17;
        zq5.n nVar;
        zq5.n nVar2;
        long b17;
        zq5.n nVar3;
        this.f284296t = vVar;
        this.f284297u = zq5.w.b(this.f284295s, vVar);
        long j18 = this.f284281e;
        long j19 = this.f284282f;
        gr5.n contentScale = this.f284284h;
        gr5.b alignment = this.f284285i;
        boolean z17 = this.f284286j;
        float c17 = vVar.c();
        kotlin.jvm.internal.o.g(contentScale, "contentScale");
        kotlin.jvm.internal.o.g(alignment, "alignment");
        boolean b18 = zq5.h.b(j18);
        zq5.n nVar4 = zq5.n.f475081e;
        long j27 = vVar.f475096b;
        if (b18 || zq5.h.b(j19)) {
            j17 = j27;
            nVar = nVar4;
            nVar2 = nVar;
        } else {
            long d17 = zq5.h.d(j19, 0);
            j17 = j27;
            nVar = nVar4;
            long a17 = ((gr5.e) alignment).a(zq5.h.e(d17, contentScale.a(zq5.h.g(d17), zq5.h.g(j18))), j18, !z17);
            int a18 = zq5.c.a(a17);
            int i17 = zq5.g.f475066c;
            nVar2 = new zq5.n((((int) (a17 >> 32)) * c17) + zq5.l.b(j17), (a18 * c17) + zq5.l.c(j17), ((((int) (r11 >> 32)) + r5) * c17) + zq5.l.b(j17), ((zq5.c.a(a17) + zq5.g.b(r11)) * c17) + zq5.l.c(j17));
        }
        this.A = nVar2;
        this.B = hr5.b1.d(this.f284281e, this.f284282f, this.f284284h, this.f284285i, this.f284286j, 0, vVar.c(), vVar.f475096b);
        long j28 = this.f284281e;
        long j29 = this.f284282f;
        gr5.n nVar5 = this.f284284h;
        gr5.b bVar = this.f284285i;
        boolean z18 = this.f284286j;
        float c18 = vVar.c();
        boolean z19 = this.f284293q;
        gr5.f b19 = b();
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(this.f284286j);
        zq5.n f17 = hr5.b1.f(j28, j29, nVar5, bVar, z18, 0, c18, z19, (valueOf == null || valueOf.booleanValue()) ? new gr5.f(b19.f274923c, b19.f274922b, b19.f274921a, b19.f274924d) : b19);
        this.F = f17;
        int b27 = a06.d.b(f17.f475082a);
        int b28 = a06.d.b(f17.f475084c);
        int b29 = a06.d.b(zq5.l.b(j17));
        gr5.v vVar2 = b27 == b28 ? gr5.v.f274952g : b29 <= b27 ? gr5.v.f274951f : b29 >= b28 ? gr5.v.f274950e : gr5.v.f274949d;
        int b37 = a06.d.b(f17.f475083b);
        int b38 = a06.d.b(f17.f475085d);
        int b39 = a06.d.b(zq5.l.c(j17));
        this.E = new gr5.i0(vVar2, b37 == b38 ? gr5.v.f274952g : b39 <= b37 ? gr5.v.f274951f : b39 >= b38 ? gr5.v.f274950e : gr5.v.f274949d);
        long j37 = this.f284282f;
        long j38 = this.f284283g;
        zq5.g gVar = new zq5.g(j38);
        if (!zq5.h.c(j38)) {
            gVar = null;
        }
        long j39 = gVar != null ? gVar.f475067a : this.f284282f;
        long j47 = this.f284297u.f475095a;
        zq5.g gVar2 = new zq5.g(j39);
        if (!zq5.h.c(j39)) {
            gVar2 = null;
        }
        if (gVar2 != null) {
            zq5.g gVar3 = new zq5.g(j37);
            if (!zq5.h.c(j37)) {
                gVar3 = null;
            }
            if (gVar3 != null) {
                long j48 = gVar3.f475067a;
                long j49 = gVar2.f475067a;
                long a19 = zq5.s.a(((int) (j48 >> 32)) / ((int) (j49 >> 32)), zq5.g.b(j48) / zq5.g.b(j49));
                b17 = zq5.s.a(zq5.q.b(a19) * zq5.q.b(j47), zq5.q.c(a19) * zq5.q.c(j47));
            } else {
                b17 = zq5.s.b(zq5.q.f475086b);
            }
        } else {
            b17 = zq5.s.b(zq5.q.f475086b);
        }
        this.C = b17;
        long j57 = this.f284282f;
        long j58 = this.f284283g;
        zq5.g gVar4 = new zq5.g(j58);
        if (!zq5.h.c(j58)) {
            gVar4 = null;
        }
        long j59 = gVar4 != null ? gVar4.f475067a : this.f284282f;
        zq5.n contentVisibleRect = this.B;
        kotlin.jvm.internal.o.g(contentVisibleRect, "contentVisibleRect");
        zq5.g gVar5 = new zq5.g(j59);
        if (!zq5.h.c(j59)) {
            gVar5 = null;
        }
        if (gVar5 != null) {
            zq5.g gVar6 = zq5.h.c(j57) ? new zq5.g(j57) : null;
            if (gVar6 != null) {
                long j66 = gVar5.f475067a;
                long j67 = gVar6.f475067a;
                long a27 = zq5.s.a(((int) (j66 >> 32)) / ((int) (j67 >> 32)), zq5.g.b(j66) / zq5.g.b(j67));
                nVar3 = new zq5.n(contentVisibleRect.f475082a * zq5.q.b(a27), contentVisibleRect.f475083b * zq5.q.c(a27), contentVisibleRect.f475084c * zq5.q.b(a27), contentVisibleRect.f475085d * zq5.q.c(a27));
                this.D = nVar3;
                this.f284280d.invoke(this);
            }
        }
        nVar3 = nVar;
        this.D = nVar3;
        this.f284280d.invoke(this);
    }
}
