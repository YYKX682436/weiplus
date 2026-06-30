package qg5;

/* loaded from: classes8.dex */
public final class q4 extends jm0.g {

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f363144f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f363145g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f363146h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f363147i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f363148m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4(jm0.o service) {
        super(service);
        kotlin.jvm.internal.o.g(service, "service");
        this.f363144f = jz5.h.b(qg5.d4.f362947d);
        this.f363145g = jz5.h.b(qg5.p4.f363133d);
        this.f363146h = jz5.h.b(qg5.c4.f362941d);
        this.f363147i = jz5.h.b(qg5.b4.f362932d);
        this.f363148m = jz5.h.b(qg5.j4.f363027d);
    }

    public static final void T6(qg5.q4 q4Var) {
        q4Var.getClass();
        java.util.Map m17 = kz5.c1.m(com.tencent.mm.ui.mvvm.uic.conversation.recent.e.f209300g, kz5.c1.k(new jz5.l("forward_sid", com.tencent.mm.ui.mvvm.uic.conversation.recent.e.f209295b), new jz5.l("share_type", 13)));
        com.tencent.mars.xlog.Log.i("MicroMsg.YuanBaoForwardChatRecordsFSC", "reportForwardActiveYuanBaoSucc: " + m17);
        ((cy1.a) ((dy1.r) ((jz5.n) q4Var.f363148m).getValue())).Ej("active_yuanbao_succ", m17, 32337);
    }

    public static final void U6(qg5.q4 q4Var, int i17) {
        q4Var.getClass();
        java.util.Map m17 = kz5.c1.m(com.tencent.mm.ui.mvvm.uic.conversation.recent.e.f209300g, kz5.c1.k(new jz5.l("forward_sid", com.tencent.mm.ui.mvvm.uic.conversation.recent.e.f209295b), new jz5.l("popup_action_type", java.lang.Integer.valueOf(i17)), new jz5.l("share_type", 13)));
        com.tencent.mars.xlog.Log.i("MicroMsg.YuanBaoForwardChatRecordsFSC", "reportForwardAppJumpPopupClk: popupActionType=" + i17 + ", " + m17);
        ((cy1.a) ((dy1.r) ((jz5.n) q4Var.f363148m).getValue())).Hj("app_jump_yuanbao_popup", "view_clk", m17, 32337);
    }

    public final ct.q2 V6() {
        return (ct.q2) ((jz5.n) this.f363144f).getValue();
    }

    public final void W6(android.content.Context uiCtx, java.util.List msgList, com.tencent.mm.storage.z3 z3Var, boolean z17, xj.m mVar, yz5.a onLaunchSuccess) {
        kotlin.jvm.internal.o.g(uiCtx, "uiCtx");
        kotlin.jvm.internal.o.g(msgList, "msgList");
        kotlin.jvm.internal.o.g(onLaunchSuccess, "onLaunchSuccess");
        if (!z17) {
            a7(uiCtx, msgList, z3Var, z17, mVar, onLaunchSuccess);
            return;
        }
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("yuanbao_forward_chat_records_feature_service");
        if (M != null ? M.getBoolean("yuanbao_forward_agreed", false) : false) {
            a7(uiCtx, msgList, z3Var, z17, mVar, onLaunchSuccess);
        } else {
            new qg5.w4(uiCtx, new qg5.g4(M, this, uiCtx, msgList, z3Var, z17, mVar, onLaunchSuccess), qg5.h4.f363010d).f363248d.C();
        }
    }

    public final void X6(android.content.Context uiCtx, java.util.List records, xj.m mVar, yz5.a onLaunchSuccess) {
        kotlin.jvm.internal.o.g(uiCtx, "uiCtx");
        kotlin.jvm.internal.o.g(records, "records");
        kotlin.jvm.internal.o.g(onLaunchSuccess, "onLaunchSuccess");
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.o.f(uuid, "toString(...)");
        qg5.l0 l0Var = (qg5.l0) V6();
        l0Var.getClass();
        if (l0Var.f363058t.get() != null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChatRecordsStagingFeatureService", "Already in staging");
            l0Var.ij();
        }
        l0Var.f363058t.set(new qg5.r(null, null, records));
        qg5.r rVar = (qg5.r) l0Var.f363058t.get();
        if (rVar != null) {
        }
        synchronized (l0Var.f363060v) {
            l0Var.f363059u = null;
            l0Var.f363061w = null;
        }
        java.lang.String c17 = com.tencent.mm.app.provider.ShareableChatRecordsProvider.f53711e.c(uuid);
        if (c17 != null) {
            Z6(uiCtx, uuid, new qg5.i4(this, c17, null), mVar, onLaunchSuccess);
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.YuanBaoForwardChatRecordsFSC", "getFilePathChatRecords failed");
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(uiCtx);
        e4Var.d(com.tencent.mm.R.string.ohx);
        e4Var.c();
    }

    public final void Y6() {
        java.util.Map m17 = kz5.c1.m(com.tencent.mm.ui.mvvm.uic.conversation.recent.e.f209300g, kz5.c1.k(new jz5.l("forward_sid", com.tencent.mm.ui.mvvm.uic.conversation.recent.e.f209295b), new jz5.l("share_type", 13)));
        com.tencent.mars.xlog.Log.i("MicroMsg.YuanBaoForwardChatRecordsFSC", "reportForwardAppJumpPopupExp: " + m17);
        ((cy1.a) ((dy1.r) ((jz5.n) this.f363148m).getValue())).Hj("app_jump_yuanbao_popup", "view_exp", m17, 32337);
    }

    public final void Z6(android.content.Context context, java.lang.String str, yz5.l lVar, xj.m mVar, yz5.a aVar) {
        gm0.b bVar;
        gm0.m b17 = gm0.j1.b();
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = (b17 == null || (bVar = b17.f273245h) == null) ? null : bVar.f273145e;
        if (lifecycleScope != null) {
            v65.i.c(lifecycleScope, null, new qg5.k4(context, str, null), 1, null);
        }
        if (lifecycleScope != null) {
            v65.i.c(lifecycleScope, null, new qg5.n4(lifecycleScope, context, this, mVar, aVar, lVar, null), 1, null);
        }
    }

    public final void a7(android.content.Context context, java.util.List list, com.tencent.mm.storage.z3 z3Var, boolean z17, xj.m mVar, yz5.a aVar) {
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.o.f(uuid, "toString(...)");
        ((qg5.l0) V6()).oj(context, ac5.f.f3090a.b(context, z3Var == null ? new com.tencent.mm.storage.z3() : z3Var), z3Var, list, true);
        ct.q2 V6 = V6();
        kotlin.jvm.internal.o.f(V6, "<get-chatRecordsStagingService>(...)");
        ct.q2.k5(V6, false, 2, z17, z17, false, 16, null);
        ((qg5.l0) V6()).Zi(false);
        java.lang.String c17 = com.tencent.mm.app.provider.ShareableChatRecordsProvider.f53711e.c(uuid);
        if (c17 != null) {
            Z6(context, uuid, new qg5.o4(this, c17, null), mVar, aVar);
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.YuanBaoForwardChatRecordsFSC", "getFilePathChatRecords failed");
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
        e4Var.d(com.tencent.mm.R.string.ohx);
        e4Var.c();
    }
}
