package lx;

/* loaded from: classes11.dex */
public final class v2 implements io.flutter.embedding.engine.plugins.FlutterPlugin, io.flutter.embedding.engine.plugins.activity.ActivityAware, com.tencent.pigeon.biz.PrivateMsgHostApi {

    /* renamed from: d, reason: collision with root package name */
    public android.app.Activity f321978d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f321980f;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.pigeon.biz.BizPhotoPrivateMsgCallbackApi f321982h;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f321979e = "";

    /* renamed from: g, reason: collision with root package name */
    public final android.os.Handler f321981g = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: i, reason: collision with root package name */
    public final lx.r2 f321983i = new lx.r2(this);

    /* renamed from: m, reason: collision with root package name */
    public final lx.p2 f321984m = new lx.p2(this);

    public static final /* synthetic */ java.lang.String a(lx.v2 v2Var) {
        v2Var.getClass();
        return "MicroMsg.FlutterBizPhotoPrivateMsgPlugin";
    }

    public static final void b(lx.v2 v2Var, hr1.e eVar) {
        com.tencent.pigeon.biz.BizPhotoPrivateMsgCallbackApi bizPhotoPrivateMsgCallbackApi = v2Var.f321982h;
        if (bizPhotoPrivateMsgCallbackApi == null) {
            return;
        }
        try {
            com.tencent.pigeon.biz.PrivateMsgSessionInfo e17 = v2Var.e(eVar);
            if (e17 == null) {
                return;
            }
            bizPhotoPrivateMsgCallbackApi.onPrivateMsgSessionChanged(e17, new lx.t2(v2Var));
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FlutterBizPhotoPrivateMsgPlugin", "notifySessionChanged error: " + e18.getMessage());
        }
    }

    public final boolean c(java.lang.String str) {
        if (str.length() == 0) {
            return false;
        }
        return jr1.i.f301360a.a(str, 5);
    }

