package g73;

@j95.b(dependencies = {d73.j.class})
/* loaded from: classes15.dex */
public final class o0 extends i95.w implements d73.i, l75.q0 {

    /* renamed from: e, reason: collision with root package name */
    public static com.tencent.mm.plugin.handoff.model.HandOff f269312e;

    /* renamed from: f, reason: collision with root package name */
    public static com.tencent.mm.plugin.handoff.model.HandOff f269313f;

    /* renamed from: i, reason: collision with root package name */
    public static final g73.o f269316i;

    /* renamed from: m, reason: collision with root package name */
    public static com.tencent.mm.plugin.appbrand.config.GetOnLineInfoInfoResult f269317m;

    /* renamed from: n, reason: collision with root package name */
    public static boolean f269318n;

    /* renamed from: o, reason: collision with root package name */
    public static boolean f269319o;

    /* renamed from: p, reason: collision with root package name */
    public static final g73.m2 f269320p;

    /* renamed from: q, reason: collision with root package name */
    public static final g73.n f269321q;

    /* renamed from: d, reason: collision with root package name */
    public static final g73.o0 f269311d = new g73.o0();

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f269314g = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: h, reason: collision with root package name */
    public static final x.b f269315h = new x.b();

    static {
        android.os.Looper a17 = gm0.j1.e().a();
        kotlin.jvm.internal.o.f(a17, "getLooper(...)");
        f269316i = new g73.o(a17);
        com.tencent.mm.plugin.appbrand.config.GetOnLineInfoInfoResult getOnLineInfoInfoResult = new com.tencent.mm.plugin.appbrand.config.GetOnLineInfoInfoResult();
        h73.g.f279492a.a(getOnLineInfoInfoResult);
        f269317m = getOnLineInfoInfoResult;
        f269318n = true;
        android.os.Looper a18 = gm0.j1.e().a();
        kotlin.jvm.internal.o.f(a18, "getLooper(...)");
        f269320p = new g73.m2(a18);
        android.os.Looper a19 = gm0.j1.e().a();
        kotlin.jvm.internal.o.f(a19, "getLooper(...)");
        f269321q = new g73.n(a19);
    }

