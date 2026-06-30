package x06;

/* loaded from: classes16.dex */
public abstract class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final o06.g0 f451225a;

    /* renamed from: b, reason: collision with root package name */
    public static final o06.g0 f451226b;

    /* renamed from: c, reason: collision with root package name */
    public static final o06.g0 f451227c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Map f451228d;

    static {
        x06.a0 a0Var = new x06.a0(s06.a.f401980c);
        f451225a = a0Var;
        x06.b0 b0Var = new x06.b0(s06.c.f401982c);
        f451226b = b0Var;
        x06.c0 c0Var = new x06.c0(s06.b.f401981c);
        f451227c = c0Var;
        java.util.HashMap hashMap = new java.util.HashMap();
        f451228d = hashMap;
        hashMap.put(a0Var.f341981a, a0Var);
        hashMap.put(b0Var.f341981a, b0Var);
        hashMap.put(c0Var.f341981a, c0Var);
    }

    public static /* synthetic */ void a(int i17) {
        java.lang.String str = (i17 == 5 || i17 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i17 == 5 || i17 == 6) ? 2 : 3];
        switch (i17) {
            case 1:
                objArr[0] = "from";
                break;
            case 2:
                objArr[0] = "first";
                break;
            case 3:
                objArr[0] = "second";
                break;
            case 4:
                objArr[0] = "visibility";
                break;
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                break;
            default:
                objArr[0] = "what";
                break;
        }
        if (i17 == 5 || i17 == 6) {
            objArr[1] = "toDescriptorVisibility";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
        }
        if (i17 == 2 || i17 == 3) {
            objArr[2] = "areInSamePackage";
        } else if (i17 == 4) {
            objArr[2] = "toDescriptorVisibility";
        } else if (i17 != 5 && i17 != 6) {
            objArr[2] = "isVisibleForProtectedAndPackage";
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        if (i17 != 5 && i17 != 6) {
            throw new java.lang.IllegalArgumentException(format);
        }
        throw new java.lang.IllegalStateException(format);
    }

    public static boolean b(z16.g gVar, o06.q qVar, o06.m mVar) {
        if (qVar == null) {
            a(0);
            throw null;
        }
        if (mVar == null) {
            a(1);
            throw null;
        }
        if (c(r16.i.w(qVar), mVar)) {
            return true;
        }
        return o06.f0.f341943c.a(gVar, qVar, mVar, false);
    }

    public static boolean c(o06.m mVar, o06.m mVar2) {
        if (mVar == null) {
            a(2);
            throw null;
        }
        if (mVar2 == null) {
            a(3);
            throw null;
        }
        o06.d1 d1Var = (o06.d1) r16.i.j(mVar, o06.d1.class, false);
        o06.d1 d1Var2 = (o06.d1) r16.i.j(mVar2, o06.d1.class, false);
        return (d1Var2 == null || d1Var == null || !((r06.z0) d1Var).f368566h.equals(((r06.z0) d1Var2).f368566h)) ? false : true;
    }
}
