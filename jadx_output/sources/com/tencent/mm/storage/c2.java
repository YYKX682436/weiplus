package com.tencent.mm.storage;

/* loaded from: classes11.dex */
public abstract class c2 {

    /* renamed from: a, reason: collision with root package name */
    public static int f193803a;

    /* renamed from: b, reason: collision with root package name */
    public static int f193804b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f193805c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f193806d;

    /* renamed from: e, reason: collision with root package name */
    public static int f193807e;

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.Boolean f193808f;

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.Boolean f193809g;

    public static boolean a(com.tencent.mm.storage.f9 f9Var, int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BizTimeLineInfoStorageLogic", "canEnterBizTimeLine, msgClusterType:%d, scene:%d, username:%s, type:%d, svrId:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), f9Var.Q0(), java.lang.Integer.valueOf(f9Var.getType()), java.lang.Long.valueOf(f9Var.I0()));
        if (f9Var.getType() == 34 || f9Var.getType() == 3 || f9Var.getType() == 1) {
            return false;
        }
        if ((i17 != 3 && i18 != 9 && i18 != 15 && i18 != 17) || !f9Var.t2()) {
            return false;
        }
        ot0.r0 i19 = i(f9Var);
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Boolean.valueOf(i19 == null);
        com.tencent.mars.xlog.Log.i("MicroMsg.BizTimeLineInfoStorageLogic", "reader is null? : %b", objArr);
        return (i19 == null || com.tencent.mm.sdk.platformtools.t8.L0(i19.f348581i)) ? false : true;
    }

    public static void b(com.tencent.mm.storage.f9 f9Var, boolean z17) {
        long incrementAndGet;
        com.tencent.mm.storage.f1 ij6 = r01.q3.ij();
        long I0 = f9Var.I0();
        ij6.getClass();
        com.tencent.mm.storage.s1 s1Var = new com.tencent.mm.storage.s1();
        android.database.Cursor D = ij6.f193909d.D("BizPhotoSingleMsgInfo", null, "msgSvrId=?", new java.lang.String[]{"" + I0}, null, null, null, 2);
        com.tencent.mm.storage.s1 s1Var2 = null;
        if (D.moveToFirst()) {
            s1Var.convertFrom(D);
            D.close();
        } else {
            D.close();
            s1Var = null;
        }
        com.tencent.mm.storage.s1 s1Var3 = s1Var == null ? new com.tencent.mm.storage.s1() : s1Var;
        if (z17) {
            com.tencent.mm.storage.f1 ij7 = r01.q3.ij();
            synchronized (ij7) {
                if (ij7.f193912g.longValue() == -60000000) {
                    android.database.Cursor B = ij7.f193909d.B("SELECT * FROM BizPhotoSingleMsgInfo where type=10100 or type=318767153 order by createTime DESC limit 1", null);
                    if (B.moveToFirst()) {
                        s1Var2 = new com.tencent.mm.storage.s1();
                        s1Var2.convertFrom(B);
                    }
                    B.close();
                    if (s1Var2 != null) {
                        ij7.f193912g.set(s1Var2.field_msgId);
                    }
                }
                incrementAndGet = ij7.f193912g.incrementAndGet();
            }
            s1Var3.field_msgId = incrementAndGet;
        } else {
            s1Var3.field_msgId = f9Var.getMsgId();
        }
        s1Var3.field_msgSvrId = f9Var.I0();
        s1Var3.field_content = f9Var.j();
        s1Var3.field_type = f9Var.getType();
        s1Var3.field_talker = f9Var.Q0();
        s1Var3.field_talkerId = f9Var.R0();
        s1Var3.field_createTime = f9Var.getCreateTime();
        s1Var3.field_imgPath = f9Var.z0();
        s1Var3.L = f9Var.F;
        s1Var3.M = f9Var.G;
        s1Var3.f238185o = true;
        s1Var3.field_status = f9Var.P0();
        int h17 = com.tencent.mm.storage.s2.h(s1Var3, 5);
        s1Var3.field_notifyMsgBlockFlag = h17;
        if ((h17 & 1) != 0) {
            s1Var3.field_status = 4;
            s1Var3.field_silentFoldMsgReadStatus = 1;
        }
        s1Var3.field_mpArticleKey = com.tencent.mm.storage.s2.e(s1Var3, 5);
        if (s1Var != null) {
            r01.q3.ij().L0(s1Var3);
            return;
        }
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.A(2126, 0);
        if (r01.q3.ij().insert(s1Var3)) {
            return;
        }
        g0Var.A(2126, 2);
    }

    public static void c(com.tencent.mm.storage.f9 f9Var) {
        int i17;
        int i18;
        int i19;
        int i27;
        boolean z17;
        boolean z18;
        int i28;
        com.tencent.wechat.mm.finder_box.c0 a17;
        com.tencent.wechat.mm.biz.g0 c17;
        if (f9Var == null) {
            return;
        }
        java.lang.String Q0 = f9Var.Q0();
        kk.j jVar = ot0.g0.f348477a;
        if (k01.o.a(Q0) || com.tencent.mm.storage.z3.R4(f9Var.Q0())) {
            return;
        }
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(f9Var.Q0(), true);
        if (n17 == null || !n17.r2() || n17.k2()) {
            c01.ea w17 = c01.w9.w(f9Var.G);
            if (w17 != null) {
                i17 = w17.f37143b;
                i18 = w17.f37144c;
                i19 = w17.f37145d;
                long j17 = w17.f37149h;
                z17 = (8 & j17) != 0;
                z18 = (16 & j17) != 0;
                if ((j17 & 4) != 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.BizTimeLineInfoStorageLogic", "doInsertBizTimeLineMsg not allow to insert,talker %s bizFlag = %d", f9Var.Q0(), java.lang.Long.valueOf(w17.f37149h));
                    return;
                }
                i27 = (int) j17;
            } else {
                i17 = -1;
                i18 = -1;
                i19 = -1;
                i27 = 0;
                z17 = false;
                z18 = false;
            }
            if (i18 != 0) {
                return;
            }
            if (w17 != null && (w17.f37149h & 64) != 0 && n17 != null && n17.r2()) {
                com.tencent.mars.xlog.Log.w("MicroMsg.BizTimeLineInfoStorageLogic", "not fans msg should not be is contact");
                return;
            }
            if (f9Var.getType() == 10000 && i19 == 7) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BizTimeLineInfoStorageLogic", "doInsertBizTimeLineMsg, intercept not allow to insert,talker %s", f9Var.Q0());
                return;
            }
            boolean a18 = a(f9Var, i17, i19);
            com.tencent.mars.xlog.Log.i("MicroMsg.BizTimeLineInfoStorageLogic", "doInsertBizTimeLineMsg %s, isTimeLine %b, msgId=%d, svrId=%d", f9Var.Q0(), java.lang.Boolean.valueOf(a18), java.lang.Long.valueOf(f9Var.getMsgId()), java.lang.Long.valueOf(f9Var.I0()));
            if (!a18) {
                o25.q.f342575b = true;
                d(f9Var, false);
                return;
            }
            if (w17 != null && (w17.f37149h & 2) != 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BizTimeLineInfoStorageLogic", "doInsertBizTimeLineMsg not allow to insert,talker %s bizFlag = %d", f9Var.Q0(), java.lang.Long.valueOf(w17.f37149h));
                return;
            }
            o25.q.f342575b = true;
            com.tencent.mm.storage.s1 s1Var = new com.tencent.mm.storage.s1();
            s1Var.field_msgId = f9Var.getMsgId();
            s1Var.field_msgSvrId = f9Var.I0();
            s1Var.field_content = f9Var.j();
            s1Var.field_type = f9Var.getType();
            s1Var.field_talker = f9Var.Q0();
            s1Var.field_talkerId = f9Var.R0();
            s1Var.field_createTime = f9Var.getCreateTime();
            s1Var.field_imgPath = f9Var.z0();
            s1Var.L = f9Var.F;
            s1Var.M = f9Var.G;
            s1Var.f238185o = true;
            s1Var.field_bizClientMsgId = f9Var.v0();
            s1Var.field_originBitFlag = i27;
            if (z18) {
                s1Var.field_bitFlag |= 1;
            }
            if (n17 == null || !n17.w2()) {
                i28 = 0;
                s1Var.field_placeTop = 0;
            } else {
                s1Var.field_placeTop = 1;
                i28 = 0;
            }
            s1Var.field_status = f9Var.P0();
            s1Var.field_hasShow = i28;
            s1Var.field_isExpand = z17;
            s1Var.field_rankSessionId = "";
            ((vw.o2) ((qk.m7) i95.n0.c(qk.m7.class))).getClass();
            yw.h1 h1Var = yw.h1.f466332a;
            if (h1Var.n()) {
                yw.q3 q3Var = yw.q3.f466437a;
                if (yw.q3.f466442f && (c17 = q3Var.c()) != null) {
                    c17.q(q3Var.a(s1Var, true), yw.l3.f466393a);
                }
            }
            if (z40.e.l4()) {
                ((y40.i0) z40.e.get()).getClass();
                if (h1Var.n()) {
                    a50.e1 e1Var = a50.e1.f1471a;
                    if (a50.e1.f1476f && (a17 = e1Var.a()) != null) {
                        com.tencent.wechat.mm.finder_box.x0 x0Var = new com.tencent.wechat.mm.finder_box.x0();
                        x0Var.f219938f = s1Var.field_talker;
                        boolean[] zArr = x0Var.M;
                        char c18 = 3;
                        zArr[3] = true;
                        x0Var.f219939g = s1Var.field_msgSvrId;
                        char c19 = 4;
                        zArr[4] = true;
                        x0Var.f219940h = s1Var.field_createTime;
                        zArr[5] = true;
                        x0Var.f219941i = s1Var.field_isValidExposed ? 2 : s1Var.field_isRead == 1 ? 1 : 0;
                        zArr[6] = true;
                        x0Var.f219942m = 0;
                        zArr[7] = true;
                        x0Var.f219943n = (s1Var.field_bitFlag & 1) != 0;
                        zArr[8] = true;
                        x0Var.f219944o = s1Var.field_isExpand;
                        zArr[9] = true;
                        x0Var.f219945p = s1Var.field_hasShow != 1;
                        zArr[10] = true;
                        x0Var.f219946q = true;
                        zArr[11] = true;
                        x0Var.f219953x = s1Var.field_msgId;
                        zArr[18] = true;
                        x0Var.f219947r = s1Var.field_rankSessionId;
                        zArr[12] = true;
                        x0Var.B = s1Var.field_originBitFlag;
                        zArr[22] = true;
                        com.tencent.wechat.mm.finder_box.a1 a1Var = new com.tencent.wechat.mm.finder_box.a1();
                        java.util.LinkedList<ot0.s0> linkedList = ((ot0.r0) ((com.tencent.mm.plugin.biz.a) ((bq1.l) i95.n0.c(bq1.l.class))).Di(s1Var.field_msgId, s1Var.field_content)).f348581i;
                        if (linkedList != null) {
                            for (ot0.s0 s0Var : linkedList) {
                                kotlin.jvm.internal.o.d(s0Var);
                                com.tencent.wechat.mm.finder_box.z0 z0Var = new com.tencent.wechat.mm.finder_box.z0();
                                java.lang.String str = s0Var.f348761d;
                                if (str == null) {
                                    str = "";
                                }
                                z0Var.f219995d = str;
                                boolean[] zArr2 = z0Var.f219994J;
                                zArr2[1] = true;
                                java.lang.String str2 = s0Var.f348762e;
                                if (str2 == null) {
                                    str2 = "";
                                }
                                z0Var.f219996e = str2;
                                zArr2[2] = true;
                                z0Var.f219997f = s0Var.f348765h;
                                zArr2[c18] = true;
                                java.lang.String str3 = s0Var.f348766i;
                                if (str3 == null) {
                                    str3 = "";
                                }
                                z0Var.f219998g = str3;
                                zArr2[c19] = true;
                                java.lang.String str4 = s0Var.D;
                                if (str4 == null) {
                                    str4 = "";
                                }
                                z0Var.f219999h = str4;
                                zArr2[5] = true;
                                java.lang.String str5 = s0Var.f348772p0;
                                if (str5 == null) {
                                    str5 = "";
                                }
                                z0Var.I = str5;
                                zArr2[29] = true;
                                java.lang.String str6 = s0Var.f348769n;
                                if (str6 == null) {
                                    str6 = "";
                                }
                                z0Var.f220000i = str6;
                                zArr2[6] = true;
                                z0Var.f220001m = s0Var.f348770o;
                                zArr2[7] = true;
                                z0Var.f220002n = s0Var.f348774q;
                                zArr2[8] = true;
                                java.lang.String str7 = s0Var.f348785z;
                                if (str7 == null) {
                                    str7 = "";
                                }
                                z0Var.f220003o = str7;
                                zArr2[9] = true;
                                z0Var.f220005q = s0Var.C;
                                zArr2[11] = true;
                                z0Var.f220006r = s0Var.I == 1;
                                zArr2[12] = true;
                                java.lang.String str8 = s0Var.G;
                                if (str8 == null) {
                                    str8 = "";
                                }
                                z0Var.f220007s = str8;
                                zArr2[13] = true;
                                z0Var.f220008t = s0Var.E;
                                zArr2[14] = true;
                                z0Var.f220009u = s0Var.F;
                                zArr2[15] = true;
                                java.lang.String str9 = s0Var.P;
                                if (str9 == null) {
                                    str9 = "";
                                }
                                z0Var.f220010v = str9;
                                zArr2[16] = true;
                                java.lang.String str10 = s0Var.Q;
                                if (str10 == null) {
                                    str10 = "";
                                }
                                z0Var.f220011w = str10;
                                zArr2[17] = true;
                                java.lang.String str11 = s0Var.R;
                                if (str11 == null) {
                                    str11 = "";
                                }
                                z0Var.f220012x = str11;
                                zArr2[18] = true;
                                z0Var.f220013y = s0Var.S;
                                zArr2[19] = true;
                                java.util.AbstractCollection abstractCollection = s0Var.f348767l1;
                                if (abstractCollection == null) {
                                    abstractCollection = new java.util.ArrayList();
                                }
                                z0Var.f220014z.addAll(abstractCollection);
                                zArr2[20] = true;
                                z0Var.A = s0Var.f348773p1;
                                zArr2[21] = true;
                                java.lang.String str12 = s0Var.T;
                                if (str12 == null) {
                                    str12 = "";
                                }
                                z0Var.B = str12;
                                zArr2[22] = true;
                                z0Var.C = s0Var.U == 1;
                                zArr2[23] = true;
                                z0Var.F = s0Var.W;
                                zArr2[26] = true;
                                z0Var.G = s0Var.Y;
                                zArr2[27] = true;
                                z0Var.H = s0Var.Z;
                                zArr2[28] = true;
                                a1Var.f219263d.add(z0Var);
                                a1Var.f219266g[1] = true;
                                c18 = 3;
                                c19 = 4;
                            }
                        }
                        x0Var.f219937e = a1Var;
                        zArr[2] = true;
                        x0Var.f219949t = s1Var.field_content;
                        zArr[14] = true;
                        x0Var.f219952w = s1Var.M;
                        zArr[17] = true;
                        a17.n(x0Var, a50.c1.f1462a);
                    }
                }
            }
        }
    }

    public static void d(com.tencent.mm.storage.f9 f9Var, boolean z17) {
        com.tencent.mm.storage.s1 J0 = r01.q3.oj().J0(f9Var.I0(), "msgSvrId");
        com.tencent.mm.storage.s1 s1Var = J0 == null ? new com.tencent.mm.storage.s1() : J0;
        if (z17) {
            s1Var.field_msgId = r01.q3.oj().W0();
        } else {
            s1Var.field_msgId = f9Var.getMsgId();
        }
        s1Var.field_msgSvrId = f9Var.I0();
        s1Var.field_content = f9Var.j();
        s1Var.field_type = f9Var.getType();
        s1Var.field_talker = f9Var.Q0();
        s1Var.field_talkerId = f9Var.R0();
        s1Var.field_createTime = f9Var.getCreateTime();
        s1Var.field_imgPath = f9Var.z0();
        s1Var.L = f9Var.F;
        s1Var.M = f9Var.G;
        s1Var.f238185o = true;
        s1Var.field_status = f9Var.P0();
        int h17 = com.tencent.mm.storage.s2.h(s1Var, 0);
        s1Var.field_notifyMsgBlockFlag = h17;
        if ((h17 & 1) != 0) {
            s1Var.field_status = 4;
            s1Var.field_silentFoldMsgReadStatus = 1;
        }
        s1Var.field_mpArticleKey = com.tencent.mm.storage.s2.e(s1Var, 0);
        if (J0 == null) {
            r01.q3.oj().insert(s1Var);
        } else {
            r01.q3.oj().f1(s1Var);
        }
    }

    public static int e() {
        if (!com.tencent.mm.sdk.platformtools.o4.R("brandService").getBoolean("BizTimeLineKeepPoseEnableForDebug", true)) {
            return 0;
        }
        int i17 = f193807e;
        if (i17 != 0) {
            return i17;
        }
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_open_biz_time_line_stay_time, 180);
        f193807e = Ni;
        return Ni;
    }

    public static boolean f(com.tencent.mm.storage.f9 f9Var) {
        com.tencent.mm.storage.z3 n17;
        if (f9Var == null) {
            return false;
        }
        java.lang.String Q0 = f9Var.Q0();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(Q0) && (n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(Q0, true)) != null && n17.m2() && n17.r2()) {
            return true;
        }
        c01.ea w17 = c01.w9.w(f9Var.G);
        return w17 != null && w17.f37144c == 1;
    }

    public static boolean g() {
        java.lang.Boolean bool = f193808f;
        if (bool != null) {
            return bool.booleanValue();
        }
        com.tencent.mm.sdk.platformtools.o4 R = com.tencent.mm.sdk.platformtools.o4.R("brandService");
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        int o17 = R.o("BizTimeLineOpenStatus", z65.c.a() ? 1 : -1);
        if (o17 == 1) {
            f193808f = java.lang.Boolean.TRUE;
        } else if (o17 == 0) {
            f193808f = java.lang.Boolean.FALSE;
        } else {
            boolean i17 = c01.a1.f37045a.a().i("BizTLRecommendFeedsSvrOpen", false);
            com.tencent.mars.xlog.Log.i("Micromsg.BizTLRecFeedsDataUtil", "BizTLRecommendFeedsSvrOpen = " + i17);
            f193808f = java.lang.Boolean.valueOf(i17);
            com.tencent.mars.xlog.Log.i("MicroMsg.BizTimeLineInfoStorageLogic", "isRecFeedsOpen svrOpen %b", java.lang.Boolean.valueOf(i17));
        }
        return f193808f.booleanValue();
    }

    public static boolean h() {
        java.lang.Boolean bool = f193809g;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_open_biz_time_line_show_time_v2, 0) == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizTimeLineInfoStorageLogic", "isShowBizTimeLineTime localOpen");
            java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
            f193809g = bool2;
            return bool2.booleanValue();
        }
        com.tencent.mm.sdk.platformtools.o4 a17 = com.tencent.mm.storage.g2.f193945a.a();
        com.tencent.mm.storage.e2[] e2VarArr = com.tencent.mm.storage.e2.f193854d;
        int o17 = a17.o("ReSortBizMsgRecommendReasonMode", 0);
        com.tencent.mm.storage.e2[] e2VarArr2 = com.tencent.mm.storage.e2.f193854d;
        if (o17 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizTimeLineInfoStorageLogic", "isShowBizTimeLineTime svrShowTime");
            java.lang.Boolean bool3 = java.lang.Boolean.TRUE;
            f193809g = bool3;
            return bool3.booleanValue();
        }
        java.lang.Boolean bool4 = java.lang.Boolean.FALSE;
        f193809g = bool4;
        com.tencent.mars.xlog.Log.i("MicroMsg.BizTimeLineInfoStorageLogic", "isShowBizTimeLineTime %b", bool4);
        return f193809g.booleanValue();
    }

    public static ot0.r0 i(com.tencent.mm.storage.f9 f9Var) {
        if (!f9Var.t2()) {
            return null;
        }
        return (ot0.r0) ((com.tencent.mm.plugin.biz.a) ((bq1.l) i95.n0.c(bq1.l.class))).Di(f9Var.getMsgId(), f9Var.j());
    }
}
