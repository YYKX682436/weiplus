package ew;

/* loaded from: classes11.dex */
public final class m implements io.flutter.embedding.engine.plugins.FlutterPlugin, io.flutter.embedding.engine.plugins.activity.ActivityAware, com.tencent.pigeon.brand_service.BrsConversationListApi, l75.z0 {

    /* renamed from: d, reason: collision with root package name */
    public android.app.Activity f256988d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.pigeon.brand_service.BrsConversationListCallbackApi f256989e;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Runnable f256991g;

    /* renamed from: f, reason: collision with root package name */
    public final android.os.Handler f256990f = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: h, reason: collision with root package name */
    public final long f256992h = 200;

    public static final com.tencent.pigeon.brand_service.BrsConversation a(ew.m mVar, android.database.Cursor cursor) {
        mVar.getClass();
        com.tencent.mm.storage.z3 z3Var = new com.tencent.mm.storage.z3();
        z3Var.convertFrom(cursor);
        com.tencent.mm.storage.l4 l4Var = new com.tencent.mm.storage.l4();
        l4Var.convertFrom(cursor);
        return new com.tencent.pigeon.brand_service.BrsConversation(z3Var.d1(), z3Var.P0(), l4Var.y0(), java.lang.Long.valueOf(l4Var.w0() / 1000), java.lang.Long.valueOf(z3Var.f1()), java.lang.Boolean.valueOf((z3Var.getType() & 2048) != 0), java.lang.Long.valueOf(z3Var.getCreateTime()));
    }

    public static final android.database.Cursor b(ew.m mVar, int i17, int i18, int i19) {
        mVar.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append("select rcontact.username, rcontact.nickname, rcontact.verifyFlag, bizinfo.type, rcontact.type, rcontact.createTime, rcontact.lvbuff, rconversation.digest, rconversation.conversationTime from rcontact left join bizinfo on rcontact.username = bizinfo.username left join rconversation on rcontact.username = rconversation.username");
        mVar.d(sb6);
        mVar.c(sb6);
        if (i17 >= 0) {
            sb6.append(" order by ");
            sb6.append(" case when (rcontact.type & 2048) != 0 then 1 else 0 end desc, ");
            if (i17 == 0) {
                sb6.append("conversationTime desc ");
            } else {
                sb6.append("createTime desc ");
            }
        }
        sb6.append(" LIMIT ");
        sb6.append(i19);
        sb6.append(" OFFSET ");
        sb6.append(i18);
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return gm0.j1.u().f273153f.f(sb7, null, 2);
    }

