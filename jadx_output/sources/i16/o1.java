package i16;

/* loaded from: classes16.dex */
public final class o1 extends p16.s {

    /* renamed from: u, reason: collision with root package name */
    public static final i16.o1 f287670u;

    /* renamed from: v, reason: collision with root package name */
    public static final p16.j0 f287671v = new i16.m1();

    /* renamed from: e, reason: collision with root package name */
    public final p16.g f287672e;

    /* renamed from: f, reason: collision with root package name */
    public int f287673f;

    /* renamed from: g, reason: collision with root package name */
    public int f287674g;

    /* renamed from: h, reason: collision with root package name */
    public int f287675h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.List f287676i;

    /* renamed from: m, reason: collision with root package name */
    public i16.l1 f287677m;

    /* renamed from: n, reason: collision with root package name */
    public int f287678n;

    /* renamed from: o, reason: collision with root package name */
    public i16.l1 f287679o;

    /* renamed from: p, reason: collision with root package name */
    public int f287680p;

    /* renamed from: q, reason: collision with root package name */
    public java.util.List f287681q;

    /* renamed from: r, reason: collision with root package name */
    public java.util.List f287682r;

    /* renamed from: s, reason: collision with root package name */
    public byte f287683s;

    /* renamed from: t, reason: collision with root package name */
    public int f287684t;

    static {
        i16.o1 o1Var = new i16.o1(true);
        f287670u = o1Var;
        o1Var.l();
    }

    public o1(p16.q qVar, i16.a aVar) {
        super(qVar);
        this.f287683s = (byte) -1;
        this.f287684t = -1;
        this.f287672e = qVar.f351337d;
    }

    @Override // p16.h0
    public void a(p16.j jVar) {
        getSerializedSize();
        p16.r i17 = i();
        if ((this.f287673f & 1) == 1) {
            jVar.m(1, this.f287674g);
        }
        if ((this.f287673f & 2) == 2) {
            jVar.m(2, this.f287675h);
        }
        for (int i18 = 0; i18 < this.f287676i.size(); i18++) {
            jVar.o(3, (p16.h0) this.f287676i.get(i18));
        }
        if ((this.f287673f & 4) == 4) {
            jVar.o(4, this.f287677m);
        }
        if ((this.f287673f & 8) == 8) {
            jVar.m(5, this.f287678n);
        }
        if ((this.f287673f & 16) == 16) {
            jVar.o(6, this.f287679o);
        }
        if ((this.f287673f & 32) == 32) {
            jVar.m(7, this.f287680p);
        }
        for (int i19 = 0; i19 < this.f287681q.size(); i19++) {
            jVar.o(8, (p16.h0) this.f287681q.get(i19));
        }
        for (int i27 = 0; i27 < this.f287682r.size(); i27++) {
            jVar.m(31, ((java.lang.Integer) this.f287682r.get(i27)).intValue());
        }
        i17.a(200, jVar);
        jVar.r(this.f287672e);
    }

    @Override // p16.i0
    public p16.h0 getDefaultInstanceForType() {
        return f287670u;
    }

    @Override // p16.h0
    public int getSerializedSize() {
        int i17 = this.f287684t;
        if (i17 != -1) {
            return i17;
        }
        int b17 = (this.f287673f & 1) == 1 ? p16.j.b(1, this.f287674g) + 0 : 0;
        if ((this.f287673f & 2) == 2) {
            b17 += p16.j.b(2, this.f287675h);
        }
        for (int i18 = 0; i18 < this.f287676i.size(); i18++) {
            b17 += p16.j.d(3, (p16.h0) this.f287676i.get(i18));
        }
        if ((this.f287673f & 4) == 4) {
            b17 += p16.j.d(4, this.f287677m);
        }
        if ((this.f287673f & 8) == 8) {
            b17 += p16.j.b(5, this.f287678n);
        }
        if ((this.f287673f & 16) == 16) {
            b17 += p16.j.d(6, this.f287679o);
        }
        if ((this.f287673f & 32) == 32) {
            b17 += p16.j.b(7, this.f287680p);
        }
        for (int i19 = 0; i19 < this.f287681q.size(); i19++) {
            b17 += p16.j.d(8, (p16.h0) this.f287681q.get(i19));
        }
        int i27 = 0;
        for (int i28 = 0; i28 < this.f287682r.size(); i28++) {
            i27 += p16.j.c(((java.lang.Integer) this.f287682r.get(i28)).intValue());
        }
        int size = b17 + i27 + (this.f287682r.size() * 2) + e() + this.f287672e.size();
        this.f287684t = size;
        return size;
    }

    @Override // p16.i0
    public final boolean isInitialized() {
        byte b17 = this.f287683s;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        if (!((this.f287673f & 2) == 2)) {
            this.f287683s = (byte) 0;
            return false;
        }
        for (int i17 = 0; i17 < this.f287676i.size(); i17++) {
            if (!((i16.s1) this.f287676i.get(i17)).isInitialized()) {
                this.f287683s = (byte) 0;
                return false;
            }
        }
        if (((this.f287673f & 4) == 4) && !this.f287677m.isInitialized()) {
            this.f287683s = (byte) 0;
            return false;
        }
        if (((this.f287673f & 16) == 16) && !this.f287679o.isInitialized()) {
            this.f287683s = (byte) 0;
            return false;
        }
        for (int i18 = 0; i18 < this.f287681q.size(); i18++) {
            if (!((i16.k) this.f287681q.get(i18)).isInitialized()) {
                this.f287683s = (byte) 0;
                return false;
            }
        }
        if (d()) {
            this.f287683s = (byte) 1;
            return true;
        }
        this.f287683s = (byte) 0;
        return false;
    }

