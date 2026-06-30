package qk;

/* loaded from: classes9.dex */
public class n {
    public java.lang.String A;
    public boolean B;
    public qk.e C;
    public int D;
    public boolean E;
    public java.util.List F;
    public java.lang.String G;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f364259d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f364260e;

    /* renamed from: n, reason: collision with root package name */
    public int f364269n;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f364273r;

    /* renamed from: u, reason: collision with root package name */
    public int f364276u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f364277v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f364278w;

    /* renamed from: x, reason: collision with root package name */
    public int f364279x;

    /* renamed from: y, reason: collision with root package name */
    public qk.m f364280y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f364281z;

    /* renamed from: a, reason: collision with root package name */
    public org.json.JSONObject f364256a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f364257b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f364258c = false;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f364261f = null;

    /* renamed from: g, reason: collision with root package name */
    public qk.j f364262g = null;

    /* renamed from: h, reason: collision with root package name */
    public qk.i f364263h = null;

    /* renamed from: i, reason: collision with root package name */
    public qk.h f364264i = null;

    /* renamed from: j, reason: collision with root package name */
    public qk.k f364265j = null;

    /* renamed from: k, reason: collision with root package name */
    public qk.g f364266k = null;

    /* renamed from: l, reason: collision with root package name */
    public boolean f364267l = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f364268m = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f364270o = false;

    /* renamed from: p, reason: collision with root package name */
    public int f364271p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f364272q = 0;

    /* renamed from: s, reason: collision with root package name */
    public qk.f f364274s = null;

    /* renamed from: t, reason: collision with root package name */
    public int f364275t = 0;

    public n() {
        l75.e0 e0Var = qk.o.f364298y1;
        this.f364276u = 0;
        this.f364278w = false;
        this.B = false;
    }

    public static qk.n a(java.lang.String str) {
        qk.n nVar = new qk.n();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            try {
                java.lang.System.currentTimeMillis();
                nVar.f364256a = new org.json.JSONObject(str);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.BizInfo", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            }
        }
        return nVar;
    }

