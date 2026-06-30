package yw;

/* loaded from: classes11.dex */
public final class h1 {

    /* renamed from: a, reason: collision with root package name */
    public static final yw.h1 f466332a;

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f466333b;

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f466334c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f466335d;

    /* renamed from: e, reason: collision with root package name */
    public static final int f466336e;

    /* renamed from: f, reason: collision with root package name */
    public static final int f466337f;

    /* renamed from: g, reason: collision with root package name */
    public static final int f466338g;

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f466339h;

    /* renamed from: i, reason: collision with root package name */
    public static final boolean f466340i;

    /* renamed from: j, reason: collision with root package name */
    public static final int f466341j;

    /* renamed from: k, reason: collision with root package name */
    public static final int f466342k;

    /* renamed from: l, reason: collision with root package name */
    public static final int f466343l;

    /* renamed from: m, reason: collision with root package name */
    public static java.lang.Integer f466344m;

    static {
        yw.h1 h1Var = new yw.h1();
        f466332a = h1Var;
        f466333b = jz5.h.b(yw.e1.f466308d);
        f466334c = jz5.h.b(yw.g1.f466325d);
        jz5.g b17 = jz5.h.b(yw.z0.f466518d);
        com.tencent.mm.sdk.platformtools.o4 m17 = h1Var.m();
        eq1.n0 n0Var = eq1.n0.f255837a;
        boolean z17 = true;
        f466335d = m17.o("BizTimeLineOpenFlutter", !n0Var.a() ? -1 : 1);
        f466336e = h1Var.m().o("BizTimeLineUserAff", !n0Var.a() ? -1 : 1);
        f466337f = h1Var.m().o("BizTimeLineOpenDynamicCardToast", !n0Var.a() ? -1 : 1);
        f466338g = h1Var.m().o("BizTimeLineOpenDynamicCard", n0Var.a() ? 1 : -1);
        if (h1Var.m().o("bizForceDisableNewMsgDirect", 0) != 1 && !((java.lang.Boolean) ((jz5.n) b17).getValue()).booleanValue()) {
            z17 = false;
        }
        f466339h = z17;
        f466340i = h1Var.m().h("BizTimeLineShowRedPacketCover");
        f466341j = h1Var.m().o("BizHoldSecAfterUserLeaveForReport", 0);
        f466342k = h1Var.m().o("BizTimeLineFinderInfo", 0);
        f466343l = h1Var.m().o("BizTimeLineReportArticleJumpPathDepth", 0);
    }

