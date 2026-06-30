package ni4;

/* loaded from: classes11.dex */
public final class x implements vg3.r4, com.tencent.mm.modelbase.j1 {

    /* renamed from: d, reason: collision with root package name */
    public static final ni4.x f337776d = new ni4.x();

    /* renamed from: e, reason: collision with root package name */
    public static final int f337777e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.HashMap f337778f;

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f337779g;

    /* renamed from: h, reason: collision with root package name */
    public static final jz5.g f337780h;

    /* renamed from: i, reason: collision with root package name */
    public static final jz5.g f337781i;

    /* renamed from: m, reason: collision with root package name */
    public static final jz5.g f337782m;

    /* renamed from: n, reason: collision with root package name */
    public static final jz5.g f337783n;

    /* renamed from: o, reason: collision with root package name */
    public static final jz5.g f337784o;

    static {
        int dimensionPixelSize = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn);
        int dimensionPixelSize2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479691cq);
        int dimensionPixelSize3 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479693cs);
        int dimensionPixelSize4 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479704cz);
        com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479706d1);
        int dimensionPixelSize5 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479714d7);
        f337777e = dimensionPixelSize5;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(1, java.lang.Integer.valueOf(dimensionPixelSize3));
        hashMap.put(2, java.lang.Integer.valueOf(dimensionPixelSize2));
        hashMap.put(3, java.lang.Integer.valueOf(dimensionPixelSize));
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put(1, java.lang.Integer.valueOf(dimensionPixelSize5));
        hashMap2.put(2, java.lang.Integer.valueOf(dimensionPixelSize4));
        hashMap2.put(3, java.lang.Integer.valueOf(dimensionPixelSize3));
        f337778f = hashMap2;
        f337779g = jz5.h.b(ni4.r.f337770d);
        f337780h = jz5.h.b(ni4.u.f337773d);
        f337781i = jz5.h.b(ni4.w.f337775d);
        jz5.h.b(ni4.t.f337772d);
        f337782m = jz5.h.b(ni4.i.f337769d);
        f337783n = jz5.h.b(ni4.v.f337774d);
        f337784o = jz5.h.b(ni4.s.f337771d);
    }

    public final void b(java.util.Map values) {
        kotlin.jvm.internal.o.g(values, "values");
        java.lang.String str = (java.lang.String) values.get(".sysmsg.modtextstatus.UserName");
        java.lang.String str2 = (java.lang.String) values.get(".sysmsg.modtextstatus.TextStatusID");
        java.lang.String str3 = (java.lang.String) values.get(".sysmsg.modtextstatus.TextStatusExtInfo");
        java.lang.String str4 = (java.lang.String) values.get(".sysmsg.modtextstatus.ProfileSeq");
        long parseLong = str4 != null ? java.lang.Long.parseLong(str4) : 0L;
        java.lang.String str5 = (java.lang.String) values.get(".sysmsg.modtextstatus.PrivateInfoVersion");
        float f17 = 0.0f;
        try {
            java.lang.String str6 = (java.lang.String) values.get(".sysmsg.modtextstatus.Scores.ContentScore");
            if (str6 != null) {
                f17 = java.lang.Float.parseFloat(str6);
            }
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusInfoManager", "[dealModTextStatus] 0.0 parse fail, contentScore string = 0.0");
        }
        float f18 = f17;
        boolean z17 = true;
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TextStatus.TextStatusInfoManager", "dealModTextStatus: userName nil");
            return;
        }
        if (str2 == null || str2.length() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusInfoManager", "dealModTextStatus: delete " + str + ", " + parseLong);
            ai4.m0.f5173a.G().n(str);
            return;
        }
        long parseLong2 = str5 == null || str5.length() == 0 ? 0L : java.lang.Long.parseLong(str5);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dealModTextStatus update >> privateInfoVersion:");
        sb6.append(parseLong2);
        sb6.append(", seq:");
        sb6.append(parseLong);
        sb6.append(", extInfoIsEmpty:");
        sb6.append(str3 == null || str3.length() == 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusInfoManager", sb6.toString());
        if (str3 != null && str3.length() != 0) {
            z17 = false;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusInfoManager", "dealModTextStatus: only extinfo but empty");
            ai4.m0.f5173a.G().n(str);
        } else {
            pj4.b0 b0Var = new pj4.b0();
            b0Var.parseFrom(android.util.Base64.decode(str3, 0));
            ai4.b.g(ai4.m0.f5173a, str, str2, b0Var, 4, null, parseLong, f18, null, null, false, sb1.a.CTRL_INDEX, null);
        }
    }

    public final void c(java.util.Map values) {
        kotlin.jvm.internal.o.g(values, "values");
        if (bi4.v1.j()) {
            java.lang.String str = (java.lang.String) values.get(".sysmsg.statuscomment.from_username");
            java.lang.String str2 = (java.lang.String) values.get(".sysmsg.statuscomment.status_id");
            java.lang.String str3 = (java.lang.String) values.get(".sysmsg.statuscomment.comment_id");
            java.lang.String str4 = (java.lang.String) values.get(".sysmsg.statuscomment.root_comment_id");
            if (str4 == null) {
                str4 = "";
            }
            java.lang.String str5 = (java.lang.String) values.get(".sysmsg.statuscomment.comment_ts_ms");
            long parseLong = str5 != null ? java.lang.Long.parseLong(str5) : 0L;
            int e17 = parseLong > 0 ? (int) (parseLong / 1000) : c01.id.e();
            java.lang.String str6 = (java.lang.String) values.get(".sysmsg.statuscomment.comment_content");
            java.lang.String str7 = (java.lang.String) values.get(".sysmsg.statuscomment.operation_type");
            int parseInt = str7 != null ? java.lang.Integer.parseInt(str7) : 0;
            java.lang.String str8 = (java.lang.String) values.get(".sysmsg.statuscomment.feed_owner_username");
            java.lang.String str9 = (java.lang.String) values.get(".sysmsg.statuscomment.comment_count");
            int parseInt2 = str9 != null ? java.lang.Integer.parseInt(str9) : 0;
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusInfoManager", "dealTextStatusComment: fromUserName:" + str + " textStatusId:" + str2 + " commentId:" + str3 + " operationType:" + parseInt + " createTime" + e17 + ' ');
            if (str3 == null || str3.length() == 0) {
                return;
            }
            if (str == null || str.length() == 0) {
                return;
            }
            mj4.h t17 = str2 != null ? qi4.p.f363776a.d(ai4.b0.f5126d).t(str2) : null;
            if (parseInt == 2) {
                if (str4.length() == 0) {
                    ai4.m0.f5173a.I(str3);
                } else {
                    ai4.m0.f5173a.I(str3);
                }
            } else if (parseInt != 2 && t17 != null) {
                mj4.e eVar = new mj4.e();
                eVar.field_FromUserName = str;
                eVar.field_TextStatusId = str2;
                eVar.field_CreateTime = e17;
                eVar.field_CommentContent = str6;
                eVar.field_CommentId = str3;
                eVar.field_RootCommentId = str4;
                eVar.field_TextStatusOwnerUserName = str8;
                mj4.k kVar = (mj4.k) t17;
                eVar.field_Description = kVar.g();
                eVar.field_Option = kVar.q();
                eVar.field_thumbUrl = kVar.i();
                eVar.field_TopicInfo = null;
                eVar.field_Read = 0;
                eVar.field_DeleteInMsgList = 0;
                eVar.field_HasBeenDeleted = 0;
                if (!kotlin.jvm.internal.o.b(str, en1.a.a())) {
                    ai4.m0 m0Var = ai4.m0.f5173a;
                    m0Var.q(eVar);
                    m0Var.e();
                }
            }
            if (t17 != null) {
                mj4.j jVar = new mj4.j((mj4.k) t17);
                jVar.f327066b.put("field_CommentCount", java.lang.Integer.valueOf(parseInt2));
                ai4.m0.f5173a.G().s(jVar.a());
            }
        }
    }

    public final mj4.i f(mj4.i iVar, pj4.b0 info) {
        kotlin.jvm.internal.o.g(iVar, "<this>");
        kotlin.jvm.internal.o.g(info, "info");
        java.lang.String str = info.f354971J;
        if (str == null) {
            str = "";
        }
        mj4.j jVar = (mj4.j) iVar;
        jVar.f327066b.put("field_Description", str);
        pj4.o0 o0Var = info.f354975g;
        java.lang.String str2 = o0Var != null ? o0Var.f355214e : null;
        if (str2 == null) {
            str2 = "";
        }
        java.util.HashMap hashMap = jVar.f327066b;
        hashMap.put("field_IconID", str2);
        pj4.o0 o0Var2 = info.f354975g;
        java.lang.String str3 = o0Var2 != null ? o0Var2.f355213d : null;
        if (str3 == null) {
            str3 = "";
        }
        hashMap.put("field_TopicId", str3);
        pj4.o0 o0Var3 = info.f354975g;
        java.lang.String str4 = o0Var3 != null ? o0Var3.f355222p : null;
        if (str4 == null) {
            str4 = "";
        }
        hashMap.put("field_ClusterId", str4);
        hashMap.put("field_MediaType", java.lang.Integer.valueOf(info.f354974f));
        java.lang.String str5 = info.f354976h;
        if (str5 == null) {
            str5 = "";
        }
        hashMap.put("field_MediaUrl", str5);
        java.lang.String str6 = info.f354977i;
        if (str6 == null) {
            str6 = "";
        }
        hashMap.put("field_MediaAESKey", str6);
        java.lang.String str7 = info.f354978m;
        if (str7 == null) {
            str7 = "";
        }
        hashMap.put("field_MediaThumbUrl", str7);
        java.lang.String str8 = info.f354979n;
        if (str8 == null) {
            str8 = "";
        }
        hashMap.put("field_MediaThumbAESKey", str8);
        java.lang.String str9 = info.f354984s;
        if (str9 == null) {
            str9 = "";
        }
        hashMap.put("field_PoiID", str9);
        java.lang.String str10 = info.f354985t;
        if (str10 == null) {
            str10 = "";
        }
        hashMap.put("field_PoiName", str10);
        hashMap.put("field_Latitude", java.lang.Double.valueOf(info.f354973e));
        hashMap.put("field_Longitude", java.lang.Double.valueOf(info.f354972d));
        hashMap.put("field_Visibility", java.lang.Integer.valueOf(info.f354980o));
        hashMap.put("field_ExpireTime", java.lang.Integer.valueOf(info.f354983r));
        hashMap.put("field_CreateTime", java.lang.Integer.valueOf(info.f354982q));
        java.lang.String str11 = info.f354989x;
        if (str11 == null) {
            str11 = "";
        }
        hashMap.put("field_backgroundId", str11);
        hashMap.put("field_option", java.lang.Long.valueOf(info.f354986u));
        hashMap.put("field_mediaWidth", java.lang.Integer.valueOf(info.f354987v));
        hashMap.put("field_mediaHeight", java.lang.Integer.valueOf(info.f354988w));
        java.lang.String str12 = info.C;
        if (str12 == null) {
            str12 = "";
        }
        hashMap.put("field_referenceUserName", str12);
        java.lang.String str13 = info.D;
        if (str13 == null) {
            str13 = "";
        }
        hashMap.put("field_referenceTextStatusId", str13);
        java.lang.String str14 = info.F;
        if (str14 == null) {
            str14 = "";
        }
        hashMap.put("field_duplicateUserName", str14);
        java.lang.String str15 = info.G;
        if (str15 == null) {
            str15 = "";
        }
        hashMap.put("field_duplicateTextStatusId", str15);
        java.lang.String str16 = info.Q;
        hashMap.put("field_City", str16 != null ? str16 : "");
        hashMap.put("field_sceneType", java.lang.Integer.valueOf(info.E));
        pj4.o0 o0Var4 = info.f354975g;
        hashMap.put("field_TopicInfo", o0Var4 != null ? o0Var4.toByteArray() : null);
        pj4.z zVar = info.K;
        hashMap.put("field_EmojiInfo", zVar != null ? zVar.toByteArray() : null);
        hashMap.put("field_statusExtInfoOriBytes", info.toByteArray());
        hashMap.put("field_HasHb", java.lang.Integer.valueOf(info.T ? 1 : 0));
        return jVar;
    }

    public final li4.a h() {
        return (li4.a) ((jz5.n) f337782m).getValue();
    }

    @Override // vg3.r4
    public void h0(java.lang.String str, java.util.Map map, com.tencent.mm.modelbase.p0 p0Var) {
        si4.a d17;
        mj4.h t17;
        if (map != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusInfoManager", "subtype:" + str + ", values:" + map);
            for (java.util.Map.Entry entry : map.entrySet()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusInfoManager", "[onNewXmlReceived] " + ((java.lang.String) entry.getKey()) + ": value:" + ((java.lang.String) entry.getValue()));
            }
            if (bi4.v1.e(str, false) == 2 || str == null) {
                return;
            }
            switch (str.hashCode()) {
                case -1813338250:
                    if (str.equals("textstatuslike")) {
                        java.lang.String str2 = (java.lang.String) map.get(".sysmsg.textstatuslike.HashUserName");
                        java.lang.String str3 = (java.lang.String) map.get(".sysmsg.textstatuslike.TextStatusID");
                        java.lang.String str4 = (java.lang.String) map.get(".sysmsg.textstatuslike.LikeID");
                        if (str4 == null) {
                            str4 = "";
                        }
                        java.lang.String str5 = (java.lang.String) map.get(".sysmsg.textstatuslike.Version");
                        int parseInt = str5 != null ? java.lang.Integer.parseInt(str5) : 0;
                        java.lang.String str6 = (java.lang.String) map.get(".sysmsg.textstatuslike.LikeCountVersion");
                        int parseInt2 = str6 != null ? java.lang.Integer.parseInt(str6) : 0;
                        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusInfoManager", "dealTextStatusLike:textStatusId:%s version:%s likeCountVersion:%s likeId:%s hashUserName:%s", java.lang.Integer.valueOf(parseInt), java.lang.Integer.valueOf(parseInt2), str3, str4, str2);
                        if (str3 == null || str3.length() == 0) {
                            return;
                        }
                        if (str2 == null || str2.length() == 0) {
                            return;
                        }
                        si4.a d18 = qi4.p.f363776a.d(ai4.b0.f5126d);
                        java.lang.String str7 = (java.lang.String) map.get(".sysmsg.textstatuslike.DeleteFlag");
                        int parseInt3 = str7 != null ? java.lang.Integer.parseInt(str7) : 0;
                        ai4.m0 m0Var = ai4.m0.f5173a;
                        mj4.l y17 = m0Var.y(str2, str3);
                        mj4.h t18 = d18.t(str3);
                        if (parseInt3 != 1 || y17 == null) {
                            if (parseInt3 != 1 && t18 != null) {
                                if (y17 == null) {
                                    y17 = new mj4.l();
                                }
                                y17.field_HashUserName = str2;
                                y17.field_TextStatusId = str3;
                                java.lang.String str8 = (java.lang.String) map.get(".sysmsg.textstatuslike.Type");
                                y17.field_Type = str8 != null ? java.lang.Integer.parseInt(str8) : 0;
                                y17.field_LikeId = str4;
                                java.lang.String str9 = (java.lang.String) map.get(".sysmsg.textstatuslike.Notify");
                                y17.field_Notify = str9 != null ? java.lang.Integer.parseInt(str9) : 0;
                                java.lang.String str10 = (java.lang.String) map.get(".sysmsg.textstatuslike.CreateTime");
                                y17.field_CreateTime = str10 != null ? java.lang.Integer.parseInt(str10) : 0;
                                y17.field_DisplayName = (java.lang.String) map.get(".sysmsg.textstatuslike.NickName");
                                y17.field_HeadImgUrl = (java.lang.String) map.get(".sysmsg.textstatuslike.HeadImgUrl");
                                mj4.k kVar = (mj4.k) t18;
                                y17.field_Description = kVar.g();
                                y17.field_thumbUrl = kVar.i();
                                y17.field_Option = kVar.q();
                                y17.field_TopicInfo = kVar.n();
                                if (((int) y17.systemRowid) == -1) {
                                    m0Var.t(y17);
                                    if (y17.field_Notify == 1) {
                                        m0Var.e();
                                    }
                                } else if (parseInt == 0 || parseInt > y17.field_Version) {
                                    y17.field_Version = parseInt;
                                    m0Var.u(y17);
                                    if (y17.field_Notify == 1) {
                                        m0Var.e();
                                    }
                                } else {
                                    com.tencent.mars.xlog.Log.w("MicroMsg.TextStatus.TextStatusInfoManager", "dealTextStatusLike: likeMsg update. version:%s field_Version:%s", java.lang.Integer.valueOf(parseInt), java.lang.Integer.valueOf(y17.field_Version));
                                }
                                ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
                                qj4.s.l(qj4.s.f363958a, bk0.a.g().l(352280) ? 5L : 6L, null, null, 0L, null, 0L, 62, null);
                            }
                        } else if (parseInt == 0 || parseInt > y17.field_Version) {
                            y17.field_Version = parseInt;
                            m0Var.C(y17);
                        } else {
                            com.tencent.mars.xlog.Log.w("MicroMsg.TextStatus.TextStatusInfoManager", "dealTextStatusLike: likeMsg delete. version:%s field_Version:%s", java.lang.Integer.valueOf(parseInt), java.lang.Integer.valueOf(y17.field_Version));
                        }
                        if (t18 != null) {
                            mj4.k kVar2 = (mj4.k) t18;
                            mj4.j jVar = new mj4.j(kVar2);
                            if (parseInt2 == 0 || parseInt2 > kVar2.f327067b.field_LikeCountVersion) {
                                jVar.b(com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".sysmsg.textstatuslike.LikeCount"), 0));
                                jVar.f327066b.put("field_LikeCountVersion", java.lang.Integer.valueOf(parseInt2));
                                m0Var.G().s(jVar.a());
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                case -1306850335:
                    if (str.equals("modtextstatus")) {
                        b(map);
                        return;
                    }
                    return;
                case -384935220:
                    if (str.equals("textstatusreference")) {
                        java.lang.String userName = (java.lang.String) map.get(".sysmsg.textstatusreference.UserName");
                        java.lang.String textStatusId = (java.lang.String) map.get(".sysmsg.textstatusreference.TextStatusID");
                        java.lang.String str11 = (java.lang.String) map.get(".sysmsg.textstatusreference.CreateTime");
                        int parseInt4 = str11 != null ? java.lang.Integer.parseInt(str11) : 0;
                        java.lang.String str12 = (java.lang.String) map.get(".sysmsg.textstatusreference.ReferenceCount");
                        int parseInt5 = str12 != null ? java.lang.Integer.parseInt(str12) : 0;
                        java.lang.String str13 = (java.lang.String) map.get(".sysmsg.textstatusreference.ShowType");
                        int parseInt6 = str13 != null ? java.lang.Integer.parseInt(str13) : 0;
                        if (textStatusId == null || textStatusId.length() == 0) {
                            return;
                        }
                        if ((userName == null || userName.length() == 0) || (t17 = (d17 = qi4.p.f363776a.d(ai4.b0.f5126d)).t(textStatusId)) == null) {
                            return;
                        }
                        mj4.p l17 = l();
                        l17.getClass();
                        kotlin.jvm.internal.o.g(textStatusId, "textStatusId");
                        kotlin.jvm.internal.o.g(userName, "userName");
                        com.tencent.mm.sdk.platformtools.t8.n(textStatusId);
                        com.tencent.mm.sdk.platformtools.t8.n(userName);
                        android.database.Cursor B = l17.f327079d.B("select rowid, * from TextStatusReference where TextStatusId = ? and UserName = ? ", new java.lang.String[]{textStatusId, userName});
                        mj4.o oVar = null;
                        if (B != null) {
                            if (B.moveToFirst()) {
                                oVar = new mj4.o();
                                oVar.convertFrom(B);
                            }
                            B.close();
                        }
                        if (oVar == null) {
                            oVar = new mj4.o();
                        }
                        oVar.field_UserName = userName;
                        oVar.field_TextStatusId = textStatusId;
                        oVar.field_CreateTime = parseInt4;
                        oVar.field_ShowType = parseInt6;
                        mj4.k kVar3 = (mj4.k) t17;
                        oVar.field_thumbUrl = kVar3.i();
                        oVar.field_TopicInfo = kVar3.n();
                        oVar.field_Description = kVar3.g();
                        if (((int) oVar.systemRowid) == -1) {
                            l().insert(oVar);
                        } else {
                            l().update(oVar, new java.lang.String[0]);
                        }
                        long t19 = gm0.j1.u().c().t(com.tencent.mm.storage.u3.USERINFO_TEXT_STATUS_LAST_MARK_READ_TIME_LONG_SYNC, 0L);
                        boolean z17 = com.tencent.mm.plugin.textstatus.ui.k2.f174026d > 0;
                        if (java.lang.Math.abs(java.lang.System.currentTimeMillis() - t19) > 0 && !z17) {
                            ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
                            bk0.a.g().p(352280, true);
                        }
                        mj4.h t27 = d17.t(textStatusId);
                        if (t27 != null) {
                            mj4.j jVar2 = new mj4.j((mj4.k) t27);
                            jVar2.f327066b.put("field_referenceCount", java.lang.Integer.valueOf(parseInt5));
                            d17.s(jVar2.a());
                            return;
                        }
                        return;
                    }
                    return;
                case 1048566785:
                    if (str.equals("textstatusiconconfigrefresh")) {
                        bk4.i.a().P(2);
                        return;
                    }
                    return;
                case 1715205664:
                    if (str.equals("textstatuscomment")) {
                        c(map);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public final d95.b0 i() {
        return (d95.b0) ((jz5.n) f337779g).getValue();
    }

    public final li4.b k() {
        return (li4.b) ((jz5.n) f337784o).getValue();
    }

    public final mj4.p l() {
        return (mj4.p) ((jz5.n) f337780h).getValue();
    }

    public final li4.d m() {
        return (li4.d) ((jz5.n) f337783n).getValue();
    }

    public final mj4.x n() {
        return (mj4.x) ((jz5.n) f337781i).getValue();
    }

    public final void o() {
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_TEXT_STATUS_LASTTIME_CONV_UNREAD_INT, java.lang.Integer.valueOf(li4.a.J0(h(), 0, 1, null)));
    }

    @Override // com.tencent.mm.modelbase.j1
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
    }
}
