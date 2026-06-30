package l16;

/* loaded from: classes16.dex */
public final class l extends p16.p implements p16.i0 {

    /* renamed from: e, reason: collision with root package name */
    public int f315055e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f315056f = java.util.Collections.emptyList();

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f315057g = java.util.Collections.emptyList();

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // p16.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p16.g0 I3(p16.h r2, p16.l r3) {
        /*
            r1 = this;
            p16.j0 r0 = l16.q.f315085n     // Catch: java.lang.Throwable -> Le p16.z -> L10
            l16.k r0 = (l16.k) r0     // Catch: java.lang.Throwable -> Le p16.z -> L10
            java.lang.Object r2 = r0.a(r2, r3)     // Catch: java.lang.Throwable -> Le p16.z -> L10
            l16.q r2 = (l16.q) r2     // Catch: java.lang.Throwable -> Le p16.z -> L10
            r1.d(r2)
            return r1
        Le:
            r2 = move-exception
            goto L18
        L10:
            r2 = move-exception
            p16.h0 r3 = r2.f351371d     // Catch: java.lang.Throwable -> Le
            l16.q r3 = (l16.q) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: l16.l.I3(p16.h, p16.l):p16.g0");
    }

    @Override // p16.p
    public /* bridge */ /* synthetic */ p16.p b(p16.v vVar) {
        d((l16.q) vVar);
        return this;
    }

    @Override // p16.g0
    public p16.h0 build() {
        l16.q c17 = c();
        if (c17.isInitialized()) {
            return c17;
        }
        throw new p16.x0(c17);
    }

    public l16.q c() {
        l16.q qVar = new l16.q(this, null);
        if ((this.f315055e & 1) == 1) {
            this.f315056f = java.util.Collections.unmodifiableList(this.f315056f);
            this.f315055e &= -2;
        }
        qVar.f315087e = this.f315056f;
        if ((this.f315055e & 2) == 2) {
            this.f315057g = java.util.Collections.unmodifiableList(this.f315057g);
            this.f315055e &= -3;
        }
        qVar.f315088f = this.f315057g;
        return qVar;
    }

    public java.lang.Object clone() {
        l16.l lVar = new l16.l();
        lVar.d(c());
        return lVar;
    }

    public l16.l d(l16.q qVar) {
        if (qVar == l16.q.f315084m) {
            return this;
        }
        if (!qVar.f315087e.isEmpty()) {
            if (this.f315056f.isEmpty()) {
                this.f315056f = qVar.f315087e;
                this.f315055e &= -2;
            } else {
                if ((this.f315055e & 1) != 1) {
                    this.f315056f = new java.util.ArrayList(this.f315056f);
                    this.f315055e |= 1;
                }
                this.f315056f.addAll(qVar.f315087e);
            }
        }
        if (!qVar.f315088f.isEmpty()) {
            if (this.f315057g.isEmpty()) {
                this.f315057g = qVar.f315088f;
                this.f315055e &= -3;
            } else {
                if ((this.f315055e & 2) != 2) {
                    this.f315057g = new java.util.ArrayList(this.f315057g);
                    this.f315055e |= 2;
                }
                this.f315057g.addAll(qVar.f315088f);
            }
        }
        this.f351337d = this.f351337d.e(qVar.f315086d);
        return this;
    }
}
