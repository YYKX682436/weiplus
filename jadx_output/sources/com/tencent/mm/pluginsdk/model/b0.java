package com.tencent.mm.pluginsdk.model;

/* loaded from: classes11.dex */
public final class b0 {
    public static boolean A;

    /* renamed from: a */
    public static final com.tencent.mm.pluginsdk.model.b0 f189197a;

    /* renamed from: b */
    public static final jz5.g f189198b;

    /* renamed from: c */
    public static final com.tencent.mm.sdk.platformtools.v3 f189199c;

    /* renamed from: d */
    public static final java.util.HashMap f189200d;

    /* renamed from: e */
    public static java.lang.String f189201e;

    /* renamed from: f */
    public static com.tencent.wechat.mm.biz.a1 f189202f;

    /* renamed from: g */
    public static final java.util.HashMap f189203g;

    /* renamed from: h */
    public static final jz5.g f189204h;

    /* renamed from: i */
    public static final jz5.g f189205i;

    /* renamed from: j */
    public static final jz5.g f189206j;

    /* renamed from: k */
    public static final jz5.g f189207k;

    /* renamed from: l */
    public static final jz5.g f189208l;

    /* renamed from: m */
    public static final jz5.g f189209m;

    /* renamed from: n */
    public static final jz5.g f189210n;

    /* renamed from: o */
    public static boolean f189211o;

    /* renamed from: p */
    public static boolean f189212p;

    /* renamed from: q */
    public static int f189213q;

    /* renamed from: r */
    public static final java.util.Map f189214r;

    /* renamed from: s */
    public static com.tencent.mm.sdk.event.IListener f189215s;

    /* renamed from: t */
    public static final jz5.g f189216t;

    /* renamed from: u */
    public static java.lang.String f189217u;

    /* renamed from: v */
    public static java.lang.String f189218v;

    /* renamed from: w */
    public static java.lang.String f189219w;

    /* renamed from: x */
    public static com.tencent.mm.sdk.platformtools.b4 f189220x;

    /* renamed from: y */
    public static boolean f189221y;

    /* renamed from: z */
    public static boolean f189222z;

    static {
        com.tencent.mm.pluginsdk.model.b0 b0Var = new com.tencent.mm.pluginsdk.model.b0();
        f189197a = b0Var;
        f189198b = jz5.h.b(com.tencent.mm.pluginsdk.model.r.f189417d);
        com.tencent.mm.sdk.platformtools.o4 h17 = b0Var.h();
        kotlin.jvm.internal.o.f(h17, "<get-mmkv>(...)");
        f189199c = new com.tencent.mm.sdk.platformtools.v3(h17, 15552000L);
        f189200d = new java.util.HashMap();
        f189203g = new java.util.HashMap();
        f189204h = jz5.h.b(com.tencent.mm.pluginsdk.model.y.f189502d);
        f189205i = jz5.h.b(com.tencent.mm.pluginsdk.model.x.f189495d);
        f189206j = jz5.h.b(com.tencent.mm.pluginsdk.model.w.f189486d);
        f189207k = jz5.h.b(com.tencent.mm.pluginsdk.model.v.f189479d);
        f189208l = jz5.h.b(com.tencent.mm.pluginsdk.model.z.f189504d);
        f189209m = jz5.h.b(com.tencent.mm.pluginsdk.model.p.f189395d);
        f189210n = jz5.h.b(com.tencent.mm.pluginsdk.model.q.f189407d);
        f189213q = 2;
        f189214r = new java.util.LinkedHashMap();
        f189216t = jz5.h.b(com.tencent.mm.pluginsdk.model.o.f189388d);
    }

    public static final com.tencent.mm.pluginsdk.model.j D(long j17) {
        com.tencent.wechat.mm.biz.a1 a1Var = f189202f;
        com.tencent.wechat.mm.biz.z0 c17 = a1Var != null ? a1Var.c() : null;
        if (c17 != null) {
            int ordinal = c17.ordinal();
            return ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? new com.tencent.mm.pluginsdk.model.j(false, false) : new com.tencent.mm.pluginsdk.model.j(true, true) : new com.tencent.mm.pluginsdk.model.j(true, false) : new com.tencent.mm.pluginsdk.model.j(false, false);
        }
        com.tencent.mm.pluginsdk.model.b0 b0Var = f189197a;
        if (b0Var.i() && b0Var.h().q("KeyMainRedDotTime", 0L) >= j17) {
            java.lang.String u17 = b0Var.h().u("KeyMainCellRedDotUserName", "");
            java.lang.String e17 = b0Var.e(u17);
            java.lang.String s17 = u17 != null ? f189199c.s("click-exportId-".concat(u17), "") : "";
            if (e17 == null || r26.n0.N(e17)) {
                return new com.tencent.mm.pluginsdk.model.j(false, false);
            }
            if (!com.tencent.mm.sdk.platformtools.t8.D0(e17, s17)) {
                return new com.tencent.mm.pluginsdk.model.j(true, true);
            }
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            return new com.tencent.mm.pluginsdk.model.j(true, false);
        }
        return new com.tencent.mm.pluginsdk.model.j(false, false);
    }

