package ov2;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final ov2.b f349168a = new ov2.b();

    public final void a(java.lang.StringBuilder sb6, java.lang.String str, int i17) {
        java.lang.String format = java.lang.String.format("<value%d>", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i17)}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        sb6.append(format);
        java.lang.String format2 = java.lang.String.format("<![CDATA[%s]]>", java.util.Arrays.copyOf(new java.lang.Object[]{str}, 1));
        kotlin.jvm.internal.o.f(format2, "format(...)");
        sb6.append(format2);
        java.lang.String format3 = java.lang.String.format("</value%d>", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i17)}, 1));
        kotlin.jvm.internal.o.f(format3, "format(...)");
        sb6.append(format3);
    }

    public final void b(com.tencent.mm.protocal.protobuf.FinderObjectDesc finderObjectDesc) {
        java.util.LinkedList<java.lang.String> cover_url_word;
        if (finderObjectDesc == null) {
            return;
        }
        finderObjectDesc.setImgFeedBgmInfo(null);
        finderObjectDesc.setFeedBgmInfo(null);
        finderObjectDesc.getMedia().clear();
        finderObjectDesc.setMediaType(0);
        com.tencent.mm.protocal.protobuf.FinderMediaExtra mediaExtra = finderObjectDesc.getMediaExtra();
        if (mediaExtra == null || (cover_url_word = mediaExtra.getCover_url_word()) == null) {
            return;
        }
        cover_url_word.clear();
    }

    public final void c(com.tencent.mm.protocal.protobuf.FinderObjectDesc finderObjectDesc, r45.e21 e21Var) {
        if (finderObjectDesc == null) {
            return;
        }
        if (finderObjectDesc.getClient_draft_ext_info() == null) {
            finderObjectDesc.setClient_draft_ext_info(new r45.zw0());
        }
        r45.zw0 client_draft_ext_info = finderObjectDesc.getClient_draft_ext_info();
        if (client_draft_ext_info == null) {
            return;
        }
        client_draft_ext_info.set(1, e21Var);
    }

    public final void d(java.util.LinkedList jumpInfoList, com.tencent.mm.protocal.protobuf.FinderObject fakeSvrObj) {
        kotlin.jvm.internal.o.g(jumpInfoList, "jumpInfoList");
        kotlin.jvm.internal.o.g(fakeSvrObj, "fakeSvrObj");
        if (jumpInfoList.isEmpty()) {
            fakeSvrObj.setAdFlag(0);
            return;
        }
        java.util.Iterator it = jumpInfoList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) it.next();
            if (finderJumpInfo.getSource() == 0) {
                finderJumpInfo.setSource(1);
            }
        }
        fakeSvrObj.setAdFlag(4);
    }

    public final void e(com.tencent.mm.protocal.protobuf.FinderObject fakeSvrObj, java.util.LinkedList jumpInfoList) {
        java.util.LinkedList list;
        java.util.LinkedList list2;
        kotlin.jvm.internal.o.g(fakeSvrObj, "fakeSvrObj");
        kotlin.jvm.internal.o.g(jumpInfoList, "jumpInfoList");
        r45.lu0 attachmentList = fakeSvrObj.getAttachmentList();
        if (attachmentList != null && (list2 = attachmentList.getList(0)) != null) {
            pm0.v.d0(list2, ov2.a.f349167d);
        }
        java.util.Iterator it = jumpInfoList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) it.next();
            if (fakeSvrObj.getAttachmentList() == null) {
                r45.lu0 lu0Var = new r45.lu0();
                lu0Var.set(0, new java.util.LinkedList());
                fakeSvrObj.setAttachmentList(lu0Var);
            }
            r45.lu0 attachmentList2 = fakeSvrObj.getAttachmentList();
            if (attachmentList2 != null && (list = attachmentList2.getList(0)) != null) {
                r45.ku0 ku0Var = new r45.ku0();
                ku0Var.set(0, 3);
                r45.rc1 rc1Var = new r45.rc1();
                rc1Var.set(0, finderJumpInfo);
                ku0Var.set(3, rc1Var);
                list.add(ku0Var);
            }
        }
    }

    public final void f(com.tencent.mm.protocal.protobuf.FinderObjectDesc finderObjectDesc, long j17, r45.s01 s01Var, java.util.LinkedList linkedList, int i17) {
        if (finderObjectDesc == null) {
            return;
        }
        if (finderObjectDesc.getClient_draft_ext_info() == null) {
            finderObjectDesc.setClient_draft_ext_info(new r45.zw0());
        }
        r45.zw0 client_draft_ext_info = finderObjectDesc.getClient_draft_ext_info();
        if (client_draft_ext_info != null) {
            client_draft_ext_info.set(2, java.lang.Float.valueOf((float) j17));
        }
        r45.zw0 client_draft_ext_info2 = finderObjectDesc.getClient_draft_ext_info();
        if (client_draft_ext_info2 != null) {
            client_draft_ext_info2.set(3, s01Var);
        }
        r45.zw0 client_draft_ext_info3 = finderObjectDesc.getClient_draft_ext_info();
        if (client_draft_ext_info3 != null) {
            client_draft_ext_info3.set(4, linkedList);
        }
        r45.zw0 client_draft_ext_info4 = finderObjectDesc.getClient_draft_ext_info();
        if (client_draft_ext_info4 == null) {
            return;
        }
        client_draft_ext_info4.set(17, java.lang.Integer.valueOf(i17));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(java.lang.String username, com.tencent.mm.protocal.protobuf.FinderObject finderObject, int i17, java.util.ArrayList arrayList, int i18, boolean z17, com.tencent.mm.plugin.finder.storage.FinderItem finderItem, java.util.LinkedList linkedList, long j17) {
        ya2.b2 b17;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        finderObject.setObjectType(i17);
        finderObject.setId(0L);
        finderObject.setUsername(username);
        if (i17 == 6) {
            ya2.g gVar = ya2.h.f460484a;
            kotlin.jvm.internal.o.g(username, "username");
            b17 = new ya2.b2();
            b17.field_username = username;
            b17.field_nickname = c01.z1.l();
        } else {
            b17 = ya2.h.f460484a.b(username);
        }
        if (b17 == null || (str = b17.field_nickname) == null) {
            str = "";
        }
        finderObject.setNickname(str);
        finderObject.setCreatetime((int) (c01.id.a() / 1000));
        if (b17 != null) {
            finderContact = ya2.d.i(b17);
        } else {
            com.tencent.mm.protocal.protobuf.FinderContact finderContact2 = new com.tencent.mm.protocal.protobuf.FinderContact();
            finderContact2.setUsername(username);
            if (b17 == null || (str2 = b17.field_nickname) == null) {
                str2 = "";
            }
            finderContact2.setNickname(str2);
            if (b17 == null || (str3 = b17.field_avatarUrl) == null) {
                str3 = "";
            }
            finderContact2.setHeadUrl(str3);
            if (b17 == null || (str4 = b17.field_signature) == null) {
                str4 = "";
            }
            finderContact2.setSignature(str4);
            java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_MY_FINDER_LOCAL_COVER_IMG_STRING_SYNC, "");
            kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.String");
            finderContact2.setCoverImgUrl((java.lang.String) m17);
            finderContact = finderContact2;
        }
        finderObject.setContact(finderContact);
        com.tencent.mm.protocal.protobuf.FinderContact contact = finderObject.getContact();
        if (contact != null) {
            contact.setOne_time_flag(contact.getOne_time_flag() | 1);
        }
        finderObject.setMentionedUserContact(new java.util.LinkedList<>());
        if (com.tencent.mm.plugin.finder.storage.t70.f127590a.e() && arrayList != null) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                r45.gb4 gb4Var = (r45.gb4) it.next();
                if (gb4Var.getInteger(5) != 5) {
                    finderObject.getMentionedUserContact().add(hc2.s.h(gb4Var));
                }
            }
        }
        if (hc2.s.f(b17)) {
            finderObject.setPermissionFlag(131);
        }
        finderObject.setDisplayidDiscarded("");
        finderObject.setRecommendReason("");
        finderObject.setSecondaryShowFlag(1);
        finderObject.setOriginalFlag(i18);
        finderObject.setShowOriginal((j17 & 1) == 1);
        if (((j17 & 2) > 0) != false) {
            if (finderObject.getObject_extend() == null) {
                finderObject.setObject_extend(new r45.dm2());
            }
            r45.dm2 object_extend = finderObject.getObject_extend();
            if (object_extend != null) {
                r45.dm2 object_extend2 = finderObject.getObject_extend();
                object_extend.set(2, java.lang.Integer.valueOf((object_extend2 != null ? object_extend2.getInteger(2) : 0) | 4));
            }
        }
        d(linkedList, finderObject);
        r45.qp2 qp2Var = new r45.qp2();
        qp2Var.set(4, java.lang.Integer.valueOf(z17 ? 1 : 0));
        jz5.l P6 = ((ey2.k0) pf5.u.f353936a.e(c61.l7.class).a(ey2.k0.class)).P6();
        qp2Var.set(0, java.lang.Float.valueOf(((java.lang.Number) P6.f302833d).floatValue()));
        qp2Var.set(1, java.lang.Float.valueOf(((java.lang.Number) P6.f302834e).floatValue()));
        finderItem.field_postExtraData = qp2Var;
    }

    public final void h(com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc, r45.kb4 kb4Var, r45.qp2 postExtra) {
        java.util.LinkedList linkedList;
        r45.ho6 ho6Var;
        java.util.LinkedList list;
        kotlin.jvm.internal.o.g(objectDesc, "objectDesc");
        kotlin.jvm.internal.o.g(postExtra, "postExtra");
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.G8).getValue()).r()).intValue() == 0) {
            return;
        }
        java.lang.String str = null;
        r45.mb4 mb4Var = (kb4Var == null || (list = kb4Var.getList(0)) == null) ? null : (r45.mb4) list.getFirst();
        if (mb4Var == null) {
            return;
        }
        if (mb4Var.getInteger(2) == 2 || mb4Var.getInteger(2) == 4) {
            r45.h70 h70Var = (r45.h70) mb4Var.getCustom(21);
            if (h70Var != null && (linkedList = h70Var.f375897d) != null && (ho6Var = (r45.ho6) linkedList.getFirst()) != null) {
                str = ho6Var.f376333d;
            }
            java.lang.String string = kb4Var.getString(10);
            boolean z17 = true;
            if (string == null || string.length() == 0) {
                string = str == null || str.length() == 0 ? mb4Var.getString(0) : str;
            }
            if (string != null && string.length() != 0) {
                z17 = false;
            }
            if (!z17) {
                jz5.l c17 = mb4Var.getInteger(2) == 2 ? hc2.l.c(string) : hc2.l.f(string);
                if (c17 != null) {
                    float doubleValue = (float) ((java.lang.Number) c17.f302833d).doubleValue();
                    float doubleValue2 = (float) ((java.lang.Number) c17.f302834e).doubleValue();
                    postExtra.set(3, java.lang.Float.valueOf(doubleValue));
                    postExtra.set(2, java.lang.Float.valueOf(doubleValue2));
                    r45.zw0 client_draft_ext_info = objectDesc.getClient_draft_ext_info();
                    if (client_draft_ext_info == null) {
                        client_draft_ext_info = new r45.zw0();
                    }
                    client_draft_ext_info.set(13, java.lang.Float.valueOf(doubleValue));
                    client_draft_ext_info.set(12, java.lang.Float.valueOf(doubleValue2));
                    objectDesc.setClient_draft_ext_info(client_draft_ext_info);
                }
            }
            com.tencent.mars.xlog.Log.i("Finder.FinderPostDataLogic", "[fillGPSInfo] feedLatitude:" + postExtra.getFloat(3) + " feedLongitude:" + postExtra.getFloat(2) + " mediaPath:" + string + " originFilePath:" + kb4Var.getString(10) + " trackPath:" + str + " url:" + mb4Var.getString(0));
        }
    }

    public final void i(com.tencent.mm.protocal.protobuf.FinderObjectDesc finderObjectDesc, r45.n41 n41Var, mv2.u0 u0Var) {
        if (finderObjectDesc != null) {
            if (n41Var == null) {
                n41Var = new r45.n41();
            }
            ov2.b bVar = f349168a;
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                com.tencent.mm.plugin.finder.report.p2 p2Var = com.tencent.mm.plugin.finder.report.p2.f125237a;
                com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = com.tencent.mm.plugin.finder.report.p2.f125238b;
                int enterScene = finderFeedReportObject != null ? finderFeedReportObject.getEnterScene() : 0;
                r45.q23 q23Var = u0Var.f331655s;
                int v17 = bVar.v(q23Var != null ? q23Var.f383585d : null, enterScene, java.lang.Integer.valueOf(u0Var.f331637a));
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("enterscene", enterScene);
                com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject2 = com.tencent.mm.plugin.finder.report.p2.f125238b;
                jSONObject.put("videosource", finderFeedReportObject2 != null ? java.lang.Integer.valueOf(finderFeedReportObject2.getVideoSource()) : null);
                com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject3 = com.tencent.mm.plugin.finder.report.p2.f125238b;
                jSONObject.put("child_enterscene", finderFeedReportObject3 != null ? java.lang.Integer.valueOf(finderFeedReportObject3.getChildEnterScene()) : null);
                com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject4 = com.tencent.mm.plugin.finder.report.p2.f125238b;
                jSONObject.put("commentScene", finderFeedReportObject4 != null ? java.lang.Integer.valueOf(finderFeedReportObject4.getCommentScene()) : null);
                jSONObject.put("annotation_exemption_reason", v17);
                java.lang.String jSONObject2 = jSONObject.toString();
                kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                java.nio.charset.Charset charset = r26.c.f368865a;
                byte[] bytes = jSONObject2.getBytes(charset);
                kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
                byte[] encode = android.util.Base64.encode(bytes, 2);
                kotlin.jvm.internal.o.f(encode, "encode(...)");
                java.lang.String str = new java.lang.String(encode, charset);
                n41Var.set(1, str);
                com.tencent.mars.xlog.Log.i("Finder.FinderPostDataLogic", "[fillGeneralReportInfo] client_info:" + jSONObject2 + " clientInfoBase64Str:" + str);
                kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
            } catch (java.lang.Throwable th6) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
            }
            finderObjectDesc.setGeneralReportInfo(n41Var);
        }
    }

    public final void j(com.tencent.mm.protocal.protobuf.FinderObject finderObject, java.lang.String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        if (finderObject.getObject_extend() == null) {
            finderObject.setObject_extend(new r45.dm2());
        }
        r45.dm2 object_extend = finderObject.getObject_extend();
        if (object_extend == null) {
            return;
        }
        object_extend.set(34, str);
    }

    public final void k(com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        if (finderObject.getObject_extend() == null) {
            finderObject.setObject_extend(new r45.dm2());
        }
        r45.dm2 object_extend = finderObject.getObject_extend();
        if (object_extend == null) {
            return;
        }
        r45.dm2 object_extend2 = finderObject.getObject_extend();
        object_extend.set(2, java.lang.Integer.valueOf((object_extend2 != null ? object_extend2.getInteger(2) : 0) | 1));
    }

    public final void l(com.tencent.mm.protocal.protobuf.FinderObjectDesc finderObjectDesc, r45.df2 df2Var) {
        if (finderObjectDesc == null) {
            return;
        }
        if (finderObjectDesc.getClient_draft_ext_info() == null) {
            finderObjectDesc.setClient_draft_ext_info(new r45.zw0());
        }
        r45.zw0 client_draft_ext_info = finderObjectDesc.getClient_draft_ext_info();
        if (client_draft_ext_info == null) {
            return;
        }
        client_draft_ext_info.set(9, df2Var);
    }

    public final void m(com.tencent.mm.protocal.protobuf.FinderObjectDesc finderObjectDesc, r45.zf2 zf2Var) {
        if (finderObjectDesc == null) {
            return;
        }
        if (finderObjectDesc.getClient_draft_ext_info() == null) {
            finderObjectDesc.setClient_draft_ext_info(new r45.zw0());
        }
        r45.zw0 client_draft_ext_info = finderObjectDesc.getClient_draft_ext_info();
        if (client_draft_ext_info == null) {
            return;
        }
        client_draft_ext_info.set(7, zf2Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(com.tencent.mm.protocal.protobuf.FinderObjectDesc r17, r45.kb4 r18, mv2.u0 r19, r45.xl2 r20, r45.qp2 r21, java.lang.String r22, int r23, r45.ze2 r24, r45.o21 r25, java.util.ArrayList r26, r45.q23 r27, r45.b01 r28, r45.b01 r29) {
        /*
            Method dump skipped, instructions count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ov2.b.n(com.tencent.mm.protocal.protobuf.FinderObjectDesc, r45.kb4, mv2.u0, r45.xl2, r45.qp2, java.lang.String, int, r45.ze2, r45.o21, java.util.ArrayList, r45.q23, r45.b01, r45.b01):void");
    }

    public final void o(com.tencent.mm.protocal.protobuf.FinderObjectDesc finderObjectDesc, r45.xl2 xl2Var, java.lang.String str, int i17, r45.ze2 ze2Var, r45.o21 o21Var, java.util.ArrayList arrayList, r45.q23 q23Var, r45.b01 b01Var, mv2.u0 u0Var) {
        finderObjectDesc.setEvent(xl2Var);
        finderObjectDesc.setVideo_tmpl_info(q23Var);
        com.tencent.mm.protocal.protobuf.FinderMediaExtra mediaExtra = finderObjectDesc.getMediaExtra();
        if (mediaExtra != null) {
            mediaExtra.setCover_url_word(b01Var != null ? b01Var.getList(0) : null);
            mediaExtra.setIs_realshoot(u0Var.S);
        }
        finderObjectDesc.setDescription(str);
        finderObjectDesc.setMediaType(i17);
        if (ze2Var == null) {
            ze2Var = new r45.ze2();
        }
        finderObjectDesc.setLocation(ze2Var);
        if (o21Var == null) {
            o21Var = new r45.o21();
        }
        finderObjectDesc.setExtReading(o21Var);
        java.util.HashMap hashMap = new java.util.HashMap();
        if (com.tencent.mm.plugin.finder.storage.t70.f127590a.e() && arrayList != null) {
            java.util.LinkedList<r45.zg2> linkedList = new java.util.LinkedList<>();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                r45.gb4 gb4Var = (r45.gb4) it.next();
                if (gb4Var.getInteger(5) != 5) {
                    r45.zg2 zg2Var = new r45.zg2();
                    zg2Var.set(0, gb4Var.getString(0));
                    zg2Var.set(1, java.lang.Integer.valueOf(gb4Var.getInteger(5)));
                    zg2Var.set(2, gb4Var.getString(2));
                    linkedList.add(zg2Var);
                    java.lang.String string = gb4Var.getString(2);
                    if (string == null) {
                        string = "";
                    }
                    hashMap.put(string, gb4Var);
                }
            }
            finderObjectDesc.setMentionedUser(linkedList);
        }
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (t70Var.G2() || t70Var.e()) {
            r45.n03 n03Var = new r45.n03();
            n03Var.set(0, f349168a.u(str, hashMap));
            finderObjectDesc.setTopic(n03Var);
        }
        java.util.ArrayList arrayList2 = u0Var.H;
        if (arrayList2 != null) {
            finderObjectDesc.getShort_title().clear();
            finderObjectDesc.getShort_title().addAll(arrayList2);
        }
        r45.xn2 xn2Var = u0Var.I;
        if (xn2Var != null) {
            finderObjectDesc.setOriginal_info_desc(xn2Var);
        }
        finderObjectDesc.setInteraction_easter_egg(u0Var.f331662z);
        finderObjectDesc.setSet_interaction_easter_egg_scene(u0Var.A);
    }

    public final void p(com.tencent.mm.plugin.finder.storage.FinderItem finderItem, java.util.ArrayList arrayList, mv2.u0 u0Var) {
        java.lang.String str;
        r45.qb4 qb4Var = finderItem.field_postinfo;
        if (qb4Var == null) {
            qb4Var = ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).Vi();
        }
        qb4Var.set(6, java.lang.Long.valueOf(c01.id.a()));
        if (arrayList != null) {
            qb4Var.getList(11).clear();
            qb4Var.getList(11).addAll(arrayList);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(u0Var.f331649m)) {
            r45.qo5 qo5Var = new r45.qo5();
            r45.z31 z31Var = u0Var.f331648l;
            if (z31Var == null || (str = z31Var.getString(0)) == null) {
                str = "";
            }
            qo5Var.set(0, str);
            qo5Var.set(1, u0Var.f331650n);
            qo5Var.set(2, u0Var.f331649m);
            qb4Var.set(12, qo5Var);
        }
        qb4Var.set(19, u0Var.M);
        qb4Var.set(20, u0Var.N);
        qb4Var.set(18, u0Var.f331636J);
        qb4Var.set(22, java.lang.Integer.valueOf(u0Var.P));
        qb4Var.set(23, u0Var.Q);
        qb4Var.set(24, null);
        qb4Var.set(25, u0Var.T);
        qb4Var.set(27, u0Var.U);
        qb4Var.set(28, u0Var.V);
        qb4Var.set(30, java.lang.Boolean.valueOf(u0Var.X));
        qb4Var.set(31, u0Var.Y);
        finderItem.setPostInfo(qb4Var);
    }

    public final void q(com.tencent.mm.protocal.protobuf.FinderObjectDesc finderObjectDesc, r45.kc4 kc4Var, long j17) {
        if (finderObjectDesc == null) {
            return;
        }
        boolean z17 = false;
        if (kc4Var != null) {
            if (finderObjectDesc.getGeneral_follow_post_info() == null) {
                finderObjectDesc.setGeneral_follow_post_info(new r45.q31());
            }
            r45.q31 general_follow_post_info = finderObjectDesc.getGeneral_follow_post_info();
            if (general_follow_post_info != null) {
                general_follow_post_info.set(0, java.lang.Long.valueOf(kc4Var.getLong(0)));
            }
            int integer = kc4Var.getInteger(4);
            int i17 = integer != 1 ? integer != 2 ? integer != 3 ? 0 : 2 : 3 : 1;
            r45.q31 general_follow_post_info2 = finderObjectDesc.getGeneral_follow_post_info();
            if (general_follow_post_info2 != null) {
                general_follow_post_info2.set(1, java.lang.Integer.valueOf(i17));
            }
            r45.q31 general_follow_post_info3 = finderObjectDesc.getGeneral_follow_post_info();
            if (general_follow_post_info3 != null) {
                general_follow_post_info3.set(2, java.lang.Boolean.valueOf(kc4Var.getInteger(5) == 0));
            }
            boolean z18 = i17 != 0;
            if (finderObjectDesc.getClient_draft_ext_info() == null) {
                finderObjectDesc.setClient_draft_ext_info(new r45.zw0());
            }
            if (kc4Var.getInteger(4) == 1) {
                r45.zw0 client_draft_ext_info = finderObjectDesc.getClient_draft_ext_info();
                if (client_draft_ext_info != null) {
                    client_draft_ext_info.set(5, pm0.v.u(kc4Var.getLong(0)));
                }
                r45.zw0 client_draft_ext_info2 = finderObjectDesc.getClient_draft_ext_info();
                if (client_draft_ext_info2 != null) {
                    client_draft_ext_info2.set(8, kc4Var.getString(6));
                }
            }
            r45.zw0 client_draft_ext_info3 = finderObjectDesc.getClient_draft_ext_info();
            if (client_draft_ext_info3 != null) {
                client_draft_ext_info3.set(6, java.lang.Integer.valueOf(kc4Var.getInteger(5)));
            }
            z17 = z18;
        }
        if (z17 || j17 == 0) {
            return;
        }
        if (finderObjectDesc.getGeneral_follow_post_info() == null) {
            finderObjectDesc.setGeneral_follow_post_info(new r45.q31());
        }
        r45.q31 general_follow_post_info4 = finderObjectDesc.getGeneral_follow_post_info();
        if (general_follow_post_info4 != null) {
            general_follow_post_info4.set(1, 4);
        }
        r45.q31 general_follow_post_info5 = finderObjectDesc.getGeneral_follow_post_info();
        if (general_follow_post_info5 == null) {
            return;
        }
        general_follow_post_info5.set(3, java.lang.Long.valueOf(j17));
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(com.tencent.mm.plugin.finder.storage.FinderItem r5, int r6, java.lang.String r7, mv2.u0 r8, com.tencent.mm.protocal.protobuf.FinderObjectDesc r9, r45.o21 r10, int r11) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ov2.b.r(com.tencent.mm.plugin.finder.storage.FinderItem, int, java.lang.String, mv2.u0, com.tencent.mm.protocal.protobuf.FinderObjectDesc, r45.o21, int):void");
    }

    public final void s(com.tencent.mm.protocal.protobuf.FinderObjectDesc finderObjectDesc, r45.ab4 ab4Var) {
        if (finderObjectDesc == null || ab4Var == null) {
            return;
        }
        if (finderObjectDesc.getClient_draft_ext_info() == null) {
            finderObjectDesc.setClient_draft_ext_info(new r45.zw0());
        }
        r45.zw0 client_draft_ext_info = finderObjectDesc.getClient_draft_ext_info();
        if (client_draft_ext_info == null) {
            return;
        }
        r45.nz2 nz2Var = new r45.nz2();
        nz2Var.set(0, ab4Var.getString(4));
        nz2Var.set(1, ab4Var.getString(1));
        nz2Var.set(2, ab4Var.getString(2));
        nz2Var.set(3, java.lang.Integer.valueOf(ab4Var.getInteger(0)));
        nz2Var.set(4, ab4Var.getString(5));
        nz2Var.set(7, java.lang.Integer.valueOf(ab4Var.getInteger(6)));
        nz2Var.set(8, ab4Var.getString(7));
        nz2Var.set(5, ab4Var.getString(8));
        client_draft_ext_info.set(19, nz2Var);
    }

    public final com.tencent.mm.plugin.finder.storage.FinderItem t(mv2.u0 data, boolean z17) {
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem;
        r45.b01 b01Var;
        r45.df2 df2Var;
        r45.n41 n41Var;
        int i17;
        ov2.b bVar;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc;
        kotlin.jvm.internal.o.g(data, "data");
        int i18 = data.f331637a;
        java.lang.String str = data.f331638b;
        r45.kb4 kb4Var = data.f331639c;
        r45.ze2 ze2Var = data.f331640d;
        r45.o21 o21Var = data.f331641e;
        int i19 = data.f331642f;
        boolean z18 = data.f331643g;
        java.lang.String str2 = data.f331644h;
        java.util.ArrayList arrayList = data.f331645i;
        int i27 = data.f331647k;
        r45.xl2 xl2Var = data.f331652p;
        r45.e21 e21Var = data.C;
        java.util.LinkedList linkedList = data.f331654r;
        r45.q23 q23Var = data.f331655s;
        long j17 = data.f331658v;
        r45.b01 b01Var2 = data.F;
        r45.b01 b01Var3 = data.G;
        r45.df2 df2Var2 = data.f331656t;
        boolean z19 = data.f331646j;
        r45.n41 n41Var2 = data.f331657u;
        int i28 = data.f331659w;
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem2 = data.f331653q;
        if (finderItem2 == null) {
            com.tencent.mm.plugin.finder.storage.FinderItem finderItem3 = new com.tencent.mm.plugin.finder.storage.FinderItem();
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = new com.tencent.mm.protocal.protobuf.FinderObject();
            finderObject.setUrlValidDuration(Integer.MAX_VALUE);
            com.tencent.mm.protocal.protobuf.FinderObjectDesc finderObjectDesc = new com.tencent.mm.protocal.protobuf.FinderObjectDesc();
            finderObject.setObjectDesc(finderObjectDesc);
            g(data.B, finderObject, i27, arrayList, i19, z18, finderItem3, linkedList, j17);
            r45.qp2 field_postExtraData = finderItem3.field_postExtraData;
            kotlin.jvm.internal.o.f(field_postExtraData, "field_postExtraData");
            n(finderObjectDesc, kb4Var, data, xl2Var, field_postExtraData, str, i18, ze2Var, o21Var, arrayList, q23Var, b01Var2, b01Var3);
            if (z19) {
                k(finderObject);
            }
            r(finderItem3, i18, str2, data, finderObjectDesc, o21Var, 0);
            finderItem3.updateFinderObject(finderObject);
            i(finderObjectDesc, n41Var2, data);
            c(finderObjectDesc, e21Var);
            long j18 = data.D;
            r45.s01 s01Var = data.E;
            r45.b01 b01Var4 = data.F;
            f(finderObjectDesc, j18, s01Var, b01Var4 != null ? b01Var4.getList(1) : null, data.R);
            q(finderObjectDesc, data.f331636J, data.Z);
            m(finderObjectDesc, data.K);
            l(finderObjectDesc, df2Var2);
            s(finderObjectDesc, data.Y);
            e(finderObject, linkedList);
            p(finderItem3, arrayList, data);
            j(finderObject, data.O);
            r45.qp2 field_postExtraData2 = finderItem3.field_postExtraData;
            kotlin.jvm.internal.o.f(field_postExtraData2, "field_postExtraData");
            h(finderObjectDesc, kb4Var, field_postExtraData2);
            java.util.LinkedList<r45.mb4> list = kb4Var != null ? kb4Var.getList(0) : null;
            if (list == null) {
                list = new java.util.LinkedList<>();
            }
            finderItem3.setMediaExtList(list);
            finderItem3.field_watermarkFlag = i28;
            finderItem3.setPostWaiting();
            com.tencent.mars.xlog.Log.i("Finder.FinderPostDataLogic", "finder send post " + pm0.b0.g(finderObject));
            return finderItem3;
        }
        java.lang.String str3 = data.B;
        com.tencent.mm.protocal.protobuf.FinderObject field_finderObject = finderItem2.field_finderObject;
        kotlin.jvm.internal.o.f(field_finderObject, "field_finderObject");
        g(str3, field_finderObject, i27, arrayList, i19, z18, finderItem2, linkedList, j17);
        if (finderItem2.field_finderObject.getObjectDesc() == null) {
            finderItem2.field_finderObject.setObjectDesc(new com.tencent.mm.protocal.protobuf.FinderObjectDesc());
        }
        if (kb4Var != null) {
            com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc2 = finderItem2.field_finderObject.getObjectDesc();
            kotlin.jvm.internal.o.d(objectDesc2);
            r45.qp2 field_postExtraData3 = finderItem2.field_postExtraData;
            kotlin.jvm.internal.o.f(field_postExtraData3, "field_postExtraData");
            df2Var = df2Var2;
            n41Var = n41Var2;
            i17 = i28;
            finderItem = finderItem2;
            n(objectDesc2, kb4Var, data, xl2Var, field_postExtraData3, str, i18, ze2Var, o21Var, arrayList, q23Var, b01Var2, b01Var3);
            if (z19) {
                com.tencent.mm.protocal.protobuf.FinderObject field_finderObject2 = finderItem.field_finderObject;
                kotlin.jvm.internal.o.f(field_finderObject2, "field_finderObject");
                bVar = this;
                b01Var = b01Var2;
                bVar.k(field_finderObject2);
            } else {
                bVar = this;
                b01Var = b01Var2;
            }
            java.util.LinkedList<r45.mb4> list2 = kb4Var.getList(0);
            if (list2 == null) {
                list2 = new java.util.LinkedList<>();
            }
            finderItem.setMediaExtList(list2);
        } else {
            finderItem = finderItem2;
            b01Var = b01Var2;
            df2Var = df2Var2;
            n41Var = n41Var2;
            i17 = i28;
            bVar = this;
            com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc3 = finderItem.field_finderObject.getObjectDesc();
            kotlin.jvm.internal.o.d(objectDesc3);
            o(objectDesc3, xl2Var, str, i18, ze2Var, o21Var, arrayList, q23Var, b01Var, data);
        }
        bVar.i(finderItem.field_finderObject.getObjectDesc(), n41Var, data);
        bVar.c(finderItem.field_finderObject.getObjectDesc(), e21Var);
        f(finderItem.field_finderObject.getObjectDesc(), data.D, data.E, b01Var != null ? b01Var.getList(1) : null, data.R);
        bVar.q(finderItem.field_finderObject.getObjectDesc(), data.f331636J, data.Z);
        bVar.m(finderItem.field_finderObject.getObjectDesc(), data.K);
        bVar.l(finderItem.field_finderObject.getObjectDesc(), df2Var);
        bVar.s(finderItem.field_finderObject.getObjectDesc(), data.Y);
        com.tencent.mm.protocal.protobuf.FinderObject field_finderObject3 = finderItem.field_finderObject;
        kotlin.jvm.internal.o.f(field_finderObject3, "field_finderObject");
        bVar.e(field_finderObject3, linkedList);
        bVar.p(finderItem, arrayList, data);
        com.tencent.mm.protocal.protobuf.FinderObject field_finderObject4 = finderItem.field_finderObject;
        kotlin.jvm.internal.o.f(field_finderObject4, "field_finderObject");
        bVar.j(field_finderObject4, data.O);
        com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = finderItem.field_finderObject;
        if (finderObject2 != null && (objectDesc = finderObject2.getObjectDesc()) != null) {
            r45.zw0 client_draft_ext_info = objectDesc.getClient_draft_ext_info();
            float f17 = client_draft_ext_info != null ? client_draft_ext_info.getFloat(13) : 0.0f;
            r45.zw0 client_draft_ext_info2 = objectDesc.getClient_draft_ext_info();
            float f18 = client_draft_ext_info2 != null ? client_draft_ext_info2.getFloat(12) : 0.0f;
            r45.qp2 qp2Var = finderItem.field_postExtraData;
            if (qp2Var != null) {
                qp2Var.set(3, java.lang.Float.valueOf(f17));
            }
            r45.qp2 qp2Var2 = finderItem.field_postExtraData;
            if (qp2Var2 != null) {
                qp2Var2.set(2, java.lang.Float.valueOf(f18));
            }
            com.tencent.mars.xlog.Log.i("Finder.FinderPostDataLogic", "[fillDraftGPSToPostExtra] feedLatitude:" + f17 + " feedLongitude:" + f18);
        }
        if (!z17) {
            r(finderItem, i18, str2, data, finderItem.field_finderObject.getObjectDesc(), o21Var, 1);
        }
        finderItem.setPostWaiting();
        com.tencent.mm.protocal.protobuf.FinderObject field_finderObject5 = finderItem.field_finderObject;
        kotlin.jvm.internal.o.f(field_finderObject5, "field_finderObject");
        finderItem.setFeedObject(field_finderObject5);
        finderItem.field_watermarkFlag = i17;
        return finderItem;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bc, code lost:
    
        r14 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String u(java.lang.String r21, java.util.HashMap r22) {
        /*
            Method dump skipped, instructions count: 665
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ov2.b.u(java.lang.String, java.util.HashMap):java.lang.String");
    }

    public final int v(java.lang.String str, int i17, java.lang.Integer num) {
        xy2.g gVar = (xy2.g) pf5.u.f353936a.e(zy2.b6.class).c(xy2.g.class);
        if (!(str == null || str.length() == 0)) {
            r45.yp2 yp2Var = ((ey2.c0) gVar).f257330f;
            if (yp2Var != null && yp2Var.getInteger(0) == 1) {
                return 1;
            }
        }
        r45.yp2 yp2Var2 = ((ey2.c0) gVar).f257330f;
        java.util.LinkedList list = yp2Var2 != null ? yp2Var2.getList(1) : null;
        if (list != null && list.contains(java.lang.Integer.valueOf(i17))) {
            return 2;
        }
        return (num != null && num.intValue() == 2) ? 3 : 0;
    }
}