    public static final boolean Ai(g73.o0 o0Var, com.tencent.mm.plugin.handoff.model.HandOff handOff) {
        o0Var.getClass();
        if ((handOff instanceof com.tencent.mm.plugin.handoff.model.HandOffURL) && handOff.getHandOffType() == 2) {
            if (((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).o(((com.tencent.mm.plugin.handoff.model.HandOffURL) handOff).getUrl())) {
                return true;
            }
        }
        return false;
    }

    public static final com.tencent.mm.plugin.handoff.model.HandOff Di(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        com.tencent.mm.plugin.handoff.model.HandOff handOffMP;
        int i17 = ballInfo.f93046d;
        if (i17 != 1) {
            if (i17 != 2) {
                if (i17 == 4) {
                    handOffMP = com.tencent.mm.plugin.handoff.model.HandOffFile.Companion.a(ballInfo);
                } else if (i17 != 5 && i17 != 50) {
                    handOffMP = null;
                }
            }
            java.lang.String str = ballInfo.f93063x;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            java.lang.String str2 = str == null ? "" : str;
            java.lang.String string = ballInfo.G.getString(com.tencent.mm.plugin.handoff.model.HandOffURL.KShareUrl);
            if (string == null) {
                string = "";
            }
            java.lang.String string2 = ballInfo.G.getString("rawUrl");
            if (string2 == null) {
                string2 = "";
            }
            java.lang.String str3 = ballInfo.f93057r;
            handOffMP = new com.tencent.mm.plugin.handoff.model.HandOffURL(str2, string.length() > 0 ? string : string2, str3 == null ? "" : str3, 2, null, null, null, null, 240, null);
        } else {
            java.lang.String str4 = ballInfo.f93057r;
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            java.lang.String str5 = str4 == null ? "" : str4;
            java.lang.String str6 = ballInfo.f93063x;
            java.lang.String str7 = str6 == null ? "" : str6;
            java.lang.String string3 = ballInfo.G.getString("appId");
            java.lang.String str8 = string3 == null ? "" : string3;
            java.lang.String string4 = ballInfo.G.getString(dm.i4.COL_USERNAME);
            handOffMP = new com.tencent.mm.plugin.handoff.model.HandOffMP(str5, str7, str8, "", string4 == null ? "" : string4, 2, null, null, null, com.tencent.wcdb.FileUtils.S_IRWXU, null);
        }
        if (handOffMP == null) {
            return null;
        }
        java.lang.String key = ballInfo.f93049g;
        kotlin.jvm.internal.o.f(key, "key");
        handOffMP.setKey(key);
        handOffMP.setCreateTime(ballInfo.C);
        java.lang.String string5 = ballInfo.G.getString(com.tencent.mm.plugin.handoff.model.HandOff.KId);
        if (string5 != null) {
            handOffMP.setId(string5);
        }
        return handOffMP;
    }

    public static final boolean wi(g73.o0 o0Var) {
        o0Var.getClass();
        java.util.Iterator it = ((java.util.ArrayList) ((com.tencent.mm.modelsimple.t) ((com.tencent.mm.plugin.appbrand.service.b6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.b6.class))).Ai()).iterator();
        while (it.hasNext()) {
            int i17 = ((com.tencent.mm.plugin.appbrand.service.v6) it.next()).f88808c;
            if (i17 == 38 || i17 == 37 || i17 == 43 || i17 == 39 || i17 == 15 || i17 == 14) {
                return true;
            }
        }
        return false;
    }

    @Override // d73.i
    public void A8(java.lang.String key) {
        kotlin.jvm.internal.o.g(key, "key");
        Ri(new g73.v(key));
    }

    public void Bi(com.tencent.mm.plugin.handoff.model.HandOff handOff) {
        kotlin.jvm.internal.o.g(handOff, "handOff");
        Ri(new g73.p(handOff, this));
    }

    @Override // d73.i
    public void C6() {
        g73.o oVar = f269316i;
        oVar.removeMessages(1);
        oVar.sendEmptyMessageDelayed(1, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
    }

    @Override // d73.i
    public void Ce(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        kotlin.jvm.internal.o.g(ballInfo, "ballInfo");
        com.tencent.mm.plugin.handoff.model.HandOff Di = Di(ballInfo);
        if (Di != null) {
            f269311d.Bi(Di);
        }
    }

    @Override // d73.i
    public void Dg(java.lang.String id6) {
        kotlin.jvm.internal.o.g(id6, "id");
        x.b bVar = f269315h;
        jz5.l lVar = (jz5.l) bVar.getOrDefault(id6, null);
        if (lVar != null) {
            ((com.tencent.mm.pluginsdk.model.app.d) lVar.f302834e).field_status = 105L;
            bVar.remove(id6);
        } else {
            com.tencent.mars.xlog.Log.e("HandOffService", "error in cancel file upload, handoff with md5 [" + id6 + "] lost!");
        }
    }

    @Override // d73.i
    public void Ef(com.tencent.mm.plugin.handoff.model.HandOff handOff) {
        kotlin.jvm.internal.o.g(handOff, "handOff");
        Ri(new g73.g0(handOff));
    }

    @Override // d73.i
    public void Ja(com.tencent.mm.plugin.handoff.model.HandOff handOff) {
        f269312e = handOff != null ? handOff.copy() : null;
    }

    @Override // d73.i
    public void Jc(com.tencent.mm.plugin.handoff.model.HandOff handOff) {
        kotlin.jvm.internal.o.g(handOff, "handOff");
        Ri(new g73.n0(handOff));
    }

    @Override // d73.i
    public void Kg(java.lang.String id6, java.lang.String cdnURL, java.lang.String aesKey) {
        kotlin.jvm.internal.o.g(id6, "id");
        kotlin.jvm.internal.o.g(cdnURL, "cdnURL");
        kotlin.jvm.internal.o.g(aesKey, "aesKey");
        x.b bVar = f269315h;
        jz5.l lVar = (jz5.l) bVar.getOrDefault(id6, null);
        if (lVar == null) {
            com.tencent.mars.xlog.Log.e("HandOffService", "error in file upload success, handoff with id [" + id6 + "] lost!");
            return;
        }
        java.lang.Object obj = lVar.f302833d;
        com.tencent.mm.plugin.handoff.model.HandOffFile handOffFile = (com.tencent.mm.plugin.handoff.model.HandOffFile) obj;
        handOffFile.setCdnURL(cdnURL);
        handOffFile.setAesKey(aesKey);
        com.tencent.mm.plugin.handoff.model.HandOff handOff = (com.tencent.mm.plugin.handoff.model.HandOff) obj;
        g73.m2 m2Var = f269320p;
        m2Var.getClass();
        kotlin.jvm.internal.o.g(handOff, "handOff");
        m2Var.h(3, kz5.b0.c(handOff));
        bVar.remove(id6);
    }

    @Override // d73.i
    public void Ma(com.tencent.mm.plugin.handoff.model.HandOff handOff) {
        kotlin.jvm.internal.o.g(handOff, "handOff");
        Ri(new g73.a0(handOff));
    }

    @Override // d73.i
    public boolean N1(com.tencent.mm.plugin.ball.model.BallInfo ballInfo, boolean z17) {
        kotlin.jvm.internal.o.g(ballInfo, "ballInfo");
        return false;
    }

    public void Ni(com.tencent.mm.plugin.handoff.model.HandOff handOff) {
        kotlin.jvm.internal.o.g(handOff, "handOff");
        Ri(new g73.x(handOff));
    }

    @Override // d73.i
    public void Q6(com.tencent.mm.plugin.handoff.model.HandOff handOff) {
        kotlin.jvm.internal.o.g(handOff, "handOff");
        Ri(g73.d0.f269262d);
    }

    @Override // d73.i
    public boolean Qg() {
        return ((com.tencent.mm.modelsimple.t) ((com.tencent.mm.plugin.appbrand.service.b6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.b6.class))).Di();
    }

    @Override // d73.i
    public void Qi(java.lang.String id6, java.lang.String arg) {
        kotlin.jvm.internal.o.g(id6, "id");
        kotlin.jvm.internal.o.g(arg, "arg");
        x.b bVar = f269315h;
        jz5.l lVar = (jz5.l) bVar.getOrDefault(id6, null);
        g73.m2 m2Var = f269320p;
        if (lVar != null) {
            com.tencent.mm.plugin.handoff.model.HandOff handOff = (com.tencent.mm.plugin.handoff.model.HandOff) lVar.f302833d;
            m2Var.getClass();
            kotlin.jvm.internal.o.g(handOff, "handOff");
            m2Var.h(8, kz5.b0.c(handOff));
            bVar.remove(id6);
            return;
        }
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("opcode=\"\\d+\"");
        kotlin.jvm.internal.o.f(compile, "compile(...)");
        java.lang.String replaceAll = compile.matcher(arg).replaceAll("opcode=\"8\"");
        kotlin.jvm.internal.o.f(replaceAll, "replaceAll(...)");
        java.util.regex.Pattern compile2 = java.util.regex.Pattern.compile("seq=\"\\d+\"");
        kotlin.jvm.internal.o.f(compile2, "compile(...)");
        java.lang.String replaceAll2 = compile2.matcher(replaceAll).replaceAll("seq=\"<![CSEQ]>\"");
        kotlin.jvm.internal.o.f(replaceAll2, "replaceAll(...)");
        m2Var.getClass();
        m2Var.f269291e.add(replaceAll2);
        m2Var.f();
        com.tencent.mars.xlog.Log.w("HandOffService", "error in file upload fail, handoff with id [" + id6 + "] lost!");
    }

    public final void Ri(final yz5.a aVar) {
        java.lang.Thread currentThread = java.lang.Thread.currentThread();
        g73.o oVar = f269316i;
        if (kotlin.jvm.internal.o.b(currentThread, oVar.getLooper().getThread())) {
            aVar.invoke();
        } else {
            oVar.post(new java.lang.Runnable(aVar) { // from class: g73.k0

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ yz5.a f269282d;

                {
                    kotlin.jvm.internal.o.g(aVar, "function");
                    this.f269282d = aVar;
                }

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f269282d.invoke();
                }
            });
        }
    }

    @Override // d73.i
    public boolean S8(java.lang.String id6, com.tencent.mm.pluginsdk.model.app.d info) {
        kotlin.jvm.internal.o.g(id6, "id");
        kotlin.jvm.internal.o.g(info, "info");
        java.util.Iterator it = f269314g.entrySet().iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.handoff.model.HandOff handOff = (com.tencent.mm.plugin.handoff.model.HandOff) ((java.util.Map.Entry) it.next()).getValue();
            if ((handOff instanceof com.tencent.mm.plugin.handoff.model.HandOffFile) && kotlin.jvm.internal.o.b(handOff.getId(), id6)) {
                f269315h.put(id6, new jz5.l(handOff, info));
                return true;
            }
        }
        return false;
    }

