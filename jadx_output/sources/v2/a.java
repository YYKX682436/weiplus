package v2;

/* loaded from: classes15.dex */
public abstract class a {
    public static int a(v2.k kVar, int i17) {
        java.util.List list;
        int i18 = i17 * 2;
        if (i17 == 0) {
            list = kVar.f432703d;
        } else if (i17 == 1) {
            list = kVar.f432704e;
        } else {
            kVar.getClass();
            list = null;
        }
        int size = list.size();
        int i19 = 0;
        for (int i27 = 0; i27 < size; i27++) {
            v2.i iVar = (v2.i) list.get(i27);
            v2.g[] gVarArr = iVar.A;
            v2.g gVar = gVarArr[i18 + 1].f432637d;
            i19 = java.lang.Math.max(i19, b(iVar, i17, gVar == null || !(gVarArr[i18].f432637d == null || gVar == null), 0));
        }
        kVar.f432702c[i17] = i19;
        return i19;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int b(v2.i iVar, int i17, boolean z17, int i18) {
        int i19;
        int i27;
        int i28;
        int i29;
        int i37;
        int l17;
        int i38;
        int i39;
        int i47;
        v2.g gVar;
        v2.i iVar2;
        boolean z18;
        int i48;
        if (!iVar.f432650a0) {
            return 0;
        }
        v2.g gVar2 = iVar.f432679w;
        boolean z19 = gVar2.f432637d != null && i17 == 1;
        if (z17) {
            i27 = iVar.Q;
            i19 = iVar.h() - iVar.Q;
            i29 = i17 * 2;
            i28 = i29 + 1;
        } else {
            int h17 = iVar.h();
            i19 = iVar.Q;
            i27 = h17 - i19;
            i28 = i17 * 2;
            i29 = i28 + 1;
        }
        v2.g[] gVarArr = iVar.A;
        if (gVarArr[i28].f432637d == null || gVarArr[i29].f432637d != null) {
            i37 = 1;
        } else {
            i37 = -1;
            int i49 = i28;
            i28 = i29;
            i29 = i49;
        }
        int i57 = z19 ? i18 - i27 : i18;
        int b17 = (gVarArr[i29].b() * i37) + c(iVar, i17);
        int i58 = i57 + b17;
        int l18 = (i17 == 0 ? iVar.l() : iVar.h()) * i37;
        java.util.Iterator it = gVarArr[i29].f432634a.f432728a.iterator();
        int i59 = 0;
        while (it.hasNext()) {
            i59 = java.lang.Math.max(i59, b(((v2.o) ((v2.q) it.next())).f432717c.f432635b, i17, z17, i58));
        }
        java.util.Iterator it6 = gVarArr[i28].f432634a.f432728a.iterator();
        int i66 = 0;
        while (it6.hasNext()) {
            i66 = java.lang.Math.max(i66, b(((v2.o) ((v2.q) it6.next())).f432717c.f432635b, i17, z17, l18 + i58));
            it6 = it6;
            i28 = i28;
        }
        int i67 = i28;
        if (z19) {
            i59 -= i27;
            l17 = i66 + i19;
        } else {
            l17 = i66 + ((i17 == 0 ? iVar.l() : iVar.h()) * i37);
        }
        int i68 = 1;
        if (i17 == 1) {
            v2.o oVar = gVar2.f432634a;
            java.util.Iterator it7 = oVar.f432728a.iterator();
            int i69 = 0;
            while (it7.hasNext()) {
                java.util.Iterator it8 = it7;
                v2.o oVar2 = (v2.o) ((v2.q) it7.next());
                if (i37 == i68) {
                    i69 = java.lang.Math.max(i69, b(oVar2.f432717c.f432635b, i17, z17, i27 + i58));
                    i48 = i29;
                } else {
                    i48 = i29;
                    i69 = java.lang.Math.max(i69, b(oVar2.f432717c.f432635b, i17, z17, (i19 * i37) + i58));
                }
                it7 = it8;
                i29 = i48;
                i68 = 1;
            }
            i38 = i29;
            i39 = i69;
            if (oVar.f432728a.size() > 0 && !z19) {
                i39 = i37 == 1 ? i39 + i27 : i39 - i19;
            }
        } else {
            i38 = i29;
            i39 = 0;
        }
        int max = b17 + java.lang.Math.max(i59, java.lang.Math.max(l17, i39));
        int i76 = i58 + l18;
        if (i37 == -1) {
            i76 = i58;
            i58 = i76;
        }
        if (z17) {
            v2.n.b(iVar, i17, i58);
            if (i17 == 0) {
                iVar.I = i58;
                int i77 = i76 - i58;
                iVar.E = i77;
                int i78 = iVar.R;
                if (i77 < i78) {
                    iVar.E = i78;
                }
                z18 = 1;
            } else {
                z18 = 1;
                z18 = 1;
                z18 = 1;
                if (i17 == 1) {
                    iVar.f432648J = i58;
                    int i79 = i76 - i58;
                    iVar.F = i79;
                    int i86 = iVar.S;
                    if (i79 < i86) {
                        iVar.F = i86;
                    }
                }
            }
            iVar.f432652b0 = z18;
            i47 = z18;
        } else {
            i47 = 1;
            i47 = 1;
            i47 = 1;
            iVar.f432672p.a(iVar, i17);
            if (i17 == 0) {
                iVar.K = i58;
            } else if (i17 == 1) {
                iVar.L = i58;
            }
        }
        v2.h[] hVarArr = iVar.C;
        if ((i17 == 0 ? hVarArr[0] : i17 == i47 ? hVarArr[i47] : null) == v2.h.MATCH_CONSTRAINT && iVar.G != 0.0f) {
            iVar.f432672p.a(iVar, i17);
        }
        v2.g gVar3 = gVarArr[i38].f432637d;
        if (gVar3 != null && (gVar = gVarArr[i67].f432637d) != null && gVar3.f432635b == (iVar2 = iVar.D) && gVar.f432635b == iVar2) {
            iVar.f432672p.a(iVar, i17);
        }
        return max;
    }

    public static int c(v2.i iVar, int i17) {
        v2.g gVar;
        int i18 = i17 * 2;
        v2.g[] gVarArr = iVar.A;
        v2.g gVar2 = gVarArr[i18];
        v2.g gVar3 = gVarArr[i18 + 1];
        v2.g gVar4 = gVar2.f432637d;
        if (gVar4 == null) {
            return 0;
        }
        v2.i iVar2 = gVar4.f432635b;
        v2.i iVar3 = iVar.D;
        if (iVar2 != iVar3 || (gVar = gVar3.f432637d) == null || gVar.f432635b != iVar3) {
            return 0;
        }
        return (int) ((((iVar3.i(i17) - gVar2.b()) - gVar3.b()) - iVar.i(i17)) * (i17 == 0 ? iVar.V : iVar.W));
    }

    public static int d(v2.i iVar) {
        v2.h[] hVarArr = iVar.C;
        v2.h hVar = hVarArr[0];
        v2.h hVar2 = v2.h.MATCH_CONSTRAINT;
        if (hVar == hVar2) {
            int h17 = (int) (iVar.H == 0 ? iVar.h() * iVar.G : iVar.h() / iVar.G);
            iVar.x(h17);
            return h17;
        }
        if (hVarArr[1] != hVar2) {
            return -1;
        }
        int l17 = (int) (iVar.H == 1 ? iVar.l() * iVar.G : iVar.l() / iVar.G);
        iVar.t(l17);
        return l17;
    }

    public static void e(java.util.List list, int i17, int i18) {
        java.util.HashSet<v2.i> hashSet;
        int size = list.size();
        for (int i19 = 0; i19 < size; i19++) {
            v2.k kVar = (v2.k) list.get(i19);
            if (i17 == 0) {
                hashSet = kVar.f432705f;
            } else if (i17 == 1) {
                hashSet = kVar.f432706g;
            } else {
                kVar.getClass();
                hashSet = null;
            }
            for (v2.i iVar : hashSet) {
                if (iVar.f432650a0) {
                    int i27 = i17 * 2;
                    v2.g[] gVarArr = iVar.A;
                    v2.g gVar = gVarArr[i27];
                    v2.g gVar2 = gVarArr[i27 + 1];
                    if ((gVar.f432637d == null || gVar2.f432637d == null) ? false : true) {
                        v2.n.b(iVar, i17, c(iVar, i17) + gVar.b());
                    } else {
                        if (iVar.G != 0.0f) {
                            v2.h[] hVarArr = iVar.C;
                            if ((i17 == 0 ? hVarArr[0] : i17 == 1 ? hVarArr[1] : null) == v2.h.MATCH_CONSTRAINT) {
                                int d17 = d(iVar);
                                int i28 = (int) gVarArr[i27].f432634a.f432721g;
                                int i29 = i28 + d17;
                                v2.o oVar = gVar2.f432634a;
                                oVar.f432720f = gVar.f432634a;
                                oVar.f432721g = d17;
                                oVar.f432729b = 1;
                                if (i17 == 0) {
                                    iVar.I = i28;
                                    int i37 = i29 - i28;
                                    iVar.E = i37;
                                    int i38 = iVar.R;
                                    if (i37 < i38) {
                                        iVar.E = i38;
                                    }
                                } else if (i17 == 1) {
                                    iVar.f432648J = i28;
                                    int i39 = i29 - i28;
                                    iVar.F = i39;
                                    int i47 = iVar.S;
                                    if (i39 < i47) {
                                        iVar.F = i47;
                                    }
                                }
                                iVar.f432652b0 = true;
                            }
                        }
                        int i48 = i18 - (i17 == 0 ? iVar.K : i17 == 1 ? iVar.L : 0);
                        int i49 = i48 - iVar.i(i17);
                        if (i17 == 0) {
                            iVar.I = i49;
                            int i57 = i48 - i49;
                            iVar.E = i57;
                            int i58 = iVar.R;
                            if (i57 < i58) {
                                iVar.E = i58;
                            }
                        } else if (i17 == 1) {
                            iVar.f432648J = i49;
                            int i59 = i48 - i49;
                            iVar.F = i59;
                            int i66 = iVar.S;
                            if (i59 < i66) {
                                iVar.F = i66;
                            }
                        }
                        iVar.f432652b0 = true;
                        v2.n.b(iVar, i17, i49);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x013d, code lost:
    
        if (r7.f432635b == r8) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x00fc, code lost:
    
        if (r7.f432635b == r8) goto L89;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x015a  */
    /* JADX WARN: Type inference failed for: r19v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean f(v2.i r17, v2.k r18, java.util.List r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 509
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v2.a.f(v2.i, v2.k, java.util.List, boolean):boolean");
    }
}
