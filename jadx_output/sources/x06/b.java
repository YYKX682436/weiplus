package x06;

/* loaded from: classes16.dex */
public abstract class b {

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f451203c;

    /* renamed from: a, reason: collision with root package name */
    public final x06.k0 f451204a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f451205b;

    static {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (x06.c cVar : x06.c.values()) {
            java.lang.String str = cVar.f451217d;
            if (linkedHashMap.get(str) == null) {
                linkedHashMap.put(str, cVar);
            }
        }
        f451203c = linkedHashMap;
    }

    public b(x06.k0 javaTypeEnhancementState) {
        kotlin.jvm.internal.o.g(javaTypeEnhancementState, "javaTypeEnhancementState");
        this.f451204a = javaTypeEnhancementState;
        this.f451205b = new java.util.concurrent.ConcurrentHashMap();
    }

    public abstract java.lang.Iterable a(java.lang.Object obj, boolean z17);

    /* JADX WARN: Removed duplicated region for block: B:28:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0153 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x001b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final x06.l0 b(x06.l0 r18, java.lang.Iterable r19) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x06.b.b(x06.l0, java.lang.Iterable):x06.l0");
    }

    public final f16.o c(java.lang.Object obj, yz5.l lVar) {
        f16.o h17;
        f16.o h18 = h(obj, ((java.lang.Boolean) lVar.invoke(obj)).booleanValue());
        if (h18 != null) {
            return h18;
        }
        java.lang.Object j17 = j(obj);
        if (j17 == null) {
            return null;
        }
        x06.w0 i17 = i(obj);
        if (i17 == null) {
            i17 = this.f451204a.f451271a.f451278a;
        }
        i17.getClass();
        if ((i17 == x06.w0.f451330e) || (h17 = h(j17, ((java.lang.Boolean) lVar.invoke(j17)).booleanValue())) == null) {
            return null;
        }
        return f16.o.a(h17, null, i17 == x06.w0.f451331f, 1, null);
    }

    public final java.lang.Object d(java.lang.Object obj, n16.c cVar) {
        for (java.lang.Object obj2 : f(obj)) {
            if (kotlin.jvm.internal.o.b(e(obj2), cVar)) {
                return obj2;
            }
        }
        return null;
    }

    public abstract n16.c e(java.lang.Object obj);

    public abstract java.lang.Iterable f(java.lang.Object obj);

    public final boolean g(java.lang.Object obj, n16.c cVar) {
        java.lang.Iterable f17 = f(obj);
        if ((f17 instanceof java.util.Collection) && ((java.util.Collection) f17).isEmpty()) {
            return false;
        }
        java.util.Iterator it = f17.iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.o.b(e(it.next()), cVar)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0087, code lost:
    
        if (r7.equals("ALWAYS") != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009c, code lost:
    
        if (r7.equals("NEVER") == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a8, code lost:
    
        r7 = f16.n.f258756e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a5, code lost:
    
        if (r7.equals("MAYBE") == false) goto L50;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:40:0x007d. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final f16.o h(java.lang.Object r7, boolean r8) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x06.b.h(java.lang.Object, boolean):f16.o");
    }

    public final x06.w0 i(java.lang.Object obj) {
        java.lang.String str;
        x06.k0 k0Var = this.f451204a;
        x06.w0 w0Var = (x06.w0) k0Var.f451271a.f451280c.get(e(obj));
        if (w0Var != null) {
            return w0Var;
        }
        java.lang.Object d17 = d(obj, x06.d.f451221d);
        if (d17 == null || (str = (java.lang.String) kz5.n0.Y(a(d17, false))) == null) {
            return null;
        }
        x06.w0 w0Var2 = k0Var.f451271a.f451279b;
        if (w0Var2 != null) {
            return w0Var2;
        }
        int hashCode = str.hashCode();
        if (hashCode == -2137067054) {
            if (str.equals("IGNORE")) {
                return x06.w0.f451330e;
            }
            return null;
        }
        if (hashCode == -1838656823) {
            if (str.equals("STRICT")) {
                return x06.w0.f451332g;
            }
            return null;
        }
        if (hashCode == 2656902 && str.equals("WARN")) {
            return x06.w0.f451331f;
        }
        return null;
    }

    public final java.lang.Object j(java.lang.Object annotation) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(annotation, "annotation");
        if (this.f451204a.f451271a.f451281d) {
            return null;
        }
        if (kz5.n0.O(x06.d.f451224g, e(annotation)) || g(annotation, x06.d.f451219b)) {
            return annotation;
        }
        if (!g(annotation, x06.d.f451218a)) {
            return null;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f451205b;
        o06.g d17 = v16.f.d((p06.c) annotation);
        kotlin.jvm.internal.o.d(d17);
        java.lang.Object obj2 = concurrentHashMap.get(d17);
        if (obj2 != null) {
            return obj2;
        }
        java.util.Iterator it = f(annotation).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = j(it.next());
            if (obj != null) {
                break;
            }
        }
        if (obj == null) {
            return null;
        }
        java.lang.Object putIfAbsent = concurrentHashMap.putIfAbsent(d17, obj);
        return putIfAbsent == null ? obj : putIfAbsent;
    }
}
