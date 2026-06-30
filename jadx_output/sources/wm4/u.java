package wm4;

/* loaded from: classes8.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static final o11.g f447309a;

    /* renamed from: b, reason: collision with root package name */
    public static final o11.g f447310b;

    /* renamed from: c, reason: collision with root package name */
    public static long f447311c;

    static {
        o11.f fVar = new o11.f();
        fVar.f342078b = true;
        fVar.f342079c = true;
        fVar.f342096t = true;
        fVar.f342091o = com.tencent.mm.R.drawable.bhm;
        f447309a = fVar.a();
        o11.f fVar2 = new o11.f();
        fVar2.f342078b = true;
        fVar2.f342079c = true;
        fVar2.f342091o = com.tencent.mm.R.drawable.bhm;
        f447310b = fVar2.a();
        f447311c = 0L;
    }

    public static void a(java.util.List list) {
        if (com.tencent.mm.sdk.platformtools.t8.L0(list)) {
            return;
        }
        wm4.y yVar = new wm4.y();
        yVar.f447317a = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.lpz);
        yVar.f447318b = 20002;
        yVar.f447321e = m(20002);
        yVar.f447320d = 14;
        yVar.f447319c = 1011;
        list.add(yVar);
    }

    public static final void b(r45.in6 in6Var, java.lang.String str, long j17) {
        pm4.y.f(in6Var, str, j17);
        java.util.LinkedList linkedList = in6Var.f377192q;
        if (linkedList.size() > 0) {
            r45.tn6 tn6Var = new r45.tn6();
            tn6Var.f386617d = str;
            tn6Var.f386618e = j17;
            linkedList.add(tn6Var);
        }
    }

    public static final java.lang.String c(java.lang.String str, long j17) {
        return str + "_" + j17;
    }

    public static int d(java.lang.String str) {
        wm4.x xVar = new wm4.x();
        xVar.f447316a = ((wn2.f) ((zy2.sb) i95.n0.c(zy2.sb.class))).Bi();
        java.util.List l17 = l(xVar);
        int i17 = 0;
        while (true) {
            java.util.ArrayList arrayList = (java.util.ArrayList) l17;
            if (i17 >= arrayList.size()) {
                return 0;
            }
            wm4.y yVar = (wm4.y) arrayList.get(i17);
            if (yVar.f447336t.equals(str)) {
                return yVar.f447318b;
            }
            i17++;
        }
    }

    public static int e(int i17) {
        wm4.x xVar = new wm4.x();
        xVar.f447316a = ((wn2.f) ((zy2.sb) i95.n0.c(zy2.sb.class))).Bi();
        java.util.List l17 = l(xVar);
        int i18 = 0;
        while (true) {
            java.util.ArrayList arrayList = (java.util.ArrayList) l17;
            if (i18 >= arrayList.size()) {
                return 0;
            }
            wm4.y yVar = (wm4.y) arrayList.get(i18);
            if (yVar.f447335s == i17) {
                return yVar.f447318b;
            }
            i18++;
        }
    }

    public static org.json.JSONObject f(wm4.y yVar) {
        if (yVar == null) {
            return new org.json.JSONObject();
        }
        try {
            org.json.JSONArray jSONArray = su4.o2.d("topstoryTopTabParam").getJSONArray("tabs");
            for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                org.json.JSONObject jSONObject = jSONArray.getJSONObject(i17);
                if (jSONObject.getInt("category") == yVar.f447318b) {
                    return jSONObject;
                }
            }
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.TopStory.TopStoryUILogic", "parse cur tab config failed: %s", e17.getMessage());
        }
        return new org.json.JSONObject();
    }

    public static int g() {
        int k17 = k();
        int u17 = ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi().u(k17);
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryUILogic", "getEnterTabCategory, lastTabCategoryFix:%s enterTabCategory:%s", java.lang.Integer.valueOf(k17), java.lang.Integer.valueOf(u17));
        return u17;
    }

    public static int h(com.tencent.mm.plugin.finder.extension.reddot.jb jbVar) {
        int integer;
        if (jbVar != null && jbVar.field_ctrInfo.f388488f != null) {
            try {
                r45.xs2 xs2Var = new r45.xs2();
                com.tencent.mm.protobuf.g gVar = jbVar.field_ctrInfo.f388488f;
                java.util.Objects.requireNonNull(gVar);
                xs2Var.parseFrom(gVar.f192156a);
                integer = xs2Var.getInteger(9);
                com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryUILogic", "getEnterTabCategoryByRedDotCtrInfo: displayTabType:%s", java.lang.Integer.valueOf(integer));
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TopStory.TopStoryUILogic", th6, "getEnterTabCategoryByRedDotCtrInfo", new java.lang.Object[0]);
            }
            if (integer == 9) {
                return 20002;
            }
            switch (integer) {
                case 25:
                case 26:
                case 27:
                    return e(integer);
                default:
                    return 0;
            }
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TopStory.TopStoryUILogic", th6, "getEnterTabCategoryByRedDotCtrInfo", new java.lang.Object[0]);
        }
        return 0;
    }

    public static final java.lang.String i() {
        com.tencent.mm.autogen.events.TopStoryEvent topStoryEvent = new com.tencent.mm.autogen.events.TopStoryEvent();
        topStoryEvent.f54898g.f6509a = 3;
        topStoryEvent.e();
        r45.in6 in6Var = topStoryEvent.f54899h.f6618b;
        java.lang.String str = in6Var != null ? in6Var.f377191p : "";
        return com.tencent.mm.sdk.platformtools.t8.K0(str) ? java.util.UUID.randomUUID().toString() : str;
    }

    public static int j() {
        int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_TOP_STORY_LAST_ENTER_TAB_REC_INT, 0);
        if (!pm4.w.l(r17) || gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_TOP_STORY_HAS_HAOKAN_RESULT_INT, 1) == 1) {
            return r17;
        }
        return 700;
    }

    public static int k() {
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_topstory_tab_reddot_select, 0) == 0;
        ((ra0.v) i95.n0.c(ra0.v.class)).getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryUILogic", "getLastTabCategoryFix, haokanFirst:%s showNewLifeEntry:%s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.FALSE);
        int j17 = j();
        return j17 == 0 ? z17 ? 110 : 100 : j17;
    }

    public static java.util.List l(wm4.x xVar) {
        r45.qn6 qn6Var;
        r45.qn6 r17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            org.json.JSONArray jSONArray = su4.o2.d("topstoryTopTabParam").getJSONArray("tabs");
            boolean z17 = false;
            int i17 = 0;
            while (true) {
                boolean z18 = true;
                int i18 = 1;
                int i19 = 1;
                if (i17 < jSONArray.length()) {
                    org.json.JSONObject jSONObject = jSONArray.getJSONObject(i17);
                    wm4.y yVar = new wm4.y();
                    yVar.f447318b = jSONObject.getInt("category");
                    yVar.f447319c = jSONObject.optInt("searchScene", 0);
                    yVar.f447320d = jSONObject.optInt("searchType", 0);
                    yVar.f447335s = jSONObject.optInt("reddotTabType", 0);
                    yVar.f447336t = jSONObject.optString("reddotPath", "");
                    yVar.f447337u = jSONObject.optInt("finderCommentScene", 0);
                    java.lang.String d17 = com.tencent.mm.sdk.platformtools.m2.d();
                    if (d17.equals("zh_TW")) {
                        yVar.f447317a = jSONObject.getString("wording_tw");
                    } else if (d17.equals("zh_HK")) {
                        yVar.f447317a = jSONObject.getString("wording_hk");
                    } else if (d17.equals("zh_CN")) {
                        yVar.f447317a = jSONObject.getString("wording_cn");
                    } else {
                        yVar.f447317a = jSONObject.getString("wording_en");
                    }
                    if (com.tencent.mm.sdk.platformtools.t8.K0(yVar.f447317a)) {
                        arrayList.clear();
                        return arrayList;
                    }
                    jSONObject.getInt("showWhenRedDot");
                    yVar.f447321e = jSONObject.getString("tabInfo");
                    if (pm4.w.l(yVar.f447318b)) {
                        if (!((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi().b()) {
                            i18 = 0;
                        }
                        yVar.f447322f = i18;
                        int s17 = ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi().s();
                        yVar.f447323g = s17;
                        if (s17 > 0 && (r17 = ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi().r()) != null) {
                            yVar.f447328l = r17.f384113d;
                        }
                        if (yVar.f447322f > 0 && (qn6Var = ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi().f346434b) != null) {
                            yVar.f447324h = qn6Var.f384113d;
                        }
                    } else if (pm4.w.m(yVar.f447318b)) {
                        if (!((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi().d()) {
                            i19 = 0;
                        }
                        yVar.f447322f = i19;
                        if (i19 > 0) {
                            yVar.f447324h = ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi().f346433a.f384113d;
                        }
                    } else if (pm4.w.n(yVar.f447318b)) {
                        int i27 = ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi().f() ? 1 : 0;
                        yVar.f447322f = i27;
                        if (i27 > 0) {
                            yVar.f447324h = ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi().f346435c.f384113d;
                        }
                        if (xVar != null && xVar.f447316a == 1) {
                            yVar.f447317a = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.lpz);
                            yVar.f447318b = 20002;
                            yVar.f447321e = m(20002);
                            yVar.f447338v = 50030;
                            yVar.f447339w = com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_BOOL_ENABLE_ORIGINAL_VIDEO_INFO_CALLBACK_FROM_SURFACE_LISTENER;
                            ((wn2.f) ((zy2.sb) i95.n0.c(zy2.sb.class))).getClass();
                            if (vn2.u0.f438388b) {
                                z18 = false;
                            }
                            yVar.f447340x = z18;
                            yVar.f447320d = 14;
                            yVar.f447319c = 1011;
                        }
                    }
                    arrayList.add(yVar);
                    if (pm4.w.n(yVar.f447318b) && xVar != null && xVar.f447316a == 2) {
                        a(arrayList);
                    }
                    i17++;
                } else if (xVar != null && xVar.f447316a == 1) {
                    if (!com.tencent.mm.sdk.platformtools.t8.L0(arrayList)) {
                        for (int i28 = 0; i28 < arrayList.size(); i28++) {
                            wm4.y yVar2 = (wm4.y) arrayList.get(i28);
                            if (!pm4.w.n(yVar2.f447318b) && !pm4.w.k(yVar2.f447318b)) {
                            }
                            z17 = true;
                        }
                    }
                    if (!z17) {
                        a(arrayList);
                    }
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.TopStory.TopStoryUILogic", "parse tabconfig failed: %s", e17.getMessage());
            arrayList.clear();
        }
        return arrayList;
    }

    public static final java.lang.String m(int i17) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("category", i17);
        } catch (org.json.JSONException unused) {
        }
        return jSONObject.toString();
    }

    public static wm4.y n(int i17, java.util.List list) {
        if (list == null) {
            return null;
        }
        for (int i18 = 0; i18 < list.size(); i18++) {
            if (((wm4.y) list.get(i18)).f447318b == i17 || (((wm4.y) list.get(i18)).f447318b == 700 && pm4.w.l(i17))) {
                return (wm4.y) list.get(i18);
            }
        }
        return null;
    }

    public static int o(int i17) {
        wm4.x xVar = new wm4.x();
        xVar.f447316a = ((wn2.f) ((zy2.sb) i95.n0.c(zy2.sb.class))).Bi();
        java.util.Iterator it = ((java.util.ArrayList) l(xVar)).iterator();
        while (it.hasNext()) {
            if (((wm4.y) it.next()).f447318b == i17) {
                return i17;
            }
        }
        return 700;
    }

    public static final java.lang.String p(int i17) {
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.k08);
        if (j65.c.b(com.tencent.mm.sdk.platformtools.x2.f193071a) >= i65.a.s(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            return string;
        }
        if (i17 > 0 && "zh_CN".equalsIgnoreCase(com.tencent.mm.sdk.platformtools.m2.f(com.tencent.mm.sdk.platformtools.x2.f193071a))) {
            if (i17 > 99999) {
                return string + java.lang.String.format(" 10%s+", com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.jzv));
            }
            if (i17 > 9999) {
                return string + java.lang.String.format(" %.1f%s", java.lang.Float.valueOf(i17 / 10000.0f), com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.jzv));
            }
            return string + " " + i17;
        }
        if (i17 > 99999) {
            return string + java.lang.String.format(" 100%s+", com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.jzu));
        }
        if (i17 > 999) {
            return string + java.lang.String.format(" %.1f%s", java.lang.Float.valueOf(i17 / 1000.0f), com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.jzu));
        }
        if (i17 <= 0) {
            return string;
        }
        return string + " " + i17;
    }

    public static boolean q() {
        if (!((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_topstory_top_multitask, false) && bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.search.RepairerConfigTopStoryTaskAffinity()) != 1) {
            return false;
        }
        ((ra0.v) i95.n0.c(ra0.v.class)).getClass();
        return !((wn2.f) ((zy2.sb) i95.n0.c(zy2.sb.class))).wi();
    }

    public static boolean r() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_topstory_videotab_liteapp_android, false) || bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.search.RepairerConfigTopStoryVideoLiteApp()) == 1;
    }

    public static void s(java.util.List list, java.lang.String str, java.lang.String str2, boolean z17) {
        r45.x50 x50Var = new r45.x50();
        x50Var.f389788d = "redPointMsgId";
        x50Var.f389790f = java.lang.String.valueOf(str);
        list.add(x50Var);
        r45.x50 x50Var2 = new r45.x50();
        x50Var2.f389788d = "currentPage";
        x50Var2.f389789e = 1L;
        list.add(x50Var2);
        r45.x50 x50Var3 = new r45.x50();
        x50Var3.f389788d = "is_prefetch";
        x50Var3.f389789e = 0L;
        list.add(x50Var3);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            r45.x50 x50Var4 = new r45.x50();
            x50Var4.f389788d = com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_SEQ;
            x50Var4.f389790f = str2;
            list.add(x50Var4);
            r45.x50 x50Var5 = new r45.x50();
            x50Var5.f389788d = "requestId";
            x50Var5.f389790f = str2;
            list.add(x50Var5);
        }
        r45.x50 x50Var6 = new r45.x50();
        x50Var6.f389788d = "recType";
        x50Var6.f389789e = 0L;
        list.add(x50Var6);
        if (z17) {
            r45.x50 x50Var7 = new r45.x50();
            x50Var7.f389788d = com.tencent.map.geolocation.sapp.TencentLocation.EXTRA_DIRECTION;
            x50Var7.f389789e = 1L;
            list.add(x50Var7);
            r45.x50 x50Var8 = new r45.x50();
            x50Var8.f389788d = "time_zone_min";
            java.util.TimeZone timeZone = java.util.TimeZone.getDefault();
            x50Var8.f389790f = "" + (((0 - timeZone.getOffset(java.util.Calendar.getInstance(timeZone).getTimeInMillis())) / 1000) / 60);
            list.add(x50Var8);
        }
    }

    public static void t(android.content.Context context, java.lang.String str) {
        su4.k3.c("", 0, 0, 100);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("setting_mode", str);
        if (q()) {
            com.tencent.mm.plugin.websearch.l2.i(context, ".ui.home.TopStoryTabSettingAffinityUI", intent);
        } else {
            com.tencent.mm.plugin.websearch.l2.i(context, ".ui.home.TopStorySettingUI", intent);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(53:5|(52:9|(1:(1:12))(1:341)|14|15|(1:340)(45:19|(1:(1:22))(1:339)|337|25|(1:336)(1:34)|(1:36)|37|(1:39)|40|(1:44)|45|(1:335)(1:50)|51|(1:53)(1:334)|54|(1:56)(1:333)|57|(1:59)(1:332)|60|61|62|(3:64|(4:67|(2:69|70)(1:72)|71|65)|73)|75|(1:329)(1:78)|(3:315|316|(1:318)(22:320|321|322|81|82|83|84|(38:86|87|88|89|90|91|92|93|(1:(4:285|(1:298)(3:288|(1:290)|291)|(1:293)(1:(1:296)(1:297))|294)(9:(1:249)(1:284)|(1:251)(1:283)|252|(1:254)(1:282)|255|(1:281)(2:259|(1:(1:277)(1:(1:279)(1:280)))(1:262))|(1:268)|(1:274)|275))(1:97)|98|(1:100)(1:241)|(2:102|(1:104))(1:240)|105|(5:231|232|233|234|235)(1:107)|108|(3:110|111|112)(1:226)|113|114|115|116|(1:118)|(1:120)(1:219)|121|(2:(1:124)(1:217)|125)(1:218)|126|(1:216)(1:130)|(1:132)|133|(1:215)(1:136)|137|138|139|140|141|142|143|144|145)(3:305|(1:307)(1:(1:310)(1:311))|308)|146|147|(1:149)(1:204)|150|(1:152)(1:203)|153|(1:155)(1:202)|(1:157)|(2:159|(5:161|162|(2:164|(1:166))(10:169|(1:200)(1:173)|(1:199)(1:178)|179|(1:181)|182|(5:184|(1:186)|191|(1:189)|190)|192|(1:194)|195)|167|168))|201|162|(0)(0)|167|168))|80|81|82|83|84|(0)(0)|146|147|(0)(0)|150|(0)(0)|153|(0)(0)|(0)|(0)|201|162|(0)(0)|167|168)|338|24|25|(1:27)|336|(0)|37|(0)|40|(2:42|44)|45|(0)|335|51|(0)(0)|54|(0)(0)|57|(0)(0)|60|61|62|(0)|75|(0)|329|(0)|80|81|82|83|84|(0)(0)|146|147|(0)(0)|150|(0)(0)|153|(0)(0)|(0)|(0)|201|162|(0)(0)|167|168)|342|15|(1:17)|340|338|24|25|(0)|336|(0)|37|(0)|40|(0)|45|(0)|335|51|(0)(0)|54|(0)(0)|57|(0)(0)|60|61|62|(0)|75|(0)|329|(0)|80|81|82|83|84|(0)(0)|146|147|(0)(0)|150|(0)(0)|153|(0)(0)|(0)|(0)|201|162|(0)(0)|167|168) */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0082, code lost:
    
        if (r5.f384124r > (-1)) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0865, code lost:
    
        if (kotlin.jvm.internal.o.b(r0, ra0.a0.f393459b) != false) goto L317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00db, code lost:
    
        if (r13.f384124r > r16) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x073e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x0740, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x0741, code lost:
    
        r5 = r7;
        r6 = "MicroMsg.TopStory.TopStoryUILogic";
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x0323, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x0328, code lost:
    
        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TopStory.TopStoryUILogic", r0, "parse msg.params extReqParam", new java.lang.Object[0]);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0756  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0776  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x077d  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0782  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0794  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x07c6  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x07ea  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x077f  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0778  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x075a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x06f5 A[Catch: IOException -> 0x073e, TryCatch #11 {IOException -> 0x073e, blocks: (B:145:0x06b7, B:146:0x0733, B:305:0x06f5, B:308:0x0731), top: B:84:0x0412 }] */
    /* JADX WARN: Removed duplicated region for block: B:315:0x03a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02e0 A[Catch: Exception -> 0x0323, TryCatch #12 {Exception -> 0x0323, blocks: (B:62:0x02d4, B:64:0x02e0, B:65:0x02e6, B:67:0x02ec, B:69:0x02f2), top: B:61:0x02d4 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x039d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0414 A[Catch: IOException -> 0x0740, TRY_ENTER, TRY_LEAVE, TryCatch #8 {IOException -> 0x0740, blocks: (B:82:0x03d8, B:86:0x0414), top: B:81:0x03d8 }] */
    /* JADX WARN: Type inference failed for: r15v9, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v18, types: [zy2.fa] */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v49 */
    /* JADX WARN: Type inference failed for: r1v53 */
    /* JADX WARN: Type inference failed for: r1v61 */
    /* JADX WARN: Type inference failed for: r1v72 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11, types: [android.content.Intent] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v14, types: [android.content.Intent] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v35, types: [android.content.Intent] */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Class, java.lang.Class<pm4.r>] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v24, types: [java.lang.Object, dm.a5, com.tencent.mm.plugin.finder.extension.reddot.jb] */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v34, types: [com.tencent.mm.protobuf.f] */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v43, types: [r45.in6] */
    /* JADX WARN: Type inference failed for: r5v72 */
    /* JADX WARN: Type inference failed for: r5v73 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v21, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v34, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v39 */
    /* JADX WARN: Type inference failed for: r7v1, types: [r45.in6] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void u(android.content.Context r46, int r47, android.os.Bundle r48, java.lang.String r49, java.util.Map r50) {
        /*
            Method dump skipped, instructions count: 2247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wm4.u.u(android.content.Context, int, android.os.Bundle, java.lang.String, java.util.Map):void");
    }

    public static void v(android.content.Context context, r45.in6 in6Var) {
        java.lang.String valueOf = java.lang.String.valueOf(c01.id.c());
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, "good-look-history");
            jSONObject.put("subscene", 6);
            jSONObject.put("tagId", 10802);
            jSONObject.put("nickname", java.net.URLEncoder.encode(gm0.j1.u().c().l(4, null) != null ? (java.lang.String) gm0.j1.u().c().l(4, null) : "", com.tencent.mapsdk.internal.rv.f51270c));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TopStory.TopStoryUILogic", e17, "goUserProfiler", new java.lang.Object[0]);
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, java.lang.String.valueOf(21));
        hashMap.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, in6Var.f377183e);
        hashMap.put("extParams", jSONObject.toString());
        hashMap.put("extInfo", ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi().y());
        hashMap.put(com.google.android.gms.common.Scopes.PROFILE, "1");
        hashMap.put("requestId", valueOf);
        hashMap.put("pRequestId", valueOf);
        hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_SEQ, valueOf);
        try {
            hashMap.put("deviceName", java.net.URLEncoder.encode(o45.wf.f343026d, "utf8"));
            hashMap.put("deviceBrand", java.net.URLEncoder.encode(android.os.Build.BRAND, "utf8"));
            hashMap.put("deviceModel", java.net.URLEncoder.encode(wo.w0.m(), "utf8"));
            hashMap.put("ostype", wo.q.f447784e);
        } catch (java.io.UnsupportedEncodingException e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TopStory.TopStoryUILogic", e18, "", new java.lang.Object[0]);
        }
        r45.in6 in6Var2 = new r45.in6();
        in6Var2.f377191p = i();
        in6Var2.f377187i = 21;
        in6Var2.f377182d = "";
        in6Var2.f377186h = "";
        in6Var2.f377189n = valueOf;
        in6Var2.f377183e = in6Var.f377183e;
        in6Var2.f377184f = in6Var.f377184f;
        in6Var2.f377196u = 2;
        in6Var2.f377188m = pm4.w.e(hashMap);
        in6Var2.f377197v = context.getString(com.tencent.mm.R.string.k09);
        in6Var2.f377194s = 10802;
        in6Var2.f377198w = com.tencent.mm.plugin.websearch.l2.b();
        in6Var2.f377201z = context.getResources().getColor(com.tencent.mm.R.color.aaw);
        r45.x50 x50Var = new r45.x50();
        x50Var.f389788d = "rec_category";
        int i17 = in6Var.f377194s;
        x50Var.f389789e = i17;
        x50Var.f389790f = java.lang.String.valueOf(i17);
        java.util.LinkedList linkedList = in6Var2.f377190o;
        linkedList.add(x50Var);
        s(linkedList, "", valueOf, false);
        w(context, in6Var2, valueOf, false, 2);
    }

    public static void w(android.content.Context context, r45.in6 in6Var, java.lang.String str, boolean z17, int i17) {
        s(in6Var.f377190o, "", str, false);
        long c17 = c01.id.c();
        pm4.y.f(in6Var, "clickTopStory", c17);
        java.util.LinkedList linkedList = in6Var.f377192q;
        if (linkedList.size() == 0) {
            r45.tn6 tn6Var = new r45.tn6();
            tn6Var.f386617d = "clickTopStory";
            tn6Var.f386618e = c17;
            linkedList.add(tn6Var);
        }
        android.content.Intent intent = new android.content.Intent();
        try {
            intent.putExtra("key_context", in6Var.toByteArray());
        } catch (java.io.IOException unused) {
        }
        intent.putExtra("key_navbarbgcolortype", i17);
        com.tencent.mm.plugin.websearch.l2.i(context, ".ui.home.TopStoryTabHomeUI", intent);
    }

    public static final java.lang.String x(r45.in6 in6Var) {
        java.util.LinkedList linkedList;
        java.util.Collections.sort(in6Var.f377192q, new wm4.v());
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        int i17 = 1;
        while (true) {
            linkedList = in6Var.f377192q;
            if (i17 >= linkedList.size()) {
                break;
            }
            int i18 = i17 - 1;
            stringBuffer.append(((r45.tn6) linkedList.get(i18)).f386617d);
            stringBuffer.append("->");
            stringBuffer.append(((r45.tn6) linkedList.get(i17)).f386617d);
            stringBuffer.append(":");
            stringBuffer.append(((r45.tn6) linkedList.get(i17)).f386618e - ((r45.tn6) linkedList.get(i18)).f386618e);
            stringBuffer.append("\n");
            i17++;
        }
        if (linkedList.size() > 2) {
            stringBuffer.append("TotalUseTime:");
            stringBuffer.append(((r45.tn6) linkedList.get(linkedList.size() - 1)).f386618e - ((r45.tn6) linkedList.get(0)).f386618e);
            stringBuffer.append("\n");
        }
        linkedList.clear();
        stringBuffer.append("============ TopStory Trace ============");
        return stringBuffer.toString();
    }

    public static final java.lang.String y(wm4.x xVar, java.util.List list) {
        if (list == null || list.size() == 0) {
            if (xVar == null) {
                return "";
            }
            return "longVideoSwitch=" + xVar.f447316a;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (xVar != null) {
            sb6.append("longVideoSwitch=");
            sb6.append(xVar.f447316a);
            sb6.append(";");
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            sb6.append((wm4.y) it.next());
            sb6.append("\t");
        }
        return sb6.toString();
    }
}
