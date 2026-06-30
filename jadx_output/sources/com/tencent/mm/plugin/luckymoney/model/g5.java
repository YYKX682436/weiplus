package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public abstract class g5 {
    public static com.tencent.mm.plugin.luckymoney.model.i0 a(r45.m43 m43Var) {
        if (m43Var == null) {
            return null;
        }
        com.tencent.mm.plugin.luckymoney.model.i0 i0Var = new com.tencent.mm.plugin.luckymoney.model.i0();
        i0Var.f145328d = m43Var.f380139d;
        java.util.Iterator it = m43Var.f380140e.iterator();
        while (it.hasNext()) {
            r45.if0 if0Var = (r45.if0) it.next();
            com.tencent.mm.plugin.luckymoney.model.k kVar = new com.tencent.mm.plugin.luckymoney.model.k();
            kVar.f145361d = if0Var.f376981d;
            kVar.f145362e = if0Var.f376982e;
            kVar.f145363f = if0Var.f376983f;
            i0Var.f145329e.add(kVar);
        }
        return i0Var;
    }

    public static r45.wv3 b(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        r45.wv3 wv3Var = new r45.wv3();
        wv3Var.f389499e = jSONObject.optInt("subType", -1);
        wv3Var.f389498d = jSONObject.optString("corpName");
        wv3Var.f389500f = jSONObject.optString("materialId");
        wv3Var.f389502h = jSONObject.optString("expire_desc");
        wv3Var.f389503i = jSONObject.optInt("is_expired");
        wv3Var.f389510s = jSONObject.optInt("detail_link_type");
        wv3Var.f389511t = jSONObject.optString("detail_link_appname");
        wv3Var.f389512u = jSONObject.optString("detail_link_url");
        wv3Var.f389513v = jSONObject.optString("detail_link_title");
        wv3Var.f389514w = jSONObject.optString("exchange_title");
        wv3Var.f389515x = jSONObject.optString("exchange_url");
        wv3Var.f389516y = jSONObject.optInt("has_source");
        wv3Var.f389517z = jSONObject.optLong("last_obtain_time");
        wv3Var.A = jSONObject.optInt("disable");
        wv3Var.B = jSONObject.optString("disable_text");
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("sourceObject");
        if (optJSONObject != null) {
            r45.xv3 xv3Var = new r45.xv3();
            xv3Var.f390478e = optJSONObject.optString("bubbleImage");
            xv3Var.f390481h = optJSONObject.optString("bubbleImageMd5");
            xv3Var.f390477d = optJSONObject.optString("corpLogo");
            xv3Var.f390484n = optJSONObject.optString("corpLogoMd5");
            xv3Var.f390479f = optJSONObject.optString("coverImage");
            xv3Var.f390482i = optJSONObject.optString("coverImageMd5");
            xv3Var.f390480g = optJSONObject.optString("detailImage");
            xv3Var.f390483m = optJSONObject.optString("detailImageMd5");
            wv3Var.f389501g = xv3Var;
        }
        return wv3Var;
    }

    public static com.tencent.mm.plugin.luckymoney.model.s5 c(org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.luckymoney.model.s5 s5Var = new com.tencent.mm.plugin.luckymoney.model.s5();
        s5Var.f145619n = jSONObject.optString("spidLogo");
        s5Var.f145620o = jSONObject.optString("spidWishing");
        s5Var.f145621p = jSONObject.optString("spidName");
        s5Var.f145619n = jSONObject.optString("spidLogo");
        s5Var.f145622q = jSONObject.optInt("hbStatus");
        s5Var.f145623r = jSONObject.optInt("receiveStatus");
        s5Var.f145624s = jSONObject.optString("statusMess");
        jSONObject.optString("hintMess");
        s5Var.f145625t = jSONObject.optString("watermark");
        s5Var.f145617i = jSONObject.optString("sendId");
        s5Var.f145626u = jSONObject.optInt("focusFlag");
        s5Var.f145627v = jSONObject.optString("focusWording");
        s5Var.f145628w = jSONObject.optString("focusAppidUserName");
        s5Var.f145629x = jSONObject.optInt("isFocus");
        s5Var.f145630y = jSONObject.optInt("hbType");
        s5Var.B = new com.tencent.mm.plugin.luckymoney.model.h0();
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("atomicFunc");
        if (optJSONObject != null) {
            s5Var.B.f145304d = optJSONObject.optInt("enable");
            s5Var.B.f145306f = optJSONObject.optString("fissionContent");
            s5Var.B.f145305e = optJSONObject.optString("fissionUrl");
        }
        org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("agree_duty");
        if (optJSONObject2 != null) {
            optJSONObject2.optString("agreed_flag", "-1");
            optJSONObject2.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, "");
            optJSONObject2.optString("service_protocol_wording", "");
            optJSONObject2.optString("service_protocol_url", "");
            optJSONObject2.optString("button_wording", "");
            s5Var.A = optJSONObject2.optLong("delay_expired_time", 0L);
        }
        if (s5Var.A > 0) {
            gm0.j1.i();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_REALNAME_DISCLAIMER_QUERY_EXPIRED_TIME_LONG_SYNC, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() + (s5Var.A * 1000)));
        }
        h(jSONObject.optJSONObject("operationTail"));
        return s5Var;
    }

    public static com.tencent.mm.plugin.luckymoney.model.e1 d(org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.luckymoney.model.e1 e1Var = new com.tencent.mm.plugin.luckymoney.model.e1();
        if (jSONObject != null) {
            e1Var.f145234d = jSONObject.optInt("hbType");
            e1Var.f145235e = jSONObject.optInt("hbStatus");
            e1Var.f145236f = jSONObject.optString("statusMess");
            e1Var.f145237g = jSONObject.optString("gameMess");
            e1Var.f145238h = jSONObject.optString("wishing");
            e1Var.f145239i = jSONObject.optString("sendNick");
            e1Var.f145240m = jSONObject.optString("sendHeadImg");
            e1Var.f145241n = jSONObject.optString("sendId");
            e1Var.f145242o = jSONObject.optString("adMessage");
            e1Var.f145243p = jSONObject.optString("adUrl");
            e1Var.f145245q = jSONObject.optLong("amount");
            e1Var.f145246r = jSONObject.optLong("recNum");
            e1Var.f145247s = jSONObject.optLong("recAmount");
            e1Var.f145248t = jSONObject.optInt("totalNum");
            e1Var.f145249u = jSONObject.optLong("totalAmount");
            e1Var.f145250v = jSONObject.optString("receiveId");
            e1Var.f145251w = jSONObject.optInt("hasWriteAnswer");
            e1Var.f145252x = jSONObject.optInt("isSender");
            e1Var.f145253y = jSONObject.optInt("isContinue");
            e1Var.f145254z = jSONObject.optString("headTitle");
            e1Var.A = jSONObject.optInt("receiveStatus");
            e1Var.B = jSONObject.optInt("canShare");
            e1Var.D = jSONObject.optInt("jumpChange");
            e1Var.E = jSONObject.optString("changeWording");
            e1Var.N = jSONObject.optString("changeUrl");
            e1Var.f145233J = jSONObject.optInt("hbKind");
            e1Var.L = jSONObject.optString("externMess");
            e1Var.Q = jSONObject.optString("sendUserName");
            if (com.tencent.mm.sdk.platformtools.t8.K0(e1Var.f145239i)) {
                e1Var.Y = true;
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(e1Var.f145239i) && !com.tencent.mm.sdk.platformtools.t8.K0(e1Var.Q)) {
                tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
                java.lang.String str = e1Var.Q;
                ((sg3.a) v0Var).getClass();
                e1Var.f145239i = c01.a2.e(str);
            }
            e1Var.Z = jSONObject.optInt("not_show_avatar", 0);
            e1Var.X = jSONObject.optString("sendsuffix");
            e1Var.C = new com.tencent.mm.plugin.luckymoney.model.h0();
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("atomicFunc");
            if (optJSONObject != null) {
                e1Var.C.f145304d = optJSONObject.optInt("enable");
                e1Var.C.f145306f = optJSONObject.optString("fissionContent");
                e1Var.C.f145305e = optJSONObject.optString("fissionUrl");
            }
            e1Var.F = new java.util.LinkedList();
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("operationHeader");
            if (optJSONArray != null) {
                for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                    e1Var.F.add(h(optJSONArray.getJSONObject(i17)));
                }
            }
            e1Var.H = jSONObject.optString("watermark");
            e1Var.I = jSONObject.optString("context");
            e1Var.P = jSONObject.optString("contextMd5");
            e1Var.K = jSONObject.optInt("resourceId");
            e1Var.G = h(jSONObject.optJSONObject("operationTail"));
            org.json.JSONArray optJSONArray2 = jSONObject.optJSONArray("record");
            java.util.LinkedList linkedList = new java.util.LinkedList();
            if (optJSONArray2 != null) {
                for (int i18 = 0; i18 < optJSONArray2.length(); i18++) {
                    org.json.JSONObject jSONObject2 = optJSONArray2.getJSONObject(i18);
                    com.tencent.mm.plugin.luckymoney.model.h5 h5Var = new com.tencent.mm.plugin.luckymoney.model.h5();
                    if (jSONObject2 != null) {
                        h5Var.f145312d = jSONObject2.optString("receiveName");
                        h5Var.f145313e = jSONObject2.optString("receiveHeadImg");
                        h5Var.f145314f = jSONObject2.optLong("receiveAmount");
                        h5Var.f145315g = jSONObject2.optString("receiveTime");
                        h5Var.f145316h = jSONObject2.optString("answer");
                        h5Var.f145317i = jSONObject2.optString("receiveId");
                        h5Var.f145318m = jSONObject2.optString("gameTips");
                        h5Var.f145319n = jSONObject2.optString("userName");
                        h5Var.f145321p = jSONObject2.optString("receivesuffix");
                        if (com.tencent.mm.sdk.platformtools.t8.K0(h5Var.f145312d) && !com.tencent.mm.sdk.platformtools.t8.K0(h5Var.f145319n)) {
                            gm0.j1.i();
                            if (com.tencent.mm.sdk.platformtools.t8.K0(((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().f0(h5Var.f145319n).d1())) {
                                h5Var.f145322q = true;
                            } else {
                                tg3.v0 v0Var2 = (tg3.v0) i95.n0.c(tg3.v0.class);
                                java.lang.String str2 = h5Var.f145319n;
                                ((sg3.a) v0Var2).getClass();
                                h5Var.f145312d = c01.a2.e(str2);
                            }
                        }
                    }
                    linkedList.add(h5Var);
                }
            }
            e1Var.M = linkedList;
            e1Var.R = jSONObject.optInt("jumpChangeType");
            e1Var.S = jSONObject.optString("changeIconUrl");
            e1Var.T = jSONObject.optString("showSourceOpen");
            org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("amount_info_page");
            if (optJSONObject2 != null) {
                com.tencent.mm.plugin.luckymoney.model.r0 r0Var = new com.tencent.mm.plugin.luckymoney.model.r0();
                e1Var.f145244p0 = r0Var;
                r0Var.f145567d = optJSONObject2.optString("wording");
                e1Var.f145244p0.f145568e = optJSONObject2.optString("route_info");
            }
        }
        return e1Var;
    }

    public static com.tencent.mm.plugin.luckymoney.model.e1 e(r45.p43 p43Var) {
        if (p43Var == null) {
            return null;
        }
        com.tencent.mm.plugin.luckymoney.model.e1 e1Var = new com.tencent.mm.plugin.luckymoney.model.e1();
        e1Var.f145234d = p43Var.f382738r;
        e1Var.f145235e = p43Var.f382740t;
        e1Var.f145236f = p43Var.f382742v;
        e1Var.f145238h = p43Var.f382734n;
        e1Var.f145241n = p43Var.f382732i;
        e1Var.f145245q = p43Var.f382733m;
        e1Var.U = p43Var.f382726J;
        e1Var.f145246r = p43Var.f382729f;
        e1Var.f145247s = p43Var.f382745y;
        e1Var.f145248t = p43Var.f382730g;
        e1Var.f145249u = p43Var.f382731h;
        e1Var.f145250v = p43Var.f382736p;
        e1Var.f145252x = p43Var.f382735o;
        e1Var.f145253y = p43Var.f382739s;
        e1Var.f145254z = p43Var.f382743w;
        e1Var.A = p43Var.f382741u;
        e1Var.D = p43Var.B;
        e1Var.E = p43Var.C;
        e1Var.N = p43Var.E;
        java.lang.String str = p43Var.D;
        e1Var.Q = str;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
            java.lang.String str2 = e1Var.Q;
            ((sg3.a) v0Var).getClass();
            e1Var.f145239i = c01.a2.e(str2);
        }
        e1Var.R = p43Var.F;
        e1Var.S = p43Var.G;
        e1Var.F = new java.util.LinkedList();
        java.util.LinkedList linkedList = p43Var.f382737q;
        if (!linkedList.isEmpty()) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                r45.s43 s43Var = (r45.s43) it.next();
                com.tencent.mm.plugin.luckymoney.model.o6 o6Var = new com.tencent.mm.plugin.luckymoney.model.o6();
                o6Var.f145520g = s43Var.f385495f;
                o6Var.f145523m = s43Var.f385499m;
                o6Var.f145517d = s43Var.f385496g;
                o6Var.f145522i = s43Var.f385497h;
                o6Var.f145518e = s43Var.f385493d;
                o6Var.f145521h = s43Var.f385498i;
                int i17 = s43Var.f385494e;
                if (i17 == 1) {
                    o6Var.f145519f = "Appid";
                } else if (i17 == 2) {
                    o6Var.f145519f = "Text";
                } else if (i17 == 3) {
                    o6Var.f145519f = "Pic";
                } else if (i17 == 4) {
                    o6Var.f145519f = "Native";
                }
                e1Var.F.add(o6Var);
            }
        }
        if (p43Var.A != null) {
            com.tencent.mm.plugin.luckymoney.model.o6 o6Var2 = new com.tencent.mm.plugin.luckymoney.model.o6();
            e1Var.G = o6Var2;
            r45.s43 s43Var2 = p43Var.A;
            o6Var2.f145520g = s43Var2.f385495f;
            o6Var2.f145523m = s43Var2.f385499m;
            o6Var2.f145517d = s43Var2.f385496g;
            o6Var2.f145522i = s43Var2.f385497h;
            o6Var2.f145518e = s43Var2.f385493d;
            o6Var2.f145521h = s43Var2.f385498i;
            int i18 = s43Var2.f385494e;
            if (i18 == 1) {
                o6Var2.f145519f = "Appid";
            } else if (i18 == 2) {
                o6Var2.f145519f = "Text";
            } else if (i18 == 3) {
                o6Var2.f145519f = "Pic";
            } else if (i18 == 4) {
                o6Var2.f145519f = "Native";
            }
        }
        e1Var.W = a(p43Var.L);
        e1Var.M = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = p43Var.f382746z;
        if (!linkedList2.isEmpty()) {
            java.util.Iterator it6 = linkedList2.iterator();
            while (it6.hasNext()) {
                r45.n43 n43Var = (r45.n43) it6.next();
                com.tencent.mm.plugin.luckymoney.model.h5 h5Var = new com.tencent.mm.plugin.luckymoney.model.h5();
                h5Var.f145318m = n43Var.f381072h;
                h5Var.f145317i = n43Var.f381070f;
                h5Var.f145314f = n43Var.f381068d;
                h5Var.f145315g = n43Var.f381069e;
                h5Var.f145319n = n43Var.f381073i;
                h5Var.f145320o = n43Var.f381074m;
                if (com.tencent.mm.sdk.platformtools.t8.K0(h5Var.f145312d) && !com.tencent.mm.sdk.platformtools.t8.K0(h5Var.f145319n)) {
                    tg3.v0 v0Var2 = (tg3.v0) i95.n0.c(tg3.v0.class);
                    java.lang.String str3 = h5Var.f145319n;
                    ((sg3.a) v0Var2).getClass();
                    h5Var.f145312d = c01.a2.e(str3);
                }
                e1Var.M.add(h5Var);
            }
        }
        return e1Var;
    }

    public static com.tencent.mm.plugin.luckymoney.model.n4 f(org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.luckymoney.model.n4 n4Var = new com.tencent.mm.plugin.luckymoney.model.n4();
        if (jSONObject != null) {
            n4Var.f145471d = jSONObject.optInt("recTotalNum");
            n4Var.f145472e = jSONObject.optLong("recTotalAmount");
            n4Var.f145473f = jSONObject.optInt("sendTotalNum");
            n4Var.f145474g = jSONObject.optLong("sendTotalAmount");
            n4Var.f145476i = jSONObject.optInt("isContinue");
            n4Var.f145475h = jSONObject.optInt("gameCount");
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("record");
            java.util.LinkedList linkedList = new java.util.LinkedList();
            if (optJSONArray != null) {
                for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                    org.json.JSONObject jSONObject2 = optJSONArray.getJSONObject(i17);
                    com.tencent.mm.plugin.luckymoney.model.o4 o4Var = new com.tencent.mm.plugin.luckymoney.model.o4();
                    o4Var.f145496d = jSONObject2.optString("sendName");
                    o4Var.f145497e = jSONObject2.optString("sendHeadImg");
                    o4Var.f145498f = jSONObject2.optLong("receiveAmount");
                    o4Var.f145499g = jSONObject2.optString("receiveTime");
                    o4Var.f145500h = jSONObject2.optInt("hbType");
                    o4Var.f145501i = jSONObject2.optString("sendTitle");
                    o4Var.f145502m = jSONObject2.optString("sendTime");
                    o4Var.f145503n = jSONObject2.optLong("totalAmount");
                    o4Var.f145504o = jSONObject2.optLong("totalNum");
                    o4Var.f145505p = jSONObject2.optLong("recNum");
                    o4Var.f145506q = jSONObject2.optInt("status");
                    o4Var.f145507r = jSONObject2.optInt("thxCount");
                    o4Var.f145508s = jSONObject2.optString("receiveId");
                    o4Var.f145509t = jSONObject2.optString("sendId");
                    o4Var.f145510u = jSONObject2.optInt("hbKind");
                    o4Var.f145511v = jSONObject2.optString("sendsuffix");
                    o4Var.f145512w = jSONObject2.optString("sendDesc");
                    linkedList.add(o4Var);
                }
            }
            n4Var.f145477m = linkedList;
        }
        return n4Var;
    }

    public static com.tencent.mm.plugin.luckymoney.model.s4 g(org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.luckymoney.model.s4 s4Var = new com.tencent.mm.plugin.luckymoney.model.s4();
        if (jSONObject != null) {
            s4Var.f145604d = jSONObject.optString("cdnFileId");
            s4Var.f145605e = jSONObject.optString("cdnAesKey");
            s4Var.f145607g = jSONObject.optString("pagName");
            s4Var.f145613p = jSONObject.optString("maskPagName");
            s4Var.f145606f = jSONObject.optString("wishKeyWord");
            s4Var.f145608h = jSONObject.optString("videoUrl");
            s4Var.f145609i = jSONObject.optString("videoThumbUrl");
            s4Var.f145610m = jSONObject.optInt(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_RESOLUTION_WIDTH);
            s4Var.f145611n = jSONObject.optInt(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_RESOLUTION_HEIGHT);
            s4Var.f145612o = jSONObject.optString("verifyInfo");
            s4Var.f145614q = jSONObject.optString("videoUrlWithVoice");
            s4Var.f145615r = jSONObject.optString("videoThumbUrlWithVoice");
        }
        return s4Var;
    }

    public static com.tencent.mm.plugin.luckymoney.model.o6 h(org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.luckymoney.model.o6 o6Var = new com.tencent.mm.plugin.luckymoney.model.o6();
        if (jSONObject != null) {
            o6Var.f145517d = jSONObject.optInt("enable", 0);
            o6Var.f145520g = jSONObject.optString("content");
            o6Var.f145522i = jSONObject.optString("iconUrl");
            o6Var.f145519f = jSONObject.optString("type");
            o6Var.f145518e = jSONObject.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME);
            o6Var.f145521h = jSONObject.optInt("ossKey");
            o6Var.f145523m = jSONObject.optInt("focus");
        }
        return o6Var;
    }

    public static java.util.ArrayList i(org.json.JSONArray jSONArray) {
        if (jSONArray == null) {
            jSONArray = new org.json.JSONArray();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyParseHelper", "parseOptionItemList res：%s", jSONArray.toString());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 0; i17 < jSONArray.length(); i17++) {
            try {
                org.json.JSONObject jSONObject = jSONArray.getJSONObject(i17);
                if (jSONObject != null) {
                    arrayList.add(j(jSONObject));
                }
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyParseHelper", "parseOptionItemList error：%s", e17.getMessage());
            }
        }
        return arrayList;
    }

    public static r45.aw3 j(org.json.JSONObject jSONObject) {
        r45.aw3 aw3Var = new r45.aw3();
        if (jSONObject == null) {
            jSONObject = new org.json.JSONObject();
        }
        aw3Var.f370293d = jSONObject.optString("wording");
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("jump_info");
        r45.yv3 yv3Var = new r45.yv3();
        if (optJSONObject == null) {
            optJSONObject = new org.json.JSONObject();
        }
        yv3Var.f391400d = optJSONObject.optInt("type");
        yv3Var.f391401e = optJSONObject.optString("url");
        yv3Var.f391402f = optJSONObject.optString(dm.i4.COL_USERNAME);
        yv3Var.f391403g = optJSONObject.optString("pagepath");
        aw3Var.f370294e = yv3Var;
        return aw3Var;
    }
}
