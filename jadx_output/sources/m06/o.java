package m06;

/* loaded from: classes15.dex */
public final class o {

    /* renamed from: b, reason: collision with root package name */
    public static final m06.o f322611b = new m06.o(kz5.c0.i(m06.i.f322603c, m06.l.f322606c, m06.j.f322604c, m06.k.f322605c));

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f322612a;

    public o(java.util.List kinds) {
        kotlin.jvm.internal.o.g(kinds, "kinds");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.lang.Object obj : kinds) {
            n16.c cVar = ((m06.m) obj).f322607a;
            java.lang.Object obj2 = linkedHashMap.get(cVar);
            if (obj2 == null) {
                obj2 = new java.util.ArrayList();
                linkedHashMap.put(cVar, obj2);
            }
            ((java.util.List) obj2).add(obj);
        }
        this.f322612a = linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0074 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x001c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final m06.n a(n16.c r11, java.lang.String r12) {
        /*
            r10 = this;
            java.lang.String r0 = "packageFqName"
            kotlin.jvm.internal.o.g(r11, r0)
            java.lang.String r0 = "className"
            kotlin.jvm.internal.o.g(r12, r0)
            java.util.Map r0 = r10.f322612a
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.lang.Object r11 = r0.get(r11)
            java.util.List r11 = (java.util.List) r11
            r0 = 0
            if (r11 != 0) goto L18
            return r0
        L18:
            java.util.Iterator r11 = r11.iterator()
        L1c:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L7e
            java.lang.Object r1 = r11.next()
            m06.m r1 = (m06.m) r1
            java.lang.String r2 = r1.f322608b
            r3 = 0
            boolean r2 = r26.i0.y(r12, r2, r3)
            if (r2 == 0) goto L1c
            java.lang.String r2 = r1.f322608b
            int r2 = r2.length()
            java.lang.String r2 = r12.substring(r2)
            java.lang.String r4 = "substring(...)"
            kotlin.jvm.internal.o.f(r2, r4)
            int r4 = r2.length()
            r5 = 1
            if (r4 != 0) goto L49
            r4 = r5
            goto L4a
        L49:
            r4 = r3
        L4a:
            if (r4 == 0) goto L4e
        L4c:
            r2 = r0
            goto L72
        L4e:
            int r4 = r2.length()
            r6 = r3
            r7 = r6
        L54:
            if (r6 >= r4) goto L6e
            char r8 = r2.charAt(r6)
            int r8 = r8 + (-48)
            if (r8 < 0) goto L64
            r9 = 10
            if (r8 >= r9) goto L64
            r9 = r5
            goto L65
        L64:
            r9 = r3
        L65:
            if (r9 != 0) goto L68
            goto L4c
        L68:
            int r7 = r7 * 10
            int r7 = r7 + r8
            int r6 = r6 + 1
            goto L54
        L6e:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
        L72:
            if (r2 == 0) goto L1c
            int r11 = r2.intValue()
            m06.n r12 = new m06.n
            r12.<init>(r1, r11)
            return r12
        L7e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m06.o.a(n16.c, java.lang.String):m06.n");
    }
}
