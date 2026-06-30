package f74;

/* loaded from: classes4.dex */
public class a implements e74.h, e74.j {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f260057a;

    public a(android.app.Activity activity) {
        this.f260057a = new java.lang.ref.WeakReference(activity);
    }

    @Override // e74.j
    public void a(int i17, java.lang.String str, java.util.List list) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResponse", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.action.TopicCardRequestAction");
        if (i17 == 0) {
            if (!android.text.TextUtils.isEmpty(str) && !a84.b0.b(list)) {
                c(str, list);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResponse", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.action.TopicCardRequestAction");
                return;
            }
        }
        com.tencent.mars.xlog.Log.w("SnsAd.TopicCardRequestAction", "the data is empty, or request failed!!! Do nothing!!");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResponse", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.action.TopicCardRequestAction");
    }

    public void b(int i17, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doRequestAction", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.action.TopicCardRequestAction");
        if (snsInfo != null && snsInfo.getAdXml() != null) {
            try {
                java.lang.String t07 = ca4.z0.t0(snsInfo.field_snsId);
                com.tencent.mm.plugin.sns.storage.ADInfo adInfo = snsInfo.getAdInfo(i17);
                java.lang.String uxinfo = (adInfo == null || !android.text.TextUtils.isEmpty(adInfo.uxInfo)) ? snsInfo.getUxinfo() : adInfo.uxInfo;
                snsInfo.getAdXml();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("makeRequestParam", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.action.TopicCardRequestAction");
                r45.a3 a3Var = new r45.a3();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("acquireActionType", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.action.TopicCardRequestAction");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("acquireActionType", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.action.TopicCardRequestAction");
                a3Var.f369690d = 3;
                a3Var.f369691e = "";
                r45.a3[] a3VarArr = {a3Var};
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeRequestParam", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.action.TopicCardRequestAction");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.action.TopicCardRequestAction");
                if (android.text.TextUtils.isEmpty(t07) || android.text.TextUtils.isEmpty(uxinfo)) {
                    com.tencent.mars.xlog.Log.w("SnsAd.TopicCardRequestAction", "are you sure input param is valid???");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.action.TopicCardRequestAction");
                } else {
                    new k64.r(t07, uxinfo, a3VarArr).K(this);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.action.TopicCardRequestAction");
                }
            } catch (java.lang.Throwable unused) {
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doRequestAction", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.action.TopicCardRequestAction");
    }

    public final void c(java.lang.String str, java.util.List list) {
        h74.c cVar;
        java.lang.ref.WeakReference weakReference;
        g74.a aVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResponseSuccess", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.action.TopicCardRequestAction");
        r45.a3 a3Var = (r45.a3) list.get(0);
        if (a3Var != null) {
            int i17 = a3Var.f369690d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("acquireActionType", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.action.TopicCardRequestAction");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("acquireActionType", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.action.TopicCardRequestAction");
            if (i17 == 3 && !android.text.TextUtils.isEmpty(a3Var.f369691e)) {
                java.lang.String str2 = a3Var.f369691e;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parseResult", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.action.TopicCardRequestAction");
                try {
                    java.lang.System.currentTimeMillis();
                    cVar = new h74.c();
                    org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
                    if (jSONObject.has("relationText")) {
                        cVar.f279507a = jSONObject.getString("relationText");
                    }
                    org.json.JSONArray optJSONArray = jSONObject.optJSONArray("finderTopicResList");
                    if (optJSONArray != null) {
                        int length = optJSONArray.length();
                        for (int i18 = 0; i18 < length; i18++) {
                            h74.b bVar = new h74.b();
                            org.json.JSONObject jSONObject2 = (org.json.JSONObject) optJSONArray.get(i18);
                            bVar.f279500a = jSONObject2.optString("avatar");
                            bVar.f279501b = jSONObject2.optString("nickname");
                            bVar.f279502c = jSONObject2.optString("tag");
                            bVar.f279503d = jSONObject2.optString("desc");
                            bVar.f279504e = jSONObject2.optString("barBgColor");
                            bVar.f279505f = jSONObject2.optString("duration");
                            org.json.JSONObject optJSONObject = jSONObject2.optJSONObject("imageInfo");
                            if (optJSONObject != null) {
                                h74.a aVar2 = new h74.a();
                                bVar.f279506g = aVar2;
                                aVar2.f279494a = optJSONObject.optString("mid", "");
                                bVar.f279506g.f279495b = optJSONObject.optString("url", "");
                                bVar.f279506g.f279496c = optJSONObject.optString("thumb");
                                bVar.f279506g.f279497d = optJSONObject.optInt("width", 0);
                                bVar.f279506g.f279498e = optJSONObject.optInt("height", 0);
                                bVar.f279506g.f279499f = optJSONObject.optInt("totalSize", 0);
                            }
                            ((java.util.ArrayList) cVar.f279508b).add(bVar);
                        }
                    }
                    java.lang.System.currentTimeMillis();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseResult", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.action.TopicCardRequestAction");
                } catch (org.json.JSONException unused) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseResult", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.action.TopicCardRequestAction");
                    cVar = null;
                }
                if (cVar != null && (weakReference = this.f260057a) != null) {
                    cVar.toString();
                    com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.RequestListenerManager a17 = com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.RequestListenerManager.a((android.app.Activity) weakReference.get());
                    if (a17 != null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("notify", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.RequestListenerManager");
                        g74.b bVar2 = a17.f163189d;
                        if (bVar2 != null) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("notify", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.ResultWeakListenerCache");
                            if (android.text.TextUtils.isEmpty(str)) {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notify", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.ResultWeakListenerCache");
                            } else {
                                java.lang.ref.WeakReference weakReference2 = (java.lang.ref.WeakReference) ((java.util.HashMap) bVar2.f269345a).get(str);
                                if (weakReference2 != null && (aVar = (g74.a) weakReference2.get()) != null) {
                                    w74.c cVar2 = (w74.c) aVar;
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResult", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardDynamicRequestHelper");
                                    try {
                                        cVar2.c(str, cVar);
                                    } catch (java.lang.Throwable unused2) {
                                        com.tencent.mars.xlog.Log.e("SnsAd.TopicCardDynamic", "the on result failed!");
                                    }
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResult", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardDynamicRequestHelper");
                                }
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notify", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.ResultWeakListenerCache");
                            }
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notify", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.RequestListenerManager");
                    }
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResponseSuccess", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.action.TopicCardRequestAction");
    }
}
