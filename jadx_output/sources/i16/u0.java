package i16;

/* loaded from: classes16.dex */
public final class u0 extends p16.s {
    public static final i16.u0 A;
    public static final p16.j0 B = new i16.s0();

    /* renamed from: e, reason: collision with root package name */
    public final p16.g f287761e;

    /* renamed from: f, reason: collision with root package name */
    public int f287762f;

    /* renamed from: g, reason: collision with root package name */
    public int f287763g;

    /* renamed from: h, reason: collision with root package name */
    public int f287764h;

    /* renamed from: i, reason: collision with root package name */
    public int f287765i;

    /* renamed from: m, reason: collision with root package name */
    public i16.l1 f287766m;

    /* renamed from: n, reason: collision with root package name */
    public int f287767n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.List f287768o;

    /* renamed from: p, reason: collision with root package name */
    public i16.l1 f287769p;

    /* renamed from: q, reason: collision with root package name */
    public int f287770q;

    /* renamed from: r, reason: collision with root package name */
    public java.util.List f287771r;

    /* renamed from: s, reason: collision with root package name */
    public java.util.List f287772s;

    /* renamed from: t, reason: collision with root package name */
    public int f287773t;

    /* renamed from: u, reason: collision with root package name */
    public i16.y1 f287774u;

    /* renamed from: v, reason: collision with root package name */
    public int f287775v;

    /* renamed from: w, reason: collision with root package name */
    public int f287776w;

    /* renamed from: x, reason: collision with root package name */
    public java.util.List f287777x;

    /* renamed from: y, reason: collision with root package name */
    public byte f287778y;

    /* renamed from: z, reason: collision with root package name */
    public int f287779z;

    static {
        i16.u0 u0Var = new i16.u0(true);
        A = u0Var;
        u0Var.l();
    }

    public u0(p16.q qVar, i16.a aVar) {
        super(qVar);
        this.f287773t = -1;
        this.f287778y = (byte) -1;
        this.f287779z = -1;
        this.f287761e = qVar.f351337d;
    }

    @Override // p16.h0
    public void a(p16.j jVar) {
        getSerializedSize();
        p16.r i17 = i();
        if ((this.f287762f & 2) == 2) {
            jVar.m(1, this.f287764h);
        }
        if ((this.f287762f & 4) == 4) {
            jVar.m(2, this.f287765i);
        }
        if ((this.f287762f & 8) == 8) {
            jVar.o(3, this.f287766m);
        }
        for (int i18 = 0; i18 < this.f287768o.size(); i18++) {
            jVar.o(4, (p16.h0) this.f287768o.get(i18));
        }
        if ((this.f287762f & 32) == 32) {
            jVar.o(5, this.f287769p);
        }
        if ((this.f287762f & 128) == 128) {
            jVar.o(6, this.f287774u);
        }
        if ((this.f287762f & 256) == 256) {
            jVar.m(7, this.f287775v);
        }
        if ((this.f287762f & 512) == 512) {
            jVar.m(8, this.f287776w);
        }
        if ((this.f287762f & 16) == 16) {
            jVar.m(9, this.f287767n);
        }
        if ((this.f287762f & 64) == 64) {
            jVar.m(10, this.f287770q);
        }
        if ((this.f287762f & 1) == 1) {
            jVar.m(11, this.f287763g);
        }
        for (int i19 = 0; i19 < this.f287771r.size(); i19++) {
            jVar.o(12, (p16.h0) this.f287771r.get(i19));
        }
        if (this.f287772s.size() > 0) {
            jVar.v(106);
            jVar.v(this.f287773t);
        }
        for (int i27 = 0; i27 < this.f287772s.size(); i27++) {
            jVar.n(((java.lang.Integer) this.f287772s.get(i27)).intValue());
        }
        for (int i28 = 0; i28 < this.f287777x.size(); i28++) {
            jVar.m(31, ((java.lang.Integer) this.f287777x.get(i28)).intValue());
        }
        i17.a(19000, jVar);
        jVar.r(this.f287761e);
    }

    @Override // p16.i0
    public p16.h0 getDefaultInstanceForType() {
        return A;
    }

