package fn4;

/* loaded from: classes15.dex */
public class z0 {

    /* renamed from: a, reason: collision with root package name */
    public fn4.b f264631a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f264632b;

    /* renamed from: c, reason: collision with root package name */
    public int f264633c;

    /* renamed from: d, reason: collision with root package name */
    public sm4.k f264634d;

    /* renamed from: e, reason: collision with root package name */
    public sm4.h f264635e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.modelbase.u0 f264636f = new fn4.v0(this);

    public static void a(fn4.z0 z0Var, org.json.JSONObject jSONObject, boolean z17) {
        z0Var.getClass();
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("client_conf");
        if (optJSONObject != null) {
            z0Var.f264633c = optJSONObject.optInt("enable_prefetch", 0);
            optJSONObject.optInt("max_report_exposed_cnt", 0);
            optJSONObject.optInt("max_report_exposed_cnt", 0);
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryVideoDataMgr", "parseAndSetPreFetchReportInfo %s", optJSONObject.toString());
        }
        java.lang.String optString = jSONObject.optString("searchID");
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryVideoDataMgr", "fetch response newsearchid: %s originSearchId: %s", optString, z0Var.f264631a.r0().f387507m);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            z0Var.f264631a.r0().f387507m = optString;
        }
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
        boolean optBoolean = jSONObject.optBoolean("isSinglePage", false);
        z0Var.f264631a.r0().A = optBoolean;
        if (optBoolean) {
            z0Var.f264631a.R2();
        }
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            uu4.a.a(1);
            z0Var.f264631a.A4(-4, jSONObject.optString("nomoreText"));
            return;
        }
        try {
            java.util.List k17 = k(z0Var.f264631a.p6(), optJSONArray);
            if (((java.util.ArrayList) k17).size() == 0) {
                z0Var.f264631a.A4(-2, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.hsj));
            } else {
                z0Var.f264631a.O1(k17, z17);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TopStory.TopStoryVideoDataMgr", e17, "parseAndRequestVideoList error: %s", e17.getMessage());
            uu4.a.a(3);
            z0Var.f264631a.A4(-3, "ParseDataError");
        }
    }

    public static int c() {
        int netType = com.tencent.mars.comm.NetStatusUtil.getNetType(com.tencent.mm.sdk.platformtools.x2.f193071a);
        if (netType == -1) {
            return 0;
        }
        if (netType == 0) {
            return 1;
        }
        if (com.tencent.mars.comm.NetStatusUtil.is2G(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            return 2;
        }
        if (com.tencent.mars.comm.NetStatusUtil.is3G(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            return 3;
        }
        return com.tencent.mars.comm.NetStatusUtil.is4G(com.tencent.mm.sdk.platformtools.x2.f193071a) ? 4 : 0;
    }

    public static boolean f(r45.xn6 xn6Var) {
        if (xn6Var == null) {
            return false;
        }
        if (xn6Var.f390265p0 != 1 || android.text.TextUtils.isEmpty(xn6Var.f390270u)) {
            return xn6Var.f390265p0 == 2 && !android.text.TextUtils.isEmpty(xn6Var.Z);
        }
        return true;
    }

    public static java.lang.String g(java.lang.String str, java.lang.String str2, int i17, int i18, int i19) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return str;
        }
        return str + str2 + "Unicomtype=" + i17 + "&newnettype=" + i18 + "&Netoperator=" + i19;
    }

    public static boolean h(r45.xn6 xn6Var, android.content.Context context) {
        if (xn6Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryVideoDataMgr", "jumpToProfile sJumpType:%s", java.lang.Integer.valueOf(xn6Var.f390265p0));
            int i17 = xn6Var.f390265p0;
            if (i17 == 1) {
                if (!com.tencent.mm.sdk.platformtools.t8.K0(xn6Var.f390270u)) {
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("rawUrl", xn6Var.f390270u);
                    j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
                    return true;
                }
            } else if (i17 == 2 && !android.text.TextUtils.isEmpty(xn6Var.Z)) {
                com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(xn6Var.Z, true);
                if (n17 == null || ((int) n17.E2) <= 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryVideoDataMgr", "jumpToProfile contact not exist, getNow");
                    boolean[] zArr = {false};
                    com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(context, null, context.getString(com.tencent.mm.R.string.gga), false, true, new fn4.w0(zArr));
                    try {
                        ((c01.k7) c01.n8.a()).b(xn6Var.Z, 26, new fn4.x0(Q, zArr, xn6Var, context));
                    } catch (java.lang.Throwable th6) {
                        Q.dismiss();
                        com.tencent.mars.xlog.Log.e("MicroMsg.TopStory.TopStoryVideoDataMgr", "jumpToProfile err:%s", th6.getMessage());
                    }
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryVideoDataMgr", "jumpToProfile contact exist");
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.putExtra("Contact_User", xn6Var.Z);
                    intent2.putExtra("biz_profile_tab_type", 1);
                    j45.l.j(context, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent2, null);
                }
                return true;
            }
        }
        return false;
    }

    public static void j(org.json.JSONArray jSONArray, r45.xn6 xn6Var) {
        try {
            org.json.JSONObject optJSONObject = jSONArray.optJSONObject(0);
            r45.pn6 pn6Var = new r45.pn6();
            xn6Var.Y = pn6Var;
            pn6Var.f383242m = optJSONObject.optString("bizuin");
            xn6Var.Y.f383240h = optJSONObject.optString(dm.i4.COL_ID);
            org.json.JSONObject optJSONObject2 = optJSONObject.optJSONArray("list").optJSONObject(0);
            xn6Var.Y.f383236d = optJSONObject2.optInt("beginTime");
            xn6Var.Y.f383237e = optJSONObject2.optInt("endTime");
            xn6Var.Y.f383238f = optJSONObject2.optInt("minShowTime");
            xn6Var.Y.f383239g = optJSONObject2.optInt("type");
            xn6Var.Y.f383241i = optJSONObject2.optString(dm.i4.COL_ID);
            org.json.JSONObject jSONObject = new org.json.JSONObject(optJSONObject2.optString("dot"));
            xn6Var.Y.f383243n = new r45.on6();
            xn6Var.Y.f383243n.f382382d = jSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            xn6Var.Y.f383243n.f382383e = jSONObject.optString("desc");
            xn6Var.Y.f383243n.f382384f = jSONObject.optString("relativeURL");
            xn6Var.Y.f383243n.f382385g = jSONObject.optString("originalId");
            xn6Var.Y.f383243n.f382386h = jSONObject.optString("weAppName");
            xn6Var.Y.f383243n.f382387i = jSONObject.optString("appId");
            xn6Var.Y.f383243n.f382388m = jSONObject.optString("avatar");
        } catch (java.lang.Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List k(boolean r30, org.json.JSONArray r31) {
        /*
            Method dump skipped, instructions count: 813
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fn4.z0.k(boolean, org.json.JSONArray):java.util.List");
    }

    public static void l(org.json.JSONArray jSONArray, r45.xn6 xn6Var) {
        for (int i17 = 0; i17 < jSONArray.length(); i17++) {
            r45.x56 x56Var = new r45.x56();
            x56Var.f389795d = jSONArray.getJSONObject(i17).optString(dm.i4.COL_ID);
            x56Var.f389796e = jSONArray.getJSONObject(i17).optString("wording");
            x56Var.f389797f = jSONArray.getJSONObject(i17).optLong("category");
            x56Var.f389798g = jSONArray.getJSONObject(i17).optInt("actionType");
            x56Var.f389799h = jSONArray.getJSONObject(i17).optString("url");
            x56Var.f389800i = jSONArray.getJSONObject(i17).optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            x56Var.f389801m = jSONArray.getJSONObject(i17).optString("subTitle");
            x56Var.f389802n = jSONArray.getJSONObject(i17).optString("icon");
            xn6Var.D.add(x56Var);
        }
    }

    public static void m(org.json.JSONObject jSONObject, r45.xn6 xn6Var) {
        r45.vn6 vn6Var = new r45.vn6();
        xn6Var.T = vn6Var;
        vn6Var.f388399d = jSONObject.optString("detailWording");
        xn6Var.T.f388400e = jSONObject.optString("detailUrl");
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("feedbackData");
        if (optJSONArray != null) {
            for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                r45.ir0 ir0Var = new r45.ir0();
                ir0Var.f377277d = optJSONArray.optJSONObject(i17).optString(dm.i4.COL_ID, "");
                ir0Var.f377278e = optJSONArray.optJSONObject(i17).optString("wording", "");
                ir0Var.f377279f = optJSONArray.optJSONObject(i17).optBoolean("isUseToConfirm", false);
                xn6Var.T.f388401f.add(ir0Var);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void n(org.json.JSONObject r12, r45.xn6 r13) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fn4.z0.n(org.json.JSONObject, r45.xn6):void");
    }

    public static void r(boolean z17, r45.xn6 xn6Var, org.json.JSONObject jSONObject) {
        java.lang.String optString = jSONObject.optString("thumbUrl");
        xn6Var.f390257f = optString;
        if (z17) {
            xn6Var.f390260i = com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1;
            xn6Var.f390261m = 640;
        } else {
            xn6Var.f390260i = com.tencent.mm.plugin.appbrand.jsapi.storage.e0.CTRL_INDEX;
            xn6Var.f390261m = 280;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            xn6Var.f390257f = "http://shp.qpic.cn/qqvideo_ori/0/" + xn6Var.f390259h + java.lang.String.format("_%s_%s/0", java.lang.Integer.valueOf(xn6Var.f390260i), java.lang.Integer.valueOf(xn6Var.f390261m));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryVideoDataMgr", "setThumbnailUrl %s %s", xn6Var.f390259h, xn6Var.f390257f);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:1|(4:2|3|(1:5)(1:132)|6)|(1:8)(2:111|(17:113|(15:(1:(1:130))|10|(4:12|13|14|15)(4:104|105|106|107)|16|17|(2:18|(1:20)(1:21))|22|(2:26|(2:27|(2:29|(2:32|33)(1:31))(1:34)))(0)|35|(2:43|(3:49|(4:52|(2:54|(4:60|(1:62)|63|64))(1:69)|65|50)|70))|(1:73)|(1:75)|(1:80)|77|78)|131|10|(0)(0)|16|17|(3:18|(0)(0)|20)|22|(3:24|26|(3:27|(0)(0)|31))(0)|35|(5:37|39|41|43|(5:45|47|49|(1:50)|70))|(0)|(0)|(0)|77|78))|9|10|(0)(0)|16|17|(3:18|(0)(0)|20)|22|(0)(0)|35|(0)|(0)|(0)|(0)|77|78|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01b1, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01b2, code lost:
    
        r16 = r6;
        r6 = r1;
        r1 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01d0, code lost:
    
        r6.disconnect();
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01d5, code lost:
    
        r10.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01da, code lost:
    
        r6 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0080 A[Catch: all -> 0x01bd, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x01bd, blocks: (B:3:0x0010, B:6:0x001a, B:10:0x0050, B:12:0x0062, B:104:0x0080, B:111:0x0027), top: B:2:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0062 A[Catch: all -> 0x01bd, TRY_LEAVE, TryCatch #3 {all -> 0x01bd, blocks: (B:3:0x0010, B:6:0x001a, B:10:0x0050, B:12:0x0062, B:104:0x0080, B:111:0x0027), top: B:2:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a6 A[Catch: all -> 0x01b1, LOOP:0: B:18:0x00a0->B:20:0x00a6, LOOP_END, TryCatch #0 {all -> 0x01b1, blocks: (B:17:0x0096, B:18:0x00a0, B:20:0x00a6, B:22:0x00aa, B:24:0x00c1, B:27:0x00ca, B:29:0x00d0, B:33:0x00dd, B:31:0x00e6, B:35:0x00e9, B:37:0x00f2, B:39:0x00fb, B:41:0x0101, B:43:0x0107, B:45:0x011c, B:47:0x0125, B:50:0x012c, B:52:0x0132, B:54:0x0138, B:56:0x014c, B:58:0x0152, B:60:0x0158, B:62:0x0175, B:63:0x018c), top: B:16:0x0096 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00aa A[EDGE_INSN: B:21:0x00aa->B:22:0x00aa BREAK  A[LOOP:0: B:18:0x00a0->B:20:0x00a6], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c1 A[Catch: all -> 0x01b1, TryCatch #0 {all -> 0x01b1, blocks: (B:17:0x0096, B:18:0x00a0, B:20:0x00a6, B:22:0x00aa, B:24:0x00c1, B:27:0x00ca, B:29:0x00d0, B:33:0x00dd, B:31:0x00e6, B:35:0x00e9, B:37:0x00f2, B:39:0x00fb, B:41:0x0101, B:43:0x0107, B:45:0x011c, B:47:0x0125, B:50:0x012c, B:52:0x0132, B:54:0x0138, B:56:0x014c, B:58:0x0152, B:60:0x0158, B:62:0x0175, B:63:0x018c), top: B:16:0x0096 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d0 A[Catch: all -> 0x01b1, TryCatch #0 {all -> 0x01b1, blocks: (B:17:0x0096, B:18:0x00a0, B:20:0x00a6, B:22:0x00aa, B:24:0x00c1, B:27:0x00ca, B:29:0x00d0, B:33:0x00dd, B:31:0x00e6, B:35:0x00e9, B:37:0x00f2, B:39:0x00fb, B:41:0x0101, B:43:0x0107, B:45:0x011c, B:47:0x0125, B:50:0x012c, B:52:0x0132, B:54:0x0138, B:56:0x014c, B:58:0x0152, B:60:0x0158, B:62:0x0175, B:63:0x018c), top: B:16:0x0096 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e9 A[EDGE_INSN: B:34:0x00e9->B:35:0x00e9 BREAK  A[LOOP:1: B:27:0x00ca->B:31:0x00e6], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f2 A[Catch: all -> 0x01b1, TryCatch #0 {all -> 0x01b1, blocks: (B:17:0x0096, B:18:0x00a0, B:20:0x00a6, B:22:0x00aa, B:24:0x00c1, B:27:0x00ca, B:29:0x00d0, B:33:0x00dd, B:31:0x00e6, B:35:0x00e9, B:37:0x00f2, B:39:0x00fb, B:41:0x0101, B:43:0x0107, B:45:0x011c, B:47:0x0125, B:50:0x012c, B:52:0x0132, B:54:0x0138, B:56:0x014c, B:58:0x0152, B:60:0x0158, B:62:0x0175, B:63:0x018c), top: B:16:0x0096 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0132 A[Catch: all -> 0x01b1, TryCatch #0 {all -> 0x01b1, blocks: (B:17:0x0096, B:18:0x00a0, B:20:0x00a6, B:22:0x00aa, B:24:0x00c1, B:27:0x00ca, B:29:0x00d0, B:33:0x00dd, B:31:0x00e6, B:35:0x00e9, B:37:0x00f2, B:39:0x00fb, B:41:0x0101, B:43:0x0107, B:45:0x011c, B:47:0x0125, B:50:0x012c, B:52:0x0132, B:54:0x0138, B:56:0x014c, B:58:0x0152, B:60:0x0158, B:62:0x0175, B:63:0x018c), top: B:16:0x0096 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void s(r45.xn6 r17, java.lang.String r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fn4.z0.s(r45.xn6, java.lang.String, java.lang.String):void");
    }

    public java.util.List b() {
        return this.f264631a.r0().f387515u;
    }

    public r45.xn6 d(int i17) {
        synchronized (this) {
            if (i17 >= 0) {
                if (i17 < ((java.util.LinkedList) b()).size()) {
                    return (r45.xn6) ((java.util.LinkedList) b()).get(i17);
                }
            }
            return null;
        }
    }

    public int e() {
        return ((java.util.LinkedList) b()).size();
    }

    public void i() {
        if (this.f264634d != null) {
            gm0.j1.d().d(this.f264634d);
            this.f264634d = null;
        }
        if (this.f264635e != null) {
            gm0.j1.d().d(this.f264635e);
            this.f264635e = null;
        }
        gm0.j1.d().q(1943, this.f264636f);
    }

    public void o(int i17) {
        synchronized (this) {
            if (i17 >= 0) {
                if (i17 < ((java.util.LinkedList) b()).size()) {
                    ((java.util.LinkedList) b()).remove(i17);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean p(int i17) {
        java.lang.Object[] objArr;
        java.lang.String str;
        if (this.f264632b) {
            com.tencent.mars.xlog.Log.w("MicroMsg.TopStory.TopStoryVideoDataMgr", "RequestingData");
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryVideoDataMgr", "requestData: %s", java.lang.Integer.valueOf(i17));
        this.f264632b = true;
        r45.un6 a17 = pm4.w.a(this.f264631a.r0());
        a17.f387513s = i17;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f264631a.r0().f387501d)) {
            r45.x50 x50Var = new r45.x50();
            x50Var.f389788d = "relevant_vid";
            x50Var.f389790f = this.f264631a.r0().f387501d;
            a17.f387511q.add(x50Var);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f264631a.r0().f387502e)) {
            r45.x50 x50Var2 = new r45.x50();
            x50Var2.f389788d = "relevant_expand";
            x50Var2.f389790f = this.f264631a.r0().f387502e;
            a17.f387511q.add(x50Var2);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f264631a.r0().f387503f)) {
            r45.x50 x50Var3 = new r45.x50();
            x50Var3.f389788d = "relevant_pre_searchid";
            x50Var3.f389790f = this.f264631a.r0().f387503f;
            a17.f387511q.add(x50Var3);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f264631a.r0().f387504g)) {
            r45.x50 x50Var4 = new r45.x50();
            x50Var4.f389788d = "relevant_shared_openid";
            x50Var4.f389790f = this.f264631a.r0().f387504g;
            a17.f387511q.add(x50Var4);
        }
        if (this.f264631a.r0().f387510p != null) {
            r45.x50 x50Var5 = new r45.x50();
            x50Var5.f389788d = "rec_category";
            x50Var5.f389789e = this.f264631a.r0().f387510p.f389797f;
            a17.f387511q.add(x50Var5);
        } else {
            r45.x50 x50Var6 = new r45.x50();
            x50Var6.f389788d = "rec_category";
            x50Var6.f389789e = this.f264631a.r0().f387505h;
            a17.f387511q.add(x50Var6);
        }
        java.util.Iterator it = a17.f387511q.iterator();
        while (true) {
            if (!it.hasNext()) {
                objArr = true;
                break;
            }
            if ("show_tag_list".equals(((r45.x50) it.next()).f389788d)) {
                objArr = false;
                break;
            }
        }
        if (this.f264631a.r0().f387510p != null && objArr != false) {
            r45.x50 x50Var7 = new r45.x50();
            x50Var7.f389788d = "show_tag_list";
            x50Var7.f389790f = this.f264631a.r0().f387510p.f389795d;
            a17.f387511q.add(x50Var7);
        }
        r45.x50 x50Var8 = new r45.x50();
        x50Var8.f389788d = "fetch_seed_videoinfo";
        if (this.f264631a.r0().f387510p == null || com.tencent.mm.sdk.platformtools.t8.K0(this.f264631a.r0().f387510p.f389795d)) {
            x50Var8.f389789e = 1L;
        } else {
            x50Var8.f389789e = 0L;
        }
        a17.f387511q.add(x50Var8);
        if (e() == 1) {
            r45.xn6 d17 = d(0);
            r45.x50 x50Var9 = new r45.x50();
            x50Var9.f389788d = "first_video_tag_list";
            x50Var9.f389790f = pm4.w.s(d17.D).toString();
            a17.f387511q.add(x50Var9);
        }
        java.util.HashMap hashMap = (java.util.HashMap) this.f264631a.o4().f264474a;
        if (hashMap.size() > 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.addAll(hashMap.values());
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("");
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                rm4.e eVar = (rm4.e) it6.next();
                stringBuffer.append(eVar.f397476b ? 1 : 0);
                stringBuffer.append("_");
                stringBuffer.append(eVar.f397475a.f390259h);
                stringBuffer.append(";");
            }
            str = stringBuffer.toString();
        } else {
            str = null;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            r45.x50 x50Var10 = new r45.x50();
            x50Var10.f389788d = "client_exposed_info";
            x50Var10.f389790f = str;
            a17.f387511q.add(x50Var10);
        }
        r45.x50 x50Var11 = new r45.x50();
        x50Var11.f389788d = "is_prefetch";
        x50Var11.f389789e = this.f264633c;
        a17.f387511q.add(x50Var11);
        if (this.f264634d != null) {
            gm0.j1.d().d(this.f264634d);
            this.f264634d = null;
        }
        this.f264634d = new sm4.k(a17);
        gm0.j1.d().g(this.f264634d);
        gm0.j1.d().a(1943, this.f264636f);
        uu4.a.a(0);
        return true;
    }

    public void q(r45.un6 un6Var, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        synchronized (this) {
            java.util.List b17 = b();
            if (!com.tencent.mm.sdk.platformtools.t8.L0(b17)) {
                java.util.LinkedList linkedList = (java.util.LinkedList) b17;
                if (i17 < linkedList.size()) {
                    int i18 = i17 > 0 ? i17 - 1 : 0;
                    for (int i19 = i18; i19 < linkedList.size() && i19 < i18 + 10; i19++) {
                        arrayList.add(((r45.xn6) linkedList.get(i19)).f390259h);
                    }
                    sm4.e eVar = new sm4.e(un6Var, arrayList);
                    gm0.j1.d().g(eVar);
                    gm0.j1.d().a(2579, new fn4.t0(this, eVar));
                }
            }
        }
    }
}
