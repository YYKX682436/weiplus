package xx;

/* loaded from: classes14.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public long f457828a;

    /* renamed from: b, reason: collision with root package name */
    public long f457829b;

    /* renamed from: c, reason: collision with root package name */
    public long f457830c;

    /* renamed from: d, reason: collision with root package name */
    public long f457831d;

    /* renamed from: e, reason: collision with root package name */
    public long f457832e;

    /* renamed from: h, reason: collision with root package name */
    public long f457835h;

    /* renamed from: i, reason: collision with root package name */
    public int f457836i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f457837j;

    /* renamed from: k, reason: collision with root package name */
    public com.tencent.wechat.aff.chatbot.d0 f457838k;

    /* renamed from: l, reason: collision with root package name */
    public com.tencent.wechat.aff.chatbot.w1 f457839l;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f457833f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f457834g = "";

    /* renamed from: m, reason: collision with root package name */
    public final xx.z f457840m = new xx.z(0, 0, 0, 0, 0, 0, 0, 127, null);

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f457841n = "";

    /* renamed from: o, reason: collision with root package name */
    public xx.g f457842o = xx.g.f457790e;

    public static /* synthetic */ java.util.Map b(xx.y yVar, boolean z17, yz5.l lVar, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = true;
        }
        if ((i17 & 2) != 0) {
            lVar = xx.h.f457794d;
        }
        return yVar.a(z17, lVar);
    }

    public final java.util.Map a(boolean z17, yz5.l apply) {
        com.tencent.wechat.aff.chatbot.v1 b17;
        kotlin.jvm.internal.o.g(apply, "apply");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        com.tencent.wechat.aff.chatbot.w1 w1Var = this.f457839l;
        if (w1Var != null && (b17 = w1Var.b()) != null) {
            linkedHashMap.put("bizuin", java.lang.Long.valueOf(this.f457835h));
            boolean[] zArr = b17.f216494i;
            java.lang.String str = zArr[3] ? b17.f216491f : "";
            kotlin.jvm.internal.o.f(str, "getBizUsername(...)");
            linkedHashMap.put("bizusername", str);
            java.lang.String str2 = zArr[4] ? b17.f216492g : "";
            kotlin.jvm.internal.o.f(str2, "getBizNickname(...)");
            linkedHashMap.put("biznickname", str2);
            linkedHashMap.put("enter_ai_scene", java.lang.Integer.valueOf((zArr[2] ? b17.f216490e : com.tencent.wechat.aff.chatbot.u1.PREVIED).f216482d));
            linkedHashMap.put("enter_sessionid", this.f457834g);
            com.tencent.wechat.aff.chatbot.d0 d0Var = this.f457838k;
            java.lang.String b18 = d0Var != null ? d0Var.b() : null;
            linkedHashMap.put("ai_clone_id", b18 != null ? b18 : "");
            if (z17) {
                linkedHashMap.put("speak_session_id", this.f457833f);
            }
            long j17 = this.f457832e;
            if (j17 != 0) {
                linkedHashMap.put("room_id", java.lang.String.valueOf(j17));
            }
        }
        apply.invoke(linkedHashMap);
        com.tencent.mars.xlog.Log.i("ChatBotBrandDataReporter", "getReportCommonData:" + linkedHashMap);
        return linkedHashMap;
    }

    public final void c(xx.c endType) {
        kotlin.jvm.internal.o.g(endType, "endType");
        if (this.f457837j) {
            com.tencent.mars.xlog.Log.i("ChatBotBrandDataReporter", "reportAILoadingEnd:" + endType);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("ai_voice_chat_loading_end", b(this, false, new xx.i(this, endType), 1, null), 36708);
        }
    }

    public final void d() {
        com.tencent.mars.xlog.Log.i("ChatBotBrandDataReporter", "reportAISpeakBegin");
        this.f457831d = c01.id.a();
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("ai_voice_chat_model_speak_start", a(this.f457837j, new xx.j(this)), 36708);
    }

    public final void e(xx.e aiSpeakEndType) {
        kotlin.jvm.internal.o.g(aiSpeakEndType, "aiSpeakEndType");
        com.tencent.mars.xlog.Log.i("ChatBotBrandDataReporter", "reportAISpeakEnd:" + aiSpeakEndType);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("ai_voice_chat_model_speak_end", a(this.f457837j, new xx.l(this, aiSpeakEndType)), 36708);
    }

    public final void f(xx.e aiSpeakEndType, boolean z17, java.lang.String traceId) {
        kotlin.jvm.internal.o.g(aiSpeakEndType, "aiSpeakEndType");
        kotlin.jvm.internal.o.g(traceId, "traceId");
        com.tencent.mars.xlog.Log.i("ChatBotBrandDataReporter", "reportAISpeakEnd:" + aiSpeakEndType);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("ai_voice_chat_model_speak_end", a(this.f457837j, new xx.m(this, aiSpeakEndType, z17, traceId)), 36708);
    }

    public final void g(int i17) {
        com.tencent.mars.xlog.Log.i("ChatBotBrandDataReporter", "reportGreenMicCancelWithWordCnt");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("ai_voice_click_green_mic_cancel", a(this.f457837j, new xx.q(this, i17)), 36708);
    }

    public final void h(int i17, xx.d reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        com.tencent.mars.xlog.Log.i("ChatBotBrandDataReporter", "reportGreenMicEndWithWordCnt");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("ai_voice_end_voice_input", a(this.f457837j, new xx.r(this, i17, reason)), 36708);
    }

    public final void i(long j17) {
        com.tencent.mars.xlog.Log.i("ChatBotBrandDataReporter", "reportUserJoinRoom");
        this.f457832e = j17;
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("human_enter_voice_chat", a(false, new xx.t(this)), 36708);
    }

    public final void j(android.view.View backBtn) {
        kotlin.jvm.internal.o.g(backBtn, "backBtn");
        dy1.a.i(backBtn, "ai_voice_chat_close_button");
        dy1.a.k(backBtn, b(this, false, null, 2, null));
        dy1.a.l(backBtn, 8, 36708);
        dy1.a.a(backBtn, new xx.w(this));
    }

    public final void k(android.app.Activity activity, com.tencent.wechat.aff.chatbot.d0 d0Var, com.tencent.wechat.aff.chatbot.w1 w1Var, xx.g roomType) {
        com.tencent.wechat.aff.chatbot.v1 b17;
        kotlin.jvm.internal.o.g(roomType, "roomType");
        this.f457838k = d0Var;
        this.f457842o = roomType;
        this.f457839l = w1Var;
        this.f457828a = c01.id.a();
        if (w1Var != null && (b17 = w1Var.b()) != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            boolean[] zArr = b17.f216494i;
            java.lang.String str = zArr[3] ? b17.f216491f : "";
            if (str == null) {
                str = "";
            }
            sb6.append(str);
            sb6.append('_');
            sb6.append(this.f457828a);
            this.f457834g = sb6.toString();
            try {
                java.lang.String str2 = zArr[5] ? b17.f216493h : "";
                kotlin.jvm.internal.o.f(str2, "getStringBizuin(...)");
                byte[] decode = android.util.Base64.decode(str2, 0);
                if (decode != null) {
                    str2 = new java.lang.String(decode, r26.c.f368865a);
                }
                this.f457835h = java.lang.Long.parseLong(r26.n0.u0(str2).toString());
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("ChatBotBrandDataReporter", e17.getMessage(), e17);
            }
        }
        com.tencent.mars.xlog.Log.i("ChatBotBrandDataReporter", "setBrandDataReportPage reportAiChatExtInfo：");
        if (activity != null) {
            dy1.a.f(activity, iy1.c.BizAiVoiceChat);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).dk(activity, "biz_ai_voice_chat");
            dy1.a.h(activity, 12, 36708);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).gk(activity, b(this, false, null, 2, null));
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(activity, new xx.x(this, roomType));
        }
    }
}
