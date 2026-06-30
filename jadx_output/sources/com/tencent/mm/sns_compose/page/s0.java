package com.tencent.mm.sns_compose.page;

/* loaded from: classes14.dex */
public abstract class s0 {
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(java.lang.String r16, java.lang.String r17, z0.t r18, n0.o r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.sns_compose.page.s0.a(java.lang.String, java.lang.String, z0.t, n0.o, int, int):void");
    }

    public static final void b(java.lang.String url, z0.t tVar, n0.o oVar, int i17, int i18) {
        int i19;
        kotlin.jvm.internal.o.g(url, "url");
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(335027097);
        if ((i18 & 1) != 0) {
            i19 = i17 | 6;
        } else if ((i17 & 14) == 0) {
            i19 = (y0Var.e(url) ? 4 : 2) | i17;
        } else {
            i19 = i17;
        }
        int i27 = i18 & 2;
        if (i27 != 0) {
            i19 |= 48;
        } else if ((i17 & 112) == 0) {
            i19 |= y0Var.e(tVar) ? 32 : 16;
        }
        if ((i19 & 91) == 18 && y0Var.v()) {
            y0Var.O();
        } else {
            if (i27 != 0) {
                int i28 = z0.t.f468922q1;
                tVar = z0.p.f468921d;
            }
            java.lang.Object obj = n0.e1.f333492a;
            u5.s a17 = q85.d.a(url, y0Var, i19 & 14);
            int i29 = s1.p.f402054a;
            a0.q1.a(a17, "avatar", tVar, null, s1.o.f402044a, 0.0f, null, y0Var, ((i19 << 3) & ce1.h.CTRL_INDEX) | 24624, 104);
        }
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f333608d = new com.tencent.mm.sns_compose.page.k(url, tVar, i17, i18);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003c, code lost:
    
        if (r4 == n0.n.f333620a) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(r45.jj4 r15, z0.t r16, boolean r17, n0.o r18, int r19, int r20) {
        /*
            r1 = r15
            java.lang.String r0 = "media"
            kotlin.jvm.internal.o.g(r15, r0)
            r0 = r18
            n0.y0 r0 = (n0.y0) r0
            r2 = -1535759137(0xffffffffa4762cdf, float:-5.3380754E-17)
            r0.V(r2)
            r2 = r20 & 2
            if (r2 == 0) goto L1a
            int r2 = z0.t.f468922q1
            z0.p r2 = z0.p.f468921d
            r13 = r2
            goto L1c
        L1a:
            r13 = r16
        L1c:
            r2 = r20 & 4
            r3 = 0
            if (r2 == 0) goto L23
            r14 = r3
            goto L25
        L23:
            r14 = r17
        L25:
            java.lang.Object r2 = n0.e1.f333492a
            r2 = 571260271(0x220cbd6f, float:1.9073823E-18)
            r0.U(r2)
            boolean r2 = r0.e(r15)
            java.lang.Object r4 = r0.y()
            r5 = 0
            if (r2 != 0) goto L3e
            int r2 = n0.o.f333629a
            java.lang.Object r2 = n0.n.f333620a
            if (r4 != r2) goto L52
        L3e:
            r6 = 1
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 28
            r12 = 0
            e1.g0 r2 = e1.h0.a(r6, r7, r8, r9, r10, r11, r12)
            r4 = 2
            n0.v2 r4 = n0.s4.c(r2, r5, r4, r5)
            r0.g0(r4)
        L52:
            n0.v2 r4 = (n0.v2) r4
            r0.o(r3)
            com.tencent.mm.sns_compose.page.i r2 = new com.tencent.mm.sns_compose.page.i
            r2.<init>(r15, r14, r4, r5)
            r3 = 72
            n0.d2.f(r15, r2, r0, r3)
            java.lang.Object r2 = r4.getValue()
            e1.g0 r2 = (e1.g0) r2
            int r3 = s1.p.f402054a
            s1.p r6 = s1.o.f402044a
            java.lang.String r3 = "avatar"
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            int r4 = r19 << 3
            r4 = r4 & 896(0x380, float:1.256E-42)
            r11 = r4 | 24632(0x6038, float:3.4517E-41)
            r12 = 232(0xe8, float:3.25E-43)
            r4 = r13
            r10 = r0
            a0.q1.b(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            n0.f4 r6 = r0.q()
            if (r6 == 0) goto L95
            com.tencent.mm.sns_compose.page.j r7 = new com.tencent.mm.sns_compose.page.j
            r0 = r7
            r1 = r15
            r2 = r13
            r3 = r14
            r4 = r19
            r5 = r20
            r0.<init>(r1, r2, r3, r4, r5)
            n0.l3 r6 = (n0.l3) r6
            r6.f333608d = r7
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.sns_compose.page.s0.c(r45.jj4, z0.t, boolean, n0.o, int, int):void");
    }

    public static final void d(java.lang.String thumbUrl, boolean z17, yz5.a onClick, n0.o oVar, int i17) {
        int i18;
        kotlin.jvm.internal.o.g(thumbUrl, "thumbUrl");
        kotlin.jvm.internal.o.g(onClick, "onClick");
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(1881994434);
        if ((i17 & 14) == 0) {
            i18 = (y0Var.e(thumbUrl) ? 4 : 2) | i17;
        } else {
            i18 = i17;
        }
        if ((i17 & 112) == 0) {
            i18 |= y0Var.f(z17) ? 32 : 16;
        }
        if ((i17 & ce1.h.CTRL_INDEX) == 0) {
            i18 |= y0Var.e(onClick) ? 256 : 128;
        }
        if ((i18 & 731) == 146 && y0Var.v()) {
            y0Var.O();
        } else {
            java.lang.Object obj = n0.e1.f333492a;
            g(u0.j.b(y0Var, -2128693989, true, new com.tencent.mm.sns_compose.page.l(thumbUrl, onClick, z17)), y0Var, 6);
        }
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f333608d = new com.tencent.mm.sns_compose.page.m(thumbUrl, z17, onClick, i17);
        }
    }

    public static final void e(r45.jj4 jj4Var, boolean z17, yz5.a onClick, n0.o oVar, int i17) {
        kotlin.jvm.internal.o.g(onClick, "onClick");
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(984927840);
        java.lang.Object obj = n0.e1.f333492a;
        if (jj4Var == null) {
            n0.f4 q17 = y0Var.q();
            if (q17 != null) {
                ((n0.l3) q17).f333608d = new com.tencent.mm.sns_compose.page.n(jj4Var, z17, onClick, i17);
                return;
            }
            return;
        }
        g(u0.j.b(y0Var, -700982151, true, new com.tencent.mm.sns_compose.page.o(onClick, jj4Var, z17)), y0Var, 6);
        n0.f4 q18 = y0Var.q();
        if (q18 != null) {
            ((n0.l3) q18).f333608d = new com.tencent.mm.sns_compose.page.p(jj4Var, z17, onClick, i17);
        }
    }

    public static final void f(java.lang.String snsId, java.util.List mediaList, yz5.l imagePreviewCb, n0.o oVar, int i17) {
        kotlin.jvm.internal.o.g(snsId, "snsId");
        kotlin.jvm.internal.o.g(mediaList, "mediaList");
        kotlin.jvm.internal.o.g(imagePreviewCb, "imagePreviewCb");
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(-2040483500);
        java.lang.Object obj = n0.e1.f333492a;
        y0Var.U(773894976);
        y0Var.U(-492369756);
        java.lang.Object y17 = y0Var.y();
        int i18 = n0.o.f333629a;
        if (y17 == n0.n.f333620a) {
            n0.o1 o1Var = new n0.o1(n0.d2.i(oz5.m.f350329d, y0Var));
            y0Var.g0(o1Var);
            y17 = o1Var;
        }
        y0Var.o(false);
        ((n0.o1) y17).getClass();
        y0Var.o(false);
        g(u0.j.b(y0Var, 208307757, true, new com.tencent.mm.sns_compose.page.u(mediaList, snsId, imagePreviewCb)), y0Var, 6);
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f333608d = new com.tencent.mm.sns_compose.page.v(snsId, mediaList, imagePreviewCb, i17);
        }
    }

    public static final void g(yz5.q qVar, n0.o oVar, int i17) {
        int i18;
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(917588970);
        if ((i17 & 14) == 0) {
            i18 = (y0Var.e(qVar) ? 4 : 2) | i17;
        } else {
            i18 = i17;
        }
        if ((i18 & 11) == 2 && y0Var.v()) {
            y0Var.O();
        } else {
            java.lang.Object obj = n0.e1.f333492a;
            z0.p pVar = z0.p.f468921d;
            float f17 = 1 * 8;
            z0.t a17 = b1.d.a(d0.a3.g(pVar, i65.a.c(com.tencent.mm.sdk.platformtools.x2.f193071a, i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.aa9))), i0.h.a(f17));
            y0Var.U(733328855);
            s1.t0 c17 = d0.y.c(z0.a.f468889a, false, y0Var, 0);
            y0Var.U(-1323940314);
            p2.f fVar = (p2.f) y0Var.i(androidx.compose.ui.platform.m2.f10646e);
            p2.s sVar = (p2.s) y0Var.i(androidx.compose.ui.platform.m2.f10652k);
            androidx.compose.ui.platform.k4 k4Var = (androidx.compose.ui.platform.k4) y0Var.i(androidx.compose.ui.platform.m2.f10656o);
            u1.g.f423594i1.getClass();
            yz5.a aVar = u1.f.f423587b;
            yz5.q a18 = s1.g0.a(a17);
            if (!(y0Var.f333761b instanceof n0.e)) {
                n0.l.a();
                throw null;
            }
            y0Var.X();
            if (y0Var.L) {
                y0Var.j(aVar);
            } else {
                y0Var.i0();
            }
            y0Var.f333784y = false;
            n0.i5.a(y0Var, c17, u1.f.f423590e);
            n0.i5.a(y0Var, fVar, u1.f.f423589d);
            n0.i5.a(y0Var, sVar, u1.f.f423591f);
            n0.i5.a(y0Var, k4Var, u1.f.f423592g);
            y0Var.n();
            ((u0.i) a18).invoke(new n0.i4(y0Var), y0Var, 0);
            y0Var.U(2058660585);
            y0Var.U(-2137368960);
            java.lang.Object obj2 = d0.a0.f225063a;
            z0.t f18 = d0.a3.f(pVar, 0.0f, 1, null);
            kotlin.jvm.internal.o.g(f18, "<this>");
            z0.t border = f18.k(d0.a3.f225066b);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            long b17 = rz0.a.b(com.tencent.mm.R.color.FG_3, context);
            i0.g a19 = i0.h.a(f17);
            kotlin.jvm.internal.o.g(border, "$this$border");
            l0.a2.a(a0.j.b(border, (float) 0.5d, new e1.e1(b17, null), a19), null, 0L, 0L, null, 0.0f, com.tencent.mm.sns_compose.page.c.f193438b, y0Var, 1572864, 62);
            qVar.invoke(obj2, y0Var, java.lang.Integer.valueOf(((i18 << 3) & 112) | 6));
            y0Var.o(false);
            y0Var.o(false);
            y0Var.o(true);
            y0Var.o(false);
            y0Var.o(false);
        }
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f333608d = new com.tencent.mm.sns_compose.page.w(qVar, i17);
        }
    }

    public static final void h(r45.jj4 jj4Var, java.lang.String title, java.lang.String str, yz5.a onClick, n0.o oVar, int i17, int i18) {
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(onClick, "onClick");
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(1238230768);
        java.lang.String str2 = (i18 & 4) != 0 ? null : str;
        java.lang.Object obj = n0.e1.f333492a;
        if (jj4Var == null) {
            n0.f4 q17 = y0Var.q();
            if (q17 != null) {
                ((n0.l3) q17).f333608d = new com.tencent.mm.sns_compose.page.x(jj4Var, title, str2, onClick, i17, i18);
                return;
            }
            return;
        }
        int i19 = z0.t.f468922q1;
        z0.t d17 = a0.d0.d(b1.d.a(d0.a3.f(z0.p.f468921d, 0.0f, 1, null), i0.h.a(1 * 8)), false, null, null, onClick, 7, null);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        java.lang.String str3 = str2;
        l0.a2.a(d17, null, rz0.a.b(com.tencent.mm.R.color.f478489a, context), 0L, null, 0.0f, u0.j.b(y0Var, -137931724, true, new com.tencent.mm.sns_compose.page.y(jj4Var, title, str2)), y0Var, 1572864, 58);
        n0.f4 q18 = y0Var.q();
        if (q18 != null) {
            ((n0.l3) q18).f333608d = new com.tencent.mm.sns_compose.page.z(jj4Var, title, str3, onClick, i17, i18);
        }
    }

    public static final void i(java.lang.String text, yz5.a onClick, n0.o oVar, int i17) {
        int i18;
        n0.y0 y0Var;
        kotlin.jvm.internal.o.g(text, "text");
        kotlin.jvm.internal.o.g(onClick, "onClick");
        n0.y0 y0Var2 = (n0.y0) oVar;
        y0Var2.V(1309967799);
        if ((i17 & 14) == 0) {
            i18 = (y0Var2.e(text) ? 4 : 2) | i17;
        } else {
            i18 = i17;
        }
        if ((i17 & 112) == 0) {
            i18 |= y0Var2.e(onClick) ? 32 : 16;
        }
        if ((i18 & 91) == 18 && y0Var2.v()) {
            y0Var2.O();
            y0Var = y0Var2;
        } else {
            java.lang.Object obj = n0.e1.f333492a;
            int i19 = z0.t.f468922q1;
            z0.t d17 = a0.d0.d(b1.d.a(d0.a3.f(z0.p.f468921d, 0.0f, 1, null), i0.h.a(1 * 8)), false, null, null, onClick, 7, null);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            y0Var = y0Var2;
            l0.a2.a(d17, null, rz0.a.b(com.tencent.mm.R.color.f478489a, context), 0L, null, 0.0f, u0.j.b(y0Var2, 888256243, true, new com.tencent.mm.sns_compose.page.a0(text)), y0Var, 1572864, 58);
        }
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f333608d = new com.tencent.mm.sns_compose.page.b0(text, onClick, i17);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, yz5.a r29, n0.o r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.sns_compose.page.s0.j(java.lang.String, java.lang.String, java.lang.String, java.lang.String, yz5.a, n0.o, int, int):void");
    }

    public static final void k(n85.s item, com.tencent.mm.sdk.coroutines.LifecycleScope scope, yz5.a isPlay, yz5.a onClick, n0.o oVar, int i17) {
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(scope, "scope");
        kotlin.jvm.internal.o.g(isPlay, "isPlay");
        kotlin.jvm.internal.o.g(onClick, "onClick");
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(-1954122084);
        java.lang.Object obj = n0.e1.f333492a;
        y0Var.U(-258636785);
        java.lang.Object y17 = y0Var.y();
        java.lang.Object obj2 = n0.n.f333620a;
        if (y17 == obj2) {
            y17 = n0.s4.a(new com.tencent.mm.sns_compose.page.j0(isPlay));
            y0Var.g0(y17);
        }
        n0.e5 e5Var = (n0.e5) y17;
        y0Var.o(false);
        android.content.Context context = (android.content.Context) y0Var.i(androidx.compose.ui.platform.a1.f10503b);
        y0Var.U(-258636676);
        boolean e17 = y0Var.e(item);
        java.lang.Object y18 = y0Var.y();
        if (e17 || y18 == obj2) {
            q85.g gVar = new q85.g(context, item.f335724d, item.f335725e, item.f335720l, item.f335723c, scope);
            y0Var.g0(gVar);
            y18 = gVar;
        }
        q85.g gVar2 = (q85.g) y18;
        y0Var.o(false);
        androidx.lifecycle.y yVar = (androidx.lifecycle.y) y0Var.i(androidx.compose.ui.platform.a1.f10505d);
        n0.d2.c(yVar, new com.tencent.mm.sns_compose.page.f0(yVar, gVar2), y0Var, 8);
        n0.d2.f(java.lang.Boolean.valueOf(((java.lang.Boolean) e5Var.getValue()).booleanValue()), new com.tencent.mm.sns_compose.page.g0(gVar2, e5Var, null), y0Var, 64);
        g(u0.j.b(y0Var, 1208155125, true, new com.tencent.mm.sns_compose.page.h0(onClick, gVar2, e5Var)), y0Var, 6);
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f333608d = new com.tencent.mm.sns_compose.page.i0(item, scope, isPlay, onClick, i17);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void l(com.tencent.mm.sns_compose.page.p1 r18, e0.f1 r19, int r20, n85.t r21, androidx.paging.compose.e r22, com.tencent.mm.sdk.coroutines.LifecycleScope r23, n0.o r24, int r25) {
        /*
            Method dump skipped, instructions count: 569
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.sns_compose.page.s0.l(com.tencent.mm.sns_compose.page.p1, e0.f1, int, n85.t, androidx.paging.compose.e, com.tencent.mm.sdk.coroutines.LifecycleScope, n0.o, int):void");
    }

    public static final n85.e m(java.lang.String mediaId, androidx.paging.compose.e lazyDemoItem) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(lazyDemoItem, "lazyDemoItem");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
        kotlin.jvm.internal.f0 f0Var2 = new kotlin.jvm.internal.f0();
        kz5.x0 it = e06.p.m(0, lazyDemoItem.c()).iterator();
        while (((e06.j) it).f246214f) {
            n85.t tVar = (n85.t) ((g4.u0) ((n0.q4) lazyDemoItem.f11717b).getValue()).get(it.b());
            if (tVar instanceof n85.n) {
                n85.n nVar = (n85.n) tVar;
                java.util.Iterator it6 = nVar.f335713l.iterator();
                while (it6.hasNext()) {
                    n(mediaId, f0Var, f0Var2, arrayList, (r45.jj4) it6.next(), nVar.f335725e, nVar.f335723c);
                }
            } else if (tVar instanceof n85.s) {
                n85.s sVar = (n85.s) tVar;
                n(mediaId, f0Var, f0Var2, arrayList, sVar.f335720l, sVar.f335725e, sVar.f335723c);
            }
        }
        return new n85.e(arrayList, f0Var.f310116d);
    }

    public static final void n(java.lang.String str, kotlin.jvm.internal.f0 f0Var, kotlin.jvm.internal.f0 f0Var2, java.util.ArrayList arrayList, r45.jj4 jj4Var, int i17, int i18) {
        if (kotlin.jvm.internal.o.b(str, jj4Var.f377855d)) {
            f0Var.f310116d = f0Var2.f310116d;
        }
        r45.m33 m33Var = new r45.m33();
        m33Var.f380109d = jj4Var;
        m33Var.f380110e = "sns_table_" + i17;
        m33Var.f380111f = i18;
        int i19 = f0Var2.f310116d + 1;
        f0Var2.f310116d = i19;
        m33Var.f380112g = i19;
        arrayList.add(m33Var);
    }

    public static final void o(android.content.Context context, com.tencent.mm.sns_compose.page.p1 withTaViewModel, kotlinx.coroutines.y0 rememberScope, n85.t item) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(withTaViewModel, "withTaViewModel");
        kotlin.jvm.internal.o.g(rememberScope, "rememberScope");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(context);
        u1Var.g(context.getString(com.tencent.mm.R.string.jhq));
        u1Var.n(com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.jhv));
        u1Var.l(new com.tencent.mm.sns_compose.page.r0(context, rememberScope, item, withTaViewModel));
        u1Var.f211996a.f211821b.V = com.tencent.mm.sdk.platformtools.x2.a(com.tencent.mm.R.color.f478734fp);
        u1Var.j(com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.f490454vi));
        u1Var.q(false);
    }
}
