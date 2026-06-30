package i16;

/* loaded from: classes16.dex */
public final class q extends p16.q {

    /* renamed from: g, reason: collision with root package name */
    public int f287685g;

    /* renamed from: h, reason: collision with root package name */
    public int f287686h = 6;

    /* renamed from: i, reason: collision with root package name */
    public java.util.List f287687i = java.util.Collections.emptyList();

    /* renamed from: m, reason: collision with root package name */
    public java.util.List f287688m = java.util.Collections.emptyList();

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // p16.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p16.g0 I3(p16.h r2, p16.l r3) {
        /*
            r1 = this;
            p16.j0 r0 = i16.r.f287702p     // Catch: java.lang.Throwable -> Le p16.z -> L10
            i16.p r0 = (i16.p) r0     // Catch: java.lang.Throwable -> Le p16.z -> L10
            java.lang.Object r2 = r0.a(r2, r3)     // Catch: java.lang.Throwable -> Le p16.z -> L10
            i16.r r2 = (i16.r) r2     // Catch: java.lang.Throwable -> Le p16.z -> L10
            r1.e(r2)
            return r1
        Le:
            r2 = move-exception
            goto L18
        L10:
            r2 = move-exception
            p16.h0 r3 = r2.f351371d     // Catch: java.lang.Throwable -> Le
            i16.r r3 = (i16.r) r3     // Catch: java.lang.Throwable -> Le
            throw r2     // Catch: java.lang.Throwable -> L16
        L16:
            r2 = move-exception
            goto L19
        L18:
            r3 = 0
        L19:
            if (r3 == 0) goto L1e
            r1.e(r3)
        L1e:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: i16.q.I3(p16.h, p16.l):p16.g0");
    }

    @Override // p16.p
    public /* bridge */ /* synthetic */ p16.p b(p16.v vVar) {
        e((i16.r) vVar);
        return this;
    }

    @Override // p16.g0
    public p16.h0 build() {
        i16.r d17 = d();
        if (d17.isInitialized()) {
            return d17;
        }
        throw new p16.x0(d17);
    }

    public java.lang.Object clone() {
        i16.q qVar = new i16.q();
        qVar.e(d());
        return qVar;
    }

    public i16.r d() {
        i16.r rVar = new i16.r(this, null);
        int i17 = this.f287685g;
        int i18 = (i17 & 1) != 1 ? 0 : 1;
        rVar.f287705g = this.f287686h;
        if ((i17 & 2) == 2) {
            this.f287687i = java.util.Collections.unmodifiableList(this.f287687i);
            this.f287685g &= -3;
        }
        rVar.f287706h = this.f287687i;
        if ((this.f287685g & 4) == 4) {
            this.f287688m = java.util.Collections.unmodifiableList(this.f287688m);
            this.f287685g &= -5;
        }
        rVar.f287707i = this.f287688m;
        rVar.f287704f = i18;
        return rVar;
    }

    public i16.q e(i16.r rVar) {
        if (rVar == i16.r.f287701o) {
            return this;
        }
        if ((rVar.f287704f & 1) == 1) {
            int i17 = rVar.f287705g;
            this.f287685g = 1 | this.f287685g;
            this.f287686h = i17;
        }
        if (!rVar.f287706h.isEmpty()) {
            if (this.f287687i.isEmpty()) {
                this.f287687i = rVar.f287706h;
                this.f287685g &= -3;
            } else {
                if ((this.f287685g & 2) != 2) {
                    this.f287687i = new java.util.ArrayList(this.f287687i);
                    this.f287685g |= 2;
                }
                this.f287687i.addAll(rVar.f287706h);
            }
        }
        if (!rVar.f287707i.isEmpty()) {
            if (this.f287688m.isEmpty()) {
                this.f287688m = rVar.f287707i;
                this.f287685g &= -5;
            } else {
                if ((this.f287685g & 4) != 4) {
                    this.f287688m = new java.util.ArrayList(this.f287688m);
                    this.f287685g |= 4;
                }
                this.f287688m.addAll(rVar.f287707i);
            }
        }
        c(rVar);
        this.f351337d = this.f351337d.e(rVar.f287703e);
        return this;
    }
}
