package th5;

/* loaded from: classes12.dex */
public final class q extends th5.b {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f419446d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f419447e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f419448f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f419449g;

    /* renamed from: h, reason: collision with root package name */
    public mf3.w f419450h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f419451i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f419452j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f419453k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f419454l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(int i17, java.lang.String originUrl, java.lang.String thumbUrl, java.lang.String liveVideoUrl, long j17, java.lang.String originLiveVideoUrl, com.tencent.mm.feature.gallery.api.BizData bizData) {
        super(i17, j17, bizData);
        kotlin.jvm.internal.o.g(originUrl, "originUrl");
        kotlin.jvm.internal.o.g(thumbUrl, "thumbUrl");
        kotlin.jvm.internal.o.g(liveVideoUrl, "liveVideoUrl");
        kotlin.jvm.internal.o.g(originLiveVideoUrl, "originLiveVideoUrl");
        kotlin.jvm.internal.o.g(bizData, "bizData");
        this.f419446d = originUrl;
        this.f419447e = thumbUrl;
        this.f419448f = liveVideoUrl;
        this.f419449g = originLiveVideoUrl;
        this.f419450h = mf3.w.f326128d;
        this.f419451i = "";
        this.f419452j = "";
        this.f419453k = "";
        this.f419454l = "";
        java.lang.String j18 = j();
        if ((this.f419451i.length() == 0) && com.tencent.mm.vfs.w6.j(j18)) {
            this.f419451i = j18;
        }
        java.lang.String k17 = k();
        if ((this.f419452j.length() == 0) && com.tencent.mm.vfs.w6.j(k17)) {
            this.f419452j = k17;
        }
        java.lang.String l17 = l();
        if ((this.f419453k.length() == 0) && com.tencent.mm.vfs.w6.j(l17)) {
            this.f419453k = l17;
        }
        java.lang.String i18 = i();
        if ((this.f419454l.length() == 0) && com.tencent.mm.vfs.w6.j(i18)) {
            this.f419454l = i18;
        }
        if (h()) {
            boolean z17 = (this.f419452j.length() > 0) && com.tencent.mm.vfs.w6.j(this.f419452j);
            boolean z18 = (this.f419454l.length() > 0) && com.tencent.mm.vfs.w6.j(this.f419454l);
            if (z17 && z18) {
                this.f419450h = mf3.w.f326129e;
                return;
            }
            return;
        }
        if ((r26.n0.N(originUrl) ^ true) && (r26.n0.N(thumbUrl) ^ true) && !kotlin.jvm.internal.o.b(originUrl, thumbUrl)) {
            if ((this.f419452j.length() > 0) && com.tencent.mm.vfs.w6.j(this.f419452j)) {
                this.f419450h = mf3.w.f326129e;
            }
        }
    }

    @Override // mf3.k
    public gg3.c a() {
        java.lang.String str;
        java.lang.String c17 = e().a(sf3.m.f407404f).c();
        if (this.f419450h == mf3.w.f326129e) {
            if (this.f419454l.length() > 0) {
                str = this.f419454l;
                return new gg3.c(getId(), c17, str, null, 0L, false, 40, null);
            }
        }
        str = this.f419453k;
        return new gg3.c(getId(), c17, str, null, 0L, false, 40, null);
    }

    public final java.lang.String b() {
        if (this.f419450h == mf3.w.f326129e) {
            if ((this.f419452j.length() > 0) && com.tencent.mm.vfs.w6.j(this.f419452j)) {
                return this.f419452j;
            }
        }
        if ((this.f419451i.length() > 0) && com.tencent.mm.vfs.w6.j(this.f419451i)) {
            return this.f419451i;
        }
        if ((this.f419452j.length() > 0) && com.tencent.mm.vfs.w6.j(this.f419452j)) {
            return this.f419452j;
        }
        java.lang.String str = this.f419451i;
        return str.length() == 0 ? this.f419452j : str;
    }

    @Override // mf3.k
    public eg3.i c() {
        return null;
    }

