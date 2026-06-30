package com.tencent.mm.plugin.game;

/* loaded from: classes8.dex */
public class n0 extends com.tencent.mm.sdk.event.n {
    public static final j53.i E = new j53.i();
    public static final com.tencent.mm.sdk.platformtools.b4 F = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.plugin.game.l0(), false);
    public static final com.tencent.mm.app.s2 G = new com.tencent.mm.plugin.game.m0();
    public final com.tencent.mm.sdk.event.IListener A;
    public final com.tencent.mm.sdk.event.IListener B;
    public final com.tencent.mm.sdk.event.IListener C;
    public final com.tencent.mm.sdk.event.IListener D;

    /* renamed from: d, reason: collision with root package name */
    public long f140573d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f140574e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.game.model.NotifyGameWebviewOperationListener f140575f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f140576g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f140577h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f140578i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f140579m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f140580n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f140581o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f140582p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f140583q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f140584r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f140585s;

    /* renamed from: t, reason: collision with root package name */
    public final u25.a f140586t;

    /* renamed from: u, reason: collision with root package name */
    public final u25.a f140587u;

    /* renamed from: v, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f140588v;

    /* renamed from: w, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f140589w;

    /* renamed from: x, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f140590x;

    /* renamed from: y, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f140591y;

    /* renamed from: z, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f140592z;

    public n0() {
        super(0);
        this.f140573d = 0L;
        this.f140574e = false;
        this.f140575f = new com.tencent.mm.plugin.game.model.NotifyGameWebviewOperationListener();
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f140576g = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.GameDownloadReport4WebViewEvent>(this, a0Var) { // from class: com.tencent.mm.plugin.game.GameEventListener$1
            {
                this.__eventId = -130268553;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.GameDownloadReport4WebViewEvent gameDownloadReport4WebViewEvent) {
                am.oe oeVar = gameDownloadReport4WebViewEvent.f54361g;
                int i17 = oeVar.f7530e;
                if (i17 == 0) {
                    i17 = 1000;
                }
                int i18 = i17;
                java.lang.String str = oeVar.f7526a;
                java.lang.String str2 = oeVar.f7527b;
                java.lang.String str3 = oeVar.f7528c;
                java.lang.String str4 = oeVar.f7529d;
                com.tencent.mm.plugin.game.model.b0 b0Var = com.tencent.mm.plugin.game.model.b0.f140224a;
                if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    return false;
                }
                com.tencent.mm.plugin.game.model.a0 a0Var2 = new com.tencent.mm.plugin.game.model.a0(str2, i18, str3, "", str4);
                a0Var2.f140196f = true;
                com.tencent.mm.plugin.game.model.b0.f140226c.put(str, a0Var2);
                return false;
            }
        };
        this.f140577h = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.QueryGameLifeMsgEvent>(this, a0Var) { // from class: com.tencent.mm.plugin.game.GameEventListener$2
            {
                this.__eventId = 63085695;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.QueryGameLifeMsgEvent queryGameLifeMsgEvent) {
                m53.g0 g0Var;
                com.tencent.mm.autogen.events.QueryGameLifeMsgEvent queryGameLifeMsgEvent2 = queryGameLifeMsgEvent;
                int Ri = ((z53.q) ((u53.a0) i95.n0.c(u53.a0.class))).Ri();
                if (Ri == 0) {
                    queryGameLifeMsgEvent2.f54636g.f6482a = false;
                } else {
                    long r17 = com.tencent.mm.sdk.platformtools.t8.r1((java.lang.Long) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_GAME_LIFE_LATEST_MSG_ID_LONG, 0L));
                    z53.j Ni = ((z53.q) ((u53.a0) i95.n0.c(u53.a0.class))).Ni();
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    long j17 = Ni.f470255e;
                    if (java.lang.Boolean.valueOf(java.lang.Math.abs(currentTimeMillis - j17) > 86400000).booleanValue()) {
                        queryGameLifeMsgEvent2.f54636g.f6482a = false;
                        com.tencent.mars.xlog.Log.i("MicroMsg.GameEventListener", "isConverSationUpdateTimeMore1day now:%d, sessionUpdateTimeMillSec:%d", java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(j17));
                    } else {
                        queryGameLifeMsgEvent2.f54636g.f6482a = true;
                        java.lang.String replace = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f492212fm5).replace("{unread_msg_count}", java.lang.String.valueOf(Ri));
                        am.dp dpVar = queryGameLifeMsgEvent2.f54636g;
                        dpVar.f6483b = replace;
                        java.lang.String str = ((z53.q) ((u53.a0) i95.n0.c(u53.a0.class))).Ni().f470251a;
                        if (str == null) {
                            str = "";
                        }
                        dpVar.f6484c = str;
                        dpVar.f6485d = Ri;
                        long j18 = Ni.f470252b;
                        dpVar.f6486e = j18;
                        dpVar.f6487f = j17 / 1000;
                        m53.l1 i17 = com.tencent.mm.plugin.game.commlib.i.i();
                        if (i17 != null && (g0Var = i17.f323859d) != null) {
                            if (g0Var.f323690e && g0Var.f323691f) {
                                dpVar.f6482a = false;
                            } else if (g0Var.f323691f) {
                                dpVar.f6484c = "";
                            } else {
                                m53.f6 f6Var = g0Var.f323689d;
                                if (f6Var != null && f6Var.f323685d == 1 && !com.tencent.mm.sdk.platformtools.t8.K0(f6Var.f323686e)) {
                                    dpVar.f6483b = i17.f323859d.f323689d.f323686e.replace("{unread_msg_count}", java.lang.String.valueOf(Ri));
                                }
                            }
                        }
                        if (r17 == j18) {
                            dpVar.f6482a = false;
                        }
                    }
                }
                return false;
            }
        };
        this.f140578i = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SetEntranceMsgExposureEvent>(this, a0Var) { // from class: com.tencent.mm.plugin.game.GameEventListener$3
            {
                this.__eventId = 368788730;
            }

            /* JADX WARN: Code restructure failed: missing block: B:17:0x0099, code lost:
            
                if (r5 == false) goto L20;
             */
            @Override // com.tencent.mm.sdk.event.IListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public boolean callback(com.tencent.mm.autogen.events.SetEntranceMsgExposureEvent r15) {
                /*
                    Method dump skipped, instructions count: 272
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.game.GameEventListener$3.callback(com.tencent.mm.sdk.event.IEvent):boolean");
            }
        };
        this.f140579m = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.QueryGameMessageEvent>(a0Var) { // from class: com.tencent.mm.plugin.game.GameEventListener$4
            {
                this.__eventId = -625127267;
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0064, code lost:
            
                if (r12.f7972d > 0) goto L24;
             */
            /* JADX WARN: Code restructure failed: missing block: B:53:0x0103, code lost:
            
                if (r3 > r5) goto L62;
             */
            /* JADX WARN: Code restructure failed: missing block: B:60:0x013b, code lost:
            
                if (r3 > r5) goto L62;
             */
            /* JADX WARN: Code restructure failed: missing block: B:74:0x0079, code lost:
            
                if (r12.f7971c != false) goto L24;
             */
            /* JADX WARN: Removed duplicated region for block: B:18:0x008a  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x0143 A[ADDED_TO_REGION] */
            /* JADX WARN: Removed duplicated region for block: B:27:0x019b  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x01f3  */
            /* JADX WARN: Removed duplicated region for block: B:35:0x01fd  */
            /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:71:0x0166  */
            @Override // com.tencent.mm.sdk.event.IListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public boolean callback(com.tencent.mm.autogen.events.QueryGameMessageEvent r18) {
                /*
                    Method dump skipped, instructions count: 690
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.game.GameEventListener$4.callback(com.tencent.mm.sdk.event.IEvent):boolean");
            }
        };
        this.f140580n = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.GameCenterOperationEvent>(this, a0Var) { // from class: com.tencent.mm.plugin.game.GameEventListener$5
            {
                this.__eventId = -1149286806;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.GameCenterOperationEvent gameCenterOperationEvent) {
                am.ke keVar = gameCenterOperationEvent.f54357g;
                int i17 = keVar.f7140a;
                if (i17 == 1) {
                    com.tencent.mm.plugin.game.model.f.k(keVar.f7141b, keVar.f7142c, keVar.f7143d, keVar.f7144e, null);
                    android.content.Context context = keVar.f7141b;
                    int i18 = keVar.f7145f;
                    com.tencent.mm.game.report.l.f(context, i18, i18, 1, 3, keVar.f7142c, 0, null);
                } else if (i17 == 2) {
                    int i19 = keVar.f7145f;
                    java.lang.String str = keVar.f7146g;
                    com.tencent.mars.xlog.Log.i("MicroMsg.GameEventListener", "scene = %d, extinfo = %s", java.lang.Integer.valueOf(i19), str);
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putInt("game_report_from_scene", i19);
                    bundle.putCharSequence("game_app_id", keVar.f7142c);
                    bundle.putCharSequence("game_report_extra_click_extinfo", str);
                    int o17 = r53.f.o(keVar.f7141b, keVar.f7142c, null, bundle, keVar.f7145f);
                    android.content.Context context2 = keVar.f7141b;
                    int i27 = keVar.f7145f;
                    com.tencent.mm.game.report.l.f(context2, i27, i27, 1, o17, keVar.f7142c, 0, null);
                } else if (i17 == 3) {
                    boolean z17 = com.tencent.mm.plugin.game.model.f0.f140305e;
                    if (!(java.lang.System.currentTimeMillis() - ((java.lang.Long) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_GAME_SEARCH_LIST_UPDATE_TIME_LONG, 0L)).longValue() > 86400000)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.GameListUpdater", "No need to update");
                    } else if (com.tencent.mm.plugin.game.model.f0.f140305e) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.GameListUpdater", "Already running");
                    } else {
                        com.tencent.mm.plugin.game.model.f0.f140307g = new com.tencent.mm.sdk.platformtools.n3("GameListUpdate");
                        com.tencent.mm.plugin.game.model.f0.f140306f.clear();
                        com.tencent.mm.plugin.game.model.f0 f0Var = new com.tencent.mm.plugin.game.model.f0();
                        gm0.j1.d().a(1215, f0Var);
                        gm0.j1.d().g(new com.tencent.mm.plugin.game.model.j3(f0Var.f140308d, 20));
                        com.tencent.mm.plugin.game.model.f0.f140305e = true;
                    }
                } else if (i17 == 5) {
                    com.tencent.mm.plugin.game.model.d0.f(((com.tencent.mm.plugin.game.n1) ((m33.r1) i95.n0.c(m33.r1.class))).Ai().l(), keVar.f7145f, 2);
                }
                return false;
            }
        };
        this.f140581o = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.GameJsApiCommandEvent>(this, a0Var) { // from class: com.tencent.mm.plugin.game.GameEventListener$6
            {
                this.__eventId = -1855576386;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.GameJsApiCommandEvent gameJsApiCommandEvent) {
                java.lang.String str;
                com.tencent.mm.plugin.game.model.e1 b17;
                java.lang.String str2;
                com.tencent.mm.autogen.events.GameJsApiCommandEvent gameJsApiCommandEvent2 = gameJsApiCommandEvent;
                am.pe peVar = gameJsApiCommandEvent2.f54362g;
                int i17 = peVar.f7614a;
                am.qe qeVar = gameJsApiCommandEvent2.f54363h;
                if (i17 == 1) {
                    java.lang.String str3 = peVar.f7615b;
                    java.util.LinkedList linkedList = new java.util.LinkedList();
                    if (str3 != null) {
                        try {
                            org.json.JSONObject jSONObject = new org.json.JSONObject(str3);
                            int P = com.tencent.mm.sdk.platformtools.t8.P(jSONObject.optString("type"), 0);
                            int P2 = com.tencent.mm.sdk.platformtools.t8.P(jSONObject.optString("subMsgType"), -1);
                            java.lang.String optString = jSONObject.optString(com.tencent.tmassistantsdk.downloadservice.DownloadInfo.CONTENTTYPE, com.tencent.tinker.loader.shareutil.ShareConstants.DEXMODE_RAW);
                            int P3 = com.tencent.mm.sdk.platformtools.t8.P(jSONObject.optString("limit"), 0);
                            long V = com.tencent.mm.sdk.platformtools.t8.V(jSONObject.optString("lastLocalId"), -1L);
                            java.lang.String optString2 = jSONObject.optString("gameMsgId");
                            int P4 = com.tencent.mm.sdk.platformtools.t8.P(jSONObject.optString("isUnread"), -1);
                            if (P3 > 0 && P3 <= 10000 && V >= 0 && P4 >= 0) {
                                if (com.tencent.mm.sdk.platformtools.t8.K0(optString2)) {
                                    linkedList = ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().n1(P, P2, V, P4, P3);
                                } else {
                                    com.tencent.mm.plugin.game.model.e1 b18 = ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().b1(optString2);
                                    if (b18 != null) {
                                        linkedList.add(b18);
                                    }
                                }
                                if (!com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
                                    org.json.JSONArray jSONArray = new org.json.JSONArray();
                                    java.util.Iterator it = linkedList.iterator();
                                    while (it.hasNext()) {
                                        com.tencent.mm.plugin.game.model.e1 e1Var = (com.tencent.mm.plugin.game.model.e1) it.next();
                                        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                                        jSONObject2.put(dm.i4.COL_LOCALID, e1Var.field_msgId);
                                        if (!optString.equals("json") || (str = e1Var.field_rawXML) == null) {
                                            jSONObject2.put(com.tencent.tmassistantsdk.downloadservice.DownloadInfo.CONTENTTYPE, com.tencent.tinker.loader.shareutil.ShareConstants.DEXMODE_RAW);
                                            jSONObject2.put("content", e1Var.field_rawXML);
                                        } else {
                                            org.json.JSONObject a17 = wq5.m.f448726a.a(str);
                                            if (a17 == null) {
                                                jSONObject2.put(com.tencent.tmassistantsdk.downloadservice.DownloadInfo.CONTENTTYPE, com.tencent.tinker.loader.shareutil.ShareConstants.DEXMODE_RAW);
                                                jSONObject2.put("content", e1Var.field_rawXML);
                                            } else {
                                                jSONObject2.put(com.tencent.tmassistantsdk.downloadservice.DownloadInfo.CONTENTTYPE, "json");
                                                jSONObject2.put("content", a17);
                                            }
                                        }
                                        jSONArray.put(jSONObject2);
                                    }
                                    qeVar.f7709a = jSONArray.toString();
                                }
                            }
                        } catch (org.json.JSONException e17) {
                            com.tencent.mars.xlog.Log.w("MicroMsg.GameJsapiProcessor", "JSONException : %s", e17.getMessage());
                        }
                        return false;
                    }
                } else if (i17 == 2) {
                    java.lang.String str4 = peVar.f7615b;
                    if (str4 != null) {
                        try {
                            org.json.JSONObject jSONObject3 = new org.json.JSONObject(str4);
                            if (!jSONObject3.isNull("type") && com.tencent.mm.sdk.platformtools.t8.P(jSONObject3.optString("type"), 0) != 0) {
                                if (com.tencent.mm.sdk.platformtools.t8.P(jSONObject3.optString("type"), 0) == 65536) {
                                    ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().execSQL("GameRawMessage", "update GameRawMessage set isRead=1 where 1=1");
                                }
                            }
                            new org.json.JSONArray();
                            org.json.JSONArray jSONArray2 = jSONObject3.getJSONArray("localIdList");
                            int length = jSONArray2.length();
                            long[] jArr = new long[length];
                            for (int i18 = 0; i18 < length; i18++) {
                                jArr[i18] = jSONArray2.getLong(i18);
                            }
                            ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().S1(jArr);
                        } catch (org.json.JSONException e18) {
                            com.tencent.mars.xlog.Log.w("MicroMsg.GameJsapiProcessor", "JSONException : %s", e18.getMessage());
                        }
                    }
                } else if (i17 == 3) {
                    com.tencent.mm.plugin.game.model.e1 j17 = ((com.tencent.mm.plugin.game.n1) ((m33.r1) i95.n0.c(m33.r1.class))).Ai().j();
                    if (j17 != null) {
                        qeVar.f7709a = j17.field_rawXML;
                    }
                } else if (i17 == 4) {
                    ((com.tencent.mm.plugin.game.n1) ((m33.r1) i95.n0.c(m33.r1.class))).Ai().e();
                } else if (i17 == 9) {
                    ((com.tencent.mm.plugin.game.n1) ((m33.r1) i95.n0.c(m33.r1.class))).Ai().getClass();
                    com.tencent.mm.plugin.game.model.e1 L0 = ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().L0(((java.lang.Long) gm0.j1.u().c().m(com.tencent.mm.storage.u3.GAME_GIFT_ENTRANCE_MSGID_LONG_SYNC, 0L)).longValue());
                    if (L0 != null) {
                        qeVar.f7709a = L0.field_rawXML;
                    }
                } else if (i17 == 10) {
                    ((com.tencent.mm.plugin.game.n1) ((m33.r1) i95.n0.c(m33.r1.class))).Ai().getClass();
                    com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
                    com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.GAME_GIFT_ENTRANCE_MSGID_LONG_SYNC;
                    if (((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().L0(((java.lang.Long) c17.m(u3Var, 0L)).longValue()) != null) {
                        gm0.j1.u().c().x(u3Var, 0L);
                    }
                } else if (i17 == 12) {
                    java.lang.String str5 = peVar.f7615b;
                    if (str5 != null) {
                        try {
                            org.json.JSONObject jSONObject4 = new org.json.JSONObject(str5);
                            if (jSONObject4.optBoolean("deleteAll", false)) {
                                ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().execSQL("GameRawMessage", "delete from GameRawMessage");
                            } else {
                                org.json.JSONArray optJSONArray = jSONObject4.optJSONArray("localIdList");
                                if (optJSONArray != null) {
                                    int length2 = optJSONArray.length();
                                    long[] jArr2 = new long[length2];
                                    for (int i19 = 0; i19 < length2; i19++) {
                                        jArr2[i19] = optJSONArray.getLong(i19);
                                    }
                                    ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().z0(jArr2);
                                }
                            }
                        } catch (org.json.JSONException e19) {
                            com.tencent.mars.xlog.Log.w("MicroMsg.GameJsapiProcessor", "JSONException : %s", e19.getMessage());
                        }
                    }
                } else if (i17 == 13) {
                    java.lang.String str6 = peVar.f7615b;
                    if (str6 != null) {
                        try {
                            org.json.JSONArray optJSONArray2 = new org.json.JSONObject(str6).optJSONArray("msgIdList");
                            if (optJSONArray2 != null) {
                                org.json.JSONObject jSONObject5 = new org.json.JSONObject();
                                int length3 = optJSONArray2.length();
                                for (int i27 = 0; i27 < length3; i27++) {
                                    java.lang.String string = optJSONArray2.getString(i27);
                                    if (!com.tencent.mm.sdk.platformtools.t8.K0(string) && (b17 = ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().b1(string)) != null) {
                                        b17.t0();
                                        jSONObject5.put(string, r53.f.n(b17.K2.f140561s));
                                    }
                                }
                                qeVar.f7709a = jSONObject5.toString();
                            }
                        } catch (org.json.JSONException e27) {
                            com.tencent.mars.xlog.Log.w("MicroMsg.GameJsapiProcessor", "JSONException : %s", e27.getMessage());
                        }
                    }
                } else if (i17 == 15 && (str2 = peVar.f7615b) != null) {
                    try {
                        int optInt = new org.json.JSONObject(str2).optInt("operationType");
                        org.json.JSONObject jSONObject6 = new org.json.JSONObject();
                        if (optInt == 0) {
                            ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().C1();
                            jSONObject6.put("mockMessage", ya.b.SUCCESS);
                        } else if (optInt == 2) {
                            com.tencent.mm.plugin.game.model.i1 Ai = ((com.tencent.mm.plugin.game.n1) ((m33.r1) i95.n0.c(m33.r1.class))).Ai();
                            Ai.getClass();
                            ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.game.model.m1(Ai));
                        }
                        jSONObject6.put("RedDotCount", ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().P0(0));
                        jSONObject6.put("interactiveCount", ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().P0(1));
                        jSONObject6.put("notifyMsgCount", ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().P0(2));
                        qeVar.f7709a = jSONObject6.toString();
                    } catch (org.json.JSONException e28) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.GameJsapiProcessor", "JSONException : %s", e28.getMessage());
                    }
                }
                return false;
            }
        };
        this.f140582p = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.OpenGameCenterEvent>(this, a0Var) { // from class: com.tencent.mm.plugin.game.GameEventListener$7
            {
                this.__eventId = 2000383001;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.OpenGameCenterEvent openGameCenterEvent) {
                com.tencent.mm.autogen.events.OpenGameCenterEvent openGameCenterEvent2 = openGameCenterEvent;
                org.json.JSONObject jSONObject = openGameCenterEvent2.f54597g.f7723a;
                java.lang.String optString = jSONObject.optString("viewName");
                if (optString.length() == 0) {
                    optString = jSONObject.optString("jumpView");
                    if (optString.length() == 0) {
                        optString = null;
                    } else if (optString.compareTo("0") == 0) {
                        optString = "MAIN_PAGE";
                    } else if (optString.compareTo("1") == 0) {
                        optString = "GAME_LIB";
                    } else if (optString.compareTo("2") == 0) {
                        optString = "GAME_DETAIL";
                    } else if (optString.compareTo("3") == 0) {
                        optString = "MSG_CENTER";
                    }
                }
                java.lang.String optString2 = jSONObject.optString("openType");
                if (optString2.length() == 0) {
                    optString2 = jSONObject.optString("jumpType");
                }
                boolean z17 = (optString2.length() == 0 || optString2.compareTo("0") == 0 || optString2.compareTo("OPEN_DEFAULT") == 0 || (optString2.compareTo("1") != 0 && optString2.compareTo("OPEN_JUMP") != 0)) ? false : true;
                org.json.JSONObject optJSONObject = jSONObject.optJSONObject("extInfo");
                if (optJSONObject == null) {
                    java.lang.String optString3 = jSONObject.optString("extInfo");
                    if (optString3.length() > 0) {
                        try {
                            optJSONObject = new org.json.JSONObject(optString3);
                        } catch (org.json.JSONException unused) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.OpenGameJsapiProcessor", "extInfo parse error: %s", optString3);
                        }
                    }
                }
                if (optJSONObject == null) {
                    optJSONObject = new org.json.JSONObject();
                }
                if (optString.compareTo("MSG_CENTER") == 0) {
                    try {
                        optJSONObject.put("msgId", jSONObject.optString("msgId"));
                        optJSONObject.put("msgTabType", jSONObject.optString("msgTabType"));
                    } catch (org.json.JSONException unused2) {
                    }
                }
                int P = com.tencent.mm.sdk.platformtools.t8.P(optJSONObject.optString(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_SSID), 0);
                int compareTo = optString.compareTo("MAIN_PAGE");
                am.qn qnVar = openGameCenterEvent2.f54597g;
                if (compareTo == 0) {
                    android.content.Intent intent = new android.content.Intent();
                    if (z17) {
                        intent.putExtra("jump_find_more_friends", "jump_find_more_friends");
                    }
                    intent.putExtra("game_report_from_scene", 5);
                    j45.l.j(qnVar.f7724b, "game", ".ui.GameCenterUI", intent, null);
                    com.tencent.mm.game.report.l.c(qnVar.f7724b, 5, 5, 1, 6, P, null);
                    return false;
                }
                if (optString.compareTo("GAME_LIB") == 0) {
                    android.content.Intent intent2 = new android.content.Intent();
                    if (z17) {
                        intent2.putExtra("jump_game_center", "jump_game_center");
                    }
                    intent2.putExtra("game_report_from_scene", 5);
                    j45.l.j(qnVar.f7724b, "game", ".ui.GameLibraryUI", intent2, null);
                    com.tencent.mm.game.report.l.c(qnVar.f7724b, 5, 5, 1, 6, P, null);
                    return false;
                }
                if (optString.compareTo("GAME_DETAIL") == 0) {
                    android.content.Intent intent3 = new android.content.Intent();
                    java.lang.String optString4 = optJSONObject.optString("appId");
                    if (com.tencent.mm.sdk.platformtools.t8.K0(optString4)) {
                        return false;
                    }
                    intent3.putExtra("game_app_id", optString4);
                    if (z17) {
                        intent3.putExtra("jump_game_center", "jump_game_center");
                    }
                    intent3.putExtra("game_report_from_scene", 5);
                    j45.l.j(qnVar.f7724b, "game", ".ui.GameDetailUI", intent3, null);
                    com.tencent.mm.game.report.l.c(qnVar.f7724b, 5, 5, 1, 6, P, null);
                    return false;
                }
                if (optString.compareTo("MSG_CENTER") != 0) {
                    optString.compareTo("GAME_DOWNLOADER");
                    return false;
                }
                android.content.Intent intent4 = new android.content.Intent();
                boolean z18 = ((kj0.i) ((kj0.l) i95.n0.c(kj0.l.class))).wi(e42.d0.clicfg_game_open_message_center_v2, 1) == 1;
                java.lang.String optString5 = optJSONObject.optString("msgId");
                int optInt = optJSONObject.optInt("msgTabType", 0);
                if (optInt == 1) {
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.GAME_ENTRANCE_MSG_TAB_TYPE_INT_SYNC, 1);
                }
                intent4.putExtra("game_report_from_scene", P);
                intent4.putExtra("game_msg_ui_from_msgid", optString5);
                intent4.putExtra("game_msg_center_tab_type", optInt);
                if (!z18) {
                    j45.l.j(qnVar.f7724b, "game", ".ui.GameMessageUI", intent4, null);
                } else if (optInt == 2) {
                    j45.l.j(qnVar.f7724b, "game", ".ui.message.GameMsgCenterUI", intent4, null);
                } else {
                    j45.l.j(qnVar.f7724b, "game", ".ui.chat_tab.ChatRoomTabUI", intent4, null);
                }
                com.tencent.mm.game.report.l.c(qnVar.f7724b, 5, 5, 1, 6, P, null);
                return false;
            }
        };
        this.f140583q = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ReportGameCenterEvent>(this, a0Var) { // from class: com.tencent.mm.plugin.game.GameEventListener$8
            {
                this.__eventId = 944019439;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ReportGameCenterEvent reportGameCenterEvent) {
                com.tencent.mm.autogen.events.ReportGameCenterEvent reportGameCenterEvent2 = reportGameCenterEvent;
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                reportGameCenterEvent2.f54686g.getClass();
                reportGameCenterEvent2.f54686g.getClass();
                com.tencent.mm.game.report.l.d(context, 0, 0, 1, 0, 0, null, 0, 0, null, null, null);
                return false;
            }
        };
        this.f140584r = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ReportMsgClickEvent>(this, a0Var) { // from class: com.tencent.mm.plugin.game.GameEventListener$9
            {
                this.__eventId = -1494271153;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ReportMsgClickEvent reportMsgClickEvent) {
                com.tencent.mm.autogen.events.ReportMsgClickEvent reportMsgClickEvent2 = reportMsgClickEvent;
                int i17 = reportMsgClickEvent2.f54687g.f6389h;
                jj0.a a17 = jj0.a.a();
                am.cr crVar = reportMsgClickEvent2.f54687g;
                a17.d(crVar.f6382a, crVar.f6383b, crVar.f6384c, crVar.f6385d, crVar.f6386e, crVar.f6388g, i17, crVar.f6387f, crVar.f6390i, crVar.f6391j, crVar.f6392k, crVar.f6393l);
                return false;
            }
        };
        this.f140585s = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.GameCommOperationEvent>(this, a0Var) { // from class: com.tencent.mm.plugin.game.GameEventListener$10
            {
                this.__eventId = 1471153505;
            }

            /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001f. Please report as an issue. */
            /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0023. Please report as an issue. */
            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.GameCommOperationEvent gameCommOperationEvent) {
                com.tencent.mm.autogen.events.GameCommOperationEvent gameCommOperationEvent2 = gameCommOperationEvent;
                java.lang.String str = com.tencent.mm.plugin.game.model.l.f140355a;
                int i17 = gameCommOperationEvent2.f54358g.f7243a;
                com.tencent.mars.xlog.Log.i("MicroMsg.GameCommOpertionProcessor", "cmd:%d", java.lang.Integer.valueOf(i17));
                if (i17 != 10001) {
                    try {
                        switch (i17) {
                            case 1:
                                android.content.Context context = gameCommOperationEvent2.f54358g.f7245c;
                                if (context != null) {
                                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                                    com.tencent.mm.plugin.game.ui.p5 g17 = com.tencent.mm.plugin.game.model.f.g(context);
                                    if (g17 != null) {
                                        try {
                                            jSONObject.put("gameRegionName", com.tencent.mm.plugin.game.model.f.i(g17));
                                        } catch (org.json.JSONException unused) {
                                        }
                                    }
                                    gameCommOperationEvent2.f54359h.f7341a = jSONObject.toString();
                                    break;
                                }
                                break;
                            case 2:
                                java.lang.String str2 = gameCommOperationEvent2.f54358g.f7244b;
                                com.tencent.mars.xlog.Log.i("MicroMsg.GameCommOpertionProcessor", "update hv menu! appid:%s", str2);
                                if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                                    gm0.j1.d().a(1369, new com.tencent.mm.plugin.game.model.h(str2));
                                    gm0.j1.d().g(new com.tencent.mm.plugin.game.model.i3(str2));
                                    break;
                                }
                                break;
                            case 3:
                                java.lang.String str3 = gameCommOperationEvent2.f54358g.f7244b;
                                com.tencent.mars.xlog.Log.i("MicroMsg.GameCommOpertionProcessor", "get hv menu! appid:%s", str3);
                                if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                                    byte[] D0 = ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Ri().D0("pb_game_hv_menu_" + str3);
                                    if (!com.tencent.mm.sdk.platformtools.t8.M0(D0)) {
                                        gameCommOperationEvent2.f54359h.f7341a = new java.lang.String(D0, com.tencent.kinda.framework.app.KindaConfigCacheStg.SAVE_CHARSET);
                                        com.tencent.mars.xlog.Log.i("MicroMsg.GameCommOpertionProcessor", "get hv menu success! appid:%s", str3);
                                        break;
                                    }
                                }
                                break;
                            case 4:
                                java.lang.String str4 = gameCommOperationEvent2.f54358g.f7244b;
                                if (!com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
                                    try {
                                        org.json.JSONObject jSONObject2 = new org.json.JSONObject(str4);
                                        int P = com.tencent.mm.sdk.platformtools.t8.P(jSONObject2.getString("game_page_report_id"), 0);
                                        boolean z17 = jSONObject2.getBoolean("game_page_report_instantly");
                                        java.lang.String optString = jSONObject2.optString("game_page_report_format_data");
                                        java.lang.String optString2 = jSONObject2.optString("game_page_report_tabs_format_data");
                                        com.tencent.mars.xlog.Log.i("MicroMsg.GameCommOpertionProcessor", "reportGamePageTime, reportId:%d, reportInstantly:%b, reportFormatData:(%s), reportTabsFormatData(%s)", java.lang.Integer.valueOf(P), java.lang.Boolean.valueOf(z17), optString, optString2);
                                        if (P == 0) {
                                            com.tencent.mars.xlog.Log.i("MicroMsg.GameCommOpertionProcessor", "reportId format exception");
                                            break;
                                        } else if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
                                            if (!com.tencent.mm.sdk.platformtools.t8.K0(optString2)) {
                                                try {
                                                    org.json.JSONArray jSONArray = new org.json.JSONArray(optString2);
                                                    for (int i18 = 0; i18 < jSONArray.length(); i18++) {
                                                        java.lang.String string = jSONArray.getString(i18);
                                                        if (!com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                                                            if (z17) {
                                                                jj0.b bVar = new jj0.b();
                                                                bVar.f299962a = P;
                                                                bVar.f299963b = string;
                                                                ((com.tencent.mm.game.report.c) jj0.a.a()).getClass();
                                                                com.tencent.mm.game.report.k.a(bVar);
                                                            } else {
                                                                com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(P, string);
                                                            }
                                                        }
                                                    }
                                                    break;
                                                } catch (org.json.JSONException e17) {
                                                    com.tencent.mars.xlog.Log.i("MicroMsg.GameCommOpertionProcessor", "reportGamePageTime, err2:%s", e17.getMessage());
                                                    break;
                                                }
                                            }
                                        } else if (z17) {
                                            jj0.b bVar2 = new jj0.b();
                                            bVar2.f299962a = P;
                                            bVar2.f299963b = optString;
                                            ((com.tencent.mm.game.report.c) jj0.a.a()).getClass();
                                            com.tencent.mm.game.report.k.a(bVar2);
                                            break;
                                        } else {
                                            com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(P, optString);
                                            break;
                                        }
                                    } catch (org.json.JSONException e18) {
                                        com.tencent.mars.xlog.Log.i("MicroMsg.GameCommOpertionProcessor", "reportGamePageTime, err1:%s", e18.getMessage());
                                        break;
                                    }
                                }
                                break;
                            case 5:
                                com.tencent.mm.plugin.game.commlib.j.a().b(true, com.tencent.mm.sdk.platformtools.t8.P(gameCommOperationEvent2.f54358g.f7244b, 0));
                                break;
                            case 6:
                                ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Ri().z0("cache_my_chatroom");
                                ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Ri().z0("cache_chatroom_recommend");
                                com.tencent.mm.plugin.game.model.s1 Ri = ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Ri();
                                Ri.getClass();
                                com.tencent.mars.xlog.Log.i("MicroMsg.GamePBCacheStorage", "deleteDataWithPrefix, ret:%b, sql: %s", java.lang.Boolean.valueOf(Ri.execSQL("GameHaowanMedia", "delete from GamePBCache where key like 'cache_game_chat_msg#%'")), "delete from GamePBCache where key like 'cache_game_chat_msg#%'");
                                ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Ri().y0("memberVersion");
                                ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Ri().y0(dm.i4.COL_UPDATETIME);
                                break;
                            default:
                                org.json.JSONArray jSONArray2 = null;
                                switch (i17) {
                                    case com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NULL /* 10003 */:
                                        i53.t tVar = new i53.t();
                                        if (!com.tencent.mm.sdk.platformtools.t8.K0(gameCommOperationEvent2.f54358g.f7244b)) {
                                            try {
                                                jSONArray2 = new org.json.JSONObject(gameCommOperationEvent2.f54358g.f7244b).optJSONArray("albumInfos");
                                            } catch (org.json.JSONException unused2) {
                                            }
                                            tVar.h(jSONArray2);
                                        }
                                        com.tencent.mm.ipcinvoker.type.IPCString iPCString = new com.tencent.mm.ipcinvoker.type.IPCString();
                                        int f17 = tVar.f();
                                        p33.g gVar = new p33.g();
                                        gVar.f351576d = tVar.f288723h;
                                        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
                                        lVar.f70666c = "/cgi-bin/mmgame-bin/checkuserifhasnewvideo";
                                        lVar.f70667d = 3911;
                                        lVar.f70664a = gVar;
                                        lVar.f70665b = new p33.h();
                                        ((h80.i) ((com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class))).wi(lVar.a(), new i53.o(tVar, f17, iPCString));
                                        synchronized (tVar.f288716a) {
                                            try {
                                                tVar.f288716a.wait();
                                            } catch (java.lang.InterruptedException e19) {
                                                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.GameHaowanDataCenter", e19, "", new java.lang.Object[0]);
                                            }
                                        }
                                        java.lang.String str5 = iPCString.f68406d;
                                        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                                        try {
                                            jSONObject3.put("newVideoDesc", str5);
                                        } catch (org.json.JSONException unused3) {
                                        }
                                        gameCommOperationEvent2.f54359h.f7341a = jSONObject3.toString();
                                        break;
                                    case com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NOT_VALID /* 10004 */:
                                        if (!com.tencent.mm.sdk.platformtools.t8.K0(gameCommOperationEvent2.f54358g.f7244b)) {
                                            org.json.JSONObject jSONObject4 = new org.json.JSONObject(gameCommOperationEvent2.f54358g.f7244b);
                                            int optInt = jSONObject4.optInt("basic_type");
                                            if (jSONObject4.optBoolean("ban")) {
                                                com.tencent.mm.plugin.game.model.f.n(optInt);
                                                break;
                                            } else {
                                                com.tencent.mm.plugin.game.model.f.l(optInt);
                                                break;
                                            }
                                        }
                                        break;
                                    case 10005:
                                        java.lang.String a17 = com.tencent.mm.plugin.game.model.f.a();
                                        if (!com.tencent.mm.sdk.platformtools.t8.K0(a17)) {
                                            java.lang.String[] split = a17.split(",");
                                            org.json.JSONArray jSONArray3 = new org.json.JSONArray();
                                            for (java.lang.String str6 : split) {
                                                if (!com.tencent.mm.sdk.platformtools.t8.K0(str6)) {
                                                    jSONArray3.put(java.lang.Integer.valueOf(str6));
                                                }
                                            }
                                            org.json.JSONObject jSONObject5 = new org.json.JSONObject();
                                            try {
                                                jSONObject5.put("basic_type", jSONArray3);
                                            } catch (org.json.JSONException unused4) {
                                            }
                                            gameCommOperationEvent2.f54359h.f7341a = jSONObject5.toString();
                                            break;
                                        }
                                        break;
                                    case 10006:
                                        org.json.JSONArray jSONArray4 = new org.json.JSONArray();
                                        if (!com.tencent.mm.sdk.platformtools.t8.K0(gameCommOperationEvent2.f54358g.f7244b)) {
                                            am.le leVar = gameCommOperationEvent2.f54358g;
                                            com.tencent.mars.xlog.Log.i("MicroMsg.GameCommOpertionProcessor", "saveMediaLocalIds params:%s", leVar.f7244b);
                                            try {
                                                org.json.JSONArray jSONArray5 = new org.json.JSONArray(leVar.f7244b);
                                                for (int i19 = 0; i19 < jSONArray5.length(); i19++) {
                                                    java.lang.String string2 = jSONArray5.getString(i19);
                                                    com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem b17 = com.tencent.mm.plugin.webview.modeltools.z.Zi().b(string2);
                                                    if (b17 == null) {
                                                        jSONArray4.put(false);
                                                    } else {
                                                        int i27 = b17.f182742n;
                                                        java.lang.String jSONObject6 = i27 == 1 ? ((com.tencent.mm.plugin.webview.model.WebViewJSSDKImageItem) b17).a().toString() : i27 == 4 ? ((com.tencent.mm.plugin.webview.model.WebViewJSSDKVideoItem) b17).a().toString() : null;
                                                        if (com.tencent.mm.sdk.platformtools.t8.K0(jSONObject6)) {
                                                            jSONArray4.put(false);
                                                        } else {
                                                            ((com.tencent.mm.plugin.game.commlib.l) ((h43.e) i95.n0.c(h43.e.class))).wi().y0(string2);
                                                            ((com.tencent.mm.plugin.game.commlib.l) ((h43.e) i95.n0.c(h43.e.class))).wi().D0(string2, jSONObject6.getBytes());
                                                            jSONArray4.put(true);
                                                        }
                                                    }
                                                }
                                            } catch (org.json.JSONException unused5) {
                                            }
                                        }
                                        org.json.JSONObject jSONObject7 = new org.json.JSONObject();
                                        try {
                                            jSONObject7.put("result", jSONArray4);
                                        } catch (org.json.JSONException unused6) {
                                        }
                                        java.lang.String jSONObject8 = jSONObject7.toString();
                                        com.tencent.mars.xlog.Log.i("MicroMsg.GameCommOpertionProcessor", "saveMediaLocalIds result:%s", jSONObject8);
                                        gameCommOperationEvent2.f54359h.f7341a = jSONObject8;
                                        break;
                                    case 10007:
                                        org.json.JSONArray jSONArray6 = new org.json.JSONArray();
                                        if (!com.tencent.mm.sdk.platformtools.t8.K0(gameCommOperationEvent2.f54358g.f7244b)) {
                                            am.le leVar2 = gameCommOperationEvent2.f54358g;
                                            com.tencent.mars.xlog.Log.i("MicroMsg.GameCommOpertionProcessor", "checkMediaLocalIds params:%s", leVar2.f7244b);
                                            try {
                                                org.json.JSONArray jSONArray7 = new org.json.JSONArray(leVar2.f7244b);
                                                for (int i28 = 0; i28 < jSONArray7.length(); i28++) {
                                                    java.lang.String string3 = jSONArray7.getString(i28);
                                                    com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem b18 = com.tencent.mm.plugin.webview.modeltools.z.Zi().b(string3);
                                                    if (b18 != null && com.tencent.mm.vfs.w6.j(b18.f182738g) && (com.tencent.mm.sdk.platformtools.t8.K0(b18.f182737f) || com.tencent.mm.vfs.w6.j(b18.f182737f))) {
                                                        jSONArray6.put(true);
                                                    } else if (string3.startsWith("weixin://bgmixid/")) {
                                                        java.lang.String taskId = string3.replace("weixin://bgmixid/", "");
                                                        ((pc0.m2) ((qc0.j1) i95.n0.c(qc0.j1.class))).getClass();
                                                        kotlin.jvm.internal.o.g(taskId, "taskId");
                                                        lt3.g b19 = lt3.n.f321260a.b(taskId);
                                                        if (b19 != null) {
                                                            if (b19.field_status == 2) {
                                                                r45.on0 t07 = b19.t0();
                                                                if (t07 != null && com.tencent.mm.vfs.w6.j(t07.f382372o) && com.tencent.mm.vfs.w6.j(t07.f382373p)) {
                                                                    jSONArray6.put(true);
                                                                }
                                                            } else {
                                                                r45.on0 t08 = b19.t0();
                                                                if (t08 != null && com.tencent.mm.vfs.w6.j(t08.f382371n)) {
                                                                    jSONArray6.put(true);
                                                                }
                                                            }
                                                        }
                                                        jSONArray6.put(false);
                                                    } else if (com.tencent.mm.plugin.game.model.l.b(string3)) {
                                                        jSONArray6.put(true);
                                                    } else {
                                                        jSONArray6.put(false);
                                                    }
                                                }
                                            } catch (org.json.JSONException unused7) {
                                            }
                                        }
                                        org.json.JSONObject jSONObject9 = new org.json.JSONObject();
                                        try {
                                            jSONObject9.put("result", jSONArray6);
                                        } catch (org.json.JSONException unused8) {
                                        }
                                        java.lang.String jSONObject10 = jSONObject9.toString();
                                        com.tencent.mars.xlog.Log.i("MicroMsg.GameCommOpertionProcessor", "checkMediaLocalIds result:%s", jSONObject10);
                                        gameCommOperationEvent2.f54359h.f7341a = jSONObject10;
                                        break;
                                    default:
                                        switch (i17) {
                                            case 10010:
                                                org.json.JSONObject jSONObject11 = new org.json.JSONObject();
                                                try {
                                                    jSONObject11.put("disable_gamelife_api", false);
                                                    if (com.tencent.mm.plugin.game.commlib.i.i() != null && com.tencent.mm.plugin.game.commlib.i.i().f323862g) {
                                                        jSONObject11.put("disable_gamelife_api", true);
                                                    }
                                                } catch (org.json.JSONException unused9) {
                                                }
                                                gameCommOperationEvent2.f54359h.f7341a = jSONObject11.toString();
                                                break;
                                            case 10011:
                                                if (!com.tencent.mm.sdk.platformtools.t8.K0(gameCommOperationEvent2.f54358g.f7244b)) {
                                                    org.json.JSONObject jSONObject12 = new org.json.JSONObject(gameCommOperationEvent2.f54358g.f7244b);
                                                    java.lang.String optString3 = jSONObject12.optString("appid");
                                                    int optInt2 = jSONObject12.optInt("version");
                                                    com.tencent.mars.xlog.Log.i("MicroMsg.GameCommOpertionProcessor", "updateAppInfo, appid:%s, version:%d", optString3, java.lang.Integer.valueOf(optInt2));
                                                    if (!com.tencent.mm.sdk.platformtools.t8.K0(optString3)) {
                                                        if (optInt2 == 0) {
                                                            optInt2 = Integer.MAX_VALUE;
                                                        }
                                                        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
                                                        com.tencent.mm.pluginsdk.model.app.w.i(optString3, optInt2);
                                                    }
                                                    break;
                                                }
                                            case 10012:
                                                org.json.JSONObject jSONObject13 = new org.json.JSONObject();
                                                try {
                                                    jSONObject13.put("isExDevice", c01.z1.x());
                                                } catch (org.json.JSONException unused10) {
                                                }
                                                gameCommOperationEvent2.f54359h.f7341a = jSONObject13.toString();
                                                break;
                                            case 10013:
                                                if (!com.tencent.mm.sdk.platformtools.t8.K0(gameCommOperationEvent2.f54358g.f7244b)) {
                                                    org.json.JSONObject jSONObject14 = new org.json.JSONObject();
                                                    kj0.l lVar2 = (kj0.l) i95.n0.c(kj0.l.class);
                                                    java.lang.String str7 = gameCommOperationEvent2.f54358g.f7244b;
                                                    ((kj0.i) lVar2).getClass();
                                                    java.lang.String aj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).aj(str7, "");
                                                    com.tencent.mars.xlog.Log.i("MicroMsg.GameExptManager", "gamelog.exp, getExpt, key: %s, result: %s", str7, aj6);
                                                    try {
                                                        jSONObject14.put("exp_info", aj6);
                                                    } catch (org.json.JSONException unused11) {
                                                    }
                                                    gameCommOperationEvent2.f54359h.f7341a = jSONObject14.toString();
                                                    break;
                                                }
                                                break;
                                        }
                                        break;
                                }
                        }
                    } catch (java.io.UnsupportedEncodingException | org.json.JSONException unused12) {
                    }
                } else {
                    android.content.Context context2 = gameCommOperationEvent2.f54358g.f7245c;
                    if (context2 != null) {
                        org.json.JSONObject jSONObject15 = new org.json.JSONObject();
                        java.lang.String d17 = com.tencent.mm.plugin.game.model.f.d(context2);
                        if (com.tencent.mm.sdk.platformtools.t8.K0(d17)) {
                            d17 = com.tencent.mm.plugin.game.model.f.b();
                        }
                        try {
                            jSONObject15.put("regionCode", d17);
                        } catch (org.json.JSONException unused13) {
                        }
                        gameCommOperationEvent2.f54359h.f7341a = jSONObject15.toString();
                    }
                }
                return false;
            }
        };
        this.f140586t = new com.tencent.mm.plugin.game.j0(this);
        this.f140587u = new com.tencent.mm.plugin.game.k0(this);
        this.f140588v = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SwitcherEvent>(a0Var) { // from class: com.tencent.mm.plugin.game.GameEventListener$13
            {
                this.__eventId = -173637623;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SwitcherEvent switcherEvent) {
                com.tencent.mm.autogen.events.SwitcherEvent switcherEvent2 = switcherEvent;
                boolean equals = switcherEvent2.f54874g.f6713b.equals(com.tencent.mm.autogen.events.GameMessageStorageNotifyEvent.class.getName());
                com.tencent.mm.plugin.game.n0 n0Var = com.tencent.mm.plugin.game.n0.this;
                am.fy fyVar = switcherEvent2.f54874g;
                if (equals) {
                    if (fyVar.f6712a == 1) {
                        n0Var.f140586t.c();
                        return false;
                    }
                    n0Var.f140586t.d();
                    return false;
                }
                if (!fyVar.f6713b.equals(com.tencent.mm.autogen.events.GameLifeStorageNotifyEvent.class.getName())) {
                    return false;
                }
                if (fyVar.f6712a == 1) {
                    n0Var.f140587u.c();
                    return false;
                }
                n0Var.f140587u.d();
                return false;
            }
        };
        this.f140589w = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.GameDebugSettingEvent>(this, a0Var) { // from class: com.tencent.mm.plugin.game.GameEventListener$14
            {
                this.__eventId = 591188507;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.GameDebugSettingEvent gameDebugSettingEvent) {
                am.ne neVar = gameDebugSettingEvent.f54360g;
                int i17 = neVar.f7421a;
                com.tencent.mm.plugin.game.model.v.f140488a = neVar.f7422b;
                return false;
            }
        };
        this.f140590x = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.GetGameDebugDownloaderTypeEvent>(this, a0Var) { // from class: com.tencent.mm.plugin.game.GameEventListener$15
            {
                this.__eventId = -528556336;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.GetGameDebugDownloaderTypeEvent getGameDebugDownloaderTypeEvent) {
                getGameDebugDownloaderTypeEvent.f54396g.getClass();
                return false;
            }
        };
        this.f140591y = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.GameWatchReportEvent>(this, a0Var) { // from class: com.tencent.mm.plugin.game.GameEventListener$16
            {
                this.__eventId = 1648872377;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.GameWatchReportEvent gameWatchReportEvent) {
                com.tencent.mm.autogen.events.GameWatchReportEvent gameWatchReportEvent2 = gameWatchReportEvent;
                java.lang.Integer valueOf = java.lang.Integer.valueOf(gameWatchReportEvent2.f54372g.f8557b);
                am.ze zeVar = gameWatchReportEvent2.f54372g;
                com.tencent.mars.xlog.Log.i("MicroMsg.GameEventListener", "opType = %d, opStatus = %d, appId = %s", valueOf, java.lang.Integer.valueOf(zeVar.f8558c), zeVar.f8556a);
                int i17 = zeVar.f8557b;
                if (i17 != 0) {
                    if (i17 == 2) {
                        com.tencent.mm.plugin.game.model.b0.b().e(zeVar.f8556a, zeVar.f8558c, false, zeVar.f8559d);
                    } else if (i17 != 6) {
                        jj0.a.a().c(zeVar.f8556a, zeVar.f8557b, zeVar.f8558c, null, zeVar.f8559d);
                    } else {
                        com.tencent.mm.plugin.game.model.b0 b17 = com.tencent.mm.plugin.game.model.b0.b();
                        java.lang.String str = zeVar.f8556a;
                        java.lang.String str2 = zeVar.f8559d;
                        b17.getClass();
                        jj0.a.a().c(str, 6, 0, null, str2);
                    }
                }
                return false;
            }
        };
        this.f140592z = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.PostSyncTaskEvent>(this, a0Var) { // from class: com.tencent.mm.plugin.game.GameEventListener$17
            {
                this.__eventId = -790196534;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.PostSyncTaskEvent postSyncTaskEvent) {
                com.tencent.mm.plugin.game.commlib.j.a().b(false, 2);
                return false;
            }
        };
        this.A = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ManualAuthEvent>(this, a0Var) { // from class: com.tencent.mm.plugin.game.GameEventListener$18
            {
                this.__eventId = -199921540;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public /* bridge */ /* synthetic */ boolean callback(com.tencent.mm.autogen.events.ManualAuthEvent manualAuthEvent) {
                return false;
            }
        };
        this.B = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.GameMsgDownloadImgEvent>(this, a0Var) { // from class: com.tencent.mm.plugin.game.GameEventListener$19
            {
                this.__eventId = 110532958;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.GameMsgDownloadImgEvent gameMsgDownloadImgEvent) {
                com.tencent.mm.autogen.events.GameMsgDownloadImgEvent gameMsgDownloadImgEvent2 = gameMsgDownloadImgEvent;
                am.ue ueVar = gameMsgDownloadImgEvent2.f54367g;
                java.lang.String str = ueVar.f8079b;
                am.ve veVar = gameMsgDownloadImgEvent2.f54368h;
                veVar.f8193a = com.tencent.mm.plugin.game.g0.f139449b;
                int i17 = ueVar.f8078a;
                boolean z17 = true;
                if (i17 == 1) {
                    r53.d dVar = r53.b.f392640a;
                    synchronized (dVar) {
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                            if (!((java.util.concurrent.ConcurrentHashMap) dVar.f392650d).containsKey(str) || !((java.lang.Boolean) ((java.util.concurrent.ConcurrentHashMap) dVar.f392650d).get(str)).booleanValue()) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.GameCacheUtil", "download entrance image start : %s", str);
                                ((java.util.concurrent.ConcurrentHashMap) dVar.f392650d).put(str, java.lang.Boolean.TRUE);
                            }
                        }
                        z17 = false;
                    }
                    veVar.f8194b = z17;
                } else if (i17 == 2) {
                    r53.d dVar2 = r53.b.f392640a;
                    synchronized (dVar2) {
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && ((java.util.concurrent.ConcurrentHashMap) dVar2.f392650d).containsKey(str)) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.GameCacheUtil", "download entrance image finish : %s", str);
                            ((java.util.concurrent.ConcurrentHashMap) dVar2.f392650d).remove(str);
                        }
                    }
                }
                return false;
            }
        };
        this.C = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ShowGameCenterEntranceEvent>(this, a0Var) { // from class: com.tencent.mm.plugin.game.GameEventListener$20
            {
                this.__eventId = 1446704624;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ShowGameCenterEntranceEvent showGameCenterEntranceEvent) {
                synchronized (this) {
                    r53.d dVar = r53.b.f392640a;
                    r53.c cVar = dVar.f392649c;
                    if (cVar.f392642a > 0 && cVar.f392645d > 0) {
                        cVar.f392643b = java.lang.System.currentTimeMillis();
                        r53.c cVar2 = dVar.f392649c;
                        long j17 = cVar2.f392644c;
                        long currentTimeMillis = java.lang.System.currentTimeMillis();
                        r53.c cVar3 = dVar.f392649c;
                        cVar2.f392644c = j17 + (currentTimeMillis - cVar3.f392645d);
                        com.tencent.mars.xlog.Log.i("MicroMsg.GameEventListener", "enter game center, startTime:%d(ms), endTime:%d(ms), stayTime:%d(ms)", java.lang.Long.valueOf(cVar3.f392642a), java.lang.Long.valueOf(dVar.f392649c.f392643b), java.lang.Long.valueOf(dVar.f392649c.f392644c));
                        r53.c cVar4 = dVar.f392649c;
                        com.tencent.mm.game.report.l.e(com.tencent.mm.sdk.platformtools.x2.f193071a, 35, 0, 0, 91, 0, "", 901, 0, "", "", "", cVar4.f392642a / 1000, cVar4.f392643b / 1000, cVar4.f392644c / 1000);
                    }
                    r53.c cVar5 = dVar.f392649c;
                    cVar5.f392642a = 0L;
                    cVar5.f392643b = 0L;
                    cVar5.f392644c = 0L;
                    cVar5.f392645d = 0L;
                }
                return false;
            }
        };
        this.D = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.GamePBCacheEvent>(this, a0Var) { // from class: com.tencent.mm.plugin.game.GameEventListener$21
            {
                this.__eventId = 738480876;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.GamePBCacheEvent gamePBCacheEvent) {
                am.we weVar = gamePBCacheEvent.f54369g;
                int i17 = weVar.f8278a;
                if (i17 == 1) {
                    if (com.tencent.mm.sdk.platformtools.t8.K0(weVar.f8279b)) {
                        return false;
                    }
                    weVar.f8280c = ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Ri().D0(weVar.f8279b);
                    com.tencent.mars.xlog.Log.i("MicroMsg.GameEventListener", "get game cache, key:[%s]", weVar.f8279b);
                    return false;
                }
                if (i17 != 2) {
                    if (i17 != 3 || com.tencent.mm.sdk.platformtools.t8.K0(weVar.f8279b)) {
                        return false;
                    }
                    ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Ri().z0(weVar.f8279b);
                    com.tencent.mars.xlog.Log.i("MicroMsg.GameEventListener", "delete game cache, key:[%s]", weVar.f8279b);
                    return false;
                }
                if (com.tencent.mm.sdk.platformtools.t8.K0(weVar.f8279b) || weVar.f8280c == null) {
                    return false;
                }
                ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Ri().L0(weVar.f8279b, weVar.f8280c);
                com.tencent.mars.xlog.Log.i("MicroMsg.GameEventListener", "save game cache, key:[%s]", weVar.f8279b);
                return false;
            }
        };
    }

    public static void b(com.tencent.mm.plugin.game.n0 n0Var, boolean z17) {
        if (n0Var.f140574e && !z17) {
            long i17 = com.tencent.mm.sdk.platformtools.t8.i1();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_GAME_HIDE_ENTRANCE_RED_DOT_TIME_LONG, java.lang.Long.valueOf(i17));
            com.tencent.mars.xlog.Log.i("MicroMsg.GameEventListener", "reset backup msg startTime:%d", java.lang.Long.valueOf(i17));
        }
        n0Var.f140574e = z17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00d7, code lost:
    
        if (r1.moveToFirst() != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00d9, code lost:
    
        r4 = new com.tencent.mm.plugin.game.model.e1();
        r4.convertFrom(r1);
        r2.add(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00e8, code lost:
    
        if (r1.moveToNext() != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ea, code lost:
    
        r1.close();
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(com.tencent.mm.plugin.game.n0 r11) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.game.n0.c(com.tencent.mm.plugin.game.n0):void");
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        if (iEvent instanceof com.tencent.mm.autogen.events.NotifyGameWebviewOperationEvent) {
            this.f140575f.d((com.tencent.mm.autogen.events.NotifyGameWebviewOperationEvent) iEvent);
            return false;
        }
        if (iEvent instanceof com.tencent.mm.autogen.events.GameDownloadReport4WebViewEvent) {
            return this.f140576g.callback((com.tencent.mm.autogen.events.GameDownloadReport4WebViewEvent) iEvent);
        }
        if (iEvent instanceof com.tencent.mm.autogen.events.QueryGameMessageEvent) {
            return this.f140579m.callback((com.tencent.mm.autogen.events.QueryGameMessageEvent) iEvent);
        }
        if (iEvent instanceof com.tencent.mm.autogen.events.SwitcherEvent) {
            return this.f140588v.callback((com.tencent.mm.autogen.events.SwitcherEvent) iEvent);
        }
        if (iEvent instanceof com.tencent.mm.autogen.events.GameCenterOperationEvent) {
            return this.f140580n.callback((com.tencent.mm.autogen.events.GameCenterOperationEvent) iEvent);
        }
        if (iEvent instanceof com.tencent.mm.autogen.events.GameJsApiCommandEvent) {
            return this.f140581o.callback((com.tencent.mm.autogen.events.GameJsApiCommandEvent) iEvent);
        }
        if (iEvent instanceof com.tencent.mm.autogen.events.OpenGameCenterEvent) {
            return this.f140582p.callback((com.tencent.mm.autogen.events.OpenGameCenterEvent) iEvent);
        }
        if (iEvent instanceof com.tencent.mm.autogen.events.ReportGameCenterEvent) {
            return this.f140583q.callback((com.tencent.mm.autogen.events.ReportGameCenterEvent) iEvent);
        }
        if (iEvent instanceof com.tencent.mm.autogen.events.ReportMsgClickEvent) {
            return this.f140584r.callback((com.tencent.mm.autogen.events.ReportMsgClickEvent) iEvent);
        }
        if (iEvent instanceof com.tencent.mm.autogen.events.GameDebugSettingEvent) {
            return this.f140589w.callback((com.tencent.mm.autogen.events.GameDebugSettingEvent) iEvent);
        }
        if (iEvent instanceof com.tencent.mm.autogen.events.GetGameDebugDownloaderTypeEvent) {
            return this.f140590x.callback((com.tencent.mm.autogen.events.GetGameDebugDownloaderTypeEvent) iEvent);
        }
        if (iEvent instanceof com.tencent.mm.autogen.events.GameCommOperationEvent) {
            return this.f140585s.callback((com.tencent.mm.autogen.events.GameCommOperationEvent) iEvent);
        }
        if (iEvent instanceof com.tencent.mm.autogen.events.GameWatchReportEvent) {
            return this.f140591y.callback((com.tencent.mm.autogen.events.GameWatchReportEvent) iEvent);
        }
        if (iEvent instanceof com.tencent.mm.autogen.events.PostSyncTaskEvent) {
            return this.f140592z.callback((com.tencent.mm.autogen.events.PostSyncTaskEvent) iEvent);
        }
        if (iEvent instanceof com.tencent.mm.autogen.events.ManualAuthEvent) {
            ((com.tencent.mm.plugin.game.GameEventListener$18) this.A).getClass();
            return false;
        }
        if (iEvent instanceof com.tencent.mm.autogen.events.GameMsgDownloadImgEvent) {
            return this.B.callback((com.tencent.mm.autogen.events.GameMsgDownloadImgEvent) iEvent);
        }
        if (iEvent instanceof com.tencent.mm.autogen.events.QueryGameLifeMsgEvent) {
            return this.f140577h.callback((com.tencent.mm.autogen.events.QueryGameLifeMsgEvent) iEvent);
        }
        if (iEvent instanceof com.tencent.mm.autogen.events.ShowGameCenterEntranceEvent) {
            return this.C.callback((com.tencent.mm.autogen.events.ShowGameCenterEntranceEvent) iEvent);
        }
        if (iEvent instanceof com.tencent.mm.autogen.events.GamePBCacheEvent) {
            return this.D.callback((com.tencent.mm.autogen.events.GamePBCacheEvent) iEvent);
        }
        if (iEvent instanceof com.tencent.mm.autogen.events.SetEntranceMsgExposureEvent) {
            return this.f140578i.callback((com.tencent.mm.autogen.events.SetEntranceMsgExposureEvent) iEvent);
        }
        return false;
    }
}
