package i16;

/* loaded from: classes16.dex */
public final class h extends p16.v implements p16.i0 {

    /* renamed from: v, reason: collision with root package name */
    public static final i16.h f287470v;

    /* renamed from: w, reason: collision with root package name */
    public static final p16.j0 f287471w = new i16.e();

    /* renamed from: d, reason: collision with root package name */
    public final p16.g f287472d;

    /* renamed from: e, reason: collision with root package name */
    public int f287473e;

    /* renamed from: f, reason: collision with root package name */
    public i16.g f287474f;

    /* renamed from: g, reason: collision with root package name */
    public long f287475g;

    /* renamed from: h, reason: collision with root package name */
    public float f287476h;

    /* renamed from: i, reason: collision with root package name */
    public double f287477i;

    /* renamed from: m, reason: collision with root package name */
    public int f287478m;

    /* renamed from: n, reason: collision with root package name */
    public int f287479n;

    /* renamed from: o, reason: collision with root package name */
    public int f287480o;

    /* renamed from: p, reason: collision with root package name */
    public i16.k f287481p;

    /* renamed from: q, reason: collision with root package name */
    public java.util.List f287482q;

    /* renamed from: r, reason: collision with root package name */
    public int f287483r;

    /* renamed from: s, reason: collision with root package name */
    public int f287484s;

    /* renamed from: t, reason: collision with root package name */
    public byte f287485t;

    /* renamed from: u, reason: collision with root package name */
    public int f287486u;

    static {
        i16.h hVar = new i16.h(true);
        f287470v = hVar;
        hVar.d();
    }

    public h(p16.p pVar, i16.a aVar) {
        super(pVar);
        this.f287485t = (byte) -1;
        this.f287486u = -1;
        this.f287472d = pVar.f351337d;
    }

    @Override // p16.h0
    public void a(p16.j jVar) {
        getSerializedSize();
        if ((this.f287473e & 1) == 1) {
            jVar.l(1, this.f287474f.f287450d);
        }
        if ((this.f287473e & 2) == 2) {
            long j17 = this.f287475g;
            jVar.x(2, 0);
            jVar.w((j17 >> 63) ^ (j17 << 1));
        }
        if ((this.f287473e & 4) == 4) {
            float f17 = this.f287476h;
            jVar.x(3, 5);
            jVar.t(java.lang.Float.floatToRawIntBits(f17));
        }
        if ((this.f287473e & 8) == 8) {
            double d17 = this.f287477i;
            jVar.x(4, 1);
            jVar.u(java.lang.Double.doubleToRawLongBits(d17));
        }
        if ((this.f287473e & 16) == 16) {
            jVar.m(5, this.f287478m);
        }
        if ((this.f287473e & 32) == 32) {
            jVar.m(6, this.f287479n);
        }
        if ((this.f287473e & 64) == 64) {
            jVar.m(7, this.f287480o);
        }
        if ((this.f287473e & 128) == 128) {
            jVar.o(8, this.f287481p);
        }
        for (int i17 = 0; i17 < this.f287482q.size(); i17++) {
            jVar.o(9, (p16.h0) this.f287482q.get(i17));
        }
        if ((this.f287473e & 512) == 512) {
            jVar.m(10, this.f287484s);
        }
        if ((this.f287473e & 256) == 256) {
            jVar.m(11, this.f287483r);
        }
        jVar.r(this.f287472d);
    }

    public final void d() {
        this.f287474f = i16.g.BYTE;
        this.f287475g = 0L;
        this.f287476h = 0.0f;
        this.f287477i = 0.0d;
        this.f287478m = 0;
        this.f287479n = 0;
        this.f287480o = 0;
        this.f287481p = i16.k.f287553m;
        this.f287482q = java.util.Collections.emptyList();
        this.f287483r = 0;
        this.f287484s = 0;
    }

    @Override // p16.h0
    public int getSerializedSize() {
        int i17 = this.f287486u;
        if (i17 != -1) {
            return i17;
        }
        int a17 = (this.f287473e & 1) == 1 ? p16.j.a(1, this.f287474f.f287450d) + 0 : 0;
        if ((this.f287473e & 2) == 2) {
            long j17 = this.f287475g;
            a17 += p16.j.h(2) + p16.j.g((j17 >> 63) ^ (j17 << 1));
        }
        if ((this.f287473e & 4) == 4) {
            a17 += p16.j.h(3) + 4;
        }
        if ((this.f287473e & 8) == 8) {
            a17 += p16.j.h(4) + 8;
        }
        if ((this.f287473e & 16) == 16) {
            a17 += p16.j.b(5, this.f287478m);
        }
        if ((this.f287473e & 32) == 32) {
            a17 += p16.j.b(6, this.f287479n);
        }
        if ((this.f287473e & 64) == 64) {
            a17 += p16.j.b(7, this.f287480o);
        }
        if ((this.f287473e & 128) == 128) {
            a17 += p16.j.d(8, this.f287481p);
        }
        for (int i18 = 0; i18 < this.f287482q.size(); i18++) {
            a17 += p16.j.d(9, (p16.h0) this.f287482q.get(i18));
        }
        if ((this.f287473e & 512) == 512) {
            a17 += p16.j.b(10, this.f287484s);
        }
        if ((this.f287473e & 256) == 256) {
            a17 += p16.j.b(11, this.f287483r);
        }
        int size = a17 + this.f287472d.size();
        this.f287486u = size;
        return size;
    }

