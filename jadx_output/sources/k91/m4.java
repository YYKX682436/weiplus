package k91;

/* loaded from: classes4.dex */
public class m4 extends k91.j4 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f305679e = {l75.n0.getCreateSQLs(k91.v5.E1, "WxaAttributesTable")};

    public m4(l75.k0 k0Var) {
        super(k0Var, "WxaAttributesTable", dm.vc.F);
        if (!D0() || gm0.j1.u().c().o(com.tencent.mm.storage.u3.APPBRAND_SHORTCUT_URL_UPGRADE_FIXED_BOOLEAN_SYNC, false)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.WxaAttributeDesktopURLFix", "before fix");
        android.database.Cursor f17 = k0Var.f("select appInfo from WxaAttributesTable", null, 2);
        if (f17 == null || f17.isClosed()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.WxaAttributeDesktopURLFix", "try fix but db not working");
            return;
        }
        if (f17.moveToFirst()) {
            java.util.LinkedList<android.util.Pair> linkedList = new java.util.LinkedList();
            do {
                java.lang.String string = f17.getString(0);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                    try {
                        org.json.JSONObject jSONObject = new org.json.JSONObject(string);
                        java.lang.String optString = jSONObject.optString("Appid");
                        java.lang.String optString2 = jSONObject.optString("RoundedSquareIconUrl");
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(optString) && !com.tencent.mm.sdk.platformtools.t8.K0(optString2)) {
                            android.content.ContentValues contentValues = new android.content.ContentValues(1);
                            contentValues.put("roundedSquareIconURL", optString2);
                            linkedList.add(android.util.Pair.create(optString, contentValues));
                        }
                    } catch (java.lang.Exception unused) {
                    }
                }
            } while (f17.moveToNext());
            f17.close();
            long F = k0Var.F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            for (android.util.Pair pair : linkedList) {
                k0Var.p("WxaAttributesTable", (android.content.ContentValues) pair.second, "appId=?", new java.lang.String[]{(java.lang.String) pair.first});
            }
            k0Var.w(java.lang.Long.valueOf(F));
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.WxaAttributeDesktopURLFix", "fix done");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.WxaAttributeDesktopURLFix", "no contacts available");
        }
        if (!f17.isClosed()) {
            f17.close();
        }
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.APPBRAND_SHORTCUT_URL_UPGRADE_FIXED_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
    }

    public static void z1(k91.m4 m4Var, k91.v5 v5Var) {
        m4Var.getClass();
        if (gm0.j1.a()) {
            com.tencent.mm.plugin.appbrand.appusage.c2 c2Var = new com.tencent.mm.plugin.appbrand.appusage.c2();
            if (com.tencent.mm.sdk.platformtools.t8.K0(v5Var.field_appId)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.WxaAttrStorageWC", "update mess info, appId is null");
                return;
            }
            c2Var.field_appId = v5Var.field_appId;
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(v5Var.field_appInfo);
                c2Var.field_wechatPluginApp = jSONObject.optInt("WechatPluginApp", 0);
                c2Var.field_appServiceType = jSONObject.optInt("AppServiceType", 0);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.w("MicroMsg.WxaAttrStorageWC", "parse app info json error", e17);
            }
            try {
                org.json.JSONObject optJSONObject = new org.json.JSONObject(v5Var.field_dynamicInfo).optJSONObject("NewSetting");
                if (optJSONObject != null) {
                    c2Var.field_maxFileStorageSize = optJSONObject.optInt("Uint32MaxFileStorageSizeInMB", 10);
                } else {
                    com.tencent.mars.xlog.Log.w("MicroMsg.WxaAttrStorageWC", "can't fetch new setting field from json");
                }
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.w("MicroMsg.WxaAttrStorageWC", "parse dynamic info json error", e18);
            }
            com.tencent.mm.plugin.appbrand.appusage.d2 d2Var = (com.tencent.mm.plugin.appbrand.appusage.d2) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.appusage.d2.class);
            d2Var.getClass();
            if (com.tencent.mm.sdk.platformtools.t8.K0(c2Var.field_appId)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandMessInfoStorage", "update info, appId is null");
                return;
            }
            boolean z17 = d2Var.get(c2Var, new java.lang.String[0]);
            c2Var.field_appId = c2Var.field_appId;
            c2Var.field_wechatPluginApp = c2Var.field_wechatPluginApp;
            c2Var.field_appServiceType = c2Var.field_appServiceType;
            c2Var.field_maxFileStorageSize = c2Var.field_maxFileStorageSize;
            if (z17) {
                d2Var.update(c2Var, new java.lang.String[0]);
            } else {
                d2Var.insert(c2Var);
            }
        }
    }

    public void C1(k91.v5 v5Var) {
        boolean z17;
        if (gm0.j1.a()) {
            java.lang.String str = v5Var.field_username;
            java.lang.String str2 = v5Var.field_nickname;
            java.lang.String str3 = v5Var.field_bigHeadURL;
            java.lang.String str4 = v5Var.field_smallHeadURL;
            ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            com.tencent.mm.modelavatar.r0 n07 = com.tencent.mm.modelavatar.d1.Ni().n0(str);
            boolean z18 = false;
            boolean z19 = true;
            if (n07 == null) {
                n07 = new com.tencent.mm.modelavatar.r0();
                z17 = true;
            } else {
                z17 = false;
            }
            boolean z27 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (!(str4 == null ? "" : str4).equals(n07.d())) {
                n07.f70532d = str4;
                z17 = true;
            }
            if (!(str3 != null ? str3 : "").equals(n07.c())) {
                n07.f70533e = str3;
                z17 = true;
            }
            if (z17) {
                n07.f70529a = str;
                n07.f70534f = 1;
                n07.f70537i = 31;
                ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                com.tencent.mm.modelavatar.d1.Ni().y0(n07);
            }
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
            if (n17 == null) {
                n17 = new com.tencent.mm.storage.z3();
            }
            if (((int) n17.E2) == 0) {
                n17.X1(str);
                z18 = true;
            }
            if (str2.equals(n17.P0())) {
                z19 = z18;
            } else {
                n17.M1(str2);
                try {
                    n17.R1(x51.k.b(str2));
                } catch (java.lang.UnsatisfiedLinkError unused) {
                }
                try {
                    n17.S1(x51.k.a(str2));
                } catch (java.lang.UnsatisfiedLinkError unused2) {
                }
            }
            if (z19) {
                ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().m0(n17);
            }
        }
    }

    @Override // k91.j4, l75.n0, l75.g0
    /* renamed from: J0 */
    public boolean delete(k91.v5 v5Var, boolean z17, java.lang.String... strArr) {
        k91.v5 v5Var2;
        if (com.tencent.mm.sdk.platformtools.t8.K0(v5Var.field_username)) {
            v5Var2 = null;
        } else {
            v5Var.field_usernameHash = v5Var.field_username.hashCode();
            v5Var2 = n1(v5Var.field_username, "appId");
        }
        boolean delete = super.delete(v5Var, z17, strArr);
        if (delete && v5Var2 != null && !com.tencent.mm.sdk.platformtools.t8.K0(v5Var2.field_appId)) {
            ((com.tencent.mm.plugin.appbrand.appusage.d2) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.appusage.d2.class)).D0(v5Var2.field_appId);
        }
        return delete;
    }

    @Override // k91.j4
    public boolean W0(java.lang.String str, com.tencent.mm.protobuf.g gVar, java.util.List list, boolean z17) {
        if (!gm0.j1.b().f273254q) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxaAttrStorageWC", "flushAttrs username[%s], account().isInitializedNotifyAllDone()==FALSE", str);
            return false;
        }
        boolean W0 = super.W0(str, gVar, list, z17);
        if (W0) {
            ((ku5.t0) ku5.t0.f312615d).h(new k91.n4(this, str), "MicroMsg.WxaAttrStorageWCTHREAD_TAG_POST_FLUSH_ATTRS");
        }
        return W0;
    }

    @Override // l75.s0, l75.l0
    public void add(l75.q0 q0Var) {
        super.add("MicroMsg.WxaAttrStorageWC.WORKER", q0Var);
    }

    @Override // k91.j4
    public boolean y0(final k91.v5 v5Var, final r45.yc7 yc7Var) {
        boolean y07 = super.y0(v5Var, yc7Var);
        if (y07 && "WxaAppInfo".equals(yc7Var.f390971d)) {
            java.lang.String str = v5Var.field_appId;
            java.lang.String str2 = yc7Var.f390972e;
            ((ku5.t0) ku5.t0.f312615d).h(new k91.o4(this, str2, str), "MicroMsg.WxaAttrStorageWCTHREAD_TAG_POST_FLUSH_ATTRS");
        } else if (y07 && "PassThroughInfo".equals(yc7Var.f390971d) && !android.text.TextUtils.isEmpty(yc7Var.f390972e)) {
            ((ku5.t0) ku5.t0.f312615d).h(new java.lang.Runnable() { // from class: k91.m4$$a
                @Override // java.lang.Runnable
                public final void run() {
                    r45.yc7 yc7Var2 = r45.yc7.this;
                    k91.v5 v5Var2 = v5Var;
                    try {
                        java.lang.String optString = new org.json.JSONObject(yc7Var2.f390972e).optString("expt_info");
                        if (android.text.TextUtils.isEmpty(optString)) {
                            return;
                        }
                        ((k91.x3) com.tencent.mm.plugin.appbrand.app.r9.fj(k91.x3.class)).J0(v5Var2.field_appId, optString, k91.u3.f305781g);
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.WxaAttrStorageWC", "try updateExptInfo from attr(%s), get exception:%s", v5Var2.field_appId, e17);
                    }
                }
            }, "MicroMsg.WxaAttrStorageWCTHREAD_TAG_POST_FLUSH_ATTRS");
        }
        return y07;
    }
}
