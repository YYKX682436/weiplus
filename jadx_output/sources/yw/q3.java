package yw;

/* loaded from: classes11.dex */
public final class q3 {

    /* renamed from: d, reason: collision with root package name */
    public static boolean f466440d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f466441e;

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.Boolean f466443g;

    /* renamed from: a, reason: collision with root package name */
    public static final yw.q3 f466437a = new yw.q3();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f466438b = jz5.h.b(yw.m3.f466401d);

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f466439c = yw.x0.f466500a.b();

    /* renamed from: f, reason: collision with root package name */
    public static boolean f466442f = true;

    static {
        if (com.tencent.mm.sdk.platformtools.x2.n() && gm0.j1.h() && gm0.j1.a()) {
            ((ku5.t0) ku5.t0.f312615d).a(yw.f3.f466321d);
        }
    }

    public final com.tencent.wechat.mm.biz.f1 a(com.tencent.mm.storage.s1 info, boolean z17) {
        kotlin.jvm.internal.o.g(info, "info");
        com.tencent.wechat.mm.biz.f1 f1Var = new com.tencent.wechat.mm.biz.f1();
        f1Var.f218007f = info.field_talker;
        boolean[] zArr = f1Var.M;
        char c17 = 3;
        zArr[3] = true;
        f1Var.f218008g = info.field_msgSvrId;
        char c18 = 4;
        zArr[4] = true;
        f1Var.f218009h = info.field_createTime;
        zArr[5] = true;
        f1Var.f218010i = info.field_isValidExposed ? 2 : info.field_isRead == 1 ? 1 : 0;
        zArr[6] = true;
        f1Var.f218011m = 0;
        zArr[7] = true;
        f1Var.f218012n = (info.field_bitFlag & 1) != 0;
        zArr[8] = true;
        f1Var.f218013o = info.field_isExpand;
        zArr[9] = true;
        f1Var.f218014p = info.field_hasShow != 1 && z17;
        zArr[10] = true;
        f1Var.f218015q = z17;
        zArr[11] = true;
        f1Var.f218022x = info.field_msgId;
        zArr[18] = true;
        f1Var.f218016r = info.field_rankSessionId;
        zArr[12] = true;
        f1Var.B = info.field_originBitFlag;
        zArr[22] = true;
        com.tencent.wechat.mm.biz.i1 i1Var = new com.tencent.wechat.mm.biz.i1();
        java.util.LinkedList<ot0.s0> linkedList = ((ot0.r0) ((com.tencent.mm.plugin.biz.a) ((bq1.l) i95.n0.c(bq1.l.class))).Di(info.field_msgId, info.field_content)).f348581i;
        if (linkedList != null) {
            for (ot0.s0 s0Var : linkedList) {
                kotlin.jvm.internal.o.d(s0Var);
                com.tencent.wechat.mm.biz.h1 h1Var = new com.tencent.wechat.mm.biz.h1();
                java.lang.String str = s0Var.f348761d;
                if (str == null) {
                    str = "";
                }
                h1Var.f218095d = str;
                boolean[] zArr2 = h1Var.f218094J;
                zArr2[1] = true;
                java.lang.String str2 = s0Var.f348762e;
                if (str2 == null) {
                    str2 = "";
                }
                h1Var.f218096e = str2;
                zArr2[2] = true;
                h1Var.f218097f = s0Var.f348765h;
                zArr2[c17] = true;
                java.lang.String str3 = s0Var.f348766i;
                if (str3 == null) {
                    str3 = "";
                }
                h1Var.f218098g = str3;
                zArr2[c18] = true;
                java.lang.String str4 = s0Var.D;
                if (str4 == null) {
                    str4 = "";
                }
                h1Var.f218099h = str4;
                zArr2[5] = true;
                java.lang.String str5 = s0Var.f348772p0;
                if (str5 == null) {
                    str5 = "";
                }
                h1Var.I = str5;
                zArr2[29] = true;
                java.lang.String str6 = s0Var.f348769n;
                if (str6 == null) {
                    str6 = "";
                }
                h1Var.f218100i = str6;
                zArr2[6] = true;
                h1Var.f218101m = s0Var.f348770o;
                zArr2[7] = true;
                h1Var.f218102n = s0Var.f348774q;
                zArr2[8] = true;
                java.lang.String str7 = s0Var.f348785z;
                if (str7 == null) {
                    str7 = "";
                }
                h1Var.f218103o = str7;
                zArr2[9] = true;
                h1Var.f218105q = s0Var.C;
                zArr2[11] = true;
                h1Var.f218106r = s0Var.I == 1;
                zArr2[12] = true;
                java.lang.String str8 = s0Var.G;
                if (str8 == null) {
                    str8 = "";
                }
                h1Var.f218107s = str8;
                zArr2[13] = true;
                h1Var.f218108t = s0Var.E;
                zArr2[14] = true;
                h1Var.f218109u = s0Var.F;
                zArr2[15] = true;
                java.lang.String str9 = s0Var.P;
                if (str9 == null) {
                    str9 = "";
                }
                h1Var.f218110v = str9;
                zArr2[16] = true;
                java.lang.String str10 = s0Var.Q;
                if (str10 == null) {
                    str10 = "";
                }
                h1Var.f218111w = str10;
                zArr2[17] = true;
                java.lang.String str11 = s0Var.R;
                if (str11 == null) {
                    str11 = "";
                }
                h1Var.f218112x = str11;
                zArr2[18] = true;
                h1Var.f218113y = s0Var.S;
                zArr2[19] = true;
                java.util.AbstractCollection abstractCollection = s0Var.f348767l1;
                if (abstractCollection == null) {
                    abstractCollection = new java.util.ArrayList();
                }
                h1Var.f218114z.addAll(abstractCollection);
                zArr2[20] = true;
                h1Var.A = s0Var.f348773p1;
                zArr2[21] = true;
                java.lang.String str12 = s0Var.T;
                if (str12 == null) {
                    str12 = "";
                }
                h1Var.B = str12;
                zArr2[22] = true;
                h1Var.C = s0Var.U == 1;
                zArr2[23] = true;
                h1Var.F = s0Var.W;
                zArr2[26] = true;
                h1Var.G = s0Var.Y;
                zArr2[27] = true;
                h1Var.H = s0Var.Z;
                zArr2[28] = true;
                i1Var.f218176d.add(h1Var);
                i1Var.f218179g[1] = true;
                c17 = 3;
                c18 = 4;
            }
        }
        f1Var.f218006e = i1Var;
        zArr[2] = true;
        f1Var.f218018t = info.field_content;
        zArr[14] = true;
        f1Var.f218021w = info.M;
        zArr[17] = true;
        return f1Var;
    }

