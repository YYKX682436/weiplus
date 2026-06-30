package com.tencent.mm.plugin.notification.base;

/* loaded from: classes15.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.msg.MsgIdTalker f152439d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.notification.base.j f152440e;

    public h(com.tencent.mm.plugin.notification.base.j jVar, com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker) {
        this.f152440e = jVar;
        this.f152439d = msgIdTalker;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList arrayList;
        com.tencent.mm.plugin.notification.base.j jVar = this.f152440e;
        jVar.getClass();
        com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker = this.f152439d;
        do {
            java.lang.String a17 = msgIdTalker.a();
            long j17 = msgIdTalker.f149480d;
            if (jVar.b(a17, j17)) {
                jVar.v(msgIdTalker.a(), j17);
                com.tencent.mm.sdk.platformtools.b4 b4Var = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.plugin.notification.base.i(jVar, msgIdTalker), false);
                b4Var.c(1800000L, 1800000L);
                jVar.f152450h.add(b4Var);
                return;
            }
            arrayList = jVar.f152448f;
            arrayList.add(msgIdTalker);
            jVar.z();
            msgIdTalker = jVar.f152443a.a();
        } while (msgIdTalker.f149480d > 0);
        com.tencent.mars.xlog.Log.e("MicroMsg.AbstractSendMsgFailNotification", "tryResendNextMsg error, finalMsgId is -1, may be resend finish");
        if (jVar.f152447e.size() + arrayList.size() >= jVar.f152443a.b()) {
            jVar.u();
        }
    }
}
