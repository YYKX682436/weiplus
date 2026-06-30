package fr4;

@j95.b
/* loaded from: classes11.dex */
public final class g0 extends i95.w implements gr4.f {

    /* renamed from: d, reason: collision with root package name */
    public d95.b0 f265820d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f265821e;

    /* renamed from: f, reason: collision with root package name */
    public kr4.m f265822f;

    /* renamed from: g, reason: collision with root package name */
    public kr4.k f265823g;

    /* renamed from: h, reason: collision with root package name */
    public kr4.n f265824h;

    /* renamed from: m, reason: collision with root package name */
    public boolean f265826m;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f265829p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.ref.WeakReference f265830q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f265831r;

    /* renamed from: i, reason: collision with root package name */
    public final kr4.e f265825i = new kr4.e();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f265827n = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f265828o = new java.util.concurrent.ConcurrentHashMap();

    public final kr4.k Ai() {
        gm0.j1.b().c();
        kr4.k kVar = this.f265823g;
        if (kVar == null) {
            kVar = new kr4.k(Ni());
        }
        this.f265823g = kVar;
        return kVar;
    }

    public final kr4.m Bi() {
        gm0.j1.b().c();
        if (this.f265822f == null) {
            kr4.m mVar = new kr4.m(Ni());
            this.f265822f = mVar;
            kr4.m mVar2 = this.f265822f;
            kotlin.jvm.internal.o.d(mVar2);
            mVar.add(mVar2);
        }
        kr4.m mVar3 = this.f265822f;
        kotlin.jvm.internal.o.d(mVar3);
        return mVar3;
    }

    public java.lang.String Di() {
        java.lang.String str = this.f265825i.field_username;
        return str == null ? "" : str;
    }

    public final d95.b0 Ni() {
        d95.b0 b0Var = this.f265820d;
        if (b0Var != null) {
            kotlin.jvm.internal.o.d(b0Var);
            return b0Var;
        }
        this.f265821e = gm0.j1.u().h() + "W1wPersonalMsg.db";
        d95.b0 b0Var2 = this.f265820d;
        if (b0Var2 == null) {
            b0Var2 = new d95.b0();
            java.lang.String str = this.f265821e;
            if (str == null) {
                kotlin.jvm.internal.o.o("cacheDBPath");
                throw null;
            }
            if (!b0Var2.S(str, kz5.c1.i(new jz5.l(1269450851, fr4.t.f265861a), new jz5.l(1595239207, fr4.u.f265862a), new jz5.l(-640292320, fr4.v.f265863a)), true, true)) {
                com.tencent.mars.xlog.Log.e("W1w.W1wPersonalMsgService", "W1wPersonalMsg db init failed!");
            }
        }
        this.f265820d = b0Var2;
        return b0Var2;
    }

    public int Ri(java.lang.String str) {
        return Vi().y0(str).field_isHello;
    }

    public java.lang.String Ui(java.lang.String username) {
        kotlin.jvm.internal.o.g(username, "username");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f265828o;
        java.lang.String str = (java.lang.String) concurrentHashMap.get(username);
        if (!(str == null || str.length() == 0)) {
            return str;
        }
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        concurrentHashMap.put(username, uuid);
        com.tencent.mars.xlog.Log.i("W1w.W1wPersonalMsgService", "[getReddotId] generate new reddotId for username=" + username + " reddotId=" + uuid);
        return uuid;
    }

    public final kr4.n Vi() {
        gm0.j1.b().c();
        kr4.n nVar = this.f265824h;
        if (nVar == null) {
            nVar = new kr4.n(Ni());
        }
        this.f265824h = nVar;
        return nVar;
    }

