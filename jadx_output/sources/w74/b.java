package w74;

/* loaded from: classes4.dex */
public class b extends a84.s0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f443517a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f443518b;

    /* renamed from: c, reason: collision with root package name */
    public final int f443519c;

    /* renamed from: d, reason: collision with root package name */
    public int f443520d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f443521e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public int f443522f = -1;

    public b(int i17) {
        this.f443519c = i17;
    }

    @Override // a84.s0
    public void a(org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillBaseJsonObject", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
        try {
            jSONObject.putOpt("snsid", this.f443517a);
            jSONObject.putOpt("uxinfo", this.f443518b);
            jSONObject.putOpt("adExtInfo", null);
            jSONObject.putOpt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, java.lang.Integer.valueOf(this.f443519c));
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillBaseJsonObject", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
    }

    @Override // a84.s0
    public void b(org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillExtJsonObject", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
        try {
            jSONObject.putOpt("infoBarClickCount", java.lang.Integer.valueOf(this.f443520d));
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            jSONObject.putOpt("reportItemList", jSONArray);
            c(jSONArray);
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillExtJsonObject", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
    }

    public final void c(org.json.JSONArray jSONArray) {
        org.json.JSONObject jSONObject;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillExtJsonArray", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
        java.util.List list = this.f443521e;
        if (a84.b0.b(list)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillExtJsonArray", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
            return;
        }
        java.util.Iterator it = ((java.util.ArrayList) list).iterator();
        while (it.hasNext()) {
            w74.a aVar = (w74.a) it.next();
            if (aVar != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toJson", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData$ItemData");
                try {
                    jSONObject = new org.json.JSONObject();
                    jSONObject.putOpt(ya.b.INDEX, java.lang.Integer.valueOf(aVar.f443506a));
                    jSONObject.putOpt("mediaType", java.lang.Integer.valueOf(aVar.f443507b));
                    java.lang.String str = aVar.f443515j;
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    if (str == null) {
                        str = "";
                    }
                    jSONObject.putOpt("finderType", str);
                    jSONObject.putOpt(dm.n.COL_EXPOSURECOUNT, java.lang.Integer.valueOf(aVar.f443508c));
                    jSONObject.putOpt("clickCount", java.lang.Integer.valueOf(aVar.f443509d));
                    jSONObject.putOpt("playCount", java.lang.Integer.valueOf(aVar.f443510e));
                    jSONObject.putOpt("finishPlayCount", java.lang.Integer.valueOf(aVar.f443511f));
                    jSONObject.putOpt("playTotalTime", java.lang.Integer.valueOf(aVar.f443512g + aVar.f443516k));
                    jSONObject.putOpt("maxPlayTime", java.lang.Integer.valueOf(aVar.f443511f > 0 ? aVar.f443514i : aVar.f443513h));
                    jSONObject.putOpt("videoTotalTime", java.lang.Integer.valueOf(aVar.f443514i));
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toJson", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData$ItemData");
                } catch (java.lang.Throwable unused) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toJson", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData$ItemData");
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    jSONArray.put(jSONObject);
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillExtJsonArray", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
    }

    public w74.a d(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemData", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isIdxValid", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
        java.util.List list = this.f443521e;
        boolean z17 = i17 >= 0 && i17 < ((java.util.ArrayList) list).size();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isIdxValid", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
        if (!z17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemData", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
            return null;
        }
        w74.a aVar = (w74.a) ((java.util.ArrayList) list).get(i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemData", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
        return aVar;
    }

    public void e(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17, s34.h0 h0Var) {
        java.util.List list;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPrimaryData", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
        if (snsInfo == null) {
            com.tencent.mars.xlog.Log.i("SnsAd.AdChannelData", "the sns info is null!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPrimaryData", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
            return;
        }
        java.lang.String T = ca4.z0.T(snsInfo);
        if (!android.text.TextUtils.isEmpty(this.f443517a) && this.f443517a.equals(T)) {
            com.tencent.mars.xlog.Log.i("SnsAd.AdChannelData", "the new sns id is same as the old one!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPrimaryData", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsId", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (T == null) {
            T = "";
        }
        this.f443517a = T;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsId", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
        if (snsInfo.getAdInfo(i17) != null) {
            java.lang.String uxinfo = snsInfo.getUxinfo();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setUxInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
            if (uxinfo == null) {
                uxinfo = "";
            }
            this.f443518b = uxinfo;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setUxInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
        }
        java.util.List list2 = this.f443521e;
        ((java.util.ArrayList) list2).clear();
        if (h0Var != null && (list = h0Var.f402656f) != null) {
            int size = ((java.util.ArrayList) list).size();
            for (int i18 = 0; i18 < size; i18++) {
                s34.i0 i0Var = (s34.i0) ((java.util.ArrayList) h0Var.f402656f).get(i18);
                w74.a aVar = new w74.a();
                aVar.f443506a = i18;
                ((java.util.ArrayList) list2).add(aVar);
                if (i0Var != null) {
                    aVar.f443507b = i0Var.a() ? 2 : 1;
                    java.lang.String str = i0Var.f402668j;
                    if (str == null) {
                        str = "";
                    }
                    aVar.f443515j = str;
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPrimaryData", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
    }

    public void f(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateItemDataVideoTotalTime", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
        w74.a d17 = d(i17);
        if (d17 != null) {
            d17.f443514i = i18;
            d17.f443512g += d17.f443516k;
            d17.f443516k = 0;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateItemDataVideoTotalTime", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
    }

    @Override // a84.r0
    public java.lang.String getChannel() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getChannel", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getChannel", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
        return "sns_ad_finder_topic_report";
    }

    @Override // a84.s0, a84.r0
    public java.lang.String j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContent", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
        java.lang.String j17 = super.j();
        java.util.List list = this.f443521e;
        if (list != null) {
            ((java.util.ArrayList) list).clear();
        }
        this.f443517a = "";
        this.f443520d = 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContent", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
        return j17;
    }
}
