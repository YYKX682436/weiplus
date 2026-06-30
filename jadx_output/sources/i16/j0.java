package i16;

/* loaded from: classes16.dex */
public final class j0 extends p16.s {
    public static final i16.j0 A;
    public static final p16.j0 B = new i16.h0();

    /* renamed from: e, reason: collision with root package name */
    public final p16.g f287525e;

    /* renamed from: f, reason: collision with root package name */
    public int f287526f;

    /* renamed from: g, reason: collision with root package name */
    public int f287527g;

    /* renamed from: h, reason: collision with root package name */
    public int f287528h;

    /* renamed from: i, reason: collision with root package name */
    public int f287529i;

    /* renamed from: m, reason: collision with root package name */
    public i16.l1 f287530m;

    /* renamed from: n, reason: collision with root package name */
    public int f287531n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.List f287532o;

    /* renamed from: p, reason: collision with root package name */
    public i16.l1 f287533p;

    /* renamed from: q, reason: collision with root package name */
    public int f287534q;

    /* renamed from: r, reason: collision with root package name */
    public java.util.List f287535r;

    /* renamed from: s, reason: collision with root package name */
    public java.util.List f287536s;

    /* renamed from: t, reason: collision with root package name */
    public int f287537t;

    /* renamed from: u, reason: collision with root package name */
    public java.util.List f287538u;

    /* renamed from: v, reason: collision with root package name */
    public i16.v1 f287539v;

    /* renamed from: w, reason: collision with root package name */
    public java.util.List f287540w;

    /* renamed from: x, reason: collision with root package name */
    public i16.u f287541x;

    /* renamed from: y, reason: collision with root package name */
    public byte f287542y;

    /* renamed from: z, reason: collision with root package name */
    public int f287543z;

    static {
        i16.j0 j0Var = new i16.j0(true);
        A = j0Var;
        j0Var.l();
    }

    public j0(p16.q qVar, i16.a aVar) {
        super(qVar);
        this.f287537t = -1;
        this.f287542y = (byte) -1;
        this.f287543z = -1;
        this.f287525e = qVar.f351337d;
    }

    @Override // p16.h0
    public void a(p16.j jVar) {
        getSerializedSize();
        p16.r i17 = i();
        if ((this.f287526f & 2) == 2) {
            jVar.m(1, this.f287528h);
        }
        if ((this.f287526f & 4) == 4) {
            jVar.m(2, this.f287529i);
        }
        if ((this.f287526f & 8) == 8) {
            jVar.o(3, this.f287530m);
        }
        for (int i18 = 0; i18 < this.f287532o.size(); i18++) {
            jVar.o(4, (p16.h0) this.f287532o.get(i18));
        }
        if ((this.f287526f & 32) == 32) {
            jVar.o(5, this.f287533p);
        }
        for (int i19 = 0; i19 < this.f287538u.size(); i19++) {
            jVar.o(6, (p16.h0) this.f287538u.get(i19));
        }
        if ((this.f287526f & 16) == 16) {
            jVar.m(7, this.f287531n);
        }
        if ((this.f287526f & 64) == 64) {
            jVar.m(8, this.f287534q);
        }
        if ((this.f287526f & 1) == 1) {
            jVar.m(9, this.f287527g);
        }
        for (int i27 = 0; i27 < this.f287535r.size(); i27++) {
            jVar.o(10, (p16.h0) this.f287535r.get(i27));
        }
        if (this.f287536s.size() > 0) {
            jVar.v(90);
            jVar.v(this.f287537t);
        }
        for (int i28 = 0; i28 < this.f287536s.size(); i28++) {
            jVar.n(((java.lang.Integer) this.f287536s.get(i28)).intValue());
        }
        if ((this.f287526f & 128) == 128) {
            jVar.o(30, this.f287539v);
        }
        for (int i29 = 0; i29 < this.f287540w.size(); i29++) {
            jVar.m(31, ((java.lang.Integer) this.f287540w.get(i29)).intValue());
        }
        if ((this.f287526f & 256) == 256) {
            jVar.o(32, this.f287541x);
        }
        i17.a(19000, jVar);
        jVar.r(this.f287525e);
    }

    @Override // p16.i0
    public p16.h0 getDefaultInstanceForType() {
        return A;
    }

