package o06;

/* loaded from: classes16.dex */
public abstract class f0 {

    /* renamed from: a, reason: collision with root package name */
    public static final o06.g0 f341941a;

    /* renamed from: b, reason: collision with root package name */
    public static final o06.g0 f341942b;

    /* renamed from: c, reason: collision with root package name */
    public static final o06.g0 f341943c;

    /* renamed from: d, reason: collision with root package name */
    public static final o06.g0 f341944d;

    /* renamed from: e, reason: collision with root package name */
    public static final o06.g0 f341945e;

    /* renamed from: f, reason: collision with root package name */
    public static final o06.g0 f341946f;

    /* renamed from: g, reason: collision with root package name */
    public static final o06.g0 f341947g;

    /* renamed from: h, reason: collision with root package name */
    public static final o06.g0 f341948h;

    /* renamed from: i, reason: collision with root package name */
    public static final o06.g0 f341949i;

    /* renamed from: j, reason: collision with root package name */
    public static final o06.g0 f341950j;

    /* renamed from: k, reason: collision with root package name */
    public static final z16.g f341951k;

    /* renamed from: l, reason: collision with root package name */
    public static final z16.g f341952l;

    /* renamed from: m, reason: collision with root package name */
    public static final z16.g f341953m;

    /* renamed from: n, reason: collision with root package name */
    public static final l26.y f341954n;

    /* renamed from: o, reason: collision with root package name */
    public static final java.util.Map f341955o;

