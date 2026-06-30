package com.tencent.mm.plugin.finder.report;

/* loaded from: classes8.dex */
public final class x2 {

    /* renamed from: a */
    public static final com.tencent.mm.plugin.finder.report.x2 f125429a = new com.tencent.mm.plugin.finder.report.x2();

    /* renamed from: b */
    public static final jz5.g f125430b = jz5.h.b(com.tencent.mm.plugin.finder.report.w2.f125419d);

    /* renamed from: c */
    public static java.lang.String f125431c = "";

    public static void g(com.tencent.mm.plugin.finder.report.x2 x2Var, java.lang.String currUI, com.tencent.mm.plugin.finder.extension.reddot.jb ctrInfo, r45.f03 showInfo, int i17, java.lang.String str, int i18, java.lang.String str2, java.lang.String str3, int i19, zy2.na naVar, int i27, java.lang.Object obj) {
        java.lang.String contextId = (i27 & 16) != 0 ? "" : str;
        int i28 = (i27 & 32) != 0 ? 0 : i18;
        java.lang.String clickTabContextId = (i27 & 64) != 0 ? "" : str2;
        java.lang.String clickSubTabContextid = (i27 & 128) != 0 ? "" : str3;
        int i29 = (i27 & 256) != 0 ? 0 : i19;
        zy2.na dslRenderInfo = (i27 & 512) != 0 ? new zy2.na(null, 0, false, null, 0, null, null, 127, null) : naVar;
        x2Var.getClass();
        kotlin.jvm.internal.o.g(currUI, "currUI");
        kotlin.jvm.internal.o.g(ctrInfo, "ctrInfo");
        kotlin.jvm.internal.o.g(showInfo, "showInfo");
        kotlin.jvm.internal.o.g(contextId, "contextId");
        kotlin.jvm.internal.o.g(clickTabContextId, "clickTabContextId");
        kotlin.jvm.internal.o.g(clickSubTabContextid, "clickSubTabContextid");
        kotlin.jvm.internal.o.g(dslRenderInfo, "dslRenderInfo");
        r45.qt2 qt2Var = new r45.qt2();
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        qt2Var.set(0, Ri != null ? Ri : "");
        qt2Var.set(1, contextId);
        qt2Var.set(2, clickTabContextId);
        h(x2Var, currUI, ctrInfo, showInfo, i17, qt2Var, i28, 0, clickSubTabContextid, i29, 0, null, 0, dslRenderInfo, 3648, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x057b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x07c3  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x040d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02c5 A[LOOP:0: B:62:0x02bf->B:64:0x02c5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0473  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void h(com.tencent.mm.plugin.finder.report.x2 r32, java.lang.String r33, com.tencent.mm.plugin.finder.extension.reddot.jb r34, r45.f03 r35, int r36, r45.qt2 r37, int r38, int r39, java.lang.String r40, int r41, int r42, java.lang.String r43, int r44, zy2.na r45, int r46, java.lang.Object r47) {
        /*
            Method dump skipped, instructions count: 2002
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.report.x2.h(com.tencent.mm.plugin.finder.report.x2, java.lang.String, com.tencent.mm.plugin.finder.extension.reddot.jb, r45.f03, int, r45.qt2, int, int, java.lang.String, int, int, java.lang.String, int, zy2.na, int, java.lang.Object):void");
    }

    public static void i(com.tencent.mm.plugin.finder.report.x2 x2Var, java.lang.String currUI, com.tencent.mm.plugin.finder.extension.reddot.jb ctrInfo, r45.f03 showInfo, int i17, r45.qt2 qt2Var, int i18, java.lang.String str, int i19, int i27, int i28, java.lang.Object obj) {
        r45.qt2 qt2Var2 = (i28 & 16) != 0 ? null : qt2Var;
        int i29 = (i28 & 32) != 0 ? 0 : i18;
        java.lang.String title = (i28 & 64) != 0 ? "" : str;
        int i37 = (i28 & 128) != 0 ? 0 : i19;
        int i38 = (i28 & 256) != 0 ? 0 : i27;
        x2Var.getClass();
        kotlin.jvm.internal.o.g(currUI, "currUI");
        kotlin.jvm.internal.o.g(ctrInfo, "ctrInfo");
        kotlin.jvm.internal.o.g(showInfo, "showInfo");
        kotlin.jvm.internal.o.g(title, "title");
        h(x2Var, currUI, ctrInfo, showInfo, i17, qt2Var2, i38, i37, "", i29, 0, title, 0, null, 6656, null);
    }

    public static void j(com.tencent.mm.plugin.finder.report.x2 x2Var, com.tencent.mm.plugin.finder.extension.reddot.jb ctrInfo, r45.f03 showInfo, int i17, int i18, java.lang.String whiteListReddotList, java.lang.String overwriteTipsId, int i19, java.lang.Object obj) {
        if ((i19 & 8) != 0) {
            i18 = 2;
        }
        if ((i19 & 16) != 0) {
            whiteListReddotList = "";
        }
        if ((i19 & 32) != 0) {
            overwriteTipsId = "";
        }
        x2Var.getClass();
        kotlin.jvm.internal.o.g(ctrInfo, "ctrInfo");
        kotlin.jvm.internal.o.g(showInfo, "showInfo");
        kotlin.jvm.internal.o.g(whiteListReddotList, "whiteListReddotList");
        kotlin.jvm.internal.o.g(overwriteTipsId, "overwriteTipsId");
        com.tencent.mm.autogen.mmdata.rpt.RedDotFakeClickClearStruct redDotFakeClickClearStruct = new com.tencent.mm.autogen.mmdata.rpt.RedDotFakeClickClearStruct();
        redDotFakeClickClearStruct.f59889d = ctrInfo.getType();
        redDotFakeClickClearStruct.f59890e = showInfo.f373887d;
        redDotFakeClickClearStruct.f59891f = i17;
        redDotFakeClickClearStruct.f59892g = redDotFakeClickClearStruct.b("RedDotTipsID", ctrInfo.field_tipsId, true);
        redDotFakeClickClearStruct.f59893h = redDotFakeClickClearStruct.b("RedDotShowInfoPath", showInfo.f373892i, true);
        redDotFakeClickClearStruct.f59894i = i18;
        redDotFakeClickClearStruct.f59895j = redDotFakeClickClearStruct.b("WhiteListReddotList", whiteListReddotList, true);
        redDotFakeClickClearStruct.f59896k = redDotFakeClickClearStruct.b("OverwriteRedDotTipsID", overwriteTipsId, true);
        redDotFakeClickClearStruct.f59897l = c01.id.c();
        org.json.JSONObject json = ctrInfo.W0().toJSON();
        json.put("object_id", pm0.v.u(ctrInfo.W0().getLong(0)));
        java.lang.String jSONObject = json.toString();
        kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
        redDotFakeClickClearStruct.f59898m = redDotFakeClickClearStruct.b("RedDotShowInfoExt", r26.i0.t(jSONObject, ",", ";", false), true);
        redDotFakeClickClearStruct.k();
        ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Zk(redDotFakeClickClearStruct);
    }

    public static /* synthetic */ void l(com.tencent.mm.plugin.finder.report.x2 x2Var, com.tencent.mm.plugin.finder.extension.reddot.jb jbVar, r45.f03 f03Var, int i17, java.lang.String str, long j17, int i18, java.lang.Object obj) {
        if ((i18 & 8) != 0) {
            str = "";
        }
        java.lang.String str2 = str;
        if ((i18 & 16) != 0) {
            j17 = 0;
        }
        x2Var.k(jbVar, f03Var, i17, str2, j17);
    }

    public static void m(com.tencent.mm.plugin.finder.report.x2 x2Var, r45.vs2 ctrlInfo, r45.f03 showInfo, int i17, java.lang.String str, long j17, int i18, java.lang.Object obj) {
        if ((i18 & 8) != 0) {
            str = "";
        }
        if ((i18 & 16) != 0) {
            j17 = 0;
        }
        x2Var.getClass();
        kotlin.jvm.internal.o.g(ctrlInfo, "ctrlInfo");
        kotlin.jvm.internal.o.g(showInfo, "showInfo");
        com.tencent.mm.autogen.mmdata.rpt.FinderRedDotPushDropStruct finderRedDotPushDropStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderRedDotPushDropStruct();
        finderRedDotPushDropStruct.f57730d = ctrlInfo.f388487e;
        finderRedDotPushDropStruct.f57731e = finderRedDotPushDropStruct.b("RedDotTipsID", ctrlInfo.f388490h, true);
        finderRedDotPushDropStruct.f57732f = finderRedDotPushDropStruct.b("RedDotShowInfoPath", showInfo.f373892i, true);
        finderRedDotPushDropStruct.f57733g = finderRedDotPushDropStruct.b("RedDotShowInfoParentPath", showInfo.f373893m, true);
        com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = new com.tencent.mm.plugin.finder.extension.reddot.jb();
        jbVar.t0(ctrlInfo);
        finderRedDotPushDropStruct.f57735i = finderRedDotPushDropStruct.b("objectId", pm0.v.u(jbVar.W0().getLong(0)), true);
        finderRedDotPushDropStruct.f57736j = finderRedDotPushDropStruct.b(dm.i4.COL_USERNAME, jbVar.W0().getString(3), true);
        java.lang.String jSONObject = jbVar.W0().toJSON().toString();
        kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
        finderRedDotPushDropStruct.f57737k = finderRedDotPushDropStruct.b("reportExtInfo", r26.i0.t(jSONObject, ",", ";", false), true);
        finderRedDotPushDropStruct.f57738l = i17;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = f125431c;
        }
        finderRedDotPushDropStruct.f57739m = finderRedDotPushDropStruct.b("ContextID", str, true);
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        finderRedDotPushDropStruct.f57742p = finderRedDotPushDropStruct.b(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, Ri != null ? Ri : "", true);
        finderRedDotPushDropStruct.f57743q = j17;
        finderRedDotPushDropStruct.f57741o = c01.id.c();
        finderRedDotPushDropStruct.k();
        ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Zk(finderRedDotPushDropStruct);
    }

    public final java.lang.String a(r45.f03 f03Var, zy2.na naVar, java.lang.String str) {
        java.lang.String str2;
        r45.fz2 fz2Var;
        java.util.LinkedList linkedList;
        java.lang.String str3;
        r45.x80 x80Var;
        r45.w80 w80Var;
        java.lang.String str4;
        r45.x80 x80Var2;
        r45.x80 x80Var3;
        r45.w80 w80Var2;
        r45.fz2 fz2Var2;
        java.util.LinkedList linkedList2;
        java.lang.String str5;
        r45.x80 x80Var4;
        r45.w80 w80Var3;
        java.lang.String str6;
        r45.x80 x80Var5;
        r45.x80 x80Var6;
        r45.w80 w80Var4;
        r45.za0 za0Var = naVar.f477485a;
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
        java.lang.CharSequence charSequence = naVar.f477488d;
        if (!K0) {
            str2 = str;
        } else if (f03Var.f373887d != 999) {
            str2 = f03Var.f373889f;
        } else if (charSequence.length() > 0) {
            str2 = charSequence.toString();
        } else {
            if (com.tencent.mm.plugin.finder.report.v2.f125401a[za0Var.ordinal()] == 1) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                r45.ya0 ya0Var = f03Var.B;
                if (ya0Var != null && (fz2Var2 = ya0Var.f390918d) != null && (linkedList2 = fz2Var2.f374741d) != null) {
                    java.util.ArrayList<r45.cp5> arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj : linkedList2) {
                        if (((r45.cp5) obj).f371768d == 1) {
                            arrayList.add(obj);
                        }
                    }
                    for (r45.cp5 cp5Var : arrayList) {
                        r45.ap5 ap5Var = cp5Var.f371769e;
                        if ((ap5Var == null || (x80Var6 = ap5Var.f370176d) == null || (w80Var4 = x80Var6.f389856g) == null || !w80Var4.f388958d) ? false : true) {
                            com.tencent.mm.storage.k4 Bi = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
                            r45.ap5 ap5Var2 = cp5Var.f371769e;
                            if (ap5Var2 == null || (x80Var4 = ap5Var2.f370176d) == null || (w80Var3 = x80Var4.f389856g) == null || (str5 = w80Var3.f388959e) == null) {
                                str5 = "";
                            }
                            com.tencent.mm.storage.z3 n17 = Bi.n(str5, true);
                            java.lang.String g27 = n17 != null ? n17.g2() : null;
                            if (g27 == null) {
                                g27 = "";
                            }
                            sb6.append(g27);
                        } else {
                            if (ap5Var == null || (x80Var5 = ap5Var.f370176d) == null || (str6 = x80Var5.f389853d) == null) {
                                str6 = "";
                            }
                            sb6.append(str6);
                        }
                    }
                }
                str2 = sb6.toString();
            } else {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                r45.ya0 ya0Var2 = f03Var.B;
                if (ya0Var2 != null && (fz2Var = ya0Var2.f390918d) != null && (linkedList = fz2Var.f374741d) != null) {
                    java.util.ArrayList<r45.cp5> arrayList2 = new java.util.ArrayList();
                    for (java.lang.Object obj2 : linkedList) {
                        if (((r45.cp5) obj2).f371768d == 1) {
                            arrayList2.add(obj2);
                        }
                    }
                    for (r45.cp5 cp5Var2 : arrayList2) {
                        r45.ap5 ap5Var3 = cp5Var2.f371769e;
                        if ((ap5Var3 == null || (x80Var3 = ap5Var3.f370177e) == null || (w80Var2 = x80Var3.f389856g) == null || !w80Var2.f388958d) ? false : true) {
                            com.tencent.mm.storage.k4 Bi2 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
                            r45.ap5 ap5Var4 = cp5Var2.f371769e;
                            if (ap5Var4 == null || (x80Var = ap5Var4.f370177e) == null || (w80Var = x80Var.f389856g) == null || (str3 = w80Var.f388959e) == null) {
                                str3 = "";
                            }
                            com.tencent.mm.storage.z3 n18 = Bi2.n(str3, true);
                            java.lang.String g28 = n18 != null ? n18.g2() : null;
                            if (g28 == null) {
                                g28 = "";
                            }
                            sb7.append(g28);
                        } else {
                            if (ap5Var3 == null || (x80Var2 = ap5Var3.f370177e) == null || (str4 = x80Var2.f389853d) == null) {
                                str4 = "";
                            }
                            sb7.append(str4);
                        }
                    }
                }
                str2 = sb7.toString();
            }
            kotlin.jvm.internal.o.d(str2);
        }
        com.tencent.mars.xlog.Log.i("FinderRedDotReporter", "show_type:" + f03Var.f373887d + ", dslShowTitle:" + ((java.lang.Object) charSequence) + ", showInfoTitle:" + f03Var.f373889f + ", titleInParam:" + str + ", dslRenderState:" + za0Var + ", result:" + str2);
        return str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00cf, code lost:
    
        if (r0.put("has_finderuser_info", 1) != null) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0112, code lost:
    
        if (r0.put("has_finderuser_info", 1) != null) goto L186;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String b(com.tencent.mm.plugin.finder.extension.reddot.jb r14, r45.f03 r15) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.report.x2.b(com.tencent.mm.plugin.finder.extension.reddot.jb, r45.f03):java.lang.String");
    }

    public final org.json.JSONObject c(java.lang.String str) {
        r45.f03 b07 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().b0("NotificationCenterLike", str);
        int i17 = b07 != null ? b07.f373888e : 0;
        r45.f03 b08 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().b0("NotificationCenterComment", str);
        int i18 = b08 != null ? b08.f373888e : 0;
        r45.f03 b09 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().b0("NotificationCenterFollow", str);
        int i19 = b09 != null ? b09.f373888e : 0;
        int i27 = i17 + i18 + i19;
        r45.f03 b010 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().b0("finder_private_msg_entrance", str);
        int i28 = b010 != null ? b010.f373888e : 0;
        r45.f03 I0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("MemberNotificationCenterLike");
        int i29 = I0 != null ? I0.f373888e : 0;
        r45.f03 I02 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("MemberNotificationCenterComment");
        int i37 = I02 != null ? I02.f373888e : 0;
        r45.f03 I03 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("MemberNotificationCenterJoin");
        int i38 = I03 != null ? I03.f373888e : 0;
        int i39 = i29 + i37 + i38;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("PrivateMsg", i28);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("unreadFollowCnt", i19);
            jSONObject2.put("unreadCommentCnt", i18);
            jSONObject2.put("unreadLikeCount", i17);
            jSONObject2.put("totalCnt", i27);
            jSONObject.put("FinderMsg", jSONObject2);
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put("memberUnreadLikeCount", i29);
            jSONObject3.put("memberUnreadJoinCount", i38);
            jSONObject3.put("memberUnreadCommentCount", i37);
            jSONObject3.put("totalMembershipMsgCnt", i39);
            jSONObject.put("MembershipMsg", jSONObject3);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("FinderRedDotReporter", e17, "optMessageDetailJson", new java.lang.Object[0]);
        }
        return jSONObject;
    }

