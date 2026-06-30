package xw;

/* loaded from: classes11.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f457512d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.p0 f457513e;

    public e(kotlin.jvm.internal.h0 h0Var, com.tencent.mm.modelbase.p0 p0Var) {
        this.f457512d = h0Var;
        this.f457513e = p0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r45.du5 du5Var;
        boolean z17;
        java.lang.String str;
        java.util.Map map = (java.util.Map) this.f457512d.f310123d;
        com.tencent.mm.modelbase.p0 p0Var = this.f457513e;
        if ((p0Var != null ? p0Var.f70726a : null) == null || (du5Var = p0Var.f70726a.f377561h) == null || map == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BizMergeMsgLogic", "onBizMergeMsgNotify data invalid");
            return;
        }
        java.lang.String g17 = x51.j1.g(du5Var);
        java.lang.String str2 = "";
        if (g17 == null) {
            g17 = "";
        }
        r45.j4 addMsg = p0Var.f70726a;
        kotlin.jvm.internal.o.f(addMsg, "addMsg");
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizMergeMsgLogic", "onBizMergeMsgNotify acc not ready");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BizMergeMsgLogic", "onBizMergeMsgNotify msgContent=".concat(g17));
        int i17 = 0;
        if (g17.length() == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BizMergeMsgLogic", "onBizMergeMsgNotify data invalid");
            z17 = false;
        } else {
            z17 = true;
        }
        if (!z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizMergeMsgLogic", "onBizMergeMsgNotify data invalid");
            return;
        }
        final com.tencent.mm.storage.s1 s1Var = new com.tencent.mm.storage.s1();
        s1Var.field_msgId = r01.q3.oj().W0();
        s1Var.field_msgSvrId = addMsg.f377568r;
        s1Var.field_type = 318767153;
        s1Var.field_talker = "notifymessage";
        s1Var.field_talkerId = 0;
        int i18 = addMsg.f377565o;
        s1Var.field_createTime = i18 > 0 ? i18 * 1000 : c01.w9.p();
        s1Var.field_status = 3;
        s1Var.field_content = g17;
        java.lang.String str3 = addMsg.f377566p;
        if (str3 == null) {
            str3 = "";
        }
        s1Var.M = str3;
        s1Var.f238185o = true;
        java.util.Map l17 = com.tencent.mm.storage.s2.l(s1Var);
        if (l17 != null && !com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) l17.get(".msg.appmsg.mmreader.notify_msg.act"))) {
            i17 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) l17.get(".msg.appmsg.mmreader.notify_msg.merge_title.merge_count"), 0);
        }
        s1Var.field_mergeCount = i17;
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(s1Var.field_content, "msg", null);
        if (d17 != null && (str = (java.lang.String) d17.get(".msg.appmsg.mmreader.notify_msg.notify_msg_id")) != null) {
            str2 = str;
        }
        s1Var.field_notifyMsgId = str2;
        s1Var.field_mergeShowTime = s1Var.field_createTime;
        final com.tencent.mm.storage.h2 oj6 = r01.q3.oj();
        oj6.getClass();
        final java.lang.String str4 = s1Var.field_notifyMsgId;
        if (str4 == null || str4.isEmpty()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BizTimeLineSingleMsgStorage", "mergeAndInsert notifyMsgId invalid");
        } else {
            ((ku5.t0) ku5.t0.f312615d).h(new java.lang.Runnable() { // from class: com.tencent.mm.storage.h2$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.storage.h2.a(com.tencent.mm.storage.h2.this, s1Var, str4);
                }
            }, "BizTimeLineInfoStorageThread");
        }
    }
}
