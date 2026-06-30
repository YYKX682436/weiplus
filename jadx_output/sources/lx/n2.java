package lx;

/* loaded from: classes11.dex */
public final class n2 implements com.tencent.pigeon.biz.NotifyMsgApi, io.flutter.embedding.engine.plugins.FlutterPlugin, io.flutter.embedding.engine.plugins.activity.ActivityAware {

    /* renamed from: d, reason: collision with root package name */
    public final int f321876d;

    /* renamed from: e, reason: collision with root package name */
    public android.app.Activity f321877e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.pigeon.biz.NotifyMsgCallbackApi f321878f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.storage.a8 f321879g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.storage.z1 f321880h;

    public n2(int i17) {
        com.tencent.mm.storage.a8 oj6;
        this.f321876d = i17;
        if (i17 == 5) {
            oj6 = r01.q3.ij();
            kotlin.jvm.internal.o.d(oj6);
        } else {
            oj6 = r01.q3.oj();
            kotlin.jvm.internal.o.d(oj6);
        }
        this.f321879g = oj6;
        this.f321880h = new lx.m2(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.tencent.pigeon.biz.NotifyMsg a(com.tencent.mm.storage.s1 r30) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lx.n2.a(com.tencent.mm.storage.s1):com.tencent.pigeon.biz.NotifyMsg");
    }

    @Override // com.tencent.pigeon.biz.NotifyMsgApi
    public void addContact(java.lang.String username) {
        kotlin.jvm.internal.o.g(username, "username");
        o25.a aVar = new o25.a();
        aVar.f342469g = false;
        aVar.f342470h = false;
        ((r35.o) ((r35.p) ((o25.o1) i95.n0.c(o25.o1.class))).wi(this.f321877e, username, 268, new lx.k2(this, username), aVar)).f();
    }

    @Override // com.tencent.pigeon.biz.NotifyMsgApi
    public void addToPreload(java.lang.String url, long j17, long j18, java.lang.String brandUserName, yz5.l callback) {
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(brandUserName, "brandUserName");
        kotlin.jvm.internal.o.g(callback, "callback");
        ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).c(url, (int) j17, (int) j18, brandUserName, new java.lang.Object[0]);
    }

