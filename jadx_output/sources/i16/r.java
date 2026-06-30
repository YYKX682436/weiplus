package i16;

/* loaded from: classes16.dex */
public final class r extends p16.s {

    /* renamed from: o, reason: collision with root package name */
    public static final i16.r f287701o;

    /* renamed from: p, reason: collision with root package name */
    public static final p16.j0 f287702p = new i16.p();

    /* renamed from: e, reason: collision with root package name */
    public final p16.g f287703e;

    /* renamed from: f, reason: collision with root package name */
    public int f287704f;

    /* renamed from: g, reason: collision with root package name */
    public int f287705g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f287706h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.List f287707i;

    /* renamed from: m, reason: collision with root package name */
    public byte f287708m;

    /* renamed from: n, reason: collision with root package name */
    public int f287709n;

    static {
        i16.r rVar = new i16.r(true);
        f287701o = rVar;
        rVar.f287705g = 6;
        rVar.f287706h = java.util.Collections.emptyList();
        rVar.f287707i = java.util.Collections.emptyList();
    }

    public r(p16.q qVar, i16.a aVar) {
        super(qVar);
        this.f287708m = (byte) -1;
        this.f287709n = -1;
        this.f287703e = qVar.f351337d;
    }

    @Override // p16.h0
    public void a(p16.j jVar) {
        getSerializedSize();
        p16.r i17 = i();
        if ((this.f287704f & 1) == 1) {
            jVar.m(1, this.f287705g);
        }
        for (int i18 = 0; i18 < this.f287706h.size(); i18++) {
            jVar.o(2, (p16.h0) this.f287706h.get(i18));
        }
        for (int i19 = 0; i19 < this.f287707i.size(); i19++) {
            jVar.m(31, ((java.lang.Integer) this.f287707i.get(i19)).intValue());
        }
        i17.a(19000, jVar);
        jVar.r(this.f287703e);
    }

    @Override // p16.i0
    public p16.h0 getDefaultInstanceForType() {
        return f287701o;
    }

    @Override // p16.h0
    public int getSerializedSize() {
        int i17 = this.f287709n;
        if (i17 != -1) {
            return i17;
        }
        int b17 = (this.f287704f & 1) == 1 ? p16.j.b(1, this.f287705g) + 0 : 0;
        for (int i18 = 0; i18 < this.f287706h.size(); i18++) {
            b17 += p16.j.d(2, (p16.h0) this.f287706h.get(i18));
        }
        int i19 = 0;
        for (int i27 = 0; i27 < this.f287707i.size(); i27++) {
            i19 += p16.j.c(((java.lang.Integer) this.f287707i.get(i27)).intValue());
        }
        int size = b17 + i19 + (this.f287707i.size() * 2) + e() + this.f287703e.size();
        this.f287709n = size;
        return size;
    }

    @Override // p16.i0
    public final boolean isInitialized() {
        byte b17 = this.f287708m;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        for (int i17 = 0; i17 < this.f287706h.size(); i17++) {
            if (!((i16.y1) this.f287706h.get(i17)).isInitialized()) {
                this.f287708m = (byte) 0;
                return false;
            }
        }
        if (d()) {
            this.f287708m = (byte) 1;
            return true;
        }
        this.f287708m = (byte) 0;
        return false;
    }

    @Override // p16.h0
    public p16.g0 newBuilderForType() {
        return new i16.q();
    }

    @Override // p16.h0
    public p16.g0 toBuilder() {
        i16.q qVar = new i16.q();
        qVar.e(this);
        return qVar;
    }

    public r(boolean z17) {
        this.f287708m = (byte) -1;
        this.f287709n = -1;
        this.f287703e = p16.g.f351283d;
    }

    public r(p16.h hVar, p16.l lVar, i16.a aVar) {
        this.f287708m = (byte) -1;
        this.f287709n = -1;
        this.f287705g = 6;
        this.f287706h = java.util.Collections.emptyList();
        this.f287707i = java.util.Collections.emptyList();
        p16.f m17 = p16.g.m();
        p16.j j17 = p16.j.j(m17, 1);
        boolean z17 = false;
        int i17 = 0;
        while (!z17) {
            try {
                try {
                    int n17 = hVar.n();
                    if (n17 != 0) {
                        if (n17 == 8) {
                            this.f287704f |= 1;
                            this.f287705g = hVar.k();
                        } else if (n17 == 18) {
                            if ((i17 & 2) != 2) {
                                this.f287706h = new java.util.ArrayList();
                                i17 |= 2;
                            }
                            this.f287706h.add(hVar.g(i16.y1.f287820s, lVar));
                        } else if (n17 == 248) {
                            if ((i17 & 4) != 4) {
                                this.f287707i = new java.util.ArrayList();
                                i17 |= 4;
                            }
                            this.f287707i.add(java.lang.Integer.valueOf(hVar.k()));
                        } else if (n17 != 250) {
                            if (!j(hVar, j17, lVar, n17)) {
                            }
                        } else {
                            int d17 = hVar.d(hVar.k());
                            if ((i17 & 4) != 4 && hVar.b() > 0) {
                                this.f287707i = new java.util.ArrayList();
                                i17 |= 4;
                            }
                            while (hVar.b() > 0) {
                                this.f287707i.add(java.lang.Integer.valueOf(hVar.k()));
                            }
                            hVar.c(d17);
                        }
                    }
                    z17 = true;
                } catch (java.lang.Throwable th6) {
                    if ((i17 & 2) == 2) {
                        this.f287706h = java.util.Collections.unmodifiableList(this.f287706h);
                    }
                    if ((i17 & 4) == 4) {
                        this.f287707i = java.util.Collections.unmodifiableList(this.f287707i);
                    }
                    try {
                        j17.i();
                    } catch (java.io.IOException unused) {
                        this.f287703e = m17.c();
                        h();
                        throw th6;
                    } catch (java.lang.Throwable th7) {
                        this.f287703e = m17.c();
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
        }
        if ((i17 & 2) == 2) {
            this.f287706h = java.util.Collections.unmodifiableList(this.f287706h);
        }
        if ((i17 & 4) == 4) {
            this.f287707i = java.util.Collections.unmodifiableList(this.f287707i);
        }
        try {
            j17.i();
        } catch (java.io.IOException unused2) {
            this.f287703e = m17.c();
            h();
        } catch (java.lang.Throwable th8) {
            this.f287703e = m17.c();
            throw th8;
        }
    }
}
