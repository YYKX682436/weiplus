package r01;

@j95.b
/* loaded from: classes7.dex */
public final class l1 extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public final int f368142d = 213;

    /* renamed from: e, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f368143e = kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c.plus(kotlinx.coroutines.t3.a(null, 1, null)));

    /* renamed from: f, reason: collision with root package name */
    public uh4.i0 f368144f = r01.k1.f368130d;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f368145g = jz5.h.b(r01.n0.f368162d);

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f368146h = jz5.h.b(r01.d1.f368043d);

    /* renamed from: i, reason: collision with root package name */
    public final r01.m0 f368147i = new r01.m0(null, null, 3, null);

    /* renamed from: m, reason: collision with root package name */
    public final r01.m0 f368148m = new r01.m0(null, null, 3, null);

    public l1() {
        Ni().i("BizPersonalCenterPluginAppHelper_LoginEventKey", new r01.i0(this));
        Ni().g("BizPersonalCenterPluginAppHelper_LogoutEventKey", new r01.j0(this));
        Ri().i("BizPersonalCenterPluginAppHelper_LoginEventKey", new r01.k0(this));
        Ri().g("BizPersonalCenterPluginAppHelper_LogoutEventKey", new r01.l0(this));
    }

    public static void Zi(r01.l1 l1Var, android.content.Context context, java.lang.String str, int i17, boolean z17, int i18, java.lang.Object obj) {
        r01.m0 m0Var;
        com.tencent.wechat.mm.biz.b bVar;
        r01.m0 m0Var2;
        java.lang.String str2 = null;
        if ((i18 & 2) != 0) {
            str = null;
        }
        if ((i18 & 8) != 0) {
            z17 = true;
        }
        if (!z17 ? !((m0Var = l1Var.f368148m) == null || (bVar = m0Var.f368154b) == null) : !((m0Var2 = l1Var.f368147i) == null || (bVar = m0Var2.f368154b) == null)) {
            str2 = bVar.f217890f;
        }
        if (str == null) {
            str = str2;
        }
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BizPersonalCenterPluginAppHelper", "#openBusinessProfilePage userName null");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", str);
        intent.putExtra("force_get_contact", true);
        intent.putExtra("key_use_new_contact_profile", true);
        intent.putExtra("Contact_IsBizAuthor", true);
        intent.putExtra("Contact_Scene", i17);
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        j45.l.n(context, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, l1Var.f368142d);
    }

    public static final void wi(r01.l1 l1Var, java.lang.String str, r01.m0 m0Var) {
        l1Var.getClass();
        ((ku5.t0) ku5.t0.f312615d).B(new r01.y0(m0Var, str));
        (m0Var == l1Var.f368147i ? l1Var.Ni() : l1Var.Ri()).d(new r01.a1(m0Var));
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x005b, code lost:
    
        if ((r6.length() > 0) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject Ai(int r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.String r0 = "bizUin"
            kotlin.jvm.internal.o.g(r6, r0)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            org.json.JSONArray r1 = r4.Di()
            java.lang.String r2 = "bizList"
            r0.put(r2, r1)
            java.lang.Class<tk.o> r1 = tk.o.class
            i95.m r2 = i95.n0.c(r1)
            tk.o r2 = (tk.o) r2
            ox.g r2 = (ox.g) r2
            java.lang.String r2 = r2.Vi()
            java.lang.String r3 = "picTextNameVersion"
            r0.put(r3, r2)
            i95.m r2 = i95.n0.c(r1)
            tk.o r2 = (tk.o) r2
            ox.g r2 = (ox.g) r2
            boolean r2 = r2.Di()
            if (r2 == 0) goto L37
            java.lang.String r2 = "1"
            goto L39
        L37:
            java.lang.String r2 = "0"
        L39:
            java.lang.String r3 = "photoAccountOpen"
            r0.put(r3, r2)
            i95.m r1 = i95.n0.c(r1)
            tk.o r1 = (tk.o) r1
            ox.g r1 = (ox.g) r1
            java.lang.String r1 = r1.Vi()
            java.lang.String r2 = "supportViewPhotoAcct"
            r0.put(r2, r1)
            if (r5 != 0) goto L5d
            int r1 = r6.length()
            if (r1 <= 0) goto L5a
            r1 = 1
            goto L5b
        L5a:
            r1 = 0
        L5b:
            if (r1 == 0) goto L67
        L5d:
            java.lang.String r1 = "bizType"
            r0.put(r1, r5)
            java.lang.String r5 = "biz"
            r0.put(r5, r6)
        L67:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r01.l1.Ai(int, java.lang.String):org.json.JSONObject");
    }

    public final l81.p0 Bi(int i17, java.lang.String bizUin) {
        kotlin.jvm.internal.o.g(bizUin, "bizUin");
        return new r01.v0(this, i17, bizUin);
    }

    public final org.json.JSONArray Di() {
        r01.m0 m0Var = this.f368147i;
        com.tencent.wechat.mm.biz.b bVar = m0Var.f368154b;
        r01.m0 m0Var2 = this.f368148m;
        com.tencent.wechat.mm.biz.b bVar2 = m0Var2.f368154b;
        if (bVar == null || bVar2 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BizPersonalCenterPluginAppHelper", "getAllBiz: bizAcct or photoAcct is null");
        }
        com.tencent.wechat.mm.biz.b bVar3 = m0Var.f368154b;
        int i17 = (bVar3 == null || !bVar3.f217897p) ? 0 : 1;
        com.tencent.wechat.mm.biz.b bVar4 = m0Var2.f368154b;
        int i18 = (bVar4 == null || !bVar4.f217897p) ? 0 : 1;
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        tk.s[] sVarArr = tk.s.f419870d;
        jSONObject.put("bizType", 1);
        java.lang.String str = bVar != null ? bVar.f217889e : null;
        if (str == null) {
            str = "";
        }
        jSONObject.put("biz", str);
        jSONObject.put("interactiveIdentityType", i17);
        jSONObject.put("initFlag", bVar != null ? bVar.f217894m : false);
        java.lang.Object obj = bVar;
        if (bVar == null) {
            obj = "";
        }
        jSONObject.put("fullInfo", pm0.b0.g(obj));
        jSONArray.put(jSONObject);
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        tk.s[] sVarArr2 = tk.s.f419870d;
        jSONObject2.put("bizType", 2);
        java.lang.String str2 = bVar2 != null ? bVar2.f217889e : null;
        if (str2 == null) {
            str2 = "";
        }
        jSONObject2.put("biz", str2);
        jSONObject2.put("interactiveIdentityType", i18);
        jSONObject2.put("initFlag", bVar2 != null ? bVar2.f217894m : false);
        java.lang.Object obj2 = bVar2;
        if (bVar2 == null) {
            obj2 = "";
        }
        jSONObject2.put("fullInfo", pm0.b0.g(obj2));
        jSONArray.put(jSONObject2);
        return jSONArray;
    }

    public final com.tencent.wechat.iam.biz.z0 Ni() {
        return (com.tencent.wechat.iam.biz.z0) this.f368145g.getValue();
    }

    public final com.tencent.wechat.iam.biz.z0 Ri() {
        return (com.tencent.wechat.iam.biz.z0) this.f368146h.getValue();
    }

    public final void Ui(yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        Ni().b(new r01.x0(callback));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if ((!r31.isEmpty()) == true) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l81.p0 Vi(java.util.List r31, int r32, org.json.JSONObject r33) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r01.l1.Vi(java.util.List, int, org.json.JSONObject):l81.p0");
    }

    public final void aj(android.content.Context context, com.tencent.pigeon.biz_base.PersonalCenterJumpInfo jumpInfo, l81.e1 e1Var, rv.e3 e3Var) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(jumpInfo, "jumpInfo");
        l81.b1 b1Var = new l81.b1();
        java.lang.String appId = jumpInfo.getAppId();
        if (appId == null) {
            appId = "";
        }
        b1Var.f317014b = appId;
        java.lang.String enterPath = jumpInfo.getEnterPath();
        if (enterPath == null) {
            enterPath = "";
        }
        b1Var.f317022f = enterPath;
        java.lang.Long scene = jumpInfo.getScene();
        b1Var.f317032k = scene != null ? (int) scene.longValue() : 0;
        java.lang.String sceneNote = jumpInfo.getSceneNote();
        if (sceneNote == null) {
            sceneNote = "";
        }
        b1Var.f317034l = sceneNote;
        java.util.List<com.tencent.pigeon.biz_base.PersonalCenterJumpPhotoInfo> imgInfoList = jumpInfo.getImgInfoList();
        java.lang.Long picFromScene = jumpInfo.getPicFromScene();
        int longValue = picFromScene != null ? (int) picFromScene.longValue() : 0;
        java.lang.Long serviceType = jumpInfo.getServiceType();
        int longValue2 = serviceType != null ? (int) serviceType.longValue() : 0;
        java.lang.String biz = jumpInfo.getBiz();
        if (biz == null) {
            biz = "";
        }
        java.lang.String wxaData = jumpInfo.getWxaData();
        java.lang.String str = wxaData != null ? wxaData : "";
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("personalCenterWxaDataKey", str);
        if ((biz.length() > 0) || longValue2 != 0) {
            jSONObject.put("bizType", longValue2);
            jSONObject.put("biz", biz);
        }
        b1Var.f317028i = Vi(imgInfoList, longValue, jSONObject);
        if (((ox.z) ((tk.r) i95.n0.c(tk.r.class))).Ai(context, b1Var, e3Var)) {
            return;
        }
        Ui(new r01.c1(b1Var, e1Var, context));
    }

    public final void bj() {
        ((com.tencent.mm.plugin.appbrand.service.f5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f5.class)).Yf(com.tencent.mm.plugin.appbrand.service.x6.S);
    }

    public final void cj() {
        Ni().d(new r01.f1(this));
        Ri().d(new r01.h1(this));
        ((uh4.c0) i95.n0.c(uh4.c0.class)).Kb(this.f368144f);
    }

    public final void fj(java.lang.String appId, java.lang.String path, int i17) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(path, "path");
        ((com.tencent.mm.plugin.appbrand.service.s6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.s6.class)).P4("", appId, path, i17);
    }
}