    public final com.tencent.wechat.mm.biz.b1 b() {
        if (f466440d) {
            return com.tencent.wechat.mm.biz.b1.f217902b;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.FlutterBizMsgBridge", "getBizDynamicCardMrg hasInit=" + f466440d);
        return null;
    }

    public final com.tencent.wechat.mm.biz.g0 c() {
        if (f466440d) {
            return com.tencent.wechat.mm.biz.g0.f218063b;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.FlutterBizMsgBridge", "getBizManagerInstance hasInit=" + f466440d);
        return null;
    }

    public final synchronized void d() {
        if (f466440d) {
            return;
        }
        yw.h1 h1Var = yw.h1.f466332a;
        if (!h1Var.n()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("init but not use aff ");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            sb6.append(new com.tencent.mm.sdk.platformtools.z3());
            com.tencent.mars.xlog.Log.e("MicroMsg.FlutterBizMsgBridge", sb6.toString());
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterBizMsgBridge", "init resetData= " + f466443g);
        ((u71.f) ((e70.q) i95.n0.c(e70.q.class))).wi();
        com.tencent.wechat.mm.biz.y0.f218792a = yw.g3.f466328a;
        com.tencent.wechat.mm.biz.y0.f218793b = yw.h3.f466348a;
        com.tencent.wechat.iam.biz.a.f217738a = yw.i3.f466355a;
        yw.q0.f466432d.alive();
        if (!h1Var.p()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizFlutterDigestHelper", "init finder live dot, switch is off");
        } else if (z40.e.l4()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizFlutterDigestHelper", "use Finder exp, skip initFinderLiveDot");
        } else {
            com.tencent.wechat.mm.biz.g0.f218063b.d(yw.p0.f466421a);
        }
        ur1.j jVar = ur1.j.f430354a;
        if (ur1.n.f430361a.a()) {
            jVar.a().d(ur1.f.f430350a);
            jVar.a().h("biz_publish_personal_center_event", ur1.i.f430353a);
        }
        java.lang.String i17 = com.tencent.mm.vfs.w6.i(com.tencent.mm.vfs.q7.c("biz_persist"), false);
        java.lang.String j17 = gm0.j1.b().j();
        if (!com.tencent.mm.vfs.w6.j(i17)) {
            com.tencent.mm.vfs.w6.u(i17);
        }
        dw5.a aVar = new dw5.a();
        aVar.f244299d = false;
        boolean[] zArr = aVar.f244309q;
        zArr[1] = true;
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        aVar.f244300e = false;
        zArr[2] = true;
        java.lang.Boolean bool = f466443g;
        aVar.f244301f = bool != null ? bool.booleanValue() : false;
        boolean[] zArr2 = aVar.f244309q;
        zArr2[3] = true;
        aVar.f244302g = f466439c;
        zArr2[4] = true;
        aVar.f244303h = yw.h1.f466339h;
        zArr2[5] = true;
        aVar.f244304i = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_biz_time_empty_list_resort, 0) == 1;
        boolean[] zArr3 = aVar.f244309q;
        zArr3[6] = true;
        aVar.f244306n = false;
        zArr3[8] = true;
        aVar.f244305m = true;
        zArr3[7] = true;
        c01.y0 y0Var = c01.a1.f37045a;
        aVar.f244307o = y0Var.a().o("BizTLRecommendFeedsEnterBoxFilter", 0) == 1;
        aVar.f244309q[9] = true;
        aVar.f244308p = y0Var.a().o("BizTLRecommendFeedsOutBoxPullFeedsControlSwitch", 0);
        aVar.f244309q[10] = true;
        com.tencent.wechat.mm.biz.g0 g0Var = com.tencent.wechat.mm.biz.g0.f218063b;
        g0Var.p(i17, j17, o45.wf.f343029g, aVar, yw.j3.f466367a);
        dw5.q qVar = new dw5.q();
        qVar.f244408d = h1Var.j();
        qVar.f244416o[1] = true;
        qVar.f244409e = h1Var.m().o("lift_read_area_size", 0);
        qVar.f244416o[2] = true;
        qVar.f244410f = h1Var.k();
        qVar.f244416o[3] = true;
        qVar.f244411g = h1Var.m().q("resort_scene_bit_switch", 0L);
        qVar.f244416o[4] = true;
        qVar.f244412h = h1Var.m().o("resort_blocked_when_client_running_back", 0);
        qVar.f244416o[5] = true;
        qVar.f244413i = y0Var.a().o("BizTLRecommendFeedsBatchWithBizMsgResort", 0);
        qVar.f244416o[6] = true;
        qVar.f244414m = y0Var.a().o("BizTLRecommendFeedsOutBoxPullFeedsNeedUplineCard", 0);
        qVar.f244416o[7] = true;
        qVar.f244415n = h1Var.q();
        qVar.f244416o[8] = true;
        g0Var.J(1, qVar, yw.k3.f466384a);
        f466440d = true;
    }

    public final void e(java.lang.String type, java.lang.String xml) {
        kotlin.jvm.internal.o.g(type, "type");
        kotlin.jvm.internal.o.g(xml, "xml");
        if (!f466440d) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FlutterBizMsgBridge", "onReceiveXmlPush hasInit=" + f466440d);
        } else {
            if (!yw.h1.f466332a.n()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FlutterBizMsgBridge", "onReceiveXmlPush but not use aff. discard this msg");
                return;
            }
            if (com.tencent.mm.sdk.platformtools.a0.c()) {
                d();
            }
            com.tencent.wechat.mm.biz.g0.f218063b.B(type, xml, yw.n3.f466410a);
        }
    }
}