    public qk.e b() {
        org.json.JSONObject jSONObject;
        qk.e eVar;
        if (this.C == null && (jSONObject = this.f364256a) != null) {
            java.lang.String optString = jSONObject.optString("AcctTransferInfo");
            if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
                eVar = null;
            } else {
                qk.e eVar2 = new qk.e();
                try {
                    org.json.JSONArray optJSONArray = new org.json.JSONObject(optString).optJSONArray("origin_name_list");
                    if (optJSONArray != null) {
                        eVar2.f364087a = new java.util.ArrayList();
                        for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                            eVar2.f364087a.add(optJSONArray.optString(i17));
                        }
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.BizInfo", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
                }
                eVar = eVar2;
            }
            this.C = eVar;
        }
        return this.C;
    }

    public qk.h c() {
        org.json.JSONObject jSONObject = this.f364256a;
        if (jSONObject != null && this.f364264i == null) {
            java.lang.String optString = jSONObject.optString("MMBizMenu");
            this.G = optString;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
                java.lang.String str = this.G;
                com.tencent.mars.xlog.Log.i("MicroMsg.BizInfo", "MenuInfo = " + str);
                qk.h hVar = new qk.h();
                if (str != null && str.length() > 0) {
                    try {
                        org.json.JSONObject jSONObject2 = new org.json.JSONObject(str);
                        jSONObject2.optInt("update_time");
                        hVar.f364139a = jSONObject2.optInt("type", 0);
                        hVar.f364140b = r01.g0.d(jSONObject2.optJSONArray("button_list"));
                    } catch (org.json.JSONException e17) {
                        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                        com.tencent.mars.xlog.Log.e("MicroMsg.BizInfo", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
                    }
                }
                this.f364264i = hVar;
            }
        }
        return this.f364264i;
    }

    public qk.g d() {
        java.lang.String optString;
        org.json.JSONObject jSONObject = this.f364256a;
        if (jSONObject != null && this.f364266k == null && (optString = jSONObject.optString("EnterpriseBizInfo")) != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizInfo", "EnterpriseBizInfo = ".concat(optString));
            qk.g gVar = new qk.g();
            if (optString.length() > 0) {
                try {
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject(optString);
                    gVar.f364116a = jSONObject2.optString("belong");
                    jSONObject2.optString("freeze_wording");
                    gVar.f364117b = jSONObject2.optInt("child_type");
                    gVar.f364118c = jSONObject2.optString("home_url");
                    java.lang.String optString2 = jSONObject2.optString("exattr");
                    if (com.tencent.mm.sdk.platformtools.t8.K0(optString2)) {
                        gVar.f364119d = null;
                    } else {
                        org.json.JSONObject jSONObject3 = new org.json.JSONObject(optString2);
                        gVar.f364119d = jSONObject3.optString("chat_extension_url");
                        gVar.f364120e = jSONObject3.optLong(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_APPID);
                    }
                } catch (org.json.JSONException e17) {
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    com.tencent.mars.xlog.Log.e("MicroMsg.BizInfo", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
                }
            }
            this.f364266k = gVar;
        }
        return this.f364266k;
    }

    public qk.f e() {
        java.lang.String optString;
        org.json.JSONObject jSONObject = this.f364256a;
        if (jSONObject != null && this.f364274s == null && (optString = jSONObject.optString("HardwareBizInfo")) != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizInfo", "HardwareBizInfo = ".concat(optString));
            qk.f fVar = new qk.f();
            if (optString.length() > 0) {
                try {
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject(optString);
                    fVar.f364099a = jSONObject2.optInt("hardware_flag");
                    fVar.f364100b = jSONObject2.optInt("connect_status_display_mode");
                    fVar.f364101c = jSONObject2.optInt("special_internal_brand_type");
                } catch (org.json.JSONException e17) {
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    com.tencent.mars.xlog.Log.e("MicroMsg.BizInfo", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
                }
            }
            this.f364274s = fVar;
        }
        return this.f364274s;
    }

    public qk.k f() {
        int length;
        org.json.JSONObject jSONObject = this.f364256a;
        if (jSONObject != null && this.f364265j == null) {
            java.lang.String optString = jSONObject.optString("PayShowInfo");
            qk.k kVar = null;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
                try {
                    qk.k kVar2 = new qk.k();
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject(optString);
                    kVar2.f364194a = jSONObject2.optInt("reputation_level", -1);
                    kVar2.f364195b = jSONObject2.optString("scope_of_business");
                    kVar2.f364197d = jSONObject2.optString("guarantee_detail_h5_url");
                    org.json.JSONArray optJSONArray = jSONObject2.optJSONArray("guarantee_info");
                    if (optJSONArray != null && (length = optJSONArray.length()) > 0) {
                        kVar2.f364196c = new java.util.ArrayList();
                        for (int i17 = 0; i17 < length; i17++) {
                            java.lang.String string = optJSONArray.getString(i17);
                            if (!com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                                ((java.util.ArrayList) kVar2.f364196c).add(string);
                            }
                        }
                    }
                    kVar = kVar2;
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.BizInfo", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
                }
            }
            this.f364265j = kVar;
        }
        return this.f364265j;
    }

    public qk.i g() {
        qk.i iVar;
        org.json.JSONObject jSONObject = this.f364256a;
        if (jSONObject != null && this.f364263h == null) {
            java.lang.String optString = jSONObject.optString("PersonVerifyInfo");
            if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
                iVar = null;
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.BizInfo", "biz verify info is [%s]", optString);
                qk.i iVar2 = new qk.i();
                try {
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject(optString);
                    iVar2.f364151a = jSONObject2.optString("VerifyDesc");
                    iVar2.f364152b = jSONObject2.optString("VerifyName");
                    iVar2.f364153c = jSONObject2.optString("VerifyIdentity");
                    iVar2.f364154d = jSONObject2.optString("VerifyDescribe");
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.BizInfo", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.BizInfo", "desc[%s] name[%s] identity[%s] describe[%s]", iVar2.f364151a, iVar2.f364152b, iVar2.f364153c, iVar2.f364154d);
                iVar = iVar2;
            }
            this.f364263h = iVar;
        }
        return this.f364263h;
    }

    public java.util.List h() {
        org.json.JSONObject jSONObject = this.f364256a;
        if (jSONObject != null && this.f364261f == null) {
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("Privilege");
            java.util.LinkedList linkedList = new java.util.LinkedList();
            if (optJSONArray != null) {
                try {
                    int length = optJSONArray.length();
                    for (int i17 = 0; i17 < length; i17++) {
                        qk.l lVar = new qk.l();
                        org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i17);
                        lVar.f364211a = optJSONObject.optString("icon");
                        lVar.f364212b = optJSONObject.optString("description");
                        lVar.f364213c = optJSONObject.optString("description_key");
                        linkedList.add(lVar);
                    }
                } catch (java.lang.Exception e17) {
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    com.tencent.mars.xlog.Log.e("MicroMsg.BizInfo", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
                }
            }
            this.f364261f = linkedList;
        }
        return this.f364261f;
    }

    public qk.m i() {
        java.lang.String optString;
        org.json.JSONObject jSONObject = this.f364256a;
        if (jSONObject != null && this.f364280y == null && (optString = jSONObject.optString("RegisterSource")) != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizInfo", "RegisterSource = %s", optString);
            qk.m mVar = new qk.m();
            if (optString.length() > 0) {
                try {
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject(optString);
                    mVar.f364245a = jSONObject2.optString("RegisterBody");
                    mVar.f364246b = jSONObject2.optString("IntroUrl");
                    boolean z17 = true;
                    if (jSONObject2.optInt("IsClose", 0) != 1) {
                        z17 = false;
                    }
                    mVar.f364247c = z17;
                    mVar.f364248d = jSONObject2.optBoolean("IsOversea", false);
                    mVar.f364249e = jSONObject2.optString("AboutBizUrl");
                } catch (org.json.JSONException e17) {
                    boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    com.tencent.mars.xlog.Log.e("MicroMsg.BizInfo", "exception in RegisterSource:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
                }
            }
            this.f364280y = mVar;
        }
        return this.f364280y;
    }

    public int j() {
        org.json.JSONObject jSONObject = this.f364256a;
        if (jSONObject != null) {
            this.f364272q = jSONObject.optInt("ServiceType", 0);
        }
        return this.f364272q;
    }

    public qk.j k() {
        qk.j jVar;
        org.json.JSONObject jSONObject = this.f364256a;
        if (jSONObject != null && this.f364262g == null) {
            java.lang.String optString = jSONObject.optString("VerifySource");
            if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
                jVar = null;
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.BizInfo", "biz verify info is [%s]", optString);
                qk.j jVar2 = new qk.j();
                try {
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject(optString);
                    jVar2.f364176a = jSONObject2.optInt("Type");
                    jVar2.f364177b = jSONObject2.optString("Description");
                    jVar2.f364178c = jSONObject2.optString("Name");
                    jVar2.f364179d = jSONObject2.optString("IntroUrl");
                    jVar2.f364180e = jSONObject2.optString("VerifySubTitle");
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.BizInfo", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.BizInfo", "type[%d],desc[%s],name[%s],url[%s]", java.lang.Integer.valueOf(jVar2.f364176a), jVar2.f364177b, jVar2.f364178c, jVar2.f364179d);
                jVar = jVar2;
            }
            this.f364262g = jVar;
        }
        return this.f364262g;
    }

    public java.lang.String l() {
        org.json.JSONObject jSONObject = this.f364256a;
        if (jSONObject != null) {
            this.f364259d = jSONObject.optString("VerifyContactPromptTitle");
        }
        return this.f364259d;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List m() {
        /*
            r7 = this;
            java.util.List r0 = r7.F
            if (r0 != 0) goto L80
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r7.F = r0
            org.json.JSONObject r0 = r7.f364256a
            if (r0 == 0) goto L80
            java.lang.String r1 = "BindWxaInfo"
            java.lang.String r0 = r0.optString(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 0
            if (r1 != 0) goto L22
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L22
            r1.<init>(r0)     // Catch: org.json.JSONException -> L22
            goto L23
        L22:
            r1 = r2
        L23:
            if (r1 == 0) goto L2c
            java.lang.String r0 = "wxaEntryInfo"
            org.json.JSONArray r2 = r1.optJSONArray(r0)
        L2c:
            if (r2 == 0) goto L80
            r0 = 0
        L2f:
            int r1 = r2.length()
            if (r0 >= r1) goto L80
            org.json.JSONObject r1 = r2.optJSONObject(r0)
            if (r1 != 0) goto L3c
            goto L7d
        L3c:
            java.lang.String r3 = "username"
            java.lang.String r3 = r1.optString(r3)
            java.lang.String r4 = "title"
            java.lang.String r4 = r1.optString(r4)
            java.lang.String r5 = "title_key"
            java.lang.String r5 = r1.optString(r5)
            java.lang.String r6 = "icon_url"
            java.lang.String r1 = r1.optString(r6)
            boolean r6 = android.text.TextUtils.isEmpty(r3)
            if (r6 == 0) goto L5e
            goto L7d
        L5e:
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            if (r6 == 0) goto L6b
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 == 0) goto L6b
            goto L7d
        L6b:
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaEntryInfo r6 = new com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaEntryInfo
            r6.<init>()
            r6.f77429d = r3
            r6.f77430e = r4
            r6.f77431f = r5
            r6.f77432g = r1
            java.util.List r1 = r7.F
            r1.add(r6)
        L7d:
            int r0 = r0 + 1
            goto L2f
        L80:
            java.util.List r0 = r7.F
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: qk.n.m():java.util.List");
    }

    public boolean n() {
        org.json.JSONObject jSONObject = this.f364256a;
        if (jSONObject != null && jSONObject.optJSONObject("WifiBizInfo") != null && this.f364256a.optJSONObject("WifiBizInfo").optInt("IsWXWiFi") == 1) {
            this.B = true;
        }
        return this.B;
    }

    public boolean o() {
        org.json.JSONObject jSONObject = this.f364256a;
        if (jSONObject != null) {
            this.f364267l = com.tencent.mm.sdk.platformtools.t8.P(jSONObject.optString("ReportLocationType"), 0) > 0;
        }
        return this.f364267l;
    }

    public boolean p() {
        org.json.JSONObject jSONObject = this.f364256a;
        if (jSONObject != null) {
            this.f364258c = "1".equals(jSONObject.optString("IsShowMember"));
        }
        return this.f364258c;
    }

    public boolean q() {
        org.json.JSONObject jSONObject = this.f364256a;
        if (jSONObject != null) {
            java.lang.String optString = jSONObject.optString("NotifyManage");
            l75.e0 e0Var = qk.o.f364298y1;
            this.f364276u = com.tencent.mm.sdk.platformtools.t8.P(optString, 0);
        }
        int i17 = this.f364276u;
        l75.e0 e0Var2 = qk.o.f364298y1;
        return i17 == 1;
    }
}