    @Override // p16.i0
    public final boolean isInitialized() {
        byte b17 = this.f287485t;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        if (((this.f287473e & 128) == 128) && !this.f287481p.isInitialized()) {
            this.f287485t = (byte) 0;
            return false;
        }
        for (int i17 = 0; i17 < this.f287482q.size(); i17++) {
            if (!((i16.h) this.f287482q.get(i17)).isInitialized()) {
                this.f287485t = (byte) 0;
                return false;
            }
        }
        this.f287485t = (byte) 1;
        return true;
    }

    @Override // p16.h0
    public p16.g0 newBuilderForType() {
        return new i16.f();
    }

    @Override // p16.h0
    public p16.g0 toBuilder() {
        i16.f fVar = new i16.f();
        fVar.d(this);
        return fVar;
    }

    public h(boolean z17) {
        this.f287485t = (byte) -1;
        this.f287486u = -1;
        this.f287472d = p16.g.f351283d;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x001e. Please report as an issue. */
    public h(p16.h hVar, p16.l lVar, i16.a aVar) {
        i16.j jVar;
        this.f287485t = (byte) -1;
        this.f287486u = -1;
        d();
        p16.j j17 = p16.j.j(p16.g.m(), 1);
        boolean z17 = false;
        int i17 = 0;
        while (!z17) {
            try {
                try {
                    int n17 = hVar.n();
                    switch (n17) {
                        case 0:
                            z17 = true;
                        case 8:
                            int k17 = hVar.k();
                            i16.g a17 = i16.g.a(k17);
                            if (a17 == null) {
                                j17.v(n17);
                                j17.v(k17);
                            } else {
                                this.f287473e |= 1;
                                this.f287474f = a17;
                            }
                        case 16:
                            this.f287473e |= 2;
                            long l17 = hVar.l();
                            this.f287475g = (-(l17 & 1)) ^ (l17 >>> 1);
                        case 29:
                            this.f287473e |= 4;
                            this.f287476h = java.lang.Float.intBitsToFloat(hVar.i());
                        case 33:
                            this.f287473e |= 8;
                            this.f287477i = java.lang.Double.longBitsToDouble(hVar.j());
                        case 40:
                            this.f287473e |= 16;
                            this.f287478m = hVar.k();
                        case 48:
                            this.f287473e |= 32;
                            this.f287479n = hVar.k();
                        case 56:
                            this.f287473e |= 64;
                            this.f287480o = hVar.k();
                        case 66:
                            if ((this.f287473e & 128) == 128) {
                                i16.k kVar = this.f287481p;
                                kVar.getClass();
                                jVar = new i16.j();
                                jVar.d(kVar);
                            } else {
                                jVar = null;
                            }
                            i16.k kVar2 = (i16.k) hVar.g(i16.k.f287554n, lVar);
                            this.f287481p = kVar2;
                            if (jVar != null) {
                                jVar.d(kVar2);
                                this.f287481p = jVar.c();
                            }
                            this.f287473e |= 128;
                        case 74:
                            if ((i17 & 256) != 256) {
                                this.f287482q = new java.util.ArrayList();
                                i17 |= 256;
                            }
                            this.f287482q.add(hVar.g(f287471w, lVar));
                        case 80:
                            this.f287473e |= 512;
                            this.f287484s = hVar.k();
                        case com.tencent.thumbplayer.core.common.TPCodecParamers.TP_PROFILE_H264_EXTENDED /* 88 */:
                            this.f287473e |= 256;
                            this.f287483r = hVar.k();
                        default:
                            if (!hVar.q(n17, j17)) {
                                z17 = true;
                            }
                    }
                } catch (java.lang.Throwable th6) {
                    if ((i17 & 256) == 256) {
                        this.f287482q = java.util.Collections.unmodifiableList(this.f287482q);
                    }
                    try {
                        j17.i();
                    } catch (java.io.IOException unused) {
                        throw th6;
                    } finally {
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
        }
        if ((i17 & 256) == 256) {
            this.f287482q = java.util.Collections.unmodifiableList(this.f287482q);
        }
        try {
            j17.i();
        } catch (java.io.IOException unused2) {
        } finally {
        }
    }
}