    public final void c(java.lang.StringBuilder sb6) {
        java.util.List<java.lang.String> V0 = kz5.n0.V0(c01.e2.i());
        java.util.ArrayList arrayList = (java.util.ArrayList) V0;
        arrayList.add("weixin");
        arrayList.add("gh_9639b5a92773");
        arrayList.add("gh_43f2581f6fd6");
        arrayList.addAll(com.tencent.mm.storage.z3.u3());
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_minishop_plugin_enabled, 1) == 1) {
            arrayList.add("gh_579db1f2cf89");
        }
        arrayList.add("gh_051d9102de63");
        arrayList.add("gh_25d9ac85a4bc");
        for (java.lang.String str : V0) {
            sb6.append(" and ");
            sb6.append("rcontact");
            sb6.append(".");
            sb6.append(dm.i4.COL_USERNAME);
            sb6.append(" != '");
            sb6.append(str);
            sb6.append("'");
        }
    }

    public final void d(java.lang.StringBuilder sb6) {
        sb6.append(" where (");
        sb6.append("rcontact");
        sb6.append(".");
        sb6.append("verifyFlag");
        sb6.append(" & ");
        com.tencent.mm.sdk.platformtools.r2 r2Var = com.tencent.mm.storage.z3.M2;
        sb6.append(8);
        sb6.append(") != 0 ");
        sb6.append(" and (");
        sb6.append("rcontact");
        sb6.append(".");
        sb6.append("type");
        sb6.append(" & ");
        sb6.append(1);
        sb6.append(") != 0 ");
        sb6.append(" and ");
        sb6.append("bizinfo");
        sb6.append(".");
        sb6.append("type");
        sb6.append(" = ");
        sb6.append(1);
    }

    @Override // com.tencent.pigeon.brand_service.BrsConversationListApi
    public void doSearch() {
        zv.q.f476079a.a();
    }

    @Override // com.tencent.pigeon.brand_service.BrsConversationListApi
    public void enterChatting(java.lang.String username) {
        kotlin.jvm.internal.o.g(username, "username");
        com.tencent.mm.storage.l4 p17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p(username);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Chat_User", username);
        intent.putExtra("finish_direct", true);
        intent.putExtra("biz_click_item_unread_count", p17 != null ? p17.d1() : 0);
        intent.putExtra("specific_chat_from_scene", 14);
        intent.putExtra("KOpenArticleSceneFromScene", 287);
        if (this.f256988d != null) {
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.j(intent, this.f256988d);
        }
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        if ((a1Var instanceof com.tencent.mm.storage.e8) && (obj instanceof java.lang.String)) {
            long j17 = this.f256992h;
            android.os.Handler handler = this.f256990f;
            if (i17 == 2 || i17 == 3) {
                com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n((java.lang.String) obj, true);
                if (n17 != null) {
                    java.lang.String str = "update Brand Service :" + n17.d1();
                    if (this.f256991g != null) {
                        return;
                    }
                    ew.k kVar = new ew.k(this, str);
                    this.f256991g = kVar;
                    handler.postDelayed(kVar, j17);
                    return;
                }
                return;
            }
            if (i17 != 5) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FlutterBrsConversationPlugin", "Unhandled storage event: " + i17 + " for " + obj);
                return;
            }
            java.lang.String str2 = com.tencent.tinker.loader.shareutil.ShareConstants.RES_DEL_TITLE + obj;
            if (this.f256991g != null) {
                return;
            }
            ew.k kVar2 = new ew.k(this, str2);
            this.f256991g = kVar2;
            handler.postDelayed(kVar2, j17);
        }
    }

    @Override // com.tencent.pigeon.brand_service.BrsConversationListApi
    public long getConversationCount() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append("select count(*) from rcontact left join bizinfo on rcontact.username = bizinfo.username");
        d(sb6);
        c(sb6);
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        android.database.Cursor f17 = gm0.j1.u().f273153f.f(sb7, null, 2);
        int i17 = f17.moveToFirst() ? f17.getInt(0) : 0;
        f17.close();
        return i17;
    }

    @Override // com.tencent.pigeon.brand_service.BrsConversationListApi
    public void getConversationListOrderByCreateTime(long j17, long j18, yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, kotlinx.coroutines.q1.f310570c, null, new ew.g(this, j17 < 0 ? 0 : (int) j17, j18, new java.util.ArrayList(), callback, null), 2, null);
    }

    @Override // com.tencent.pigeon.brand_service.BrsConversationListApi
    public void getConversationListOrderByUpdateTime(long j17, long j18, yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, kotlinx.coroutines.q1.f310570c, null, new ew.i(this, j17 < 0 ? 0 : (int) j17, j18, new java.util.ArrayList(), callback, null), 2, null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        this.f256988d = binding.getActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.brand_service.BrsConversationListApi.Companion companion = com.tencent.pigeon.brand_service.BrsConversationListApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.brand_service.BrsConversationListApi.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
        io.flutter.plugin.common.BinaryMessenger binaryMessenger2 = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger2, "getBinaryMessenger(...)");
        this.f256989e = new com.tencent.pigeon.brand_service.BrsConversationListCallbackApi(binaryMessenger2, null, 2, null);
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().a(this);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        this.f256988d = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        this.f256988d = null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.brand_service.BrsConversationListApi.Companion companion = com.tencent.pigeon.brand_service.BrsConversationListApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.brand_service.BrsConversationListApi.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
        this.f256989e = null;
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().e(this);
        java.lang.Runnable runnable = this.f256991g;
        if (runnable != null) {
            this.f256990f.removeCallbacks(runnable);
        }
        this.f256991g = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        this.f256988d = binding.getActivity();
    }

    @Override // com.tencent.pigeon.brand_service.BrsConversationListApi
    public void unSubscribeContact(java.lang.String username) {
        kotlin.jvm.internal.o.g(username, "username");
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(username, true);
        qk.o b17 = r01.q3.cj().b1(username);
        qk.n6 n6Var = (qk.n6) i95.n0.c(qk.n6.class);
        android.app.Activity activity = this.f256988d;
        ew.l lVar = new ew.l(username);
        ((com.tencent.mm.app.o7) n6Var).getClass();
        com.tencent.mm.ui.tools.n1.b(b17, activity, n17, false, lVar, 2);
    }
}
