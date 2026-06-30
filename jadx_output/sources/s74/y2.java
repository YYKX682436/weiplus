package s74;

/* loaded from: classes4.dex */
public final class y2 {

    /* renamed from: a, reason: collision with root package name */
    public static final s74.y2 f404609a = new s74.y2();

    public static final java.lang.String c(org.json.JSONObject jSONObject, java.lang.String str) {
        org.json.JSONObject jSONObject2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("mergeAttr", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoMerger");
        if (jSONObject != null) {
            if (!(str == null || str.length() == 0)) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                try {
                    jSONObject2 = new org.json.JSONObject(str);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("DynamicInfoMerger", "parse json exp=" + e17);
                    jSONObject2 = null;
                }
                if (jSONObject2 == null) {
                    com.tencent.mars.xlog.Log.e("DynamicInfoMerger", "dynamicInfoJson==null");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("mergeAttr", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoMerger");
                    return str;
                }
                org.json.JSONArray optJSONArray = jSONObject.optJSONArray("layout");
                org.json.JSONArray optJSONArray2 = jSONObject.optJSONArray("animations");
                if (optJSONArray == null && optJSONArray2 == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("mergeAttr", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoMerger");
                    return str;
                }
                long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                java.util.HashMap hashMap = new java.util.HashMap();
                s74.y2 y2Var = f404609a;
                y2Var.b(jSONObject2, hashMap);
                long currentTimeMillis3 = java.lang.System.currentTimeMillis();
                y2Var.a(hashMap, optJSONArray, dm.i4.COL_ID);
                y2Var.a(hashMap, optJSONArray2, "animationId");
                com.tencent.mars.xlog.Log.i("DynamicInfoMerger", "mergeAttr, parseJSON cost=" + (currentTimeMillis2 - currentTimeMillis) + ", flattenJson cost=" + (currentTimeMillis3 - currentTimeMillis2) + ", totalCost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
                java.lang.String jSONObject3 = jSONObject2.toString();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("mergeAttr", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoMerger");
                return jSONObject3;
            }
        }
        com.tencent.mars.xlog.Log.e("DynamicInfoMerger", "param null");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("mergeAttr", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoMerger");
        return str;
    }

    public final void a(java.util.HashMap hashMap, org.json.JSONArray jSONArray, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doMerge", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoMerger");
        if (jSONArray == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doMerge", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoMerger");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        int length = jSONArray.length();
        for (int i17 = 0; i17 < length; i17++) {
            java.lang.Object obj = jSONArray.get(i17);
            if (obj instanceof org.json.JSONObject) {
                org.json.JSONObject jSONObject = (org.json.JSONObject) obj;
                java.lang.String optString = jSONObject.optString(str);
                if (optString == null || optString.length() == 0) {
                    com.tencent.mars.xlog.Log.w("DynamicInfoMerger", "id empty in attrJSON, idx=" + i17);
                } else {
                    org.json.JSONObject jSONObject2 = (org.json.JSONObject) hashMap.get(optString);
                    if (jSONObject2 != null) {
                        f404609a.d(jSONObject2, jSONObject);
                    } else {
                        com.tencent.mars.xlog.Log.w("DynamicInfoMerger", "find no targetJSON, id=" + optString);
                    }
                }
            }
        }
        com.tencent.mars.xlog.Log.w("DynamicInfoMerger", "doMerge, key=" + str + ", cost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doMerge", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoMerger");
    }

    public final void b(org.json.JSONObject jSONObject, java.util.HashMap hashMap) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("flattenJSONData", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoMerger");
        if (jSONObject == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("flattenJSONData", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoMerger");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getIdValue", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoMerger");
        java.lang.String optString = jSONObject.optString(dm.i4.COL_ID);
        boolean z17 = true;
        if (optString == null || optString.length() == 0) {
            optString = jSONObject.optString("animationId");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getIdValue", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoMerger");
        if (optString != null && optString.length() != 0) {
            z17 = false;
        }
        if (!z17) {
            hashMap.put(optString, jSONObject);
        }
        java.util.Iterator<java.lang.String> keys = jSONObject.keys();
        kotlin.jvm.internal.o.f(keys, "keys(...)");
        while (keys.hasNext()) {
            java.lang.Object opt = jSONObject.opt(keys.next());
            if (opt instanceof org.json.JSONObject) {
                b((org.json.JSONObject) opt, hashMap);
            } else if (opt instanceof org.json.JSONArray) {
                org.json.JSONArray jSONArray = (org.json.JSONArray) opt;
                int length = jSONArray.length();
                for (int i17 = 0; i17 < length; i17++) {
                    java.lang.Object obj = jSONArray.get(i17);
                    if (obj instanceof org.json.JSONObject) {
                        b((org.json.JSONObject) obj, hashMap);
                    }
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("flattenJSONData", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoMerger");
    }

    public final void d(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("mergeJsonObject", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoMerger");
        if (jSONObject == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("mergeJsonObject", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoMerger");
            return;
        }
        if (jSONObject2 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("mergeJsonObject", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoMerger");
            return;
        }
        java.util.Iterator<java.lang.String> keys = jSONObject2.keys();
        kotlin.jvm.internal.o.f(keys, "keys(...)");
        while (keys.hasNext()) {
            java.lang.String next = keys.next();
            if (!kotlin.jvm.internal.o.b(next, dm.i4.COL_ID) && !kotlin.jvm.internal.o.b(next, "animationId")) {
                jSONObject.put(next, jSONObject2.opt(next));
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("mergeJsonObject", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoMerger");
    }
}