    public final org.json.JSONObject d(org.json.JSONObject jSONObject) {
        r45.f03 I0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("WxMessageLike");
        int i17 = I0 != null ? I0.f373888e : 0;
        r45.f03 I02 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("WxMessageComment");
        int i18 = I02 != null ? I02.f373888e : 0;
        int i19 = i17 + i18;
        r45.f03 I03 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("finder_wx_private_msg_entrance");
        int i27 = I03 != null ? I03.f373888e : 0;
        if (jSONObject == null) {
            jSONObject = new org.json.JSONObject();
        }
        try {
            jSONObject.put("WXPrivateMsg", i27);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("unreadLikeCnt", i17);
            jSONObject2.put("unreadComment", i18);
            jSONObject2.put("totalCnt", i19);
            jSONObject.put("WXUnreadMsg", jSONObject2);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("FinderRedDotReporter", e17, "optWxMessageDetailJson", new java.lang.Object[0]);
        }
        return jSONObject;
    }

    public final void e(java.lang.String currUI, com.tencent.mm.plugin.finder.extension.reddot.jb ctrInfo, r45.f03 showInfo, int i17, java.lang.String contextId, int i18, int i19, int i27) {
        kotlin.jvm.internal.o.g(currUI, "currUI");
        kotlin.jvm.internal.o.g(ctrInfo, "ctrInfo");
        kotlin.jvm.internal.o.g(showInfo, "showInfo");
        kotlin.jvm.internal.o.g(contextId, "contextId");
        r45.qt2 qt2Var = new r45.qt2();
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        qt2Var.set(0, Ri);
        qt2Var.set(1, contextId);
        qt2Var.set(2, "");
        h(this, currUI, ctrInfo, showInfo, i17, qt2Var, i18, 0, null, i19, 0, null, i27, null, 5824, null);
    }