    public java.lang.String Zi(java.lang.String sessionId) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        kr4.n nVar = this.f265824h;
        if (nVar != null) {
            return nVar.y0(sessionId).field_talkerUserName;
        }
        return null;
    }

    public int aj(java.lang.String username) {
        kotlin.jvm.internal.o.g(username, "username");
        kr4.m mVar = this.f265822f;
        java.lang.Integer valueOf = mVar != null ? java.lang.Integer.valueOf(mVar.z0(0, username)) : null;
        com.tencent.mars.xlog.Log.i("W1w.W1wPersonalMsgService", "[getUnreadCount] username=" + username + " count=" + valueOf);
        if (valueOf == null) {
            return 0;
        }
        return valueOf.intValue();
    }

    public final void bj(int i17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("W1w.W1wPersonalMsgService", "[nativeSync] start sync: syncScene=" + i17 + ", selfUsername=" + str);
        if (i17 == 3009 || i17 == 3011 || i17 == 3010) {
            if (!(str == null || str.length() == 0)) {
                this.f265827n.put(str, java.lang.Boolean.TRUE);
                com.tencent.mars.xlog.Log.i("W1w.W1wPersonalMsgService", "[nativeSync] set hasEvent=true for username=" + str);
                kotlinx.coroutines.l.d(kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310568a), null, null, new fr4.z(i17, null), 3, null);
                return;
            }
        }
        com.tencent.mars.xlog.Log.w("W1w.W1wPersonalMsgService", "[nativeSync] invalid params: syncScene=" + i17 + ", selfUsername=" + str);
    }

    public void cj(vu4.d actionType, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String pageId, vu4.e boxInfo, java.lang.String str5, java.lang.String str6, java.lang.String str7, vu4.g msgPageType) {
        kotlin.jvm.internal.o.g(actionType, "actionType");
        kotlin.jvm.internal.o.g(pageId, "pageId");
        kotlin.jvm.internal.o.g(boxInfo, "boxInfo");
        kotlin.jvm.internal.o.g(msgPageType, "msgPageType");
        try {
            java.util.List a17 = new vu4.f(actionType, str, str2, str3, pageId, boxInfo, "0", str5, null, str4, str6, str7, msgPageType, 256, null).a();
            r45.id4 id4Var = new r45.id4();
            id4Var.f376951d = 28760;
            id4Var.f376952e = kz5.n0.g0(a17, ",", null, null, 0, null, null, 62, null);
            id4Var.f376953f = 1;
            id4Var.f376954g = 28760;
            r45.op5 op5Var = new r45.op5();
            op5Var.f382428d.add(id4Var);
            com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
            lVar.f70667d = 1134;
            lVar.f70666c = "/cgi-bin/mmsearch-bin/zhuge/report_data";
            lVar.f70664a = op5Var;
            lVar.f70665b = new r45.pp5();
            com.tencent.mm.modelbase.o a18 = lVar.a();
            ((h80.i) ((com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class))).wi(a18, fr4.e0.f265817a);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("W1w.W1wPersonalMsgService", "Failed to send 28760 report via new protobuf CGI", e17);
        }
    }

    public boolean fj(java.lang.String toUsername, java.lang.String selfUsername, gr4.e callback) {
        kotlin.jvm.internal.o.g(toUsername, "toUsername");
        kotlin.jvm.internal.o.g(selfUsername, "selfUsername");
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i("W1w.W1wPersonalMsgService", "[requestSessionInfo] requesting session info: fromUsername=" + selfUsername + ", toUsername=" + toUsername);
        r45.hj3 hj3Var = new r45.hj3();
        hj3Var.f376212d = selfUsername;
        hj3Var.f376213e = toUsername;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 26889;
        lVar.f70666c = "/cgi-bin/mmsearch-bin/zhuge/get_personal_msg_session_info";
        lVar.f70664a = hj3Var;
        lVar.f70665b = new r45.ij3();
        ((h80.i) ((com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class))).wi(lVar.a(), new fr4.f0(callback));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean hj(org.json.JSONObject r17) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fr4.g0.hj(org.json.JSONObject):boolean");
    }

    public void ij(java.lang.String sessionId, java.lang.String talkerUserName, java.lang.String selfUserName, int i17, boolean z17, int i18) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        kotlin.jvm.internal.o.g(talkerUserName, "talkerUserName");
        kotlin.jvm.internal.o.g(selfUserName, "selfUserName");
        Vi().D0(sessionId, talkerUserName, selfUserName, i17, z17, i18);
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onCreate(context);
        le0.x.Q0.add(fr4.a0.f265801a);
    }

    public void wi(java.lang.String sessionId) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        kr4.m Bi = Bi();
        boolean z17 = false;
        if (sessionId.length() == 0) {
            return;
        }
        kr4.g y07 = Bi.y0(sessionId);
        int i17 = y07.field_unReadCount;
        y07.field_unReadCount = 0;
        y07.field_readStatus = 1;
        if (i17 != 0) {
            z17 = Bi.update(y07.systemRowid, y07, false);
            Bi.doNotify(y07.field_sessionId, 5, y07);
        }
        com.tencent.mars.xlog.Log.i("W1wPersonalMsg.ConversationStorage", "[clearUnreadCount] ret=" + z17 + ' ' + i17 + " => " + y07.field_unReadCount + " sessionId=" + sessionId);
    }
}
