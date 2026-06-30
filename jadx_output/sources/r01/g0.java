package r01;

/* loaded from: classes9.dex */
public class g0 {

    /* renamed from: a, reason: collision with root package name */
    public int f368073a;

    /* renamed from: b, reason: collision with root package name */
    public int f368074b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f368075c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f368076d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f368077e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f368078f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f368079g = null;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f368080h;

    /* renamed from: i, reason: collision with root package name */
    public int f368081i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f368082j;

    /* renamed from: k, reason: collision with root package name */
    public int f368083k;

    /* renamed from: l, reason: collision with root package name */
    public bw5.x7 f368084l;

    public static java.util.LinkedList c(java.util.Map map) {
        int P;
        if (map != null && (P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.buttonlist.$count"), 0)) > 0) {
            try {
                java.util.LinkedList linkedList = new java.util.LinkedList();
                for (int i17 = 0; i17 < P; i17++) {
                    r01.g0 g0Var = new r01.g0();
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(".msg.appmsg.buttonlist.button");
                    sb6.append(i17 != 0 ? "" + i17 : "");
                    java.lang.String sb7 = sb6.toString();
                    g0Var.f368073a = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(sb7 + ".id"), 0);
                    g0Var.f368074b = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(sb7 + ".type"), 0);
                    g0Var.f368075c = (java.lang.String) map.get(sb7 + ".name");
                    g0Var.f368076d = (java.lang.String) map.get(sb7 + ".key");
                    g0Var.f368077e = (java.lang.String) map.get(sb7 + ".value");
                    g0Var.f368081i = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(sb7 + ".acttype"), 0);
                    linkedList.add(g0Var);
                }
                return linkedList;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.BizMenuItem", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            }
        }
        return null;
    }

    public static java.util.List d(org.json.JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int length = jSONArray.length();
            for (int i17 = 0; i17 < length; i17++) {
                org.json.JSONObject jSONObject = jSONArray.getJSONObject(i17);
                r01.g0 g0Var = new r01.g0();
                g0Var.f368073a = jSONObject.getInt(dm.i4.COL_ID);
                g0Var.f368074b = jSONObject.getInt("type");
                g0Var.f368075c = jSONObject.getString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME);
                g0Var.f368076d = jSONObject.getString("key");
                g0Var.f368077e = jSONObject.optString("value");
                g0Var.f368078f = jSONObject.optString("native_url");
                g0Var.f368079g = d(jSONObject.optJSONArray("sub_button_list"));
                g0Var.f368081i = jSONObject.optInt("acttype");
                g0Var.f368083k = jSONObject.optInt("show_icon_type", 0);
                g0Var.f368084l = e(jSONObject.optJSONObject("menu_ecs_data"));
                arrayList.add(g0Var);
            }
            return arrayList;
        } catch (org.json.JSONException e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.BizMenuItem", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            return null;
        }
    }

    public static bw5.x7 e(org.json.JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.optJSONObject("jump_info") == null) {
            return null;
        }
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("jump_info");
        bw5.x7 x7Var = new bw5.x7();
        x7Var.f34973d = optJSONObject.optInt("jumpBizType", 0);
        boolean[] zArr = x7Var.f34984r;
        zArr[1] = true;
        org.json.JSONArray optJSONArray = optJSONObject.optJSONArray("jumpPriority");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            x7Var.j(new java.util.LinkedList());
            for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                x7Var.f34977h.add(optJSONArray.optString(i17));
            }
        }
        org.json.JSONObject optJSONObject2 = optJSONObject.optJSONObject("mini_app_info");
        if (optJSONObject2 != null) {
            bw5.u7 u7Var = new bw5.u7();
            u7Var.e(optJSONObject2.optString("appid"));
            u7Var.f(optJSONObject2.optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH));
            u7Var.f33755e = optJSONObject2.optString("app_username");
            u7Var.f33768u[2] = true;
            u7Var.g(optJSONObject2.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1035));
            u7Var.i(optJSONObject2.optString("scene_note"));
            u7Var.j(optJSONObject2.optInt("version_type", 0));
            x7Var.k(u7Var);
        }
        org.json.JSONObject optJSONObject3 = optJSONObject.optJSONObject("lite_app_info");
        if (optJSONObject3 != null) {
            bw5.q7 q7Var = new bw5.q7();
            q7Var.f31979d = optJSONObject3.optString("appid");
            boolean[] zArr2 = q7Var.f31987o;
            zArr2[1] = true;
            q7Var.f31980e = optJSONObject3.optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
            zArr2[2] = true;
            q7Var.f31981f = optJSONObject3.optString("query");
            zArr2[3] = true;
            q7Var.f31982g = optJSONObject3.optString("default_url");
            zArr2[4] = true;
            x7Var.f34975f = q7Var;
            zArr[3] = true;
        }
        org.json.JSONObject optJSONObject4 = optJSONObject.optJSONObject("html5_info");
        if (optJSONObject4 != null) {
            bw5.o7 o7Var = new bw5.o7();
            o7Var.f31001d = optJSONObject4.optString("url");
            o7Var.f31006i[1] = true;
            x7Var.f34976g = o7Var;
            zArr[4] = true;
        }
        return x7Var;
    }

    public void a(java.util.ArrayList arrayList) {
        if (arrayList == null || arrayList.size() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BizMenuItem", "value null!");
            return;
        }
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("pic_md5", str);
                jSONArray.put(jSONObject);
            }
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("pics", jSONArray);
            this.f368082j = jSONObject2.toString();
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BizMenuItem", e17.toString());
        }
    }

    public java.lang.String b() {
        if (this.f368082j == null) {
            this.f368082j = "";
        }
        if (this.f368080h == null) {
            if (this.f368074b == 4) {
                this.f368080h = "menu_action_start";
            } else {
                this.f368080h = "menu_click";
            }
        }
        return java.lang.String.format("%s<info><id><![CDATA[%d]]></id><key><![CDATA[%s]]></key><status><![CDATA[%s]]></status><content><![CDATA[%s]]></content></info>", "#bizmenu#", java.lang.Integer.valueOf(this.f368073a), this.f368076d, this.f368080h, this.f368082j);
    }

    public java.lang.String toString() {
        java.lang.Object[] objArr = new java.lang.Object[7];
        objArr[0] = java.lang.Integer.valueOf(this.f368073a);
        objArr[1] = java.lang.Integer.valueOf(this.f368081i);
        objArr[2] = java.lang.Integer.valueOf(this.f368074b);
        java.lang.String str = this.f368075c;
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        java.lang.String str2 = this.f368076d;
        if (str2 == null) {
            str2 = "";
        }
        objArr[4] = str2;
        java.lang.String str3 = this.f368077e;
        if (str3 == null) {
            str3 = "";
        }
        objArr[5] = str3;
        java.lang.String str4 = this.f368082j;
        objArr[6] = str4 != null ? str4 : "";
        return java.lang.String.format("id:%d, type:%d, acttype:%s, name:%s, key:%s, value:%s, content:%s", objArr);
    }
}
