package q74;

/* loaded from: classes4.dex */
public class b0 extends a84.s0 {

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f360409b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f360410c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f360411d;

    /* renamed from: e, reason: collision with root package name */
    public final int f360412e;

    /* renamed from: f, reason: collision with root package name */
    public int f360413f;

    /* renamed from: g, reason: collision with root package name */
    public int f360414g;

    /* renamed from: h, reason: collision with root package name */
    public int f360415h;

    /* renamed from: i, reason: collision with root package name */
    public int f360416i;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f360408a = new java.util.ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public int f360417j = -1;

    public b0(int i17) {
        this.f360412e = i17;
    }

    @Override // a84.s0
    public void a(org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillBaseJsonObject", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
        try {
            jSONObject.putOpt("snsid", this.f360409b);
            jSONObject.putOpt("uxinfo", this.f360410c);
            jSONObject.putOpt("adExtInfo", this.f360411d);
            jSONObject.putOpt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, java.lang.Integer.valueOf(this.f360412e));
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillBaseJsonObject", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
    }

    @Override // a84.s0
    public void b(org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillExtJsonObject", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            jSONObject.putOpt("reportItemList", jSONArray);
            c(jSONArray);
            jSONObject.put("sliderCardStyle", this.f360414g);
            jSONObject.put("slideJumpCount", this.f360415h);
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillExtJsonObject", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
    }

