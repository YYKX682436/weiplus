package kz0;

/* loaded from: classes14.dex */
public abstract class k1 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f313767a = com.tencent.mm.ui.bl.h(com.tencent.mm.sdk.platformtools.x2.f193071a);

    public static final void a(boolean z17, int i17, yz5.p pVar, yz5.p pVar2, yz5.p pVar3, yz5.r rVar, n0.o oVar, int i18) {
        int i19;
        n0.y0 y0Var;
        n0.y0 y0Var2 = (n0.y0) oVar;
        y0Var2.V(182379130);
        if ((i18 & 14) == 0) {
            i19 = (y0Var2.f(z17) ? 4 : 2) | i18;
        } else {
            i19 = i18;
        }
        if ((i18 & 112) == 0) {
            i19 |= y0Var2.c(i17) ? 32 : 16;
        }
        if ((i18 & ce1.h.CTRL_INDEX) == 0) {
            i19 |= y0Var2.e(pVar) ? 256 : 128;
        }
        if ((i18 & 7168) == 0) {
            i19 |= y0Var2.e(pVar2) ? 2048 : 1024;
        }
        if ((57344 & i18) == 0) {
            i19 |= y0Var2.e(pVar3) ? 16384 : 8192;
        }
        if ((458752 & i18) == 0) {
            i19 |= y0Var2.e(rVar) ? 131072 : 65536;
        }
        if ((i19 & 374491) == 74898 && y0Var2.v()) {
            y0Var2.O();
            y0Var = y0Var2;
        } else {
            java.lang.Object obj = n0.e1.f333492a;
            float a17 = i65.a.a(com.tencent.mm.sdk.platformtools.x2.f193071a, i65.a.c(com.tencent.mm.sdk.platformtools.x2.f193071a, i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479718db)));
            y0Var2.U(-660025282);
            java.lang.Object y17 = y0Var2.y();
            int i27 = n0.o.f333629a;
            java.lang.Object obj2 = n0.n.f333620a;
            if (y17 == obj2) {
                y17 = n0.s4.c(0, null, 2, null);
                y0Var2.g0(y17);
            }
            n0.v2 v2Var = (n0.v2) y17;
            y0Var2.o(false);
            y0Var2.U(-660025229);
            boolean e17 = y0Var2.e(pVar) | y0Var2.e(pVar2) | y0Var2.e(v2Var) | y0Var2.c(i17) | y0Var2.b(a17) | y0Var2.e(rVar) | y0Var2.e(pVar3) | y0Var2.f(z17);
            java.lang.Object y18 = y0Var2.y();
            if (e17 || y18 == obj2) {
                y0Var = y0Var2;
                kz0.n nVar = new kz0.n(v2Var, i17, a17, rVar, pVar, pVar2, pVar3, z17);
                y0Var.g0(nVar);
                y18 = nVar;
            } else {
                y0Var = y0Var2;
            }
            y0Var.o(false);
            s1.f2.b(null, (yz5.p) y18, y0Var, 0, 1);
        }
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f333608d = new kz0.o(z17, i17, pVar, pVar2, pVar3, rVar, i18);
        }
    }

    public static final void b(boolean z17, android.view.TextureView textureView, n0.e5 videoRatio, n0.v2 bottomSheetShowState, float f17, yz5.a onNextClick, yz5.a onBackClick, yz5.l onBottomSheetStateUpdate, com.tencent.mm.mj_template.sns.compose.widget.m7 templateListState, com.tencent.mm.mj_template.sns.compose.widget.c1 moreTemplateBottomSheetState, ty0.b1 musicState, com.tencent.mm.mj_template.album_template.widget.MusicV2State musicV2State, com.tencent.mm.mj_template.sns.compose.widget.y clipSegmentState, yz5.a clipSegmentViewGetter, yz5.l lVar, com.tencent.mm.mj_template.sns.compose.widget.t0 t0Var, gz0.i previewMatrixCalculateData, yz5.l bottomSheetTotalExpandHeightGetter, kotlinx.coroutines.y0 scope, n0.o oVar, int i17, int i18) {
        float f18;
        yz5.l lVar2;
        n0.v2 v2Var;
        boolean z18;
        boolean z19;
        kotlin.jvm.internal.o.g(videoRatio, "videoRatio");
        kotlin.jvm.internal.o.g(bottomSheetShowState, "bottomSheetShowState");
        kotlin.jvm.internal.o.g(onNextClick, "onNextClick");
        kotlin.jvm.internal.o.g(onBackClick, "onBackClick");
        kotlin.jvm.internal.o.g(onBottomSheetStateUpdate, "onBottomSheetStateUpdate");
        kotlin.jvm.internal.o.g(templateListState, "templateListState");
        kotlin.jvm.internal.o.g(moreTemplateBottomSheetState, "moreTemplateBottomSheetState");
        kotlin.jvm.internal.o.g(musicState, "musicState");
        kotlin.jvm.internal.o.g(musicV2State, "musicV2State");
        kotlin.jvm.internal.o.g(clipSegmentState, "clipSegmentState");
        kotlin.jvm.internal.o.g(clipSegmentViewGetter, "clipSegmentViewGetter");
        kotlin.jvm.internal.o.g(previewMatrixCalculateData, "previewMatrixCalculateData");
        kotlin.jvm.internal.o.g(bottomSheetTotalExpandHeightGetter, "bottomSheetTotalExpandHeightGetter");
        kotlin.jvm.internal.o.g(scope, "scope");
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(1786446064);
        java.lang.Object obj = n0.e1.f333492a;
        y0Var.U(162401594);
        java.lang.Object y17 = y0Var.y();
        java.lang.Object obj2 = n0.n.f333620a;
        if (y17 == obj2) {
            y17 = n0.s4.c(kz0.a.f313643h, null, 2, null);
            y0Var.g0(y17);
        }
        n0.v2 v2Var2 = (n0.v2) y17;
        y0Var.o(false);
        y0Var.U(162401737);
        java.lang.Object y18 = y0Var.y();
        if (y18 == obj2) {
            y18 = n0.s4.c(java.lang.Boolean.FALSE, null, 2, null);
            y0Var.g0(y18);
        }
        n0.v2 v2Var3 = (n0.v2) y18;
        y0Var.o(false);
        y0Var.U(162401843);
        java.lang.Object y19 = y0Var.y();
        if (y19 == obj2) {
            y19 = n0.s4.c(java.lang.Integer.valueOf(com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).y), null, 2, null);
            y0Var.g0(y19);
        }
        n0.v2 v2Var4 = (n0.v2) y19;
        y0Var.o(false);
        y0Var.U(162401982);
        java.lang.Object y27 = y0Var.y();
        if (y27 == obj2) {
            y27 = n0.s4.a(new kz0.h1(v2Var4));
            y0Var.g0(y27);
        }
        n0.e5 e5Var = (n0.e5) y27;
        y0Var.o(false);
        previewMatrixCalculateData.f277676j = textureView;
        previewMatrixCalculateData.f277673g = ((java.lang.Number) videoRatio.getValue()).doubleValue();
        if (c(bottomSheetShowState)) {
            previewMatrixCalculateData.f277671e = ((java.lang.Number) bottomSheetTotalExpandHeightGetter.invoke((kz0.a) v2Var2.getValue())).intValue();
        }
        if (((kz0.a) v2Var2.getValue()).f313652g) {
            previewMatrixCalculateData.f277672f = ((java.lang.Number) e5Var.getValue()).intValue();
            if (previewMatrixCalculateData.f277674h > 0 && (previewMatrixCalculateData.f277669c > 0 || previewMatrixCalculateData.f277670d > 0)) {
                previewMatrixCalculateData.b();
            }
        }
        kz0.i1 i1Var = new kz0.i1(onBottomSheetStateUpdate, t0Var, bottomSheetShowState, v2Var2);
        androidx.compose.ui.platform.b4 a17 = androidx.compose.ui.platform.n3.f10666a.a(y0Var, 0);
        n0.d2.f(templateListState, new kz0.v(templateListState, moreTemplateBottomSheetState, clipSegmentState, onBottomSheetStateUpdate, v2Var2, bottomSheetShowState, i1Var, null), y0Var, 72);
        boolean z27 = c(bottomSheetShowState) && !((kz0.a) v2Var2.getValue()).f313650e;
        y0Var.U(162404573);
        boolean e17 = y0Var.e(i1Var);
        java.lang.Object y28 = y0Var.y();
        if (e17 || y28 == obj2) {
            y28 = new kz0.w(i1Var);
            y0Var.g0(y28);
        }
        y0Var.o(false);
        f.l.a(z27, (yz5.a) y28, y0Var, 0, 0);
        z0.p pVar = z0.p.f468921d;
        int i19 = e1.y.f246321l;
        z0.t c17 = a0.b.c(pVar, z17 ? e1.y.f246311b : e1.y.f246319j, null, 2, null);
        y0Var.U(733328855);
        s1.t0 c18 = d0.y.c(z0.a.f468889a, false, y0Var, 0);
        y0Var.U(-1323940314);
        p2.f fVar = (p2.f) y0Var.i(androidx.compose.ui.platform.m2.f10646e);
        p2.s sVar = (p2.s) y0Var.i(androidx.compose.ui.platform.m2.f10652k);
        androidx.compose.ui.platform.k4 k4Var = (androidx.compose.ui.platform.k4) y0Var.i(androidx.compose.ui.platform.m2.f10656o);
        u1.g.f423594i1.getClass();
        yz5.a aVar = u1.f.f423587b;
        yz5.q a18 = s1.g0.a(c17);
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
        n0.i5.a(y0Var, c18, u1.f.f423590e);
        n0.i5.a(y0Var, fVar, u1.f.f423589d);
        n0.i5.a(y0Var, sVar, u1.f.f423591f);
        n0.i5.a(y0Var, k4Var, u1.f.f423592g);
        y0Var.n();
        ((u0.i) a18).invoke(new n0.i4(y0Var), y0Var, 0);
        y0Var.U(2058660585);
        y0Var.U(-2137368960);
        a(z17, i65.a.a(com.tencent.mm.sdk.platformtools.x2.f193071a, f17), u0.j.b(y0Var, 1098183105, true, new kz0.k0(z17, bottomSheetShowState, onNextClick, onBackClick, musicState, templateListState)), u0.j.b(y0Var, -739299198, true, new kz0.s0(z17, templateListState, f17)), u0.j.b(y0Var, 1718185795, true, new kz0.v0(textureView)), new kz0.w0(previewMatrixCalculateData), y0Var, (i17 & 14) | 28032);
        boolean z28 = c(bottomSheetShowState) && !((kz0.a) v2Var2.getValue()).f313649d;
        y.y0 e18 = y.x0.e(z.q.d(300, 0, null, 6, null), kz0.x0.f313824d);
        y.a1 f19 = y.x0.f(z.q.d(300, 0, null, 6, null), kz0.y0.f313827d);
        y0Var.U(1658421130);
        java.lang.Object y29 = y0Var.y();
        if (y29 == obj2) {
            y29 = new c0.p();
            y0Var.g0(y29);
        }
        c0.o oVar2 = (c0.o) y29;
        y0Var.o(false);
        y0Var.U(1658421232);
        boolean e19 = y0Var.e(v2Var2) | y0Var.e(i1Var) | y0Var.e(a17);
        java.lang.Object y37 = y0Var.y();
        if (e19 || y37 == obj2) {
            y37 = new kz0.z0(i1Var, a17, v2Var2);
            y0Var.g0(y37);
        }
        y0Var.o(false);
        y.q.c(z28, a0.d0.c(pVar, oVar2, null, false, null, null, (yz5.a) y37, 28, null), e18, f19, null, u0.j.b(y0Var, 461316814, true, new kz0.f1(f17, scope, t0Var, i1Var, v2Var2, musicState, onBottomSheetStateUpdate, v2Var3, bottomSheetShowState)), y0Var, 200064, 16);
        y0Var.U(1658424384);
        if (((kz0.a) v2Var2.getValue()) == kz0.a.f313644i) {
            f18 = f17;
            i65.a.a(com.tencent.mm.sdk.platformtools.x2.f193071a, f18);
            boolean c19 = c(bottomSheetShowState);
            u0.a b17 = u0.j.b(y0Var, -716711342, true, new kz0.a0(moreTemplateBottomSheetState));
            y0Var.U(1658424963);
            lVar2 = bottomSheetTotalExpandHeightGetter;
            boolean e27 = y0Var.e(lVar2) | y0Var.e(v2Var2);
            java.lang.Object y38 = y0Var.y();
            if (e27 || y38 == obj2) {
                y38 = new kz0.b0(lVar2, v2Var2);
                y0Var.g0(y38);
            }
            yz5.a aVar2 = (yz5.a) y38;
            y0Var.o(false);
            kz0.c0 c0Var = kz0.c0.f313669d;
            y0Var.U(1658425130);
            int i27 = moreTemplateBottomSheetState.f69888s;
            boolean c27 = y0Var.c(i27);
            java.lang.Object y39 = y0Var.y();
            if (c27 || y39 == obj2) {
                y39 = new kz0.d0(i27);
                y0Var.g0(y39);
            }
            yz5.a aVar3 = (yz5.a) y39;
            y0Var.o(false);
            kz0.e0 e0Var = new kz0.e0(moreTemplateBottomSheetState, templateListState);
            kz0.f0 f0Var = new kz0.f0(moreTemplateBottomSheetState);
            y0Var.U(1658426199);
            v2Var = v2Var4;
            boolean e28 = y0Var.e(v2Var);
            java.lang.Object y47 = y0Var.y();
            if (e28 || y47 == obj2) {
                y47 = new kz0.g0(v2Var);
                y0Var.g0(y47);
            }
            y0Var.o(false);
            com.tencent.mm.mj_template.sns.compose.widget.p.a(f18, new com.tencent.mm.mj_template.sns.compose.widget.q(b17, aVar2, c0Var, aVar3, c19, 300, e0Var, f0Var, (yz5.l) y47, null, 512, null), y0Var, (i17 >> 12) & 14);
        } else {
            f18 = f17;
            lVar2 = bottomSheetTotalExpandHeightGetter;
            v2Var = v2Var4;
        }
        y0Var.o(false);
        y0Var.U(1658426351);
        if (((kz0.a) v2Var2.getValue()) == kz0.a.f313646n) {
            int i28 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).y;
            i65.a.a(com.tencent.mm.sdk.platformtools.x2.f193071a, f18);
            boolean c28 = c(bottomSheetShowState);
            u0.a b18 = u0.j.b(y0Var, 1117082825, true, new kz0.h0(clipSegmentState, clipSegmentViewGetter, lVar));
            y0Var.U(1658427138);
            boolean e29 = y0Var.e(lVar2) | y0Var.e(v2Var2);
            java.lang.Object y48 = y0Var.y();
            if (e29 || y48 == obj2) {
                y48 = new kz0.i0(lVar2, v2Var2);
                y0Var.g0(y48);
            }
            yz5.a aVar4 = (yz5.a) y48;
            y0Var.o(false);
            kz0.j0 j0Var = kz0.j0.f313755d;
            y0Var.U(1658427323);
            boolean c29 = y0Var.c(i28);
            java.lang.Object y49 = y0Var.y();
            if (c29 || y49 == obj2) {
                y49 = new kz0.m0(i28);
                y0Var.g0(y49);
            }
            yz5.a aVar5 = (yz5.a) y49;
            y0Var.o(false);
            kz0.n0 n0Var = new kz0.n0(clipSegmentState);
            kz0.o0 o0Var = new kz0.o0(clipSegmentState);
            y0Var.U(1658428271);
            boolean e37 = y0Var.e(v2Var);
            java.lang.Object y57 = y0Var.y();
            if (e37 || y57 == obj2) {
                y57 = new kz0.p0(v2Var);
                y0Var.g0(y57);
            }
            y0Var.o(false);
            z18 = true;
            com.tencent.mm.mj_template.sns.compose.widget.p.a(f18, new com.tencent.mm.mj_template.sns.compose.widget.q(b18, aVar4, j0Var, aVar5, c28, 300, n0Var, o0Var, (yz5.l) y57, null, 512, null), y0Var, (i17 >> 12) & 14);
        } else {
            z18 = true;
        }
        y0Var.o(false);
        y0Var.U(162413689);
        if (((kz0.a) v2Var2.getValue()) == kz0.a.f313647o) {
            z19 = z18;
            n0.d2.f(java.lang.Boolean.valueOf(c(bottomSheetShowState)), new kz0.r0(musicV2State, bottomSheetShowState, i1Var, null), y0Var, 64);
        } else {
            z19 = z18;
        }
        y0Var.o(false);
        y0Var.o(false);
        y0Var.o(false);
        y0Var.o(z19);
        y0Var.o(false);
        y0Var.o(false);
        java.lang.Object obj3 = n0.e1.f333492a;
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f333608d = new kz0.g1(z17, textureView, videoRatio, bottomSheetShowState, f17, onNextClick, onBackClick, onBottomSheetStateUpdate, templateListState, moreTemplateBottomSheetState, musicState, musicV2State, clipSegmentState, clipSegmentViewGetter, lVar, t0Var, previewMatrixCalculateData, bottomSheetTotalExpandHeightGetter, scope, i17, i18);
        }
    }

    public static final boolean c(n0.v2 v2Var) {
        return ((java.lang.Boolean) v2Var.getValue()).booleanValue();
    }

    public static final void d(com.tencent.mm.mj_template.sns.compose.widget.m7 m7Var, float f17, n0.o oVar, int i17) {
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(1876533774);
        java.lang.Object obj = n0.e1.f333492a;
        e0.f1 a17 = e0.h1.a(0, 0, y0Var, 0, 3);
        int i18 = z0.t.f468922q1;
        z0.p pVar = z0.p.f468921d;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        z0.t c17 = a0.b.c(pVar, rz0.a.b(com.tencent.mm.R.color.f478511t, context), null, 2, null);
        y0Var.U(-483455358);
        d0.l lVar = d0.p.f225186d;
        int i19 = z0.d.f468903a;
        s1.t0 a18 = d0.j0.a(lVar, z0.a.f468900l, y0Var, 0);
        y0Var.U(-1323940314);
        p2.f fVar = (p2.f) y0Var.i(androidx.compose.ui.platform.m2.f10646e);
        p2.s sVar = (p2.s) y0Var.i(androidx.compose.ui.platform.m2.f10652k);
        androidx.compose.ui.platform.k4 k4Var = (androidx.compose.ui.platform.k4) y0Var.i(androidx.compose.ui.platform.m2.f10656o);
        u1.g.f423594i1.getClass();
        yz5.a aVar = u1.f.f423587b;
        yz5.q a19 = s1.g0.a(c17);
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
        n0.i5.a(y0Var, a18, u1.f.f423590e);
        n0.i5.a(y0Var, fVar, u1.f.f423589d);
        n0.i5.a(y0Var, sVar, u1.f.f423591f);
        n0.i5.a(y0Var, k4Var, u1.f.f423592g);
        y0Var.n();
        ((u0.i) a19).invoke(new n0.i4(y0Var), y0Var, 0);
        y0Var.U(2058660585);
        y0Var.U(-1163856341);
        com.tencent.mm.mj_template.sns.compose.widget.a7.h(m7Var, a17, null, y0Var, 8, 4);
        d0.e3.a(d0.a3.g(pVar, ((float) 2.5d) * 8), y0Var, 6);
        d0.e3.a(d0.a3.g(pVar, f17), y0Var, 0);
        y0Var.o(false);
        y0Var.o(false);
        y0Var.o(true);
        y0Var.o(false);
        y0Var.o(false);
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f333608d = new kz0.p(m7Var, f17, i17);
        }
    }

    public static final kz0.a e(n0.v2 v2Var) {
        return (kz0.a) v2Var.getValue();
    }

    public static final void f(yz5.a aVar, yz5.a aVar2, yz5.p pVar, n0.o oVar, int i17) {
        int i18;
        yz5.p pVar2;
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(1405667406);
        if ((i17 & 14) == 0) {
            i18 = (y0Var.e(aVar) ? 4 : 2) | i17;
        } else {
            i18 = i17;
        }
        if ((i17 & 112) == 0) {
            i18 |= y0Var.e(aVar2) ? 32 : 16;
        }
        if ((i17 & ce1.h.CTRL_INDEX) == 0) {
            i18 |= y0Var.e(pVar) ? 256 : 128;
        }
        int i19 = i18;
        if ((i19 & 731) == 146 && y0Var.v()) {
            y0Var.O();
            pVar2 = pVar;
        } else {
            java.lang.Object obj = n0.e1.f333492a;
            int i27 = z0.t.f468922q1;
            z0.p pVar3 = z0.p.f468921d;
            z0.t f17 = d0.a3.f(pVar3, 0.0f, 1, null);
            e1.q qVar = e1.r.f246285a;
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            e1.y yVar = new e1.y(rz0.a.b(com.tencent.mm.R.color.BW_0_Alpha_0_5, context));
            android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            z0.t a17 = a0.b.a(f17, e1.q.a(qVar, kz5.c0.i(yVar, new e1.y(rz0.a.b(com.tencent.mm.R.color.a9e, context2))), 0.0f, 0.0f, 0, 14, null), null, 0.0f, 6, null);
            y0Var.U(733328855);
            int i28 = z0.d.f468903a;
            s1.t0 c17 = d0.y.c(z0.a.f468889a, false, y0Var, 0);
            y0Var.U(-1323940314);
            n0.h3 h3Var = androidx.compose.ui.platform.m2.f10646e;
            p2.f fVar = (p2.f) y0Var.i(h3Var);
            n0.h3 h3Var2 = androidx.compose.ui.platform.m2.f10652k;
            p2.s sVar = (p2.s) y0Var.i(h3Var2);
            n0.h3 h3Var3 = androidx.compose.ui.platform.m2.f10656o;
            androidx.compose.ui.platform.k4 k4Var = (androidx.compose.ui.platform.k4) y0Var.i(h3Var3);
            u1.g.f423594i1.getClass();
            yz5.a aVar3 = u1.f.f423587b;
            yz5.q a18 = s1.g0.a(a17);
            boolean z17 = y0Var.f333761b instanceof n0.e;
            if (!z17) {
                n0.l.a();
                throw null;
            }
            y0Var.X();
            if (y0Var.L) {
                y0Var.j(aVar3);
            } else {
                y0Var.i0();
            }
            y0Var.f333784y = false;
            yz5.p pVar4 = u1.f.f423590e;
            n0.i5.a(y0Var, c17, pVar4);
            yz5.p pVar5 = u1.f.f423589d;
            n0.i5.a(y0Var, fVar, pVar5);
            yz5.p pVar6 = u1.f.f423591f;
            n0.i5.a(y0Var, sVar, pVar6);
            yz5.p pVar7 = u1.f.f423592g;
            n0.i5.a(y0Var, k4Var, pVar7);
            y0Var.n();
            ((u0.i) a18).invoke(new n0.i4(y0Var), y0Var, 0);
            y0Var.U(2058660585);
            y0Var.U(-2137368960);
            z0.c cVar = z0.a.f468899k;
            float f18 = 8;
            z0.t j17 = d0.a2.j(d0.a2.h(d0.a3.f(pVar3, 0.0f, 1, null), 2 * f18, 0.0f, 2, null), 0.0f, 34, 0.0f, 0.0f, 13, null);
            y0Var.U(693286680);
            s1.t0 a19 = d0.n2.a(d0.p.f225184b, cVar, y0Var, 48);
            y0Var.U(-1323940314);
            p2.f fVar2 = (p2.f) y0Var.i(h3Var);
            p2.s sVar2 = (p2.s) y0Var.i(h3Var2);
            androidx.compose.ui.platform.k4 k4Var2 = (androidx.compose.ui.platform.k4) y0Var.i(h3Var3);
            yz5.q a27 = s1.g0.a(j17);
            if (!z17) {
                n0.l.a();
                throw null;
            }
            y0Var.X();
            if (y0Var.L) {
                y0Var.j(aVar3);
            } else {
                y0Var.i0();
            }
            y0Var.f333784y = false;
            n0.i5.a(y0Var, a19, pVar4);
            n0.i5.a(y0Var, fVar2, pVar5);
            n0.i5.a(y0Var, sVar2, pVar6);
            n0.i5.a(y0Var, k4Var2, pVar7);
            y0Var.n();
            ((u0.i) a27).invoke(new n0.i4(y0Var), y0Var, 0);
            y0Var.U(2058660585);
            y0Var.U(-678309503);
            d0.q2 q2Var = d0.q2.f225198a;
            a0.q1.a(rz0.a.a(com.tencent.mm.R.raw.icons_filled_previous2, e1.y.f246315f, y0Var, 48), com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.f490012ig), a0.d0.d(d0.a2.h(d0.a3.j(d0.a3.g(pVar3, 4 * f18), 6 * f18), 1 * f18, 0.0f, 2, null), false, com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.f490012ig), null, aVar2, 5, null), null, null, 0.0f, null, y0Var, 8, 120);
            d0.e3.a(d0.o2.a(q2Var, pVar3, 1.0f, false, 2, null), y0Var, 0);
            java.lang.Integer valueOf = java.lang.Integer.valueOf((i19 >> 6) & 14);
            pVar2 = pVar;
            pVar2.invoke(y0Var, valueOf);
            d0.e3.a(d0.o2.a(q2Var, pVar3, 1.0f, false, 2, null), y0Var, 0);
            tz0.f fVar3 = tz0.f.f423181e;
            java.lang.String g17 = com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.f490441v5);
            kotlin.jvm.internal.o.f(g17, "<get-str>(...)");
            tz0.c.a(aVar, null, fVar3, null, false, g17, null, y0Var, (i19 & 14) | 0, 90);
            y0Var.o(false);
            y0Var.o(false);
            y0Var.o(true);
            y0Var.o(false);
            y0Var.o(false);
            y0Var.o(false);
            y0Var.o(false);
            y0Var.o(true);
            y0Var.o(false);
            y0Var.o(false);
        }
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f333608d = new kz0.j1(aVar, aVar2, pVar2, i17);
        }
    }
}