    public static final java.lang.String g() {
        return f189197a.h().t("KeyMainCellRedDotUserName");
    }

    public static /* synthetic */ void r(com.tencent.mm.pluginsdk.model.b0 b0Var, android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, java.util.List list, r45.nw1 nw1Var, java.lang.String str4, byte[] bArr, java.lang.String str5, java.lang.String str6, com.tencent.mm.pluginsdk.model.i iVar, int i19, java.lang.Object obj) {
        b0Var.q(context, str, str2, str3, i17, i18, (i19 & 64) != 0 ? null : list, (i19 & 128) != 0 ? null : nw1Var, (i19 & 256) != 0 ? null : str4, (i19 & 512) != 0 ? null : bArr, (i19 & 1024) != 0 ? null : str5, (i19 & 2048) != 0 ? null : str6, (i19 & 4096) != 0 ? null : iVar);
    }

    public final void A(int i17, int i18) {
        h().A("bar_list_refresh_interval-" + i17, i18);
    }

    public final void B(r45.qk resp) {
        kotlin.jvm.internal.o.g(resp, "resp");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("saveLiveBarResp resp size=");
        java.util.LinkedList linkedList = resp.f384063d;
        sb6.append(linkedList != null ? linkedList.size() : 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.BizFinderLiveLogic", sb6.toString());
        try {
            h().H("live_bar_resp_data", resp.toByteArray());
            h().A("biz_finder_live_func_flag", resp.f384068i);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BizFinderLiveLogic", "saveLiveBarResp ex " + e17.getMessage());
        }
    }

    public final boolean C(java.lang.String str) {
        if (str == null) {
            return false;
        }
        com.tencent.mm.sdk.platformtools.v3 v3Var = f189199c;
        int p17 = com.tencent.mm.sdk.platformtools.v3.p(v3Var, "refreshInterval-".concat(str), 0, 2, null);
        return java.lang.System.currentTimeMillis() - com.tencent.mm.sdk.platformtools.v3.r(v3Var, "saveExportIdTime-".concat(str), 0L, 2, null) > ((long) ((p17 < 5 ? 5 : p17) * 1000));
    }

    public final void E() {
        com.tencent.mm.sdk.platformtools.b4 b4Var = f189220x;
        if (b4Var != null) {
            if (b4Var != null) {
                b4Var.d();
            }
            f189220x = null;
        }
    }

    public final void a(java.lang.String str, boolean z17, int i17, yz5.q block) {
        kotlin.jvm.internal.o.g(block, "block");
        if (str == null) {
            return;
        }
        kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, kotlinx.coroutines.q1.f310570c, null, new com.tencent.mm.pluginsdk.model.l(z17, str, i17, block, null), 2, null);
    }

    public final void b() {
        f189203g.clear();
        ((com.tencent.mm.sdk.platformtools.o4) f189199c.i()).d();
    }

    public final java.lang.String c(java.lang.String str) {
        return "exportId-" + str;
    }

