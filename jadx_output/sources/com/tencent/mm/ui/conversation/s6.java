package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class s6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.MainUI f208066d;

    public s6(com.tencent.mm.ui.conversation.MainUI mainUI) {
        this.f208066d = mainUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.conversation.q qVar = this.f208066d.f207380w;
        if (!qVar.f207990t) {
            qVar.f207990t = true;
            ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            com.tencent.mm.modelavatar.d1.Ai().f70579a.a(qVar, android.os.Looper.getMainLooper());
            c01.d9.b().p().a(qVar);
            qVar.h();
        }
        com.tencent.mm.ui.conversation.o5 o5Var = this.f208066d.f207381x;
        if (o5Var.F) {
            return;
        }
        o5Var.F = true;
        c01.d9.b().p().a(o5Var);
        o5Var.A(true);
        if (o5Var.s()) {
            java.util.Collection n17 = o5Var.n();
            long j17 = o5Var.f207937t;
            long j18 = 100 * 1.0f;
            if (j17 <= 0) {
                return;
            }
            java.lang.String r17 = c01.z1.r();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (currentTimeMillis - com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).getLong("top_session_info_report", 0L) > j62.e.g().c(new com.tencent.mm.repairer.config.chatting.RepairerConfigTopReportDuration()) * 1000) {
                ((ku5.t0) ku5.t0.f312615d).g(new bg5.j(n17, j17, j18, currentTimeMillis, r17));
            }
        }
    }
}
