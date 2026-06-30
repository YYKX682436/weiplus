package r72;

/* loaded from: classes16.dex */
public abstract class e {
    public static final r45.gp0 a(r72.d dataItem) {
        java.lang.Integer h17;
        java.lang.Integer h18;
        r72.g j17;
        kotlin.jvm.internal.o.g(dataItem, "dataItem");
        r45.gp0 gp0Var = new r45.gp0();
        gp0Var.h0(dataItem.P());
        gp0Var.F1 = dataItem.L();
        gp0Var.G1 = true;
        gp0Var.e0(dataItem.A());
        gp0Var.t0(dataItem.Z());
        gp0Var.j0(dataItem.q());
        gp0Var.g0(dataItem.F());
        gp0Var.i0(dataItem.z());
        gp0Var.O0(dataItem.N());
        gp0Var.m0(dataItem.t());
        gp0Var.d0(dataItem.p());
        gp0Var.f375424o = dataItem.getThumbWidth();
        gp0Var.f375426p = true;
        gp0Var.f375430q = dataItem.q0();
        gp0Var.f375432r = true;
        gp0Var.b0(dataItem.l());
        gp0Var.a0(dataItem.k());
        gp0Var.c0(dataItem.o());
        gp0Var.f375442w = dataItem.n();
        gp0Var.f375444x = true;
        gp0Var.n0(dataItem.R());
        gp0Var.K0(dataItem.p0());
        gp0Var.D0(dataItem.f0());
        gp0Var.J0(dataItem.m0());
        gp0Var.E0(dataItem.g0());
        gp0Var.I0(dataItem.l0());
        gp0Var.o0(dataItem.u());
        gp0Var.p0(dataItem.W());
        gp0Var.r0(dataItem.Y());
        gp0Var.q0(dataItem.V());
        gp0Var.N0(dataItem.t0());
        gp0Var.r0(dataItem.Y());
        gp0Var.M0(dataItem.v0());
        gp0Var.L0(dataItem.u0());
        gp0Var.T0(dataItem.o0());
        gp0Var.H1 = dataItem.K();
        gp0Var.I1 = true;
        gp0Var.k0(dataItem.H());
        gp0Var.l0(dataItem.J());
        gp0Var.Z(dataItem.j());
        gp0Var.H0(dataItem.k0());
        r72.h e07 = dataItem.e0();
        if (e07 != null && (j17 = e07.j()) != null) {
            gp0Var.C0(j17.toXml());
            o72.t4 t4Var = (o72.t4) i95.n0.c(o72.t4.class);
            java.lang.String str = gp0Var.Z1;
            kotlin.jvm.internal.o.f(str, "getRecordInfo(...)");
            gp0Var.f375451y2 = ((com.tencent.mm.pluginsdk.model.v1) t4Var).Ai(str);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(dataItem.i0())) {
            gp0Var.A0(dataItem.i0());
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(dataItem.j0())) {
            gp0Var.B0(dataItem.j0());
        }
        gp0Var.f375454z2 = dataItem.c0();
        gp0Var.A2 = true;
        gp0Var.B2 = dataItem.d0();
        gp0Var.C2 = true;
        gp0Var.u0(dataItem.z0());
        gp0Var.w0(dataItem.a0());
        gp0Var.v0(dataItem.U());
        gp0Var.f375417k2 = dataItem.h0();
        gp0Var.f375419l2 = true;
        gp0Var.f375443w2 = dataItem.getFileType();
        gp0Var.f375447x2 = true;
        gp0Var.f375439u2 = dataItem.r0();
        gp0Var.f375441v2 = true;
        r72.h0 n07 = dataItem.n0();
        if (n07 != null) {
            r45.jp0 jp0Var = new r45.jp0();
            jp0Var.f377998d = n07.o();
            jp0Var.f377999e = n07.n();
            jp0Var.f378002h = n07.l();
            jp0Var.f378000f = n07.q();
            jp0Var.f378001g = n07.p();
            jp0Var.f378004m = n07.j();
            jp0Var.f378005n = n07.k();
            gp0Var.O1 = jp0Var;
        }
        gp0Var.J1 = new r45.hp0();
        r72.i G = dataItem.G();
        if (G != null) {
            r45.hp0 hp0Var = gp0Var.J1;
            r45.ip0 ip0Var = new r45.ip0();
            ip0Var.l(G.getSourceType());
            ip0Var.f377235m = G.getSourceId();
            ip0Var.f377236n = true;
            ip0Var.i(G.l());
            ip0Var.n(G.p());
            ip0Var.k(G.o());
            ip0Var.f377241s = G.getMsgId();
            ip0Var.f377242t = true;
            ip0Var.f377243u = G.k();
            ip0Var.f377244v = true;
            ip0Var.f(G.getAppId());
            ip0Var.j(G.getLink());
            ip0Var.g(G.j());
            ip0Var.D = G.n();
            ip0Var.E = true;
            hp0Var.f376353d = ip0Var;
        }
        r72.f B = dataItem.B();
        if (B != null) {
            r45.hp0 hp0Var2 = gp0Var.J1;
            r45.pp0 pp0Var = new r45.pp0();
            pp0Var.t(B.l());
            pp0Var.u(B.n());
            pp0Var.w(B.o());
            pp0Var.E(B.t());
            pp0Var.C(B.getPoiName());
            pp0Var.B(B.getPoiId());
            pp0Var.y(B.q());
            pp0Var.x(B.p());
            pp0Var.z(B.r());
            pp0Var.A(B.s());
            pp0Var.s(B.u() == 1);
            pp0Var.q(B.j());
            pp0Var.r(B.k());
            hp0Var2.f376354e = pp0Var;
        }
        r72.m0 Q = dataItem.Q();
        if (Q != null) {
            jz5.l a17 = r72.n0.a(Q);
            r45.hp0 hp0Var3 = gp0Var.J1;
            hp0Var3.f376355f = (r45.tq0) a17.f302833d;
            hp0Var3.f376369w = (r45.qp0) a17.f302834e;
        }
        r72.d0 E = dataItem.E();
        if (E != null) {
            r45.hp0 hp0Var4 = gp0Var.J1;
            r45.aq0 aq0Var = new r45.aq0();
            aq0Var.i(E.getType());
            aq0Var.g(E.n());
            aq0Var.d(E.j());
            aq0Var.f(E.l());
            aq0Var.e(E.k());
            hp0Var4.f376356g = aq0Var;
        }
        r72.k0 O = dataItem.O();
        if (O != null) {
            gp0Var.J1.f376357h = r72.l0.a(O);
        }
        r72.b0 C = dataItem.C();
        if (C != null) {
            r45.hp0 hp0Var5 = gp0Var.J1;
            r45.sp0 sp0Var = new r45.sp0();
            sp0Var.f385892e = C.k();
            sp0Var.f385891d = C.j();
            hp0Var5.f376367u = sp0Var;
        }
        r72.a r17 = dataItem.r();
        if (r17 != null) {
            gp0Var.J1.f376368v = r72.b.a(r17);
        }
        r72.a0 b07 = dataItem.b0();
        if (b07 != null) {
            r45.hp0 hp0Var6 = gp0Var.J1;
            r72.j0 x07 = dataItem.x0();
            r45.xs4 xs4Var = new r45.xs4();
            xs4Var.set(0, b07.x());
            xs4Var.set(1, b07.w());
            xs4Var.set(2, b07.t());
            xs4Var.set(3, b07.u());
            xs4Var.set(4, b07.y());
            xs4Var.set(5, b07.j());
            xs4Var.set(6, b07.l());
            xs4Var.set(7, b07.r());
            xs4Var.set(8, java.lang.Long.valueOf(b07.o()));
            xs4Var.set(9, b07.n());
            xs4Var.set(10, java.lang.Integer.valueOf(b07.q()));
            xs4Var.set(11, b07.p());
            xs4Var.set(12, b07.s());
            xs4Var.set(17, b07.k());
            if (x07 != null) {
                xs4Var.set(18, java.lang.Integer.valueOf(x07.k()));
                xs4Var.set(19, x07.j());
                xs4Var.set(20, x07.getListenId());
            }
            hp0Var6.C = xs4Var;
        }
        r72.i0 w07 = dataItem.w0();
        if (w07 != null) {
            r45.hp0 hp0Var7 = gp0Var.J1;
            r45.km6 km6Var = new r45.km6();
            km6Var.f378838d = w07.getType();
            km6Var.f378840f = w07.j();
            km6Var.f378839e = w07.k();
            hp0Var7.G = km6Var;
        }
        x05.j T = dataItem.T();
        if (T != null) {
            gp0Var.J1.f376371y = o72.s3.a(T);
        }
        r72.m S = dataItem.S();
        if (S != null) {
            gp0Var.J1.f376352J = r72.n.a(S);
        }
        r72.c s17 = dataItem.s();
        if (s17 != null) {
            r45.hp0 hp0Var8 = gp0Var.J1;
            r45.qp0 qp0Var = new r45.qp0();
            qp0Var.f384168m = s17.p();
            qp0Var.f384175t = s17.r();
            qp0Var.f384174s = s17.l();
            qp0Var.f384169n = s17.o();
            qp0Var.f384170o = s17.n();
            qp0Var.f384173r = s17.j();
            qp0Var.f384164f = s17.s();
            qp0Var.f384165g = s17.q();
            qp0Var.f384167i = s17.k();
            hp0Var8.f376370x = qp0Var;
        }
        r72.r x17 = dataItem.x();
        if (x17 != null) {
            r45.hp0 hp0Var9 = gp0Var.J1;
            r45.g92 g92Var = new r45.g92();
            g92Var.set(0, x17.z());
            g92Var.set(1, x17.getFinderUsername());
            g92Var.set(2, x17.B());
            g92Var.set(3, x17.getNickname());
            g92Var.set(4, x17.r());
            r72.s J2 = x17.J();
            g92Var.set(5, J2 != null ? J2.getCoverUrl() : null);
            r72.s J3 = x17.J();
            g92Var.set(7, java.lang.Float.valueOf(J3 != null ? J3.getHeight() : 0.0f));
            r72.s J4 = x17.J();
            g92Var.set(6, java.lang.Float.valueOf(J4 != null ? J4.getWidth() : 0.0f));
            g92Var.set(11, x17.getHeadUrl());
            g92Var.set(12, x17.A());
            g92Var.set(13, java.lang.Integer.valueOf(x17.getLiveStatus()));
            g92Var.set(15, java.lang.Integer.valueOf(x17.getSourceType()));
            java.lang.String H = x17.H();
            int intValue = (H == null || (h18 = r26.h0.h(H)) == null) ? 0 : h18.intValue();
            if (g92Var.getInteger(15) == 0 && intValue != 0) {
                g92Var.set(15, java.lang.Integer.valueOf(intValue));
            }
            g92Var.set(18, java.lang.Integer.valueOf(x17.getAuthIconType()));
            java.lang.String j18 = x17.j();
            int intValue2 = (j18 == null || (h17 = r26.h0.h(j18)) == null) ? 0 : h17.intValue();
            if (g92Var.getInteger(18) == 0 && intValue2 != 0) {
                g92Var.set(18, java.lang.Integer.valueOf(intValue2));
            }
            g92Var.set(17, x17.getAuthIconUrl());
            g92Var.set(19, java.lang.Integer.valueOf(x17.k()));
            g92Var.set(20, x17.getBizUsername());
            g92Var.set(21, x17.getBizNickname());
            g92Var.set(22, java.lang.Integer.valueOf(x17.n()));
            g92Var.set(25, x17.G());
            g92Var.set(26, x17.I());
            g92Var.set(27, x17.l());
            g92Var.set(28, x17.L());
            g92Var.set(29, x17.x());
            g92Var.set(30, x17.u());
            g92Var.set(31, x17.w());
            g92Var.set(32, x17.K());
            g92Var.set(33, x17.y());
            g92Var.set(34, x17.P());
            g92Var.set(35, java.lang.Integer.valueOf(x17.q()));
            g92Var.set(36, x17.p());
            g92Var.set(38, java.lang.Integer.valueOf(x17.F()));
            g92Var.set(39, java.lang.Integer.valueOf(x17.N()));
            g92Var.set(40, x17.Q());
            g92Var.set(41, x17.E());
            g92Var.set(42, x17.t());
            g92Var.set(44, java.lang.Integer.valueOf(x17.O()));
            if (g92Var.getInteger(13) != 1 && g92Var.getInteger(13) != 2) {
                g92Var.set(13, 1);
            }
            g92Var.set(14, java.lang.Integer.valueOf(x17.getExtFlag()));
            g92Var.set(16, x17.s());
            r45.xz3 xz3Var = new r45.xz3();
            r72.q C2 = x17.C();
            xz3Var.set(0, C2 != null ? C2.j() : null);
            r72.q C3 = x17.C();
            xz3Var.set(1, C3 != null ? C3.k() : null);
            g92Var.set(43, xz3Var);
            r72.p o17 = x17.o();
            if (o17 != null && (!o17.j().isEmpty())) {
                r45.d50 d50Var = new r45.d50();
                d50Var.set(0, o17.getAvatarUrl());
                java.util.LinkedList linkedList = new java.util.LinkedList();
                for (r72.o oVar : o17.j()) {
                    com.tencent.mm.protocal.protobuf.FinderContact finderContact = new com.tencent.mm.protocal.protobuf.FinderContact();
                    finderContact.setNickname(oVar.getNickname());
                    finderContact.setUsername(oVar.getUsername());
                    linkedList.add(finderContact);
                }
                d50Var.set(1, linkedList);
                g92Var.set(46, d50Var);
            }
            hp0Var9.f376372z = g92Var;
        }
        r72.u w17 = dataItem.w();
        if (w17 != null) {
            gp0Var.J1.E = r72.v.a(w17);
        }
        r72.u y17 = dataItem.y();
        if (y17 != null) {
            gp0Var.J1.D = r72.v.a(y17);
        }
        java.lang.String I = dataItem.I();
        if (I != null) {
            gp0Var.G0(I);
        }
        return gp0Var;
    }

