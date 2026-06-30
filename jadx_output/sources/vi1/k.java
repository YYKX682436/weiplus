package vi1;

/* loaded from: classes7.dex */
public final class k implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.r f437379a;

    public k(yz5.r rVar) {
        this.f437379a = rVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        r45.n24 n24Var = (r45.n24) obj;
        com.tencent.mars.xlog.Log.i("Luggage.FULL.CgiPhoneNumber", "getPhoneNumber success");
        r45.j14 j14Var = n24Var.f381015d;
        int i17 = j14Var.f377491d;
        java.lang.String str = j14Var.f377492e;
        yz5.r rVar = this.f437379a;
        if (i17 != 0) {
            com.tencent.mars.xlog.Log.e("Luggage.FULL.CgiPhoneNumber", "jsErrcode:" + i17 + ", jsErrmsg:" + str);
            if (rVar != null) {
                java.lang.Boolean bool = java.lang.Boolean.FALSE;
                if (str == null) {
                    str = "";
                }
                rVar.C(bool, str, null, null);
            }
        } else {
            org.json.JSONObject jSONObject = new org.json.JSONObject(n24Var.f381016e.i());
            java.util.ArrayList arrayList = new java.util.ArrayList();
            vi1.m0 m0Var = com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem.f87398q;
            java.lang.String optString = jSONObject.optString("wx_phone");
            kotlin.jvm.internal.o.f(optString, "optString(...)");
            com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem a17 = m0Var.a(optString);
            if (a17 != null) {
                a17.f87406n = true;
                arrayList.add(a17);
            }
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("custom_phone_list");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                int length = optJSONArray.length();
                for (int i18 = 0; i18 < length; i18++) {
                    java.lang.String string = optJSONArray.getString(i18);
                    kotlin.jvm.internal.o.f(string, "getString(...)");
                    com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem a18 = m0Var.a(string);
                    if (a18 != null) {
                        arrayList.add(a18);
                    }
                }
            }
            if (rVar != null) {
                java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
                r45.jv5 jv5Var = n24Var.f381017f;
                r45.i7 i7Var = n24Var.f381026r;
                java.lang.String str2 = n24Var.f381024p;
                if (str2 == null) {
                    str2 = "";
                }
                rVar.C(bool2, "", arrayList, new cb1.i(jv5Var, i7Var, str2, n24Var.f381027s));
            }
        }
        return jz5.f0.f302826a;
    }
}