    public final void a() {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (!com.tencent.mm.plugin.websearch.l2.h(0)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BizFlutterHelper", "fts h5 template not avail");
            return;
        }
        boolean wi6 = ((sg0.e2) ((tg0.p1) i95.n0.c(tg0.p1.class))).wi(11, 2);
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        android.content.Intent a17 = su4.r2.a();
        a17.putExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, context.getString(com.tencent.mm.R.string.f492174fh4));
        a17.putExtra("searchbar_tips", context.getString(com.tencent.mm.R.string.f492174fh4));
        a17.putExtra("KRightBtn", true);
        a17.putExtra("ftsneedkeyboard", !wi6);
        a17.putExtra("publishIdPrefix", "bs");
        a17.putExtra("ftsType", 2);
        a17.putExtra("ftsbizscene", 11);
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        java.util.Map b17 = su4.r2.b(11, true, 2);
        tg0.o1 o1Var = (tg0.o1) i95.n0.c(tg0.o1.class);
        java.util.HashMap hashMap = (java.util.HashMap) b17;
        int D1 = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) hashMap.get(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE), 0);
        ((sg0.y3) o1Var).getClass();
        java.lang.String f17 = su4.r2.f(D1);
        hashMap.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, f17);
        a17.putExtra(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, f17);
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        a17.putExtra("rawUrl", su4.r2.e(b17, 0));
        a17.putExtra("key_load_js_without_delay", true);
        a17.putExtra("key_preload_biz", 4);
        a17.addFlags(67108864);
        ((sg0.e2) ((tg0.p1) i95.n0.c(tg0.p1.class))).getClass();
        java.lang.String optString = su4.o2.d("entranceWording").optString("bizAccountTopSearch");
        if (!android.text.TextUtils.isEmpty(optString)) {
            a17.putExtra("key_search_input_hint", optString);
        }
        a17.putExtra("KOpenArticleSceneFromScene", 90);
        j45.l.z(context, a17, null);
        su4.k2.a(11, f17, f17, false, "", 2, "", false, "");
    }

    public final boolean b() {
        if (!p()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizFlutterHelper", "display breathing light switch is off");
            return false;
        }
        int o17 = m().o("biz_time_line_finder_get_live_info_interval", -1);
        int o18 = m().o("KeyBizLastGetLiveInfoTimeStamp", 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.BizFlutterHelper", "live info interval: " + o17 + ", last update timestamp: " + o18);
        if (o17 <= 0) {
            return false;
        }
        if (o17 < 10) {
            o17 = 10;
        }
        return c01.id.f((long) o18) > ((long) o17);
    }

    public final void c(boolean z17, int i17) {
        boolean n27;
        if (!(((long) (m().o("key_biz_fetch_contact_create_time_fetch_last_time", 0) + m().o("key_biz_fetch_contact_create_time_interval_in_second", 86400))) < com.tencent.mm.sdk.platformtools.t8.i1()) && !z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizFlutterHelper", "fetchContactCreateTimeIfNeed time not reach");
            return;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        android.database.Cursor x17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().x("@biz.contact", null, kz5.n0.S0(c01.e2.i()));
        if (x17 == null) {
            return;
        }
        while (x17.moveToNext()) {
            try {
                com.tencent.mm.storage.z3 z3Var = new com.tencent.mm.storage.z3();
                z3Var.convertFrom(x17);
                if (i17 == 1) {
                    n27 = z3Var.n2();
                } else if (i17 != 2) {
                    n27 = z3Var.k2();
                } else {
                    if (!z3Var.l2() && !z3Var.m2()) {
                        n27 = false;
                    }
                    n27 = true;
                }
                if (n27) {
                    g95.d dVar = g95.e.f269801a;
                    java.lang.String d17 = z3Var.d1();
                    kotlin.jvm.internal.o.f(d17, "getUsername(...)");
                    if (dVar.c(d17) <= 0) {
                        linkedList.add(z3Var.d1());
                    }
                }
            } finally {
            }
        }
        vz5.b.a(x17, null);
        if (!linkedList.isEmpty()) {
            e(linkedList);
        } else {
            m().B("key_biz_fetch_contact_create_time_fetch_last_time", com.tencent.mm.sdk.platformtools.t8.i1());
            com.tencent.mars.xlog.Log.i("MicroMsg.BizFlutterHelper", "fetchContactCreateTimeIfNeed usernameList is empty");
        }
    }

    public final void d(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BizFlutterHelper", "start fetch contact msg digest");
        r45.nb3 nb3Var = new r45.nb3();
        nb3Var.f381228d = i17;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 29891;
        lVar.f70666c = "/cgi-bin/mmbiz-bin/bizattr/getbizlatestitemlist";
        lVar.f70664a = nb3Var;
        lVar.f70665b = new r45.ob3();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        com.tencent.mm.modelbase.i iVar = new com.tencent.mm.modelbase.i();
        iVar.p(a17);
        iVar.l().K(yw.a1.f466262a);
    }

    public final void e(java.util.LinkedList usernameList) {
        kotlin.jvm.internal.o.g(usernameList, "usernameList");
        com.tencent.mars.xlog.Log.i("MicroMsg.BizFlutterHelper", "fetchContactSvrImpl usernameList:" + usernameList);
        r45.jq3 jq3Var = new r45.jq3();
        jq3Var.f378054d = usernameList;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 29189;
        lVar.f70666c = "/cgi-bin/mmbiz-bin/bizattr/getusercontactlist";
        lVar.f70664a = jq3Var;
        lVar.f70665b = new r45.kq3();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        com.tencent.mm.modelbase.i iVar = new com.tencent.mm.modelbase.i();
        iVar.p(a17);
        iVar.l().K(yw.b1.f466280a);
    }

    public final void f(com.tencent.pigeon.biz_base.BizRecFollowActionInfo info, yz5.l lVar) {
        kotlin.jvm.internal.o.g(info, "info");
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        ns.k kVar = (ns.k) i95.n0.c(ns.k.class);
        yw.c1 c1Var = new yw.c1(lVar);
        ((ms.a) kVar).getClass();
        r35.a aVar = new r35.a(context, c1Var);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(261);
        r45.hy6 hy6Var = new r45.hy6();
        java.lang.String articleUrl = info.getArticleUrl();
        hy6Var.f376558e = articleUrl;
        if (((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).o(info.getArticleUrl())) {
            try {
                hy6Var.f376559f = com.tencent.mm.sdk.platformtools.t8.P(android.net.Uri.parse(articleUrl).getQueryParameter(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE), 10000);
            } catch (java.lang.Exception unused) {
            }
        }
        aVar.F = hy6Var;
        aVar.b(info.getUsername(), linkedList, false, "");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(10298, info.getUsername(), java.lang.Long.valueOf(info.getScene()));
    }

    public final com.tencent.pigeon.biz_base.BizNotifyTipsInfo g() {
        int f17 = r01.q3.oj().f();
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        com.tencent.pigeon.biz_base.BizNotifyTipsInfo bizNotifyTipsInfo = new com.tencent.pigeon.biz_base.BizNotifyTipsInfo(null, null, null, null, null, null, bool, 63, null);
        if (f17 > 0) {
            com.tencent.mm.storage.s1 s1Var = null;
            android.database.Cursor B = r01.q3.oj().f194993d.B("SELECT * FROM BizTimeLineSingleMsgInfo where status != 4 order by createTime DESC limit 1", null);
            if (B.moveToFirst()) {
                s1Var = new com.tencent.mm.storage.s1();
                s1Var.convertFrom(B);
            }
            B.close();
            if (s1Var != null) {
                com.tencent.pigeon.biz_base.BizNotifyTipsInfo bizNotifyTipsInfo2 = new com.tencent.pigeon.biz_base.BizNotifyTipsInfo(null, java.lang.Long.valueOf(s1Var.field_msgId), null, null, null, null, null, 125, null);
                boolean z17 = true;
                if (s1Var.z0()) {
                    com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(s1Var.field_talker, true);
                    if (n17 != null && n17.r2()) {
                        bizNotifyTipsInfo2 = com.tencent.pigeon.biz_base.BizNotifyTipsInfo.copy$default(bizNotifyTipsInfo2, java.lang.Long.valueOf(f17), null, s1Var.field_talker, null, bool, null, null, 106, null);
                    } else if (s1Var.t0() != null) {
                        bizNotifyTipsInfo2 = com.tencent.pigeon.biz_base.BizNotifyTipsInfo.copy$default(bizNotifyTipsInfo2, java.lang.Long.valueOf(f17), null, null, null, bool, s1Var.t0().f193800d, null, 78, null);
                    }
                } else if (com.tencent.mm.storage.s2.a(s1Var, 0)) {
                    java.lang.String k17 = com.tencent.mm.storage.s2.k(s1Var, 0);
                    java.lang.String c17 = com.tencent.mm.storage.s2.c(s1Var);
                    if (!r26.n0.N(c17)) {
                        bizNotifyTipsInfo2 = com.tencent.pigeon.biz_base.BizNotifyTipsInfo.copy$default(bizNotifyTipsInfo2, java.lang.Long.valueOf(f17), null, null, null, bool, c17, null, 78, null);
                    } else if (!r26.n0.N(k17)) {
                        bizNotifyTipsInfo2 = com.tencent.pigeon.biz_base.BizNotifyTipsInfo.copy$default(bizNotifyTipsInfo2, java.lang.Long.valueOf(f17), null, k17, null, java.lang.Boolean.valueOf(c01.e2.G(k17)), null, null, 106, null);
                    }
                } else {
                    java.lang.String str = s1Var.field_talker;
                    boolean G = c01.e2.G(str);
                    if (str != null && !r26.n0.N(str)) {
                        z17 = false;
                    }
                    if (!z17) {
                        bizNotifyTipsInfo2 = com.tencent.pigeon.biz_base.BizNotifyTipsInfo.copy$default(bizNotifyTipsInfo2, java.lang.Long.valueOf(f17), null, str, null, java.lang.Boolean.valueOf(G), null, null, 106, null);
                    }
                }
                com.tencent.pigeon.biz_base.BizNotifyTipsInfo bizNotifyTipsInfo3 = bizNotifyTipsInfo2;
                java.lang.String userName = bizNotifyTipsInfo3.getUserName();
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (userName == null) {
                    userName = "";
                }
                bizNotifyTipsInfo = com.tencent.pigeon.biz_base.BizNotifyTipsInfo.copy$default(bizNotifyTipsInfo3, null, null, null, null, null, null, java.lang.Boolean.valueOf(com.tencent.mm.storage.s2.p(userName, s1Var, 0)), 63, null);
            }
        }
        com.tencent.pigeon.biz_base.BizNotifyTipsInfo bizNotifyTipsInfo4 = bizNotifyTipsInfo;
        java.lang.String userName2 = bizNotifyTipsInfo4.getUserName();
        boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        return com.tencent.pigeon.biz_base.BizNotifyTipsInfo.copy$default(bizNotifyTipsInfo4, null, null, userName2 == null ? "" : userName2, null, null, null, null, 123, null);
    }

    public final com.tencent.pigeon.biz_base.ContactInfo h(java.lang.String userName) {
        kotlin.jvm.internal.o.g(userName, "userName");
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(userName, true);
        if (n17 != null) {
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            return new com.tencent.pigeon.biz_base.ContactInfo(userName, c01.a2.e(userName), java.lang.Boolean.valueOf(n17.r2()), java.lang.Boolean.valueOf(n17.w2()), java.lang.Boolean.valueOf(c01.e2.P(n17)));
        }
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        return new com.tencent.pigeon.biz_base.ContactInfo(userName, null, bool, bool, java.lang.Boolean.TRUE, 2, null);
    }

    public final void i(java.lang.String username, yz5.l callback) {
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(username, true);
        if (n17 != null && !com.tencent.mm.sdk.platformtools.t8.K0(n17.P0())) {
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            callback.invoke(new com.tencent.pigeon.biz_base.ContactInfo(username, c01.a2.e(username), java.lang.Boolean.valueOf(n17.r2()), java.lang.Boolean.valueOf(n17.w2()), java.lang.Boolean.valueOf(c01.e2.P(n17))));
        } else {
            ((c01.k7) c01.n8.a()).b(username, 5, new yw.d1(username, callback));
        }
    }

    public final int j() {
        if (f466344m == null) {
            f466344m = java.lang.Integer.valueOf(m().o("BizResortV2ControlFlag", 3));
        }
        java.lang.Integer num = f466344m;
        kotlin.jvm.internal.o.d(num);
        return num.intValue();
    }

    public final java.lang.String k() {
        java.lang.String u17 = m().u("history_box_wording", "");
        kotlin.jvm.internal.o.f(u17, "decodeString(...)");
        return u17;
    }

    public final java.util.List l(long j17, boolean z17, boolean z18) {
        java.util.Iterator it;
        java.util.LinkedList linkedList;
        java.lang.String str;
        java.util.LinkedList linkedList2;
        java.lang.String str2;
        boolean z19;
        boolean z27;
        long j18;
        long j19;
        long j27;
        long j28;
        boolean z28;
        boolean z29;
        java.util.LinkedList linkedList3;
        com.tencent.pigeon.biz_base.MassSendCardMsg massSendCardMsg;
        java.util.LinkedList linkedList4 = new java.util.LinkedList();
        java.util.Iterator it6 = (z17 ? r01.q3.nj().P0(10, 285212721) : z18 ? r01.q3.nj().W0(j17, 285212721) : r01.q3.nj().f1(10, j17, 285212721)).iterator();
        while (it6.hasNext()) {
            com.tencent.mm.storage.s1 s1Var = (com.tencent.mm.storage.s1) it6.next();
            if (s1Var.v0()) {
                if (s1Var.v0()) {
                    java.lang.String str3 = s1Var.field_talker;
                    com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str3, true);
                    ot0.r0 r0Var = (ot0.r0) ((com.tencent.mm.plugin.biz.a) ((bq1.l) i95.n0.c(bq1.l.class))).Di(s1Var.field_msgId, s1Var.field_content);
                    long j29 = s1Var.field_orderFlag;
                    long j37 = s1Var.field_msgId;
                    long j38 = s1Var.field_msgSvrId;
                    boolean z37 = s1Var.field_isExpand;
                    long j39 = s1Var.field_createTime;
                    if (n17 != null) {
                        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
                        str = c01.a2.e(str3);
                    } else {
                        str = null;
                    }
                    java.lang.Boolean valueOf = n17 != null ? java.lang.Boolean.valueOf(n17.w2()) : null;
                    boolean z38 = s1Var.field_isRead == 1;
                    boolean z39 = s1Var.field_isValidExposed;
                    boolean z47 = (s1Var.field_bitFlag & 1) != 0;
                    java.util.LinkedList linkedList5 = r0Var.f348581i;
                    if (linkedList5 != null) {
                        it = it6;
                        linkedList2 = linkedList4;
                        str2 = str3;
                        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList5, 10));
                        java.util.Iterator it7 = linkedList5.iterator();
                        while (it7.hasNext()) {
                            ot0.s0 s0Var = (ot0.s0) it7.next();
                            java.lang.String str4 = s0Var.f348761d;
                            java.util.Iterator it8 = it7;
                            java.lang.String str5 = s0Var.f348762e;
                            boolean z48 = z47;
                            long j47 = j39;
                            java.lang.String m17 = ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).m(s0Var.f348762e);
                            java.lang.String str6 = s0Var.f348766i;
                            java.lang.String str7 = s0Var.D;
                            java.lang.String str8 = s0Var.f348769n;
                            boolean z49 = z37;
                            boolean z57 = z39;
                            boolean z58 = z38;
                            long j48 = s0Var.f348770o;
                            long j49 = j38;
                            boolean z59 = s0Var.I == 1;
                            arrayList.add(new com.tencent.pigeon.biz_base.MassSendCardMsgItem(str4, str5, m17, java.lang.Long.valueOf(s0Var.f348765h), str6, str7, str8, java.lang.Long.valueOf(j48), java.lang.Long.valueOf(s0Var.f348774q), s0Var.f348785z, s0Var.A, s0Var.G, java.lang.Long.valueOf(s0Var.C), java.lang.Long.valueOf(s0Var.E), java.lang.Long.valueOf(s0Var.F), java.lang.Boolean.valueOf(z59)));
                            it7 = it8;
                            z47 = z48;
                            z37 = z49;
                            j39 = j47;
                            z38 = z58;
                            z39 = z57;
                            j38 = j49;
                            j37 = j37;
                            j29 = j29;
                        }
                        z19 = z39;
                        z27 = z38;
                        j18 = j39;
                        j19 = j29;
                        j27 = j37;
                        j28 = j38;
                        z28 = z37;
                        z29 = z47;
                        linkedList3 = new java.util.LinkedList(arrayList);
                    } else {
                        it = it6;
                        linkedList2 = linkedList4;
                        str2 = str3;
                        z19 = z39;
                        z27 = z38;
                        j18 = j39;
                        j19 = j29;
                        j27 = j37;
                        j28 = j38;
                        z28 = z37;
                        z29 = z47;
                        linkedList3 = null;
                    }
                    massSendCardMsg = new com.tencent.pigeon.biz_base.MassSendCardMsg(str2, str, java.lang.Long.valueOf(j19), java.lang.Long.valueOf(j27), java.lang.Long.valueOf(j28), java.lang.Boolean.valueOf(z27), java.lang.Boolean.valueOf(z19), java.lang.Boolean.valueOf(z28), valueOf, java.lang.Long.valueOf(j18), null, java.lang.Boolean.valueOf(z29), linkedList3, 1024, null);
                    linkedList = linkedList2;
                } else {
                    massSendCardMsg = new com.tencent.pigeon.biz_base.MassSendCardMsg(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
                    it = it6;
                    linkedList = linkedList4;
                }
                linkedList.add(massSendCardMsg);
            } else {
                it = it6;
                linkedList = linkedList4;
            }
            linkedList4 = linkedList;
            it6 = it;
        }
        return linkedList4;
    }

    public final com.tencent.mm.sdk.platformtools.o4 m() {
        return (com.tencent.mm.sdk.platformtools.o4) f466333b.getValue();
    }

    public final boolean n() {
        return ((vw.m2) ((rv.k3) i95.n0.c(rv.k3.class))).aj();
    }

    public final r45.zw6 o() {
        r45.zw6 zw6Var = new r45.zw6();
        zw6Var.f392445d = m().o("biz_time_line_valid_expose_area_ratio", 0);
        zw6Var.f392446e = m().o("biz_time_line_valid_expose_time_ms", 0);
        zw6Var.f392447f = m().o("biz_time_line_extra_calc_expose_time_ms", 0);
        zw6Var.f392448g = m().o("biz_time_line_new_valid_expose_time_ms", 0);
        return zw6Var;
    }

    public final boolean p() {
        return m().i("biz_time_line_finder_display_breathing_light", false);
    }

    public final boolean q() {
        return m().n("key_biz_pic_text_scroll_list_enable") == 1;
    }

    public final void r() {
        ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).u(90);
        if (!yw.l0.f466390b) {
            jx3.f.INSTANCE.w(1971L, 4L, 1L);
        }
        yw.q3 q3Var = yw.q3.f466437a;
        if (yw.q3.f466441e) {
            return;
        }
        jx3.f.INSTANCE.w(1971L, 6L, 1L);
    }

    public final void s(com.tencent.pigeon.biz_base.BizArticleInfo info, android.content.Context context) {
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(context, "context");
        t(new lx.a(info.getMsgId(), info.getSvrId(), info.getPos(), info.getPosInCard(), info.getOpenScene(), info.getSubScene(), info.getUrl(), info.getItemShowType(), info.getUserName(), info.getNickName(), info.getTitle(), info.getCoverUrl(), info.getBizFinderEnterId(), info.getRankSessionId(), info.getMsgLocalId(), info.getBizSessionId(), info.getJumpPaths(), info.getHideShareMenu()), context);
    }

    public final void t(lx.a info, android.content.Context context) {
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(context, "context");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("MicroMsg.BizFlutterHelper", "onWebViewClick = %d", java.lang.Long.valueOf(currentTimeMillis));
        android.content.Intent intent = new android.content.Intent();
        java.lang.Long l17 = info.f321667e;
        kotlin.jvm.internal.o.d(l17);
        int longValue = (int) l17.longValue();
        java.lang.Long l18 = info.f321668f;
        kotlin.jvm.internal.o.d(l18);
        int longValue2 = (int) l18.longValue();
        java.lang.Long l19 = info.f321663a;
        intent.putExtra("message_id", l19);
        java.lang.String str = info.f321671i;
        intent.putExtra("srcUsername", str);
        intent.putExtra("srcDisplayname", info.f321672j);
        intent.putExtra("geta8key_username", str);
        intent.putExtra("geta8key_scene", 56);
        intent.putExtra(com.tencent.mm.ui.w2.f211197j, info.f321670h);
        intent.putExtra("start_activity_time", currentTimeMillis);
        android.os.Bundle bundle = new android.os.Bundle();
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        bundle.putInt("snsWebSource", (n17 == null || !n17.k2()) ? 0 : 4);
        intent.putExtra("msg_id", l19);
        intent.putExtra("msg_talker", str);
        intent.putExtra("KPublisherId", "msg_" + l19);
        intent.putExtra("pre_username", str);
        java.lang.Long l27 = info.f321678p;
        intent.putExtra("kBizSessionId", l27 != null ? java.lang.Integer.valueOf((int) l27.longValue()) : null);
        intent.putExtra("prePublishId", "msg_" + info.f321664b);
        intent.putExtra("preUsername", str);
        intent.putExtra("preChatName", str);
        intent.putExtra("preChatTYPE", 7);
        java.lang.Long l28 = info.f321666d;
        intent.putExtra("preMsgIndex", l28);
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putString("share_report_pre_msg_url", info.f321669g);
        java.lang.String str2 = info.f321673k;
        bundle2.putString("share_report_pre_msg_title", str2);
        java.lang.String str3 = info.f321674l;
        bundle2.putString("share_report_pre_msg_icon_url", str3);
        bundle2.putString("share_report_pre_msg_appid", "");
        bundle2.putInt("share_report_from_scene", 5);
        bundle2.putString("share_report_biz_username", str);
        intent.putExtras(bundle2);
        intent.putExtra("jsapiargs", bundle);
        intent.putExtra("message_index", l28);
        intent.putExtra("from_scence", 1);
        intent.putExtra("mode", 1);
        java.lang.String str4 = info.f321676n;
        java.lang.String str5 = info.f321669g;
        kotlin.jvm.internal.o.d(str5);
        int i17 = (int) (currentTimeMillis / 1000);
        java.lang.Long l29 = info.f321665c;
        int longValue3 = l29 != null ? (int) l29.longValue() : -1;
        java.lang.Long l37 = info.f321675m;
        java.lang.String c17 = ot0.g0.c(str5, longValue, longValue2, i17, null, "", longValue3, l37 != null ? (int) l37.longValue() : -1, str4, info.f321679q, f466343l);
        com.tencent.mars.xlog.Log.i("MicroMsg.BizFlutterHelper", "openUrl:%s", c17);
        intent.putExtra("rawUrl", c17);
        intent.putExtra("webpageTitle", str2);
        intent.putExtra("thumbUrl", str3);
        intent.addFlags(com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING);
        zq1.a0 a0Var = (zq1.a0) gm0.j1.s(zq1.a0.class);
        java.lang.Long l38 = info.f321670h;
        kotlin.jvm.internal.o.d(l38);
        if (((yq1.z) a0Var).E(context, c17, (int) l38.longValue(), true, longValue, longValue2, intent)) {
            return;
        }
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    public final void u() {
        ((ku5.t0) ku5.t0.f312615d).h(yw.f1.f466317d, "FlutterBizThread");
    }
}
