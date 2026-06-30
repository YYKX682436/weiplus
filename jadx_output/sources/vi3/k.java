package vi3;

/* loaded from: classes12.dex */
public class k implements vi3.a {

    /* renamed from: f, reason: collision with root package name */
    public static vi3.k f437601f;

    /* renamed from: a, reason: collision with root package name */
    public vi3.e f437602a;

    /* renamed from: b, reason: collision with root package name */
    public int f437603b;

    /* renamed from: c, reason: collision with root package name */
    public long f437604c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f437605d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f437606e = false;

    public void a() {
        com.tencent.mars.xlog.Log.e("MicroMsg.MsgSynchronizeServer", "MsgSynchronizeServer cancel, Caller:%s", com.tencent.mm.sdk.platformtools.z3.a());
        this.f437602a.f437571a = true;
        this.f437606e = false;
    }

    public final void b(java.lang.String str) {
        if (str.equals("afterLogin")) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(466L, 2L, 1L, false);
        } else if (str.equals("afterSleep")) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(466L, 17L, 1L, false);
        } else if (str.equals("getMore")) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(466L, 33L, 1L, false);
        }
    }

    public final void c(vi3.f fVar, boolean z17) {
        java.lang.String str;
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgSynchronizeServer", "msgSynchronize start send AppMsg, isEmpty[%b].", java.lang.Boolean.valueOf(z17));
        c01.d9.e().a(com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_VERIFY_LOCAL_TIME_OUT, new vi3.j(this, fVar));
        if (fVar.f437573a.equals("getMore")) {
            str = fVar.f437578f + "," + fVar.f437579g;
        } else {
            str = "";
        }
        java.lang.String str2 = str;
        c01.d9.e().g(z17 ? new vi3.g("", "NULL", 0, fVar.f437583k, fVar.f437573a, str2, fVar.f437584l) : new vi3.g(fVar.f437580h, fVar.f437581i, fVar.f437582j, fVar.f437583k, fVar.f437573a, str2, fVar.f437584l));
    }

    public void d(java.lang.String str, java.lang.String str2, byte[] bArr, java.lang.String str3) {
        long currentTimeMillis;
        long currentTimeMillis2;
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgSynchronizeServer", "start, action:%s, extInfo:%s, loginDevice[%d]", str, str2, java.lang.Integer.valueOf(this.f437603b));
        if (this.f437606e) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgSynchronizeServer", "synchronize has Started!!!!! reject! action:%s", str);
            return;
        }
        this.f437606e = true;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f437604c = java.lang.System.currentTimeMillis();
        vi3.e eVar = this.f437602a;
        if (eVar != null) {
            eVar.f437571a = true;
        }
        this.f437602a = new vi3.e();
        vi3.f fVar = new vi3.f(str);
        fVar.f437574b = bArr;
        fVar.f437584l = str3;
        if (str.equals("afterLogin")) {
            int i17 = this.f437603b;
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgSynchronizeServer", "startLoginSynchronize, loginDevice[%d]", java.lang.Integer.valueOf(i17));
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.idkeyStat(466L, 0L, 1L, false);
            tn1.f.f().c();
            vi3.e eVar2 = this.f437602a;
            eVar2.f437572b = this;
            java.util.LinkedList a17 = eVar2.a();
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgSynchronizeServer", "startLoginSynchronize calculateConversationList finish. conversationList size:%d", java.lang.Integer.valueOf(a17.size()));
            if (a17.size() != 0) {
                int i18 = vi3.b.f437560g;
                if (i18 < 0) {
                    currentTimeMillis2 = i18;
                } else {
                    currentTimeMillis2 = java.lang.System.currentTimeMillis() - ((((i18 * 24) * 60) * 60) * 1000);
                }
                this.f437602a.b(fVar, a17, currentTimeMillis2, java.lang.System.currentTimeMillis(), vi3.b.f437558e);
                return;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgSynchronizeServer", "startLoginSynchronize, No conversation to synchronize");
            a();
            long currentTimeMillis3 = java.lang.System.currentTimeMillis() - this.f437604c;
            g0Var.idkeyStat(466L, 1L, 1L, false);
            g0Var.idkeyStat(466L, 5L, 0L, false);
            g0Var.idkeyStat(466L, 7L, currentTimeMillis3, false);
            g0Var.idkeyStat(466L, 11L, 0L, false);
            g0Var.idkeyStat(466L, 12L, 0L, false);
            vi3.b.a(0L, currentTimeMillis3, 0L, 0L, 0, i17, 1);
            return;
        }
        if (!((java.lang.Boolean) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERINFO_MSG_SYNCHRONIZE_BOOLEAN, java.lang.Boolean.FALSE)).booleanValue()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgSynchronizeServer", "start reject!!!User did not approve synchroinze!!!!");
            a();
            return;
        }
        java.lang.String[] split = str2.split(",");
        if (!str.equals("afterSleep")) {
            if (str.equals("getMore")) {
                if (vi3.b.f437562i <= 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MsgSynchronizeServer", "start reject!!!Abtest reject synchroinze after sleep.");
                    a();
                    return;
                }
                if (split.length < 5) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MsgSynchronizeServer", "start extinfo size wrong, action:%s, exinfo:%s", str, split);
                    a();
                    return;
                }
                java.lang.String str4 = split[0];
                long a18 = kn1.k.a(split[1], 0) * 1000;
                long a19 = kn1.k.a(split[2], 0) * 1000;
                fVar.f437578f = new java.lang.String(split[3]);
                int P = com.tencent.mm.sdk.platformtools.t8.P(split[4], 0);
                int i19 = this.f437603b;
                com.tencent.mars.xlog.Log.i("MicroMsg.MsgSynchronizeServer", "startGetMoreSynchronize, loginDevice[%d]", java.lang.Integer.valueOf(i19));
                com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                g0Var2.idkeyStat(466L, 31L, 1L, false);
                tn1.f.f().c();
                this.f437602a.f437572b = this;
                java.util.LinkedList linkedList = new java.util.LinkedList();
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
                    int j76 = ((com.tencent.mm.storage.g9) tn1.f.f().e().g()).j7(str4);
                    com.tencent.mars.xlog.Log.i("MicroMsg.MsgSynchronizePack", "addConversationList user:%s convMsgCount:%d", str4, java.lang.Integer.valueOf(j76));
                    if (j76 > 0) {
                        linkedList.add(new vi3.d(str4));
                    }
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.MsgSynchronizeServer", "startGetMoreSynchronize addConversationList finish. conversationList size:%d", java.lang.Integer.valueOf(linkedList.size()));
                if (linkedList.size() != 0) {
                    this.f437602a.b(fVar, linkedList, a18, a19, P);
                    return;
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.MsgSynchronizeServer", "startGetMoreSynchronize, No conversation to synchronize");
                a();
                long currentTimeMillis4 = java.lang.System.currentTimeMillis() - this.f437604c;
                g0Var2.idkeyStat(466L, 32L, 1L, false);
                g0Var2.idkeyStat(466L, 36L, 0L, false);
                g0Var2.idkeyStat(466L, 38L, currentTimeMillis4, false);
                g0Var2.idkeyStat(466L, 42L, 0L, false);
                g0Var2.idkeyStat(466L, 43L, 0L, false);
                vi3.b.a(0L, currentTimeMillis4, 0L, 0L, 0, i19, 3);
                return;
            }
            return;
        }
        if (vi3.b.f437561h <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgSynchronizeServer", "start reject!!!Abtest reject synchroinze after sleep.");
            a();
            return;
        }
        if (split.length < 2) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgSynchronizeServer", "start extinfo size wrong, action:%s, exinfo:%s", str, split);
            a();
            return;
        }
        long a27 = kn1.k.a(split[0], 0) * 1000;
        long a28 = kn1.k.a(split[1], 0) * 1000;
        int i27 = this.f437603b;
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgSynchronizeServer", "startAfterSleepSynchronize, loginDevice[%d]", java.lang.Integer.valueOf(i27));
        com.tencent.mm.plugin.report.service.g0 g0Var3 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var3.idkeyStat(466L, 15L, 1L, false);
        tn1.f.f().c();
        vi3.e eVar3 = this.f437602a;
        eVar3.f437572b = this;
        java.util.LinkedList a29 = eVar3.a();
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgSynchronizeServer", "startAfterSleepSynchronize getConversationList finish. conversationList size:%d", java.lang.Integer.valueOf(a29.size()));
        if (a29.size() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgSynchronizeServer", "startAfterSleepSynchronize, No conversation to synchronize");
            a();
            long currentTimeMillis5 = java.lang.System.currentTimeMillis() - this.f437604c;
            g0Var3.idkeyStat(466L, 16L, 1L, false);
            g0Var3.idkeyStat(466L, 20L, 0L, false);
            g0Var3.idkeyStat(466L, 22L, currentTimeMillis5, false);
            g0Var3.idkeyStat(466L, 26L, 0L, false);
            g0Var3.idkeyStat(466L, 27L, 0L, false);
            vi3.b.a(0L, currentTimeMillis5, 0L, 0L, 0, i27, 2);
            return;
        }
        int i28 = vi3.b.f437560g;
        if (i28 < 0) {
            currentTimeMillis = i28;
        } else {
            currentTimeMillis = java.lang.System.currentTimeMillis() - ((((i28 * 24) * 60) * 60) * 1000);
        }
        if (a27 >= currentTimeMillis) {
            currentTimeMillis = a27;
        }
        if (a28 == 0) {
            a28 = java.lang.System.currentTimeMillis();
        }
        if (currentTimeMillis > a28) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgSynchronizeServer", "startAfterSleepSynchronize no msg should be synchroinzed. startTime[%d], endTIme[%d]", java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(a28));
            c(fVar, true);
        } else {
            this.f437602a.b(fVar, a29, currentTimeMillis, a28, vi3.b.f437558e);
        }
    }
}
