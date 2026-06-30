package g2;

/* loaded from: classes14.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final a2.d f267693a;

    /* renamed from: b, reason: collision with root package name */
    public final long f267694b;

    /* renamed from: c, reason: collision with root package name */
    public final a2.m1 f267695c;

    static {
        w0.b0.a(g2.c0.f267689d, g2.d0.f267690d);
    }

    public e0(a2.d dVar, long j17, a2.m1 m1Var, kotlin.jvm.internal.i iVar) {
        a2.m1 m1Var2;
        this.f267693a = dVar;
        this.f267694b = a2.n1.b(j17, 0, dVar.f681d.length());
        if (m1Var != null) {
            m1Var2 = new a2.m1(a2.n1.b(m1Var.f783a, 0, dVar.f681d.length()));
        } else {
            m1Var2 = null;
        }
        this.f267695c = m1Var2;
    }

    public static g2.e0 a(g2.e0 e0Var, a2.d dVar, long j17, a2.m1 m1Var, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            dVar = e0Var.f267693a;
        }
        a2.d annotatedString = dVar;
        if ((i17 & 2) != 0) {
            j17 = e0Var.f267694b;
        }
        long j18 = j17;
        if ((i17 & 4) != 0) {
            m1Var = e0Var.f267695c;
        }
        e0Var.getClass();
        kotlin.jvm.internal.o.g(annotatedString, "annotatedString");
        return new g2.e0(annotatedString, j18, m1Var, null);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g2.e0)) {
            return false;
        }
        g2.e0 e0Var = (g2.e0) obj;
        return a2.m1.a(this.f267694b, e0Var.f267694b) && kotlin.jvm.internal.o.b(this.f267695c, e0Var.f267695c) && kotlin.jvm.internal.o.b(this.f267693a, e0Var.f267693a);
    }

    public int hashCode() {
        int hashCode = this.f267693a.hashCode() * 31;
        int i17 = a2.m1.f782c;
        int hashCode2 = (hashCode + java.lang.Long.hashCode(this.f267694b)) * 31;
        a2.m1 m1Var = this.f267695c;
        return hashCode2 + (m1Var != null ? java.lang.Long.hashCode(m1Var.f783a) : 0);
    }

    public java.lang.String toString() {
        return "TextFieldValue(text='" + ((java.lang.Object) this.f267693a) + "', selection=" + ((java.lang.Object) a2.m1.h(this.f267694b)) + ", composition=" + this.f267695c + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e0(a2.d r7, long r8, a2.m1 r10, int r11, kotlin.jvm.internal.i r12) {
        /*
            r6 = this;
            r12 = r11 & 2
            if (r12 == 0) goto L8
            int r8 = a2.m1.f782c
            long r8 = a2.m1.f781b
        L8:
            r2 = r8
            r8 = r11 & 4
            if (r8 == 0) goto Le
            r10 = 0
        Le:
            r4 = r10
            r5 = 0
            r0 = r6
            r1 = r7
            r0.<init>(r1, r2, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.e0.<init>(a2.d, long, a2.m1, int, kotlin.jvm.internal.i):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e0(java.lang.String r9, long r10, a2.m1 r12, int r13, kotlin.jvm.internal.i r14) {
        /*
            r8 = this;
            r14 = r13 & 1
            if (r14 == 0) goto L6
            java.lang.String r9 = ""
        L6:
            r1 = r9
            r9 = r13 & 2
            if (r9 == 0) goto Lf
            int r9 = a2.m1.f782c
            long r10 = a2.m1.f781b
        Lf:
            r9 = r13 & 4
            if (r9 == 0) goto L14
            r12 = 0
        L14:
            r6 = r12
            a2.d r9 = new a2.d
            r2 = 0
            r3 = 0
            r4 = 6
            r7 = 0
            r5 = 0
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r2 = r8
            r3 = r9
            r4 = r10
            r2.<init>(r3, r4, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.e0.<init>(java.lang.String, long, a2.m1, int, kotlin.jvm.internal.i):void");
    }
}
