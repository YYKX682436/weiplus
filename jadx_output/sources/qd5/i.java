package qd5;

/* loaded from: classes9.dex */
public final class i extends ze5.la {

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.Class f361910n;

    /* renamed from: o, reason: collision with root package name */
    public final we5.s0 f361911o;

    /* renamed from: p, reason: collision with root package name */
    public final qd5.j f361912p;

    public /* synthetic */ i(we5.a aVar, java.lang.Class cls, we5.s0 s0Var, qd5.j jVar, int i17, kotlin.jvm.internal.i iVar) {
        this(aVar, cls, (i17 & 4) != 0 ? null : s0Var, (i17 & 8) != 0 ? new qd5.j() : jVar);
    }

    @Override // ze5.la, rd5.d, xm3.a
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // rd5.d, xm3.a, in5.c
    public int h() {
        java.lang.Class cls = this.f361910n;
        return cls != null ? cls.hashCode() : super.h();
    }

    @Override // rd5.d, xm3.a
    /* renamed from: k */
    public xm3.d y0() {
        return super.y0();
    }

    @Override // rd5.d
    /* renamed from: n */
    public rd5.d y0() {
        return super.y0();
    }

    @Override // ze5.la, rd5.d
    public we5.b o() {
        java.lang.Class cls = this.f361910n;
        if (cls != null) {
            return (we5.b) cls.newInstance();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    @Override // rd5.d, xm3.d
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean X(rd5.d r8) {
        /*
            r7 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.o.g(r8, r0)
            boolean r0 = r8 instanceof qd5.i
            r1 = 0
            if (r0 != 0) goto Lb
            return r1
        Lb:
            qd5.j r0 = r7.f361912p
            if (r0 == 0) goto L52
            qd5.i r8 = (qd5.i) r8
            r0 = 1
            we5.s0 r2 = r7.f361911o
            if (r2 == 0) goto L4e
            java.util.List r2 = r2.f445387a
            if (r2 != 0) goto L1b
            goto L4e
        L1b:
            we5.s0 r8 = r8.f361911o
            if (r8 == 0) goto L4e
            java.util.List r8 = r8.f445387a
            if (r8 != 0) goto L24
            goto L4e
        L24:
            int r3 = r2.size()
            int r4 = r8.size()
            if (r3 == r4) goto L2f
            goto L4e
        L2f:
            int r3 = r2.size()
            r4 = r1
        L34:
            if (r4 >= r3) goto L4c
            java.lang.Object r5 = r2.get(r4)
            rd5.d r5 = (rd5.d) r5
            java.lang.Object r6 = r8.get(r4)
            rd5.d r6 = (rd5.d) r6
            boolean r5 = r5.X(r6)
            if (r5 != 0) goto L49
            goto L4e
        L49:
            int r4 = r4 + 1
            goto L34
        L4c:
            r8 = r0
            goto L4f
        L4e:
            r8 = r1
        L4f:
            if (r8 != r0) goto L52
            r1 = r0
        L52:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: qd5.i.X(rd5.d):boolean");
    }

    @Override // rd5.d, xm3.d
    public java.lang.String v() {
        return super.v().concat("_fold");
    }

    @Override // rd5.d, xm3.a, xm3.d
    public java.lang.Object y0() {
        return super.y0();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(we5.a params, java.lang.Class cls, we5.s0 s0Var, qd5.j jVar) {
        super(params, cls);
        kotlin.jvm.internal.o.g(params, "params");
        this.f361910n = cls;
        this.f361911o = s0Var;
        this.f361912p = jVar;
    }
}
