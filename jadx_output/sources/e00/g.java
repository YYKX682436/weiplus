package e00;

/* loaded from: classes9.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final e00.g f245772a = new e00.g();

    public static final void e(java.lang.String event, com.tencent.mm.storage.f9 msg, boolean z17, java.lang.String talkerUserName, int i17, int i18, java.lang.String appId, java.lang.String pagePath, java.lang.Integer num, java.lang.String str) {
        kotlin.jvm.internal.o.g(event, "event");
        kotlin.jvm.internal.o.g(msg, "msg");
        kotlin.jvm.internal.o.g(talkerUserName, "talkerUserName");
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(pagePath, "pagePath");
        java.lang.String str2 = z17 ? "2" : "1";
        java.lang.String d17 = g95.e0.d(msg);
        jz5.l[] lVarArr = new jz5.l[9];
        lVarArr[0] = new jz5.l("view_id", "chatting_item_appmsg_appbrand_container_view");
        lVarArr[1] = new jz5.l("card_id", java.lang.Long.valueOf(msg.I0()));
        lVarArr[2] = new jz5.l("card_type", java.lang.Integer.valueOf(i17));
        lVarArr[3] = new jz5.l("card_version", java.lang.Integer.valueOf(i18));
        lVarArr[4] = new jz5.l("appid", appId);
        lVarArr[5] = new jz5.l("pagepath", pagePath);
        lVarArr[6] = new jz5.l(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, str2);
        lVarArr[7] = new jz5.l("chatroomid", talkerUserName);
        if (d17 == null) {
            d17 = "";
        }
        lVarArr[8] = new jz5.l("share_username", d17);
        java.util.Map l17 = kz5.c1.l(lVarArr);
        if (num != null) {
            l17.put("chatroomuv", java.lang.Integer.valueOf(num.intValue()));
        }
        if (str != null) {
            java.lang.String str3 = str.length() > 0 ? str : null;
            if (str3 != null) {
                l17.put("biz_report_data", str3);
            }
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj(event, null, l17, 12, false);
        if (i17 <= 0 || !kotlin.jvm.internal.o.b(event, "view_clk")) {
            return;
        }
        f245772a.g(i17, bw5.x8.ECS_REQ_SCENE_CONVERSATION, false, true);
    }

    public final java.lang.String a(java.lang.String userName) {
        kotlin.jvm.internal.o.g(userName, "userName");
        int O = r26.n0.O(userName, '@', 0, false, 6, null);
        com.tencent.mm.feature.ecs.share.s sVar = com.tencent.mm.feature.ecs.share.s.f66001a;
        if (O == -1) {
            return sVar.a(userName);
        }
        java.lang.String substring = userName.substring(0, O);
        kotlin.jvm.internal.o.f(substring, "substring(...)");
        java.lang.String a17 = sVar.a(substring);
        java.lang.String substring2 = userName.substring(O);
        kotlin.jvm.internal.o.f(substring2, "substring(...)");
        return a17.concat(substring2);
    }

    public final int b(java.lang.String talkerName) {
        kotlin.jvm.internal.o.g(talkerName, "talkerName");
        if (com.tencent.mm.storage.z3.q4(talkerName) || c01.e2.E(talkerName)) {
            return 4;
        }
        if (com.tencent.mm.storage.z3.N4(talkerName)) {
            return 3;
        }
        if (com.tencent.mm.storage.z3.m4(talkerName)) {
            return 2;
        }
        return com.tencent.mm.storage.z3.p4(talkerName) ? 5 : 1;
    }

    public final void c(int i17, bw5.ye0 reqInfo, long j17, bw5.f6 cgiResult) {
        kotlin.jvm.internal.o.g(reqInfo, "reqInfo");
        kotlin.jvm.internal.o.g(cgiResult, "cgiResult");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_APPID, reqInfo.f35461i[3] ? reqInfo.f35457e : "");
        hashMap.put(com.tencent.mm.opensdk.constants.ConstantsAPI.WXWebPage.KEY_ACTIVITY_ID, java.lang.String.valueOf(reqInfo.f35458f));
        hashMap.put("bulk_buy_id", java.lang.String.valueOf(reqInfo.f35459g));
        d(bw5.g5.BULK_BUY_CARD, i17, j17, cgiResult, hashMap);
    }

    public final void d(bw5.g5 g5Var, int i17, long j17, bw5.f6 f6Var, java.util.Map map) {
        map.put("req_type", java.lang.String.valueOf(i17));
        map.put("cost_time", java.lang.String.valueOf(j17));
        map.put("cgi_result", java.lang.String.valueOf(f6Var.f27169d));
        y02.v0 a17 = y02.x0.f458634d.a();
        if (a17 != null) {
            a17.p1(bw5.d5.EcsEcCardCgiResult, g5Var.f27690d, j(map));
        }
    }

    public final void f(int i17, bw5.p10 reqInfo, long j17, bw5.f6 cgiResult) {
        kotlin.jvm.internal.o.g(reqInfo, "reqInfo");
        kotlin.jvm.internal.o.g(cgiResult, "cgiResult");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("card_type", java.lang.String.valueOf(reqInfo.f31432d));
        boolean[] zArr = reqInfo.f31436h;
        hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, zArr[3] ? reqInfo.f31433e : "");
        hashMap.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, zArr[4] ? reqInfo.f31434f : "");
        d(bw5.g5.WAAPP_CARD, i17, j17, cgiResult, hashMap);
    }

    public final void g(int i17, bw5.x8 jumpScene, boolean z17, boolean z18) {
        kotlin.jvm.internal.o.g(jumpScene, "jumpScene");
        jz5.l[] lVarArr = new jz5.l[3];
        lVarArr[0] = new jz5.l("jump_scene", java.lang.String.valueOf(jumpScene.f35000d));
        lVarArr[1] = new jz5.l("use_cache", java.lang.String.valueOf(z17));
        lVarArr[2] = new jz5.l("open_success", z18 ? "1" : "0");
        java.util.Map k17 = kz5.c1.k(lVarArr);
        y02.v0 a17 = y02.x0.f458634d.a();
        if (a17 != null) {
            a17.p1(bw5.d5.EcsEcCardOpenAction, i17, j(k17));
        }
    }

    public final void h(bw5.oe0 reqInfo, long j17, bw5.f6 cgiResult) {
        kotlin.jvm.internal.o.g(reqInfo, "reqInfo");
        kotlin.jvm.internal.o.g(cgiResult, "cgiResult");
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.LinkedList linkedList = reqInfo.f31080d;
        kotlin.jvm.internal.o.f(linkedList, "getProducts(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Long.valueOf(((bw5.ne0) it.next()).f30652d));
        }
        hashMap.put("product_id", arrayList.toString());
        d(bw5.g5.PRODUCT_CARD, reqInfo.f31081e, j17, cgiResult, hashMap);
    }

    public final void i(bw5.te0 reqInfo, long j17, bw5.f6 cgiResult) {
        kotlin.jvm.internal.o.g(reqInfo, "reqInfo");
        kotlin.jvm.internal.o.g(cgiResult, "cgiResult");
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.LinkedList linkedList = reqInfo.f33413d;
        kotlin.jvm.internal.o.f(linkedList, "getShops(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            arrayList.add(((bw5.se0) it.next()).b());
        }
        hashMap.put("shop_id", arrayList.toString());
        d(bw5.g5.SHOP_CARD, reqInfo.f33414e, j17, cgiResult, hashMap);
    }

    public final java.lang.String j(java.util.Map map) {
        kotlin.jvm.internal.o.g(map, "<this>");
        if (map.isEmpty()) {
            return "{}";
        }
        return "{" + kz5.n0.g0(map.entrySet(), "; ", null, null, 0, null, e00.f.f245761d, 30, null) + '}';
    }
}
