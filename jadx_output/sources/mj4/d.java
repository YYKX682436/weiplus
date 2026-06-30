package mj4;

/* loaded from: classes11.dex */
public abstract class d {
    public static final java.lang.String a(mj4.h hVar) {
        kotlin.jvm.internal.o.g(hVar, "<this>");
        mj4.c cVar = mj4.c.f327057a;
        if (cVar.a() != 0) {
            java.lang.String str = "";
            if (cVar.a() == 1) {
                pj4.x c17 = c(xe0.j0.a(hVar, false, 1, null));
                java.lang.String str2 = c17 != null ? c17.f355322d : null;
                if (str2 != null) {
                    str = str2;
                }
            }
            if (r26.n0.N(str)) {
                pj4.x xVar = xe0.j0.a(hVar, false, 1, null).f355223q;
                str = java.lang.String.valueOf(xVar != null ? xVar.f355322d : null);
            }
            if (!r26.n0.N(str)) {
                return str;
            }
        }
        return ((mj4.k) hVar).h();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v2 java.lang.String, still in use, count: 2, list:
          (r5v2 java.lang.String) from 0x003d: IF  (r5v2 java.lang.String) == (null java.lang.String)  -> B:13:0x0041 A[HIDDEN]
          (r5v2 java.lang.String) from 0x0040: PHI (r5v4 java.lang.String) = (r5v2 java.lang.String), (r5v3 java.lang.String), (r5v5 java.lang.String) binds: [B:25:0x003d, B:23:0x0038, B:11:0x0027] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:125)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public static final java.lang.String b(pj4.o0 r5) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.o.g(r5, r0)
            mj4.c r0 = mj4.c.f327057a
            int r0 = r0.a()
            java.lang.String r1 = ""
            r2 = 1
            if (r0 != r2) goto L45
            pj4.x r0 = c(r5)
            r3 = 0
            if (r0 == 0) goto L2a
            java.lang.String r4 = r0.f355325g
            if (r4 == 0) goto L24
            boolean r4 = r26.n0.N(r4)
            if (r4 == 0) goto L22
            goto L24
        L22:
            r4 = r3
            goto L25
        L24:
            r4 = r2
        L25:
            if (r4 != 0) goto L2a
            java.lang.String r5 = r0.f355325g
            goto L40
        L2a:
            java.lang.String r0 = r5.f355222p
            if (r0 == 0) goto L36
            boolean r0 = r26.n0.N(r0)
            if (r0 == 0) goto L35
            goto L36
        L35:
            r2 = r3
        L36:
            if (r2 != 0) goto L3b
            java.lang.String r5 = r5.f355222p
            goto L40
        L3b:
            java.lang.String r5 = r5.f355213d
            if (r5 != 0) goto L40
            goto L41
        L40:
            r1 = r5
        L41:
            kotlin.jvm.internal.o.d(r1)
            goto L4b
        L45:
            java.lang.String r5 = r5.f355213d
            if (r5 != 0) goto L4a
            goto L4b
        L4a:
            r1 = r5
        L4b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: mj4.d.b(pj4.o0):java.lang.String");
    }

    public static final pj4.x c(pj4.o0 o0Var) {
        pj4.x xVar;
        java.lang.String str;
        kotlin.jvm.internal.o.g(o0Var, "<this>");
        java.util.LinkedList clusterPresents = o0Var.f355226t;
        if (clusterPresents == null || clusterPresents.isEmpty()) {
            return o0Var.f355223q;
        }
        java.util.LinkedList key_value_items = bk4.i.a().p().f355154e;
        kotlin.jvm.internal.o.f(key_value_items, "key_value_items");
        java.util.Iterator it = key_value_items.iterator();
        while (true) {
            xVar = null;
            if (!it.hasNext()) {
                str = null;
                break;
            }
            pj4.l0 l0Var = (pj4.l0) it.next();
            if (l0Var.f355169d.equals("cluster_present_type")) {
                str = l0Var.f355170e;
                break;
            }
        }
        if (!(str == null || str.length() == 0)) {
            kotlin.jvm.internal.o.f(clusterPresents, "clusterPresents");
            java.util.Iterator it6 = clusterPresents.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                pj4.x xVar2 = (pj4.x) it6.next();
                if (xVar2.f355327i <= 1 && xVar2.f355326h.equals(str)) {
                    xVar = xVar2;
                    break;
                }
            }
        }
        return xVar == null ? (pj4.x) clusterPresents.get(clusterPresents.size() - 1) : xVar;
    }
}