    @Override // p16.h0
    public int getSerializedSize() {
        int i17 = this.f287779z;
        if (i17 != -1) {
            return i17;
        }
        int b17 = (this.f287762f & 2) == 2 ? p16.j.b(1, this.f287764h) + 0 : 0;
        if ((this.f287762f & 4) == 4) {
            b17 += p16.j.b(2, this.f287765i);
        }
        if ((this.f287762f & 8) == 8) {
            b17 += p16.j.d(3, this.f287766m);
        }
        for (int i18 = 0; i18 < this.f287768o.size(); i18++) {
            b17 += p16.j.d(4, (p16.h0) this.f287768o.get(i18));
        }
        if ((this.f287762f & 32) == 32) {
            b17 += p16.j.d(5, this.f287769p);
        }
        if ((this.f287762f & 128) == 128) {
            b17 += p16.j.d(6, this.f287774u);
        }
        if ((this.f287762f & 256) == 256) {
            b17 += p16.j.b(7, this.f287775v);
        }
        if ((this.f287762f & 512) == 512) {
            b17 += p16.j.b(8, this.f287776w);
        }
        if ((this.f287762f & 16) == 16) {
            b17 += p16.j.b(9, this.f287767n);
        }
        if ((this.f287762f & 64) == 64) {
            b17 += p16.j.b(10, this.f287770q);
        }
        if ((this.f287762f & 1) == 1) {
            b17 += p16.j.b(11, this.f287763g);
        }
        for (int i19 = 0; i19 < this.f287771r.size(); i19++) {
            b17 += p16.j.d(12, (p16.h0) this.f287771r.get(i19));
        }
        int i27 = 0;
        for (int i28 = 0; i28 < this.f287772s.size(); i28++) {
            i27 += p16.j.c(((java.lang.Integer) this.f287772s.get(i28)).intValue());
        }
        int i29 = b17 + i27;
        if (!this.f287772s.isEmpty()) {
            i29 = i29 + 1 + p16.j.c(i27);
        }
        this.f287773t = i27;
        int i37 = 0;
        for (int i38 = 0; i38 < this.f287777x.size(); i38++) {
            i37 += p16.j.c(((java.lang.Integer) this.f287777x.get(i38)).intValue());
        }
        int size = i29 + i37 + (this.f287777x.size() * 2) + e() + this.f287761e.size();
        this.f287779z = size;
        return size;
    }

    @Override // p16.i0
    public final boolean isInitialized() {
        byte b17 = this.f287778y;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        int i17 = this.f287762f;
        if (!((i17 & 4) == 4)) {
            this.f287778y = (byte) 0;
            return false;
        }
        if (((i17 & 8) == 8) && !this.f287766m.isInitialized()) {
            this.f287778y = (byte) 0;
            return false;
        }
        for (int i18 = 0; i18 < this.f287768o.size(); i18++) {
            if (!((i16.s1) this.f287768o.get(i18)).isInitialized()) {
                this.f287778y = (byte) 0;
                return false;
            }
        }
        if (((this.f287762f & 32) == 32) && !this.f287769p.isInitialized()) {
            this.f287778y = (byte) 0;
            return false;
        }
        for (int i19 = 0; i19 < this.f287771r.size(); i19++) {
            if (!((i16.l1) this.f287771r.get(i19)).isInitialized()) {
                this.f287778y = (byte) 0;
                return false;
            }
        }
        if (((this.f287762f & 128) == 128) && !this.f287774u.isInitialized()) {
            this.f287778y = (byte) 0;
            return false;
        }
        if (d()) {
            this.f287778y = (byte) 1;
            return true;
        }
        this.f287778y = (byte) 0;
        return false;
    }

    public final void l() {
        this.f287763g = md1.d1.CTRL_INDEX;
        this.f287764h = 2054;
        this.f287765i = 0;
        i16.l1 l1Var = i16.l1.f287580z;
        this.f287766m = l1Var;
        this.f287767n = 0;
        this.f287768o = java.util.Collections.emptyList();
        this.f287769p = l1Var;
        this.f287770q = 0;
        this.f287771r = java.util.Collections.emptyList();
        this.f287772s = java.util.Collections.emptyList();
        this.f287774u = i16.y1.f287819r;
        this.f287775v = 0;
        this.f287776w = 0;
        this.f287777x = java.util.Collections.emptyList();
    }

    @Override // p16.h0
    public p16.g0 newBuilderForType() {
        return new i16.t0();
    }

