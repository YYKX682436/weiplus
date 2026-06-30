package l16;

/* loaded from: classes16.dex */
public final class n extends p16.p implements p16.i0 {

    /* renamed from: e, reason: collision with root package name */
    public int f315058e;

    /* renamed from: g, reason: collision with root package name */
    public int f315060g;

    /* renamed from: f, reason: collision with root package name */
    public int f315059f = 1;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f315061h = "";

    /* renamed from: i, reason: collision with root package name */
    public l16.o f315062i = l16.o.NONE;

    /* renamed from: m, reason: collision with root package name */
    public java.util.List f315063m = java.util.Collections.emptyList();

    /* renamed from: n, reason: collision with root package name */
    public java.util.List f315064n = java.util.Collections.emptyList();

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // p16.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p16.g0 I3(p16.h r2, p16.l r3) {
        /*
            r1 = this;
            p16.j0 r0 = l16.p.f315071t     // Catch: java.lang.Throwable -> Le p16.z -> L10
            l16.m r0 = (l16.m) r0     // Catch: java.lang.Throwable -> Le p16.z -> L10
            java.lang.Object r2 = r0.a(r2, r3)     // Catch: java.lang.Throwable -> Le p16.z -> L10
            l16.p r2 = (l16.p) r2     // Catch: java.lang.Throwable -> Le p16.z -> L10
            r1.d(r2)
            return r1
        Le:
            r2 = move-exception
            goto L18
        L10:
            r2 = move-exception
            p16.h0 r3 = r2.f351371d     // Catch: java.lang.Throwable -> Le
            l16.p r3 = (l16.p) r3     // Catch: java.lang.Throwable -> Le
            throw r2     // Catch: java.lang.Throwable -> L16
        L16:
            r2 = move-exception
            goto L19
        L18:
            r3 = 0
        L19:
            if (r3 == 0) goto L1e
            r1.d(r3)
        L1e:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: l16.n.I3(p16.h, p16.l):p16.g0");
    }

    @Override // p16.p
    public /* bridge */ /* synthetic */ p16.p b(p16.v vVar) {
        d((l16.p) vVar);
        return this;
    }

    @Override // p16.g0
    public p16.h0 build() {
        l16.p c17 = c();
        if (c17.isInitialized()) {
            return c17;
        }
        throw new p16.x0(c17);
    }

    public l16.p c() {
        l16.p pVar = new l16.p(this, null);
        int i17 = this.f315058e;
        int i18 = (i17 & 1) != 1 ? 0 : 1;
        pVar.f315074f = this.f315059f;
        if ((i17 & 2) == 2) {
            i18 |= 2;
        }
        pVar.f315075g = this.f315060g;
        if ((i17 & 4) == 4) {
            i18 |= 4;
        }
        pVar.f315076h = this.f315061h;
        if ((i17 & 8) == 8) {
            i18 |= 8;
        }
        pVar.f315077i = this.f315062i;
        if ((i17 & 16) == 16) {
            this.f315063m = java.util.Collections.unmodifiableList(this.f315063m);
            this.f315058e &= -17;
        }
        pVar.f315078m = this.f315063m;
        if ((this.f315058e & 32) == 32) {
            this.f315064n = java.util.Collections.unmodifiableList(this.f315064n);
            this.f315058e &= -33;
        }
        pVar.f315080o = this.f315064n;
        pVar.f315073e = i18;
        return pVar;
    }

    public java.lang.Object clone() {
        l16.n nVar = new l16.n();
        nVar.d(c());
        return nVar;
    }

    public l16.n d(l16.p pVar) {
        if (pVar == l16.p.f315070s) {
            return this;
        }
        int i17 = pVar.f315073e;
        if ((i17 & 1) == 1) {
            int i18 = pVar.f315074f;
            this.f315058e |= 1;
            this.f315059f = i18;
        }
        if ((i17 & 2) == 2) {
            int i19 = pVar.f315075g;
            this.f315058e = 2 | this.f315058e;
            this.f315060g = i19;
        }
        if ((i17 & 4) == 4) {
            this.f315058e |= 4;
            this.f315061h = pVar.f315076h;
        }
        if ((i17 & 8) == 8) {
            l16.o oVar = pVar.f315077i;
            oVar.getClass();
            this.f315058e = 8 | this.f315058e;
            this.f315062i = oVar;
        }
        if (!pVar.f315078m.isEmpty()) {
            if (this.f315063m.isEmpty()) {
                this.f315063m = pVar.f315078m;
                this.f315058e &= -17;
            } else {
                if ((this.f315058e & 16) != 16) {
                    this.f315063m = new java.util.ArrayList(this.f315063m);
                    this.f315058e |= 16;
                }
                this.f315063m.addAll(pVar.f315078m);
            }
        }
        if (!pVar.f315080o.isEmpty()) {
            if (this.f315064n.isEmpty()) {
                this.f315064n = pVar.f315080o;
                this.f315058e &= -33;
            } else {
                if ((this.f315058e & 32) != 32) {
                    this.f315064n = new java.util.ArrayList(this.f315064n);
                    this.f315058e |= 32;
                }
                this.f315064n.addAll(pVar.f315080o);
            }
        }
        this.f351337d = this.f351337d.e(pVar.f315072d);
        return this;
    }
}
