package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes8.dex */
public class m extends dm.m0 {

    /* renamed from: f2, reason: collision with root package name */
    public static final l75.e0 f188983f2 = dm.m0.initAutoDBInfo(com.tencent.mm.pluginsdk.model.app.m.class);

    /* renamed from: e2, reason: collision with root package name */
    public java.util.Map f188984e2;

    public m() {
        this.field_appId = "";
        this.field_appName = "";
        this.field_appDiscription = "";
        this.field_appIconUrl = "";
        this.field_appStoreUrl = "";
        this.field_appVersion = 0;
        this.field_appWatermarkUrl = "";
        this.field_packageName = "";
        this.field_status = 4;
        this.field_signature = "";
        this.field_modifyTime = 0L;
        this.field_appName_en = "";
        this.field_appName_tw = "";
        this.field_appName_hk = "";
        this.field_appDiscription_en = "";
        this.field_appDiscription_tw = "";
        this.field_appType = "";
        this.field_openId = "";
        this.field_authFlag = 0;
        this.field_appInfoFlag = 0;
        this.I = "";
        this.H = "";
        this.A = true;
        z0("");
        A0("");
        this.R = "";
        this.S = "";
        this.A = true;
    }

    public java.util.List D0(java.lang.String str) {
        if (this.f188984e2 == null && !com.tencent.mm.sdk.platformtools.t8.K0(this.field_packageInfos)) {
            try {
                org.json.JSONArray jSONArray = new org.json.JSONArray(this.field_packageInfos);
                for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                    org.json.JSONObject jSONObject = jSONArray.getJSONObject(i17);
                    java.lang.String optString = jSONObject.optString("PackageName");
                    java.lang.String optString2 = jSONObject.optString("AndroidSignature");
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(optString) && !com.tencent.mm.sdk.platformtools.t8.K0(optString2)) {
                        if (this.f188984e2 == null) {
                            this.f188984e2 = new java.util.HashMap();
                        }
                        java.util.List list = (java.util.List) ((java.util.HashMap) this.f188984e2).get(optString);
                        if (list == null) {
                            list = new java.util.ArrayList();
                        }
                        list.add(optString2);
                        ((java.util.HashMap) this.f188984e2).put(optString, list);
                    }
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppInfo", "getPackageInfos failed:" + e17.getMessage());
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String str2 = this.field_packageName;
        if (str2 != null && str2.equals(str)) {
            arrayList.add(this.field_signature);
        }
        java.util.Map map = this.f188984e2;
        if (map != null && ((java.util.HashMap) map).containsKey(str)) {
            arrayList.addAll((java.util.Collection) ((java.util.HashMap) this.f188984e2).get(str));
        }
        return arrayList;
    }

    public boolean F0() {
        return "wx7302cee7c7d6d7d6".equals(this.field_appId);
    }

    public boolean G0() {
        return this.field_serviceAppType != 0;
    }

    @Override // dm.m0, l75.f0
    public android.content.ContentValues convertTo() {
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.field_appType) && (this.field_appType.startsWith("1") || this.field_appType.startsWith("6"))) {
            this.field_appType = "," + this.field_appType;
        }
        return super.convertTo();
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.tencent.mm.pluginsdk.model.app.m) {
            return ((com.tencent.mm.pluginsdk.model.app.m) obj).field_appId.equals(this.field_appId);
        }
        return false;
    }

    @Override // dm.m0, l75.f0
    public l75.e0 getDBInfo() {
        return f188983f2;
    }

    public int hashCode() {
        return !com.tencent.mm.sdk.platformtools.t8.K0(this.field_appId) ? this.field_appId.hashCode() : super.hashCode();
    }

    public boolean k() {
        java.lang.String[] split;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.field_appType) && (split = this.field_appType.split(",")) != null && split.length != 0) {
            for (java.lang.String str : split) {
                if (str.equals("1")) {
                    return true;
                }
            }
        }
        return false;
    }
}
