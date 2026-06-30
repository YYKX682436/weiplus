package lx;

/* loaded from: classes11.dex */
public final class u implements io.flutter.embedding.engine.plugins.FlutterPlugin, io.flutter.embedding.engine.plugins.activity.ActivityAware, com.tencent.pigeon.biz.ConversationListApi, l75.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final int f321956d;

    /* renamed from: e, reason: collision with root package name */
    public android.app.Activity f321957e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.pigeon.biz.ConversationListCallbackApi f321958f;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Runnable f321960h;

    /* renamed from: g, reason: collision with root package name */
    public final android.os.Handler f321959g = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: i, reason: collision with root package name */
    public final long f321961i = 200;

    /* renamed from: m, reason: collision with root package name */
    public final lx.m f321962m = new lx.m(this);

    public u(int i17) {
        this.f321956d = i17;
    }

    public static final com.tencent.pigeon.biz.Conversation a(lx.u uVar, android.database.Cursor cursor) {
        uVar.getClass();
        com.tencent.mm.storage.z3 z3Var = new com.tencent.mm.storage.z3();
        z3Var.convertFrom(cursor);
        kr1.a aVar = new kr1.a();
        aVar.convertFrom(cursor);
        return new com.tencent.pigeon.biz.Conversation(z3Var.d1(), z3Var.P0(), aVar.field_digest, java.lang.Long.valueOf(aVar.field_updateTime), java.lang.Long.valueOf(z3Var.f1()), java.lang.Boolean.valueOf((z3Var.getType() & 2048) != 0), java.lang.Long.valueOf(z3Var.getCreateTime()));
    }

    public static final android.database.Cursor b(lx.u uVar, int i17, int i18, int i19) {
        uVar.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append("select rcontact.username, rcontact.nickname, rcontact.verifyFlag, bizinfo.type, rcontact.type, rcontact.createTime, rcontact.lvbuff, BizFollowedContactDigest.updateTime, BizFollowedContactDigest.digest from rcontact left join bizinfo on rcontact.username = bizinfo.username left join BizFollowedContactDigest on rcontact.username = BizFollowedContactDigest.bizUsername");
        uVar.d(sb6);
        uVar.c(sb6);
        if (i17 >= 0) {
            sb6.append(" order by ");
            sb6.append(" case when (rcontact.type & 2048) != 0 then 1 else 0 end desc, ");
            if (i17 == 0) {
                sb6.append("BizFollowedContactDigest.updateTime desc ");
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

    @Override // com.tencent.pigeon.biz.ConversationListApi
    public void addToPreload(java.lang.String url, long j17, long j18) {
        kotlin.jvm.internal.o.g(url, "url");
        ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).d(url, (int) j17, (int) j18, new java.lang.Object[0]);
    }

    public final void c(java.lang.StringBuilder sb6) {
        java.util.ArrayList arrayList = (java.util.ArrayList) kz5.n0.V0(c01.e2.i());
        arrayList.add("gh_9639b5a92773");
        if (!r0.isEmpty()) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                sb6.append(" and ");
                sb6.append("rcontact");
                sb6.append(".");
                sb6.append(dm.i4.COL_USERNAME);
                sb6.append(" != '");
                sb6.append(str);
                sb6.append("'");
            }
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
        int i17 = this.f321956d == 2 ? 5 : 0;
        sb6.append(" and ");
        sb6.append("bizinfo");
        sb6.append(".");
        sb6.append("type");
        sb6.append(" = ");
        sb6.append(i17);
    }

    @Override // com.tencent.pigeon.biz.ConversationListApi
    public void doSearch() {
        boolean z17 = this.f321956d == 2;
        int i17 = z17 ? 245 : 11;
        int i18 = z17 ? 33562636 : 2;
        if (com.tencent.mm.plugin.websearch.l2.h(0)) {
            ((com.tencent.mm.plugin.websearch.p2) ((su4.g1) i95.n0.c(su4.g1.class))).Bi(com.tencent.mm.sdk.platformtools.x2.f193071a, new lx.l(i17, i18, this, z17));
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.FlutterBizConversationPlugin", "fts h5 template not avail");
        }
    }

    public final void e(java.lang.String str) {
        if (this.f321960h != null) {
            return;
        }
        lx.s sVar = new lx.s(this, str);
        this.f321960h = sVar;
        this.f321959g.postDelayed(sVar, this.f321961i);
    }

    @Override // com.tencent.pigeon.biz.ConversationListApi
    public void enterProfile(java.lang.String username, long j17) {
        kotlin.jvm.internal.o.g(username, "username");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", username);
        intent.putExtra("Contact_Scene", (int) j17);
        intent.putExtra("force_get_contact", true);
        intent.putExtra("key_use_new_contact_profile", true);
        android.content.Context context = this.f321957e;
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        j45.l.j(context, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
        boolean w27 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(username, true).w2();
        com.tencent.mm.autogen.mmdata.rpt.BizMyBizListReportStruct bizMyBizListReportStruct = new com.tencent.mm.autogen.mmdata.rpt.BizMyBizListReportStruct();
        bizMyBizListReportStruct.f55396d = 1L;
        bizMyBizListReportStruct.f55397e = com.tencent.mm.storage.c2.f193803a;
        bizMyBizListReportStruct.f55398f = bizMyBizListReportStruct.b("bizusername", username, true);
        bizMyBizListReportStruct.f55399g = java.lang.System.currentTimeMillis();
        bizMyBizListReportStruct.f55400h = w27 ? 1L : 0L;
        bizMyBizListReportStruct.k();
    }

    @Override // com.tencent.pigeon.biz.ConversationListApi
    public void fetchDigest() {
        yw.h1.f466332a.d(this.f321956d == 2 ? 5 : 0);
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        if ((a1Var instanceof com.tencent.mm.storage.e8) && (obj instanceof java.lang.String)) {
            if (i17 != 2 && i17 != 3) {
                if (i17 != 5) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FlutterBizConversationPlugin", "Unhandled storage event: " + i17 + " for " + obj);
                    return;
                }
                kr1.b Ri = yq1.u0.Ri();
                java.lang.String username = (java.lang.String) obj;
                Ri.getClass();
                kotlin.jvm.internal.o.g(username, "username");
                Ri.delete("BizFollowedContactDigest", "bizUsername=?", new java.lang.String[]{username});
                e(com.tencent.tinker.loader.shareutil.ShareConstants.RES_DEL_TITLE + obj);
                return;
            }
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n((java.lang.String) obj, true);
            if (n17 != null) {
                int i18 = this.f321956d;
                if (i18 == 2 && n17.l2()) {
                    e("update Photo :" + obj);
                } else if (i18 == 1 && n17.n2()) {
                    e("update Brand :" + obj);
                }
            }
        }
    }

    @Override // com.tencent.pigeon.biz.ConversationListApi
    public long getConversationCount() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append("select count(*) from rcontact left join bizinfo on rcontact.username = bizinfo.username left join BizFollowedContactDigest on rcontact.username = BizFollowedContactDigest.bizUsername");
        d(sb6);
        c(sb6);
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        android.database.Cursor f17 = gm0.j1.u().f273153f.f(sb7, null, 2);
        int i17 = f17.moveToFirst() ? f17.getInt(0) : 0;
        f17.close();
        return i17;
    }

    @Override // com.tencent.pigeon.biz.ConversationListApi
    public void getConversationListOrderByCreateTime(long j17, long j18, yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, kotlinx.coroutines.q1.f310570c, null, new lx.o(this, j17 < 0 ? 0 : (int) j17, j18, new java.util.ArrayList(), callback, null), 2, null);
    }

    @Override // com.tencent.pigeon.biz.ConversationListApi
    public void getConversationListOrderByUpdateTime(long j17, long j18, yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, kotlinx.coroutines.q1.f310570c, null, new lx.q(this, j17 < 0 ? 0 : (int) j17, j18, new java.util.ArrayList(), callback, null), 2, null);
    }

    @Override // com.tencent.pigeon.biz.ConversationListApi
    public void gotoUrl(com.tencent.pigeon.biz.BizAlbumUrlInfo info) {
        kotlin.jvm.internal.o.g(info, "info");
        lx.a aVar = new lx.a(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        aVar.f321669g = info.getUrl();
        aVar.f321667e = info.getOpenScene();
        aVar.f321668f = info.getSubScene();
        aVar.f321670h = info.getItemShowType();
        yw.h1 h1Var = yw.h1.f466332a;
        android.content.Context context = this.f321957e;
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        kotlin.jvm.internal.o.d(context);
        h1Var.t(aVar, context);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        this.f321957e = binding.getActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.biz.ConversationListApi.Companion companion = com.tencent.pigeon.biz.ConversationListApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.biz.ConversationListApi.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
        io.flutter.plugin.common.BinaryMessenger binaryMessenger2 = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger2, "getBinaryMessenger(...)");
        this.f321958f = new com.tencent.pigeon.biz.ConversationListCallbackApi(binaryMessenger2, null, 2, null);
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().a(this);
        yq1.u0.Ri().add(this.f321962m);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        this.f321957e = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        this.f321957e = null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.biz.ConversationListApi.Companion companion = com.tencent.pigeon.biz.ConversationListApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.biz.ConversationListApi.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
        this.f321958f = null;
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().e(this);
        yq1.u0.Ri().remove(this.f321962m);
        java.lang.Runnable runnable = this.f321960h;
        if (runnable != null) {
            this.f321959g.removeCallbacks(runnable);
        }
        this.f321960h = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        this.f321957e = binding.getActivity();
    }

    @Override // com.tencent.pigeon.biz.ConversationListApi
    public void unSubscribeContact(java.lang.String username) {
        kotlin.jvm.internal.o.g(username, "username");
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(username, true);
        qk.o b17 = r01.q3.cj().b1(username);
        qk.n6 n6Var = (qk.n6) i95.n0.c(qk.n6.class);
        android.app.Activity activity = this.f321957e;
        lx.t tVar = new lx.t(username);
        ((com.tencent.mm.app.o7) n6Var).getClass();
        com.tencent.mm.ui.tools.n1.b(b17, activity, n17, false, tVar, 2);
    }
}