    @Override // d73.i
    public void Sb(com.tencent.mm.plugin.handoff.model.HandOff handOff) {
        kotlin.jvm.internal.o.g(handOff, "handOff");
        Ri(new g73.f0(handOff));
    }

    @Override // d73.i
    public void Ti(com.tencent.mm.plugin.appbrand.config.GetOnLineInfoInfoResult onlineInfo) {
        boolean z17;
        kotlin.jvm.internal.o.g(onlineInfo, "onlineInfo");
        com.tencent.mars.xlog.Log.i("HandOffService", "notifyUserStatusChange: " + onlineInfo);
        if (!kotlin.jvm.internal.o.b(f269317m, onlineInfo)) {
            f269317m = onlineInfo;
            h73.g gVar = h73.g.f279492a;
            int i17 = onlineInfo.f77351d;
            com.tencent.mm.sdk.platformtools.o4 o4Var = h73.g.f279493b;
            o4Var.A("icon_type", i17);
            o4Var.A("client_version", onlineInfo.f77352e);
            o4Var.G("is_wx_online", onlineInfo.f77353f);
            o4Var.G("CAN_XWECHAT_SEND_OPEN_REQUEST", onlineInfo.f77354g);
            o4Var.G("CAN_SEND_OPEN_REQUEST", onlineInfo.f77355h);
        }
        if (f269319o) {
            android.content.Intent intent = new android.content.Intent("com.tencent.QQBrowser.action.sdk.document.receiver");
            intent.setPackage("com.tencent.mtt");
            try {
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put(dm.i4.COL_ID, 3);
                com.tencent.mm.plugin.handoff.model.HandOff handOff = f269313f;
                com.tencent.mm.plugin.handoff.model.HandOffFile handOffFile = handOff instanceof com.tencent.mm.plugin.handoff.model.HandOffFile ? (com.tencent.mm.plugin.handoff.model.HandOffFile) handOff : null;
                java.lang.String n17 = com.tencent.mm.vfs.w6.n(handOffFile != null ? handOffFile.getFullPath() : null);
                if (Qg()) {
                    com.tencent.mm.plugin.handoff.model.HandOffFile.Companion.getClass();
                    if (com.tencent.mm.plugin.handoff.model.AbsHandOffFile.Companion.a(n17)) {
                        z17 = true;
                        jSONObject.put("isShow", z17);
                        jSONArray.put(jSONObject);
                        intent.putExtra("menuItems", jSONArray.toString());
                        com.tencent.mm.sdk.platformtools.x2.f193071a.sendBroadcast(intent);
                    }
                }
                z17 = false;
                jSONObject.put("isShow", z17);
                jSONArray.put(jSONObject);
                intent.putExtra("menuItems", jSONArray.toString());
                com.tencent.mm.sdk.platformtools.x2.f193071a.sendBroadcast(intent);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("HandOffService", "UpdateQbMenuIfNeed() Exception:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
            }
        }
    }

    @Override // d73.i
    public boolean Wa(java.lang.String id6, long j17) {
        kotlin.jvm.internal.o.g(id6, "id");
        jz5.l lVar = (jz5.l) f269315h.getOrDefault(id6, null);
        if (lVar == null) {
            com.tencent.mars.xlog.Log.w("HandOffService", "error in file uploading, handoff with id [" + id6 + "] lost!");
            return false;
        }
        com.tencent.mm.plugin.handoff.model.HandOff handOff = (com.tencent.mm.plugin.handoff.model.HandOff) lVar.f302833d;
        g73.m2 m2Var = f269320p;
        m2Var.getClass();
        kotlin.jvm.internal.o.g(handOff, "handOff");
        m2Var.h(7, kz5.b0.c(handOff));
        return true;
    }

    @Override // d73.i
    public void a9(com.tencent.mm.plugin.handoff.model.HandOff handOff) {
        kotlin.jvm.internal.o.g(handOff, "handOff");
        Ri(new g73.b0(handOff));
    }

    @Override // d73.i
    public void e7(java.lang.String id6, java.lang.String appId, int i17, java.lang.String mediaId) {
        kotlin.jvm.internal.o.g(id6, "id");
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        x.b bVar = f269315h;
        jz5.l lVar = (jz5.l) bVar.getOrDefault(id6, null);
        if (lVar == null) {
            com.tencent.mars.xlog.Log.e("HandOffService", "error in file upload success, handoff with md5 [" + id6 + "] lost!");
            return;
        }
        java.lang.Object obj = lVar.f302833d;
        com.tencent.mm.plugin.handoff.model.HandOffFile handOffFile = (com.tencent.mm.plugin.handoff.model.HandOffFile) obj;
        handOffFile.setAppId(appId);
        handOffFile.setSdkVersion(i17);
        handOffFile.setMediaId(mediaId);
        com.tencent.mm.plugin.handoff.model.HandOff handOff = (com.tencent.mm.plugin.handoff.model.HandOff) obj;
        g73.m2 m2Var = f269320p;
        m2Var.getClass();
        kotlin.jvm.internal.o.g(handOff, "handOff");
        m2Var.h(3, kz5.b0.c(handOff));
        bVar.remove(id6);
    }

    @Override // d73.i
    public void f6(com.tencent.mm.plugin.handoff.model.HandOff handOff) {
        kotlin.jvm.internal.o.g(handOff, "handOff");
        Ri(new g73.l0(handOff));
    }

    @Override // d73.i
    public void hb(com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo) {
        kotlin.jvm.internal.o.g(multiTaskInfo, "multiTaskInfo");
        Ri(new g73.m0(multiTaskInfo));
    }

    @Override // d73.i
    public void i9(java.util.List ballInfoList) {
        kotlin.jvm.internal.o.g(ballInfoList, "ballInfoList");
    }

    @Override // d73.i
    public void k8() {
        Ri(g73.u.f269333d);
    }

    @Override // d73.i
    public void mb(java.lang.String message) {
        kotlin.jvm.internal.o.g(message, "message");
        Ri(new g73.h0(message));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a0 A[EDGE_INSN: B:27:0x00a0->B:28:0x00a0 BREAK  A[LOOP:0: B:16:0x0070->B:34:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[LOOP:0: B:16:0x0070->B:34:?, LOOP_END, SYNTHETIC] */
    @Override // l75.q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onNotifyChange(java.lang.String r8, l75.w0 r9) {
        /*
            r7 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.o.g(r8, r0)
            java.lang.String r0 = "eventData"
            kotlin.jvm.internal.o.g(r9, r0)
            java.lang.Class<z30.w> r0 = z30.w.class
            i95.m r0 = i95.n0.c(r0)
            z30.w r0 = (z30.w) r0
            long r1 = java.lang.Long.parseLong(r8)
            y30.u r0 = (y30.u) r0
            r0.getClass()
            java.lang.Class<o72.f5> r8 = o72.f5.class
            i95.m r8 = i95.n0.c(r8)
            o72.f5 r8 = (o72.f5) r8
            com.tencent.mm.plugin.fav.o r8 = (com.tencent.mm.plugin.fav.o) r8
            o72.k4 r8 = r8.oj()
            o72.r2 r8 = r8.F(r1)
            if (r8 == 0) goto Lc8
            int r0 = r8.field_type
            r1 = 8
            if (r0 != r1) goto Lc8
            int r9 = r9.f316974b
            r0 = 3
            if (r9 != r0) goto Lc8
            r45.bq0 r9 = r8.field_favProto
            java.util.LinkedList r9 = r9.f370964f
            java.lang.String r0 = "dataList"
            kotlin.jvm.internal.o.f(r9, r0)
            java.lang.Object r9 = kz5.n0.Z(r9)
            r45.gp0 r9 = (r45.gp0) r9
            if (r9 == 0) goto Lc8
            java.lang.String r0 = r9.f375434s
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L5a
            int r0 = r0.length()
            if (r0 != 0) goto L58
            goto L5a
        L58:
            r0 = r1
            goto L5b
        L5a:
            r0 = r2
        L5b:
            if (r0 != 0) goto Lc8
            java.lang.String r0 = r9.M
            java.util.concurrent.ConcurrentHashMap r3 = g73.o0.f269314g
            java.util.Collection r3 = r3.values()
            java.lang.String r4 = "<get-values>(...)"
            kotlin.jvm.internal.o.f(r3, r4)
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L70:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L9f
            java.lang.Object r4 = r3.next()
            r5 = r4
            com.tencent.mm.plugin.handoff.model.HandOff r5 = (com.tencent.mm.plugin.handoff.model.HandOff) r5
            boolean r6 = r5 instanceof com.tencent.mm.plugin.handoff.model.HandOffFile
            if (r6 == 0) goto L9b
            com.tencent.mm.plugin.handoff.model.HandOffFile r5 = (com.tencent.mm.plugin.handoff.model.HandOffFile) r5
            java.lang.String r6 = r5.getMd5()
            boolean r6 = kotlin.jvm.internal.o.b(r6, r0)
            if (r6 == 0) goto L9b
            java.lang.String r5 = r5.getSvrId()
            java.lang.String r6 = "-1"
            boolean r5 = kotlin.jvm.internal.o.b(r5, r6)
            if (r5 == 0) goto L9b
            r5 = r2
            goto L9c
        L9b:
            r5 = r1
        L9c:
            if (r5 == 0) goto L70
            goto La0
        L9f:
            r4 = 0
        La0:
            com.tencent.mm.plugin.handoff.model.HandOff r4 = (com.tencent.mm.plugin.handoff.model.HandOff) r4
            if (r4 == 0) goto Lc8
            com.tencent.mm.plugin.handoff.model.HandOffFile r4 = (com.tencent.mm.plugin.handoff.model.HandOffFile) r4
            java.lang.String r0 = r9.f375434s
            java.lang.String r1 = "getCdnDataUrl(...)"
            kotlin.jvm.internal.o.f(r0, r1)
            r4.setCdnURL(r0)
            java.lang.String r9 = r9.f375438u
            java.lang.String r0 = "getCdnDataKey(...)"
            kotlin.jvm.internal.o.f(r9, r0)
            r4.setAesKey(r9)
            int r8 = r8.field_id
            java.lang.String r8 = java.lang.String.valueOf(r8)
            r4.setSvrId(r8)
            g73.o0 r8 = g73.o0.f269311d
            r8.Ni(r4)
        Lc8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g73.o0.onNotifyChange(java.lang.String, l75.w0):void");
    }

    @Override // d73.i
    public com.tencent.mm.plugin.handoff.model.HandOff rb(java.lang.String id6) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(id6, "id");
        java.util.Collection values = f269314g.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.o.b(((com.tencent.mm.plugin.handoff.model.HandOff) obj).getId(), id6)) {
                break;
            }
        }
        return (com.tencent.mm.plugin.handoff.model.HandOff) obj;
    }

    @Override // d73.i
    public com.tencent.mm.plugin.handoff.model.HandOff t1() {
        return f269312e;
    }

    @Override // d73.i
    public void t7(com.tencent.mm.plugin.handoff.model.HandOff handOff) {
        kotlin.jvm.internal.o.g(handOff, "handOff");
        Ri(new g73.c0(handOff));
    }

    @Override // d73.i
    public void tf(com.tencent.mm.plugin.handoff.model.HandOff handOff) {
        kotlin.jvm.internal.o.g(handOff, "handOff");
        Ri(new g73.e0(handOff));
    }

    @Override // d73.i
    public com.tencent.mm.plugin.handoff.model.HandOff uh(java.lang.String key) {
        kotlin.jvm.internal.o.g(key, "key");
        com.tencent.mm.plugin.handoff.model.HandOff handOff = (com.tencent.mm.plugin.handoff.model.HandOff) f269314g.get(key);
        if (handOff != null) {
            return handOff.copy();
        }
        return null;
    }

    @Override // d73.i
    public void va(java.lang.String key) {
        kotlin.jvm.internal.o.g(key, "key");
        Ri(new g73.i0(key));
    }

    @Override // d73.i
    public void vg(com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo) {
        kotlin.jvm.internal.o.g(multiTaskInfo, "multiTaskInfo");
        Ri(new g73.q(multiTaskInfo));
    }

    @Override // d73.i
    public void wd(java.util.List multiTaskInfoList) {
        kotlin.jvm.internal.o.g(multiTaskInfoList, "multiTaskInfoList");
        Ri(new g73.j0(multiTaskInfoList));
    }
}