    public final java.lang.String d() {
        th5.a1 a1Var = th5.a1.f419340a;
        java.lang.String a17 = a1Var.a(this.f419446d);
        java.lang.String a18 = a1Var.a(this.f419447e);
        java.lang.String a19 = a1Var.a(this.f419448f);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f419342a);
        sb6.append('_');
        sb6.append(a17.hashCode());
        sb6.append('_');
        sb6.append(a18.hashCode());
        sb6.append('_');
        sb6.append(a19.hashCode());
        return r26.i0.u(sb6.toString(), '-', '_', false, 4, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0076, code lost:
    
        if (com.tencent.mm.vfs.w6.j(r14.f419452j) != false) goto L16;
     */
    @Override // mf3.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public sf3.g e() {
        /*
            r14 = this;
            java.lang.String r0 = r14.f419451i
            int r1 = r0.length()
            r2 = 0
            r3 = 1
            if (r1 != 0) goto Lc
            r1 = r3
            goto Ld
        Lc:
            r1 = r2
        Ld:
            if (r1 == 0) goto L13
            java.lang.String r0 = r14.j()
        L13:
            java.lang.String r1 = r14.f419452j
            int r4 = r1.length()
            if (r4 != 0) goto L1d
            r4 = r3
            goto L1e
        L1d:
            r4 = r2
        L1e:
            if (r4 == 0) goto L24
            java.lang.String r1 = r14.k()
        L24:
            java.lang.String r6 = r14.getId()
            java.lang.String r4 = "mediaId"
            kotlin.jvm.internal.o.g(r6, r4)
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            sf3.m r4 = sf3.m.f407406h
            java.lang.String r7 = "path"
            kotlin.jvm.internal.o.g(r0, r7)
            r5.put(r4, r0)
            sf3.m r13 = sf3.m.f407404f
            r5.put(r13, r0)
            sf3.m r0 = sf3.m.f407403e
            kotlin.jvm.internal.o.g(r1, r7)
            r5.put(r0, r1)
            sf3.g r1 = new sf3.g
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 60
            r12 = 0
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            mf3.w r4 = r14.f419450h
            int[] r5 = th5.p.f419442a
            int r4 = r4.ordinal()
            r4 = r5[r4]
            if (r4 != r3) goto L65
        L63:
            r13 = r0
            goto L79
        L65:
            java.lang.String r4 = r14.f419452j
            int r4 = r4.length()
            if (r4 <= 0) goto L6e
            r2 = r3
        L6e:
            if (r2 == 0) goto L79
            java.lang.String r2 = r14.f419452j
            boolean r2 = com.tencent.mm.vfs.w6.j(r2)
            if (r2 == 0) goto L79
            goto L63
        L79:
            sf3.g r0 = r1.a(r13)
            th5.x r1 = new th5.x
            r1.<init>()
            r0.f407392f = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: th5.q.e():sf3.g");
    }

    @Override // mf3.k
    public void f(mf3.w level) {
        kotlin.jvm.internal.o.g(level, "level");
        this.f419450h = level;
    }

    @Override // mf3.k
    public java.lang.String g() {
        if (this.f419450h == mf3.w.f326129e) {
            if ((this.f419454l.length() > 0) && com.tencent.mm.vfs.w6.j(this.f419454l)) {
                return this.f419454l;
            }
        }
        return ((this.f419453k.length() > 0) && com.tencent.mm.vfs.w6.j(this.f419453k)) ? this.f419453k : b();
    }

    @Override // mf3.k
    public java.lang.String getId() {
        long hashCode = ((d().hashCode() & io.flutter.embedding.android.KeyboardMap.kValueMask) | ((io.flutter.embedding.android.KeyboardMap.kValueMask & this.f419342a) << 32)) & com.tencent.wcdb.core.Database.DictDefaultMatchValue;
        if (hashCode == 0) {
            hashCode = 1;
        }
        return java.lang.String.valueOf(hashCode);
    }

    @Override // mf3.k
    public mf3.w getLevel() {
        return this.f419450h;
    }

    @Override // mf3.k
    public mf3.u getType() {
        return mf3.u.f326125g;
    }

    public final boolean h() {
        boolean z17;
        boolean z18 = !r26.n0.N(this.f419449g);
        java.lang.String str = this.f419446d;
        if (!r26.n0.N(str)) {
            java.lang.String str2 = this.f419447e;
            if ((!r26.n0.N(str2)) && !kotlin.jvm.internal.o.b(str, str2)) {
                z17 = true;
                return !z17 && z18;
            }
        }
        z17 = false;
        if (z17) {
        }
    }

    public final java.lang.String i() {
        th5.m mVar = th5.m.f419407a;
        return ((java.lang.String) ((jz5.n) th5.m.f419408b).getValue()) + d() + "_live_hd.mp4";
    }

    public final java.lang.String j() {
        return th5.m.f419407a.b(d().concat("_mid"));
    }

    public final java.lang.String k() {
        return th5.m.f419407a.a(d().concat("_raw"));
    }

    public final java.lang.String l() {
        th5.m mVar = th5.m.f419407a;
        return ((java.lang.String) ((jz5.n) th5.m.f419408b).getValue()) + d() + "_live.mp4";
    }
}
