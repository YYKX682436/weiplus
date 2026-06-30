package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class d6 implements com.tencent.mm.modelbase.u0, p94.n0 {

    /* renamed from: t, reason: collision with root package name */
    public static int f164146t = -1;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f164147d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f164148e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f164149f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f164150g = new java.util.HashMap();

    /* renamed from: h, reason: collision with root package name */
    public int f164151h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f164152i = 0;

    /* renamed from: m, reason: collision with root package name */
    public long f164153m = 0;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.Map f164154n = new java.util.HashMap();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f164155o = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.Map f164156p = new java.util.HashMap();

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.model.x6 f164157q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.Set f164158r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.Set f164159s;

    public d6() {
        new java.util.HashMap();
        this.f164157q = new com.tencent.mm.plugin.sns.model.x6();
        this.f164158r = new java.util.HashSet();
        this.f164159s = new java.util.HashSet();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0055, code lost:
    
        r3.LikeUserList.remove(r5);
        r3.LikeCount--;
        r1.field_attrBuf = r3.toByteArray();
        com.tencent.mm.plugin.sns.storage.l1.c(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.model.d6.a(java.lang.String):void");
    }

    public static void d(r45.k76 k76Var, zb4.a aVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dealCommentContentData", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        int a17 = aVar != null ? aVar.a() : 0;
        k76Var.f378477z = a17;
        if (a17 == 1 && aVar.b() != null) {
            com.tencent.mm.api.IEmojiInfo b17 = aVar.b();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getEmojiSize", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
            android.util.Size size = aVar.f471304b;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getEmojiSize", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
            r45.l86 l86Var = new r45.l86();
            l86Var.f379230d = b17.getMd5();
            l86Var.f379232f = size.getWidth();
            l86Var.f379233g = size.getHeight();
            l86Var.f379234h = b17.getSize();
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsService", "dealCommentData >> emojiMd5: %s, width: %d, height: %d size: %d", l86Var.f379230d, java.lang.Integer.valueOf(l86Var.f379232f), java.lang.Integer.valueOf(l86Var.f379233g), java.lang.Integer.valueOf(l86Var.f379234h));
            r45.cu5 cu5Var = new r45.cu5();
            com.tencent.mm.feature.emoji.r4 r4Var = (com.tencent.mm.feature.emoji.r4) ((com.tencent.mm.feature.emoji.api.t6) i95.n0.c(com.tencent.mm.feature.emoji.api.t6.class));
            r4Var.getClass();
            byte[] byteArray = r4Var.Ai(b17).toByteArray();
            com.tencent.mm.protobuf.g gVar = byteArray == null ? null : new com.tencent.mm.protobuf.g(byteArray, 0, byteArray.length);
            if (gVar != null) {
                cu5Var.d(gVar.f192156a);
                l86Var.f379231e = cu5Var;
            }
            java.util.LinkedList linkedList = new java.util.LinkedList();
            k76Var.f378474w = linkedList;
            linkedList.add(l86Var);
            k76Var.f378475x = 1;
        } else if (k76Var.f378477z == 2) {
            r45.d86 d86Var = new r45.d86();
            d86Var.f372226d = aVar.c();
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            k76Var.B = linkedList2;
            linkedList2.add(d86Var);
            k76Var.A = 1;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dealCommentContentData", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
    }

    public static int k() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTimelineControlFlag", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        int i17 = f164146t;
        if (i17 != -1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTimelineControlFlag", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
            return i17;
        }
        android.os.Vibrator vibrator = ca4.z0.f40068a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsFlag", "com.tencent.mm.plugin.sns.data.SnsUtil");
        int i18 = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0).getInt("sns_control_flag", 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsFlag", "com.tencent.mm.plugin.sns.data.SnsUtil");
        f164146t = i18;
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsService", "getTimelineControlFlag %d", java.lang.Integer.valueOf(i18));
        int i19 = f164146t;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTimelineControlFlag", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        return i19;
    }

    public static void l(com.tencent.mm.plugin.sns.storage.v1 v1Var, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("sendBlessMsg", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        r45.k76 k76Var = new r45.k76();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        k76Var.f378464m = (int) (java.lang.System.currentTimeMillis() / 1000);
        k76Var.f378460f = c01.z1.l();
        k76Var.f378458d = c01.z1.r();
        k76Var.f378463i = 0;
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        k76Var.f378461g = c01.a2.e(str);
        k76Var.f378459e = str;
        k76Var.f378462h = 22;
        k76Var.f378466o = (int) v1Var.field_commentSvrID;
        r45.k76 k76Var2 = new r45.k76();
        k76Var2.f378458d = "";
        if (!com.tencent.mm.sdk.platformtools.t8.K0("")) {
            tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
            java.lang.String str2 = k76Var2.f378458d;
            ((sg3.a) v0Var).getClass();
            k76Var2.f378460f = c01.a2.e(str2);
        }
        r45.l76 l76Var = new r45.l76();
        l76Var.f379203d = v1Var.field_snsID;
        l76Var.f379205f = k76Var;
        l76Var.f379206g = k76Var2;
        java.lang.String g17 = kk.k.g(("" + android.os.SystemClock.elapsedRealtime()).getBytes());
        if (com.tencent.mm.plugin.sns.model.l4.xj().a(g17, l76Var, 0)) {
            gm0.j1.i();
            gm0.j1.n().f273288b.g(new com.tencent.mm.plugin.sns.model.n2(l76Var, g17, 0));
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsService", "can not add bless Comment");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("sendBlessMsg", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
    }

    public static r45.e86 m(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17, java.lang.String str, long j17, java.lang.String str2, boolean z17, int i18) {
        java.lang.String str3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("sendComment", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        r45.k76 k76Var = new r45.k76();
        k76Var.f378465n = str;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        k76Var.f378464m = (int) (java.lang.System.currentTimeMillis() / 1000);
        k76Var.f378460f = c01.z1.l();
        k76Var.f378458d = c01.z1.r();
        k76Var.f378463i = i18;
        tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
        java.lang.String userName = snsInfo.getUserName();
        ((sg3.a) v0Var).getClass();
        k76Var.f378461g = c01.a2.e(userName);
        k76Var.f378459e = snsInfo.getUserName();
        k76Var.f378462h = i17;
        if (snsInfo.isSourceExist(32)) {
            k76Var.f378469r = j17;
        } else {
            k76Var.f378466o = (int) j17;
        }
        r45.k76 k76Var2 = new r45.k76();
        k76Var2.f378458d = str2;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            tg3.v0 v0Var2 = (tg3.v0) i95.n0.c(tg3.v0.class);
            java.lang.String str4 = k76Var2.f378458d;
            ((sg3.a) v0Var2).getClass();
            k76Var2.f378460f = c01.a2.e(str4);
        }
        r45.l76 l76Var = new r45.l76();
        l76Var.f379203d = snsInfo.field_snsId;
        l76Var.f379205f = k76Var;
        l76Var.f379206g = k76Var2;
        if (snsInfo.isAd()) {
            com.tencent.mm.plugin.sns.storage.ADInfo adInfo = snsInfo.getAdInfo();
            java.lang.String str5 = adInfo == null ? "" : adInfo.viewId;
            str3 = adInfo == null ? "" : adInfo.uxInfo;
            int i19 = k76Var.f378462h;
            if (i19 == 7) {
                ((p34.p) ((p94.f0) i95.n0.c(p94.f0.class))).Bi(11855, snsInfo.getAdRecSrc(), 1, str5, java.lang.Integer.valueOf(snsInfo.getAdRecSrc()));
            } else if (i19 == 8) {
                ((p34.p) ((p94.f0) i95.n0.c(p94.f0.class))).Bi(11855, snsInfo.getAdRecSrc(), 2, str5, java.lang.Integer.valueOf(snsInfo.getAdRecSrc()));
            }
        } else {
            str3 = "";
        }
        java.lang.String g17 = kk.k.g(("" + android.os.SystemClock.elapsedRealtime()).getBytes());
        if (snsInfo.isSourceExist(32)) {
            g17 = "_AD_TAG_" + g17;
        }
        if (!com.tencent.mm.plugin.sns.model.l4.xj().b(g17, l76Var, str3, i18)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsService", "can not add Comment");
        } else if (com.tencent.mm.plugin.sns.model.i4.n(g17)) {
            gm0.j1.i();
            gm0.j1.n().f273288b.g(new com.tencent.mm.plugin.sns.model.i2(l76Var, g17, str3, 0));
        } else {
            gm0.j1.i();
            gm0.j1.n().f273288b.g(new com.tencent.mm.plugin.sns.model.n2(l76Var, g17, i18));
        }
        if (!z17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("sendComment", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
            return null;
        }
        r45.e86 e86Var = new r45.e86();
        e86Var.f373131i = k76Var.f378464m;
        e86Var.f373129g = k76Var.f378462h;
        e86Var.f373128f = k76Var.f378463i;
        e86Var.f373126d = k76Var.f378458d;
        e86Var.f373127e = k76Var.f378460f;
        e86Var.f373130h = k76Var.f378465n;
        e86Var.f373139t = k76Var.f378472u;
        if (snsInfo.isSourceExist(32)) {
            e86Var.f373136q = j17;
        } else {
            e86Var.f373133n = (int) j17;
        }
        e86Var.f373134o = str2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("sendComment", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        return e86Var;
    }

    public static r45.e86 n(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17, zb4.a aVar, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("sendComment", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("sendComment", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        r45.e86 o17 = o(snsInfo, i17, aVar, null, false, 0, i18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("sendComment", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("sendComment", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        return o17;
    }

    public static r45.e86 o(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17, zb4.a aVar, r45.e86 e86Var, boolean z17, int i18, int i19) {
        long j17;
        java.lang.String str;
        int i27;
        r45.e86 e86Var2;
        com.tencent.mm.plugin.sns.storage.ADInfo adInfo;
        int i28;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("sendComment", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        r45.k76 k76Var = new r45.k76();
        k76Var.f378465n = aVar != null ? aVar.d() : "";
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        k76Var.f378464m = (int) (java.lang.System.currentTimeMillis() / 1000);
        k76Var.f378460f = c01.z1.l();
        k76Var.f378458d = c01.z1.r();
        k76Var.f378463i = 0;
        tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
        java.lang.String userName = snsInfo.getUserName();
        ((sg3.a) v0Var).getClass();
        k76Var.f378461g = c01.a2.e(userName);
        k76Var.f378459e = snsInfo.getUserName();
        k76Var.f378462h = i17;
        k76Var.f378472u = i18;
        if (snsInfo.isSourceExist(32)) {
            k76Var.f378469r = e86Var == null ? 0L : e86Var.f373137r;
        } else {
            k76Var.f378466o = e86Var == null ? 0 : e86Var.f373132m;
        }
        d(k76Var, aVar);
        r45.k76 k76Var2 = new r45.k76();
        java.lang.String str2 = e86Var == null ? "" : e86Var.f373126d;
        k76Var2.f378458d = str2;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            tg3.v0 v0Var2 = (tg3.v0) i95.n0.c(tg3.v0.class);
            java.lang.String str3 = k76Var2.f378458d;
            ((sg3.a) v0Var2).getClass();
            k76Var2.f378460f = c01.a2.e(str3);
        }
        r45.l76 l76Var = new r45.l76();
        l76Var.f379203d = snsInfo.field_snsId;
        l76Var.f379205f = k76Var;
        l76Var.f379206g = k76Var2;
        if (snsInfo.isAd()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsService", "sendComment, sourceScene=" + i19 + ", type=" + i17 + ", flag=" + i18);
            if (i19 == 2) {
                adInfo = snsInfo.getAtAdInfo();
                i28 = 1;
            } else {
                adInfo = snsInfo.getAdInfo();
                i28 = 0;
            }
            java.lang.String str4 = adInfo == null ? "" : adInfo.viewId;
            str = adInfo == null ? "" : adInfo.uxInfo;
            int i29 = k76Var.f378462h;
            if (i29 == 7) {
                ((p34.p) ((p94.f0) i95.n0.c(p94.f0.class))).Bi(11855, snsInfo.getAdRecSrc(), 1, str4, java.lang.Integer.valueOf(snsInfo.getAdRecSrc()));
            } else if (i29 == 8) {
                ((p34.p) ((p94.f0) i95.n0.c(p94.f0.class))).Bi(11855, snsInfo.getAdRecSrc(), 2, str4, java.lang.Integer.valueOf(snsInfo.getAdRecSrc()));
            }
            com.tencent.mm.plugin.sns.storage.AdSnsInfo adSnsInfo = snsInfo.getAdSnsInfo();
            if (adSnsInfo != null) {
                if (adSnsInfo.field_firstControlTime == 0) {
                    adSnsInfo.field_firstControlTime = k76Var.f378464m;
                    com.tencent.mm.plugin.sns.model.l4.Vi().b1(adSnsInfo.field_snsId, adSnsInfo);
                }
                r45.o3 remindInfoGroup = adSnsInfo.getRemindInfoGroup();
                if (i19 == 2) {
                    if (remindInfoGroup != null) {
                        r45.k76 k76Var3 = l76Var.f379205f;
                        r45.mo5 mo5Var = remindInfoGroup.f381862e;
                        k76Var3.f378473v = mo5Var;
                        if (mo5Var != null) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.SnsService", "atFriend remindInfo aid64 %d, aid %d", java.lang.Long.valueOf(mo5Var.f380718i), java.lang.Integer.valueOf(remindInfoGroup.f381862e.f380713d));
                            r45.mo5 mo5Var2 = remindInfoGroup.f381862e;
                            if (mo5Var2.f380718i == 0 && mo5Var2.f380713d == 0) {
                                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(nd1.j0.CTRL_INDEX, 9);
                            }
                        } else {
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(nd1.j0.CTRL_INDEX, 7);
                            com.tencent.mars.xlog.Log.i("MicroMsg.SnsService", "remindInfo is null!");
                        }
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.SnsService", "remindInfo group is null!");
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(nd1.j0.CTRL_INDEX, 5);
                    }
                } else if (com.tencent.mm.plugin.sns.ui.widget.t2.i(i18, 8)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsService", "sendAtFriend");
                    if (remindInfoGroup != null) {
                        r45.mo5 mo5Var3 = remindInfoGroup.f381861d;
                        if (mo5Var3 != null) {
                            l76Var.f379205f.f378473v = mo5Var3;
                            com.tencent.mars.xlog.Log.i("MicroMsg.SnsService", "timeline remindInfo aid64 %d, aid %d", java.lang.Long.valueOf(mo5Var3.f380718i), java.lang.Integer.valueOf(remindInfoGroup.f381861d.f380713d));
                            r45.mo5 mo5Var4 = remindInfoGroup.f381861d;
                            if (mo5Var4.f380718i == 0 && mo5Var4.f380713d == 0) {
                                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(nd1.j0.CTRL_INDEX, 8);
                            }
                        } else {
                            r45.mo5 mo5Var5 = remindInfoGroup.f381862e;
                            if (mo5Var5 != null) {
                                l76Var.f379205f.f378473v = mo5Var5;
                                com.tencent.mars.xlog.Log.i("MicroMsg.SnsService", "atFriend remindInfo aid64 %d, aid %d", java.lang.Long.valueOf(mo5Var5.f380718i), java.lang.Integer.valueOf(remindInfoGroup.f381862e.f380713d));
                                r45.mo5 mo5Var6 = remindInfoGroup.f381862e;
                                j17 = 0;
                                if (mo5Var6.f380718i == 0 && mo5Var6.f380713d == 0) {
                                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(nd1.j0.CTRL_INDEX, 8);
                                }
                            } else {
                                j17 = 0;
                                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(nd1.j0.CTRL_INDEX, 6);
                                com.tencent.mars.xlog.Log.i("MicroMsg.SnsService", "remindInfo is null!");
                            }
                        }
                    } else {
                        j17 = 0;
                        com.tencent.mars.xlog.Log.i("MicroMsg.SnsService", "remindInfo group is null!");
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(nd1.j0.CTRL_INDEX, 5);
                    }
                    i27 = i28;
                }
            }
            j17 = 0;
            i27 = i28;
        } else {
            j17 = 0;
            str = "";
            i27 = 0;
        }
        java.lang.String g17 = kk.k.g(("" + android.os.SystemClock.elapsedRealtime()).getBytes());
        if (snsInfo.isSourceExist(32)) {
            g17 = "_AD_TAG_" + g17;
        }
        if (!com.tencent.mm.plugin.sns.model.l4.xj().a(g17, l76Var, i19)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsService", "can not add Comment");
        } else if (com.tencent.mm.plugin.sns.model.i4.n(g17)) {
            gm0.j1.i();
            gm0.j1.n().f273288b.g(new com.tencent.mm.plugin.sns.model.i2(l76Var, g17, str, i27));
        } else {
            gm0.j1.i();
            gm0.j1.n().f273288b.g(new com.tencent.mm.plugin.sns.model.n2(l76Var, g17, i19));
        }
        if (!z17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("sendComment", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
            return null;
        }
        r45.e86 e86Var3 = new r45.e86();
        e86Var3.f373131i = k76Var.f378464m;
        e86Var3.f373129g = k76Var.f378462h;
        e86Var3.f373128f = k76Var.f378463i;
        e86Var3.f373126d = k76Var.f378458d;
        e86Var3.f373127e = k76Var.f378460f;
        e86Var3.f373130h = k76Var.f378465n;
        e86Var3.f373139t = k76Var.f378472u;
        e86Var3.f373144y = k76Var.f378477z;
        e86Var3.f373140u = k76Var.f378474w;
        e86Var3.f373141v = k76Var.f378475x;
        e86Var3.A = k76Var.B;
        e86Var3.f373145z = k76Var.A;
        if (snsInfo.isSourceExist(32)) {
            e86Var2 = e86Var;
            e86Var3.f373136q = e86Var2 == null ? j17 : e86Var2.f373137r;
        } else {
            e86Var2 = e86Var;
            e86Var3.f373133n = e86Var2 == null ? 0 : e86Var2.f373132m;
        }
        e86Var3.f373134o = e86Var2 != null ? e86Var2.f373126d : "";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("sendComment", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        return e86Var3;
    }

    public static void p(java.lang.String str, int i17, zb4.a aVar, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("sendCommentToStranger", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        if (i17 != 3 && i17 != 5) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("sendCommentToStranger", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
            return;
        }
        r45.k76 k76Var = new r45.k76();
        k76Var.f378465n = aVar == null ? "" : aVar.d();
        k76Var.f378464m = (int) (java.lang.System.currentTimeMillis() / 1000);
        k76Var.f378460f = c01.z1.l();
        k76Var.f378458d = c01.z1.r();
        k76Var.f378463i = i18;
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        k76Var.f378461g = c01.a2.e(str);
        k76Var.f378459e = str;
        k76Var.f378462h = i17;
        d(k76Var, aVar);
        r45.l76 l76Var = new r45.l76();
        l76Var.f379203d = snsInfo.field_snsId;
        l76Var.f379205f = k76Var;
        l76Var.f379206g = new r45.k76();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(android.os.SystemClock.elapsedRealtime());
        java.lang.String g17 = kk.k.g(sb6.toString().getBytes());
        long j17 = snsInfo.field_snsId;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("insertCommentStg", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        try {
            com.tencent.mm.plugin.sns.storage.v1 v1Var = new com.tencent.mm.plugin.sns.storage.v1();
            v1Var.field_talker = str;
            v1Var.field_snsID = j17;
            v1Var.field_createTime = (int) (java.lang.System.currentTimeMillis() / 1000);
            v1Var.field_curActionBuf = k76Var.toByteArray();
            v1Var.field_type = i17;
            v1Var.field_isSend = true;
            v1Var.field_isRead = (short) 1;
            v1Var.field_msgRelevanceType = com.tencent.mm.plugin.sns.ui.widget.t2.g(k76Var, null);
            com.tencent.mm.plugin.sns.model.l4.Aj().insert(v1Var);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SnsService", e17, "", new java.lang.Object[0]);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("insertCommentStg", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        com.tencent.mm.plugin.sns.model.l4.xj().a(g17, l76Var, i18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("sendCommentToStranger", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
    }

    public static r45.e86 q(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17, zb4.a aVar, r45.e86 e86Var, int i18, int i19) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("sendCommentWithFlag", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        r45.e86 r17 = r(snsInfo, i17, aVar, e86Var, false, i18, i19);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("sendCommentWithFlag", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        return r17;
    }

    public static r45.e86 r(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17, zb4.a aVar, r45.e86 e86Var, boolean z17, int i18, int i19) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("sendCommentWithFlag", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        r45.e86 o17 = o(snsInfo, i17, aVar, e86Var, z17, i18, i19);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("sendCommentWithFlag", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        return o17;
    }

    public void b(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("cleanGalleryItem", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        ((java.util.HashMap) this.f164156p).remove(str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("cleanGalleryItem", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
    }

    public boolean c(p94.m0 m0Var, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("closeServer", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        ((java.util.HashMap) this.f164154n).remove(m0Var);
        if ((i17 == 2 || i17 == 10 || i17 == 11) && this.f164155o.size() > 0) {
            this.f164155o.removeLast();
        }
        if (((java.util.HashMap) this.f164154n).isEmpty()) {
            gm0.j1.i();
            gm0.j1.n().f273288b.q(211, this);
            gm0.j1.i();
            gm0.j1.n().f273288b.q(212, this);
            gm0.j1.i();
            gm0.j1.n().f273288b.q(5203, this);
            ((java.util.HashSet) this.f164158r).clear();
            java.util.Map map = com.tencent.mm.plugin.sns.model.f6.f164192a;
            synchronized (com.tencent.mm.plugin.sns.model.f6.class) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("release", "com.tencent.mm.plugin.sns.model.SnsPathHelper");
                ((java.util.HashMap) com.tencent.mm.plugin.sns.model.f6.f164192a).clear();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("release", "com.tencent.mm.plugin.sns.model.SnsPathHelper");
            }
            com.tencent.mm.plugin.sns.storage.SnsInfo.release();
            new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).postDelayed(new com.tencent.mm.plugin.sns.model.x5(this), 5000L);
            int i18 = com.tencent.mm.plugin.sns.model.s5.f164676d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("cleanCacheObj", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            java.util.Map map2 = com.tencent.mm.plugin.sns.model.s5.f164678f;
            if (map2 != null) {
                ((java.util.concurrent.ConcurrentHashMap) map2).clear();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("cleanCacheObj", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsService", "close finish");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("closeServer", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        return true;
    }

    public void e(int i17, java.lang.String str, boolean z17, boolean z18, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doFpList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        if (x51.o1.f452052f) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doFpList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
            return;
        }
        boolean m47 = com.tencent.mm.storage.z3.m4(str);
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.SnsService", "doFpList type: %s, objectId: %s", java.lang.Integer.valueOf(i17), str);
        com.tencent.mm.autogen.events.SnsTimelineRefreshEvent snsTimelineRefreshEvent = new com.tencent.mm.autogen.events.SnsTimelineRefreshEvent();
        snsTimelineRefreshEvent.f54844g.f6193a = 1;
        snsTimelineRefreshEvent.e();
        if (i17 == 2) {
            if (m47) {
                com.tencent.mm.plugin.sns.model.l4.Uj().post(new com.tencent.mm.plugin.sns.model.z5(this, str, z18, i18, i17));
            } else {
                com.tencent.mm.plugin.sns.model.l4.Uj().post(new com.tencent.mm.plugin.sns.model.y5(this, str, z18, i18, i17));
            }
        } else if (i17 == 1) {
            if (!com.tencent.mm.plugin.sns.model.h3.H("@__weixintimtline")) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doFpList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                return;
            }
            com.tencent.mm.plugin.sns.model.l4.Mj().getClass();
            com.tencent.mm.plugin.sns.model.l4.Mj().f164741c = com.tencent.mm.plugin.sns.model.l4.Fj().h2(0L, 1, true);
            gm0.j1.i();
            gm0.j1.u().c().w(68377, "");
            gm0.j1.i();
            gm0.j1.n().f273288b.g(new com.tencent.mm.plugin.sns.model.h3(0L, 0L, 0));
        } else if (i17 != 3) {
            if (i17 == 4) {
                if (!com.tencent.mm.plugin.sns.model.m2.H("@__classify_timeline")) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doFpList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                    return;
                } else {
                    gm0.j1.i();
                    gm0.j1.n().f273288b.g(new com.tencent.mm.plugin.sns.model.m2(0L, ""));
                }
            } else if (i17 == 10) {
                if (m47) {
                    com.tencent.mm.plugin.sns.model.l4.Uj().post(new com.tencent.mm.plugin.sns.model.b6(this, str, z18, i18, i17));
                } else {
                    com.tencent.mm.plugin.sns.model.l4.Uj().post(new com.tencent.mm.plugin.sns.model.a6(this, str, z18, i18, i17));
                }
            } else if (i17 == 11) {
                com.tencent.mm.plugin.sns.model.l4.Uj().post(new com.tencent.mm.plugin.sns.model.c6(this, str, z18, i18, i17));
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doFpList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
    }

    public boolean f(int i17, java.lang.String str, boolean z17, boolean z18, int i18) {
        long longValue;
        long longValue2;
        long longValue3;
        long longValue4;
        long longValue5;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doNpList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        if (x51.o1.f452052f) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doNpList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
            return false;
        }
        synchronized (this.f164147d) {
            try {
                com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.SnsService", "DO NP\u3000NP ~_~ %s type %s timeLastId: %s userLastIds: %s", str, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(this.f164152i), this.f164147d);
            } finally {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doNpList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
            }
        }
        boolean m47 = com.tencent.mm.storage.z3.m4(str);
        if (i17 == 2) {
            if (m47) {
                if (!com.tencent.mm.plugin.sns.model.q3.H(str)) {
                    ((java.util.HashSet) this.f164159s).add(str);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doNpList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                    return false;
                }
                synchronized (this.f164147d) {
                    try {
                        longValue4 = ((java.util.HashMap) this.f164147d).containsKey(str) ? ((java.lang.Long) ((java.util.HashMap) this.f164147d).get(str)).longValue() : 0L;
                    } finally {
                    }
                }
                if (longValue4 == 0) {
                    com.tencent.mm.plugin.sns.model.q3.M(str);
                    ((java.util.HashSet) this.f164159s).add(str);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doNpList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                    return false;
                }
                gm0.j1.i();
                gm0.j1.n().f273288b.g(new com.tencent.mm.plugin.sns.model.q3(str, longValue4, z18, i18, -1, 0, z18 ? 4 : 8, i17));
            } else {
                if (!com.tencent.mm.plugin.sns.model.n3.H(str)) {
                    ((java.util.HashSet) this.f164159s).add(str);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doNpList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                    return false;
                }
                synchronized (this.f164147d) {
                    try {
                        longValue5 = ((java.util.HashMap) this.f164147d).containsKey(str) ? ((java.lang.Long) ((java.util.HashMap) this.f164147d).get(str)).longValue() : 0L;
                    } finally {
                    }
                }
                if (longValue5 == 0) {
                    com.tencent.mm.plugin.sns.model.n3.L(str);
                    ((java.util.HashSet) this.f164159s).add(str);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doNpList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                    return false;
                }
                gm0.j1.i();
                gm0.j1.n().f273288b.g(new com.tencent.mm.plugin.sns.model.n3(str, longValue5, z18, i18, -1, 0, z18 ? 4 : 8, i17));
            }
        } else if (i17 == 1) {
            if (!com.tencent.mm.plugin.sns.model.h3.H("@__weixintimtline")) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Improve.DataFlow", "addTimeLineReq error");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doNpList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                return false;
            }
            if (this.f164152i == 0) {
                com.tencent.mm.plugin.sns.model.h3.L("@__weixintimtline");
                com.tencent.mars.xlog.Log.e("MicroMsg.Improve.DataFlow", "load more but timeLastId = 0");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doNpList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                return false;
            }
            com.tencent.mm.plugin.sns.model.l4.Mj().getClass();
            gm0.j1.i();
            gm0.j1.n().f273288b.g(new com.tencent.mm.plugin.sns.model.h3(this.f164152i, 0L, 0));
        } else if (i17 != 3) {
            if (i17 == 4) {
                if (!com.tencent.mm.plugin.sns.model.m2.H("@__classify_timeline")) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doNpList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                    return false;
                }
                if (this.f164152i == 0) {
                    com.tencent.mm.plugin.sns.model.m2.I("@__classify_timeline");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doNpList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                    return false;
                }
                gm0.j1.i();
                gm0.j1.n().f273288b.g(new com.tencent.mm.plugin.sns.model.m2(0L, ""));
            } else if (i17 == 10) {
                if (m47) {
                    if (!com.tencent.mm.plugin.sns.model.q3.H(str)) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doNpList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                        return false;
                    }
                    synchronized (this.f164149f) {
                        try {
                            longValue2 = ((java.util.HashMap) this.f164149f).containsKey(str) ? ((java.lang.Long) ((java.util.HashMap) this.f164149f).get(str)).longValue() : 0L;
                        } finally {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doNpList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                        }
                    }
                    if (longValue2 == 0) {
                        com.tencent.mm.plugin.sns.model.q3.M(str);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doNpList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                        return false;
                    }
                    gm0.j1.i();
                    gm0.j1.n().f273288b.g(new com.tencent.mm.plugin.sns.model.q3(str, longValue2, z18, i18, -1, 1, 64, i17));
                } else {
                    if (!com.tencent.mm.plugin.sns.model.n3.H(str)) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doNpList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                        return false;
                    }
                    synchronized (this.f164149f) {
                        try {
                            longValue3 = ((java.util.HashMap) this.f164149f).containsKey(str) ? ((java.lang.Long) ((java.util.HashMap) this.f164149f).get(str)).longValue() : 0L;
                        } finally {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doNpList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                        }
                    }
                    if (longValue3 == 0) {
                        com.tencent.mm.plugin.sns.model.n3.L(str);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doNpList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                        return false;
                    }
                    gm0.j1.i();
                    gm0.j1.n().f273288b.g(new com.tencent.mm.plugin.sns.model.n3(str, longValue3, z18, i18, -1, 1, 64, i17));
                }
            } else if (i17 == 11) {
                if (!com.tencent.mm.plugin.sns.model.n3.H(str)) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doNpList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                    return false;
                }
                synchronized (this.f164149f) {
                    try {
                        longValue = ((java.util.HashMap) this.f164149f).containsKey(str) ? ((java.lang.Long) ((java.util.HashMap) this.f164149f).get(str)).longValue() : 0L;
                    } finally {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doNpList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                    }
                }
                if (longValue == 0) {
                    com.tencent.mm.plugin.sns.model.n3.L(str);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doNpList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                    return false;
                }
                gm0.j1.i();
                gm0.j1.n().f273288b.g(new com.tencent.mm.plugin.sns.model.n3(str, longValue, z18, i18, -1, 2, 64, i17));
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doNpList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        return true;
    }

    public void g(int i17, java.lang.String str, int i18, boolean z17, long j17, int i19) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doOtherList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsService", "doOtherList fetchType:%s, type:%s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17));
        if (i17 == 2) {
            if (!com.tencent.mm.plugin.sns.model.n3.H(str)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doOtherList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                return;
            }
            if (i18 == 0) {
                this.f164157q.a(str, z17, i19, j17, i17);
            } else if (i18 == 1) {
                this.f164157q.b(str, z17, i19, j17, i17);
            } else if (i18 == 2) {
                this.f164157q.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doDownFetch", "com.tencent.mm.plugin.sns.model.SnsUpDownServerHelper");
                gm0.j1.i();
                gm0.j1.n().f273288b.g(new com.tencent.mm.plugin.sns.model.n3(str, com.tencent.mm.plugin.sns.model.s5.f164674b, z17, i19, 2, 0, z17 ? 4 : 8, 2));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doDownFetch", "com.tencent.mm.plugin.sns.model.SnsUpDownServerHelper");
            }
        } else if (i17 == 1) {
            if (!com.tencent.mm.plugin.sns.model.h3.H("@__weixintimtline")) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doOtherList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                return;
            }
            com.tencent.mm.plugin.sns.model.l4.Mj().getClass();
            if (i18 == 0) {
                this.f164157q.a(str, z17, i19, j17, i17);
            } else if (i18 == 1) {
                com.tencent.mm.plugin.sns.model.l4.Mj().getClass();
                this.f164157q.b(str, z17, i19, this.f164153m, i17);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doOtherList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
    }

    public android.content.Intent h(android.content.Intent intent, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getIntent", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        intent.putExtra("sns_userName", str);
        java.util.LinkedList linkedList = this.f164155o;
        if (linkedList == null || !linkedList.contains(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getIntent", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
            return intent;
        }
        intent.addFlags(com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING);
        intent.addFlags(67108864);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getIntent", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        return intent;
    }

    public int i() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRespCount", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        int i17 = this.f164151h;
        if (i17 <= 0) {
            i17 = ca4.z0.P();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRespCount", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        return i17;
    }

    public int j(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRespCount", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        synchronized (this.f164148e) {
            try {
                if (!((java.util.HashMap) this.f164148e).containsKey(str)) {
                    int P = ca4.z0.P();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRespCount", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                    return P;
                }
                int intValue = ((java.lang.Integer) ((java.util.HashMap) this.f164148e).get(str)).intValue();
                if (intValue <= 0) {
                    intValue = ca4.z0.P();
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRespCount", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                return intValue;
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRespCount", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                throw th6;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x016c  */
    @Override // com.tencent.mm.modelbase.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onSceneEnd(int r31, int r32, java.lang.String r33, com.tencent.mm.modelbase.m1 r34) {
        /*
            Method dump skipped, instructions count: 898
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.model.d6.onSceneEnd(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }

    public void s(java.lang.String str, java.util.ArrayList arrayList) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setGalleryItem", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        ((java.util.HashMap) this.f164156p).put(str, arrayList);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setGalleryItem", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
    }

    public void t(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTimeFirstId", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.SnsService", "setTimeFirstId %d", java.lang.Long.valueOf(j17));
        if (j17 == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTimeFirstId", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        } else {
            this.f164153m = j17;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTimeFirstId", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        }
    }

    public void u(long j17, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTimeLastId", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.SnsService", "setTimeLastId %d", java.lang.Long.valueOf(j17));
        if (i17 > 0) {
            this.f164151h = i17;
            android.os.Vibrator vibrator = ca4.z0.f40068a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("putSnsResponeCount", "com.tencent.mm.plugin.sns.data.SnsUtil");
            com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0).edit().putInt("sns_respone_count", i17).commit();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("putSnsResponeCount", "com.tencent.mm.plugin.sns.data.SnsUtil");
        }
        if (j17 == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTimeLastId", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        } else {
            this.f164152i = j17;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTimeLastId", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        }
    }

    public void v(java.lang.String str, long j17, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setUserLastId", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        if (i18 == 10 || i18 == 11) {
            if (i17 > 0) {
                synchronized (this.f164150g) {
                    try {
                        ((java.util.HashMap) this.f164150g).put(str, java.lang.Integer.valueOf(i17));
                    } finally {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setUserLastId", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                    }
                }
            }
            if (j17 == 0) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setUserLastId", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                return;
            }
            synchronized (this.f164149f) {
                try {
                    ((java.util.HashMap) this.f164149f).put(str, java.lang.Long.valueOf(j17));
                } finally {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setUserLastId", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                }
            }
        } else {
            if (i17 > 0) {
                synchronized (this.f164148e) {
                    try {
                        ((java.util.HashMap) this.f164148e).put(str, java.lang.Integer.valueOf(i17));
                    } finally {
                    }
                }
            }
            if (j17 == 0) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setUserLastId", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                return;
            }
            synchronized (this.f164147d) {
                try {
                    ((java.util.HashMap) this.f164147d).put(str, java.lang.Long.valueOf(j17));
                } finally {
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setUserLastId", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
    }

    public void w(int i17, java.lang.String str, p94.m0 m0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startServer", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsService", "startServer " + i17 + " " + m0Var);
        boolean m47 = com.tencent.mm.storage.z3.m4(str);
        com.tencent.mm.plugin.sns.model.i4 xj6 = com.tencent.mm.plugin.sns.model.l4.xj();
        java.lang.String r17 = c01.z1.r();
        xj6.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSelfName", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        xj6.f164300c = r17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSelfName", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        com.tencent.mm.plugin.sns.model.l4.xj().g();
        com.tencent.mm.plugin.sns.model.l4.Nj().d();
        if (!m47 && !((java.util.HashSet) this.f164158r).contains(211) && !((java.util.HashSet) this.f164158r).contains(212)) {
            gm0.j1.i();
            gm0.j1.n().f273288b.a(211, this);
            gm0.j1.i();
            gm0.j1.n().f273288b.a(212, this);
            ((java.util.HashSet) this.f164158r).add(211);
            ((java.util.HashSet) this.f164158r).add(212);
        } else if (m47 && !((java.util.HashSet) this.f164158r).contains(5203)) {
            gm0.j1.i();
            gm0.j1.n().f273288b.a(5203, this);
            ((java.util.HashSet) this.f164158r).add(5203);
        }
        if (!((java.util.HashMap) this.f164154n).containsKey(m0Var)) {
            if (i17 == 1) {
                ((java.util.HashMap) this.f164154n).put(m0Var, "@__weixintimtline");
            } else if (i17 == 2 || i17 == 3 || i17 == 10 || i17 == 11) {
                java.util.LinkedList linkedList = new java.util.LinkedList();
                for (p94.m0 m0Var2 : ((java.util.HashMap) this.f164154n).keySet()) {
                    if (str.equals((java.lang.String) ((java.util.HashMap) this.f164154n).get(m0Var2))) {
                        linkedList.add(m0Var2);
                    }
                }
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    ((java.util.HashMap) this.f164154n).remove((p94.m0) it.next());
                }
                ((java.util.HashMap) this.f164154n).put(m0Var, str);
            } else if (i17 == 4) {
                ((java.util.HashMap) this.f164154n).put(m0Var, "@__classify_timeline");
            } else if (i17 == 5) {
                ((java.util.HashMap) this.f164154n).put(m0Var, "");
            } else {
                ((java.util.HashMap) this.f164154n).put(m0Var, "");
            }
        }
        if (i17 == 1) {
            this.f164152i = 0L;
            this.f164151h = i();
            com.tencent.mm.plugin.sns.model.h3.L("@__weixintimtline");
        } else if (i17 == 2) {
            synchronized (this.f164147d) {
                try {
                    ((java.util.HashMap) this.f164147d).put(str, 0L);
                } finally {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startServer", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                }
            }
            synchronized (this.f164148e) {
                try {
                    if (!((java.util.HashMap) this.f164148e).containsKey(str)) {
                        ((java.util.HashMap) this.f164148e).put(str, java.lang.Integer.valueOf(i()));
                    }
                } finally {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startServer", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                }
            }
            if (m47) {
                com.tencent.mm.plugin.sns.model.q3.M(str);
            } else {
                com.tencent.mm.plugin.sns.model.n3.L(str);
            }
            this.f164155o.add(str);
        } else if (i17 == 10 || i17 == 11) {
            synchronized (this.f164149f) {
                try {
                    ((java.util.HashMap) this.f164149f).put(str, 0L);
                } finally {
                }
            }
            synchronized (this.f164150g) {
                try {
                    if (!((java.util.HashMap) this.f164150g).containsKey(str)) {
                        ((java.util.HashMap) this.f164150g).put(str, java.lang.Integer.valueOf(i()));
                    }
                } finally {
                }
            }
            if (m47) {
                com.tencent.mm.plugin.sns.model.q3.M(str);
            } else {
                com.tencent.mm.plugin.sns.model.n3.L(str);
            }
            this.f164155o.add(str);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startServer", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
    }
}
