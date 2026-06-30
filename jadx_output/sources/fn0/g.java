package fn0;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final fn0.g f264195a = new fn0.g();

    /* renamed from: b, reason: collision with root package name */
    public static final hn0.g f264196b = (hn0.g) i95.n0.c(hn0.g.class);

    /* renamed from: c, reason: collision with root package name */
    public static boolean f264197c;

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(java.lang.String r14) {
        /*
            r13 = this;
            hn0.g r0 = fn0.g.f264196b
            r1 = 0
            if (r0 == 0) goto L9b
            zl2.r4 r0 = zl2.r4.f473950a
            boolean r0 = r0.x1()
            r2 = 1
            if (r0 != 0) goto L11
        Le:
            r14 = r1
            goto L98
        L11:
            jz5.g r0 = ae2.in.f3758h
            jz5.n r0 = (jz5.n) r0
            java.lang.Object r0 = r0.getValue()
            lb2.j r0 = (lb2.j) r0
            java.lang.Object r0 = r0.r()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 == r2) goto L28
            goto Le
        L28:
            dk2.ef r0 = dk2.ef.f233372a
            java.lang.Class<mm2.e1> r3 = mm2.e1.class
            androidx.lifecycle.c1 r3 = r0.i(r3)
            mm2.e1 r3 = (mm2.e1) r3
            if (r3 == 0) goto L3c
            boolean r3 = r3.g7()
            if (r3 != r2) goto L3c
            r3 = r2
            goto L3d
        L3c:
            r3 = r1
        L3d:
            if (r3 != 0) goto L40
            goto Le
        L40:
            java.lang.Class<mm2.o4> r3 = mm2.o4.class
            androidx.lifecycle.c1 r0 = r0.i(r3)
            mm2.o4 r0 = (mm2.o4) r0
            r3 = 0
            if (r0 == 0) goto L71
            java.util.List r0 = r0.f329335z
            if (r0 == 0) goto L71
            monitor-enter(r0)
            java.util.Iterator r4 = r0.iterator()     // Catch: java.lang.Throwable -> L6e
        L54:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L6e
            if (r5 == 0) goto L6a
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L6e
            r6 = r5
            km2.q r6 = (km2.q) r6     // Catch: java.lang.Throwable -> L6e
            java.lang.String r6 = r6.f309170a     // Catch: java.lang.Throwable -> L6e
            boolean r6 = kotlin.jvm.internal.o.b(r6, r14)     // Catch: java.lang.Throwable -> L6e
            if (r6 == 0) goto L54
            r3 = r5
        L6a:
            monitor-exit(r0)
            km2.q r3 = (km2.q) r3
            goto L71
        L6e:
            r14 = move-exception
            monitor-exit(r0)
            throw r14
        L71:
            if (r3 == 0) goto L74
            goto Le
        L74:
            java.lang.String r0 = "LiveCoreModuleService"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "checkIsNeedCleanTRTCState do clean sdkUserId: "
            r3.<init>(r4)
            r3.append(r14)
            java.lang.String r14 = r3.toString()
            com.tencent.mars.xlog.Log.i(r0, r14)
            xy2.b r3 = xy2.b.f458155b
            java.lang.String r4 = "LiveTimeoutTRTCCleanState"
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 124(0x7c, float:1.74E-43)
            r12 = 0
            pm0.z.b(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r14 = r2
        L98:
            if (r14 != r2) goto L9b
            r1 = r2
        L9b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: fn0.g.a(java.lang.String):boolean");
    }

    public final boolean b() {
        if (f264196b == null) {
            return false;
        }
        om2.l lVar = (om2.l) dk2.ef.f233372a.i(om2.l.class);
        return lVar != null ? lVar.S6() : false;
    }

    public final long c(java.lang.String sdkUserId) {
        mm2.o4 o4Var;
        java.util.List list;
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(sdkUserId, "sdkUserId");
        if (f264196b == null || (o4Var = (mm2.o4) dk2.ef.f233372a.i(mm2.o4.class)) == null || (list = o4Var.f329327v) == null) {
            return 0L;
        }
        synchronized (list) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.o.b(((km2.q) obj).f309170a, sdkUserId)) {
                    break;
                }
            }
        }
        km2.q qVar = (km2.q) obj;
        if (qVar != null) {
            return qVar.L;
        }
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.String r0 = "uId"
            kotlin.jvm.internal.o.g(r9, r0)
            hn0.g r0 = fn0.g.f264196b
            r1 = 0
            if (r0 == 0) goto L7c
            dk2.ef r0 = dk2.ef.f233372a
            java.lang.Class<mm2.o4> r2 = mm2.o4.class
            androidx.lifecycle.c1 r0 = r0.i(r2)
            mm2.o4 r0 = (mm2.o4) r0
            r2 = 1
            if (r0 == 0) goto L71
            java.util.List r3 = r0.f329324s
            java.lang.String r4 = "<get-anchorPkMicUserList>(...)"
            kotlin.jvm.internal.o.f(r3, r4)
            monitor-enter(r3)
            java.util.Iterator r4 = r3.iterator()     // Catch: java.lang.Throwable -> L76
        L24:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L76
            r6 = 0
            if (r5 == 0) goto L3b
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L76
            r7 = r5
            km2.q r7 = (km2.q) r7     // Catch: java.lang.Throwable -> L76
            java.lang.String r7 = r7.f309170a     // Catch: java.lang.Throwable -> L76
            boolean r7 = kotlin.jvm.internal.o.b(r7, r9)     // Catch: java.lang.Throwable -> L76
            if (r7 == 0) goto L24
            goto L3c
        L3b:
            r5 = r6
        L3c:
            monitor-exit(r3)
            km2.q r5 = (km2.q) r5
            if (r5 == 0) goto L44
            boolean r9 = r5.f309185p
            goto L79
        L44:
            java.util.List r0 = r0.f329327v
            java.lang.String r3 = "<get-audienceLinkMicUserList>(...)"
            kotlin.jvm.internal.o.f(r0, r3)
            monitor-enter(r0)
            java.util.Iterator r3 = r0.iterator()     // Catch: java.lang.Throwable -> L73
        L50:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L73
            if (r4 == 0) goto L66
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L73
            r5 = r4
            km2.q r5 = (km2.q) r5     // Catch: java.lang.Throwable -> L73
            java.lang.String r5 = r5.f309170a     // Catch: java.lang.Throwable -> L73
            boolean r5 = kotlin.jvm.internal.o.b(r5, r9)     // Catch: java.lang.Throwable -> L73
            if (r5 == 0) goto L50
            r6 = r4
        L66:
            monitor-exit(r0)
            km2.q r6 = (km2.q) r6
            if (r6 == 0) goto L71
            int r9 = r6.f309174e
            if (r9 != r2) goto L71
            r9 = r2
            goto L79
        L71:
            r9 = r1
            goto L79
        L73:
            r9 = move-exception
            monitor-exit(r0)
            throw r9
        L76:
            r9 = move-exception
            monitor-exit(r3)
            throw r9
        L79:
            if (r9 != r2) goto L7c
            r1 = r2
        L7c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: fn0.g.d(java.lang.String):boolean");
    }

    public final boolean e() {
        if (f264196b == null) {
            return false;
        }
        mm2.e1 e1Var = (mm2.e1) dk2.ef.f233372a.i(mm2.e1.class);
        return e1Var != null && e1Var.Z6();
    }

    public final boolean f() {
        if (f264196b == null) {
            return false;
        }
        mm2.y2 y2Var = (mm2.y2) dk2.ef.f233372a.i(mm2.y2.class);
        return y2Var != null && y2Var.X6();
    }

    public final boolean g() {
        if (f264196b == null) {
            return false;
        }
        mm2.e1 e1Var = (mm2.e1) dk2.ef.f233372a.i(mm2.e1.class);
        return e1Var != null && e1Var.b7();
    }

    public final boolean h() {
        if (f264196b == null) {
            return false;
        }
        mm2.c1 c1Var = (mm2.c1) dk2.ef.f233372a.i(mm2.c1.class);
        return pm0.v.z(c1Var != null ? c1Var.f328807g2 : 0, 524288);
    }

    public final boolean i() {
        if (f264196b == null) {
            return false;
        }
        mm2.e1 e1Var = (mm2.e1) dk2.ef.f233372a.i(mm2.e1.class);
        return e1Var != null && e1Var.R6() == 2 && e1Var.U6() == 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j() {
        /*
            r5 = this;
            hn0.g r0 = fn0.g.f264196b
            r1 = 0
            if (r0 == 0) goto L41
            dk2.ef r0 = dk2.ef.f233372a
            java.lang.Class<mm2.o4> r2 = mm2.o4.class
            androidx.lifecycle.c1 r3 = r0.i(r2)
            mm2.o4 r3 = (mm2.o4) r3
            r4 = 1
            if (r3 == 0) goto L1f
            java.util.List r3 = r3.f329324s
            if (r3 == 0) goto L1f
            boolean r3 = r3.isEmpty()
            r3 = r3 ^ r4
            if (r3 != r4) goto L1f
            r3 = r4
            goto L20
        L1f:
            r3 = r1
        L20:
            if (r3 != 0) goto L3d
            androidx.lifecycle.c1 r0 = r0.i(r2)
            mm2.o4 r0 = (mm2.o4) r0
            if (r0 == 0) goto L37
            java.util.List r0 = r0.f329325t
            if (r0 == 0) goto L37
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r4
            if (r0 != r4) goto L37
            r0 = r4
            goto L38
        L37:
            r0 = r1
        L38:
            if (r0 == 0) goto L3b
            goto L3d
        L3b:
            r0 = r1
            goto L3e
        L3d:
            r0 = r4
        L3e:
            if (r0 != r4) goto L41
            r1 = r4
        L41:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: fn0.g.j():boolean");
    }

    public final boolean k() {
        if (f264196b == null) {
            return false;
        }
        mm2.c1 c1Var = (mm2.c1) dk2.ef.f233372a.i(mm2.c1.class);
        return pm0.v.z(c1Var != null ? (int) c1Var.f328866q : 0, com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62);
    }

    public final boolean l() {
        if (f264196b != null) {
            return ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3738f).getValue()).r()).intValue() == 1;
        }
        return false;
    }

    public final boolean m() {
        if (f264196b == null) {
            return false;
        }
        mm2.e1 e1Var = (mm2.e1) dk2.ef.f233372a.i(mm2.e1.class);
        return e1Var != null && e1Var.R6() == 2 && e1Var.U6() == 1;
    }

    public final boolean n() {
        if (f264196b == null) {
            return false;
        }
        ae2.in inVar = ae2.in.f3688a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3718d).getValue()).r()).intValue() == 1;
    }

    public final boolean o(java.lang.String uId) {
        boolean z17;
        java.util.List list;
        java.util.List list2;
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(uId, "uId");
        int i17 = 0;
        if (f264196b == null) {
            return false;
        }
        mm2.o4 o4Var = (mm2.o4) dk2.ef.f233372a.i(mm2.o4.class);
        java.lang.Object obj2 = null;
        if (o4Var != null && (list2 = o4Var.f329324s) != null) {
            synchronized (list2) {
                java.util.Iterator it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (kotlin.jvm.internal.o.b(((km2.q) obj).f309170a, uId)) {
                        break;
                    }
                }
            }
            km2.q qVar = (km2.q) obj;
            if (qVar != null) {
                z17 = pm0.v.z(qVar.f309191v, 16);
                return z17;
            }
        }
        mm2.o4 o4Var2 = (mm2.o4) dk2.ef.f233372a.i(mm2.o4.class);
        if (o4Var2 != null && (list = o4Var2.f329327v) != null) {
            synchronized (list) {
                java.util.Iterator it6 = list.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it6.next();
                    if (kotlin.jvm.internal.o.b(((km2.q) next).f309170a, uId)) {
                        obj2 = next;
                        break;
                    }
                }
            }
            km2.q qVar2 = (km2.q) obj2;
            if (qVar2 != null) {
                i17 = qVar2.f309191v;
            }
        }
        z17 = pm0.v.z(i17, 16);
        return z17;
    }

    public final boolean p() {
        if (f264196b == null) {
            return false;
        }
        mm2.e1 e1Var = (mm2.e1) dk2.ef.f233372a.i(mm2.e1.class);
        return e1Var != null && e1Var.g7();
    }

    public final boolean q() {
        if (f264196b != null) {
            return ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3748g).getValue()).r()).intValue() == 1;
        }
        return false;
    }
}
