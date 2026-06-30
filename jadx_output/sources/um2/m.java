package um2;

/* loaded from: classes3.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final um2.m f428873a = new um2.m();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f428874b = jz5.h.b(um2.l.f428860d);

    public final void a(um2.x5 x5Var) {
        kotlin.jvm.internal.o.g(x5Var, "<this>");
        com.tencent.mars.xlog.Log.i(x5Var.f429032f, "checkChargeLiveInvalid live info:" + cm2.a.f43328a.y(((mm2.e1) x5Var.c(mm2.e1.class)).f328988r));
        if (((mm2.g0) x5Var.c(mm2.g0.class)).T6()) {
            fm2.c cVar = x5Var.f19606c;
            fm2.c cVar2 = cVar instanceof com.tencent.mm.plugin.finder.live.view.k0 ? cVar : null;
            if (cVar2 != null) {
                com.tencent.mm.plugin.finder.live.util.y.n(cVar2, null, null, new um2.i(x5Var, null), 3, null);
            }
        }
    }

    public final void b(um2.x5 x5Var) {
        com.tencent.mm.plugin.finder.live.plugin.ad adVar;
        android.view.ViewGroup viewGroup;
        df2.j0 j0Var;
        fm2.c cVar;
        df2.j0 j0Var2;
        com.tencent.mm.plugin.finder.live.plugin.ad adVar2;
        kotlin.jvm.internal.o.g(x5Var, "<this>");
        java.lang.String str = "checkLiveCharge info:" + cm2.a.f43328a.y(((mm2.e1) x5Var.c(mm2.e1.class)).f328988r);
        java.lang.String str2 = x5Var.f429032f;
        com.tencent.mars.xlog.Log.i(str2, str);
        jz5.f0 f0Var = null;
        boolean Q6 = mm2.g0.Q6((mm2.g0) x5Var.c(mm2.g0.class), null, 1, null);
        androidx.appcompat.app.AppCompatActivity appCompatActivity = x5Var.f19605b;
        if (!Q6) {
            if (((je2.a0) x5Var.c(je2.a0.class)).f299197i) {
                return;
            }
            zl2.r4.f473950a.E(appCompatActivity, 8192);
            return;
        }
        ae2.in inVar = ae2.in.f3688a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.O4).getValue()).r()).intValue() == 1 || ((je2.a0) x5Var.c(je2.a0.class)).f299197i) {
            zl2.r4.f473950a.X2(appCompatActivity, 8192, 8192);
        } else {
            zl2.r4.f473950a.E(appCompatActivity, 8192);
        }
        if (((mm2.g0) x5Var.c(mm2.g0.class)).S6() || (((je2.a0) x5Var.c(je2.a0.class)).f299196h && ((je2.a0) x5Var.c(je2.a0.class)).f299195g)) {
            fm2.c cVar2 = x5Var.f19606c;
            if (cVar2 != null) {
                cVar2.applyLiveScene(0);
            }
            fm2.c cVar3 = x5Var.f19606c;
            if (cVar3 != null && (j0Var = (df2.j0) cVar3.getController(df2.j0.class)) != null) {
                j0Var.release();
            }
            fm2.c cVar4 = x5Var.f19606c;
            long j17 = (cVar4 == null || (adVar = (com.tencent.mm.plugin.finder.live.plugin.ad) cVar4.getPlugin(com.tencent.mm.plugin.finder.live.plugin.ad.class)) == null || (viewGroup = adVar.f365323d) == null || viewGroup.getVisibility() != 0) ? false : true ? 300L : 0L;
            fm2.c cVar5 = x5Var.f19606c;
            if (cVar5 != null) {
                cVar5.postDelayed(new um2.j(x5Var, j17), j17);
                return;
            }
            return;
        }
        fm2.c cVar6 = x5Var.f19606c;
        if (cVar6 != null) {
            cVar6.applyLiveScene(1);
        }
        com.tencent.mm.plugin.finder.live.plugin.ad adVar3 = x5Var.W0;
        if (adVar3 != null) {
            com.tencent.mm.plugin.finder.live.plugin.ad.z1(adVar3, ne2.l.f336545a.a(((mm2.e1) x5Var.c(mm2.e1.class)).f328988r.getLong(0), ((mm2.g0) x5Var.c(mm2.g0.class)).f329066m), false, false, 6, null);
        }
        if (((com.tencent.mm.feature.finder.live.v4) i95.n0.c(com.tencent.mm.feature.finder.live.v4.class)).Nj().D0(((mm2.e1) x5Var.c(mm2.e1.class)).f328988r.getLong(0))) {
            zl2.r4.f473950a.f3(appCompatActivity, "charge live invalid!");
            fm2.c cVar7 = x5Var.f19606c;
            if (cVar7 == null || (adVar2 = (com.tencent.mm.plugin.finder.live.plugin.ad) cVar7.getPlugin(com.tencent.mm.plugin.finder.live.plugin.ad.class)) == null) {
                return;
            }
            adVar2.v1();
            return;
        }
        r45.td2 td2Var = ((mm2.g0) x5Var.c(mm2.g0.class)).f329066m;
        if (td2Var != null && (cVar = x5Var.f19606c) != null && (j0Var2 = (df2.j0) cVar.getController(df2.j0.class)) != null) {
            long j18 = ((mm2.e1) x5Var.c(mm2.e1.class)).f328988r.getLong(0);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startChargeLiveCountDown liveId:");
            sb6.append(j18);
            sb6.append(",t");
            sb6.append("FinderLiveUrlOption:[" + td2Var.getInteger(1) + ',' + td2Var.getInteger(3) + ']');
            sb6.append('!');
            com.tencent.mars.xlog.Log.i(j0Var2.f230440m, sb6.toString());
            if (j0Var2.f230441n == null) {
                ne2.k kVar = new ne2.k(1, j18, 0, 0, 12, null);
                kVar.f336537d = new df2.h0(j0Var2);
                j0Var2.f230441n = kVar;
            }
            ne2.k kVar2 = j0Var2.f230441n;
            if (kVar2 != null) {
                kVar2.c(td2Var);
            }
            fe2.q qVar = (fe2.q) j0Var2.R6(fe2.q.class);
            if (qVar != null) {
                qVar.w1("startChargeLiveCountDown");
            }
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e(str2, "checkLiveCharge but trialInfo is null!");
        }
    }

    public final void c(um2.x5 x5Var) {
        jz5.f0 f0Var;
        mn0.b0 b0Var;
        java.util.LinkedList i86;
        mm2.e1 e1Var;
        r45.nw1 nw1Var;
        mm2.e1 e1Var2;
        r45.nw1 nw1Var2;
        kotlin.jvm.internal.o.g(x5Var, "<this>");
        co0.s E = x5Var.E();
        java.lang.String str = x5Var.f429032f;
        if (E == null || (b0Var = E.R1.f282409a) == null) {
            f0Var = null;
        } else {
            mn0.y yVar = (mn0.y) b0Var;
            mn0.k0 l17 = yVar.l();
            com.tencent.mars.xlog.Log.i(str, "firstFrameReportBackup " + l17);
            if (l17.f329768e && (i86 = ((mm2.c1) x5Var.c(mm2.c1.class)).i8()) != null) {
                ((m30.m) ((n30.q) i95.n0.c(n30.q.class))).getClass();
                java.lang.String str2 = a52.a.f1584l;
                ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
                fm2.c cVar = x5Var.f19606c;
                java.lang.String valueOf = java.lang.String.valueOf(r0Var.Ri((cVar == null || (e1Var2 = (mm2.e1) cVar.business(mm2.e1.class)) == null || (nw1Var2 = e1Var2.f328988r) == null) ? 0L : nw1Var2.getLong(0)));
                zl2.q4 q4Var = zl2.q4.f473933a;
                long e17 = q4Var.e(i86, l17);
                if (e17 > 0) {
                    kotlin.jvm.internal.o.d(str2);
                    yVar.r(str2, valueOf, ((je2.z) x5Var.c(je2.z.class)).f299290g, ((je2.z) x5Var.c(je2.z.class)).f299291h);
                    yVar.h(str2, valueOf, e17);
                }
                kotlin.jvm.internal.o.d(str2);
                fm2.c cVar2 = x5Var.f19606c;
                q4Var.L(str2, (cVar2 == null || (e1Var = (mm2.e1) cVar2.business(mm2.e1.class)) == null || (nw1Var = e1Var.f328988r) == null) ? 0L : nw1Var.getLong(0), valueOf, e17, i86, l17, "backup");
                com.tencent.mars.xlog.Log.i(str, "firstFrameReportBackup businessFirstFrame:" + e17);
            }
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.i(str, "firstFrameReportBackup but player is null!");
        }
    }

    public final void d(um2.x5 x5Var) {
        java.lang.String stringExtra;
        dk2.x4 x4Var;
        java.lang.String str;
        kotlin.jvm.internal.o.g(x5Var, "<this>");
        if (((java.lang.Boolean) ((jz5.n) f428874b).getValue()).booleanValue()) {
            mm2.g0 g0Var = (mm2.g0) x5Var.c(mm2.g0.class);
            if (1 != g0Var.f329062f) {
                com.tencent.mars.xlog.Log.i("LiveChargeSlice", "cacheLiveMode 1");
            }
            g0Var.f329062f = 1;
            fm2.c cVar = x5Var.f19606c;
            if (cVar != null) {
                zl2.r4.f473950a.l3(x5Var.f19609a, cVar, false);
            }
            com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent = new com.tencent.mm.autogen.events.FeedUpdateEvent();
            long j17 = ((mm2.e1) x5Var.c(mm2.e1.class)).f328988r.getLong(0);
            am.ia iaVar = feedUpdateEvent.f54252g;
            iaVar.f6918a = j17;
            iaVar.f6919b = 14;
            feedUpdateEvent.e();
            fm2.c cVar2 = x5Var.f19606c;
            if (cVar2 != null) {
                zl2.r4.f473950a.E2(x5Var.f19609a, cVar2);
            }
            fm2.c cVar3 = x5Var.f19606c;
            if (cVar3 != null) {
                com.tencent.mm.plugin.finder.live.view.k0.hideLoadingLayer$default(cVar3, false, 1, null);
                return;
            }
            return;
        }
        long j18 = ((mm2.e1) x5Var.c(mm2.e1.class)).f328988r.getLong(0);
        androidx.appcompat.app.AppCompatActivity appCompatActivity = x5Var.f19605b;
        java.lang.String e17 = xy2.c.e(appCompatActivity);
        long j19 = ((mm2.e1) x5Var.c(mm2.e1.class)).f328983m;
        java.lang.String str2 = ((mm2.e1) x5Var.c(mm2.e1.class)).f328992v;
        java.lang.String str3 = ((mm2.e1) x5Var.c(mm2.e1.class)).f328984n;
        java.lang.String str4 = ((mm2.e1) x5Var.c(mm2.e1.class)).f328993w;
        java.lang.String str5 = ((mm2.c1) x5Var.c(mm2.c1.class)).f328905w4;
        int i17 = ((mm2.c1) x5Var.c(mm2.c1.class)).f328913x4;
        r45.qt2 qt2Var = x5Var.f19608e;
        r45.jc1 jc1Var = ((mm2.c1) x5Var.c(mm2.c1.class)).f328827j5;
        tn0.w0 w0Var = dk2.ef.f233378d;
        java.lang.String str6 = w0Var != null ? w0Var.Z : null;
        km2.n nVar = dk2.ef.H;
        java.lang.String str7 = (nVar == null || (x4Var = nVar.f309155g) == null || (str = x4Var.f234332z) == null) ? "" : str;
        java.lang.String str8 = ((mm2.e1) x5Var.c(mm2.e1.class)).f328995y;
        r45.o72 T = zl2.r4.f473950a.T(appCompatActivity, ((mm2.e1) x5Var.c(mm2.e1.class)).f328988r.getLong(0), x5Var.f429032f);
        long j27 = ((mm2.e1) x5Var.c(mm2.e1.class)).f328981h;
        android.content.Intent intent = appCompatActivity.getIntent();
        java.lang.String str9 = (intent == null || (stringExtra = intent.getStringExtra("key_enter_live_param_source_web_url")) == null) ? "" : stringExtra;
        km2.n nVar2 = dk2.ef.H;
        ek2.e0 e0Var = new ek2.e0(j18, null, e17, j19, 2, str2, str3, str4, str5, i17, qt2Var, 0, jc1Var, str6, str7, 0, str8, T, j27, 0, str9, null, null, false, nVar2 != null ? nVar2.f309161m : 0, 15239168, null);
        pf5.z zVar = pf5.z.f353948a;
        im2.t6 t6Var = (im2.t6) zVar.a(appCompatActivity).a(im2.t6.class);
        r45.gc1 gc1Var = e0Var.f253439w;
        t6Var.P6(gc1Var);
        ((im2.t6) zVar.a(appCompatActivity).a(im2.t6.class)).Q6(((mm2.e1) x5Var.c(mm2.e1.class)).f328981h, (r45.kv0) gc1Var.getCustom(1));
        e0Var.l().K(new um2.k(x5Var));
    }

    public final void e(gk2.e eVar, java.lang.String source, androidx.appcompat.app.AppCompatActivity appCompatActivity, r45.nw1 respLiveInfo, r45.ma4 respLiveSdkInfo) {
        hn0.r rVar;
        kotlin.jvm.internal.o.g(eVar, "<this>");
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(respLiveInfo, "respLiveInfo");
        kotlin.jvm.internal.o.g(respLiveSdkInfo, "respLiveSdkInfo");
        com.tencent.mars.xlog.Log.i("FinderLiveVisitorLivingHelper", "processLiveRoomInfo source: ".concat(source));
        com.tencent.trtc.TRTCCloudDef.TRTCParams tRTCParams = new com.tencent.trtc.TRTCCloudDef.TRTCParams();
        ya2.b2 b17 = ya2.h.f460484a.b(((mm2.c1) eVar.a(mm2.c1.class)).f328852o);
        java.lang.String w07 = b17 != null ? b17.w0() : "";
        kn0.g gVar = new kn0.g(w07, ((mm2.e1) eVar.a(mm2.e1.class)).f328988r.getLong(0), 0, null, 0L, 0L, null, 0, 0, 0, null, 0, 0L, 0, null, null, 0L, 0L, false, 524284, null);
        dk2.r4.f234005h.a(w07, respLiveSdkInfo, respLiveInfo, tRTCParams, gVar, 2, eVar);
        java.lang.String name = appCompatActivity != null ? appCompatActivity.getClass().getName() : null;
        java.lang.String str = name != null ? name : "";
        mm2.e1 e1Var = (mm2.e1) eVar.a(mm2.e1.class);
        kn0.i iVar = new kn0.i(tRTCParams, gVar, new kn0.h(str));
        dk2.ef efVar = dk2.ef.f233372a;
        tn0.w0 w0Var = dk2.ef.f233378d;
        co0.s sVar = w0Var instanceof co0.s ? (co0.s) w0Var : null;
        if (sVar != null && (rVar = sVar.R1) != null) {
            rVar.s(iVar.f309558b, ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).hk(((mm2.e1) eVar.a(mm2.e1.class)).f328988r), zl2.r4.f473950a.d0(source), ((je2.z) eVar.a(je2.z.class)).P6());
        }
        e1Var.o7(iVar);
    }
}
