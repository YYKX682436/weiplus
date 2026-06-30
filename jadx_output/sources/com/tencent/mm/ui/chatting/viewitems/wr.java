package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public final class wr implements com.tencent.mm.ui.chatting.viewitems.dr {

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.ui.chatting.viewitems.gr f205958f = new com.tencent.mm.ui.chatting.viewitems.gr(null);

    /* renamed from: a, reason: collision with root package name */
    public final yb5.d f205959a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f205960b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f205961c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f205962d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.c0 f205963e;

    public wr(yb5.d context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f205959a = context;
        this.f205960b = new java.util.LinkedHashMap();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        this.f205961c = linkedHashMap;
        this.f205962d = new java.util.LinkedHashMap();
        com.tencent.mars.xlog.Log.i("MicroMsg.ItemFactoryNew", "initChattingItemConfig");
        linkedHashMap.put(49, new com.tencent.mm.ui.chatting.viewitems.jr(this));
        java.util.Iterator it = kz5.c0.i(3, 23, 13, 39, 33).iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Number) it.next()).intValue();
            f(intValue, 0, ze5.r6.class, java.lang.Boolean.TRUE);
            f(intValue, 0, ze5.t6.class, java.lang.Boolean.FALSE);
        }
        java.util.Iterator it6 = kz5.c0.i(1, 11, 21, 31, 36, 301989937, 1107296305).iterator();
        while (it6.hasNext()) {
            int intValue2 = ((java.lang.Number) it6.next()).intValue();
            f(intValue2, 0, we5.v.class, java.lang.Boolean.TRUE);
            f(intValue2, 0, we5.n0.class, java.lang.Boolean.FALSE);
        }
        com.tencent.mm.ui.chatting.viewitems.fs[] fsVarArr = com.tencent.mm.ui.chatting.viewitems.fs.f203999d;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        f(16777265, 1, ze5.j8.class, bool);
        this.f205961c.put(16777265, com.tencent.mm.ui.chatting.viewitems.ur.f205730d);
        f(47, 0, ze5.g6.class, bool);
        f(47, 0, ze5.k6.class, java.lang.Boolean.FALSE);
        java.util.Iterator it7 = kz5.c0.i(43, 486539313).iterator();
        while (it7.hasNext()) {
            int intValue3 = ((java.lang.Number) it7.next()).intValue();
            f(intValue3, 0, ze5.w9.class, java.lang.Boolean.TRUE);
            f(intValue3, 0, ze5.x9.class, java.lang.Boolean.FALSE);
        }
        if (te5.h.f418649a.c()) {
            java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
            f(1090519089, 0, ze5.h3.class, bool2);
            java.lang.Boolean bool3 = java.lang.Boolean.FALSE;
            f(1090519089, 0, ze5.q3.class, bool3);
            f(49, 131, ze5.h3.class, bool2);
            f(49, 131, ze5.q3.class, bool3);
            f(49, 130, ze5.h3.class, bool2);
            f(49, 130, ze5.q3.class, bool3);
        } else {
            f(1090519089, 0, ze5.p1.class, java.lang.Boolean.TRUE);
            f(1090519089, 0, ze5.y1.class, java.lang.Boolean.FALSE);
        }
        java.lang.Boolean bool4 = java.lang.Boolean.TRUE;
        f(49, 19, ze5.u4.class, bool4);
        java.lang.Boolean bool5 = java.lang.Boolean.FALSE;
        f(49, 19, ze5.y4.class, bool5);
        f(49, 4, ze5.g5.class, bool4);
        f(49, 4, ze5.j5.class, bool5);
        f(49, 5, ze5.g5.class, bool4);
        f(49, 5, ze5.j5.class, bool5);
        f(49, 24, ze5.c4.class, bool4);
        f(49, 24, ze5.g4.class, bool5);
        f(49, 0, com.tencent.mm.ui.chatting.viewitems.c2.class, bool4);
        f(49, 0, com.tencent.mm.ui.chatting.viewitems.o2.class, bool5);
        g(this, 1124073521, ze5.f9.class, null, 4, null);
        f(268435505, 0, com.tencent.mm.ui.chatting.viewitems.la.class, bool4);
        f(268435505, 0, com.tencent.mm.ui.chatting.viewitems.qa.class, bool5);
        f(16777265, 0, com.tencent.mm.ui.chatting.viewitems.pd.class, bool4);
        f(16777265, 0, com.tencent.mm.ui.chatting.viewitems.ae.class, bool5);
        f(805306417, 0, com.tencent.mm.ui.chatting.viewitems.y9.class, bool4);
        f(805306417, 0, com.tencent.mm.ui.chatting.viewitems.ga.class, bool5);
        f(822083633, 0, com.tencent.mm.ui.chatting.viewitems.ab.class, bool4);
        f(822083633, 0, com.tencent.mm.ui.chatting.viewitems.lb.class, bool5);
        f(1048625, 0, com.tencent.mm.ui.chatting.viewitems.i6.class, bool4);
        f(1048625, 0, com.tencent.mm.ui.chatting.viewitems.j6.class, bool5);
        java.util.Iterator it8 = kz5.c0.i(1040187441, 1409286193).iterator();
        while (it8.hasNext()) {
            int intValue4 = ((java.lang.Number) it8.next()).intValue();
            f(intValue4, 0, com.tencent.mm.ui.chatting.viewitems.ie.class, java.lang.Boolean.TRUE);
            f(intValue4, 0, com.tencent.mm.ui.chatting.viewitems.je.class, java.lang.Boolean.FALSE);
        }
        java.lang.Boolean bool6 = java.lang.Boolean.TRUE;
        f(49, 3, com.tencent.mm.ui.chatting.viewitems.ie.class, bool6);
        java.lang.Boolean bool7 = java.lang.Boolean.FALSE;
        f(49, 3, com.tencent.mm.ui.chatting.viewitems.je.class, bool7);
        f(1476395057, 0, ze5.o9.class, bool6);
        f(1476395057, 0, ze5.q9.class, bool7);
        f(1426063409, 0, ze5.h9.class, bool6);
        f(1426063409, 0, ze5.j9.class, bool7);
        f(1895825457, 0, com.tencent.mm.ui.chatting.viewitems.x8.class, bool6);
        java.util.Iterator it9 = kz5.c0.i(10000, 10002, 570425393, 64, 603979825, 268445456, 268445458, 285222674).iterator();
        while (it9.hasNext()) {
            g(this, ((java.lang.Number) it9.next()).intValue(), com.tencent.mm.ui.chatting.viewitems.tm.class, null, 4, null);
        }
        f(34, 0, com.tencent.mm.ui.chatting.viewitems.dp.class, java.lang.Boolean.TRUE);
        f(34, 0, com.tencent.mm.ui.chatting.viewitems.hp.class, java.lang.Boolean.FALSE);
        g(this, 35, com.tencent.mm.ui.chatting.viewitems.em.class, null, 4, null);
        java.util.Iterator it10 = kz5.c0.i(42, 66).iterator();
        while (it10.hasNext()) {
            int intValue5 = ((java.lang.Number) it10.next()).intValue();
            f(intValue5, 0, ze5.w5.class, java.lang.Boolean.TRUE);
            f(intValue5, 0, ze5.z5.class, java.lang.Boolean.FALSE);
        }
        f(49, 132, ze5.l4.class, java.lang.Boolean.TRUE);
        f(49, 132, ze5.o4.class, java.lang.Boolean.FALSE);
        java.util.Iterator it11 = kz5.c0.i(37, 40).iterator();
        while (it11.hasNext()) {
            g(this, ((java.lang.Number) it11.next()).intValue(), com.tencent.mm.ui.chatting.viewitems.tk.class, null, 4, null);
        }
        java.lang.Boolean bool8 = java.lang.Boolean.TRUE;
        f(48, 0, ze5.m7.class, bool8);
        java.lang.Boolean bool9 = java.lang.Boolean.FALSE;
        f(48, 0, ze5.p7.class, bool9);
        g(this, 52, com.tencent.mm.ui.chatting.viewitems.gq.class, null, 4, null);
        f(50, 0, com.tencent.mm.ui.chatting.viewitems.dq.class, bool8);
        f(50, 0, com.tencent.mm.ui.chatting.viewitems.hq.class, bool9);
        g(this, 285212721, com.tencent.mm.ui.chatting.viewitems.zf.class, null, 4, null);
        f(53, 0, com.tencent.mm.ui.chatting.viewitems.eq.class, bool8);
        f(53, 0, com.tencent.mm.ui.chatting.viewitems.fq.class, bool9);
        g(this, -1879048191, com.tencent.mm.ui.chatting.viewitems.aq.class, null, 4, null);
        g(this, -1879048189, com.tencent.mm.ui.chatting.viewitems.up.class, null, 4, null);
        g(this, -1879048190, com.tencent.mm.ui.chatting.viewitems.xp.class, null, 4, null);
        java.util.Iterator it12 = kz5.c0.i(55, 57).iterator();
        while (it12.hasNext()) {
            int intValue6 = ((java.lang.Number) it12.next()).intValue();
            f(intValue6, 0, com.tencent.mm.ui.chatting.viewitems.pm.class, java.lang.Boolean.TRUE);
            f(intValue6, 0, com.tencent.mm.ui.chatting.viewitems.qm.class, java.lang.Boolean.FALSE);
        }
        g(this, -1879048188, com.tencent.mm.ui.chatting.viewitems.oq.class, null, 4, null);
        g(this, -1879048187, com.tencent.mm.ui.chatting.viewitems.nq.class, null, 4, null);
        g(this, 318767153, com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.class, null, 4, null);
        g(this, 1075839025, com.tencent.mm.ui.chatting.viewitems.jl.class, null, 4, null);
        g(this, 1081081905, com.tencent.mm.ui.chatting.viewitems.nl.class, null, 4, null);
        g(this, 872415281, com.tencent.mm.ui.chatting.viewitems.i1.class, null, 4, null);
        java.lang.Boolean bool10 = java.lang.Boolean.TRUE;
        f(-1879048186, 0, com.tencent.mm.ui.chatting.viewitems.wa.class, bool10);
        java.lang.Boolean bool11 = java.lang.Boolean.FALSE;
        f(-1879048186, 0, com.tencent.mm.ui.chatting.viewitems.xa.class, bool11);
        f(1442840625, 0, com.tencent.mm.ui.chatting.viewitems.de.class, bool10);
        f(1442840625, 0, com.tencent.mm.ui.chatting.viewitems.ee.class, bool11);
        g(this, -1879048185, com.tencent.mm.ui.chatting.viewitems.wl.class, null, 4, null);
        g(this, -1879048183, com.tencent.mm.ui.chatting.viewitems.yl.class, null, 4, null);
        g(this, -1879048176, com.tencent.mm.ui.chatting.viewitems.am.class, null, 4, null);
        f(419430449, 0, com.tencent.mm.ui.chatting.viewitems.xc.class, bool10);
        f(419430449, 0, com.tencent.mm.ui.chatting.viewitems.zc.class, bool11);
        f(436207665, 0, com.tencent.mm.ui.chatting.viewitems.b4.class, bool10);
        f(436207665, 0, com.tencent.mm.ui.chatting.viewitems.e4.class, bool11);
        java.util.Iterator it13 = kz5.c0.i(452984881, 520093745).iterator();
        while (it13.hasNext()) {
            int intValue7 = ((java.lang.Number) it13.next()).intValue();
            f(intValue7, 0, com.tencent.mm.ui.chatting.viewitems.m5.class, java.lang.Boolean.TRUE);
            f(intValue7, 0, com.tencent.mm.ui.chatting.viewitems.n5.class, java.lang.Boolean.FALSE);
        }
        java.lang.Boolean bool12 = java.lang.Boolean.TRUE;
        f(469762097, 0, com.tencent.mm.ui.chatting.viewitems.z4.class, bool12);
        java.lang.Boolean bool13 = java.lang.Boolean.FALSE;
        f(469762097, 0, com.tencent.mm.ui.chatting.viewitems.a5.class, bool13);
        f(503316529, 0, com.tencent.mm.ui.chatting.viewitems.d5.class, bool12);
        f(503316529, 0, com.tencent.mm.ui.chatting.viewitems.e5.class, bool13);
        f(587202609, 0, com.tencent.mm.ui.chatting.viewitems.ff.class, bool12);
        f(587202609, 0, com.tencent.mm.ui.chatting.viewitems.Cif.class, bool13);
        f(687865905, 0, com.tencent.mm.ui.chatting.viewitems.se.class, bool12);
        f(687865905, 0, com.tencent.mm.ui.chatting.viewitems.te.class, bool13);
        f(704643121, 0, com.tencent.mm.ui.chatting.viewitems.ta.class, bool12);
        f(704643121, 0, com.tencent.mm.ui.chatting.viewitems.ua.class, bool13);
        f(536870961, 0, com.tencent.mm.ui.chatting.viewitems.l4.class, bool12);
        f(536870961, 0, com.tencent.mm.ui.chatting.viewitems.o4.class, bool13);
        f(536936497, 0, com.tencent.mm.ui.chatting.viewitems.u4.class, bool12);
        f(536936497, 0, com.tencent.mm.ui.chatting.viewitems.v4.class, bool13);
        f(671088689, 0, com.tencent.mm.ui.chatting.viewitems.r5.class, bool12);
        f(721420337, 0, com.tencent.mm.ui.chatting.viewitems.mc.class, bool12);
        java.util.Iterator it14 = kz5.c0.i(754974769, 1241514033, 1174405169).iterator();
        while (it14.hasNext()) {
            int intValue8 = ((java.lang.Number) it14.next()).intValue();
            f(intValue8, 0, com.tencent.mm.ui.chatting.viewitems.g7.class, java.lang.Boolean.TRUE);
            f(intValue8, 0, com.tencent.mm.ui.chatting.viewitems.i7.class, java.lang.Boolean.FALSE);
        }
        java.util.Iterator it15 = kz5.c0.i(838860849, 1006633009).iterator();
        while (it15.hasNext()) {
            int intValue9 = ((java.lang.Number) it15.next()).intValue();
            f(intValue9, 0, com.tencent.mm.ui.chatting.viewitems.t8.class, java.lang.Boolean.TRUE);
            f(intValue9, 0, com.tencent.mm.ui.chatting.viewitems.u8.class, java.lang.Boolean.FALSE);
        }
        java.util.Iterator it16 = kz5.c0.i(1023475761, 1023541297).iterator();
        while (it16.hasNext()) {
            int intValue10 = ((java.lang.Number) it16.next()).intValue();
            f(intValue10, 0, com.tencent.mm.ui.chatting.viewitems.m6.class, java.lang.Boolean.TRUE);
            f(intValue10, 0, com.tencent.mm.ui.chatting.viewitems.n6.class, java.lang.Boolean.FALSE);
        }
        java.lang.Boolean bool14 = java.lang.Boolean.TRUE;
        f(1023606833, 0, com.tencent.mm.ui.chatting.viewitems.y7.class, bool14);
        java.lang.Boolean bool15 = java.lang.Boolean.FALSE;
        f(1023606833, 0, com.tencent.mm.ui.chatting.viewitems.z7.class, bool15);
        f(1023672369, 0, com.tencent.mm.ui.chatting.viewitems.p8.class, bool14);
        f(1023672369, 0, com.tencent.mm.ui.chatting.viewitems.q8.class, bool15);
        f(956301361, 0, com.tencent.mm.ui.chatting.viewitems.r6.class, bool14);
        f(956301361, 0, com.tencent.mm.ui.chatting.viewitems.t6.class, bool15);
        f(1076887601, 0, com.tencent.mm.ui.chatting.viewitems.c7.class, bool14);
        f(1076887601, 0, com.tencent.mm.ui.chatting.viewitems.d7.class, bool15);
        if (pd5.l.f353580b.a(com.tencent.mm.repairer.config.chatting.mvvmitem.RepairerConfigMvvmItem_FinderNameCard.class, true)) {
            f(771751985, 0, ze5.i2.class, bool14);
            f(771751985, 0, ze5.l2.class, bool15);
        } else {
            f(771751985, 0, com.tencent.mm.ui.chatting.viewitems.c8.class, bool14);
            f(771751985, 0, com.tencent.mm.ui.chatting.viewitems.d8.class, bool15);
        }
        f(1157627953, 0, com.tencent.mm.ui.chatting.viewitems.u7.class, bool14);
        f(1157627953, 0, com.tencent.mm.ui.chatting.viewitems.v7.class, bool15);
        java.util.Iterator it17 = kz5.c0.i(973078577, 975175729).iterator();
        while (it17.hasNext()) {
            int intValue11 = ((java.lang.Number) it17.next()).intValue();
            f(intValue11, 0, com.tencent.mm.ui.chatting.viewitems.l.class, java.lang.Boolean.TRUE);
            f(intValue11, 0, com.tencent.mm.ui.chatting.viewitems.n.class, java.lang.Boolean.FALSE);
        }
        java.lang.Boolean bool16 = java.lang.Boolean.TRUE;
        f(974127153, 0, ze5.o0.class, bool16);
        java.lang.Boolean bool17 = java.lang.Boolean.FALSE;
        f(974127153, 0, ze5.p0.class, bool17);
        f(977272881, 0, com.tencent.mm.ui.chatting.viewitems.f8.class, bool16);
        f(977272881, 0, com.tencent.mm.ui.chatting.viewitems.g8.class, bool17);
        f(976224305, 0, ze5.c1.class, bool16);
        f(976224305, 0, ze5.d1.class, bool17);
        f(978321457, 0, ze5.c1.class, bool16);
        f(978321457, 0, ze5.d1.class, bool17);
        h(978321457, 0, ze5.r0.class, true, com.tencent.mm.ui.chatting.viewitems.hr.f204142d);
        h(978321457, 0, ze5.s0.class, false, com.tencent.mm.ui.chatting.viewitems.ir.f204210d);
        f(979370033, 0, com.tencent.mm.ui.chatting.viewitems.p7.class, bool16);
        f(979370033, 0, com.tencent.mm.ui.chatting.viewitems.q7.class, bool17);
        f(855638065, 0, com.tencent.mm.ui.chatting.viewitems.hd.class, bool16);
        f(855638065, 0, com.tencent.mm.ui.chatting.viewitems.jd.class, bool17);
        f(939524145, 0, com.tencent.mm.ui.chatting.viewitems.e9.class, bool16);
        f(939524145, 0, com.tencent.mm.ui.chatting.viewitems.f9.class, bool17);
        java.util.Iterator it18 = kz5.c0.i(889192497, 922746929).iterator();
        while (it18.hasNext()) {
            g(this, ((java.lang.Number) it18.next()).intValue(), com.tencent.mm.ui.chatting.viewitems.nc.class, null, 4, null);
        }
        java.util.Iterator it19 = kz5.c0.i(85, 86).iterator();
        while (it19.hasNext()) {
            g(this, ((java.lang.Number) it19.next()).intValue(), com.tencent.mm.ui.chatting.viewitems.ed.class, null, 4, null);
        }
        g(this, 1077936177, com.tencent.mm.ui.chatting.viewitems.h5.class, null, 4, null);
        java.lang.Boolean bool18 = java.lang.Boolean.TRUE;
        f(989855793, 0, com.tencent.mm.ui.chatting.viewitems.k7.class, bool18);
        java.lang.Boolean bool19 = java.lang.Boolean.FALSE;
        f(989855793, 0, com.tencent.mm.ui.chatting.viewitems.l7.class, bool19);
        f(1057030193, 0, com.tencent.mm.ui.chatting.viewitems.g7.class, bool18);
        f(1057030193, 0, com.tencent.mm.ui.chatting.viewitems.i7.class, bool19);
        f(67, 0, com.tencent.mm.ui.chatting.viewitems.lm.class, bool18);
        f(67, 0, com.tencent.mm.ui.chatting.viewitems.mm.class, bool19);
        f(1078984753, 0, com.tencent.mm.ui.chatting.viewitems.vk.class, bool18);
        f(1078984753, 0, com.tencent.mm.ui.chatting.viewitems.wk.class, bool19);
        f(-2080374735, 0, com.tencent.mm.ui.chatting.viewitems.yk.class, bool18);
        f(-2080374735, 0, com.tencent.mm.ui.chatting.viewitems.zk.class, bool19);
        f(1080033329, 0, com.tencent.mm.ui.chatting.viewitems.cl.class, bool18);
        f(1080033329, 0, com.tencent.mm.ui.chatting.viewitems.dl.class, bool19);
        f(91, 0, com.tencent.mm.ui.chatting.viewitems.z8.class, bool18);
        f(91, 0, com.tencent.mm.ui.chatting.viewitems.a9.class, bool19);
        f(1627390001, 0, com.tencent.mm.ui.chatting.viewitems.ze.class, bool18);
        f(-2097151951, 0, com.tencent.mm.ui.chatting.viewitems.e6.class, bool18);
        g(this, -1879048173, com.tencent.mm.ui.chatting.viewitems.tg.class, null, 4, null);
        g(this, 1191182385, com.tencent.mm.ui.chatting.viewitems.ok.class, null, 4, null);
        h(1191182385, 0, com.tencent.mm.ui.chatting.viewitems.is.class, true, com.tencent.mm.ui.chatting.viewitems.ns.C);
        f(-2113929167, 0, com.tencent.mm.ui.chatting.viewitems.x5.class, bool18);
        f(-2113929167, 0, com.tencent.mm.ui.chatting.viewitems.y5.class, bool19);
        f(-2130706383, 0, com.tencent.mm.ui.chatting.viewitems.x5.class, bool18);
        f(-2130706383, 0, com.tencent.mm.ui.chatting.viewitems.y5.class, bool19);
        f(49, 124, com.tencent.mm.ui.chatting.viewitems.x5.class, bool18);
        f(49, 124, com.tencent.mm.ui.chatting.viewitems.y5.class, bool19);
        f(49, 115, com.tencent.mm.ui.chatting.viewitems.x5.class, bool18);
        f(49, 115, com.tencent.mm.ui.chatting.viewitems.y5.class, bool19);
        java.util.Iterator it20 = kz5.c0.i(1207959601, 1224736817).iterator();
        while (it20.hasNext()) {
            int intValue12 = ((java.lang.Number) it20.next()).intValue();
            f(intValue12, 0, com.tencent.mm.ui.chatting.viewitems.x6.class, java.lang.Boolean.TRUE);
            f(intValue12, 0, com.tencent.mm.ui.chatting.viewitems.z6.class, java.lang.Boolean.FALSE);
        }
        h(49, 5, ze5.p5.class, true, new com.tencent.mm.ui.chatting.viewitems.lr(this));
        h(49, 5, ze5.s5.class, false, new com.tencent.mm.ui.chatting.viewitems.mr(this));
        pd5.k kVar = pd5.l.f353580b;
        if (kVar.a(com.tencent.mm.repairer.config.chatting.mvvmitem.RepairerConfigMvvmItem_AppBrand.class, true)) {
            h(49, 33, ze5.f.class, false, new com.tencent.mm.ui.chatting.viewitems.nr(this));
            h(49, 33, ze5.t.class, false, new com.tencent.mm.ui.chatting.viewitems.or(this));
            h(49, 33, ze5.b.class, true, new com.tencent.mm.ui.chatting.viewitems.pr(this));
            h(49, 33, ze5.q.class, true, new com.tencent.mm.ui.chatting.viewitems.qr(this));
        }
        if (kVar.a(com.tencent.mm.repairer.config.chatting.mvvmitem.RepairerConfigMvvmItem_OpenSdkAppBrand.class, true)) {
            f(49, 36, ze5.f.class, java.lang.Boolean.FALSE);
            f(49, 36, ze5.b.class, java.lang.Boolean.TRUE);
        }
        h(49, 68, com.tencent.mm.ui.chatting.viewitems.j3.class, true, new com.tencent.mm.ui.chatting.viewitems.rr(this));
        h(49, 68, com.tencent.mm.ui.chatting.viewitems.n3.class, false, new com.tencent.mm.ui.chatting.viewitems.sr(this));
        if (kVar.a(com.tencent.mm.repairer.config.chatting.mvvmitem.RepairerConfigMvvmItem_LiteApp.class, true)) {
            java.lang.Boolean bool20 = java.lang.Boolean.TRUE;
            f(49, 68, ze5.x6.class, bool20);
            java.lang.Boolean bool21 = java.lang.Boolean.FALSE;
            f(49, 68, ze5.l7.class, bool21);
            f(1140850737, 0, ze5.t2.class, bool20);
            f(1140850737, 0, ze5.w2.class, bool21);
        } else {
            f(1140850737, 0, com.tencent.mm.ui.chatting.viewitems.k9.class, java.lang.Boolean.TRUE);
            f(1140850737, 0, com.tencent.mm.ui.chatting.viewitems.l9.class, java.lang.Boolean.FALSE);
        }
        h(49, 44, ze5.e0.class, false, new com.tencent.mm.ui.chatting.viewitems.tr(this));
        h(49, 44, ze5.d0.class, true, new com.tencent.mm.ui.chatting.viewitems.os(this));
        this.f205960b.put(java.lang.Integer.valueOf(ye5.e.class.hashCode()), ye5.e.class);
        if (((kc5.x) ((wg3.j) i95.n0.c(wg3.j.class))).Di()) {
            this.f205960b.put(java.lang.Integer.valueOf(ye5.g.class.hashCode()), ye5.g.class);
            this.f205960b.put(java.lang.Integer.valueOf(ye5.i.class.hashCode()), ye5.i.class);
        }
        e();
        this.f205963e = new com.tencent.mm.sdk.platformtools.c0(500);
    }

    public static final l15.c a(com.tencent.mm.ui.chatting.viewitems.wr wrVar, com.tencent.mm.storage.f9 f9Var) {
        wrVar.getClass();
        l15.c cVar = new l15.c();
        cVar.set__useLruCache(true);
        java.lang.String U1 = f9Var.U1();
        if (U1 == null) {
            U1 = "";
        }
        cVar.fromXml(U1);
        return cVar;
    }

    public static void g(com.tencent.mm.ui.chatting.viewitems.wr wrVar, int i17, java.lang.Class cls, java.lang.Boolean bool, int i18, java.lang.Object obj) {
        if ((i18 & 4) != 0) {
            bool = null;
        }
        wrVar.f(i17, 0, cls, bool);
    }

    public com.tencent.mm.ui.chatting.viewitems.a0 b(int i17) {
        java.lang.Class<com.tencent.mm.ui.chatting.viewitems.c2> cls = (java.lang.Class) ((java.util.LinkedHashMap) this.f205960b).get(java.lang.Integer.valueOf(i17));
        if (cls == null) {
            cls = com.tencent.mm.ui.chatting.viewitems.c2.class;
        }
        com.tencent.mm.ui.chatting.viewitems.c2 newInstance = cls.newInstance();
        kotlin.jvm.internal.o.f(newInstance, "newInstance(...)");
        return newInstance;
    }

    public int c(com.tencent.mm.storage.f9 msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        return ((java.lang.Number) this.f205963e.c(msg, new com.tencent.mm.ui.chatting.viewitems.vr(this, msg))).intValue();
    }

    public com.tencent.mm.ui.chatting.viewitems.a0 d(int i17) {
        java.lang.Class<com.tencent.mm.ui.chatting.viewitems.c2> cls = (java.lang.Class) ((java.util.LinkedHashMap) this.f205960b).get(java.lang.Integer.valueOf(i17));
        if (cls == null) {
            cls = com.tencent.mm.ui.chatting.viewitems.c2.class;
        }
        com.tencent.mm.ui.chatting.viewitems.c2 newInstance = cls.newInstance();
        kotlin.jvm.internal.o.f(newInstance, "newInstance(...)");
        return newInstance;
    }

    public final void e() {
        for (java.util.Map.Entry entry : this.f205960b.entrySet()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ItemFactoryNew", "[printHashCode] hash:" + ((java.lang.Number) entry.getKey()).intValue() + ", " + ((java.lang.Class) entry.getValue()).getName());
        }
    }

    public final void f(int i17, int i18, java.lang.Class cls, java.lang.Boolean bool) {
        com.tencent.mm.ui.chatting.viewitems.gr grVar = f205958f;
        java.util.Map map = this.f205960b;
        if (bool != null) {
            map.put(java.lang.Integer.valueOf(grVar.a(i17, i18, bool.booleanValue(), 0)), cls);
        } else {
            map.put(java.lang.Integer.valueOf(grVar.a(i17, i18, true, 0)), cls);
            map.put(java.lang.Integer.valueOf(grVar.a(i17, i18, false, 0)), cls);
        }
    }

    public final void h(int i17, int i18, java.lang.Class cls, boolean z17, yz5.l lVar) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.util.Map map = this.f205962d;
        java.lang.Object obj = map.get(valueOf);
        if (obj == null) {
            obj = new java.util.LinkedHashMap();
            map.put(valueOf, obj);
        }
        java.util.Map map2 = (java.util.Map) obj;
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
        java.lang.Object obj2 = map2.get(valueOf2);
        if (obj2 == null) {
            obj2 = new java.util.ArrayList();
            map2.put(valueOf2, obj2);
        }
        java.util.List list = (java.util.List) obj2;
        int size = list.size() + 1;
        list.add(new com.tencent.mm.ui.chatting.viewitems.fr(i17, i18, z17, cls, size, lVar));
        this.f205960b.put(java.lang.Integer.valueOf(f205958f.a(i17, i18, z17, size)), cls);
    }
}
