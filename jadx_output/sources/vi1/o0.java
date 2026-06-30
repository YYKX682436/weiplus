package vi1;

/* loaded from: classes7.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public static final vi1.o0 f437416a = new vi1.o0();

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.o4 f437417b = com.tencent.mm.sdk.platformtools.o4.M("MicroMsg.PhoneItemsManager");

    public final void a(com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem phoneItem) {
        kotlin.jvm.internal.o.g(phoneItem, "phoneItem");
        java.util.ArrayList arrayList = (java.util.ArrayList) b();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem) it.next()).f87407o = false;
        }
        if (arrayList.contains(phoneItem)) {
            arrayList.set(arrayList.indexOf(phoneItem), phoneItem);
        } else {
            arrayList.add(phoneItem);
        }
        d(arrayList);
    }

    public final java.util.List b() {
        org.json.JSONArray jSONArray;
        try {
            jSONArray = new org.json.JSONArray(f437417b.getString("PhoneItemsManager#PhoneItems", "{}"));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PhoneItemsManager", "e:%s", e17);
            jSONArray = null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i17 = 0; i17 < length; i17++) {
                vi1.m0 m0Var = com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem.f87398q;
                java.lang.String string = jSONArray.getString(i17);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem a17 = m0Var.a(string);
                if (a17 != null) {
                    arrayList.add(a17);
                }
            }
        }
        java.lang.String.valueOf(jSONArray);
        return arrayList;
    }

    public final java.util.List c(java.util.List list, java.util.List list2) {
        boolean z17;
        if (list == null) {
            return null;
        }
        if (list2 != null) {
            java.util.Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem phoneItem = (com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem) it.next();
                if (phoneItem.f87407o) {
                    java.util.Iterator it6 = list.iterator();
                    while (it6.hasNext()) {
                        com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem phoneItem2 = (com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem) it6.next();
                        if (kotlin.jvm.internal.o.b(phoneItem.f87399d, phoneItem2.f87399d)) {
                            phoneItem2.f87407o = true;
                            z17 = true;
                            break;
                        }
                    }
                }
            }
        }
        z17 = false;
        if (!z17 && list.size() >= 1) {
            ((com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem) list.get(0)).f87407o = true;
        }
        return list;
    }

    public final void d(java.util.List list) {
        if (list == null) {
            return;
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem phoneItem = (com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem) it.next();
            phoneItem.getClass();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("mobile", phoneItem.f87399d);
            jSONObject.put("show_mobile", phoneItem.f87400e);
            jSONObject.put("need_auth", phoneItem.f87404i);
            jSONObject.put("allow_send_sms", phoneItem.f87405m);
            jSONObject.put("encryptedData", phoneItem.f87401f);
            jSONObject.put("iv", phoneItem.f87402g);
            jSONObject.put("cloud_id", phoneItem.f87403h);
            jSONObject.put("is_wechat", phoneItem.f87406n);
            jSONObject.put("is_check", phoneItem.f87407o);
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, phoneItem.f87408p);
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            jSONArray.put(jSONObject2);
        }
        java.lang.String jSONArray2 = jSONArray.toString();
        com.tencent.mm.sdk.platformtools.o4 o4Var = f437417b;
        o4Var.putString("PhoneItemsManager#PhoneItems", jSONArray2);
        o4Var.getClass();
        jSONArray.toString();
    }

    public final void e(com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem phoneItem) {
        java.util.List b17 = b();
        if (phoneItem != null) {
            java.util.ArrayList arrayList = (java.util.ArrayList) b17;
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem) it.next()).f87407o = false;
            }
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem phoneItem2 = (com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem) it6.next();
                if (kotlin.jvm.internal.o.b(phoneItem.f87399d, phoneItem2.f87399d)) {
                    phoneItem2.f87407o = true;
                }
            }
        }
        d(b17);
    }
}