    public final java.util.List b(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(a((com.tencent.mm.storage.s1) it.next()));
        }
        return arrayList;
    }

    @Override // com.tencent.pigeon.biz.NotifyMsgApi
    public boolean canUseStyleV2WhenMsgVersion(long j17) {
        com.tencent.mm.pluginsdk.model.e eVar = com.tencent.mm.pluginsdk.model.e.f189277a;
        return com.tencent.mm.sdk.platformtools.o4.R("brandService").getBoolean("k_personalCenterMessageListUseStyleV2_V" + ((int) j17), true);
    }

    @Override // com.tencent.pigeon.biz.NotifyMsgApi
    public com.tencent.pigeon.biz.BizNotificationTabInfo getNotificationTabInfo() {
        return this.f321876d == 5 ? ur1.n.f430361a.c() : ur1.n.f430361a.c();
    }

    @Override // com.tencent.pigeon.biz.NotifyMsgApi
    public long getNotifyCount() {
        return this.f321879g.x();
    }

    @Override // com.tencent.pigeon.biz.NotifyMsgApi
    public java.util.List getNotifyMsgList(long j17, long j18, long j19) {
        com.tencent.mm.storage.a8 a8Var = this.f321879g;
        if (j17 == 1) {
            java.util.List b17 = a8Var.b();
            kotlin.jvm.internal.o.f(b17, "getInitList(...)");
            return b(b17);
        }
        if (j18 > 0) {
            java.util.List U = a8Var.U((int) j19, j18);
            kotlin.jvm.internal.o.f(U, "getMoreList(...)");
            return b(U);
        }
        java.util.List i17 = a8Var.i((int) j19);
        kotlin.jvm.internal.o.f(i17, "getInitList(...)");
        return b(i17);
    }

    @Override // com.tencent.pigeon.biz.NotifyMsgApi
    public long getNotifyUnReadCount() {
        return this.f321879g.f();
    }

    @Override // com.tencent.pigeon.biz.NotifyMsgApi
    public void gotoBizProfile(java.lang.String username, long j17, long j18) {
        kotlin.jvm.internal.o.g(username, "username");
        if (r26.n0.N(username)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FlutterBizNotifyMsgPlugin", "gotoBizProfile username invalid");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterBizNotifyMsgPlugin", "gotoBizProfile username=" + username + ", addContactScene=" + j17 + ", serviceType=" + j18);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", username);
        intent.putExtra("Contact_Scene", (int) j17);
        intent.putExtra("force_get_contact", true);
        intent.putExtra("key_use_new_contact_profile", true);
        android.content.Context context = this.f321877e;
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        j45.l.j(context, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        this.f321877e = binding.getActivity();
        this.f321879g.j0(this.f321880h, android.os.Looper.getMainLooper());
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.biz.NotifyMsgApi.Companion companion = com.tencent.pigeon.biz.NotifyMsgApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.biz.NotifyMsgApi.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
        io.flutter.plugin.common.BinaryMessenger binaryMessenger2 = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger2, "getBinaryMessenger(...)");
        this.f321878f = new com.tencent.pigeon.biz.NotifyMsgCallbackApi(binaryMessenger2, null, 2, null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        this.f321877e = null;
        this.f321879g.P(this.f321880h);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        this.f321877e = null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.biz.NotifyMsgApi.Companion companion = com.tencent.pigeon.biz.NotifyMsgApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.biz.NotifyMsgApi.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
        this.f321878f = null;
    }

    @Override // com.tencent.pigeon.biz.NotifyMsgApi
    public void onItemClick(com.tencent.pigeon.biz.NotifyMsg msg) {
        java.util.Map d17;
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mm.storage.s1 s1Var = new com.tencent.mm.storage.s1();
        s1Var.field_talker = msg.getTalker();
        java.lang.Long msgId = msg.getMsgId();
        kotlin.jvm.internal.o.d(msgId);
        s1Var.field_msgId = msgId.longValue();
        java.lang.Long dataType = msg.getDataType();
        s1Var.field_type = dataType != null ? (int) dataType.longValue() : 0;
        s1Var.field_content = msg.getMsgContent();
        java.lang.Long createTime = msg.getCreateTime();
        s1Var.field_createTime = createTime != null ? createTime.longValue() : 0L;
        if (s1Var.field_msgId != 0) {
            java.lang.String str = s1Var.field_content;
            if (str == null || str.length() == 0) {
                return;
            }
            if (s1Var.z0()) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("rawUrl", s1Var.t0().f193802f);
                intent.putExtra("geta8key_username", s1Var.t0().f193797a);
                intent.putExtra("geta8key_scene", 56);
                j45.l.j(this.f321877e, "webview", ".ui.tools.WebViewUI", intent, null);
                return;
            }
            int i17 = this.f321876d;
            if (!com.tencent.mm.storage.s2.a(s1Var, i17)) {
                long j17 = s1Var.field_msgId;
                if (j17 > 0) {
                    com.tencent.mm.storage.f9 o17 = pt0.f0.f358209b1.o(s1Var.field_talker, j17, true);
                    if (o17 == null || o17.getMsgId() == 0) {
                        android.app.Activity activity = this.f321877e;
                        db5.e1.T(activity, activity != null ? activity.getString(com.tencent.mm.R.string.ali) : null);
                        return;
                    }
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.putExtra("Chat_User", s1Var.field_talker);
                    intent2.putExtra("finish_direct", true);
                    intent2.putExtra("from_global_search", true);
                    intent2.putExtra("msg_local_id", s1Var.field_msgId);
                    intent2.putExtra("specific_chat_from_scene", 9);
                    intent2.putExtra("preChatTYPE", 13);
                    j45.l.u(this.f321877e, ".ui.chatting.ChattingUI", intent2, null);
                    return;
                }
                return;
            }
            android.content.Context context = this.f321877e;
            if (context == null) {
                context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            }
            kotlin.jvm.internal.o.d(context);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(s1Var.field_content) && s1Var.w0() && (d17 = com.tencent.mm.sdk.platformtools.aa.d(s1Var.field_content, "msg", null)) != null) {
                com.tencent.mm.storage.o2 o2Var = new com.tencent.mm.storage.o2(s1Var, d17, i17, context);
                com.tencent.mm.storage.q2 q2Var = new com.tencent.mm.storage.q2(d17, i17, context, s1Var);
                com.tencent.mm.storage.r2 r2Var = new com.tencent.mm.storage.r2(d17, i17, s1Var, context);
                com.tencent.mm.storage.p2 p2Var = new com.tencent.mm.storage.p2(s1Var, d17, i17, context);
                int P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".msg.appmsg.mmreader." + com.tencent.mm.storage.s2.g(i17) + ".act"), 0);
                if (P == 1) {
                    o2Var.invoke();
                } else if (P == 2) {
                    q2Var.invoke();
                } else if (P == 3) {
                    r2Var.invoke();
                } else if (P != 4) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.BizTimeLineStorageLogicExKt", "unknow type");
                } else {
                    p2Var.invoke();
                }
            }
            com.tencent.mm.storage.s2.k(s1Var, i17);
            com.tencent.mm.storage.s2.f(s1Var, i17);
        }
    }

    @Override // com.tencent.pigeon.biz.NotifyMsgApi
    public boolean onItemDelete(com.tencent.pigeon.biz.NotifyMsg msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        java.lang.Long msgId = msg.getMsgId();
        if (msgId == null) {
            return false;
        }
        return this.f321879g.c(msgId.longValue(), true, true);
    }

    @Override // com.tencent.pigeon.biz.NotifyMsgApi
    public void onNotifyMsgBlockStatusChanged(java.lang.String mpArticleKey, long j17, yz5.l callback) {
        kotlin.jvm.internal.o.g(mpArticleKey, "mpArticleKey");
        kotlin.jvm.internal.o.g(callback, "callback");
        boolean s17 = this.f321879g.s(mpArticleKey, (int) j17);
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(java.lang.Boolean.valueOf(s17))));
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        this.f321877e = binding.getActivity();
    }

    @Override // com.tencent.pigeon.biz.NotifyMsgApi
    public void reportPersonalCenter(long j17, long j18, long j19, java.lang.String biz, boolean z17, long j27) {
        kotlin.jvm.internal.o.g(biz, "biz");
        ur1.e eVar = ur1.e.f430346d;
        ur1.e.f430346d.c(j17, j18, j19, biz, z17, "", j27);
    }

    @Override // com.tencent.pigeon.biz.NotifyMsgApi
    public void setHasRead(java.util.List list, boolean z17) {
        com.tencent.mm.storage.a8 a8Var = this.f321879g;
        if (z17) {
            a8Var.H(list);
        } else {
            a8Var.i0(list);
        }
    }
}
