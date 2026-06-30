package com.tencent.mm.plugin.order.model;

/* loaded from: classes9.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.order.model.MallTransactionObject f152819a;

    /* renamed from: b, reason: collision with root package name */
    public dp3.c f152820b;

    /* renamed from: c, reason: collision with root package name */
    public java.util.ArrayList f152821c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f152822d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f152823e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f152824f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f152825g;

    /* renamed from: h, reason: collision with root package name */
    public int f152826h;

    public a() {
        new java.util.LinkedList();
    }

    public final void a(java.util.List list, org.json.JSONObject jSONObject) {
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("evaluate_section");
        if (optJSONObject == null) {
            return;
        }
        if (list == null) {
            list = new java.util.ArrayList();
        }
        dp3.b bVar = new dp3.b();
        if (optJSONObject.has("value")) {
            bVar.f242198b = optJSONObject.optString("value");
            bVar.f242201e = 2;
        } else {
            bVar.f242201e = 1;
        }
        int optInt = optJSONObject.optInt("order", 0);
        if (optInt < 0 || optInt > optJSONObject.length() + 1) {
            return;
        }
        list.add(optInt, bVar);
    }

    public final java.util.List b(org.json.JSONObject jSONObject) {
        org.json.JSONArray jSONArray = jSONObject.getJSONArray("normal_sections");
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        boolean z17 = false;
        for (int i17 = 0; i17 < jSONArray.length(); i17++) {
            org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(i17);
            dp3.b bVar = new dp3.b();
            bVar.f242200d = jSONObject2.optInt("is_bar") != 0;
            java.lang.String optString = jSONObject2.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME);
            bVar.f242197a = optString;
            if (android.text.TextUtils.isEmpty(optString)) {
                z17 = bVar.f242200d;
            } else {
                if (z17) {
                    bVar.f242200d = z17;
                }
                z17 = bVar.f242200d;
                bVar.f242198b = jSONObject2.optString("value");
                bVar.f242199c = jSONObject2.optString("jump_url");
                jSONObject2.optInt("jump_type");
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    public final java.util.ArrayList c(org.json.JSONObject jSONObject) {
        org.json.JSONObject jSONObject2 = jSONObject.getJSONObject("product_section");
        java.util.ArrayList arrayList = null;
        if (jSONObject2 == null) {
            return null;
        }
        org.json.JSONArray jSONArray = jSONObject2.getJSONArray("items");
        if (jSONArray != null && jSONArray.length() != 0) {
            arrayList = new java.util.ArrayList();
            for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                org.json.JSONObject jSONObject3 = jSONArray.getJSONObject(i17);
                com.tencent.mm.plugin.order.model.ProductSectionItem productSectionItem = new com.tencent.mm.plugin.order.model.ProductSectionItem();
                productSectionItem.f152809d = jSONObject3.optString("icon_url");
                productSectionItem.f152810e = jSONObject3.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME);
                try {
                    productSectionItem.f152811f = d(jSONObject3);
                } catch (org.json.JSONException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MallOrderDetailObject", e17, "", new java.lang.Object[0]);
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MallOrderDetailObject", e18, "", new java.lang.Object[0]);
                }
                productSectionItem.f152812g = jSONObject3.optInt("count");
                productSectionItem.f152813h = jSONObject3.optString(ya.b.PRICE);
                productSectionItem.f152814i = jSONObject3.optString("jump_url");
                productSectionItem.f152815m = jSONObject3.optString("pid");
                productSectionItem.f152816n = jSONObject3.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
                arrayList.add(productSectionItem);
            }
        }
        return arrayList;
    }

    public final java.util.List d(org.json.JSONObject jSONObject) {
        org.json.JSONArray jSONArray = jSONObject.getJSONArray("skus");
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 0; i17 < jSONArray.length(); i17++) {
            org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(i17);
            com.tencent.mm.plugin.order.model.ProductSectionItem.Skus skus = new com.tencent.mm.plugin.order.model.ProductSectionItem.Skus();
            skus.f152817d = jSONObject2.optString("key");
            skus.f152818e = jSONObject2.optString("value");
            arrayList.add(skus);
        }
        return arrayList;
    }

    public final dp3.c e(org.json.JSONObject jSONObject) {
        org.json.JSONObject jSONObject2 = jSONObject.getJSONObject("status_section");
        if (jSONObject2 == null) {
            return null;
        }
        dp3.c cVar = new dp3.c();
        cVar.f242202a = jSONObject2.optString("last_status_name");
        cVar.f242203b = jSONObject2.optInt("time");
        cVar.f242204c = jSONObject2.optString("thumb_url");
        cVar.f242205d = jSONObject2.optString("jump_url");
        cVar.f242206e = jSONObject2.optString("last_status_desc");
        return cVar;
    }
}