    @Override // p16.h0
    public int getSerializedSize() {
        int i17 = this.f287543z;
        if (i17 != -1) {
            return i17;
        }
        int b17 = (this.f287526f & 2) == 2 ? p16.j.b(1, this.f287528h) + 0 : 0;
        if ((this.f287526f & 4) == 4) {
            b17 += p16.j.b(2, this.f287529i);
        }
        if ((this.f287526f & 8) == 8) {
            b17 += p16.j.d(3, this.f287530m);
        }
        for (int i18 = 0; i18 < this.f287532o.size(); i18++) {
            b17 += p16.j.d(4, (p16.h0) this.f287532o.get(i18));
        }
        if ((this.f287526f & 32) == 32) {
            b17 += p16.j.d(5, this.f287533p);
        }
        for (int i19 = 0; i19 < this.f287538u.size(); i19++) {
            b17 += p16.j.d(6, (p16.h0) this.f287538u.get(i19));
        }
        if ((this.f287526f & 16) == 16) {
            b17 += p16.j.b(7, this.f287531n);
        }
        if ((this.f287526f & 64) == 64) {
            b17 += p16.j.b(8, this.f287534q);
        }
        if ((this.f287526f & 1) == 1) {
            b17 += p16.j.b(9, this.f287527g);
        }
        for (int i27 = 0; i27 < this.f287535r.size(); i27++) {
            b17 += p16.j.d(10, (p16.h0) this.f287535r.get(i27));
        }
        int i28 = 0;
        for (int i29 = 0; i29 < this.f287536s.size(); i29++) {
            i28 += p16.j.c(((java.lang.Integer) this.f287536s.get(i29)).intValue());
        }
        int i37 = b17 + i28;
        if (!this.f287536s.isEmpty()) {
            i37 = i37 + 1 + p16.j.c(i28);
        }
        this.f287537t = i28;
        if ((this.f287526f & 128) == 128) {
            i37 += p16.j.d(30, this.f287539v);
        }
        int i38 = 0;
        for (int i39 = 0; i39 < this.f287540w.size(); i39++) {
            i38 += p16.j.c(((java.lang.Integer) this.f287540w.get(i39)).intValue());
        }
        int size = i37 + i38 + (this.f287540w.size() * 2);
        if ((this.f287526f & 256) == 256) {
            size += p16.j.d(32, this.f287541x);
        }
        int e17 = size + e() + this.f287525e.size();
        this.f287543z = e17;
        return e17;
    }

    @Override // p16.i0
    public final boolean isInitialized() {
        byte b17 = this.f287542y;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        int i17 = this.f287526f;
        if (!((i17 & 4) == 4)) {
            this.f287542y = (byte) 0;
            return false;
        }
        if (((i17 & 8) == 8) && !this.f287530m.isInitialized()) {
            this.f287542y = (byte) 0;
            return false;
        }
        for (int i18 = 0; i18 < this.f287532o.size(); i18++) {
            if (!((i16.s1) this.f287532o.get(i18)).isInitialized()) {
                this.f287542y = (byte) 0;
                return false;
            }
        }
        if (((this.f287526f & 32) == 32) && !this.f287533p.isInitialized()) {
            this.f287542y = (byte) 0;
            return false;
        }
        for (int i19 = 0; i19 < this.f287535r.size(); i19++) {
            if (!((i16.l1) this.f287535r.get(i19)).isInitialized()) {
                this.f287542y = (byte) 0;
                return false;
            }
        }
        for (int i27 = 0; i27 < this.f287538u.size(); i27++) {
            if (!((i16.y1) this.f287538u.get(i27)).isInitialized()) {
                this.f287542y = (byte) 0;
                return false;
            }
        }
        if (((this.f287526f & 128) == 128) && !this.f287539v.isInitialized()) {
            this.f287542y = (byte) 0;
            return false;
        }
        if (((this.f287526f & 256) == 256) && !this.f287541x.isInitialized()) {
            this.f287542y = (byte) 0;
            return false;
        }
        if (d()) {
            this.f287542y = (byte) 1;
            return true;
        }
        this.f287542y = (byte) 0;
        return false;
    }

    public final void l() {
        this.f287527g = 6;
        this.f287528h = 6;
        this.f287529i = 0;
        i16.l1 l1Var = i16.l1.f287580z;
        this.f287530m = l1Var;
        this.f287531n = 0;
        this.f287532o = java.util.Collections.emptyList();
        this.f287533p = l1Var;
        this.f287534q = 0;
        this.f287535r = java.util.Collections.emptyList();
        this.f287536s = java.util.Collections.emptyList();
        this.f287538u = java.util.Collections.emptyList();
        this.f287539v = i16.v1.f287783m;
        this.f287540w = java.util.Collections.emptyList();
        this.f287541x = i16.u.f287755h;
    }

    @Override // p16.h0
    public p16.g0 newBuilderForType() {
        return new i16.i0();
    }

    @Override // p16.h0
    public p16.g0 toBuilder() {
        i16.i0 i0Var = new i16.i0();
        i0Var.e(this);
        return i0Var;
    }

