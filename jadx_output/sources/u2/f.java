package u2;

/* loaded from: classes15.dex */
public class f {

    /* renamed from: o, reason: collision with root package name */
    public static int f423824o = 1000;

    /* renamed from: b, reason: collision with root package name */
    public final u2.e f423826b;

    /* renamed from: e, reason: collision with root package name */
    public u2.b[] f423829e;

    /* renamed from: k, reason: collision with root package name */
    public final u2.c f423835k;

    /* renamed from: n, reason: collision with root package name */
    public final u2.e f423838n;

    /* renamed from: a, reason: collision with root package name */
    public int f423825a = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f423827c = 32;

    /* renamed from: d, reason: collision with root package name */
    public int f423828d = 32;

    /* renamed from: f, reason: collision with root package name */
    public boolean f423830f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean[] f423831g = new boolean[32];

    /* renamed from: h, reason: collision with root package name */
    public int f423832h = 1;

    /* renamed from: i, reason: collision with root package name */
    public int f423833i = 0;

    /* renamed from: j, reason: collision with root package name */
    public int f423834j = 32;

    /* renamed from: l, reason: collision with root package name */
    public u2.j[] f423836l = new u2.j[f423824o];

    /* renamed from: m, reason: collision with root package name */
    public int f423837m = 0;

