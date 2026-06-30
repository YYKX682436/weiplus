package i16;

/* loaded from: classes16.dex */
public final class w extends p16.p implements p16.i0 {

    /* renamed from: e, reason: collision with root package name */
    public int f287791e;

    /* renamed from: f, reason: collision with root package name */
    public i16.x f287792f = i16.x.RETURNS_CONSTANT;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f287793g = java.util.Collections.emptyList();

    /* renamed from: h, reason: collision with root package name */
    public i16.g0 f287794h = i16.g0.f287451r;

    /* renamed from: i, reason: collision with root package name */
    public i16.y f287795i = i16.y.AT_MOST_ONCE;

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // p16.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p16.g0 I3(p16.h r2, p16.l r3) {
        /*
            r1 = this;
            p16.j0 r0 = i16.z.f287832p     // Catch: java.lang.Throwable -> Le p16.z -> L10
            i16.v r0 = (i16.v) r0     // Catch: java.lang.Throwable -> Le p16.z -> L10
            java.lang.Object r2 = r0.a(r2, r3)     // Catch: java.lang.Throwable -> Le p16.z -> L10
            i16.z r2 = (i16.z) r2     // Catch: java.lang.Throwable -> Le p16.z -> L10
            r1.d(r2)
            return r1
        Le:
            r2 = move-exception
            goto L18
        L10:
            r2 = move-exception
            p16.h0 r3 = r2.f351371d     // Catch: java.lang.Throwable -> Le
            i16.z r3 = (i16.z) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: i16.w.I3(p16.h, p16.l):p16.g0");
    }

    @Override // p16.p
    public /* bridge */ /* synthetic */ p16.p b(p16.v vVar) {
        d((i16.z) vVar);
        return this;
    }

    @Override // p16.g0
    public p16.h0 build() {
        i16.z c17 = c();
        if (c17.isInitialized()) {
            return c17;
        }
        throw new p16.x0(c17);
    }

    public i16.z c() {
        i16.z zVar = new i16.z(this, null);
        int i17 = this.f287791e;
        int i18 = (i17 & 1) != 1 ? 0 : 1;
        zVar.f287835f = this.f287792f;
        if ((i17 & 2) == 2) {
            this.f287793g = java.util.Collections.unmodifiableList(this.f287793g);
            this.f287791e &= -3;
        }
        zVar.f287836g = this.f287793g;
        if ((i17 & 4) == 4) {
            i18 |= 2;
        }
        zVar.f287837h = this.f287794h;
        if ((i17 & 8) == 8) {
            i18 |= 4;
        }
        zVar.f287838i = this.f287795i;
        zVar.f287834e = i18;
        return zVar;
    }

    public java.lang.Object clone() {
        i16.w wVar = new i16.w();
        wVar.d(c());
        return wVar;
    }

    public i16.w d(i16.z zVar) {
        i16.g0 g0Var;
        if (zVar == i16.z.f287831o) {
            return this;
        }
        if ((zVar.f287834e & 1) == 1) {
            i16.x xVar = zVar.f287835f;
            xVar.getClass();
            this.f287791e |= 1;
            this.f287792f = xVar;
        }
        if (!zVar.f287836g.isEmpty()) {
            if (this.f287793g.isEmpty()) {
                this.f287793g = zVar.f287836g;
                this.f287791e &= -3;
            } else {
                if ((this.f287791e & 2) != 2) {
                    this.f287793g = new java.util.ArrayList(this.f287793g);
                    this.f287791e |= 2;
                }
                this.f287793g.addAll(zVar.f287836g);
            }
        }
        if ((zVar.f287834e & 2) == 2) {
            i16.g0 g0Var2 = zVar.f287837h;
            if ((this.f287791e & 4) != 4 || (g0Var = this.f287794h) == i16.g0.f287451r) {
                this.f287794h = g0Var2;
            } else {
                i16.e0 e0Var = new i16.e0();
                e0Var.d(g0Var);
                e0Var.d(g0Var2);
                this.f287794h = e0Var.c();
            }
            this.f287791e |= 4;
        }
        if ((zVar.f287834e & 4) == 4) {
            i16.y yVar = zVar.f287838i;
            yVar.getClass();
            this.f287791e |= 8;
            this.f287795i = yVar;
        }
        this.f351337d = this.f351337d.e(zVar.f287833d);
        return this;
    }
}