    public final void k(com.tencent.mm.plugin.finder.extension.reddot.jb jbVar, r45.f03 f03Var, int i17, java.lang.String str, long j17) {
        com.tencent.mm.autogen.mmdata.rpt.FinderRedDotPushDropStruct finderRedDotPushDropStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderRedDotPushDropStruct();
        if (jbVar != null) {
            finderRedDotPushDropStruct.f57730d = jbVar.field_ctrType;
            finderRedDotPushDropStruct.f57731e = finderRedDotPushDropStruct.b("RedDotTipsID", jbVar.field_tipsId, true);
            finderRedDotPushDropStruct.f57735i = finderRedDotPushDropStruct.b("objectId", pm0.v.u(jbVar.W0().getLong(0)), true);
            finderRedDotPushDropStruct.f57736j = finderRedDotPushDropStruct.b(dm.i4.COL_USERNAME, jbVar.W0().getString(3), true);
            java.lang.String jSONObject = jbVar.W0().toJSON().toString();
            kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
            finderRedDotPushDropStruct.f57737k = finderRedDotPushDropStruct.b("reportExtInfo", r26.i0.t(jSONObject, ",", ";", false), true);
        }
        if (f03Var != null) {
            finderRedDotPushDropStruct.f57732f = finderRedDotPushDropStruct.b("RedDotShowInfoPath", f03Var.f373892i, true);
            finderRedDotPushDropStruct.f57733g = finderRedDotPushDropStruct.b("RedDotShowInfoParentPath", f03Var.f373893m, true);
            finderRedDotPushDropStruct.f57734h = finderRedDotPushDropStruct.b("RedDotShowInfoType", java.lang.String.valueOf(f03Var.f373887d), true);
        }
        finderRedDotPushDropStruct.f57738l = i17;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = f125431c;
        }
        finderRedDotPushDropStruct.f57739m = finderRedDotPushDropStruct.b("ContextID", str, true);
        finderRedDotPushDropStruct.f57743q = j17;
        finderRedDotPushDropStruct.f57741o = c01.id.c();
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        finderRedDotPushDropStruct.f57742p = finderRedDotPushDropStruct.b(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, Ri, true);
        finderRedDotPushDropStruct.k();
        ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Zk(finderRedDotPushDropStruct);
    }

    public final void n(com.tencent.mm.plugin.finder.extension.reddot.jb ctrInfo) {
        kotlin.jvm.internal.o.g(ctrInfo, "ctrInfo");
        com.tencent.mm.protocal.protobuf.FinderTipsShowEntranceExtInfo W0 = ctrInfo.W0();
        if (W0.getLong(0) == 0) {
            return;
        }
        r45.jn0 jn0Var = new r45.jn0();
        jn0Var.set(0, java.lang.Long.valueOf(W0.getLong(0)));
        r45.kn0 kn0Var = new r45.kn0();
        kn0Var.set(0, W0.getByteString(6));
        kn0Var.set(1, java.lang.Integer.valueOf(W0.getInteger(2)));
        jn0Var.set(6, kn0Var);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[reportCurrentEntranceRedDot] objectId=");
        sb6.append(pm0.v.u(W0.getLong(0)));
        sb6.append(" jump_tab_type=");
        sb6.append(W0.getInteger(2));
        sb6.append(" tab_tips_by_pass_info=");
        sb6.append(W0.getByteString(6) != null);
        com.tencent.mars.xlog.Log.i("FinderRedDotReporter", sb6.toString());
        if (!bq.t.f23523s.a()) {
            gm0.j1.d().g(new db2.g5((r45.qt2) null, 2, jn0Var, (java.lang.String) null));
            return;
        }
        i95.m c17 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        cq.j1.f((cq.k) c17, null, 2, kz5.c0.d(jn0Var), null);
    }

    public final void o(int i17, long j17, com.tencent.mm.plugin.finder.extension.reddot.jb jbVar, r45.f03 f03Var, java.lang.String detail) {
        r45.v80 v80Var;
        r45.eh6 eh6Var;
        java.lang.String str;
        r45.vs2 vs2Var;
        kotlin.jvm.internal.o.g(detail, "detail");
        com.tencent.mm.autogen.mmdata.rpt.DiscoveryTabsRedDotImpClickStruct discoveryTabsRedDotImpClickStruct = new com.tencent.mm.autogen.mmdata.rpt.DiscoveryTabsRedDotImpClickStruct();
        discoveryTabsRedDotImpClickStruct.f55842f = i17;
        discoveryTabsRedDotImpClickStruct.f55846j = j17;
        discoveryTabsRedDotImpClickStruct.f55849m = c01.id.c();
        java.lang.String str2 = "";
        if (jbVar != null) {
            discoveryTabsRedDotImpClickStruct.f55840d = jbVar.getType();
            java.lang.String str3 = jbVar.field_tips_uuid;
            if (str3 == null) {
                str3 = "";
            }
            discoveryTabsRedDotImpClickStruct.f55855s = discoveryTabsRedDotImpClickStruct.b("RedDotTipsUuid", str3, true);
            n30.r rVar = (n30.r) i95.n0.c(n30.r.class);
            long j18 = jbVar.W0().getLong(0);
            ((m30.m) rVar).getClass();
            discoveryTabsRedDotImpClickStruct.f55843g = discoveryTabsRedDotImpClickStruct.b("feedid", b52.b.q(j18), true);
            discoveryTabsRedDotImpClickStruct.f55844h = discoveryTabsRedDotImpClickStruct.b(dm.i4.COL_USERNAME, jbVar.N.getString(14), true);
            discoveryTabsRedDotImpClickStruct.f55847k = discoveryTabsRedDotImpClickStruct.b("RedDotTipsID", jbVar.field_tipsId, true);
        }
        if (f03Var != null) {
            com.tencent.mm.protocal.protobuf.FinderTipsShowDiscoveryExtInfo finderTipsShowDiscoveryExtInfo = new com.tencent.mm.protocal.protobuf.FinderTipsShowDiscoveryExtInfo();
            java.lang.String str4 = null;
            if (f03Var.f373894n == 3) {
                com.tencent.mm.protobuf.g gVar = f03Var.f373895o;
                finderTipsShowDiscoveryExtInfo.parseFrom(gVar != null ? gVar.g() : null);
            }
            java.lang.String str5 = finderTipsShowDiscoveryExtInfo.show_ext_info;
            if (str5 == null || str5.length() == 0) {
                if (jbVar != null && (vs2Var = jbVar.field_ctrInfo) != null) {
                    str4 = vs2Var.f388499t;
                }
                str5 = str4;
            }
            discoveryTabsRedDotImpClickStruct.f55841e = discoveryTabsRedDotImpClickStruct.b("showinfopath", "Discovery", true);
            discoveryTabsRedDotImpClickStruct.f55850n = f03Var.f373891h;
            discoveryTabsRedDotImpClickStruct.f55845i = discoveryTabsRedDotImpClickStruct.b("reportext", str5, true);
            discoveryTabsRedDotImpClickStruct.f55848l = discoveryTabsRedDotImpClickStruct.b("RedDotShowInfoTitle", f03Var.f373889f, true);
            discoveryTabsRedDotImpClickStruct.f55854r = f03Var.f373887d;
            r45.lb lbVar = f03Var.f373904x;
            if (lbVar != null && (v80Var = lbVar.f379284d) != null && (eh6Var = v80Var.f387982e) != null && (str = eh6Var.f373501d) != null) {
                str2 = str;
            }
            discoveryTabsRedDotImpClickStruct.f55853q = discoveryTabsRedDotImpClickStruct.b("subtitle", str2, true);
            discoveryTabsRedDotImpClickStruct.f55852p = f03Var.f373888e;
            discoveryTabsRedDotImpClickStruct.f55851o = discoveryTabsRedDotImpClickStruct.b("RedDotCountNumDetail", detail, true);
        }
        discoveryTabsRedDotImpClickStruct.k();
        ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Zk(discoveryTabsRedDotImpClickStruct);
    }
}