    public final java.lang.Object d(int i17, java.util.LinkedList linkedList, com.tencent.mm.ipcinvoker.wx_extension.v vVar, kotlin.coroutines.Continuation continuation) {
        oz5.n nVar = new oz5.n(pz5.f.b(continuation));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.pk pkVar = new r45.pk();
        pkVar.f383125g = i17;
        if (linkedList != null) {
            pkVar.f383122d = linkedList;
        }
        com.tencent.mm.pluginsdk.model.b0 b0Var = f189197a;
        b0Var.h().j("FinderLiveBuffer");
        pkVar.f383124f = 30;
        lVar.f70664a = pkVar;
        lVar.f70665b = new r45.qk();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/timeline/bizfinderlive";
        lVar.f70667d = 4703;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        com.tencent.mars.xlog.Log.i("MicroMsg.BizFinderLiveLogic", "getBizFinderLives scene=" + i17);
        b0Var.v(0L);
        if (1 <= i17 && i17 < 20) {
            b0Var.v(i17 + 40);
        }
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                if (str != null) {
                    ((com.tencent.mm.sdk.platformtools.o4) f189199c.i()).B("saveExportIdTime-".concat(str), java.lang.System.currentTimeMillis());
                }
            }
        }
        ((h80.i) ((com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class))).wi(a17, new com.tencent.mm.pluginsdk.model.n(new kotlin.jvm.internal.c0(), vVar, nVar, i17));
        java.lang.Object a18 = nVar.a();
        pz5.a aVar = pz5.a.f359186d;
        return a18;
    }

    public final java.lang.String e(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return com.tencent.mm.sdk.platformtools.v3.t(f189199c, c(str), null, 2, null);
    }

    public final r45.qk f() {
        com.tencent.mm.protobuf.f fVar;
        byte[] j17;
        com.tencent.mm.sdk.platformtools.o4 h17 = h();
        kotlin.jvm.internal.o.f(h17, "<get-mmkv>(...)");
        if (h17.f("live_bar_resp_data") && (j17 = h17.j("live_bar_resp_data")) != null) {
            if (!(j17.length == 0)) {
                try {
                    java.lang.Object newInstance = r45.qk.class.newInstance();
                    ((com.tencent.mm.protobuf.f) newInstance).parseFrom(j17);
                    fVar = (com.tencent.mm.protobuf.f) newInstance;
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MultiProcessMMKV.decodeProtoBuffer", e17, "decode ProtoBuffer", new java.lang.Object[0]);
                }
                return (r45.qk) fVar;
            }
        }
        fVar = null;
        return (r45.qk) fVar;
    }

    public final com.tencent.mm.sdk.platformtools.o4 h() {
        return (com.tencent.mm.sdk.platformtools.o4) f189198b.getValue();
    }

    public final boolean i() {
        return ((java.lang.Boolean) ((jz5.n) f189205i).getValue()).booleanValue();
    }

    public final int j() {
        return ((java.lang.Number) ((jz5.n) f189204h).getValue()).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0092 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List k(java.util.LinkedList r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.pluginsdk.model.b0.k(java.util.LinkedList, boolean):java.util.List");
    }

    public final boolean l(com.tencent.wechat.mm.biz.a1 digestLiveInfo) {
        kotlin.jvm.internal.o.g(digestLiveInfo, "digestLiveInfo");
        java.lang.String nickname = digestLiveInfo.getNickname();
        com.tencent.wechat.mm.biz.a1 a1Var = f189202f;
        if (kotlin.jvm.internal.o.b(nickname, a1Var != null ? a1Var.getNickname() : null)) {
            java.lang.String b17 = digestLiveInfo.b();
            com.tencent.wechat.mm.biz.a1 a1Var2 = f189202f;
            if (kotlin.jvm.internal.o.b(b17, a1Var2 != null ? a1Var2.b() : null)) {
                com.tencent.wechat.mm.biz.z0 c17 = digestLiveInfo.c();
                com.tencent.wechat.mm.biz.a1 a1Var3 = f189202f;
                if (c17 == (a1Var3 != null ? a1Var3.c() : null)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean m() {
        return ((java.lang.Boolean) ((jz5.n) f189216t).getValue()).booleanValue();
    }

    public final boolean n(java.lang.String str, java.lang.String str2) {
        if (str == null) {
            return false;
        }
        if (str2 == null || r26.n0.N(str2)) {
            return false;
        }
        return kotlin.jvm.internal.o.b(com.tencent.mm.sdk.platformtools.v3.t(f189199c, "live_bar_expose-exportId-".concat(str), null, 2, null), str2);
    }

    public final boolean o(java.lang.String str) {
        if (str == null) {
            return false;
        }
        com.tencent.mm.sdk.platformtools.v3 v3Var = f189199c;
        java.lang.String t17 = com.tencent.mm.sdk.platformtools.v3.t(v3Var, c(str), null, 2, null);
        if (t17 == null || r26.n0.N(t17)) {
            return false;
        }
        if (java.lang.System.currentTimeMillis() - v3Var.q("saveExportIdTime-".concat(str), 0L) <= 21600000) {
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BizFinderLiveLogic", "isLiveNow expired live status");
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x02f6, code lost:
    
        if ((r3.length() > 0) != false) goto L372;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01bc  */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(android.content.Context r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, int r30, int r31, java.util.List r32, java.lang.String r33, r45.nw1 r34, java.lang.String r35, byte[] r36, java.lang.String r37, java.lang.String r38, final com.tencent.mm.pluginsdk.model.i r39) {
        /*
            Method dump skipped, instructions count: 1040
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.pluginsdk.model.b0.p(android.content.Context, java.lang.String, java.lang.String, java.lang.String, int, int, java.util.List, java.lang.String, r45.nw1, java.lang.String, byte[], java.lang.String, java.lang.String, com.tencent.mm.pluginsdk.model.i):void");
    }

    public final void q(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, java.util.List list, r45.nw1 nw1Var, java.lang.String str4, byte[] bArr, java.lang.String str5, java.lang.String str6, com.tencent.mm.pluginsdk.model.i iVar) {
        kotlin.jvm.internal.o.g(context, "context");
        p(context, str, str2, str3, i17, i18, list, null, nw1Var, str4, bArr, str5, str6, iVar);
    }

    public final void s(java.util.LinkedList list) {
        kotlin.jvm.internal.o.g(list, "list");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((r45.hm6) it.next()).f376295d);
        }
        linkedList.addAll(arrayList);
        if (linkedList.isEmpty()) {
            return;
        }
        kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, kotlinx.coroutines.q1.f310570c, null, new com.tencent.mm.pluginsdk.model.t(linkedList, null), 2, null);
    }

    public final void t() {
        java.lang.String e17;
        java.lang.String g17 = g();
        if (g17 == null || (e17 = e(g17)) == null) {
            return;
        }
        ((com.tencent.mm.sdk.platformtools.o4) f189199c.i()).D("click-exportId-".concat(g17), e17);
        f189217u = g17;
        f189218v = e17;
    }

    public final void u() {
        if (i()) {
            if ((h().o("biz_finder_live_func_flag", 1) & 1) != 0) {
                int o17 = h().o("bar_list_refresh_interval-10", 0);
                if (o17 < 60) {
                    o17 = 60;
                }
                if (java.lang.System.currentTimeMillis() - h().q("live_bar_list_last_refresh_time", 0L) > o17 * 1000) {
                    kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, kotlinx.coroutines.q1.f310570c, null, new com.tencent.mm.pluginsdk.model.k(null), 2, null);
                }
            }
        }
    }

    public final void v(long j17) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1703L, j17, 1L, false);
    }

    public final void w() {
        if (h().f("KeyMainCellRedDotUserName")) {
            h().W("KeyMainCellRedDotUserName");
            h().W("KeyMainRedDotTime");
        }
    }

    public final void x(r45.lk lkVar) {
        java.lang.String str;
        if (lkVar == null || (str = lkVar.f379533d) == null) {
            return;
        }
        com.tencent.mm.sdk.platformtools.v3 v3Var = f189199c;
        com.tencent.mm.sdk.platformtools.o4 o4Var = (com.tencent.mm.sdk.platformtools.o4) v3Var.i();
        java.lang.String c17 = c(str);
        java.lang.String str2 = lkVar.f379534e;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str2 == null) {
            str2 = "";
        }
        o4Var.D(c17, str2);
        ((com.tencent.mm.sdk.platformtools.o4) v3Var.i()).B("saveExportIdTime-".concat(str), java.lang.System.currentTimeMillis());
        ((com.tencent.mm.sdk.platformtools.o4) v3Var.i()).A("refreshInterval-".concat(str), lkVar.f379535f);
        ((com.tencent.mm.sdk.platformtools.o4) v3Var.i()).A("live_scene-".concat(str), lkVar.f379537h);
        try {
            ((com.tencent.mm.sdk.platformtools.o4) v3Var.i()).H("biz_finder_live_info-".concat(str), lkVar.toByteArray());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BizFinderLiveLogic", "saveBizFinderLiveInfo ex " + e17.getMessage());
        }
        boolean z18 = true;
        if (lkVar.f379539m && !f189211o) {
            f189211o = true;
            ((com.tencent.mm.plugin.appbrand.service.f5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f5.class)).Yf(com.tencent.mm.plugin.appbrand.service.x6.D);
        }
        java.lang.String str3 = lkVar.f379534e;
        if (str3 != null && !r26.n0.N(str3)) {
            z18 = false;
        }
        if (z18) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BizFinderLiveLogic", "saveBizFinderLiveInfo " + lkVar.f379533d + ' ' + lkVar.f379534e + " useWeApp:" + lkVar.f379539m);
    }

    public final void y(java.lang.String str, java.lang.String str2) {
        if (str == null || str2 == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BizFinderLiveLogic", "saveFinderLiveRedDotInfo bizUserName=" + str + ", exportId=" + str2);
        h().D("KeyMainCellRedDotUserName", str);
        h().B("KeyMainRedDotTime", c01.w9.p());
    }

    public final void z(int i17, int i18) {
        h().A("bar_list_keep_data_interval-" + i17, i18);
    }
}
