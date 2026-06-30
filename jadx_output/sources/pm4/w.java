package pm4;

/* loaded from: classes15.dex */
public abstract class w {
    public static final r45.un6 a(r45.un6 un6Var) {
        r45.un6 un6Var2 = new r45.un6();
        un6Var2.f387512r = un6Var.f387512r;
        un6Var2.f387506i = un6Var.f387506i;
        un6Var2.f387508n = un6Var.f387508n;
        un6Var2.f387507m = un6Var.f387507m;
        un6Var2.f387509o = un6Var.f387509o;
        un6Var2.f387505h = un6Var.f387505h;
        un6Var2.f387502e = un6Var.f387502e;
        un6Var2.f387503f = un6Var.f387503f;
        un6Var2.f387504g = un6Var.f387504g;
        un6Var2.f387501d = un6Var.f387501d;
        un6Var2.f387511q.addAll(un6Var.f387511q);
        un6Var2.f387518x = un6Var.f387518x;
        un6Var2.f387519y = un6Var.f387519y;
        un6Var2.f387520z = un6Var.f387520z;
        return un6Var2;
    }

    public static java.util.List b(org.json.JSONArray jSONArray) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 0; i17 < jSONArray.length(); i17++) {
            org.json.JSONObject optJSONObject = jSONArray.optJSONObject(i17);
            r45.x56 x56Var = new r45.x56();
            x56Var.f389795d = optJSONObject.optString(dm.i4.COL_ID, "");
            x56Var.f389796e = optJSONObject.optString("wording", "");
            x56Var.f389797f = optJSONObject.optLong("category", 0L);
            x56Var.f389798g = optJSONObject.optInt("actionType", 0);
            x56Var.f389799h = optJSONObject.optString("url", "");
            x56Var.f389800i = optJSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, "");
            x56Var.f389801m = optJSONObject.optString("subTitle", "");
            x56Var.f389802n = optJSONObject.optString("icon", "");
            arrayList.add(x56Var);
        }
        return arrayList;
    }

    public static java.lang.String c(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i18, int i19, java.lang.String str6, java.lang.String str7, boolean z17, long j17) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (j17 > 0) {
            hashMap.put(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, java.lang.String.valueOf(j17));
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
            hashMap.put("redPointMsgId", str4);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            hashMap.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, str);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            hashMap.put("query", str2);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            hashMap.put("requestId", str3);
            hashMap.put("pRequestId", str3);
            hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_SEQ, str3);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str7)) {
            hashMap.put("extParams", str7);
        }
        hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, java.lang.String.valueOf(i17));
        hashMap.put("isPrerender", z17 ? "0" : "1");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str5)) {
            hashMap.put("tabInfo", str5);
        }
        if (i18 > 0) {
            hashMap.put("contentReddot", "" + i18);
        }
        if (i19 > 0) {
            hashMap.put("numberReddot", "" + i19);
        }
        hashMap.put(com.google.android.gms.common.Scopes.PROFILE, "1");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str6)) {
            hashMap.put("homeMsgId", str6);
        }
        try {
            hashMap.put("deviceName", java.net.URLEncoder.encode(o45.wf.f343026d, "utf8"));
            hashMap.put("deviceBrand", java.net.URLEncoder.encode(android.os.Build.BRAND, "utf8"));
            hashMap.put("deviceModel", java.net.URLEncoder.encode(wo.w0.m(), "utf8"));
            hashMap.put("ostype", wo.q.f447784e);
        } catch (java.io.UnsupportedEncodingException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TopStory.TopStoryApiLogic", e17, "", new java.lang.Object[0]);
        }
        return e(hashMap);
    }

    public static java.util.HashMap d(android.content.Context context) {
        java.util.HashMap hashMap = new java.util.HashMap();
        r(hashMap);
        int i17 = o45.wf.f343023a;
        hashMap.put("ostype", wo.q.f447784e);
        try {
            hashMap.put("deviceName", java.net.URLEncoder.encode(o45.wf.f343026d, "utf8"));
            hashMap.put("deviceBrand", java.net.URLEncoder.encode(android.os.Build.BRAND, "utf8"));
        } catch (java.io.UnsupportedEncodingException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TopStory.TopStoryApiLogic", e17, "", new java.lang.Object[0]);
        }
        ((ee0.g) ((fe0.m3) i95.n0.c(fe0.m3.class))).Bi();
        hashMap.put("imei", "");
        hashMap.put("isOverseaApp", com.tencent.mm.sdk.platformtools.t8.P0(context) ? "1" : "0");
        return hashMap;
    }

    public static java.lang.String e(java.util.HashMap hashMap) {
        r(hashMap);
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("file://");
        stringBuffer.append(com.tencent.mm.plugin.websearch.l2.g(1).l());
        stringBuffer.append("/app.html?");
        stringBuffer.append(com.tencent.mm.plugin.websearch.l2.k(hashMap));
        return stringBuffer.toString();
    }

    public static final r45.zn6 f(java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            r45.zn6 zn6Var = (r45.zn6) it.next();
            if (zn6Var != null && !com.tencent.mm.sdk.platformtools.t8.K0(zn6Var.f392244d)) {
                return zn6Var;
            }
        }
        return null;
    }

    public static java.lang.String g() {
        return lp0.b.h() + "topstory/homecache/";
    }

    public static java.lang.String h() {
        return lp0.b.h() + "topstory/negcache/";
    }

    public static java.lang.String i() {
        return com.tencent.mm.sdk.platformtools.x2.f193071a.getCacheDir() + "/topstory/";
    }

    public static java.lang.String j(java.lang.String str) {
        return com.tencent.mm.sdk.platformtools.x2.f193071a.getCacheDir() + "/topstory/" + str + "/";
    }

    public static final boolean k(int i17) {
        return i17 == 20002;
    }

    public static final boolean l(int i17) {
        return i17 == 110 || i17 == 700;
    }

    public static final boolean m(int i17) {
        return i17 == 100;
    }

    public static final boolean n(int i17) {
        return i17 == 666;
    }

    public static final void o(java.util.List list, java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray(str);
            for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                org.json.JSONObject jSONObject = jSONArray.getJSONObject(i17);
                r45.x50 x50Var = new r45.x50();
                x50Var.f389788d = jSONObject.optString("key", "");
                x50Var.f389789e = jSONObject.optInt("uintValue", 0);
                x50Var.f389790f = jSONObject.optString("textValue", "");
                list.add(x50Var);
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public static final r45.un6 p(org.json.JSONObject jSONObject) {
        r45.un6 un6Var = new r45.un6();
        un6Var.f387508n = jSONObject.optString("query", "");
        un6Var.f387506i = jSONObject.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 21);
        un6Var.f387512r = java.util.UUID.randomUUID().toString();
        un6Var.f387503f = jSONObject.optString("searchId", "");
        if (com.tencent.mars.comm.NetStatusUtil.isConnected(com.tencent.mm.sdk.platformtools.x2.f193071a) && !com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            un6Var.f387514t = true;
        }
        java.lang.String optString = jSONObject.optString("videoId", "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray(jSONObject.optString("videoUrls", ""));
            if (jSONArray.length() > 0) {
                for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                    r45.zn6 zn6Var = new r45.zn6();
                    zn6Var.f392244d = jSONArray.getString(i17);
                    arrayList.add(zn6Var);
                }
            }
        } catch (org.json.JSONException unused) {
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            r45.xn6 xn6Var = new r45.xn6();
            un6Var.f387509o = xn6Var;
            xn6Var.f390255d = jSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, "");
            un6Var.f387509o.f390257f = jSONObject.optString("thumbUrl", "");
            un6Var.f387509o.f390258g = jSONObject.optInt("mediaDuration", 0);
            r45.xn6 xn6Var2 = un6Var.f387509o;
            xn6Var2.f390259h = optString;
            xn6Var2.f390274y = jSONObject.optString("strPlayCount", "");
            un6Var.f387509o.f390262n = jSONObject.optString("shareUrl", "");
            un6Var.f387509o.f390263o = jSONObject.optString("shareTitle", "");
            un6Var.f387509o.f390275z = jSONObject.optString("titleUrl", "");
            un6Var.f387509o.f390264p = jSONObject.optString("shareDesc", "");
            un6Var.f387509o.f390266q = jSONObject.optString("shareImgUrl", "");
            un6Var.f387509o.f390267r = jSONObject.optString("shareString", "");
            un6Var.f387509o.f390268s = jSONObject.optString("shareStringUrl", "");
            un6Var.f387509o.f390269t = jSONObject.optString(ya.b.SOURCE, "");
            un6Var.f387509o.f390270u = jSONObject.optString("sourceUrl", "");
            un6Var.f387509o.f390271v = jSONObject.optInt("relevant_category", -1);
            un6Var.f387509o.f390272w = jSONObject.optString("shareOpenId", "");
            un6Var.f387509o.G = jSONObject.optString("docID", "");
            un6Var.f387509o.f390254J = jSONObject.optInt("videoSize", 0);
            un6Var.f387509o.E = android.os.SystemClock.elapsedRealtime();
            un6Var.f387509o.A = jSONObject.optInt("itemType", 0);
            try {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject(jSONObject.optString("block", ""));
                un6Var.f387509o.H = jSONObject2.optLong("resultType");
                un6Var.f387509o.I = jSONObject2.optLong("type");
            } catch (org.json.JSONException unused2) {
            }
            un6Var.f387509o.f390273x = jSONObject.optString("expand", "");
            un6Var.f387509o.K.addAll(arrayList);
            r45.zn6 f17 = f(arrayList);
            if (f17 != null) {
                r45.xn6 xn6Var3 = un6Var.f387509o;
                xn6Var3.f390256e = f17.f392244d;
                xn6Var3.U = f17.f392245e;
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(un6Var.f387509o.f390257f)) {
                un6Var.f387509o.f390257f = "http://shp.qpic.cn/qqvideo_ori/0/" + un6Var.f387509o.f390259h + java.lang.String.format("_%s_%s/0", java.lang.Integer.valueOf(com.tencent.mm.plugin.appbrand.jsapi.storage.e0.CTRL_INDEX), 280);
            }
            java.lang.String optString2 = jSONObject.optString("tagList", "");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(optString2)) {
                try {
                    un6Var.f387509o.D.addAll(b(new org.json.JSONArray(optString2)));
                } catch (java.lang.Exception unused3) {
                }
            }
            if (!jSONObject.optBoolean("not_show_feedback", false)) {
                un6Var.f387509o.T = new r45.vn6();
                org.json.JSONObject optJSONObject = jSONObject.optJSONObject("feedbackObj");
                if (optJSONObject != null) {
                    un6Var.f387509o.T.f388399d = optJSONObject.optString("detailWording");
                    un6Var.f387509o.T.f388400e = optJSONObject.optString("detailUrl");
                    org.json.JSONArray optJSONArray = optJSONObject.optJSONArray("feedbackData");
                    if (optJSONArray != null) {
                        for (int i18 = 0; i18 < optJSONArray.length(); i18++) {
                            r45.ir0 ir0Var = new r45.ir0();
                            ir0Var.f377277d = optJSONArray.optJSONObject(i18).optString(dm.i4.COL_ID, "");
                            ir0Var.f377278e = optJSONArray.optJSONObject(i18).optString("wording", "");
                            un6Var.f387509o.T.f388401f.add(ir0Var);
                        }
                    }
                }
            }
            java.lang.String optString3 = jSONObject.optString("show_tag_list", "");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(optString3)) {
                try {
                    un6Var.f387509o.D.addAll(b(new org.json.JSONArray(optString3)));
                } catch (org.json.JSONException unused4) {
                }
            }
            un6Var.f387505h = un6Var.f387509o.f390271v;
            un6Var.f387502e = jSONObject.optString("expand", "");
            un6Var.f387507m = "";
            r45.xn6 xn6Var4 = un6Var.f387509o;
            un6Var.f387501d = xn6Var4.f390259h;
            xn6Var4.L = jSONObject.optInt("switchFlag", 0);
            un6Var.f387509o.R = jSONObject.optJSONObject("colikeInfo") != null && jSONObject.optJSONObject("colikeInfo").optBoolean("isSelfThumb");
            un6Var.f387509o.S = jSONObject.optJSONObject("colikeInfo") != null ? jSONObject.optJSONObject("colikeInfo").optString("byPass", "") : "";
            if (un6Var.f387505h == 100203) {
                r45.xn6 xn6Var5 = un6Var.f387509o;
                xn6Var5.f390260i = com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1;
                xn6Var5.f390261m = 640;
            } else {
                r45.xn6 xn6Var6 = un6Var.f387509o;
                xn6Var6.f390260i = com.tencent.mm.plugin.appbrand.jsapi.storage.e0.CTRL_INDEX;
                xn6Var6.f390261m = 280;
            }
            org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("secondVideoInfo");
            if (optJSONObject2 != null) {
                un6Var.f387509o.N = new r45.sn6();
                un6Var.f387509o.N.f385867d = optJSONObject2.optInt("videoSecondType");
                un6Var.f387509o.N.f385870g = optJSONObject2.optInt("requestDuration");
                un6Var.f387509o.N.f385871h = optJSONObject2.optInt("requestPercent");
            }
            java.lang.String optString4 = jSONObject.optString("videoChannelTitle", "");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(optString4)) {
                long j17 = un6Var.f387505h;
                if (j17 == 100202 || j17 == 100204 || j17 == 100205) {
                    r45.x56 x56Var = new r45.x56();
                    un6Var.f387510p = x56Var;
                    x56Var.f389800i = optString4;
                }
            }
            java.lang.String optString5 = jSONObject.optString("extReqParams", "");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(optString5)) {
                try {
                    org.json.JSONArray jSONArray2 = new org.json.JSONArray(optString5);
                    for (int i19 = 0; i19 < jSONArray2.length(); i19++) {
                        org.json.JSONObject jSONObject3 = jSONArray2.getJSONObject(i19);
                        r45.x50 x50Var = new r45.x50();
                        x50Var.f389788d = jSONObject3.optString("key", "");
                        x50Var.f389789e = jSONObject3.optInt("uintValue", 0);
                        x50Var.f389790f = jSONObject3.optString("textValue", "");
                        un6Var.f387511q.add(x50Var);
                    }
                } catch (java.lang.Exception unused5) {
                }
            }
            java.lang.String optString6 = jSONObject.optString("preNetType", "");
            un6Var.f387519y = optString6;
            if (optString6.equals("wangka")) {
                un6Var.f387520z = 1;
            } else if (un6Var.f387519y.equals("2g") || un6Var.f387519y.equals("3g") || un6Var.f387519y.equals("4g")) {
                un6Var.f387520z = 2;
            } else {
                un6Var.f387520z = 0;
            }
        }
        return un6Var;
    }

    public static final r45.un6 q(r45.y97 y97Var, int i17, java.lang.String str) {
        r45.un6 un6Var = new r45.un6();
        un6Var.f387512r = java.util.UUID.randomUUID().toString();
        r45.xn6 xn6Var = new r45.xn6();
        un6Var.f387509o = xn6Var;
        xn6Var.f390255d = y97Var.f390905n;
        xn6Var.G = "video-" + y97Var.f390898d;
        r45.xn6 xn6Var2 = un6Var.f387509o;
        xn6Var2.f390259h = y97Var.f390898d;
        java.lang.String str2 = y97Var.f390916y;
        xn6Var2.f390257f = str2;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            un6Var.f387509o.f390257f = "http://shp.qpic.cn/qqvideo_ori/0/" + y97Var.f390898d + java.lang.String.format("_%s_%s/0", java.lang.Integer.valueOf(com.tencent.mm.plugin.appbrand.jsapi.storage.e0.CTRL_INDEX), 280);
        }
        r45.xn6 xn6Var3 = un6Var.f387509o;
        xn6Var3.f390274y = y97Var.f390903i;
        xn6Var3.f390269t = y97Var.f390910s;
        xn6Var3.f390270u = y97Var.f390911t;
        java.lang.String str3 = y97Var.f390899e;
        xn6Var3.f390273x = str3;
        xn6Var3.B = str3;
        xn6Var3.f390267r = y97Var.f390908q;
        if (y97Var.f390915x == 100203) {
            xn6Var3.f390260i = com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1;
            xn6Var3.f390261m = 640;
        } else {
            xn6Var3.f390260i = com.tencent.mm.plugin.appbrand.jsapi.storage.e0.CTRL_INDEX;
            xn6Var3.f390261m = 280;
        }
        xn6Var3.E = java.lang.System.currentTimeMillis();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(y97Var.f390914w)) {
            try {
                org.json.JSONArray jSONArray = new org.json.JSONArray(y97Var.f390914w);
                for (int i18 = 0; i18 < jSONArray.length(); i18++) {
                    org.json.JSONObject jSONObject = jSONArray.getJSONObject(i18);
                    r45.x56 x56Var = new r45.x56();
                    x56Var.f389795d = jSONObject.optString(dm.i4.COL_ID);
                    x56Var.f389796e = jSONObject.optString("wording");
                    x56Var.f389797f = jSONObject.optLong("category");
                    x56Var.f389798g = jSONObject.optInt("actionType");
                    x56Var.f389799h = jSONObject.optString("url");
                    x56Var.f389800i = jSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                    x56Var.f389801m = jSONObject.optString("subTitle");
                    x56Var.f389802n = jSONObject.optString("icon");
                    un6Var.f387509o.D.add(x56Var);
                }
            } catch (java.lang.Exception unused) {
            }
        }
        un6Var.f387501d = y97Var.f390898d;
        un6Var.f387502e = y97Var.f390899e;
        un6Var.f387503f = y97Var.f390900f;
        un6Var.f387504g = y97Var.f390901g;
        long j17 = y97Var.f390915x;
        un6Var.f387505h = j17;
        if (j17 <= 0) {
            un6Var.f387505h = 100201L;
        }
        un6Var.f387514t = false;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(y97Var.f390913v)) {
            o(un6Var.f387511q, y97Var.f390913v);
        }
        un6Var.f387507m = "";
        un6Var.f387506i = i17;
        un6Var.f387508n = str;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(y97Var.f390917z)) {
            r45.x56 x56Var2 = new r45.x56();
            un6Var.f387510p = x56Var2;
            x56Var2.f389800i = y97Var.f390917z;
        }
        return un6Var;
    }

    public static void r(java.util.HashMap hashMap) {
        hashMap.put("lang", com.tencent.mm.sdk.platformtools.m2.f(com.tencent.mm.sdk.platformtools.x2.f193071a));
        hashMap.put("platform", com.eclipsesource.mmv8.Platform.ANDROID);
        hashMap.put("version", java.lang.String.valueOf(com.tencent.mm.plugin.websearch.l2.g(1).b()));
        hashMap.put(com.tencent.tmassistantsdk.downloadservice.DownloadInfo.NETTYPE, com.tencent.mm.plugin.websearch.l2.b());
        hashMap.put("isClientLoading", "1");
        hashMap.put("wechatVersion", com.tencent.mm.sdk.platformtools.z.f193111g);
        float q17 = i65.a.q(com.tencent.mm.sdk.platformtools.x2.f193071a);
        if (q17 != 1.0f && q17 != 0.8f && q17 != 1.1f && q17 != 1.12f && q17 != 1.125f && q17 != 1.4f && q17 != 1.55f && q17 != 1.65f) {
            q17 = 1.0f;
        }
        hashMap.put("fontRatio", java.lang.String.valueOf(q17));
        ((ra0.v) i95.n0.c(ra0.v.class)).getClass();
        hashMap.put("showNewlife", "0");
        boolean Ri = ((en3.v) ((ra0.v) i95.n0.c(ra0.v.class))).Ri();
        hashMap.put("enableUniformReddot", Ri ? "1" : "0");
        if (Ri) {
            java.lang.String str = ((en3.v) ((ra0.v) i95.n0.c(ra0.v.class))).f255324d;
            java.lang.String str2 = "";
            try {
                com.tencent.mm.plugin.finder.extension.reddot.jb L0 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().L0("NewLife.Entrance");
                if (L0 != null) {
                    kn3.b bVar = new kn3.b();
                    r45.vs2 vs2Var = L0.field_ctrInfo;
                    java.lang.String str3 = vs2Var != null ? vs2Var.f388490h : null;
                    if (str3 == null) {
                        str3 = "";
                    }
                    bVar.l(str3);
                    ((wm4.z) ((pm4.v) i95.n0.c(pm4.v.class))).getClass();
                    int h17 = wm4.u.h(L0);
                    com.tencent.mm.protobuf.g byteString = L0.N.getByteString(7);
                    if (byteString != null) {
                        r45.ez2 ez2Var = new r45.ez2();
                        ez2Var.parseFrom(byteString.f192156a);
                        com.tencent.mm.protobuf.g byteString2 = ez2Var.getByteString(4);
                        java.lang.String i17 = byteString2 != null ? byteString2.i() : null;
                        if (i17 == null) {
                            i17 = "";
                        }
                        bVar.j(i17);
                        bVar.k(h17);
                    }
                    java.lang.String jSONObject = bVar.toJson().toString();
                    kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
                    com.tencent.mars.xlog.Log.i(str, "getRedDotParamsJson: jsonString:".concat(jSONObject));
                    str2 = jSONObject;
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e(str, "getRedDotParamsJson " + e17);
            }
            hashMap.put("reddotParams", android.net.Uri.encode(str2));
        }
    }

    public static org.json.JSONArray s(java.util.List list) {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (int i17 = 0; i17 < list.size(); i17++) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                r45.x56 x56Var = (r45.x56) list.get(i17);
                jSONObject.put(dm.i4.COL_ID, x56Var.f389795d);
                jSONObject.put("wording", x56Var.f389796e);
                jSONObject.put("category", x56Var.f389797f);
                jSONObject.put("actionType", x56Var.f389798g);
                jSONObject.put("url", x56Var.f389799h);
                jSONObject.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, x56Var.f389800i);
                jSONObject.put("subTitle", x56Var.f389801m);
                jSONObject.put("icon", x56Var.f389802n);
                jSONArray.put(jSONObject);
            } catch (java.lang.Exception unused) {
            }
        }
        return jSONArray;
    }
}