    public final void c(org.json.JSONArray jSONArray) {
        org.json.JSONObject jSONObject;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillExtJsonArray", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
        java.util.List list = this.f360408a;
        if (a84.b0.b(list)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillExtJsonArray", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
            return;
        }
        java.util.Iterator it = ((java.util.ArrayList) list).iterator();
        while (it.hasNext()) {
            q74.a0 a0Var = (q74.a0) it.next();
            if (a0Var != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toJson", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData$ItemData");
                try {
                    jSONObject = new org.json.JSONObject();
                    jSONObject.putOpt(ya.b.INDEX, java.lang.Integer.valueOf(a0Var.f360388a));
                    jSONObject.putOpt("mediaType", java.lang.Integer.valueOf(a0Var.f360389b));
                    jSONObject.putOpt("hasBorder", java.lang.Integer.valueOf(a0Var.f360400m));
                    jSONObject.putOpt(dm.n.COL_EXPOSURECOUNT, java.lang.Integer.valueOf(a0Var.f360390c));
                    jSONObject.putOpt("autoSlideInCount", java.lang.Integer.valueOf(a0Var.f360391d));
                    jSONObject.putOpt("clickCount", java.lang.Integer.valueOf(a0Var.f360392e));
                    jSONObject.putOpt("btnClickCount", java.lang.Integer.valueOf(a0Var.f360393f));
                    jSONObject.putOpt("productClickCount", java.lang.Integer.valueOf(a0Var.f360401n));
                    jSONObject.putOpt("playCount", java.lang.Integer.valueOf(a0Var.f360394g));
                    jSONObject.putOpt("finishPlayCount", java.lang.Integer.valueOf(a0Var.f360395h));
                    jSONObject.putOpt("playTotalTime", java.lang.Integer.valueOf(a0Var.f360396i + a0Var.f360399l));
                    jSONObject.putOpt("maxPlayTime", java.lang.Integer.valueOf(a0Var.f360395h > 0 ? a0Var.f360398k : a0Var.f360397j));
                    jSONObject.putOpt("videoTotalTime", java.lang.Integer.valueOf(a0Var.f360398k));
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toJson", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData$ItemData");
                } catch (java.lang.Throwable unused) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toJson", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData$ItemData");
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    jSONArray.put(jSONObject);
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillExtJsonArray", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
    }

    public q74.a0 d(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemData", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
        int i18 = this.f360413f;
        if (i18 <= 4) {
            i17 %= i18;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isIdxValid", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
        java.util.List list = this.f360408a;
        boolean z17 = i17 >= 0 && i17 < ((java.util.ArrayList) list).size();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isIdxValid", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
        if (!z17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemData", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
            return null;
        }
        q74.a0 a0Var = (q74.a0) ((java.util.ArrayList) list).get(i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemData", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
        return a0Var;
    }

    public void e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSlideJumpSuccess", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
        this.f360415h++;
        com.tencent.mars.xlog.Log.i("SlideFullCardAdChannelData", "onSlideJumpSuccess, total=" + this.f360415h);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSlideJumpSuccess", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
    }

    public void f(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17, s34.a1 a1Var) {
        java.util.List<s34.x0> list;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPrimaryData", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
        if (snsInfo == null) {
            com.tencent.mars.xlog.Log.i("SlideFullCardAdChannelData", "the sns info is null!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPrimaryData", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
            return;
        }
        java.lang.String T = ca4.z0.T(snsInfo);
        if (!android.text.TextUtils.isEmpty(this.f360409b) && this.f360409b.equals(T)) {
            com.tencent.mars.xlog.Log.i("SlideFullCardAdChannelData", "the new sns id is same as the old one!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPrimaryData", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsId", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (T == null) {
            T = "";
        }
        this.f360409b = T;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsId", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
        if (snsInfo.getAdInfo(i17) != null) {
            java.lang.String uxinfo = snsInfo.getUxinfo();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setUxInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
            if (uxinfo == null) {
                uxinfo = "";
            }
            this.f360410c = uxinfo;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setUxInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
        }
        java.lang.String str = snsInfo.getAdXml().adExtInfo;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAdExtInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
        this.f360411d = str != null ? str : "";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAdExtInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
        java.util.List list2 = this.f360408a;
        ((java.util.ArrayList) list2).clear();
        if (a1Var != null && (list = a1Var.resInfoList) != null) {
            int size = list.size();
            this.f360413f = a1Var.f402564a;
            for (int i18 = 0; i18 < size; i18++) {
                int i19 = this.f360413f;
                if (i19 <= 4 && i18 == i19) {
                    break;
                }
                s34.x0 x0Var = a1Var.resInfoList.get(i18);
                q74.a0 a0Var = new q74.a0();
                a0Var.f360388a = i18;
                ((java.util.ArrayList) list2).add(a0Var);
                if (x0Var != null) {
                    a0Var.f360389b = x0Var.a() ? 2 : 1;
                    a0Var.f360400m = 0;
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(x0Var.frontBorderImage) || !com.tencent.mm.sdk.platformtools.t8.K0(x0Var.backBorderImage)) {
                        a0Var.f360400m = 1;
                    }
                }
            }
        }
        if (a1Var == null || a1Var.overSlideJumpInfo == null || !snsInfo.isSlideCardAd()) {
            this.f360414g = 0;
        } else {
            this.f360414g = 1;
        }
        this.f360416i = 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPrimaryData", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
    }

    public void g(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateItemDataClickCount", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
        q74.a0 d17 = d(i17);
        if (d17 != null) {
            d17.f360392e++;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateItemDataClickCount", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
    }

    @Override // a84.r0
    public java.lang.String getChannel() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getChannel", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getChannel", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
        return "sns_ad_slider_card_report";
    }

    public void h(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateItemDataExposure", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
        if (i17 == this.f360417j) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateItemDataExposure", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
            return;
        }
        this.f360417j = i17;
        q74.a0 d17 = d(i17);
        if (d17 != null) {
            d17.f360390c++;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateItemDataExposure", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
    }

    public void i(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateItemDataFinishPlayCount", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
        q74.a0 d17 = d(i17);
        if (d17 != null) {
            d17.f360395h++;
            d17.f360396i += d17.f360398k;
            d17.f360399l = 0;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateItemDataFinishPlayCount", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
    }

    @Override // a84.s0, a84.r0
    public java.lang.String j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContent", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
        java.lang.String j17 = super.j();
        java.util.List list = this.f360408a;
        if (list != null) {
            ((java.util.ArrayList) list).clear();
        }
        this.f360409b = "";
        this.f360415h = 0;
        this.f360414g = 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContent", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
        return j17;
    }

    public void k(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateItemDataPlayTotalTime", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
        q74.a0 d17 = d(i17);
        if (d17 != null) {
            if (i18 >= d17.f360399l) {
                d17.f360399l = i18;
            }
            if (d17.f360397j < i18) {
                d17.f360397j = i18;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateItemDataPlayTotalTime", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
    }

    public void l(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateItemDataVideoTotalTime", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
        q74.a0 d17 = d(i17);
        if (d17 != null) {
            d17.f360398k = i18;
            d17.f360396i += d17.f360399l;
            d17.f360399l = 0;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateItemDataVideoTotalTime", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
    }
}