    public j0(boolean z17) {
        this.f287537t = -1;
        this.f287542y = (byte) -1;
        this.f287543z = -1;
        this.f287525e = p16.g.f351283d;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0029. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean] */
    public j0(p16.h hVar, p16.l lVar, i16.a aVar) {
        this.f287537t = -1;
        this.f287542y = (byte) -1;
        this.f287543z = -1;
        l();
        p16.f m17 = p16.g.m();
        p16.j j17 = p16.j.j(m17, 1);
        boolean z17 = false;
        char c17 = 0;
        while (true) {
            ?? r47 = 1024;
            if (!z17) {
                try {
                    try {
                        int n17 = hVar.n();
                        i16.k1 k1Var = null;
                        i16.t tVar = null;
                        i16.u1 u1Var = null;
                        i16.k1 k1Var2 = null;
                        switch (n17) {
                            case 0:
                                z17 = true;
                            case 8:
                                this.f287526f |= 2;
                                this.f287528h = hVar.k();
                            case 16:
                                this.f287526f |= 4;
                                this.f287529i = hVar.k();
                            case 26:
                                if ((this.f287526f & 8) == 8) {
                                    i16.l1 l1Var = this.f287530m;
                                    l1Var.getClass();
                                    k1Var = i16.l1.m(l1Var);
                                }
                                i16.l1 l1Var2 = (i16.l1) hVar.g(i16.l1.A, lVar);
                                this.f287530m = l1Var2;
                                if (k1Var != null) {
                                    k1Var.b(l1Var2);
                                    this.f287530m = k1Var.d();
                                }
                                this.f287526f |= 8;
                            case 34:
                                int i17 = (c17 == true ? 1 : 0) & 32;
                                c17 = c17;
                                if (i17 != 32) {
                                    this.f287532o = new java.util.ArrayList();
                                    c17 = (c17 == true ? 1 : 0) | ' ';
                                }
                                this.f287532o.add(hVar.g(i16.s1.f287726t, lVar));
                            case 42:
                                if ((this.f287526f & 32) == 32) {
                                    i16.l1 l1Var3 = this.f287533p;
                                    l1Var3.getClass();
                                    k1Var2 = i16.l1.m(l1Var3);
                                }
                                i16.l1 l1Var4 = (i16.l1) hVar.g(i16.l1.A, lVar);
                                this.f287533p = l1Var4;
                                if (k1Var2 != null) {
                                    k1Var2.b(l1Var4);
                                    this.f287533p = k1Var2.d();
                                }
                                this.f287526f |= 32;
                            case 50:
                                int i18 = (c17 == true ? 1 : 0) & 1024;
                                c17 = c17;
                                if (i18 != 1024) {
                                    this.f287538u = new java.util.ArrayList();
                                    c17 = (c17 == true ? 1 : 0) | 1024;
                                }
                                this.f287538u.add(hVar.g(i16.y1.f287820s, lVar));
                            case 56:
                                this.f287526f |= 16;
                                this.f287531n = hVar.k();
                            case 64:
                                this.f287526f |= 64;
                                this.f287534q = hVar.k();
                            case 72:
                                this.f287526f |= 1;
                                this.f287527g = hVar.k();
                            case com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_TYPE_ERROR_CREATE_JAVA_DATASOURCE /* 82 */:
                                int i19 = (c17 == true ? 1 : 0) & 256;
                                c17 = c17;
                                if (i19 != 256) {
                                    this.f287535r = new java.util.ArrayList();
                                    c17 = (c17 == true ? 1 : 0) | 256;
                                }
                                this.f287535r.add(hVar.g(i16.l1.A, lVar));
                            case com.tencent.thumbplayer.core.common.TPCodecParamers.TP_PROFILE_H264_EXTENDED /* 88 */:
                                int i27 = (c17 == true ? 1 : 0) & 512;
                                c17 = c17;
                                if (i27 != 512) {
                                    this.f287536s = new java.util.ArrayList();
                                    c17 = (c17 == true ? 1 : 0) | 512;
                                }
                                this.f287536s.add(java.lang.Integer.valueOf(hVar.k()));
                            case 90:
                                int d17 = hVar.d(hVar.k());
                                int i28 = (c17 == true ? 1 : 0) & 512;
                                c17 = c17;
                                if (i28 != 512) {
                                    c17 = c17;
                                    if (hVar.b() > 0) {
                                        this.f287536s = new java.util.ArrayList();
                                        c17 = (c17 == true ? 1 : 0) | 512;
                                    }
                                }
                                while (hVar.b() > 0) {
                                    this.f287536s.add(java.lang.Integer.valueOf(hVar.k()));
                                }
                                hVar.c(d17);
                            case 242:
                                if ((this.f287526f & 128) == 128) {
                                    i16.v1 v1Var = this.f287539v;
                                    v1Var.getClass();
                                    u1Var = i16.v1.d(v1Var);
                                }
                                i16.v1 v1Var2 = (i16.v1) hVar.g(i16.v1.f287784n, lVar);
                                this.f287539v = v1Var2;
                                if (u1Var != null) {
                                    u1Var.d(v1Var2);
                                    this.f287539v = u1Var.c();
                                }
                                this.f287526f |= 128;
                            case 248:
                                int i29 = (c17 == true ? 1 : 0) & 4096;
                                c17 = c17;
                                if (i29 != 4096) {
                                    this.f287540w = new java.util.ArrayList();
                                    c17 = (c17 == true ? 1 : 0) | 4096;
                                }
                                this.f287540w.add(java.lang.Integer.valueOf(hVar.k()));
                            case 250:
                                int d18 = hVar.d(hVar.k());
                                int i37 = (c17 == true ? 1 : 0) & 4096;
                                c17 = c17;
                                if (i37 != 4096) {
                                    c17 = c17;
                                    if (hVar.b() > 0) {
                                        this.f287540w = new java.util.ArrayList();
                                        c17 = (c17 == true ? 1 : 0) | 4096;
                                    }
                                }
                                while (hVar.b() > 0) {
                                    this.f287540w.add(java.lang.Integer.valueOf(hVar.k()));
                                }
                                hVar.c(d18);
                            case 258:
                                if ((this.f287526f & 256) == 256) {
                                    i16.u uVar = this.f287541x;
                                    uVar.getClass();
                                    tVar = new i16.t();
                                    tVar.d(uVar);
                                }
                                i16.u uVar2 = (i16.u) hVar.g(i16.u.f287756i, lVar);
                                this.f287541x = uVar2;
                                if (tVar != null) {
                                    tVar.d(uVar2);
                                    this.f287541x = tVar.c();
                                }
                                this.f287526f |= 256;
                            default:
                                r47 = j(hVar, j17, lVar, n17);
                                if (r47 == 0) {
                                    z17 = true;
                                }
                        }
                    } catch (java.lang.Throwable th6) {
                        if (((c17 == true ? 1 : 0) & 32) == 32) {
                            this.f287532o = java.util.Collections.unmodifiableList(this.f287532o);
                        }
                        if (((c17 == true ? 1 : 0) & 1024) == r47) {
                            this.f287538u = java.util.Collections.unmodifiableList(this.f287538u);
                        }
                        if (((c17 == true ? 1 : 0) & 256) == 256) {
                            this.f287535r = java.util.Collections.unmodifiableList(this.f287535r);
                        }
                        if (((c17 == true ? 1 : 0) & 512) == 512) {
                            this.f287536s = java.util.Collections.unmodifiableList(this.f287536s);
                        }
                        if (((c17 == true ? 1 : 0) & 4096) == 4096) {
                            this.f287540w = java.util.Collections.unmodifiableList(this.f287540w);
                        }
                        try {
                            j17.i();
                        } catch (java.io.IOException unused) {
                            this.f287525e = m17.c();
                            h();
                            throw th6;
                        } catch (java.lang.Throwable th7) {
                            this.f287525e = m17.c();
                            throw th7;
                        }
                    }
                } catch (p16.z e17) {
                    e17.f351371d = this;
                    throw e17;
                } catch (java.io.IOException e18) {
                    p16.z zVar = new p16.z(e18.getMessage());
                    zVar.f351371d = this;
                    throw zVar;
                }
            } else {
                if (((c17 == true ? 1 : 0) & 32) == 32) {
                    this.f287532o = java.util.Collections.unmodifiableList(this.f287532o);
                }
                if (((c17 == true ? 1 : 0) & 1024) == 1024) {
                    this.f287538u = java.util.Collections.unmodifiableList(this.f287538u);
                }
                if (((c17 == true ? 1 : 0) & 256) == 256) {
                    this.f287535r = java.util.Collections.unmodifiableList(this.f287535r);
                }
                if (((c17 == true ? 1 : 0) & 512) == 512) {
                    this.f287536s = java.util.Collections.unmodifiableList(this.f287536s);
                }
                if (((c17 == true ? 1 : 0) & 4096) == 4096) {
                    this.f287540w = java.util.Collections.unmodifiableList(this.f287540w);
                }
                try {
                    j17.i();
                } catch (java.io.IOException unused2) {
                    this.f287525e = m17.c();
                    h();
                    return;
                } catch (java.lang.Throwable th8) {
                    this.f287525e = m17.c();
                    throw th8;
                }
            }
        }
    }
}