    @Override // p16.h0
    public p16.g0 toBuilder() {
        i16.t0 t0Var = new i16.t0();
        t0Var.e(this);
        return t0Var;
    }

    public u0(boolean z17) {
        this.f287773t = -1;
        this.f287778y = (byte) -1;
        this.f287779z = -1;
        this.f287761e = p16.g.f351283d;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0027. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean] */
    public u0(p16.h hVar, p16.l lVar, i16.a aVar) {
        this.f287773t = -1;
        this.f287778y = (byte) -1;
        this.f287779z = -1;
        l();
        p16.f m17 = p16.g.m();
        p16.j j17 = p16.j.j(m17, 1);
        boolean z17 = false;
        char c17 = 0;
        while (true) {
            ?? r47 = 256;
            if (!z17) {
                try {
                    try {
                        try {
                            int n17 = hVar.n();
                            i16.k1 k1Var = null;
                            i16.x1 x1Var = null;
                            i16.k1 k1Var2 = null;
                            switch (n17) {
                                case 0:
                                    z17 = true;
                                case 8:
                                    this.f287762f |= 2;
                                    this.f287764h = hVar.k();
                                case 16:
                                    this.f287762f |= 4;
                                    this.f287765i = hVar.k();
                                case 26:
                                    if ((this.f287762f & 8) == 8) {
                                        i16.l1 l1Var = this.f287766m;
                                        l1Var.getClass();
                                        k1Var = i16.l1.m(l1Var);
                                    }
                                    i16.l1 l1Var2 = (i16.l1) hVar.g(i16.l1.A, lVar);
                                    this.f287766m = l1Var2;
                                    if (k1Var != null) {
                                        k1Var.b(l1Var2);
                                        this.f287766m = k1Var.d();
                                    }
                                    this.f287762f |= 8;
                                case 34:
                                    int i17 = (c17 == true ? 1 : 0) & 32;
                                    c17 = c17;
                                    if (i17 != 32) {
                                        this.f287768o = new java.util.ArrayList();
                                        c17 = (c17 == true ? 1 : 0) | ' ';
                                    }
                                    this.f287768o.add(hVar.g(i16.s1.f287726t, lVar));
                                case 42:
                                    if ((this.f287762f & 32) == 32) {
                                        i16.l1 l1Var3 = this.f287769p;
                                        l1Var3.getClass();
                                        k1Var2 = i16.l1.m(l1Var3);
                                    }
                                    i16.l1 l1Var4 = (i16.l1) hVar.g(i16.l1.A, lVar);
                                    this.f287769p = l1Var4;
                                    if (k1Var2 != null) {
                                        k1Var2.b(l1Var4);
                                        this.f287769p = k1Var2.d();
                                    }
                                    this.f287762f |= 32;
                                case 50:
                                    if ((this.f287762f & 128) == 128) {
                                        i16.y1 y1Var = this.f287774u;
                                        y1Var.getClass();
                                        x1Var = new i16.x1();
                                        x1Var.e(y1Var);
                                    }
                                    i16.y1 y1Var2 = (i16.y1) hVar.g(i16.y1.f287820s, lVar);
                                    this.f287774u = y1Var2;
                                    if (x1Var != null) {
                                        x1Var.e(y1Var2);
                                        this.f287774u = x1Var.d();
                                    }
                                    this.f287762f |= 128;
                                case 56:
                                    this.f287762f |= 256;
                                    this.f287775v = hVar.k();
                                case 64:
                                    this.f287762f |= 512;
                                    this.f287776w = hVar.k();
                                case 72:
                                    this.f287762f |= 16;
                                    this.f287767n = hVar.k();
                                case 80:
                                    this.f287762f |= 64;
                                    this.f287770q = hVar.k();
                                case com.tencent.thumbplayer.core.common.TPCodecParamers.TP_PROFILE_H264_EXTENDED /* 88 */:
                                    this.f287762f |= 1;
                                    this.f287763g = hVar.k();
                                case 98:
                                    int i18 = (c17 == true ? 1 : 0) & 256;
                                    c17 = c17;
                                    if (i18 != 256) {
                                        this.f287771r = new java.util.ArrayList();
                                        c17 = (c17 == true ? 1 : 0) | 256;
                                    }
                                    this.f287771r.add(hVar.g(i16.l1.A, lVar));
                                case 104:
                                    int i19 = (c17 == true ? 1 : 0) & 512;
                                    c17 = c17;
                                    if (i19 != 512) {
                                        this.f287772s = new java.util.ArrayList();
                                        c17 = (c17 == true ? 1 : 0) | 512;
                                    }
                                    this.f287772s.add(java.lang.Integer.valueOf(hVar.k()));
                                case 106:
                                    int d17 = hVar.d(hVar.k());
                                    int i27 = (c17 == true ? 1 : 0) & 512;
                                    c17 = c17;
                                    if (i27 != 512) {
                                        c17 = c17;
                                        if (hVar.b() > 0) {
                                            this.f287772s = new java.util.ArrayList();
                                            c17 = (c17 == true ? 1 : 0) | 512;
                                        }
                                    }
                                    while (hVar.b() > 0) {
                                        this.f287772s.add(java.lang.Integer.valueOf(hVar.k()));
                                    }
                                    hVar.c(d17);
                                case 248:
                                    int i28 = (c17 == true ? 1 : 0) & 8192;
                                    c17 = c17;
                                    if (i28 != 8192) {
                                        this.f287777x = new java.util.ArrayList();
                                        c17 = (c17 == true ? 1 : 0) | 8192;
                                    }
                                    this.f287777x.add(java.lang.Integer.valueOf(hVar.k()));
                                case 250:
                                    int d18 = hVar.d(hVar.k());
                                    int i29 = (c17 == true ? 1 : 0) & 8192;
                                    c17 = c17;
                                    if (i29 != 8192) {
                                        c17 = c17;
                                        if (hVar.b() > 0) {
                                            this.f287777x = new java.util.ArrayList();
                                            c17 = (c17 == true ? 1 : 0) | 8192;
                                        }
                                    }
                                    while (hVar.b() > 0) {
                                        this.f287777x.add(java.lang.Integer.valueOf(hVar.k()));
                                    }
                                    hVar.c(d18);
                                default:
                                    r47 = j(hVar, j17, lVar, n17);
                                    if (r47 == 0) {
                                        z17 = true;
                                    }
                            }
                        } catch (java.io.IOException e17) {
                            p16.z zVar = new p16.z(e17.getMessage());
                            zVar.f351371d = this;
                            throw zVar;
                        }
                    } catch (p16.z e18) {
                        e18.f351371d = this;
                        throw e18;
                    }
                } catch (java.lang.Throwable th6) {
                    if (((c17 == true ? 1 : 0) & 32) == 32) {
                        this.f287768o = java.util.Collections.unmodifiableList(this.f287768o);
                    }
                    if (((c17 == true ? 1 : 0) & 256) == r47) {
                        this.f287771r = java.util.Collections.unmodifiableList(this.f287771r);
                    }
                    if (((c17 == true ? 1 : 0) & 512) == 512) {
                        this.f287772s = java.util.Collections.unmodifiableList(this.f287772s);
                    }
                    if (((c17 == true ? 1 : 0) & 8192) == 8192) {
                        this.f287777x = java.util.Collections.unmodifiableList(this.f287777x);
                    }
                    try {
                        j17.i();
                    } catch (java.io.IOException unused) {
                        this.f287761e = m17.c();
                        h();
                        throw th6;
                    } catch (java.lang.Throwable th7) {
                        this.f287761e = m17.c();
                        throw th7;
                    }
                }
            } else {
                if (((c17 == true ? 1 : 0) & 32) == 32) {
                    this.f287768o = java.util.Collections.unmodifiableList(this.f287768o);
                }
                if (((c17 == true ? 1 : 0) & 256) == 256) {
                    this.f287771r = java.util.Collections.unmodifiableList(this.f287771r);
                }
                if (((c17 == true ? 1 : 0) & 512) == 512) {
                    this.f287772s = java.util.Collections.unmodifiableList(this.f287772s);
                }
                if (((c17 == true ? 1 : 0) & 8192) == 8192) {
                    this.f287777x = java.util.Collections.unmodifiableList(this.f287777x);
                }
                try {
                    j17.i();
                } catch (java.io.IOException unused2) {
                    this.f287761e = m17.c();
                    h();
                    return;
                } catch (java.lang.Throwable th8) {
                    this.f287761e = m17.c();
                    throw th8;
                }
            }
        }
    }
}
