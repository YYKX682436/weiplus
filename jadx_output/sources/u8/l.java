package u8;

/* loaded from: classes15.dex */
public final class l implements q8.e {
    public static final int E = t9.d0.f("seig");
    public static final byte[] F = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public q8.g A;
    public q8.o B;
    public q8.o[] C;
    public boolean D;

    /* renamed from: a, reason: collision with root package name */
    public final int f425278a;

    /* renamed from: h, reason: collision with root package name */
    public final t9.a0 f425285h;

    /* renamed from: n, reason: collision with root package name */
    public int f425291n;

    /* renamed from: o, reason: collision with root package name */
    public long f425292o;

    /* renamed from: q, reason: collision with root package name */
    public t9.p f425294q;

    /* renamed from: r, reason: collision with root package name */
    public long f425295r;

    /* renamed from: s, reason: collision with root package name */
    public int f425296s;

    /* renamed from: v, reason: collision with root package name */
    public u8.k f425299v;

    /* renamed from: w, reason: collision with root package name */
    public int f425300w;

    /* renamed from: x, reason: collision with root package name */
    public int f425301x;

    /* renamed from: y, reason: collision with root package name */
    public int f425302y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f425303z;

    /* renamed from: i, reason: collision with root package name */
    public final t9.p f425286i = new t9.p(16);

    /* renamed from: c, reason: collision with root package name */
    public final t9.p f425280c = new t9.p(t9.n.f416532a);

    /* renamed from: d, reason: collision with root package name */
    public final t9.p f425281d = new t9.p(5);

    /* renamed from: e, reason: collision with root package name */
    public final t9.p f425282e = new t9.p();

    /* renamed from: f, reason: collision with root package name */
    public final t9.p f425283f = new t9.p(1);

    /* renamed from: g, reason: collision with root package name */
    public final t9.p f425284g = new t9.p();

    /* renamed from: j, reason: collision with root package name */
    public final byte[] f425287j = new byte[16];

    /* renamed from: k, reason: collision with root package name */
    public final java.util.Stack f425288k = new java.util.Stack();

    /* renamed from: l, reason: collision with root package name */
    public final java.util.LinkedList f425289l = new java.util.LinkedList();

    /* renamed from: b, reason: collision with root package name */
    public final android.util.SparseArray f425279b = new android.util.SparseArray();

    /* renamed from: t, reason: collision with root package name */
    public long f425297t = -9223372036854775807L;

    /* renamed from: u, reason: collision with root package name */
    public long f425298u = -9223372036854775807L;

    /* renamed from: m, reason: collision with root package name */
    public int f425290m = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f425293p = 0;

