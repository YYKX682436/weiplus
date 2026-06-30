package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes10.dex */
public final class ra extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.ra f186490d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.ra();

    /* renamed from: e, reason: collision with root package name */
    public static com.tencent.mm.ui.widget.dialog.f4 f186491e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.HashMap f186492f;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("websearch", "9");
        hashMap.put("h5", com.tenpay.android.wechat.PayuSecureEncrypt.ENCRYPT_VERSION_DEFAULT);
        hashMap.put("liteapp", "17");
        hashMap.put("weapp", "7");
        hashMap.put("finder", "16");
        f186492f = hashMap;
    }

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        java.lang.String str;
        bi4.d1 d1Var;
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        boolean g17 = bi4.v1.g();
        nw4.g gVar = env.f340863d;
        if (!g17) {
            gVar.e(msg.f341013c, msg.f341019i + ":fail_not_support", null);
            return false;
        }
        java.lang.Object obj = ((java.util.HashMap) msg.f340790a).get("liteAppId");
        java.lang.String str2 = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        str = "";
        if (str2 == null || str2.length() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiPublishTextState", "handleMsg: js");
            java.lang.Object obj2 = ((java.util.HashMap) msg.f340790a).get("sourceId");
            java.lang.String str3 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
            java.lang.Object obj3 = ((java.util.HashMap) msg.f340790a).get("sourceActivityId");
            java.lang.String str4 = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
            java.lang.Object obj4 = ((java.util.HashMap) msg.f340790a).get("sourceVerifyInfo");
            java.lang.String str5 = obj4 instanceof java.lang.String ? (java.lang.String) obj4 : null;
            java.lang.Object obj5 = ((java.util.HashMap) msg.f340790a).get("sourceName");
            java.lang.String str6 = obj5 instanceof java.lang.String ? (java.lang.String) obj5 : null;
            java.lang.Object obj6 = ((java.util.HashMap) msg.f340790a).get("sourceIconURL");
            java.lang.String str7 = obj6 instanceof java.lang.String ? (java.lang.String) obj6 : null;
            java.lang.Object obj7 = ((java.util.HashMap) msg.f340790a).get("iconId");
            java.lang.String str8 = obj7 instanceof java.lang.String ? (java.lang.String) obj7 : null;
            java.lang.Object obj8 = ((java.util.HashMap) msg.f340790a).get("customIconDesc");
            java.lang.String str9 = obj8 instanceof java.lang.String ? (java.lang.String) obj8 : null;
            java.lang.String str10 = str9 == null ? str : str9;
            java.lang.Object obj9 = ((java.util.HashMap) msg.f340790a).get("image");
            java.lang.String str11 = obj9 instanceof java.lang.String ? (java.lang.String) obj9 : null;
            java.lang.Object obj10 = ((java.util.HashMap) msg.f340790a).get("desc");
            java.lang.String str12 = obj10 instanceof java.lang.String ? (java.lang.String) obj10 : null;
            java.lang.Object obj11 = ((java.util.HashMap) msg.f340790a).get("jumpJSON");
            java.lang.String str13 = obj11 instanceof java.lang.String ? (java.lang.String) obj11 : null;
            java.lang.Object obj12 = ((java.util.HashMap) msg.f340790a).get("hideToast");
            java.lang.String str14 = obj12 instanceof java.lang.String ? (java.lang.String) obj12 : null;
            boolean z17 = str14 != null && java.lang.Integer.parseInt(str14) == 1;
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiPublishTextState", "publishTextState params:" + msg.f340790a);
            java.util.List f17 = f(str13);
            if (g(str3, str6, str7, f17)) {
                bi4.c1 c1Var = new bi4.c1();
                c1Var.b(str8);
                bi4.d1 d1Var2 = c1Var.f21034a;
                d1Var2.f354937d.f354975g.f355218i = str10;
                c1Var.g(str6);
                c1Var.f(str3);
                c1Var.d(str4);
                c1Var.h(str5);
                c1Var.e(str7);
                d1Var2.f354938e = str11;
                c1Var.a(str12);
                c1Var.c(f17);
                d1Var2.f354952v = z17;
                d1Var = d1Var2;
            } else {
                d1Var = null;
                gVar.e(msg.f341013c, msg.f341019i + ":fail_invalid_arguments", null);
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiPublishTextState", "fail_invalid_arguments");
            }
            if (d1Var == null) {
                return false;
            }
            e(env, msg, d1Var);
            return true;
        }
        if (!com.tencent.mm.sdk.platformtools.x2.n()) {
            gVar.e(msg.f341013c, msg.f341019i + ":fail_run_subprocess", null);
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiPublishTextState", "fail_run_subprocess");
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiPublishTextState", "handleMsg: lite app id=" + str2);
        com.tencent.mm.plugin.webview.ui.tools.newjsapi.qa qaVar = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.qa(env, msg);
        java.lang.Object obj13 = ((java.util.HashMap) msg.f340790a).get("liteAppId");
        java.lang.String str15 = obj13 instanceof java.lang.String ? (java.lang.String) obj13 : null;
        pj4.q0 q0Var = new pj4.q0();
        java.lang.Object obj14 = ((java.util.HashMap) msg.f340790a).get("sourceName");
        java.lang.String str16 = obj14 instanceof java.lang.String ? (java.lang.String) obj14 : null;
        java.lang.Object obj15 = ((java.util.HashMap) msg.f340790a).get("sourceIconURL");
        java.lang.String str17 = obj15 instanceof java.lang.String ? (java.lang.String) obj15 : null;
        java.lang.Object obj16 = ((java.util.HashMap) msg.f340790a).get("sourceVerifyInfo");
        java.lang.String str18 = obj16 instanceof java.lang.String ? (java.lang.String) obj16 : null;
        if (str18 == null) {
            str18 = str;
        }
        java.lang.Object obj17 = ((java.util.HashMap) msg.f340790a).get("iconId");
        java.lang.String str19 = obj17 instanceof java.lang.String ? (java.lang.String) obj17 : null;
        java.lang.Object obj18 = ((java.util.HashMap) msg.f340790a).get("customIconDesc");
        java.lang.String str20 = obj18 instanceof java.lang.String ? (java.lang.String) obj18 : null;
        str = str20 != null ? str20 : "";
        java.lang.Object obj19 = ((java.util.HashMap) msg.f340790a).get("image");
        java.lang.String str21 = obj19 instanceof java.lang.String ? (java.lang.String) obj19 : null;
        java.lang.Object obj20 = ((java.util.HashMap) msg.f340790a).get("desc");
        java.lang.String str22 = obj20 instanceof java.lang.String ? (java.lang.String) obj20 : null;
        java.lang.Object obj21 = ((java.util.HashMap) msg.f340790a).get("hideToast");
        java.lang.String str23 = obj21 instanceof java.lang.String ? (java.lang.String) obj21 : null;
        boolean z18 = str23 != null && java.lang.Integer.parseInt(str23) == 1;
        java.lang.Object obj22 = ((java.util.HashMap) msg.f340790a).get("jumpJSON");
        java.lang.String str24 = obj22 instanceof java.lang.String ? (java.lang.String) obj22 : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiPublishTextState", "publishTextState params:" + msg.f340790a);
        java.util.List f18 = f(str24);
        q0Var.f355257d = str16;
        q0Var.f355258e = str17;
        q0Var.f355259f = str19;
        q0Var.f355260g = str21;
        q0Var.f355261h = str22;
        q0Var.f355262i = z18;
        q0Var.f355264n = str18;
        q0Var.f355263m.addAll(f18);
        pj4.c cVar = new pj4.c();
        cVar.f355001d = str15;
        cVar.f355002e = q0Var;
        android.content.Context context = env.f340860a;
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
        e4Var.f211776c = i65.a.r(context, com.tencent.mm.R.string.f490604zq);
        e4Var.f211780g = 2;
        e4Var.f211778e = false;
        f186491e = e4Var.c();
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 29559;
        lVar.f70666c = " /cgi-bin/micromsg-bin/liteapp/liteapp_checktextstate";
        lVar.f70664a = cVar;
        lVar.f70665b = new pj4.d();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        com.tencent.mm.modelbase.i iVar = new com.tencent.mm.modelbase.i();
        iVar.p(a17);
        iVar.l().K(new com.tencent.mm.plugin.webview.ui.tools.newjsapi.na(env, msg, qaVar, str19, str, str21, str22, z18));
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return com.tencent.wxmm.v2helper.EMethodSetSpkEnhance;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "publishTextState";
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002a, code lost:
    
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_text_status_jsapi_subprocess, 1) == 1) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(nw4.k r4, nw4.y2 r5, bi4.d1 r6) {
        /*
            r3 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "KEY_REQUEST_DATA"
            byte[] r6 = r6.toByteArray()
            r0.putByteArray(r1, r6)
            com.tencent.mm.plugin.webview.ui.tools.newjsapi.pa r6 = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.pa
            r6.<init>(r4, r5)
            boolean r5 = com.tencent.mm.sdk.platformtools.x2.n()
            if (r5 != 0) goto L2d
            java.lang.Class<e42.e0> r5 = e42.e0.class
            i95.m r5 = i95.n0.c(r5)
            e42.e0 r5 = (e42.e0) r5
            e42.d0 r1 = e42.d0.clicfg_text_status_jsapi_subprocess
            h62.d r5 = (h62.d) r5
            r2 = 1
            int r5 = r5.Ni(r1, r2)
            if (r5 != r2) goto L2d
            goto L2e
        L2d:
            r2 = 0
        L2e:
            if (r2 == 0) goto L61
            android.content.Context r5 = r4.f340860a
            boolean r5 = r5 instanceof com.tencent.mm.ui.MMFragmentActivity
            if (r5 == 0) goto L61
            java.lang.String r5 = "MicroMsg.JsApiPublishTextState"
            java.lang.String r1 = "user LuggageActivityHelper"
            com.tencent.mars.xlog.Log.i(r5, r1)
            android.content.Context r5 = r4.f340860a
            java.lang.String r1 = "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity"
            kotlin.jvm.internal.o.e(r5, r1)
            com.tencent.mm.ui.MMFragmentActivity r5 = (com.tencent.mm.ui.MMFragmentActivity) r5
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            r1.putExtras(r0)
            android.content.Context r4 = r4.f340860a
            java.lang.Class<com.tencent.mm.plugin.webview.stub.WebViewPublishTextStateUI> r0 = com.tencent.mm.plugin.webview.stub.WebViewPublishTextStateUI.class
            r1.setClass(r4, r0)
            com.tencent.mm.plugin.webview.ui.tools.newjsapi.oa r4 = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.oa
            r4.<init>(r6)
            r6 = 1000(0x3e8, float:1.401E-42)
            r5.mmStartActivityForResult(r4, r1, r6)
            goto L68
        L61:
            java.lang.String r4 = com.tencent.mm.sdk.platformtools.w9.f193053a
            java.lang.Class<com.tencent.mm.plugin.webview.ui.tools.newjsapi.ma> r5 = com.tencent.mm.plugin.webview.ui.tools.newjsapi.ma.class
            com.tencent.mm.ipcinvoker.extension.l.a(r4, r0, r5, r6)
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.ui.tools.newjsapi.ra.e(nw4.k, nw4.y2, bi4.d1):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x02a9 A[Catch: all -> 0x02d9, TryCatch #1 {all -> 0x02d9, blocks: (B:13:0x001b, B:15:0x0028, B:18:0x002f, B:20:0x0035, B:27:0x02a9, B:33:0x02b7, B:38:0x02c3, B:75:0x029d), top: B:12:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02c3 A[Catch: all -> 0x02d9, TRY_LEAVE, TryCatch #1 {all -> 0x02d9, blocks: (B:13:0x001b, B:15:0x0028, B:18:0x002f, B:20:0x0035, B:27:0x02a9, B:33:0x02b7, B:38:0x02c3, B:75:0x029d), top: B:12:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02d2 A[LOOP:0: B:18:0x002f->B:42:0x02d2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02e2 A[EDGE_INSN: B:43:0x02e2->B:7:0x02e2 BREAK  A[LOOP:0: B:18:0x002f->B:42:0x02d2], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01e5 A[Catch: all -> 0x029c, TryCatch #3 {all -> 0x029c, blocks: (B:66:0x00e4, B:70:0x0101, B:71:0x0107, B:80:0x011f, B:83:0x012d, B:84:0x017b, B:87:0x0189, B:88:0x01af, B:91:0x01bd, B:92:0x01e5, B:95:0x01f3, B:97:0x0215, B:101:0x023e, B:102:0x0244, B:106:0x0256, B:107:0x025c, B:108:0x0292, B:113:0x028a), top: B:65:0x00e4, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List f(java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 763
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.ui.tools.newjsapi.ra.f(java.lang.String):java.util.List");
    }

    public final boolean g(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List jumpInfos) {
        kotlin.jvm.internal.o.g(jumpInfos, "jumpInfos");
        if (str == null || r26.n0.N(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiPublishTextState", "invalid sourceId");
            return false;
        }
        if (str2 == null || r26.n0.N(str2)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiPublishTextState", "invalid sourceName");
            return false;
        }
        if (str3 == null || r26.n0.N(str3)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiPublishTextState", "invalid sourceIconUrl");
            return false;
        }
        if (!jumpInfos.isEmpty()) {
            return true;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiPublishTextState", "invalid jumpInfos");
        return false;
    }

    public final java.lang.String h(android.net.Uri uri, java.lang.String str) {
        java.lang.String queryParameter = uri.getQueryParameter(str);
        if (queryParameter == null) {
            return "";
        }
        java.lang.String decode = java.net.URLDecoder.decode(queryParameter, com.tencent.mapsdk.internal.rv.f51270c);
        kotlin.jvm.internal.o.f(decode, "decode(...)");
        return decode;
    }
}