    public static final r72.d b(r45.gp0 originDataItem) {
        java.lang.String str;
        r72.q qVar;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        r72.m0 Q;
        r72.m0 Q2;
        java.lang.String str5;
        r45.hp0 hp0Var;
        r45.tq0 tq0Var;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.String str9;
        java.lang.String str10;
        java.lang.String str11;
        java.lang.String str12;
        java.lang.String str13;
        java.lang.String str14;
        java.lang.String str15;
        java.lang.String str16;
        java.lang.String str17;
        java.lang.String str18;
        java.lang.String str19;
        java.lang.String str20;
        java.lang.String str21;
        java.lang.String str22;
        java.lang.String str23;
        java.lang.String str24;
        java.lang.String str25;
        java.lang.String str26;
        kotlin.jvm.internal.o.g(originDataItem, "originDataItem");
        r72.d dVar = new r72.d();
        if (originDataItem.f375400J) {
            dVar.c1(originDataItem.I);
        }
        if (originDataItem.G1) {
            dVar.Z0(originDataItem.F1);
        }
        if (originDataItem.U && (str26 = originDataItem.T) != null) {
            dVar.P0(str26);
        }
        if (originDataItem.Q1 && (str25 = originDataItem.P1) != null) {
            dVar.n1(str25);
        }
        if (originDataItem.Y1) {
            dVar.G0(originDataItem.X1);
        }
        if (originDataItem.f375450y1 && (str24 = originDataItem.f375446x1) != null) {
            dVar.T0(str24);
        }
        if (originDataItem.L && (str23 = originDataItem.K) != null) {
            dVar.O0(str23);
        }
        if (originDataItem.f375406e && (str22 = originDataItem.f375404d) != null) {
            dVar.a1(str22);
        }
        if (originDataItem.f375410g && (str21 = originDataItem.f375408f) != null) {
            dVar.J0(str21);
        }
        if (originDataItem.f375414i && (str20 = originDataItem.f375412h) != null) {
            dVar.F0(str20);
        }
        if (originDataItem.f375426p) {
            dVar.J1(originDataItem.f375424o);
        }
        if (originDataItem.f375432r) {
            dVar.E1(originDataItem.f375430q);
        }
        if (originDataItem.f375436t && (str19 = originDataItem.f375434s) != null) {
            dVar.C0(str19);
        }
        if (originDataItem.f375440v && (str18 = originDataItem.f375438u) != null) {
            dVar.B0(str18);
        }
        if (originDataItem.f375414i && (str17 = originDataItem.f375412h) != null) {
            dVar.F0(str17);
        }
        if (originDataItem.f375422n && (str16 = originDataItem.f375420m) != null) {
            dVar.E0(str16);
        }
        if (originDataItem.f375444x) {
            dVar.D0(originDataItem.f375442w);
        }
        if (originDataItem.f375452z) {
            dVar.e1(originDataItem.f375448y);
        }
        if (originDataItem.B && (str15 = originDataItem.A) != null) {
            dVar.D1(str15);
        }
        if (originDataItem.f375423n2 && (str14 = originDataItem.f375421m2) != null) {
            dVar.t1(str14);
        }
        if (originDataItem.f375429p2 && (str13 = originDataItem.f375425o2) != null) {
            dVar.u1(str13);
        }
        if (originDataItem.D && (str12 = originDataItem.C) != null) {
            dVar.z1(str12);
        }
        if (originDataItem.F && (str11 = originDataItem.E) != null) {
            dVar.A1(str11);
        }
        if (originDataItem.H && (str10 = originDataItem.G) != null) {
            dVar.K0(str10);
        }
        if (originDataItem.N && (str9 = originDataItem.M) != null) {
            dVar.k1(str9);
        }
        if (originDataItem.Q && (str8 = originDataItem.P) != null) {
            dVar.l1(str8);
        }
        if (originDataItem.S) {
            dVar.j1(originDataItem.R);
        }
        if (originDataItem.f375427p0 && (str7 = originDataItem.Z) != null) {
            dVar.G1(str7);
        }
        if (originDataItem.f375449y0 && (str6 = originDataItem.f375445x0) != null) {
            dVar.I1(str6);
        }
        if (originDataItem.f375428p1) {
            dVar.H1(originDataItem.f375418l1);
        }
        if (originDataItem.A1) {
            dVar.C1(originDataItem.f375453z1);
        }
        if (originDataItem.I1) {
            dVar.Y0(originDataItem.H1);
        }
        if (originDataItem.L1) {
            dVar.V0(originDataItem.K1);
        }
        if (originDataItem.N1) {
            dVar.X0(originDataItem.M1);
        }
        if (originDataItem.U1 && originDataItem.T1 != null && ((hp0Var = originDataItem.J1) == null || (tq0Var = hp0Var.f376355f) == null || tq0Var.computeSize() == 0)) {
            dVar.A0(originDataItem.T1);
        }
        if (originDataItem.S1 && (str5 = originDataItem.R1) != null) {
            dVar.y1(str5);
        }
        if (originDataItem.f375401a2 && originDataItem.Z1 != null) {
            r72.g gVar = new r72.g();
            java.lang.String str27 = originDataItem.Z1;
            kotlin.jvm.internal.o.f(str27, "getRecordInfo(...)");
            if (dVar.P() != 35) {
                str27 = r26.i0.t(r26.i0.t(r26.i0.t(r26.i0.t(r26.i0.t(r26.i0.t(r26.i0.t(r26.i0.t(r26.i0.t(r26.i0.t(r26.i0.t(r26.i0.t(str27, "cdndataurl", "cdn_dataurl", false), "cdndatakey", "cdn_datakey", false), "cdnthumburl", "cdn_thumburl", false), "cdnthumbkey", "cdn_thumbkey", false), "datasize", "fullsize", false), "thumbsize", "thumbfullsize", false), "sourcename", "datasrcname", false), "sourcetime", "datasrctime", false), "streamlowbandurl", "stream_lowbandurl", false), "streamdataurl", "stream_dataurl", false), "streamweburl", "stream_weburl", false), "sourceheadurl", "datasrcheadurl", false);
            }
            gVar.fromXml(str27);
            r72.h hVar = new r72.h();
            hVar.k(gVar);
            dVar.s1(hVar);
            for (r72.d dVar2 : gVar.j()) {
                if (dVar2.Q() != null) {
                    r72.m0 Q3 = dVar2.Q();
                    if (com.tencent.mm.sdk.platformtools.t8.K0(Q3 != null ? Q3.w() : null)) {
                        r72.m0 Q4 = dVar2.Q();
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(Q4 != null ? Q4.x() : null) && (Q2 = dVar2.Q()) != null) {
                            r72.m0 Q5 = dVar2.Q();
                            Q2.K(Q5 != null ? Q5.x() : null);
                        }
                    }
                    r72.m0 Q6 = dVar2.Q();
                    if (com.tencent.mm.sdk.platformtools.t8.K0(Q6 != null ? Q6.t() : null)) {
                        r72.m0 Q7 = dVar2.Q();
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(Q7 != null ? Q7.o() : null) && (Q = dVar2.Q()) != null) {
                            r72.m0 Q8 = dVar2.Q();
                            Q.I(Q8 != null ? Q8.o() : null);
                        }
                    }
                }
            }
        }
        if (originDataItem.f375433r2 && (str4 = originDataItem.f375431q2) != null) {
            dVar.o1(str4);
        }
        if (originDataItem.f375437t2) {
            dVar.i1(originDataItem.f375435s2);
        }
        if (originDataItem.f375419l2) {
            dVar.v1(originDataItem.f375417k2);
        }
        if (originDataItem.f375447x2) {
            dVar.f1(originDataItem.f375443w2);
        }
        if (originDataItem.f375441v2) {
            dVar.F1(originDataItem.f375439u2);
        }
        if (originDataItem.W && (str3 = originDataItem.V) != null) {
            dVar.w1(str3);
        }
        if (originDataItem.Y && (str2 = originDataItem.X) != null) {
            dVar.x1(str2);
        }
        if (originDataItem.A2) {
            dVar.q1(originDataItem.f375454z2);
        }
        if (originDataItem.C2) {
            dVar.r1(originDataItem.B2);
        }
        if (originDataItem.E2) {
            dVar.m1(originDataItem.D2);
        }
        r45.jp0 jp0Var = originDataItem.O1;
        if (jp0Var != null) {
            r72.h0 h0Var = new r72.h0();
            h0Var.w(jp0Var.f377998d);
            h0Var.u(jp0Var.f377999e);
            h0Var.t(jp0Var.f378002h);
            h0Var.y(jp0Var.f378000f);
            h0Var.x(jp0Var.f378001g);
            h0Var.r(jp0Var.f378004m);
            h0Var.s(jp0Var.f378005n);
            dVar.B1(h0Var);
        }
        r45.hp0 hp0Var2 = originDataItem.J1;
        if (hp0Var2 != null) {
            r45.ip0 ip0Var = hp0Var2.f376353d;
            if (ip0Var != null && ip0Var.computeSize() != 0) {
                r72.i iVar = new r72.i();
                if (ip0Var.f377230e) {
                    iVar.A(ip0Var.f377229d);
                }
                if (ip0Var.f377236n) {
                    iVar.z(ip0Var.f377235m);
                }
                if (ip0Var.f377232g) {
                    iVar.t(ip0Var.f377231f);
                }
                if (ip0Var.f377234i) {
                    iVar.B(ip0Var.f377233h);
                }
                if (ip0Var.f377238p) {
                    iVar.y(ip0Var.f377237o);
                }
                if (ip0Var.f377242t) {
                    iVar.x(ip0Var.f377241s);
                }
                if (ip0Var.f377244v) {
                    iVar.s(ip0Var.f377243u);
                }
                if (ip0Var.f377246x) {
                    iVar.q(ip0Var.f377245w);
                }
                if (ip0Var.f377248z) {
                    iVar.w(ip0Var.f377247y);
                }
                if (ip0Var.C) {
                    iVar.r(ip0Var.B);
                }
                if (ip0Var.E) {
                    iVar.u(ip0Var.D);
                }
                dVar.U0(iVar);
            }
            r45.pp0 pp0Var = hp0Var2.f376354e;
            if (pp0Var != null && pp0Var.computeSize() != 0) {
                r72.f fVar = new r72.f();
                if (pp0Var.f383273n) {
                    fVar.z(pp0Var.f383272m);
                }
                if (pp0Var.f383269g) {
                    fVar.A(pp0Var.f383268f);
                }
                if (pp0Var.f383267e) {
                    fVar.B(pp0Var.f383266d);
                }
                if (pp0Var.f383271i) {
                    fVar.J(pp0Var.f383270h);
                }
                if (pp0Var.f383275p) {
                    fVar.G(pp0Var.f383274o);
                }
                if (pp0Var.f383277r) {
                    fVar.F(pp0Var.f383276q);
                }
                if (pp0Var.f383279t) {
                    fVar.E(pp0Var.f383278s);
                }
                if (pp0Var.f383281v) {
                    fVar.C(pp0Var.f383280u);
                }
                if (pp0Var.f383283x) {
                    fVar.H(pp0Var.f383282w);
                }
                if (pp0Var.f383285z) {
                    fVar.I(pp0Var.f383284y);
                }
                if (pp0Var.B) {
                    fVar.y(pp0Var.A ? 1 : 0);
                }
                if (pp0Var.D) {
                    fVar.w(pp0Var.C);
                }
                if (pp0Var.F) {
                    fVar.x(pp0Var.E);
                }
                dVar.Q0(fVar);
            }
            r45.tq0 tq0Var2 = hp0Var2.f376355f;
            if (tq0Var2 != null && tq0Var2.computeSize() != 0) {
                dVar.d1(r72.n0.b(tq0Var2, hp0Var2.f376369w));
            }
            r45.aq0 aq0Var = hp0Var2.f376356g;
            if (aq0Var != null && aq0Var.computeSize() != 0) {
                dVar.S0(r72.e0.a(aq0Var));
            }
            r45.mq0 mq0Var = hp0Var2.f376357h;
            if (mq0Var != null && mq0Var.computeSize() != 0) {
                dVar.b1(r72.l0.b(mq0Var));
            }
            r45.sp0 sp0Var = hp0Var2.f376367u;
            if (sp0Var != null && sp0Var.computeSize() != 0) {
                r72.b0 b0Var = new r72.b0();
                b0Var.n(sp0Var.f385892e);
                b0Var.l(sp0Var.f385891d);
                dVar.R0(b0Var);
            }
            r45.dp0 dp0Var = hp0Var2.f376368v;
            if (dp0Var != null && dp0Var.computeSize() != 0) {
                dVar.H0(r72.b.b(dp0Var));
            }
            r45.xs4 xs4Var = hp0Var2.C;
            if (xs4Var != null && xs4Var.computeSize() != 0) {
                r72.a0 a0Var = new r72.a0();
                a0Var.N(com.tencent.mm.sdk.platformtools.t8.p(xs4Var.getString(0)));
                a0Var.L(com.tencent.mm.sdk.platformtools.t8.p(xs4Var.getString(1)));
                a0Var.J(com.tencent.mm.sdk.platformtools.t8.p(xs4Var.getString(2)));
                a0Var.K(com.tencent.mm.sdk.platformtools.t8.p(xs4Var.getString(3)));
                a0Var.O(com.tencent.mm.sdk.platformtools.t8.p(xs4Var.getString(4)));
                a0Var.z(com.tencent.mm.sdk.platformtools.t8.p(xs4Var.getString(5)));
                java.lang.String string = xs4Var.getString(6);
                if (string == null) {
                    string = "";
                }
                a0Var.B(string);
                a0Var.H(com.tencent.mm.sdk.platformtools.t8.p(xs4Var.getString(7)));
                a0Var.E(xs4Var.getLong(8));
                java.lang.String string2 = xs4Var.getString(9);
                if (string2 == null) {
                    string2 = "";
                }
                a0Var.C(string2);
                a0Var.G(xs4Var.getInteger(10));
                a0Var.F(com.tencent.mm.sdk.platformtools.t8.p(xs4Var.getString(11)));
                a0Var.I(com.tencent.mm.sdk.platformtools.t8.p(xs4Var.getString(12)));
                a0Var.A(com.tencent.mm.sdk.platformtools.t8.p(xs4Var.getString(17)));
                dVar.p1(a0Var);
                r72.j0 j0Var = new r72.j0();
                j0Var.o(xs4Var.getInteger(18));
                j0Var.n(xs4Var.getString(19));
                j0Var.l(xs4Var.getString(20));
                dVar.L1(j0Var);
            }
            r45.km6 km6Var = hp0Var2.G;
            if (km6Var != null && km6Var.computeSize() != 0) {
                r72.i0 i0Var = new r72.i0();
                i0Var.o(km6Var.f378838d);
                i0Var.l(km6Var.f378840f);
                i0Var.n(km6Var.f378839e);
                dVar.K1(i0Var);
            }
            r45.kv2 kv2Var = hp0Var2.f376371y;
            if (kv2Var != null) {
                dVar.h1(o72.s3.b(kv2Var));
            }
            r45.ev2 ev2Var = hp0Var2.f376352J;
            if (ev2Var != null) {
                dVar.g1(r72.n.b(ev2Var));
            }
            r45.qp0 qp0Var = hp0Var2.f376370x;
            if (qp0Var != null) {
                r72.c cVar = new r72.c();
                cVar.z(qp0Var.f384168m);
                cVar.B(qp0Var.f384175t);
                cVar.w(qp0Var.f384174s);
                cVar.y(qp0Var.f384169n);
                cVar.x(qp0Var.f384170o);
                cVar.t(qp0Var.f384173r);
                cVar.C(qp0Var.f384164f);
                cVar.A(qp0Var.f384165g);
                cVar.u(qp0Var.f384167i);
                dVar.I0(cVar);
            }
            r45.g92 g92Var = hp0Var2.f376372z;
            if (g92Var != null) {
                r72.r rVar = new r72.r();
                rVar.l0(g92Var.getString(0));
                rVar.o0(g92Var.getString(1));
                rVar.n0(g92Var.getString(2));
                rVar.A0(g92Var.getString(3));
                rVar.d0(g92Var.getString(4));
                rVar.m0(g92Var.getString(12));
                rVar.p0(g92Var.getString(11));
                rVar.k0(g92Var.getInteger(14));
                r72.s sVar = new r72.s();
                sVar.j(g92Var.getString(5));
                sVar.k(g92Var.getFloat(7));
                sVar.l(g92Var.getFloat(6));
                rVar.z0(sVar);
                rVar.w0(g92Var.getInteger(13));
                rVar.F0(g92Var.getInteger(15));
                rVar.v0(java.lang.String.valueOf(g92Var.getInteger(15)));
                rVar.e0(g92Var.getString(16));
                rVar.R(g92Var.getInteger(18));
                rVar.S(java.lang.String.valueOf(g92Var.getInteger(18)));
                rVar.T(g92Var.getString(17));
                rVar.U(g92Var.getInteger(19));
                rVar.W(g92Var.getString(20));
                rVar.V(g92Var.getString(21));
                rVar.Z(g92Var.getInteger(22));
                rVar.u0(g92Var.getString(25));
                rVar.x0(g92Var.getString(26));
                rVar.Y(g92Var.getString(27));
                rVar.C0(g92Var.getString(28));
                rVar.i0(g92Var.getString(29));
                rVar.g0(g92Var.getString(30));
                rVar.h0(g92Var.getString(31));
                rVar.B0(g92Var.getString(32));
                rVar.j0(g92Var.getString(33));
                rVar.G0(g92Var.getString(34));
                rVar.c0(g92Var.getInteger(35));
                rVar.b0(g92Var.getString(36));
                rVar.D0(g92Var.getInteger(39));
                rVar.H0(g92Var.getString(40));
                rVar.t0(g92Var.getInteger(38));
                rVar.r0(g92Var.getString(41));
                rVar.f0(g92Var.getString(42));
                rVar.E0(g92Var.getInteger(44));
                r45.xz3 xz3Var = (r45.xz3) g92Var.getCustom(43);
                if (xz3Var != null) {
                    qVar = new r72.q();
                    qVar.l(xz3Var.getString(0));
                    qVar.n(xz3Var.getString(1));
                } else {
                    qVar = null;
                }
                rVar.q0(qVar);
                r45.d50 d50Var = (r45.d50) g92Var.getCustom(46);
                if (d50Var != null) {
                    java.util.LinkedList list = d50Var.getList(1);
                    if (!(list == null || list.isEmpty())) {
                        r72.p pVar = new r72.p();
                        pVar.l(d50Var.getString(0));
                        java.util.LinkedList linkedList = new java.util.LinkedList();
                        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderContact> list2 = d50Var.getList(1);
                        if (list2 != null) {
                            for (com.tencent.mm.protocal.protobuf.FinderContact finderContact : list2) {
                                r72.o oVar = new r72.o();
                                java.lang.String nickname = finderContact != null ? finderContact.getNickname() : null;
                                if (nickname == null) {
                                    nickname = "";
                                }
                                oVar.j(nickname);
                                java.lang.String username = finderContact != null ? finderContact.getUsername() : null;
                                if (username == null) {
                                    username = "";
                                }
                                oVar.k(username);
                                linkedList.add(oVar);
                            }
                        }
                        pVar.k(linkedList);
                        rVar.a0(pVar);
                    }
                }
                dVar.M0(rVar);
            }
            r45.mv2 mv2Var = hp0Var2.E;
            if (mv2Var != null) {
                dVar.L0(r72.v.b(mv2Var));
            }
            r45.mv2 mv2Var2 = hp0Var2.D;
            if (mv2Var2 != null) {
                dVar.N0(r72.v.b(mv2Var2));
            }
            if (originDataItem.f375416j2 && (str = originDataItem.f375415i2) != null) {
                dVar.W0(str);
            }
        }
        return dVar;
    }
}