    public l(int i17, t9.a0 a0Var) {
        this.f425278a = i17 | 0;
        this.f425285h = a0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.exoplayer2.drm.DrmInitData c(java.util.List r14) {
        /*
            int r0 = r14.size()
            r1 = 0
            r2 = 0
            r4 = r1
            r3 = r2
        L8:
            if (r3 >= r0) goto L98
            java.lang.Object r5 = r14.get(r3)
            u8.b r5 = (u8.b) r5
            int r6 = r5.f425240a
            int r7 = u8.c.V
            if (r6 != r7) goto L94
            if (r4 != 0) goto L1d
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L1d:
            t9.p r5 = r5.P0
            byte[] r5 = r5.f416540a
            t9.p r6 = new t9.p
            r6.<init>(r5)
            int r8 = r6.f416542c
            r9 = 32
            if (r8 >= r9) goto L2d
            goto L74
        L2d:
            r6.w(r2)
            int r8 = r6.c()
            int r9 = r6.f416542c
            int r10 = r6.f416541b
            int r9 = r9 - r10
            int r9 = r9 + 4
            if (r8 == r9) goto L3e
            goto L74
        L3e:
            int r8 = r6.c()
            if (r8 == r7) goto L45
            goto L74
        L45:
            int r7 = r6.c()
            int r7 = r7 >> 24
            r7 = r7 & 255(0xff, float:3.57E-43)
            r8 = 1
            if (r7 <= r8) goto L51
            goto L74
        L51:
            java.util.UUID r9 = new java.util.UUID
            long r10 = r6.h()
            long r12 = r6.h()
            r9.<init>(r10, r12)
            if (r7 != r8) goto L69
            int r7 = r6.p()
            int r7 = r7 * 16
            r6.x(r7)
        L69:
            int r7 = r6.p()
            int r8 = r6.f416542c
            int r10 = r6.f416541b
            int r8 = r8 - r10
            if (r7 == r8) goto L76
        L74:
            r6 = r1
            goto L7f
        L76:
            byte[] r8 = new byte[r7]
            r6.b(r8, r2, r7)
            android.util.Pair r6 = android.util.Pair.create(r9, r8)
        L7f:
            if (r6 != 0) goto L83
            r6 = r1
            goto L87
        L83:
            java.lang.Object r6 = r6.first
            java.util.UUID r6 = (java.util.UUID) r6
        L87:
            if (r6 != 0) goto L8a
            goto L94
        L8a:
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData r7 = new com.google.android.exoplayer2.drm.DrmInitData$SchemeData
            java.lang.String r8 = "video/mp4"
            r7.<init>(r6, r1, r8, r5)
            r4.add(r7)
        L94:
            int r3 = r3 + 1
            goto L8
        L98:
            if (r4 != 0) goto L9b
            goto Lac
        L9b:
            com.google.android.exoplayer2.drm.DrmInitData r1 = new com.google.android.exoplayer2.drm.DrmInitData
            int r14 = r4.size()
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData[] r14 = new com.google.android.exoplayer2.drm.DrmInitData.SchemeData[r14]
            java.lang.Object[] r14 = r4.toArray(r14)
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData[] r14 = (com.google.android.exoplayer2.drm.DrmInitData.SchemeData[]) r14
            r1.<init>(r2, r14)
        Lac:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: u8.l.c(java.util.List):com.google.android.exoplayer2.drm.DrmInitData");
    }

    public static void f(t9.p pVar, int i17, u8.s sVar) {
        pVar.w(i17 + 8);
        int c17 = pVar.c();
        int i18 = u8.c.f425190b;
        int i19 = c17 & 16777215;
        if ((i19 & 1) != 0) {
            throw new m8.x("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z17 = (i19 & 2) != 0;
        int p17 = pVar.p();
        if (p17 != sVar.f425370e) {
            throw new m8.x("Length mismatch: " + p17 + ", " + sVar.f425370e);
        }
        java.util.Arrays.fill(sVar.f425378m, 0, p17, z17);
        int i27 = pVar.f416542c - pVar.f416541b;
        t9.p pVar2 = sVar.f425381p;
        if (pVar2 == null || pVar2.f416542c < i27) {
            sVar.f425381p = new t9.p(i27);
        }
        sVar.f425380o = i27;
        sVar.f425377l = true;
        sVar.f425382q = true;
        pVar.b(sVar.f425381p.f416540a, 0, i27);
        sVar.f425381p.w(0);
        sVar.f425382q = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x016d, code lost:
    
        if ((r14 & 31) == 6) goto L80;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0614 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0002 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02aa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0004 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v10, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r8v13 */
    @Override // q8.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int a(q8.f r29, q8.k r30) {
        /*
            Method dump skipped, instructions count: 1574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u8.l.a(q8.f, q8.k):int");
    }

    @Override // q8.e
    public void b(q8.g gVar) {
        this.A = gVar;
    }

    public final void d() {
        int i17 = this.f425278a;
        int i18 = i17 & 4;
        android.util.SparseArray sparseArray = this.f425279b;
        if (i18 != 0 && this.B == null) {
            q8.o l17 = this.A.l(sparseArray.size(), 4);
            this.B = l17;
            l17.c(com.google.android.exoplayer2.Format.e(null, com.tencent.thumbplayer.tmediacodec.util.MimeTypes.APPLICATION_EMSG, com.tencent.wcdb.core.Database.DictDefaultMatchValue));
        }
        if ((i17 & 8) == 0 || this.C != null) {
            return;
        }
        q8.o l18 = this.A.l(sparseArray.size() + 1, 3);
        l18.c(com.google.android.exoplayer2.Format.h(null, com.tencent.thumbplayer.tmediacodec.util.MimeTypes.APPLICATION_CEA608, 0, null, null));
        this.C = new q8.o[]{l18};
    }

    @Override // q8.e
    public boolean e(q8.f fVar) {
        return u8.p.a(fVar, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:350:0x0736, code lost:
    
        r7 = r0;
        r7.f425290m = 0;
        r7.f425293p = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x073c, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:141:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0611  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(long r56) {
        /*
            Method dump skipped, instructions count: 1853
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u8.l.g(long):void");
    }

    @Override // q8.e
    public void release() {
    }

    @Override // q8.e
    public void seek(long j17, long j18) {
        android.util.SparseArray sparseArray = this.f425279b;
        int size = sparseArray.size();
        for (int i17 = 0; i17 < size; i17++) {
            ((u8.k) sparseArray.valueAt(i17)).b();
        }
        this.f425289l.clear();
        this.f425296s = 0;
        this.f425288k.clear();
        this.f425290m = 0;
        this.f425293p = 0;
    }
}