    public final void l() {
        this.f287674g = 6;
        this.f287675h = 0;
        this.f287676i = java.util.Collections.emptyList();
        i16.l1 l1Var = i16.l1.f287580z;
        this.f287677m = l1Var;
        this.f287678n = 0;
        this.f287679o = l1Var;
        this.f287680p = 0;
        this.f287681q = java.util.Collections.emptyList();
        this.f287682r = java.util.Collections.emptyList();
    }

    @Override // p16.h0
    public p16.g0 newBuilderForType() {
        return new i16.n1();
    }

    @Override // p16.h0
    public p16.g0 toBuilder() {
        i16.n1 n1Var = new i16.n1();
        n1Var.e(this);
        return n1Var;
    }

    public o1(boolean z17) {
        this.f287683s = (byte) -1;
        this.f287684t = -1;
        this.f287672e = p16.g.f351283d;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0022. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean] */
    public o1(p16.h hVar, p16.l lVar, i16.a aVar) {
        this.f287683s = (byte) -1;
        this.f287684t = -1;
        l();
        p16.f m17 = p16.g.m();
        p16.j j17 = p16.j.j(m17, 1);
        boolean z17 = false;
        int i17 = 0;
        while (true) {
            ?? r47 = 4;
            if (!z17) {
                try {
                    try {
                        int n17 = hVar.n();
                        i16.k1 k1Var = null;
                        switch (n17) {
                            case 0:
                                z17 = true;
                            case 8:
                                this.f287673f |= 1;
                                this.f287674g = hVar.k();
                            case 16:
                                this.f287673f |= 2;
                                this.f287675h = hVar.k();
                            case 26:
                                if ((i17 & 4) != 4) {
                                    this.f287676i = new java.util.ArrayList();
                                    i17 |= 4;
                                }
                                this.f287676i.add(hVar.g(i16.s1.f287726t, lVar));
                            case 34:
                                if ((this.f287673f & 4) == 4) {
                                    i16.l1 l1Var = this.f287677m;
                                    l1Var.getClass();
                                    k1Var = i16.l1.m(l1Var);
                                }
                                i16.l1 l1Var2 = (i16.l1) hVar.g(i16.l1.A, lVar);
                                this.f287677m = l1Var2;
                                if (k1Var != null) {
                                    k1Var.b(l1Var2);
                                    this.f287677m = k1Var.d();
                                }
                                this.f287673f |= 4;
                            case 40:
                                this.f287673f |= 8;
                                this.f287678n = hVar.k();
                            case 50:
                                if ((this.f287673f & 16) == 16) {
                                    i16.l1 l1Var3 = this.f287679o;
                                    l1Var3.getClass();
                                    k1Var = i16.l1.m(l1Var3);
                                }
                                i16.l1 l1Var4 = (i16.l1) hVar.g(i16.l1.A, lVar);
                                this.f287679o = l1Var4;
                                if (k1Var != null) {
                                    k1Var.b(l1Var4);
                                    this.f287679o = k1Var.d();
                                }
                                this.f287673f |= 16;
                            case 56:
                                this.f287673f |= 32;
                                this.f287680p = hVar.k();
                            case 66:
                                if ((i17 & 128) != 128) {
                                    this.f287681q = new java.util.ArrayList();
                                    i17 |= 128;
                                }
                                this.f287681q.add(hVar.g(i16.k.f287554n, lVar));
                            case 248:
                                if ((i17 & 256) != 256) {
                                    this.f287682r = new java.util.ArrayList();
                                    i17 |= 256;
                                }
                                this.f287682r.add(java.lang.Integer.valueOf(hVar.k()));
                            case 250:
                                int d17 = hVar.d(hVar.k());
                                if ((i17 & 256) != 256 && hVar.b() > 0) {
                                    this.f287682r = new java.util.ArrayList();
                                    i17 |= 256;
                                }
                                while (hVar.b() > 0) {
                                    this.f287682r.add(java.lang.Integer.valueOf(hVar.k()));
                                }
                                hVar.c(d17);
                                break;
                            default:
                                r47 = j(hVar, j17, lVar, n17);
                                if (r47 == 0) {
                                    z17 = true;
                                }
                        }
                    } catch (java.lang.Throwable th6) {
                        if ((i17 & 4) == r47) {
                            this.f287676i = java.util.Collections.unmodifiableList(this.f287676i);
                        }
                        if ((i17 & 128) == 128) {
                            this.f287681q = java.util.Collections.unmodifiableList(this.f287681q);
                        }
                        if ((i17 & 256) == 256) {
                            this.f287682r = java.util.Collections.unmodifiableList(this.f287682r);
                        }
                        try {
                            j17.i();
                        } catch (java.io.IOException unused) {
                            this.f287672e = m17.c();
                            h();
                            throw th6;
                        } catch (java.lang.Throwable th7) {
                            this.f287672e = m17.c();
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
                if ((i17 & 4) == 4) {
                    this.f287676i = java.util.Collections.unmodifiableList(this.f287676i);
                }
                if ((i17 & 128) == 128) {
                    this.f287681q = java.util.Collections.unmodifiableList(this.f287681q);
                }
                if ((i17 & 256) == 256) {
                    this.f287682r = java.util.Collections.unmodifiableList(this.f287682r);
                }
                try {
                    j17.i();
                } catch (java.io.IOException unused2) {
                    this.f287672e = m17.c();
                    h();
                    return;
                } catch (java.lang.Throwable th8) {
                    this.f287672e = m17.c();
                    throw th8;
                }
            }
        }
    }
}