    static {
        o06.w wVar = new o06.w(o06.s2.f341983c);
        f341941a = wVar;
        o06.x xVar = new o06.x(o06.t2.f341991c);
        f341942b = xVar;
        o06.y yVar = new o06.y(o06.u2.f341999c);
        f341943c = yVar;
        o06.z zVar = new o06.z(o06.p2.f341978c);
        f341944d = zVar;
        o06.a0 a0Var = new o06.a0(o06.v2.f342000c);
        f341945e = a0Var;
        o06.b0 b0Var = new o06.b0(o06.r2.f341982c);
        f341946f = b0Var;
        o06.c0 c0Var = new o06.c0(o06.o2.f341977c);
        f341947g = c0Var;
        o06.d0 d0Var = new o06.d0(o06.q2.f341980c);
        f341948h = d0Var;
        o06.e0 e0Var = new o06.e0(o06.w2.f342003c);
        f341949i = e0Var;
        java.util.Collections.unmodifiableSet(kz5.z.D0(new o06.g0[]{wVar, xVar, zVar, b0Var}));
        java.util.HashMap hashMap = new java.util.HashMap(6);
        hashMap.put(xVar, 0);
        hashMap.put(wVar, 0);
        hashMap.put(zVar, 1);
        hashMap.put(yVar, 1);
        hashMap.put(a0Var, 2);
        java.util.Collections.unmodifiableMap(hashMap);
        f341950j = a0Var;
        f341951k = new o06.t();
        f341952l = new o06.u();
        f341953m = new o06.v();
        java.util.Iterator it = java.util.ServiceLoader.load(l26.y.class, l26.y.class.getClassLoader()).iterator();
        f341954n = it.hasNext() ? (l26.y) it.next() : l26.x.f315281a;
        f341955o = new java.util.HashMap();
        f(wVar);
        f(xVar);
        f(yVar);
        f(zVar);
        f(a0Var);
        f(b0Var);
        f(c0Var);
        f(d0Var);
        f(e0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(int r8) {
        /*
            r0 = 16
            if (r8 == r0) goto L7
            java.lang.String r1 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto L9
        L7:
            java.lang.String r1 = "@NotNull method %s.%s must not return null"
        L9:
            r2 = 3
            r3 = 2
            if (r8 == r0) goto Lf
            r4 = r2
            goto L10
        Lf:
            r4 = r3
        L10:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities"
            r6 = 1
            r7 = 0
            if (r8 == r6) goto L3a
            if (r8 == r2) goto L3a
            r2 = 5
            if (r8 == r2) goto L3a
            r2 = 7
            if (r8 == r2) goto L3a
            switch(r8) {
                case 9: goto L3a;
                case 10: goto L35;
                case 11: goto L30;
                case 12: goto L35;
                case 13: goto L30;
                case 14: goto L2b;
                case 15: goto L2b;
                case 16: goto L28;
                default: goto L23;
            }
        L23:
            java.lang.String r2 = "what"
            r4[r7] = r2
            goto L3e
        L28:
            r4[r7] = r5
            goto L3e
        L2b:
            java.lang.String r2 = "visibility"
            r4[r7] = r2
            goto L3e
        L30:
            java.lang.String r2 = "second"
            r4[r7] = r2
            goto L3e
        L35:
            java.lang.String r2 = "first"
            r4[r7] = r2
            goto L3e
        L3a:
            java.lang.String r2 = "from"
            r4[r7] = r2
        L3e:
            java.lang.String r2 = "toDescriptorVisibility"
            if (r8 == r0) goto L45
            r4[r6] = r5
            goto L47
        L45:
            r4[r6] = r2
        L47:
            switch(r8) {
                case 2: goto L70;
                case 3: goto L70;
                case 4: goto L6b;
                case 5: goto L6b;
                case 6: goto L66;
                case 7: goto L66;
                case 8: goto L61;
                case 9: goto L61;
                case 10: goto L5c;
                case 11: goto L5c;
                case 12: goto L57;
                case 13: goto L57;
                case 14: goto L52;
                case 15: goto L4f;
                case 16: goto L74;
                default: goto L4a;
            }
        L4a:
            java.lang.String r2 = "isVisible"
            r4[r3] = r2
            goto L74
        L4f:
            r4[r3] = r2
            goto L74
        L52:
            java.lang.String r2 = "isPrivate"
            r4[r3] = r2
            goto L74
        L57:
            java.lang.String r2 = "compare"
            r4[r3] = r2
            goto L74
        L5c:
            java.lang.String r2 = "compareLocal"
            r4[r3] = r2
            goto L74
        L61:
            java.lang.String r2 = "findInvisibleMember"
            r4[r3] = r2
            goto L74
        L66:
            java.lang.String r2 = "inSameFile"
            r4[r3] = r2
            goto L74
        L6b:
            java.lang.String r2 = "isVisibleWithAnyReceiver"
            r4[r3] = r2
            goto L74
        L70:
            java.lang.String r2 = "isVisibleIgnoringReceiver"
            r4[r3] = r2
        L74:
            java.lang.String r1 = java.lang.String.format(r1, r4)
            if (r8 == r0) goto L80
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r1)
            goto L85
        L80:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r1)
        L85:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o06.f0.a(int):void");
    }

    public static java.lang.Integer b(o06.g0 g0Var, o06.g0 g0Var2) {
        if (g0Var == null) {
            a(12);
            throw null;
        }
        if (g0Var2 == null) {
            a(13);
            throw null;
        }
        o06.y2 y2Var = ((o06.r) g0Var).f341981a;
        o06.y2 y2Var2 = ((o06.r) g0Var2).f341981a;
        java.lang.Integer a17 = y2Var.a(y2Var2);
        if (a17 != null) {
            return a17;
        }
        java.lang.Integer a18 = y2Var2.a(y2Var);
        if (a18 != null) {
            return java.lang.Integer.valueOf(-a18.intValue());
        }
        return null;
    }

    public static o06.q c(z16.g gVar, o06.q qVar, o06.m mVar, boolean z17) {
        o06.q c17;
        if (qVar == null) {
            a(8);
            throw null;
        }
        if (mVar == null) {
            a(9);
            throw null;
        }
        for (o06.q qVar2 = (o06.q) qVar.a(); qVar2 != null && qVar2.getVisibility() != f341946f; qVar2 = (o06.q) r16.i.i(qVar2, o06.q.class)) {
            if (!qVar2.getVisibility().a(gVar, qVar2, mVar, z17)) {
                return qVar2;
            }
        }
        if (!(qVar instanceof r06.l1) || (c17 = c(gVar, ((r06.o1) ((r06.l1) qVar)).M, mVar, z17)) == null) {
            return null;
        }
        return c17;
    }

    public static boolean d(o06.m mVar, o06.m mVar2) {
        if (mVar == null) {
            a(6);
            throw null;
        }
        if (mVar2 == null) {
            a(7);
            throw null;
        }
        o06.z1 f17 = r16.i.f(mVar2);
        if (f17 != o06.z1.f342013a) {
            return f17.equals(r16.i.f(mVar));
        }
        return false;
    }

    public static boolean e(o06.g0 g0Var) {
        if (g0Var != null) {
            return g0Var == f341941a || g0Var == f341942b;
        }
        a(14);
        throw null;
    }

    public static void f(o06.g0 g0Var) {
        f341955o.put(((o06.r) g0Var).f341981a, g0Var);
    }

    public static o06.g0 g(o06.y2 y2Var) {
        if (y2Var == null) {
            a(15);
            throw null;
        }
        o06.g0 g0Var = (o06.g0) ((java.util.HashMap) f341955o).get(y2Var);
        if (g0Var != null) {
            return g0Var;
        }
        throw new java.lang.IllegalArgumentException("Inapplicable visibility: " + y2Var);
    }
}