    @Override // com.tencent.pigeon.biz.PrivateMsgHostApi
    public void clearGreetBoxRedDot(long j17, yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        try {
            dr1.a.f242584a.b((int) j17);
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(java.lang.Boolean.TRUE)));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FlutterBizPhotoPrivateMsgPlugin", "clearGreetBoxRedDot error: " + e17.getMessage());
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(e17))));
        }
    }

    public final nr1.f d() {
        nr1.f Vi = yq1.u0.Vi();
        kotlin.jvm.internal.o.f(Vi, "getBizPhotoFansConversationStorage(...)");
        return Vi;
    }

    @Override // com.tencent.pigeon.biz.PrivateMsgHostApi
    public void deletePrivateMsgSession(java.lang.String sessionId, java.lang.String bizuin, yz5.l callback) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        kotlin.jvm.internal.o.g(bizuin, "bizuin");
        kotlin.jvm.internal.o.g(callback, "callback");
        if (!c(bizuin)) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new java.lang.IllegalStateException("NOT_LOGIN")))));
            return;
        }
        hr1.e z07 = yq1.u0.Vi().z0(sessionId);
        boolean deleteNotify = yq1.u0.Vi().deleteNotify(z07.systemRowid, false);
        if (deleteNotify) {
            yq1.u0.Zi().y0(sessionId, false);
            yq1.u0.Vi().doNotify(sessionId, 6, z07);
            nr1.b Ui = yq1.u0.Ui();
            hr1.a aVar = new hr1.a();
            aVar.field_openid = z07.field_talker;
            Ui.delete(aVar, new java.lang.String[0]);
        }
        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
        callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(java.lang.Boolean.valueOf(deleteNotify))));
    }

    public final com.tencent.pigeon.biz.PrivateMsgSessionInfo e(hr1.e eVar) {
        java.lang.String str;
        lx.v2 v2Var;
        java.lang.String obj;
        java.lang.Object b17;
        java.lang.String str2 = eVar.field_sessionId;
        if (str2 == null || str2.length() == 0) {
            return null;
        }
        eVar.u0();
        java.lang.String str3 = eVar.field_digest;
        java.lang.Object obj2 = "";
        if (str3 == null) {
            v2Var = this;
            str = "";
        } else {
            str = str3;
            v2Var = this;
        }
        android.content.Context context = v2Var.f321978d;
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        kotlin.jvm.internal.o.d(context);
        if (eVar.field_status == 1) {
            obj = context.getString(com.tencent.mm.R.string.f490735n53);
            kotlin.jvm.internal.o.f(obj, "getString(...)");
        } else {
            obj = k35.m1.f(context, eVar.field_updateTime, true, false).toString();
        }
        java.lang.String str4 = obj;
        long j17 = eVar.field_unReadCount;
        java.lang.String str5 = eVar.field_selfBiz;
        java.lang.String str6 = eVar.field_sessionId;
        if (!(str6 == null || str6.length() == 0) && (kotlin.jvm.internal.o.b(str6, "bizfansgreetholder@bizfansmsg") || kotlin.jvm.internal.o.b(str6, "bizphotofansgreetholder@picfansmsg"))) {
            java.lang.String field_sessionId = eVar.field_sessionId;
            kotlin.jvm.internal.o.f(field_sessionId, "field_sessionId");
            java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492053o13);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            long j18 = eVar.field_updateTime;
            kotlin.jvm.internal.o.d(str5);
            return new com.tencent.pigeon.biz.PrivateMsgSessionInfo(field_sessionId, string, "", str, j18, str4, j17, str5, -1L, 5, 0L, true);
        }
        if (eVar.field_type == 1) {
            java.lang.String d17 = jr1.j.d(java.lang.String.valueOf(eVar.Z));
            long j19 = eVar.field_updateTime;
            kotlin.jvm.internal.o.d(str5);
            return new com.tencent.pigeon.biz.PrivateMsgSessionInfo("photoAccountOfficial", d17, "", str, j19, str4, j17, str5, -1L, -1L, 0L, false);
        }
        i95.m c17 = i95.n0.c(zq1.u.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        hr1.a eb6 = zq1.u.eb((zq1.u) c17, eVar.field_sessionId, 5, 0, 4, null);
        java.lang.String str7 = eVar.field_sessionId;
        java.lang.String d18 = jr1.j.d(java.lang.String.valueOf(eVar.Z));
        java.lang.String str8 = eb6 != null ? eb6.field_headImgUrl : null;
        if (str8 == null) {
            str8 = "";
        }
        hr1.d dVar = eVar.f283346x0;
        if (dVar != null && (b17 = dVar.b(eVar)) != null) {
            obj2 = b17;
        }
        java.lang.String obj3 = obj2.toString();
        long j27 = eVar.field_updateTime;
        long j28 = eb6 != null ? eb6.field_serviceType : 0;
        long j29 = eb6 != null ? eb6.field_identityType : 0L;
        long j37 = eVar.field_isGreetSession;
        kotlin.jvm.internal.o.d(str7);
        kotlin.jvm.internal.o.d(str5);
        return new com.tencent.pigeon.biz.PrivateMsgSessionInfo(str7, d18, str8, obj3, j27, str4, j17, str5, j29, j28, j37, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00db A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b6 A[SYNTHETIC] */
    @Override // com.tencent.pigeon.biz.PrivateMsgHostApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void getPrivateMsgSessionList(java.lang.String r9, yz5.l r10) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lx.v2.getPrivateMsgSessionList(java.lang.String, yz5.l):void");
    }

    @Override // com.tencent.pigeon.biz.PrivateMsgHostApi
    public void getPrivateMsgUnreadCount(java.lang.String bizuin, yz5.l callback) {
        kotlin.jvm.internal.o.g(bizuin, "bizuin");
        kotlin.jvm.internal.o.g(callback, "callback");
        if (!c(bizuin)) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(0L)));
            return;
        }
        nr1.f d17 = d();
        rm.d0 d0Var = (rm.d0) i95.n0.c(rm.d0.class);
        tk.s[] sVarArr = tk.s.f419870d;
        java.lang.String selfBiz = jr1.j.c(((ox.r) d0Var).Bi(2).c());
        kotlin.jvm.internal.o.g(selfBiz, "selfBiz");
        android.database.Cursor B = d17.f339148d.B("SELECT sum(unReadCount)\nFROM BizPhotoFansConversation\nWHERE selfBiz = ?\nAND type = ?", new java.lang.String[]{selfBiz, java.lang.String.valueOf(0)});
        if (B != null) {
            try {
                r1 = B.moveToFirst() ? B.getInt(0) : 0;
                vz5.b.a(B, null);
            } finally {
            }
        }
        com.tencent.mars.xlog.Log.i("BizPhotoFans.ConversationStorage", "[getAllUnreadCount] type=0 selfBiz:" + selfBiz + " count=" + r1);
        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
        callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(java.lang.Long.valueOf((long) r1))));
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        this.f321978d = binding.getActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.biz.PrivateMsgHostApi.Companion companion = com.tencent.pigeon.biz.PrivateMsgHostApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.biz.PrivateMsgHostApi.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
        io.flutter.plugin.common.BinaryMessenger binaryMessenger2 = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger2, "getBinaryMessenger(...)");
        this.f321982h = new com.tencent.pigeon.biz.BizPhotoPrivateMsgCallbackApi(binaryMessenger2, null, 2, null);
        ((br1.m) ((zq1.u) i95.n0.c(zq1.u.class))).getClass();
        rm.d0 d0Var = (rm.d0) i95.n0.c(rm.d0.class);
        tk.s[] sVarArr = tk.s.f419870d;
        ((ox.r) d0Var).Bi(2).d(br1.l.f23621a);
        jr1.i iVar = jr1.i.f301360a;
        iVar.b();
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_biz_fans_greet_box_enable, 0) == 1) {
            ((ku5.t0) ku5.t0.f312615d).q(lx.u2.f321967d);
        }
        this.f321979e = iVar.c(5);
        this.f321980f = false;
        d().add(this.f321983i);
        yq1.u0.Ui().add(this.f321984m);
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterBizPhotoPrivateMsgPlugin", "onAttachedToEngine, curBiz=" + this.f321979e);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        this.f321978d = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        this.f321978d = null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.biz.PrivateMsgHostApi.Companion companion = com.tencent.pigeon.biz.PrivateMsgHostApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.biz.PrivateMsgHostApi.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
        this.f321982h = null;
        d().remove(this.f321983i);
        yq1.u0.Ui().remove(this.f321984m);
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterBizPhotoPrivateMsgPlugin", "onDetachedFromEngine, curBiz=" + this.f321979e);
    }

    @Override // com.tencent.pigeon.biz.PrivateMsgHostApi
    public void onPrivateMsgSettingChanged(java.lang.String bizuin, boolean z17, yz5.l callback) {
        kotlin.jvm.internal.o.g(bizuin, "bizuin");
        kotlin.jvm.internal.o.g(callback, "callback");
        if (!c(bizuin)) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new java.lang.IllegalStateException("NOT_LOGIN")))));
            return;
        }
        if (z17) {
            yq1.u0.Vi().y0(jr1.j.c(bizuin));
            ((gr1.h) ((gr1.n) ((rk.g) i95.n0.c(rk.g.class))).wi()).b(5);
        }
        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
        callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(java.lang.Boolean.TRUE)));
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        this.f321978d = binding.getActivity();
    }

    @Override // com.tencent.pigeon.biz.PrivateMsgHostApi
    public void openPrivateMsgChat(java.lang.String sessionId, java.lang.String bizuin, yz5.l callback) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        kotlin.jvm.internal.o.g(bizuin, "bizuin");
        kotlin.jvm.internal.o.g(callback, "callback");
        if (!c(bizuin)) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new java.lang.IllegalStateException("NOT_LOGIN")))));
            return;
        }
        if (kotlin.jvm.internal.o.b(sessionId, "photoAccountOfficial")) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FlutterBizPhotoPrivateMsgPlugin", "OFFICIAL_NOTICE_SESSION_ID not support");
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new java.lang.IllegalStateException("OFFICIAL_NOTICE_SESSION_ID NOT_SUPPORT")))));
            return;
        }
        android.content.Context context = this.f321978d;
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        hr1.e z07 = d().z0(sessionId);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Chat_User", z07.field_sessionId);
        intent.putExtra("Chat_Self", z07.field_selfBiz);
        intent.putExtra("finish_direct", true);
        intent.putExtra("img_gallery_enter_from_chatting_ui", true);
        yn.g.a(intent, com.tencent.mm.plugin.brandservice.ui.chatting.component.ChattingBizFansComponent.class);
        j45.l.u(context, ".ui.chatting.ChattingUI", intent, null);
        kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
        callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(java.lang.Boolean.TRUE)));
    }
}
