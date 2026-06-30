package h13;

@j95.b
/* loaded from: classes10.dex */
public final class l0 extends i95.w implements f13.e {

    /* renamed from: d, reason: collision with root package name */
    public boolean f278141d;

    /* renamed from: f, reason: collision with root package name */
    public long f278143f;

    /* renamed from: e, reason: collision with root package name */
    public jz5.l f278142e = new jz5.l(0L, "");

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f278144g = jz5.h.b(h13.h0.f278132d);

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f278145h = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f278146i = new java.util.concurrent.ConcurrentLinkedQueue();

    public static boolean Ui(h13.l0 l0Var, android.content.Context context, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
        }
        l0Var.getClass();
        kotlin.jvm.internal.o.g(context, "context");
        java.lang.Object systemService = context.getSystemService("audio");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        android.media.AudioManager audioManager = (android.media.AudioManager) systemService;
        com.tencent.mars.xlog.Log.i("MicroMsg.ForceNotifyService", "isSilentMode ringMode=" + audioManager.getRingerMode() + " RING_MODE_NORMAL=2");
        return audioManager.getRingerMode() != 2;
    }

    public static boolean Vi(h13.l0 l0Var, android.content.Context context, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
        }
        l0Var.getClass();
        kotlin.jvm.internal.o.g(context, "context");
        java.lang.Object systemService = context.getSystemService("audio");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        android.media.AudioManager audioManager = (android.media.AudioManager) systemService;
        com.tencent.mars.xlog.Log.i("MicroMsg.ForceNotifyService", "isVibrateMode ringMode=" + audioManager.getRingerMode() + " RINGER_MODE_SILENT=0");
        return audioManager.getRingerMode() > 0;
    }

    public long Ai(java.lang.String username) {
        kotlin.jvm.internal.o.g(username, "username");
        j13.a aVar = j13.a.f297177d;
        java.lang.String forcePushId = username.concat("@wxcontact");
        aVar.getClass();
        kotlin.jvm.internal.o.g(forcePushId, "forcePushId");
        com.tencent.mars.xlog.Log.i("MicroMsg.ForceNotifyStorage", "getExpiredTime(" + forcePushId + ')');
        i13.j jVar = new i13.j();
        jVar.field_ForcePushId = forcePushId;
        if (aVar.get(jVar, new java.lang.String[0])) {
            return jVar.field_ExpiredTime;
        }
        return 0L;
    }

    public final java.util.ArrayList Bi() {
        j13.a.f297177d.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.ForceNotifyStorage", "getList()");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.mm.storage.k4 Bi = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
        android.database.Cursor D = j13.a.f297178e.D("ForceNotifyData", new java.lang.String[]{"*"}, "ExpiredTime>?", new java.lang.String[]{java.lang.String.valueOf(c01.id.c())}, null, null, "ExpiredTime Desc", 2);
        if (D != null) {
            try {
                D.moveToFirst();
                while (!D.isAfterLast()) {
                    i13.j jVar = new i13.j();
                    jVar.convertFrom(D);
                    if (jVar.field_ForcePushId != null) {
                        Bi.m(jVar.field_UserName);
                        arrayList.add(jVar);
                        com.tencent.mars.xlog.Log.i("MicroMsg.ForceNotifyStorage", "add List:%s", jVar);
                        java.util.concurrent.ConcurrentHashMap concurrentHashMap = j13.a.f297179f;
                        java.lang.String field_ForcePushId = jVar.field_ForcePushId;
                        kotlin.jvm.internal.o.f(field_ForcePushId, "field_ForcePushId");
                        concurrentHashMap.put(field_ForcePushId, jVar);
                    }
                    D.moveToNext();
                }
                vz5.b.a(D, null);
            } finally {
            }
        }
        return arrayList;
    }

    public final java.lang.String Di(java.lang.String str) {
        return ".sysmsg" + str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004a, code lost:
    
        if ((r2.field_Status == 1) != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009a, code lost:
    
        if ((r5.field_Status == 1) != false) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean Ni(java.lang.String r15) {
        /*
            r14 = this;
            java.lang.String r0 = "forcePushId"
            kotlin.jvm.internal.o.g(r15, r0)
            j13.a r0 = j13.a.f297177d
            r0.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "isNeedNotify("
            r0.<init>(r1)
            r0.append(r15)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.ForceNotifyStorage"
            com.tencent.mars.xlog.Log.i(r1, r0)
            java.util.concurrent.ConcurrentHashMap r0 = j13.a.f297179f
            boolean r2 = r0.isEmpty()
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L4f
            java.lang.Object r2 = r0.get(r15)
            i13.j r2 = (i13.j) r2
            if (r2 == 0) goto L4f
            long r0 = c01.id.a()
            long r5 = r2.field_ExpiredTime
            int r15 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r15 < 0) goto L40
            r15 = r3
            goto L41
        L40:
            r15 = r4
        L41:
            if (r15 != 0) goto L4d
            int r15 = r2.field_Status
            if (r15 != r3) goto L49
            r15 = r3
            goto L4a
        L49:
            r15 = r4
        L4a:
            if (r15 == 0) goto L4d
            goto La3
        L4d:
            r3 = r4
            goto La3
        L4f:
            l75.k0 r5 = j13.a.f297178e
            java.lang.String r6 = "ForceNotifyData"
            java.lang.String r2 = "*"
            java.lang.String[] r7 = new java.lang.String[]{r2}
            java.lang.String r8 = "ForcePushId=?"
            java.lang.String[] r9 = new java.lang.String[]{r15}
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 2
            android.database.Cursor r2 = r5.D(r6, r7, r8, r9, r10, r11, r12, r13)
            if (r2 == 0) goto Laf
            boolean r5 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L9d
            r6 = 0
            if (r5 == 0) goto La5
            i13.j r5 = new i13.j     // Catch: java.lang.Throwable -> L9d
            r5.<init>()     // Catch: java.lang.Throwable -> L9d
            r5.convertFrom(r2)     // Catch: java.lang.Throwable -> L9d
            r0.put(r15, r5)     // Catch: java.lang.Throwable -> L9d
            java.lang.String r0 = "[isNeedNotify] forcePushId:%s %s"
            java.lang.Object[] r15 = new java.lang.Object[]{r15, r5}     // Catch: java.lang.Throwable -> L9d
            com.tencent.mars.xlog.Log.i(r1, r0, r15)     // Catch: java.lang.Throwable -> L9d
            long r0 = c01.id.a()     // Catch: java.lang.Throwable -> L9d
            long r7 = r5.field_ExpiredTime     // Catch: java.lang.Throwable -> L9d
            int r15 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r15 < 0) goto L90
            r15 = r3
            goto L91
        L90:
            r15 = r4
        L91:
            if (r15 != 0) goto L9f
            int r15 = r5.field_Status     // Catch: java.lang.Throwable -> L9d
            if (r15 != r3) goto L99
            r15 = r3
            goto L9a
        L99:
            r15 = r4
        L9a:
            if (r15 == 0) goto L9f
            goto La0
        L9d:
            r15 = move-exception
            goto La9
        L9f:
            r3 = r4
        La0:
            vz5.b.a(r2, r6)
        La3:
            r4 = r3
            goto Laf
        La5:
            vz5.b.a(r2, r6)
            goto Laf
        La9:
            throw r15     // Catch: java.lang.Throwable -> Laa
        Laa:
            r0 = move-exception
            vz5.b.a(r2, r15)
            throw r0
        Laf:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: h13.l0.Ni(java.lang.String):boolean");
    }

    public final boolean Ri() {
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("keyguard");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.app.KeyguardManager");
        return ((android.app.KeyguardManager) systemService).inKeyguardRestrictedInputMode();
    }

    public final void Zi(i13.j info, boolean z17) {
        boolean d17;
        kotlin.jvm.internal.o.g(info, "info");
        if (z17) {
            j13.a aVar = j13.a.f297177d;
            aVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.ForceNotifyStorage", "set(" + info.field_ForcePushId + ')');
            if (j13.a.f297178e.m("ForceNotifyData", "UserName", info.convertTo()) >= 0) {
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = j13.a.f297179f;
                java.lang.String field_ForcePushId = info.field_ForcePushId;
                kotlin.jvm.internal.o.f(field_ForcePushId, "field_ForcePushId");
                concurrentHashMap.put(field_ForcePushId, info);
                aVar.doNotify();
                java.lang.String field_ForcePushId2 = info.field_ForcePushId;
                kotlin.jvm.internal.o.f(field_ForcePushId2, "field_ForcePushId");
                bn0.g.f22779a.k(field_ForcePushId2, new bn0.b(field_ForcePushId2, info.field_CreateTime, info.field_ExpiredTime, info.field_Status, info.field_Type));
                d17 = true;
            } else {
                d17 = false;
            }
        } else {
            java.lang.Long valueOf = java.lang.Long.valueOf(c01.id.c());
            java.lang.String field_ForcePushId3 = info.field_ForcePushId;
            this.f278142e = new jz5.l(valueOf, field_ForcePushId3);
            j13.a aVar2 = j13.a.f297177d;
            kotlin.jvm.internal.o.f(field_ForcePushId3, "field_ForcePushId");
            d17 = aVar2.d(field_ForcePushId3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ForceNotifyService", "[onNewXmlReceived] ret:%s isAdd:%s info:%s", java.lang.Boolean.valueOf(d17), java.lang.Boolean.valueOf(z17), info);
    }

    public final void aj(i13.o item) {
        kotlin.jvm.internal.o.g(item, "item");
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_finder_live_lock_phone_notification_switch, 0) > 0;
        boolean Ri = Ri();
        if (Ri && !z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ForceNotifyService", "[onReceiveLiveForcePush] phone is locking and cloud switch is not enable , noticeId=" + item.f287309s);
        } else {
            i13.n.f287297c.a().a(item);
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).ml(pm0.v.Z(item.f287302i), item.f287304n, 0, true, false, "", null);
            if (Ri) {
                hj(false);
            } else {
                ij();
            }
        }
    }

    public i13.o bj(java.lang.String str) {
        java.lang.String str2;
        java.lang.String str3 = "";
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(str, "general_string", null);
        if (d17 != null && (str2 = (java.lang.String) d17.get(".general_string")) != null) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
                java.lang.String optString = jSONObject.optString("feed_id");
                java.lang.String optString2 = jSONObject.optString("nonce_id");
                java.lang.String optString3 = jSONObject.optString("live_id");
                java.lang.String optString4 = jSONObject.optString("force_push_info");
                kotlin.jvm.internal.o.d(optString4);
                boolean z17 = true;
                if (optString4.length() == 0) {
                    return null;
                }
                org.json.JSONObject jSONObject2 = new org.json.JSONObject(optString4);
                java.lang.String optString5 = jSONObject2.optString("forcePushId");
                java.lang.String optString6 = jSONObject2.optString("userIcon");
                java.lang.String optString7 = jSONObject2.optString("extinfo");
                kotlin.jvm.internal.o.d(optString7);
                if (optString7.length() != 0) {
                    z17 = false;
                }
                if (z17) {
                    return null;
                }
                org.json.JSONObject jSONObject3 = new org.json.JSONObject(optString7);
                java.lang.String optString8 = jSONObject3.optString("auth_icon_url", "");
                java.lang.String optString9 = jSONObject3.optString("nickname", "");
                java.lang.String optString10 = jSONObject3.optString("notify_wording", "");
                java.lang.String optString11 = jSONObject2.optString("subject");
                java.lang.String str4 = optString11 == null ? "" : optString11;
                java.lang.String optString12 = jSONObject2.optString("noticeId");
                if (optString12 != null) {
                    str3 = optString12;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.ForceNotifyService", "parseLiveForcePushItem forcePushId:" + optString5 + ", noticeId:" + str3);
                kotlin.jvm.internal.o.d(optString5);
                kotlin.jvm.internal.o.d(optString6);
                kotlin.jvm.internal.o.d(optString9);
                java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.few);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                kotlin.jvm.internal.o.d(optString);
                kotlin.jvm.internal.o.d(optString3);
                kotlin.jvm.internal.o.d(optString2);
                return new i13.o(optString5, optString6, optString9, string, optString, optString3, optString2, optString10, optString8, str4, null, str3, null, 0, null);
            } catch (java.lang.Exception unused) {
            }
        }
        return null;
    }

    public void cj(boolean z17) {
        this.f278141d = z17;
    }

    public void fj(java.lang.String str) {
        if (str == null) {
            return;
        }
        if (!com.tencent.mars.comm.NetStatusUtil.isNetworkConnected(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            j13.a.f297177d.doNotify();
            return;
        }
        r45.i4 i4Var = new r45.i4();
        i4Var.f376716d = str.concat("@wxcontact");
        i4Var.f376717e = 10800;
        ((e21.f) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).aj()).b(new xg3.p0(213, i4Var));
        j13.a aVar = j13.a.f297177d;
        java.lang.String ForcePushId = i4Var.f376716d;
        kotlin.jvm.internal.o.f(ForcePushId, "ForcePushId");
        aVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.ForceNotifyStorage", "set(" + str + ", " + ForcePushId + ')');
        i13.j jVar = new i13.j();
        jVar.field_UserName = str;
        jVar.field_ForcePushId = ForcePushId;
        long c17 = c01.id.c();
        jVar.field_CreateTime = c17;
        jVar.field_ExpiredTime = c17 + 10800000;
        boolean z17 = true;
        jVar.field_Status = 1;
        if (j13.a.f297178e.m("ForceNotifyData", "UserName", jVar.convertTo()) >= 0) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = j13.a.f297179f;
            java.lang.String field_ForcePushId = jVar.field_ForcePushId;
            kotlin.jvm.internal.o.f(field_ForcePushId, "field_ForcePushId");
            concurrentHashMap.put(field_ForcePushId, jVar);
            aVar.doNotify();
            java.lang.String field_ForcePushId2 = jVar.field_ForcePushId;
            kotlin.jvm.internal.o.f(field_ForcePushId2, "field_ForcePushId");
            bn0.g.f22779a.k(field_ForcePushId2, new bn0.b(field_ForcePushId2, jVar.field_CreateTime, jVar.field_ExpiredTime, jVar.field_Status, jVar.field_Type));
        } else {
            z17 = false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ForceNotifyService", "[setting] " + str + " ret:%s", java.lang.Boolean.valueOf(z17));
    }

    public final void hj(boolean z17) {
        java.lang.String n07 = com.tencent.mm.sdk.platformtools.t8.n0(com.tencent.mm.sdk.platformtools.x2.f193071a);
        com.tencent.mars.xlog.Log.i("MicroMsg.ForceNotifyService", "clazzName:ForceNotifyShowUI topActivityName:" + n07);
        if (!z17 && kotlin.jvm.internal.o.b("ForceNotifyShowUI", n07)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ForceNotifyService", "showNotifyActivity add to pendingQueue");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ForceNotifyService", "showNotifyActivity first show");
        android.content.Intent intent = new android.content.Intent(com.tencent.mm.sdk.platformtools.x2.f193071a, (java.lang.Class<?>) com.tencent.mm.plugin.forcenotify.ui.ForceNotifyShowUI.class);
        intent.addFlags(268435456);
        com.tencent.mars.xlog.Log.i("MicroMsg.ForceNotifyService", "[notifyShow]");
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/forcenotify/core/ForceNotifyService", "showNotifyActivity", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/forcenotify/core/ForceNotifyService", "showNotifyActivity", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void ij() {
        i13.c cVar = (i13.c) i13.n.f287297c.a().f287299a.poll();
        if (cVar != null) {
            k13.n0 n0Var = k13.l1.I;
            n0Var.a().f(cVar);
            n0Var.a().c();
        }
    }

    public void wi(java.lang.String str, int i17) {
        if (str == null) {
            return;
        }
        if (!com.tencent.mars.comm.NetStatusUtil.isNetworkConnected(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            j13.a.f297177d.doNotify();
            return;
        }
        r45.fc0 fc0Var = new r45.fc0();
        fc0Var.f374194d = str;
        fc0Var.f374195e = i17;
        ((e21.f) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).aj()).b(new xg3.p0(214, fc0Var));
        com.tencent.mars.xlog.Log.i("MicroMsg.ForceNotifyService", "[delete] ".concat(str));
    }
}