    public f() {
        int i17 = 0;
        this.f423829e = null;
        this.f423829e = new u2.b[32];
        while (true) {
            u2.b[] bVarArr = this.f423829e;
            if (i17 >= bVarArr.length) {
                u2.c cVar = new u2.c();
                this.f423835k = cVar;
                this.f423826b = new u2.d(cVar);
                this.f423838n = new u2.b(cVar);
                return;
            }
            u2.b bVar = bVarArr[i17];
            if (bVar != null) {
                u2.h hVar = (u2.h) this.f423835k.f423821a;
                int i18 = hVar.f423840b;
                java.lang.Object[] objArr = hVar.f423839a;
                if (i18 < objArr.length) {
                    objArr[i18] = bVar;
                    hVar.f423840b = i18 + 1;
                }
            }
            bVarArr[i17] = null;
            i17++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    public final u2.j a(u2.i iVar, java.lang.String str) {
        u2.h hVar = (u2.h) this.f423835k.f423822b;
        int i17 = hVar.f423840b;
        u2.j jVar = null;
        if (i17 > 0) {
            int i18 = i17 - 1;
            ?? r37 = hVar.f423839a;
            ?? r47 = r37[i18];
            r37[i18] = 0;
            hVar.f423840b = i18;
            jVar = r47;
        }
        u2.j jVar2 = jVar;
        if (jVar2 == null) {
            jVar2 = new u2.j(iVar, str);
            jVar2.f423851f = iVar;
        } else {
            jVar2.c();
            jVar2.f423851f = iVar;
        }
        int i19 = this.f423837m;
        int i27 = f423824o;
        if (i19 >= i27) {
            int i28 = i27 * 2;
            f423824o = i28;
            this.f423836l = (u2.j[]) java.util.Arrays.copyOf(this.f423836l, i28);
        }
        u2.j[] jVarArr = this.f423836l;
        int i29 = this.f423837m;
        this.f423837m = i29 + 1;
        jVarArr[i29] = jVar2;
        return jVar2;
    }

    public void b(u2.j jVar, u2.j jVar2, int i17, float f17, u2.j jVar3, u2.j jVar4, int i18, int i19) {
        u2.b k17 = k();
        u2.a aVar = k17.f423819c;
        if (jVar2 == jVar3) {
            aVar.f(jVar, 1.0f);
            aVar.f(jVar4, 1.0f);
            aVar.f(jVar2, -2.0f);
        } else if (f17 == 0.5f) {
            aVar.f(jVar, 1.0f);
            aVar.f(jVar2, -1.0f);
            aVar.f(jVar3, -1.0f);
            aVar.f(jVar4, 1.0f);
            if (i17 > 0 || i18 > 0) {
                k17.f423818b = (-i17) + i18;
            }
        } else if (f17 <= 0.0f) {
            aVar.f(jVar, -1.0f);
            aVar.f(jVar2, 1.0f);
            k17.f423818b = i17;
        } else if (f17 >= 1.0f) {
            aVar.f(jVar3, -1.0f);
            aVar.f(jVar4, 1.0f);
            k17.f423818b = i18;
        } else {
            float f18 = 1.0f - f17;
            aVar.f(jVar, f18 * 1.0f);
            aVar.f(jVar2, f18 * (-1.0f));
            aVar.f(jVar3, (-1.0f) * f17);
            aVar.f(jVar4, 1.0f * f17);
            if (i17 > 0 || i18 > 0) {
                k17.f423818b = ((-i17) * f18) + (i18 * f17);
            }
        }
        if (i19 != 6) {
            k17.a(this, i19);
        }
        c(k17);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ab, code lost:
    
        if (r3.f423854i <= 1) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b9, code lost:
    
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b7, code lost:
    
        r13 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b5, code lost:
    
        if (r3.f423854i <= 1) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00da, code lost:
    
        if (r3.f423854i <= 1) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00e8, code lost:
    
        r15 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00e6, code lost:
    
        r15 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00e4, code lost:
    
        if (r3.f423854i <= 1) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00fc A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(u2.b r19) {
        /*
            Method dump skipped, instructions count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.f.c(u2.b):void");
    }

    public u2.b d(u2.j jVar, u2.j jVar2, int i17, int i18) {
        u2.b k17 = k();
        boolean z17 = false;
        if (i17 != 0) {
            if (i17 < 0) {
                i17 *= -1;
                z17 = true;
            }
            k17.f423818b = i17;
        }
        u2.a aVar = k17.f423819c;
        if (z17) {
            aVar.f(jVar, 1.0f);
            aVar.f(jVar2, -1.0f);
        } else {
            aVar.f(jVar, -1.0f);
            aVar.f(jVar2, 1.0f);
        }
        if (i18 != 6) {
            k17.a(this, i18);
        }
        c(k17);
        return k17;
    }

    public void e(u2.j jVar, int i17) {
        int i18 = jVar.f423847b;
        if (i18 == -1) {
            u2.b k17 = k();
            k17.f423817a = jVar;
            float f17 = i17;
            jVar.f423849d = f17;
            k17.f423818b = f17;
            k17.f423820d = true;
            c(k17);
            return;
        }
        u2.b bVar = this.f423829e[i18];
        if (bVar.f423820d) {
            bVar.f423818b = i17;
            return;
        }
        if (bVar.f423819c.f423807a == 0) {
            bVar.f423820d = true;
            bVar.f423818b = i17;
            return;
        }
        u2.b k18 = k();
        u2.a aVar = k18.f423819c;
        if (i17 < 0) {
            k18.f423818b = i17 * (-1);
            aVar.f(jVar, 1.0f);
        } else {
            k18.f423818b = i17;
            aVar.f(jVar, -1.0f);
        }
        c(k18);
    }

    public void f(u2.j jVar, u2.j jVar2, int i17, int i18) {
        u2.b k17 = k();
        u2.j l17 = l();
        l17.f423848c = 0;
        k17.b(jVar, jVar2, l17, i17);
        if (i18 != 6) {
            k17.f423819c.f(i(i18, null), (int) (r4.c(l17) * (-1.0f)));
        }
        c(k17);
    }

    public void g(u2.j jVar, u2.j jVar2, int i17, int i18) {
        u2.b k17 = k();
        u2.j l17 = l();
        l17.f423848c = 0;
        k17.c(jVar, jVar2, l17, i17);
        if (i18 != 6) {
            k17.f423819c.f(i(i18, null), (int) (r4.c(l17) * (-1.0f)));
        }
        c(k17);
    }

    public final void h(u2.b bVar) {
        u2.b[] bVarArr = this.f423829e;
        int i17 = this.f423833i;
        u2.b bVar2 = bVarArr[i17];
        if (bVar2 != null) {
            u2.h hVar = (u2.h) this.f423835k.f423821a;
            int i18 = hVar.f423840b;
            java.lang.Object[] objArr = hVar.f423839a;
            if (i18 < objArr.length) {
                objArr[i18] = bVar2;
                hVar.f423840b = i18 + 1;
            }
        }
        bVarArr[i17] = bVar;
        u2.j jVar = bVar.f423817a;
        jVar.f423847b = i17;
        this.f423833i = i17 + 1;
        jVar.d(bVar);
    }

    public u2.j i(int i17, java.lang.String str) {
        if (this.f423832h + 1 >= this.f423828d) {
            n();
        }
        u2.j a17 = a(u2.i.ERROR, str);
        int i18 = this.f423825a + 1;
        this.f423825a = i18;
        this.f423832h++;
        a17.f423846a = i18;
        a17.f423848c = i17;
        this.f423835k.f423823c[i18] = a17;
        ((u2.d) this.f423826b).e(a17);
        return a17;
    }

    public u2.j j(java.lang.Object obj) {
        u2.j jVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f423832h + 1 >= this.f423828d) {
            n();
        }
        if (obj instanceof v2.g) {
            v2.g gVar = (v2.g) obj;
            jVar = gVar.f432642i;
            u2.c cVar = this.f423835k;
            if (jVar == null) {
                gVar.e(cVar);
                jVar = gVar.f432642i;
            }
            int i17 = jVar.f423846a;
            if (i17 == -1 || i17 > this.f423825a || cVar.f423823c[i17] == null) {
                if (i17 != -1) {
                    jVar.c();
                }
                int i18 = this.f423825a + 1;
                this.f423825a = i18;
                this.f423832h++;
                jVar.f423846a = i18;
                jVar.f423851f = u2.i.UNRESTRICTED;
                cVar.f423823c[i18] = jVar;
            }
        }
        return jVar;
    }

    public u2.b k() {
        java.lang.Object obj;
        u2.c cVar = this.f423835k;
        u2.h hVar = (u2.h) cVar.f423821a;
        int i17 = hVar.f423840b;
        if (i17 > 0) {
            int i18 = i17 - 1;
            java.lang.Object[] objArr = hVar.f423839a;
            obj = objArr[i18];
            objArr[i18] = null;
            hVar.f423840b = i18;
        } else {
            obj = null;
        }
        u2.b bVar = (u2.b) obj;
        if (bVar == null) {
            return new u2.b(cVar);
        }
        bVar.f423817a = null;
        bVar.f423819c.b();
        bVar.f423818b = 0.0f;
        bVar.f423820d = false;
        return bVar;
    }

    public u2.j l() {
        if (this.f423832h + 1 >= this.f423828d) {
            n();
        }
        u2.j a17 = a(u2.i.SLACK, null);
        int i17 = this.f423825a + 1;
        this.f423825a = i17;
        this.f423832h++;
        a17.f423846a = i17;
        this.f423835k.f423823c[i17] = a17;
        return a17;
    }

    public int m(java.lang.Object obj) {
        u2.j jVar = ((v2.g) obj).f432642i;
        if (jVar != null) {
            return (int) (jVar.f423849d + 0.5f);
        }
        return 0;
    }

    public final void n() {
        int i17 = this.f423827c * 2;
        this.f423827c = i17;
        this.f423829e = (u2.b[]) java.util.Arrays.copyOf(this.f423829e, i17);
        u2.c cVar = this.f423835k;
        cVar.f423823c = (u2.j[]) java.util.Arrays.copyOf(cVar.f423823c, this.f423827c);
        int i18 = this.f423827c;
        this.f423831g = new boolean[i18];
        this.f423828d = i18;
        this.f423834j = i18;
    }

    public void o(u2.e eVar) {
        u2.i iVar;
        float f17;
        int i17;
        boolean z17;
        u2.c cVar;
        r((u2.b) eVar);
        int i18 = 0;
        while (true) {
            int i19 = this.f423833i;
            iVar = u2.i.UNRESTRICTED;
            f17 = 0.0f;
            i17 = 1;
            if (i18 >= i19) {
                z17 = false;
                break;
            }
            u2.b bVar = this.f423829e[i18];
            if (bVar.f423817a.f423851f != iVar && bVar.f423818b < 0.0f) {
                z17 = true;
                break;
            }
            i18++;
        }
        if (z17) {
            boolean z18 = false;
            int i27 = 0;
            while (!z18) {
                i27 += i17;
                float f18 = Float.MAX_VALUE;
                int i28 = 0;
                int i29 = -1;
                int i37 = -1;
                int i38 = 0;
                while (true) {
                    int i39 = this.f423833i;
                    cVar = this.f423835k;
                    if (i28 >= i39) {
                        break;
                    }
                    u2.b bVar2 = this.f423829e[i28];
                    if (bVar2.f423817a.f423851f != iVar && !bVar2.f423820d && bVar2.f423818b < f17) {
                        int i47 = 1;
                        while (i47 < this.f423832h) {
                            u2.j jVar = cVar.f423823c[i47];
                            float c17 = bVar2.f423819c.c(jVar);
                            boolean z19 = z18;
                            if (c17 > f17) {
                                for (int i48 = 0; i48 < 7; i48++) {
                                    float f19 = jVar.f423850e[i48] / c17;
                                    if ((f19 < f18 && i48 == i38) || i48 > i38) {
                                        f18 = f19;
                                        i38 = i48;
                                        i37 = i47;
                                        i29 = i28;
                                    }
                                }
                            }
                            i47++;
                            z18 = z19;
                            f17 = 0.0f;
                        }
                    }
                    i28++;
                    z18 = z18;
                    f17 = 0.0f;
                }
                boolean z27 = z18;
                if (i29 != -1) {
                    u2.b bVar3 = this.f423829e[i29];
                    bVar3.f423817a.f423847b = -1;
                    bVar3.d(cVar.f423823c[i37]);
                    u2.j jVar2 = bVar3.f423817a;
                    jVar2.f423847b = i29;
                    jVar2.d(bVar3);
                    z18 = z27;
                } else {
                    z18 = true;
                }
                if (i27 > this.f423832h / 2) {
                    z18 = true;
                }
                f17 = 0.0f;
                i17 = 1;
            }
        }
        p(eVar, false);
        for (int i49 = 0; i49 < this.f423833i; i49++) {
            u2.b bVar4 = this.f423829e[i49];
            bVar4.f423817a.f423849d = bVar4.f423818b;
        }
    }

    public final int p(u2.e eVar, boolean z17) {
        boolean z18;
        for (int i17 = 0; i17 < this.f423832h; i17++) {
            this.f423831g[i17] = false;
        }
        boolean z19 = false;
        int i18 = 0;
        while (!z19) {
            i18++;
            if (i18 >= this.f423832h * 2) {
                return i18;
            }
            if (((u2.b) eVar).f423817a != null) {
                this.f423831g[((u2.b) eVar).f423817a.f423846a] = true;
            }
            u2.j d17 = ((u2.b) eVar).f423819c.d(this.f423831g, null);
            if (d17 != null) {
                boolean[] zArr = this.f423831g;
                int i19 = d17.f423846a;
                if (zArr[i19]) {
                    return i18;
                }
                zArr[i19] = true;
            }
            if (d17 != null) {
                float f17 = Float.MAX_VALUE;
                int i27 = -1;
                for (int i28 = 0; i28 < this.f423833i; i28++) {
                    u2.b bVar = this.f423829e[i28];
                    if (bVar.f423817a.f423851f != u2.i.UNRESTRICTED && !bVar.f423820d) {
                        u2.a aVar = bVar.f423819c;
                        int i29 = aVar.f423814h;
                        if (i29 != -1) {
                            for (int i37 = 0; i29 != -1 && i37 < aVar.f423807a; i37++) {
                                if (aVar.f423811e[i29] == d17.f423846a) {
                                    z18 = true;
                                    break;
                                }
                                i29 = aVar.f423812f[i29];
                            }
                        }
                        z18 = false;
                        if (z18) {
                            float c17 = aVar.c(d17);
                            if (c17 < 0.0f) {
                                float f18 = (-bVar.f423818b) / c17;
                                if (f18 < f17) {
                                    i27 = i28;
                                    f17 = f18;
                                }
                            }
                        }
                    }
                }
                if (i27 > -1) {
                    u2.b bVar2 = this.f423829e[i27];
                    bVar2.f423817a.f423847b = -1;
                    bVar2.d(d17);
                    u2.j jVar = bVar2.f423817a;
                    jVar.f423847b = i27;
                    jVar.d(bVar2);
                }
            }
            z19 = true;
        }
        return i18;
    }

    public void q() {
        u2.c cVar;
        int i17 = 0;
        while (true) {
            cVar = this.f423835k;
            u2.j[] jVarArr = cVar.f423823c;
            if (i17 >= jVarArr.length) {
                break;
            }
            u2.j jVar = jVarArr[i17];
            if (jVar != null) {
                jVar.c();
            }
            i17++;
        }
        u2.g gVar = cVar.f423822b;
        u2.j[] jVarArr2 = this.f423836l;
        int i18 = this.f423837m;
        u2.h hVar = (u2.h) gVar;
        hVar.getClass();
        if (i18 > jVarArr2.length) {
            i18 = jVarArr2.length;
        }
        for (int i19 = 0; i19 < i18; i19++) {
            u2.j jVar2 = jVarArr2[i19];
            int i27 = hVar.f423840b;
            java.lang.Object[] objArr = hVar.f423839a;
            if (i27 < objArr.length) {
                objArr[i27] = jVar2;
                hVar.f423840b = i27 + 1;
            }
        }
        this.f423837m = 0;
        java.util.Arrays.fill(cVar.f423823c, (java.lang.Object) null);
        this.f423825a = 0;
        u2.b bVar = (u2.b) this.f423826b;
        bVar.f423819c.b();
        bVar.f423817a = null;
        bVar.f423818b = 0.0f;
        this.f423832h = 1;
        for (int i28 = 0; i28 < this.f423833i; i28++) {
            this.f423829e[i28].getClass();
        }
        int i29 = 0;
        while (true) {
            u2.b[] bVarArr = this.f423829e;
            if (i29 >= bVarArr.length) {
                this.f423833i = 0;
                return;
            }
            u2.b bVar2 = bVarArr[i29];
            if (bVar2 != null) {
                u2.h hVar2 = (u2.h) cVar.f423821a;
                int i37 = hVar2.f423840b;
                java.lang.Object[] objArr2 = hVar2.f423839a;
                if (i37 < objArr2.length) {
                    objArr2[i37] = bVar2;
                    hVar2.f423840b = i37 + 1;
                }
            }
            bVarArr[i29] = null;
            i29++;
        }
    }

    public final void r(u2.b bVar) {
        if (this.f423833i > 0) {
            u2.a aVar = bVar.f423819c;
            u2.b[] bVarArr = this.f423829e;
            int i17 = aVar.f423814h;
            loop0: while (true) {
                for (int i18 = 0; i17 != -1 && i18 < aVar.f423807a; i18++) {
                    u2.c cVar = aVar.f423809c;
                    u2.j jVar = cVar.f423823c[aVar.f423811e[i17]];
                    if (jVar.f423847b != -1) {
                        float f17 = aVar.f423813g[i17];
                        aVar.g(jVar, true);
                        u2.b bVar2 = bVarArr[jVar.f423847b];
                        if (!bVar2.f423820d) {
                            u2.a aVar2 = bVar2.f423819c;
                            int i19 = aVar2.f423814h;
                            for (int i27 = 0; i19 != -1 && i27 < aVar2.f423807a; i27++) {
                                aVar.a(cVar.f423823c[aVar2.f423811e[i19]], aVar2.f423813g[i19] * f17, true);
                                i19 = aVar2.f423812f[i19];
                            }
                        }
                        bVar.f423818b += bVar2.f423818b * f17;
                        bVar2.f423817a.b(bVar);
                        i17 = aVar.f423814h;
                    } else {
                        i17 = aVar.f423812f[i17];
                    }
                }
            }
            if (bVar.f423819c.f423807a == 0) {
                bVar.f423820d = true;
            }
        }
    }
}
