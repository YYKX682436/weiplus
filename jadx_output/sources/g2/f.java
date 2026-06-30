package g2;

/* loaded from: classes14.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final g2.w f267696a;

    /* renamed from: b, reason: collision with root package name */
    public int f267697b;

    /* renamed from: c, reason: collision with root package name */
    public int f267698c;

    /* renamed from: d, reason: collision with root package name */
    public int f267699d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f267700e = -1;

    public f(a2.d dVar, long j17, kotlin.jvm.internal.i iVar) {
        this.f267696a = new g2.w(dVar.f681d);
        this.f267697b = a2.m1.f(j17);
        this.f267698c = a2.m1.e(j17);
        int f17 = a2.m1.f(j17);
        int e17 = a2.m1.e(j17);
        if (f17 < 0 || f17 > dVar.length()) {
            throw new java.lang.IndexOutOfBoundsException("start (" + f17 + ") offset is outside of text region " + dVar.length());
        }
        if (e17 < 0 || e17 > dVar.length()) {
            throw new java.lang.IndexOutOfBoundsException("end (" + e17 + ") offset is outside of text region " + dVar.length());
        }
        if (f17 <= e17) {
            return;
        }
        throw new java.lang.IllegalArgumentException("Do not set reversed range: " + f17 + " > " + e17);
    }

    public final void a(int i17, int i18) {
        long a17 = a2.n1.a(i17, i18);
        this.f267696a.b(i17, i18, "");
        long a18 = g2.g.a(a2.n1.a(this.f267697b, this.f267698c), a17);
        this.f267697b = a2.m1.f(a18);
        this.f267698c = a2.m1.e(a18);
        int i19 = this.f267699d;
        if (i19 != -1) {
            long a19 = g2.g.a(a2.n1.a(i19, this.f267700e), a17);
            if (a2.m1.b(a19)) {
                this.f267699d = -1;
                this.f267700e = -1;
            } else {
                this.f267699d = a2.m1.f(a19);
                this.f267700e = a2.m1.e(a19);
            }
        }
    }

    public final char b(int i17) {
        int i18;
        g2.w wVar = this.f267696a;
        g2.i iVar = wVar.f267751b;
        if (iVar != null && i17 >= (i18 = wVar.f267752c)) {
            int i19 = iVar.f267708a;
            int i27 = iVar.f267711d;
            int i28 = iVar.f267710c;
            int i29 = i19 - (i27 - i28);
            if (i17 >= i29 + i18) {
                return wVar.f267750a.charAt(i17 - ((i29 - wVar.f267753d) + i18));
            }
            int i37 = i17 - i18;
            return i37 < i28 ? iVar.f267709b[i37] : iVar.f267709b[(i37 - i28) + i27];
        }
        return wVar.f267750a.charAt(i17);
    }

    public final int c() {
        return this.f267696a.a();
    }

    public final void d(int i17, int i18, java.lang.String text) {
        kotlin.jvm.internal.o.g(text, "text");
        g2.w wVar = this.f267696a;
        if (i17 < 0 || i17 > wVar.a()) {
            throw new java.lang.IndexOutOfBoundsException("start (" + i17 + ") offset is outside of text region " + wVar.a());
        }
        if (i18 < 0 || i18 > wVar.a()) {
            throw new java.lang.IndexOutOfBoundsException("end (" + i18 + ") offset is outside of text region " + wVar.a());
        }
        if (i17 > i18) {
            throw new java.lang.IllegalArgumentException("Do not set reversed range: " + i17 + " > " + i18);
        }
        wVar.b(i17, i18, text);
        this.f267697b = text.length() + i17;
        this.f267698c = i17 + text.length();
        this.f267699d = -1;
        this.f267700e = -1;
    }

    public final void e(int i17, int i18) {
        g2.w wVar = this.f267696a;
        if (i17 < 0 || i17 > wVar.a()) {
            throw new java.lang.IndexOutOfBoundsException("start (" + i17 + ") offset is outside of text region " + wVar.a());
        }
        if (i18 < 0 || i18 > wVar.a()) {
            throw new java.lang.IndexOutOfBoundsException("end (" + i18 + ") offset is outside of text region " + wVar.a());
        }
        if (i17 < i18) {
            this.f267699d = i17;
            this.f267700e = i18;
        } else {
            throw new java.lang.IllegalArgumentException("Do not set reversed or empty range: " + i17 + " > " + i18);
        }
    }

    public final void f(int i17, int i18) {
        g2.w wVar = this.f267696a;
        if (i17 < 0 || i17 > wVar.a()) {
            throw new java.lang.IndexOutOfBoundsException("start (" + i17 + ") offset is outside of text region " + wVar.a());
        }
        if (i18 < 0 || i18 > wVar.a()) {
            throw new java.lang.IndexOutOfBoundsException("end (" + i18 + ") offset is outside of text region " + wVar.a());
        }
        if (i17 <= i18) {
            this.f267697b = i17;
            this.f267698c = i18;
        } else {
            throw new java.lang.IllegalArgumentException("Do not set reversed range: " + i17 + " > " + i18);
        }
    }

    public java.lang.String toString() {
        return this.f267696a.toString();
    }
}
