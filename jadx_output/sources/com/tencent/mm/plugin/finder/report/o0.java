package com.tencent.mm.plugin.finder.report;

/* loaded from: classes2.dex */
public final class o0 {
    public o0(kotlin.jvm.internal.i iVar) {
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:(4:181|182|(1:184)(1:187)|(8:186|156|157|158|159|(1:177)(4:163|164|165|166)|167|168))|155|156|157|158|159|(1:161)|177|167|168) */
    /* JADX WARN: Can't wrap try/catch for region: R(6:(3:138|(1:140)(1:151)|(5:142|143|144|(1:146)|148))|152|143|144|(0)|148) */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x02c9, code lost:
    
        if ((r5.length() == 0) != false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x039e, code lost:
    
        r20 = r1;
        r18 = "";
     */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0346 A[Catch: Exception -> 0x034d, TRY_LEAVE, TryCatch #2 {Exception -> 0x034d, blocks: (B:144:0x033e, B:146:0x0346), top: B:143:0x033e }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(com.tencent.mm.plugin.finder.report.o0 r18, r45.qt2 r19, long r20, java.lang.String r22, int r23, java.lang.String r24, long r25, bb2.a r27, ec2.c r28, ec2.b r29, int r30, java.lang.Object r31) {
        /*
            Method dump skipped, instructions count: 1065
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.report.o0.b(com.tencent.mm.plugin.finder.report.o0, r45.qt2, long, java.lang.String, int, java.lang.String, long, bb2.a, ec2.c, ec2.b, int, java.lang.Object):void");
    }

    public final org.json.JSONObject a(int i17, java.lang.String... values) {
        kotlin.jvm.internal.o.g(values, "values");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (i17 == 4) {
            jSONObject.put("len", values[0]);
            jSONObject.put("idx_last", values[1]);
            jSONObject.put("idx_now", values[2]);
            jSONObject.put("is_video", values[3]);
            jSONObject.put("video_play_percent", values[4]);
            jSONObject.put("video_replay_count", values[5]);
            jSONObject.put("idx_type", values[6]);
        } else if (i17 == 8) {
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, values[0]);
        } else if (i17 == 10) {
            jSONObject.put("type", values[0]);
            jSONObject.put(dm.i4.COL_USERNAME, values[1]);
        } else if (i17 == 13) {
            jSONObject.put("type", values[0]);
        } else if (i17 == 15) {
            jSONObject.put("type", values[0]);
        } else if (i17 == 16) {
            jSONObject.put("type", values[0]);
        }
        return jSONObject;
    }

    public final void c(r45.qt2 contextObj, com.tencent.mm.plugin.finder.report.n4 record, int i17) {
        java.lang.String username;
        kotlin.jvm.internal.o.g(contextObj, "contextObj");
        kotlin.jvm.internal.o.g(record, "record");
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = record.f125159d;
        if (finderItem != null) {
            com.tencent.mm.autogen.mmdata.rpt.FinderItemExposeStruct finderItemExposeStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderItemExposeStruct();
            finderItemExposeStruct.f56963d = finderItemExposeStruct.b("FeedId", pm0.v.u(finderItem.getId()), true);
            finderItemExposeStruct.f56964e = finderItem.getMediaType();
            int i18 = 0;
            finderItemExposeStruct.f56965f = finderItemExposeStruct.b("SessionId", contextObj.getString(0), true);
            finderItemExposeStruct.f56985z = contextObj.getInteger(5);
            finderItemExposeStruct.f56966g = record.f125167h;
            finderItemExposeStruct.f56967h = finderItem.getLikeCount();
            finderItemExposeStruct.f56968i = finderItem.getCommentCount();
            finderItemExposeStruct.f56969j = finderItemExposeStruct.b("topic", r26.i0.t(com.tencent.mm.plugin.finder.report.o3.f125207s.a(finderItem), ",", ";", false), true);
            java.lang.String recommendReason = finderItem.getFeedObject().getRecommendReason();
            java.lang.String str = "";
            if (recommendReason == null) {
                recommendReason = "";
            }
            finderItemExposeStruct.f56970k = finderItemExposeStruct.b("recommendWording", r26.i0.t(recommendReason, ",", ";", false), true);
            finderItemExposeStruct.f56971l = kotlin.jvm.internal.o.b(finderItem.getUserName(), xy2.c.f(contextObj)) ? 1L : 0L;
            finderItemExposeStruct.f56972m = finderItem.getCreateTime();
            if (finderItem.getLocation().getFloat(1) > 0.0f && finderItem.getLocation().getFloat(0) > 0.0f) {
                finderItemExposeStruct.f56973n = 1L;
            }
            finderItemExposeStruct.f56974o = finderItem.getMediaList().size();
            if (finderItem.getMediaType() == 4 && finderItem.getMediaList().size() > 0) {
                finderItemExposeStruct.f56975p = finderItem.getMediaList().get(0).getInteger(3);
            }
            finderItemExposeStruct.f56976q = record.f125173k - record.f125157c;
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            finderItemExposeStruct.f56977r = 5L;
            finderItemExposeStruct.f56978s = finderItem.getFeedObject().getRecommendType();
            finderItemExposeStruct.f56979t = finderItemExposeStruct.b("FeedUsername", finderItem.getUserName(), true);
            finderItemExposeStruct.f56980u = finderItem.getFeedObject().getOrgRecommendType();
            java.lang.String warnWording = finderItem.getFeedObject().getWarnWording();
            if (warnWording == null) {
                warnWording = "";
            }
            finderItemExposeStruct.f56981v = finderItemExposeStruct.b("NoticeWording", warnWording, true);
            finderItemExposeStruct.f56982w = finderItem.getFeedObject().getWarnFlag();
            finderItemExposeStruct.f56983x = i17;
            java.lang.String string = contextObj.getString(1);
            if (string == null) {
                string = "";
            }
            finderItemExposeStruct.f56984y = finderItemExposeStruct.b("ContextId", string, true);
            finderItemExposeStruct.A = finderItemExposeStruct.b("ClickFeedId", pm0.v.u(contextObj.getLong(6)), true);
            java.lang.String string2 = contextObj.getString(3);
            if (string2 == null) {
                string2 = "";
            }
            finderItemExposeStruct.B = finderItemExposeStruct.b("ClickFeedContextId", string2, true);
            java.lang.String string3 = contextObj.getString(2);
            if (string3 == null) {
                string3 = "";
            }
            finderItemExposeStruct.C = finderItemExposeStruct.b("ClickTabContextId", string3, true);
            finderItemExposeStruct.D = record.f125169i;
            finderItemExposeStruct.E = az2.j.f16133r.b(contextObj.getInteger(5));
            finderItemExposeStruct.F = finderItemExposeStruct.b("SessionBuffer", ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).ek(finderItem.getId(), finderItem.getDupFlag(), contextObj.getInteger(5)), true);
            java.util.LinkedList h17 = nv2.n1.f340551h.h(finderItem.getFeedObject());
            finderItemExposeStruct.G = h17.size();
            if (h17.size() > 3) {
                finderItemExposeStruct.H = 3L;
            } else {
                finderItemExposeStruct.H = h17.size();
            }
            finderItemExposeStruct.I = finderItemExposeStruct.b("ExpoFriendLikeUserList", "", true);
            for (java.lang.Object obj : h17) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                com.tencent.mm.protocal.protobuf.FinderCommentInfo finderCommentInfo = (com.tencent.mm.protocal.protobuf.FinderCommentInfo) obj;
                if (i18 <= 2) {
                    finderItemExposeStruct.I = finderItemExposeStruct.b("ExpoFriendLikeUserList", finderItemExposeStruct.I + finderCommentInfo.getUsername() + '|', true);
                }
                i18 = i19;
            }
            finderItemExposeStruct.f56962J = finderItem.getFeedObject().getCommentList().size();
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderCommentInfo> commentList = finderItem.getFeedObject().getCommentList();
            kotlin.jvm.internal.o.f(commentList, "getCommentList(...)");
            com.tencent.mm.protocal.protobuf.FinderCommentInfo finderCommentInfo2 = (com.tencent.mm.protocal.protobuf.FinderCommentInfo) kz5.n0.Z(commentList);
            if (finderCommentInfo2 != null && (username = finderCommentInfo2.getUsername()) != null) {
                str = username;
            }
            finderItemExposeStruct.K = finderItemExposeStruct.b("ExpoCommentUser", str, true);
            if (finderItem.isMsgLikeEvent()) {
                finderItemExposeStruct.L = finderItem.getFeedObject().getIncFriendLikeCount();
            }
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderCommentInfo> commentList2 = finderItem.getFeedObject().getCommentList();
            kotlin.jvm.internal.o.f(commentList2, "getCommentList(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : commentList2) {
                if (((c61.l7) i95.n0.c(c61.l7.class)).Gk(((com.tencent.mm.protocal.protobuf.FinderCommentInfo) obj2).getUsername())) {
                    arrayList.add(obj2);
                }
            }
            finderItemExposeStruct.M = arrayList.size();
            finderItemExposeStruct.N = finderItem.getFeedObject().getCommentList().size();
            finderItemExposeStruct.l();
            ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Zk(finderItemExposeStruct);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0266  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(r45.qt2 r19, com.tencent.mm.plugin.finder.report.f5 r20, org.json.JSONObject r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.report.o0.d(r45.qt2, com.tencent.mm.plugin.finder.report.f5, org.json.JSONObject, boolean):void");
    }

    public final void e(r45.qt2 contextObj, com.tencent.mm.plugin.finder.report.n4 record) {
        java.lang.String str;
        r45.n31 foldedLayout;
        java.util.LinkedList list;
        long j17;
        android.util.LongSparseArray longSparseArray;
        r45.n31 foldedLayout2;
        r45.n31 foldedLayout3;
        kotlin.jvm.internal.o.g(contextObj, "contextObj");
        kotlin.jvm.internal.o.g(record, "record");
        com.tencent.mm.autogen.mmdata.rpt.FinderFoldFeedExposeStruct finderFoldFeedExposeStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderFoldFeedExposeStruct();
        int i17 = 0;
        finderFoldFeedExposeStruct.f56891e = finderFoldFeedExposeStruct.b("Sessionid", contextObj.getString(0), true);
        finderFoldFeedExposeStruct.f56892f = finderFoldFeedExposeStruct.b("Contextid", contextObj.getString(1), true);
        finderFoldFeedExposeStruct.f56893g = finderFoldFeedExposeStruct.b("ClickTabContextid", contextObj.getString(2), true);
        finderFoldFeedExposeStruct.f56890d = contextObj.getInteger(5);
        finderFoldFeedExposeStruct.f56894h = finderFoldFeedExposeStruct.b("FeedId", pm0.v.u(record.f125153a), true);
        long j18 = 0;
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = record.f125159d;
        finderFoldFeedExposeStruct.f56896j = (finderItem == null || (foldedLayout3 = finderItem.getFoldedLayout()) == null) ? 0L : foldedLayout3.getInteger(3);
        if (finderItem == null || (foldedLayout2 = finderItem.getFoldedLayout()) == null || (str = foldedLayout2.getString(2)) == null) {
            str = "";
        }
        finderFoldFeedExposeStruct.f56895i = finderFoldFeedExposeStruct.b("FlodUsername", str, true);
        finderFoldFeedExposeStruct.f56897k = finderFoldFeedExposeStruct.b("AllFlodFeedItems", "", true);
        if (finderItem != null && (foldedLayout = finderItem.getFoldedLayout()) != null && (list = foldedLayout.getList(1)) != null) {
            for (java.lang.Object obj : list) {
                int i18 = i17 + 1;
                jz5.f0 f0Var = null;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) obj;
                in5.v0 v0Var = record.f125161e;
                in5.x0 x0Var = (v0Var == null || (longSparseArray = v0Var.f293147e) == null) ? null : (in5.x0) longSparseArray.get(finderObject.getId());
                if (x0Var != null) {
                    in5.c cVar = x0Var.f293158a;
                    long itemId = cVar.getItemId();
                    long j19 = x0Var.f293159b;
                    if (j18 == itemId) {
                        finderFoldFeedExposeStruct.f56897k = finderFoldFeedExposeStruct.b("AllFlodFeedItems", finderFoldFeedExposeStruct.f56897k + pm0.v.u(cVar.getItemId()) + ';' + i17 + ';' + j19 + ";0#", true);
                    } else {
                        finderFoldFeedExposeStruct.f56897k = finderFoldFeedExposeStruct.b("AllFlodFeedItems", finderFoldFeedExposeStruct.f56897k + pm0.v.u(cVar.getItemId()) + ';' + i17 + ';' + j19 + ";0#", true);
                    }
                    f0Var = jz5.f0.f302826a;
                }
                if (f0Var == null) {
                    j17 = 0;
                    if (0 == finderObject.getId()) {
                        finderFoldFeedExposeStruct.f56897k = finderFoldFeedExposeStruct.b("AllFlodFeedItems", finderFoldFeedExposeStruct.f56897k + pm0.v.u(finderObject.getId()) + ';' + i17 + ";0;0#", true);
                    } else {
                        finderFoldFeedExposeStruct.f56897k = finderFoldFeedExposeStruct.b("AllFlodFeedItems", finderFoldFeedExposeStruct.f56897k + pm0.v.u(finderObject.getId()) + ';' + i17 + ";0;0#", true);
                    }
                } else {
                    j17 = 0;
                }
                i17 = i18;
                j18 = j17;
            }
        }
        finderFoldFeedExposeStruct.l();
        ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Zk(finderFoldFeedExposeStruct);
    }

    public final void f(r45.qt2 contextObj, com.tencent.mm.plugin.finder.report.n4 record) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(contextObj, "contextObj");
        kotlin.jvm.internal.o.g(record, "record");
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = record.f125159d;
        if (finderItem == null || !finderItem.getShowExtendLink()) {
            return;
        }
        com.tencent.mm.autogen.mmdata.rpt.FinderExtClinkExposeStruct finderExtClinkExposeStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderExtClinkExposeStruct();
        finderExtClinkExposeStruct.f56743d = finderExtClinkExposeStruct.b("Feedid", pm0.v.u(finderItem.field_id), true);
        finderExtClinkExposeStruct.f56744e = finderExtClinkExposeStruct.b("SessionId", contextObj.getString(0), true);
        finderExtClinkExposeStruct.f56745f = finderExtClinkExposeStruct.b("Contextid", contextObj.getString(1), true);
        r45.o21 extReading = finderItem.getExtReading();
        if (extReading == null || (str = extReading.getString(0)) == null) {
            str = "";
        }
        finderExtClinkExposeStruct.f56746g = finderExtClinkExposeStruct.b("Url", str, true);
        finderExtClinkExposeStruct.f56747h = 1L;
        finderExtClinkExposeStruct.f56748i = 1L;
        finderExtClinkExposeStruct.f56750k = finderExtClinkExposeStruct.b("clicktabcontextid", contextObj.getString(2), true);
        finderExtClinkExposeStruct.f56751l = contextObj.getInteger(5);
        finderExtClinkExposeStruct.f56752m = finderExtClinkExposeStruct.b("sessionBuffer", ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).ek(finderItem.getId(), record.f125155b, contextObj.getInteger(5)), true);
        finderExtClinkExposeStruct.k();
    }
}
