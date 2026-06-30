package f26;

/* loaded from: classes16.dex */
public class v2 {

    /* renamed from: b, reason: collision with root package name */
    public static final f26.v2 f259231b = e(f26.q2.f259212a);

    /* renamed from: a, reason: collision with root package name */
    public final f26.q2 f259232a;

    public v2(f26.q2 q2Var) {
        if (q2Var != null) {
            this.f259232a = q2Var;
        } else {
            a(7);
            throw null;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:53:0x0104. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:54:0x0107. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:55:0x010a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0116 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x003b A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0021 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(int r13) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f26.v2.a(int):void");
    }

    public static f26.d3 b(f26.d3 d3Var, f26.d3 d3Var2) {
        if (d3Var == null) {
            a(38);
            throw null;
        }
        if (d3Var2 == null) {
            a(39);
            throw null;
        }
        f26.d3 d3Var3 = f26.d3.f259143f;
        if (d3Var == d3Var3) {
            if (d3Var2 != null) {
                return d3Var2;
            }
            a(40);
            throw null;
        }
        if (d3Var2 == d3Var3) {
            if (d3Var != null) {
                return d3Var;
            }
            a(41);
            throw null;
        }
        if (d3Var == d3Var2) {
            if (d3Var2 != null) {
                return d3Var2;
            }
            a(42);
            throw null;
        }
        throw new java.lang.AssertionError("Variance conflict: type parameter variance '" + d3Var + "' and projection kind '" + d3Var2 + "' cannot be combined");
    }

    public static f26.u2 c(f26.d3 d3Var, f26.d3 d3Var2) {
        f26.d3 d3Var3 = f26.d3.f259144g;
        return (d3Var == d3Var3 && d3Var2 == f26.d3.f259145h) ? f26.u2.OUT_IN_IN_POSITION : (d3Var == f26.d3.f259145h && d3Var2 == d3Var3) ? f26.u2.IN_IN_OUT_POSITION : f26.u2.NO_CONFLICT;
    }

    public static f26.v2 d(f26.o0 o0Var) {
        if (o0Var == null) {
            a(6);
            throw null;
        }
        return e(f26.f2.f259161b.b(o0Var.w0(), o0Var.u0()));
    }

    public static f26.v2 e(f26.q2 q2Var) {
        if (q2Var != null) {
            return new f26.v2(q2Var);
        }
        a(0);
        throw null;
    }

    public static f26.v2 f(f26.q2 first, f26.q2 second) {
        if (first == null) {
            a(3);
            throw null;
        }
        if (second == null) {
            a(4);
            throw null;
        }
        kotlin.jvm.internal.o.g(first, "first");
        kotlin.jvm.internal.o.g(second, "second");
        if (first.e()) {
            first = second;
        } else if (!second.e()) {
            first = new f26.a0(first, second, null);
        }
        return e(first);
    }

    public static java.lang.String j(java.lang.Object obj) {
        try {
            return obj.toString();
        } catch (java.lang.Throwable th6) {
            if (o26.i.a(th6)) {
                throw th6;
            }
            return "[Exception while computing toString(): " + th6 + "]";
        }
    }

    public f26.q2 g() {
        f26.q2 q2Var = this.f259232a;
        if (q2Var != null) {
            return q2Var;
        }
        a(8);
        throw null;
    }

    public boolean h() {
        return this.f259232a.e();
    }

    public f26.o0 i(f26.o0 o0Var, f26.d3 d3Var) {
        if (o0Var == null) {
            a(9);
            throw null;
        }
        if (d3Var == null) {
            a(10);
            throw null;
        }
        if (h()) {
            if (o0Var != null) {
                return o0Var;
            }
            a(11);
            throw null;
        }
        try {
            f26.o0 type = l(new f26.n2(d3Var, o0Var), null, 0).getType();
            if (type != null) {
                return type;
            }
            a(12);
            throw null;
        } catch (f26.t2 e17) {
            return h26.m.c(h26.l.f278362q, e17.getMessage());
        }
    }

    public f26.o0 k(f26.o0 o0Var, f26.d3 d3Var) {
        f26.n2 n2Var;
        if (o0Var == null) {
            a(14);
            throw null;
        }
        if (d3Var == null) {
            a(15);
            throw null;
        }
        f26.l2 n2Var2 = new f26.n2(d3Var, g().f(o0Var, d3Var));
        if (!h()) {
            try {
                n2Var2 = l(n2Var2, null, 0);
            } catch (f26.t2 unused) {
                n2Var2 = null;
            }
        }
        f26.q2 q2Var = this.f259232a;
        if (q2Var.a() || q2Var.b()) {
            boolean b17 = q2Var.b();
            if (n2Var2 != null) {
                if (!n2Var2.b()) {
                    f26.o0 type = n2Var2.getType();
                    kotlin.jvm.internal.o.f(type, "getType(...)");
                    if (f26.z2.c(type, k26.b.f303769d)) {
                        f26.d3 c17 = n2Var2.c();
                        kotlin.jvm.internal.o.f(c17, "getProjectionKind(...)");
                        if (c17 == f26.d3.f259145h) {
                            n2Var = new f26.n2(c17, (f26.o0) k26.d.a(type).f303768b);
                        } else if (b17) {
                            n2Var = new f26.n2(c17, (f26.o0) k26.d.a(type).f303767a);
                        } else {
                            f26.v2 e17 = e(new k26.c());
                            if (!e17.h()) {
                                try {
                                    n2Var2 = e17.l(n2Var2, null, 0);
                                } catch (f26.t2 unused2) {
                                }
                            }
                        }
                        n2Var2 = n2Var;
                    }
                }
            }
            n2Var2 = null;
        }
        if (n2Var2 == null) {
            return null;
        }
        return n2Var2.getType();
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x028f, code lost:
    
        if (r1 != 2) goto L139;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final f26.l2 l(f26.l2 r17, o06.e2 r18, int r19) {
        /*
            Method dump skipped, instructions count: 797
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f26.v2.l(f26.l2, o06.e2, int):f26.l2");
    }
}
