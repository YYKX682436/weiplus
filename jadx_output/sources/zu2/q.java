package zu2;

/* loaded from: classes8.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final r45.i33 f475731a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f475732b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f475733c;

    /* renamed from: d, reason: collision with root package name */
    public long f475734d;

    /* renamed from: e, reason: collision with root package name */
    public long f475735e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f475736f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f475737g;

    /* renamed from: h, reason: collision with root package name */
    public final org.json.JSONArray f475738h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.HashMap f475739i;

    public q(android.app.Activity context, r45.i33 wxaAdInfo) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(wxaAdInfo, "wxaAdInfo");
        this.f475731a = wxaAdInfo;
        this.f475732b = "Finder.WxaAdUIC";
        this.f475736f = kz5.c0.i("dismatch", "duplicate", "quality");
        this.f475737g = "good";
        this.f475738h = new org.json.JSONArray();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("follow", 2008);
        hashMap.put("like", java.lang.Integer.valueOf(com.tencent.rtmp.TXLiveConstants.PLAY_EVT_CHANGE_RESOLUTION));
        hashMap.put("double_like", java.lang.Integer.valueOf(com.tencent.rtmp.TXLiveConstants.PLAY_EVT_RCV_FIRST_AUDIO_FRAME));
        hashMap.put("big_btn_click", 2025);
        hashMap.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_COMMENT, java.lang.Integer.valueOf(com.tencent.rtmp.TXLiveConstants.PLAY_EVT_GET_PLAYINFO_SUCC));
        hashMap.put("headimage", java.lang.Integer.valueOf(com.tencent.rtmp.TXLiveConstants.PLAY_EVT_CHANGE_ROTATION));
        hashMap.put("nickname", java.lang.Integer.valueOf(com.tencent.rtmp.TXLiveConstants.PLAY_EVT_GET_MESSAGE));
        hashMap.put("forward", java.lang.Integer.valueOf(com.tencent.rtmp.TXLiveConstants.PLAY_EVT_VOD_PLAY_PREPARED));
        this.f475739i = hashMap;
    }

    public final void a() {
        this.f475733c = true;
        this.f475734d = c01.id.c();
    }

    public final void b(int i17) {
        java.lang.String str = this.f475732b;
        com.tencent.mars.xlog.Log.i(str, "reportFeedback");
        if (i17 >= 0) {
            java.util.List list = this.f475736f;
            if (i17 < list.size()) {
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("type", list.get(i17));
                    jSONObject.put("expTime", this.f475735e);
                    jSONObject.put("isClickAd", this.f475733c ? 1 : 0);
                    jSONObject.put("clickAdTimeMs", this.f475734d);
                    jSONObject.put("feedbackTimeMs", c01.id.c());
                    this.f475738h.put(jSONObject);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace(str, th6, "reportFeedback", new java.lang.Object[0]);
                }
            }
        }
    }

    public final void c() {
        java.lang.String str = this.f475732b;
        com.tencent.mars.xlog.Log.i(str, "reportFeedback");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("type", this.f475737g);
            jSONObject.put("expTime", this.f475735e);
            jSONObject.put("isClickAd", this.f475733c ? 1 : 0);
            jSONObject.put("clickAdTimeMs", this.f475734d);
            jSONObject.put("feedbackTimeMs", c01.id.c());
            this.f475738h.put(jSONObject);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace(str, th6, "reportFeedbackGood", new java.lang.Object[0]);
        }
    }

    public final void d(java.lang.String str) {
        r45.i33 i33Var = this.f475731a;
        java.lang.String str2 = this.f475732b;
        try {
            java.lang.Object obj = this.f475739i.get(str);
            if (obj == null) {
                obj = -1;
            }
            int intValue = ((java.lang.Number) obj).intValue();
            java.lang.String string = i33Var.getString(5);
            if (string == null) {
                string = "";
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject(string);
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("weapp_extra_data");
            if (optJSONObject == null) {
                optJSONObject = new org.json.JSONObject();
            }
            jSONObject.put("report_type", 2);
            jSONObject.put("report_link", i33Var.getString(4));
            jSONObject.put("press_interval", 0);
            jSONObject.put("click_pos", intValue);
            jSONObject.put("pos_x", 0);
            jSONObject.put("pos_y", 0);
            optJSONObject.put("exp_time", this.f475735e);
            optJSONObject.put("clk_time", c01.id.c());
            jSONObject.put("weapp_extra_data", optJSONObject.toString());
            com.tencent.mars.xlog.Log.i(str2, "reportNormalAction source=" + str + " clickPos=" + intValue);
            if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.K().r()).booleanValue()) {
                java.lang.String jSONObject2 = jSONObject.toString();
                kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                new db2.m2(1, jSONObject2, null).l();
            } else {
                java.lang.String jSONObject3 = jSONObject.toString();
                kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
                gm0.j1.d().g(new db2.w5(1, jSONObject3));
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace(str2, th6, "reportNormalAction " + str, new java.lang.Object[0]);
        }
    }
}
