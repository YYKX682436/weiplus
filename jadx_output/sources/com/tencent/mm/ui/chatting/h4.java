package com.tencent.mm.ui.chatting;

/* loaded from: classes12.dex */
public class h4 implements com.tencent.mm.pluginsdk.ui.chat.k5 {

    /* renamed from: w, reason: collision with root package name */
    public static boolean f201635w = true;

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.chat.ChatFooter f201636a;

    /* renamed from: b, reason: collision with root package name */
    public bm5.x0 f201637b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f201638c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.storage.z3 f201639d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f201640e;

    /* renamed from: f, reason: collision with root package name */
    public final bm5.x0 f201641f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f201642g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f201643h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f201644i;

    /* renamed from: j, reason: collision with root package name */
    public final yb5.d f201645j;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f201646k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f201647l = "";

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.modelbase.e1 f201648m = new com.tencent.mm.ui.chatting.m4(this);

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.modelbase.f1 f201649n = new com.tencent.mm.ui.chatting.n4(this);

    /* renamed from: o, reason: collision with root package name */
    public volatile boolean f201650o = false;

    /* renamed from: p, reason: collision with root package name */
    public volatile boolean f201651p = false;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.Object f201652q = new java.lang.Object();

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f201653r = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.ui.chatting.p4(this), true);

    /* renamed from: s, reason: collision with root package name */
    public boolean f201654s = false;

    /* renamed from: t, reason: collision with root package name */
    public int f201655t = 0;

    /* renamed from: u, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f201656u = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.ui.chatting.q4(this), true);

    /* renamed from: v, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.chat.u f201657v;

    public h4(yb5.d dVar, com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter, java.lang.String str) {
        this.f201646k = "";
        com.tencent.mm.ui.chatting.s4 s4Var = new com.tencent.mm.ui.chatting.s4(this);
        this.f201657v = s4Var;
        this.f201645j = dVar;
        this.f201636a = chatFooter;
        this.f201638c = str;
        this.f201639d = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(str, true);
        boolean R4 = com.tencent.mm.storage.z3.R4(dVar.x());
        this.f201642g = R4;
        this.f201643h = R4;
        this.f201641f = new bm5.x0(new bm5.w0() { // from class: com.tencent.mm.ui.chatting.h4$$a
            @Override // bm5.w0
            public final java.lang.Object a() {
                return (android.os.Vibrator) com.tencent.mm.ui.chatting.h4.this.f201645j.g().getSystemService("vibrator");
            }
        });
        this.f201637b = new bm5.x0(new bm5.w0() { // from class: com.tencent.mm.ui.chatting.h4$$c
            @Override // bm5.w0
            public final java.lang.Object a() {
                com.tencent.mm.modelbase.g1 p0Var;
                com.tencent.mm.ui.chatting.h4 h4Var = com.tencent.mm.ui.chatting.h4.this;
                if (com.tencent.mm.storage.z3.I4(h4Var.f201638c)) {
                    p0Var = new zf4.w();
                    com.tencent.mars.xlog.Log.i("MicroMsg.ChattingFooterEventImpl", "initRecorder new VoiceRemindRecorder().");
                } else {
                    p0Var = new tl.p0(h4Var.f201645j.g(), false);
                    com.tencent.mars.xlog.Log.i("MicroMsg.ChattingFooterEventImpl", "initRecorder new SceneVoiceRecorder, not use Speex");
                }
                p0Var.h(h4Var.f201649n);
                p0Var.b(h4Var.f201648m);
                return p0Var;
            }
        });
        chatFooter.setAppPanelListener(s4Var);
        ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_jump_to_record_media, true);
        this.f201646k = (java.lang.String) c01.d9.b().p().l(2, null);
    }

    public static com.tencent.mm.ui.chatting.a5 H(org.json.JSONObject jSONObject, java.lang.String str) {
        if (jSONObject == null || !jSONObject.has("wording")) {
            return null;
        }
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("wording");
        if (!optJSONObject.has(str)) {
            return null;
        }
        com.tencent.mm.ui.chatting.a5 a5Var = new com.tencent.mm.ui.chatting.a5();
        org.json.JSONObject optJSONObject2 = optJSONObject.optJSONObject(str);
        a5Var.f198363a = optJSONObject2.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        a5Var.f198364b = optJSONObject2.optString("desc");
        return a5Var;
    }

    public static com.tencent.mm.ui.chatting.a5 J(com.tencent.mm.ui.chatting.b5 b5Var) {
        if (b5Var == null) {
            return null;
        }
        java.lang.String d17 = com.tencent.mm.sdk.platformtools.m2.d();
        return "zh_CN".equals(d17) ? b5Var.f198487b : "zh_TW".equals(d17) ? b5Var.f198489d : "zh_HK".equals(d17) ? b5Var.f198488c : b5Var.f198490e;
    }

    public static boolean M(java.lang.String str) {
        java.lang.Integer num;
        boolean z17;
        ((pg0.s3) ((qg0.h0) i95.n0.c(qg0.h0.class))).getClass();
        java.util.HashMap hashMap = com.tencent.mm.plugin.luckymoney.model.m5.f145452a;
        if (c01.e2.S(str)) {
            num = (java.lang.Integer) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERINFO_LUCKY_MONEY_NEWYEAR_UNION_SWITCH_INT_SYNC, 0);
        } else {
            ((pg0.s3) ((qg0.h0) i95.n0.c(qg0.h0.class))).getClass();
            num = com.tencent.mm.plugin.luckymoney.model.m5.s() ? (java.lang.Integer) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERINFO_LUCKY_MONEY_HK_NEWYEAR_SWITCH_INT_SYNC, 0) : (java.lang.Integer) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERINFO_LUCKY_MONEY_NEWYEAR_SWITCH_INT_SYNC, 0);
        }
        java.lang.Integer num2 = (java.lang.Integer) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERINFO_LUCKY_MONEY_NEWYEAR_LOCAL_SWITCH_INT, 0);
        if (!(c01.z1.m() == 0)) {
            ((pg0.s3) ((qg0.h0) i95.n0.c(qg0.h0.class))).getClass();
            if (!com.tencent.mm.plugin.luckymoney.model.m5.s()) {
                z17 = false;
                return (num.intValue() != 1 || num2.intValue() == 1) || !z17;
            }
        }
        z17 = true;
        if (num.intValue() != 1 || num2.intValue() == 1) {
        }
    }

    public static void O(int i17, int i18, java.lang.String str) {
        com.tencent.mm.autogen.mmdata.rpt.ChatHbClickStruct chatHbClickStruct = new com.tencent.mm.autogen.mmdata.rpt.ChatHbClickStruct();
        chatHbClickStruct.f55622d = i17;
        chatHbClickStruct.f55625g = java.lang.System.currentTimeMillis();
        chatHbClickStruct.f55623e = chatHbClickStruct.b("SessionId", str, true);
        chatHbClickStruct.f55624f = i18;
        chatHbClickStruct.k();
    }

    public static void u(com.tencent.mm.ui.chatting.h4 h4Var, java.lang.String str, boolean z17) {
        h4Var.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("redenvelope_entry_has_reddot", java.lang.Boolean.valueOf(z17));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("redenvelope_entry_actionsheet_hb", str, hashMap, 34068);
    }

    public static void v(com.tencent.mm.ui.chatting.h4 h4Var, java.lang.String str) {
        h4Var.getClass();
        android.content.Intent intent = new android.content.Intent();
        int wi6 = ((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(h4Var.I());
        intent.putExtra("key_way", 1);
        intent.putExtra("key_chatroom_num", wi6);
        intent.putExtra("key_type", 1);
        intent.putExtra("key_from", 1);
        intent.putExtra("key_username", h4Var.I());
        intent.putExtra("key_session_id", str);
        intent.putExtra("pay_channel", 14);
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        yb5.d dVar = h4Var.f201645j;
        g0Var.d(25925, 2, 3, java.lang.Float.valueOf(i65.a.q(dVar.g())), 0, 0);
        ((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).bj();
        j45.l.j(dVar.g(), "luckymoney", ".ui.LuckyMoneyNewPrepareUI", intent, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0106 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void w(com.tencent.mm.ui.chatting.h4 r23) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.h4.w(com.tencent.mm.ui.chatting.h4):void");
    }

    public static void x(com.tencent.mm.ui.chatting.h4 h4Var) {
        h4Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingFooterEventImpl", "do get config");
        java.lang.String I = h4Var.I();
        qg0.h0 h0Var = (qg0.h0) i95.n0.c(qg0.h0.class);
        java.lang.String I2 = h4Var.I();
        ((pg0.s3) h0Var).getClass();
        java.util.HashMap hashMap = com.tencent.mm.plugin.luckymoney.model.m5.f145452a;
        boolean S = c01.e2.S(I2);
        int i17 = 0;
        if (S) {
            int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_LUCKY_MONEY_ENVELOPE_HAS_SOURCE_INT_SYNC, 0)).intValue();
            ((pg0.a3) ((qg0.b0) i95.n0.c(qg0.b0.class))).getClass();
            gm0.j1.d().g(new com.tencent.mm.plugin.luckymoney.model.y5("v1.0", intValue, I));
            return;
        }
        ((pg0.s3) ((qg0.h0) i95.n0.c(qg0.h0.class))).getClass();
        if (com.tencent.mm.plugin.luckymoney.model.m5.s()) {
            ((pg0.a3) ((qg0.b0) i95.n0.c(qg0.b0.class))).getClass();
            gm0.j1.d().g(new yb3.f(I));
            return;
        }
        int intValue2 = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_LUCKY_MONEY_ENVELOPE_HAS_SOURCE_INT_SYNC, 0)).intValue();
        boolean R4 = com.tencent.mm.storage.z3.R4(I);
        yb5.d dVar = h4Var.f201645j;
        if (R4) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(25925, 2, 3, java.lang.Float.valueOf(i65.a.q(dVar.g())), 0, 0);
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(25925, 1, 1, java.lang.Float.valueOf(i65.a.q(dVar.g())), 0, 0);
            i17 = 25;
        }
        ((pg0.a3) ((qg0.b0) i95.n0.c(qg0.b0.class))).getClass();
        gm0.j1.d().g(new com.tencent.mm.plugin.luckymoney.model.x5(i17, "v1.0", intValue2, I));
    }

    public static void y(com.tencent.mm.ui.chatting.h4 h4Var, java.lang.String str) {
        h4Var.getClass();
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.d(11701, 1, 0, 0, 1, 1);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_way", 0);
        intent.putExtra("key_type", 0);
        intent.putExtra("key_from", 1);
        intent.putExtra("key_username", h4Var.I());
        intent.putExtra("key_session_id", str);
        intent.putExtra("pay_channel", 11);
        yb5.d dVar = h4Var.f201645j;
        g0Var.d(25925, 1, 1, java.lang.Float.valueOf(i65.a.q(dVar.g())), 0, 0);
        ((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).bj();
        j45.l.j(dVar.g(), "luckymoney", ".ui.LuckyMoneyNewPrepareUI", intent, null);
    }

    public void A() {
        boolean z17;
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        yb5.d dVar = this.f201645j;
        android.app.Activity g17 = dVar.g();
        ((sb0.f) jVar).getClass();
        boolean a17 = j35.u.a(g17, "android.permission.CAMERA", 22, "", "");
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(a17);
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingFooterEventImpl", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", valueOf, new com.tencent.mm.sdk.platformtools.z3(), dVar.g());
        if (a17) {
            tb0.j jVar2 = (tb0.j) i95.n0.c(tb0.j.class);
            android.app.Activity g18 = dVar.g();
            ((sb0.f) jVar2).getClass();
            boolean a18 = j35.u.a(g18, "android.permission.RECORD_AUDIO", 22, "", "");
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingFooterEventImpl", "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]", java.lang.Boolean.valueOf(a18), new com.tencent.mm.sdk.platformtools.z3(), dVar.g());
            if (a18) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingFooterEventImpl", "onEnterMultiTalk");
                android.content.Intent intent = new android.content.Intent();
                if (((va3.z0) q21.d.a()).f(I())) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ChattingFooterEventImpl", "onEnterMultiTalk, but now is in share location!");
                    dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.f492321g16, 0).show();
                    return;
                }
                if (I() != null) {
                    java.util.List P6 = ((com.tencent.mm.plugin.multitalk.model.y) i95.n0.c(com.tencent.mm.plugin.multitalk.model.y.class)).P6(I());
                    java.lang.String str = (java.lang.String) c01.d9.b().p().l(2, null);
                    boolean q47 = ((com.tencent.mm.plugin.multitalk.model.y) i95.n0.c(com.tencent.mm.plugin.multitalk.model.y.class)).q4(I());
                    java.util.Iterator it = P6.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z17 = false;
                            break;
                        }
                        java.lang.String str2 = (java.lang.String) it.next();
                        if (str != null && str.equals(str2)) {
                            z17 = true;
                            break;
                        }
                    }
                    if (P6.size() >= zj3.j.e() && !z17) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingFooterEventImpl", "onEnterMultiTalk, but > max 9 members!");
                        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                        dp.a.makeText(context, context.getString(com.tencent.mm.R.string.f492592h26, zj3.j.e() + ""), 0).show();
                        return;
                    }
                    if (z17) {
                        if (((com.tencent.mm.plugin.multitalk.model.y) i95.n0.c(com.tencent.mm.plugin.multitalk.model.y.class)).y8()) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingFooterEventImpl", "onEnterMultiTalk, but already in it!");
                            android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                            dp.a.makeText(context2, context2.getString(com.tencent.mm.R.string.h1r), 0).show();
                            return;
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingFooterEventImpl", "onEnterMultiTalk, already inlist, but in fact not multitalking now!");
                    }
                    if (((com.tencent.mm.plugin.multitalk.model.y) i95.n0.c(com.tencent.mm.plugin.multitalk.model.y.class)).ff()) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingFooterEventImpl", "onEnterMultiTalk, but already in VoIP or multitalk!");
                        android.content.Context context3 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                        dp.a.makeText(context3, context3.getString(com.tencent.mm.R.string.h1r), 0).show();
                        return;
                    } else {
                        if (iq.b.e(dVar.g())) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingFooterEventImpl", "onEnterMultiTalk, but already in appbrand voice!");
                            return;
                        }
                        iq.b.s(dVar.g());
                        if (iq.b.m(dVar.g(), true, null) || iq.b.n(dVar.g(), true) || iq.b.q(dVar.g(), true)) {
                            return;
                        }
                        if (q47) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingFooterEventImpl", "onEnterMultiTalk, but this group already in multitalk, alter take in or not tips!");
                            db5.e1.A(dVar.g(), dVar.s().getString(com.tencent.mm.R.string.h38), "", dVar.s().getString(com.tencent.mm.R.string.h1_), dVar.s().getString(com.tencent.mm.R.string.f492585h16), new com.tencent.mm.ui.chatting.k4(this), null);
                            return;
                        }
                    }
                }
                intent.putExtra("chatroomName", I());
                intent.putExtra("key_need_gallery", true);
                intent.putExtra("titile", dVar.s().getString(com.tencent.mm.R.string.h2w));
                j45.l.j(dVar.g(), "multitalk", ".ui.MultiTalkSelectContactUI", intent, null);
                com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f201636a;
                if (chatFooter.K0()) {
                    chatFooter.setBottomPanelVisibility(8);
                }
            }
        }
    }

    public void B() {
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        yb5.d dVar = this.f201645j;
        android.app.Activity g17 = dVar.g();
        ((sb0.f) jVar).getClass();
        boolean a17 = j35.u.a(g17, "android.permission.RECORD_AUDIO", 83, "", "");
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(a17);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingFooterEventImpl", "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]", valueOf, new com.tencent.mm.sdk.platformtools.z3(), dVar.g());
        if (a17) {
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f201636a;
            if (chatFooter.K0()) {
                chatFooter.setBottomPanelVisibility(8);
            }
            com.tencent.mm.autogen.events.VoipEvent voipEvent = new com.tencent.mm.autogen.events.VoipEvent();
            am.y00 y00Var = voipEvent.f54945g;
            y00Var.f8415b = 5;
            y00Var.f8418e = I();
            y00Var.f8417d = dVar.g();
            y00Var.f8419f = 3;
            voipEvent.e();
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11033, 4, 2, 0);
        }
    }

    public void C() {
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        yb5.d dVar = this.f201645j;
        android.app.Activity g17 = dVar.g();
        ((sb0.f) jVar).getClass();
        boolean a17 = j35.u.a(g17, "android.permission.CAMERA", 21, "", "");
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(a17);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingFooterEventImpl", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", valueOf, new com.tencent.mm.sdk.platformtools.z3(), dVar.g());
        if (a17) {
            tb0.j jVar2 = (tb0.j) i95.n0.c(tb0.j.class);
            android.app.Activity g18 = dVar.g();
            ((sb0.f) jVar2).getClass();
            boolean a18 = j35.u.a(g18, "android.permission.RECORD_AUDIO", 21, "", "");
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingFooterEventImpl", "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]", java.lang.Boolean.valueOf(a18), new com.tencent.mm.sdk.platformtools.z3(), dVar.g());
            if (a18) {
                com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f201636a;
                if (chatFooter.K0()) {
                    chatFooter.setBottomPanelVisibility(8);
                }
                com.tencent.mm.autogen.events.VoipEvent voipEvent = new com.tencent.mm.autogen.events.VoipEvent();
                am.y00 y00Var = voipEvent.f54945g;
                y00Var.f8415b = 5;
                y00Var.f8418e = I();
                y00Var.f8417d = dVar.g();
                y00Var.f8419f = 2;
                voipEvent.e();
            }
        }
    }

    public void D() {
        android.content.Intent intent = new android.content.Intent();
        yb5.d dVar = this.f201645j;
        intent.setClass(dVar.g(), com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI.class);
        intent.putExtra("TO_USER", this.f201638c);
        ((ot.i) ((pt.h0) i95.n0.c(pt.h0.class))).getClass();
        if (!(j62.e.g().c(new com.tencent.mm.repairer.config.msgsend.RepairerConfigSelectFileWithoutLoading()) == 1)) {
            intent.putExtra("INTENT_KEY_PUSH_DOWN_OUT_ANIMATION", true);
            dVar.f460709d.a(intent, 227, new com.tencent.mm.ui.chatting.z4(this));
            dVar.g().overridePendingTransition(com.tencent.mm.R.anim.f477857df, com.tencent.mm.R.anim.f477728p);
            return;
        }
        intent.putExtra("is_use_vas", true);
        intent.putExtra("INTENT_KEY_PUSH_DOWN_OUT_ANIMATION", true);
        lk5.s.e(intent, true);
        sk5.a enterAnim = sk5.a.f409007c;
        sk5.h exitAnim = sk5.h.f409013c;
        kotlin.jvm.internal.o.g(enterAnim, "enterAnim");
        kotlin.jvm.internal.o.g(exitAnim, "exitAnim");
        ok5.d.b(intent, "KEY_VAS_START_ENTER_ANIM", enterAnim, new ok5.f());
        ok5.d.b(intent, "KEY_VAS_START_EXIT_ANIM", exitAnim, new ok5.f());
        ((com.tencent.mm.ui.bd) ((com.tencent.mm.ui.MMFragmentActivity) dVar.g()).startActivityForResult(intent)).f197877a = new com.tencent.mm.ui.zc() { // from class: com.tencent.mm.ui.chatting.h4$$b
            @Override // com.tencent.mm.ui.zc
            public final void a(int i17, android.content.Intent intent2) {
                com.tencent.mm.ui.chatting.h4 h4Var = com.tencent.mm.ui.chatting.h4.this;
                h4Var.K(h4Var.f201645j, i17, intent2);
            }
        };
    }

    public void E(int i17) {
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        yb5.d dVar = this.f201645j;
        android.app.Activity g17 = dVar.g();
        ((sb0.f) jVar).getClass();
        boolean a17 = j35.u.a(g17, "android.permission.CAMERA", 18, "", "");
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(a17);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingFooterEventImpl", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", valueOf, new com.tencent.mm.sdk.platformtools.z3(), dVar.g());
        if (a17) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13822, 1, 1);
            com.tencent.mm.modelcontrol.VideoTransPara videoTransPara = new com.tencent.mm.plugin.mmsight.SightParams(1, i17).f148819f;
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider f17 = com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider.f(videoTransPara, videoTransPara.f71195h * 1000, 1);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getC2CVideoCompositionSwitch", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
            bm5.o1 o1Var = bm5.o1.f22719a;
            int g18 = o1Var.g(bm5.h0.RepairerConfig_Media_C2CRecordUseVideoComposition_Int, 0);
            com.tencent.mars.xlog.Log.i("MicroMsg.EditorVideoCompositionConfig", "C2CVideoCompositionSwitch repairConfig: " + g18);
            if (fp.q.b("xlab")) {
                if (g18 == 0) {
                    f17.a(2, "com.tencent.mm.plugin.vlog.ui.video.EditorVideoCompositionPluginLayout");
                } else if (g18 == 1) {
                    f17.a(2, "com.tencent.mm.plugin.vlog.ui.video.EditorVideoCompositionPluginLayout");
                }
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("KEY_TEC_REPORTRemuxHevcEncode_SCENE", 1);
            bundle.putBoolean("key_edit_video_remux_show_progress", ((pc0.y1) ((qc0.b1) i95.n0.c(qc0.b1.class))).wi());
            f17.M = bundle;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getC2CVideoCompositionSwitch", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("c2cUseCameraKitRecord", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
            java.lang.Object b17 = o1Var.b(bm5.h0.RepairerConfig_Camera_Component_Int, 0);
            boolean z18 = kotlin.jvm.internal.o.b(b17, 0) || !kotlin.jvm.internal.o.b(b17, 1);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("c2cUseCameraKitRecord", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
            boolean z19 = this.f201643h;
            if (z18) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingFooterEventImpl", "useCameraKitRecord");
                com.tencent.mm.plugin.sns.statistics.a aVar = com.tencent.mm.plugin.sns.statistics.a.f164826a;
                int i18 = aVar.i();
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingFooterEventImpl", "useCameraKitImproveLayout >> %d", java.lang.Integer.valueOf(i18));
                fu3.e eVar = fu3.e.f266880a;
                if (i18 > 0) {
                    aVar.a(f17, i18);
                    f17.M.putInt("key_camera_instance", aVar.f());
                    f17.M.putBoolean("key_record_keep_ratio", true);
                    if (z19) {
                        f17.M.putInt("key_maas_template_scene", 8);
                    } else {
                        f17.M.putInt("key_maas_template_scene", 6);
                    }
                    f17.a(2, "com.tencent.mm.plugin.vlog.ui.video.improve.ImproveEditorVideoCompositionPluginLayout");
                    if (eVar.a()) {
                        f17.a(1, "com.tencent.mm.plugin.recordvideo.plugin.improve_photo.ImproveRecordEditPhotoPluginLayout");
                    } else {
                        f17.a(1, "com.tencent.mm.plugin.recordvideo.plugin.parent.RecordEditPhotoPluginLayout");
                    }
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ChattingFooterEventImpl", "no useCameraKitImproveLayout");
                    f17.a(0, com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout.class.getName());
                    if (eVar.a()) {
                        f17.a(1, "com.tencent.mm.plugin.recordvideo.plugin.improve_photo.ImproveBaseEditPhotoLayout");
                    }
                }
                int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_c2c_camerakit_multiple_kbps, -1);
                int i19 = com.tencent.mm.sdk.platformtools.o4.L().getInt("key_record_without_edit", 1);
                com.tencent.mars.xlog.Log.i("MicroMsg.C2CRecordStrategy", "guessEditRecord time:" + i19 + " ratio:" + Ni);
                if (Ni < 1) {
                    Ni = i19 < 1 ? 5 : 1;
                }
                f17.M.putInt("key_record_bitrate_ratio", Ni);
                f17.M.putBoolean("key_edit_enable_emoji_search", true);
            }
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_c2c_ignore_remux_without_edit, false)) {
                f17.f155669d = 2;
            }
            com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo videoCaptureReportInfo = new com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo();
            videoCaptureReportInfo.f155690d = 3;
            if (z19) {
                videoCaptureReportInfo.f155690d = 4;
            }
            java.lang.String I = I();
            java.lang.String str = I != null ? I : "";
            videoCaptureReportInfo.f155701r = str;
            videoCaptureReportInfo.f155702s = z19 ? ((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(str) : 0;
            f17.I = videoCaptureReportInfo;
            com.tencent.mm.component.api.jumper.UICustomParam uICustomParam = new com.tencent.mm.component.api.jumper.UICustomParam((hp.a) null);
            java.util.Map map = uICustomParam.f64779h;
            ((java.util.HashMap) map).put("plugin_filter", java.lang.Boolean.TRUE);
            ((java.util.HashMap) map).put("plugin_poi", true);
            ((java.util.HashMap) map).put("plugin_tip", true);
            ((java.util.HashMap) map).put("plugin_menu", true);
            f17.f155677o = uICustomParam;
            ((pc0.e2) ((qc0.c1) i95.n0.c(qc0.c1.class))).wi((androidx.activity.ComponentActivity) dVar.g(), f17, new com.tencent.mm.ui.chatting.l4(this));
        }
    }

    public void F() {
        com.tencent.mm.autogen.events.VoipEvent voipEvent = new com.tencent.mm.autogen.events.VoipEvent();
        am.y00 y00Var = voipEvent.f54945g;
        y00Var.f8415b = 5;
        y00Var.f8418e = I();
        y00Var.f8417d = this.f201645j.g();
        y00Var.f8419f = 4;
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f201636a;
        if (chatFooter.K0()) {
            chatFooter.setBottomPanelVisibility(8);
        }
        voipEvent.e();
    }

    public void G() {
        com.tencent.mm.autogen.events.VoipEvent voipEvent = new com.tencent.mm.autogen.events.VoipEvent();
        am.y00 y00Var = voipEvent.f54945g;
        y00Var.f8415b = 5;
        y00Var.f8418e = I();
        y00Var.f8417d = this.f201645j.g();
        y00Var.f8419f = 2;
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f201636a;
        if (chatFooter.K0()) {
            chatFooter.setBottomPanelVisibility(8);
        }
        voipEvent.e();
    }

    public java.lang.String I() {
        com.tencent.mm.storage.z3 z3Var = this.f201639d;
        if (z3Var != null && com.tencent.mm.storage.z3.H3(z3Var.d1())) {
            return this.f201638c;
        }
        if (z3Var == null) {
            return null;
        }
        return z3Var.d1();
    }

    public final void K(yb5.d dVar, int i17, android.content.Intent intent) {
        if (i17 != -1 || intent == null) {
            return;
        }
        ((com.tencent.mm.ui.chatting.component.lk) ((sb5.w1) dVar.f460708c.a(sb5.w1.class))).n0(217, i17, intent);
        java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("selected_file_lst");
        java.util.ArrayList<java.lang.String> stringArrayListExtra2 = intent.getStringArrayListExtra("selected_file_title_lst");
        java.util.ArrayList<java.lang.Integer> integerArrayListExtra = intent.getIntegerArrayListExtra("selected_file_need_clean_lst");
        java.util.ArrayList<java.lang.String> stringArrayListExtra3 = intent.getStringArrayListExtra("key_file_thumb_path");
        boolean D = dVar.D();
        java.lang.String str = this.f201638c;
        if (D) {
            ((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(str);
        }
        if (stringArrayListExtra != null) {
            java.util.Iterator it = com.tencent.mm.sdk.platformtools.t8.P1(str.split(",")).iterator();
            while (it.hasNext()) {
                java.lang.String str2 = (java.lang.String) it.next();
                boolean z17 = true;
                java.lang.String f17 = stringArrayListExtra.size() > 1 ? dh3.c.f232489a.f(str2, dh3.d.f232498g) : "";
                int size = stringArrayListExtra.size();
                int i18 = 0;
                while (i18 < size) {
                    ut.s0 s0Var = new ut.s0(str2, stringArrayListExtra.get(i18));
                    if (stringArrayListExtra2 != null && i18 < stringArrayListExtra2.size() && !com.tencent.mm.sdk.platformtools.t8.K0(stringArrayListExtra2.get(i18))) {
                        java.lang.String str3 = stringArrayListExtra2.get(i18);
                        kotlin.jvm.internal.o.g(str3, "<set-?>");
                        s0Var.f430719c = str3;
                    }
                    s0Var.f430725i = f17;
                    boolean z18 = (integerArrayListExtra == null || integerArrayListExtra.size() <= i18 || integerArrayListExtra.get(i18).intValue() != z17) ? false : z17;
                    if (stringArrayListExtra3 != null && stringArrayListExtra3.size() > i18) {
                        java.lang.String str4 = stringArrayListExtra3.get(i18);
                        kotlin.jvm.internal.o.g(str4, "<set-?>");
                        s0Var.f430729m = str4;
                    }
                    s0Var.f430728l = z18;
                    dk5.w.f234966a.c(s0Var);
                    i18++;
                    z17 = true;
                }
            }
        }
        java.lang.String stringExtra = intent.getStringExtra("with_text_content");
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            return;
        }
        ((dk5.s5) tg3.t1.a()).Ui(stringExtra, str);
    }

    public void L(java.lang.Object obj) {
        com.tencent.mm.plugin.mmsight.SightCaptureResult sightCaptureResult;
        if (obj instanceof qc0.m1) {
            qc0.m1 m1Var = (qc0.m1) obj;
            int i17 = m1Var.f361411b;
            yb5.d dVar = this.f201645j;
            if (i17 != -1 || m1Var.f361412c != 0) {
                dVar.f460717l.onActivityResult(com.tencent.mm.plugin.appbrand.jsapi.contact.j.CTRL_INDEX, i17, new android.content.Intent());
                return;
            }
            r45.vh4 vh4Var = new r45.vh4();
            vh4Var.f388235e = true;
            vh4Var.f388234d = false;
            qc0.l1 a17 = m1Var.a();
            qc0.n1 n1Var = a17.f361395a;
            qc0.n1 n1Var2 = qc0.n1.f361418e;
            java.lang.String str = a17.f361396b;
            if (n1Var == n1Var2) {
                sightCaptureResult = new com.tencent.mm.plugin.mmsight.SightCaptureResult(true, str);
            } else {
                java.lang.String q17 = com.tencent.mm.vfs.w6.q(str);
                java.lang.String str2 = a17.f361396b;
                sightCaptureResult = new com.tencent.mm.plugin.mmsight.SightCaptureResult(true, str2, a17.f361397c, q17, kk.k.e(str2), java.lang.Math.round((((float) a17.f361398d) * 1.0f) / 1000.0f), vh4Var);
            }
            com.tencent.mm.plugin.recordvideo.jumper.RecordMediaReportInfo recordMediaReportInfo = m1Var.f361415f;
            if (recordMediaReportInfo != null) {
                boolean z17 = ((java.lang.Integer) recordMediaReportInfo.b("KEY_ADD_EMOJI_COUNT_INT", 0)).intValue() != 0;
                boolean z18 = ((java.lang.Integer) recordMediaReportInfo.b("KEY_ADD_TEXT_COUNT_INT", 0)).intValue() != 0;
                boolean z19 = ((java.lang.Integer) recordMediaReportInfo.b("KEY_SELECT_MUSIC_INT", 0)).intValue() != 0;
                boolean z27 = z17 || z18;
                com.tencent.mars.xlog.Log.i("MicroMsg.C2CRecordStrategy", "updateCurrentRecord stickerEdit:" + z27 + " musicEdit:" + z19);
                if (z27 || z19) {
                    com.tencent.mm.sdk.platformtools.o4.L().putInt("key_record_without_edit", 0);
                } else {
                    com.tencent.mm.sdk.platformtools.o4.L().putInt("key_record_without_edit", com.tencent.mm.sdk.platformtools.o4.L().getInt("key_record_without_edit", 1) + 1);
                }
            }
            android.content.Intent intent = new android.content.Intent();
            java.lang.String I = I();
            kk.l lVar = t21.w2.f415056c;
            sightCaptureResult.f148811i = t21.c3.a(I);
            intent.putExtra("key_req_result", sightCaptureResult);
            r15.b quoteSendExtCommonInfo = this.f201636a.getQuoteSendExtCommonInfo();
            if (quoteSendExtCommonInfo != null) {
                ok5.d.b(intent, "key_quote_extcommon", quoteSendExtCommonInfo, new ok5.h());
            }
            dVar.f460717l.onActivityResult(com.tencent.mm.plugin.appbrand.jsapi.contact.j.CTRL_INDEX, m1Var.f361411b, intent);
        }
    }

    public final void N(int i17) {
        com.tencent.mm.autogen.events.RecordStateChangeEvent recordStateChangeEvent = new com.tencent.mm.autogen.events.RecordStateChangeEvent();
        recordStateChangeEvent.f54665g.f6786a = i17;
        recordStateChangeEvent.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean P() {
        /*
            r9 = this;
            yb5.d r0 = r9.f201645j
            com.tencent.mm.ui.chatting.BaseChattingUIFragment r1 = r0.f460717l
            r2 = 1
            r1.enableOptionMenu(r2)
            com.tencent.mm.ui.chatting.BaseChattingUIFragment r0 = r0.f460717l
            r0.enableBackMenu(r2)
            bm5.x0 r0 = r9.f201637b
            java.lang.Object r0 = r0.d()
            java.lang.String r1 = "MicroMsg.ChattingFooterEventImpl"
            r3 = 0
            if (r0 == 0) goto Le1
            bm5.x0 r0 = r9.f201637b
            java.lang.Object r0 = r0.b()
            com.tencent.mm.modelbase.g1 r0 = (com.tencent.mm.modelbase.g1) r0
            boolean r0 = r0.i()
            java.lang.String r4 = "medianote"
            if (r0 == 0) goto L43
            com.tencent.mm.storage.z3 r0 = r9.f201639d
            java.lang.String r0 = r0.d1()
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L3e
            int r0 = c01.z1.p()
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 != 0) goto L3e
            r0 = r2
            goto L3f
        L3e:
            r0 = r3
        L3f:
            if (r0 == 0) goto L43
            r0 = r2
            goto L44
        L43:
            r0 = r3
        L44:
            bm5.x0 r5 = r9.f201637b
            java.lang.Object r5 = r5.b()
            com.tencent.mm.modelbase.g1 r5 = (com.tencent.mm.modelbase.g1) r5
            boolean r5 = r5.stop()
            com.tencent.mm.sdk.platformtools.b4 r6 = r9.f201653r
            r6.d()
            com.tencent.mm.sdk.platformtools.b4 r6 = r9.f201656u
            r6.d()
            if (r0 == 0) goto Lda
            com.tencent.mm.storage.f9 r0 = new com.tencent.mm.storage.f9
            r0.<init>()
            r0.u1(r4)
            r6 = 34
            r0.setType(r6)
            r0.j1(r2)
            pt0.e0 r2 = pt0.f0.f358209b1
            boolean r2 = r2.j()
            if (r2 != 0) goto L79
            java.lang.String r2 = r9.f201640e
            r0.i1(r2)
        L79:
            r2 = 2
            r0.r1(r2)
            java.lang.String r6 = c01.z1.r()
            bm5.x0 r7 = r9.f201637b
            java.lang.Object r7 = r7.b()
            com.tencent.mm.modelbase.g1 r7 = (com.tencent.mm.modelbase.g1) r7
            int r7 = r7.k()
            long r7 = (long) r7
            java.lang.String r3 = w21.u0.c(r6, r7, r3)
            r0.d1(r3)
            long r3 = c01.w9.o(r4)
            r0.e1(r3)
            bm5.x0 r3 = r9.f201637b
            java.lang.Object r3 = r3.b()
            com.tencent.mm.modelbase.g1 r3 = (com.tencent.mm.modelbase.g1) r3
            int r3 = r3.e()
            if (r3 != r2) goto Laf
            java.lang.String r2 = "SOURCE_SILK_FILE"
            r0.u3(r2)
        Laf:
            c01.f r2 = c01.d9.b()
            xg3.m0 r2 = r2.u()
            com.tencent.mm.storage.g9 r2 = (com.tencent.mm.storage.g9) r2
            long r2 = r2.M9(r0)
            r6 = 0
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 > 0) goto Lc9
            java.lang.String r0 = "insertLocalMsg fail"
            com.tencent.mars.xlog.Log.e(r1, r0)
            goto Lda
        Lc9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "insertLocalMsg success, msgId = "
            r0.<init>(r4)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.mars.xlog.Log.i(r1, r0)
        Lda:
            java.lang.String r0 = "keep_app_silent"
            com.tencent.mm.sdk.platformtools.c3.b(r0)
            r3 = r5
            goto Le7
        Le1:
            java.lang.String r0 = "stopRecording recorder.get() == null"
            com.tencent.mars.xlog.Log.i(r1, r0)
        Le7:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.h4.P():boolean");
    }

    public final void Q() {
        com.tencent.mars.xlog.Log.getLogLevel();
        yb5.d dVar = this.f201645j;
        dVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingContext", "[smoothScrollBy] dis:%s duration:%s", 0, 0);
        com.tencent.mm.ui.chatting.ChattingUIFragment chattingUIFragment = (com.tencent.mm.ui.chatting.ChattingUIFragment) dVar.f460718m;
        chattingUIFragment.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUIFragment", "[smoothScrollBy] dis:%d duration:%d", 0, 0);
        chattingUIFragment.f198269t.smoothScrollBy(0, 0);
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.k5
    public java.lang.String a() {
        return this.f201637b.d() != null ? ((com.tencent.mm.modelbase.g1) this.f201637b.b()).a() : "";
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.k5
    public void b(android.view.View view) {
        this.f201645j.M(true, false, false);
        Q();
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.k5
    public long c() {
        if (this.f201637b.d() != null) {
            return ((com.tencent.mm.modelbase.g1) this.f201637b.b()).c();
        }
        return 0L;
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.k5
    public boolean d(java.lang.String str) {
        com.tencent.mars.xlog.Log.getLogLevel();
        yb5.d dVar = this.f201645j;
        dVar.M(true, false, false);
        Q();
        return ((com.tencent.mm.ui.chatting.component.sk) ((sb5.f2) dVar.f460708c.a(sb5.f2.class))).q0(str, null);
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.k5
    public boolean e() {
        synchronized (this.f201652q) {
            this.f201650o = true;
        }
        if (!this.f201651p) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingFooterEventImpl", "jacks in voice rcd stop but not begin.");
            return false;
        }
        this.f201651p = false;
        this.f201645j.Q(false);
        o();
        this.f201636a.d1(com.tencent.mm.pluginsdk.ui.chat.f5.Cancel);
        com.tencent.mm.ui.chatting.v0 o07 = ((com.tencent.mm.ui.chatting.component.ro) ((sb5.q2) this.f201645j.f460708c.a(sb5.q2.class))).o0();
        if (o07 != null) {
            o07.l();
        }
        ((com.tencent.mm.ui.chatting.component.gl) ((sb5.c2) this.f201645j.f460708c.a(sb5.c2.class))).n0(4);
        ((com.tencent.mm.ui.chatting.component.gl) ((sb5.c2) this.f201645j.f460708c.a(sb5.c2.class))).q0();
        N(1);
        ((com.tencent.mm.ui.chatting.component.ro) ((sb5.q2) this.f201645j.f460708c.a(sb5.q2.class))).t0(this.f201645j.f460717l, false);
        return true;
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.k5
    public boolean f(boolean z17) {
        synchronized (this.f201652q) {
            this.f201650o = true;
        }
        if (!this.f201651p) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingFooterEventImpl", "jacks in voice rcd stop but not begin.");
            return false;
        }
        this.f201651p = false;
        this.f201645j.Q(false);
        if (P()) {
            if (((com.tencent.mm.modelbase.g1) this.f201637b.b()).j() != null) {
                this.f201636a.v1(false, true);
            }
            this.f201636a.setExitType(0);
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f201636a;
            if (!chatFooter.S3) {
                if (1 == ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_trans_txt_edu_user_switch, 1)) {
                    android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences(com.tencent.mm.pluginsdk.ui.chat.ChatFooter.A6, 0);
                    if (sharedPreferences.getInt("trans2txt_edu_key", 0) == 0) {
                        sharedPreferences.edit().putInt("trans2txt_edu_key", 1).apply();
                        com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
                        java.lang.String c17 = chatFooter.f189955a3.c();
                        f9Var.e1(c01.w9.o(c17));
                        f9Var.u1(c17);
                        f9Var.d1(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.k8z));
                        f9Var.setType(10000);
                        f9Var.r1(6);
                        f9Var.j1(0);
                        ((com.tencent.mm.storage.g9) c01.d9.b().u()).M9(f9Var);
                    }
                }
            }
            if (z17) {
                this.f201636a.d1(com.tencent.mm.pluginsdk.ui.chat.f5.SendVoice);
            }
            ((com.tencent.mm.ui.chatting.component.y2) ((sb5.p) this.f201645j.f460708c.a(sb5.p.class))).n0();
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingFooterEventImpl", "record stop on stop request resetRcdStatus");
        } else {
            this.f201636a.n1();
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingFooterEventImpl", "record stop on stop request setRcdTooShort");
        }
        com.tencent.mm.ui.chatting.v0 o07 = ((com.tencent.mm.ui.chatting.component.ro) ((sb5.q2) this.f201645j.f460708c.a(sb5.q2.class))).o0();
        if (o07 != null) {
            o07.l();
        }
        ((com.tencent.mm.ui.chatting.component.gl) ((sb5.c2) this.f201645j.f460708c.a(sb5.c2.class))).n0(4);
        ((com.tencent.mm.ui.chatting.component.gl) ((sb5.c2) this.f201645j.f460708c.a(sb5.c2.class))).q0();
        N(1);
        ((com.tencent.mm.ui.chatting.component.ro) ((sb5.q2) this.f201645j.f460708c.a(sb5.q2.class))).t0(this.f201645j.f460717l, false);
        return true;
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.k5
    public boolean g() {
        synchronized (this.f201652q) {
            this.f201650o = true;
        }
        if (!this.f201651p) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingFooterEventImpl", "ever never begin.");
            return false;
        }
        this.f201651p = false;
        this.f201645j.Q(false);
        yb5.d dVar = this.f201645j;
        dVar.f460717l.enableOptionMenu(true);
        dVar.f460717l.enableBackMenu(true);
        if (this.f201637b.d() != null) {
            ((com.tencent.mm.modelbase.g1) this.f201637b.b()).f();
            this.f201653r.d();
            this.f201656u.d();
        }
        this.f201636a.d1(com.tencent.mm.pluginsdk.ui.chat.f5.StopRecord);
        com.tencent.mm.ui.chatting.v0 o07 = ((com.tencent.mm.ui.chatting.component.ro) ((sb5.q2) this.f201645j.f460708c.a(sb5.q2.class))).o0();
        if (o07 != null) {
            o07.l();
        }
        ((com.tencent.mm.ui.chatting.component.gl) ((sb5.c2) this.f201645j.f460708c.a(sb5.c2.class))).n0(4);
        ((com.tencent.mm.ui.chatting.component.gl) ((sb5.c2) this.f201645j.f460708c.a(sb5.c2.class))).q0();
        N(1);
        ((com.tencent.mm.ui.chatting.component.ro) ((sb5.q2) this.f201645j.f460708c.a(sb5.q2.class))).t0(this.f201645j.f460717l, false);
        return true;
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.k5
    public void h(java.lang.String str) {
        ((com.tencent.mm.ui.chatting.component.sk) ((sb5.f2) this.f201645j.f460708c.a(sb5.f2.class))).m0(str);
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.k5
    public void i(android.view.View view, android.view.MotionEvent motionEvent) {
        if (motionEvent == null || motionEvent.getAction() == 1) {
            yb5.d dVar = this.f201645j;
            com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) dVar.p().s().getItem(dVar.p().s().getCount() - 1);
            if ((f9Var != null && f9Var.T1() == ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().m5(dVar.x())) || !dVar.h().d()) {
                dVar.M(true, false, false);
            } else {
                dVar.h().b(hd5.n.ACTION_LAST_PAGE, false);
            }
            Q();
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.k5
    public boolean j() {
        return this.f201655t < 1;
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.k5
    public boolean k(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        w21.x0.p(str);
        w21.p0.Bi().e();
        return true;
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.k5
    public void l(boolean z17) {
        yb5.d dVar = this.f201645j;
        if (z17) {
            ((com.tencent.mm.ui.chatting.component.gl) ((sb5.c2) dVar.f460708c.a(sb5.c2.class))).o0();
        } else {
            ((com.tencent.mm.ui.chatting.component.gl) ((sb5.c2) dVar.f460708c.a(sb5.c2.class))).q0();
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.k5
    public void m() {
        this.f201645j.p().postDelayed(new com.tencent.mm.ui.chatting.r4(this), 100L);
        Q();
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.k5
    public r15.b n() {
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f201636a;
        if (chatFooter != null) {
            return chatFooter.getQuoteSendExtCommonInfo();
        }
        return null;
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.k5
    public void o() {
        yb5.d dVar = this.f201645j;
        dVar.f460717l.enableOptionMenu(true);
        dVar.f460717l.enableBackMenu(true);
        if (this.f201637b.d() != null) {
            ((com.tencent.mm.modelbase.g1) this.f201637b.b()).cancel();
            this.f201653r.d();
            this.f201656u.d();
        }
        this.f201636a.d1(com.tencent.mm.pluginsdk.ui.chat.f5.Cancel);
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.k5
    public void onPause() {
        if (this.f201637b.d() != null) {
            if (!(ba5.a.f18702b && kotlin.jvm.internal.o.b(ba5.a.f18701a, ((com.tencent.mm.modelbase.g1) this.f201637b.b()).a()))) {
                if (!(ba5.a.f18704d && kotlin.jvm.internal.o.b(ba5.a.f18703c, ((com.tencent.mm.modelbase.g1) this.f201637b.b()).a()))) {
                    P();
                }
            }
        }
        this.f201653r.d();
        this.f201656u.d();
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.k5
    public void onResume() {
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.k5
    public boolean p(java.lang.String str, int i17, com.tencent.mm.storage.f9 f9Var) {
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && i17 > 0) {
            boolean cj6 = ((ig0.o) ((dg0.f) i95.n0.c(dg0.f.class))).cj();
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f201636a;
            yb5.d dVar = this.f201645j;
            if (cj6 || com.tencent.mm.storage.z3.J3(dVar.u().d1())) {
                cg0.d dVar2 = new cg0.d(dVar.u().d1(), str);
                dVar2.f41056i = 0;
                dVar2.f41055h = i17;
                dVar2.f41057j = this.f201637b.b();
                if (f9Var != null) {
                    dVar2.f41058k = g45.b.f268846a.b(f9Var);
                }
                ((ig0.o) ((dg0.f) i95.n0.c(dg0.f.class))).getClass();
                ((ig0.o) ((dg0.f) i95.n0.c(dg0.f.class))).hj(new jg0.x(dVar2));
                if (((com.tencent.mm.modelbase.g1) this.f201637b.b()).j() != null) {
                    chatFooter.v1(false, true);
                }
                return true;
            }
            if (w21.x0.j(str) != null) {
                if (w21.x0.t(str, i17, 0, f9Var) && ((com.tencent.mm.modelbase.g1) this.f201637b.b()).j() != null) {
                    chatFooter.v1(false, true);
                }
                w21.p0.Bi().e();
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x011a A[RETURN] */
    @Override // com.tencent.mm.pluginsdk.ui.chat.k5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean q(boolean r10) {
        /*
            Method dump skipped, instructions count: 598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.h4.q(boolean):boolean");
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.k5
    public void r() {
        this.f201655t = 0;
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.k5
    public void release() {
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.k5
    public void s(android.view.View view) {
        this.f201645j.M(true, false, false);
        Q();
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.k5
    public void t() {
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f201636a;
        if (chatFooter != null) {
            chatFooter.v1(false, true);
        }
    }

    public boolean z() {
        vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
        yb5.d dVar = this.f201645j;
        if (((ub0.r) oVar).Ai(dVar.f460717l, lp0.b.K(), "microMsg." + java.lang.System.currentTimeMillis() + com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG, 201)) {
            return true;
        }
        dp.a.makeText(dVar.g(), dVar.s().getString(com.tencent.mm.R.string.igw), 1).show();
        return false;
    }
}
