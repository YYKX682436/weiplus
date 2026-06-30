package do1;

/* loaded from: classes12.dex */
public final class h implements do1.b {
    @Override // do1.b
    public boolean a(com.tencent.mm.storage.f9 msg, long j17) {
        kotlin.jvm.internal.o.g(msg, "msg");
        return false;
    }

    @Override // do1.b
    public boolean b(bw5.u0 msgItem, bw5.t0 mediaInfo, com.tencent.mm.storage.f9 msgInfo) {
        kotlin.jvm.internal.o.g(msgItem, "msgItem");
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        return false;
    }

    @Override // do1.b
    public boolean d(com.tencent.mm.storage.f9 msg, bw5.u0 msgItem, bw5.t0 mediaInfo, co1.c cVar) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(msg, "msg");
        kotlin.jvm.internal.o.g(msgItem, "msgItem");
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
        msg.d1(msgItem.f33674g);
        co1.g gVar = co1.g.f43768a;
        if (msgItem.f33671d == 50) {
            try {
                java.lang.String Q0 = msg.Q0();
                kotlin.jvm.internal.o.f(Q0, "getTalker(...)");
                if (gVar.c(Q0)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackupItemNormal", "conversation " + msg.Q0() + " has voip message, avoid duplicate, return false");
                    return false;
                }
                msg.r1(6);
                java.lang.String content = msgItem.f33674g;
                kotlin.jvm.internal.o.f(content, "content");
                r45.j07 q17 = com.tencent.mm.plugin.voip.model.j0.q(content);
                if (q17 != null) {
                    msg.u3(q17.f377477d);
                    com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackupItemNormal", "msg.msgSource = " + msg.G);
                    msg.r1(q17.f377479f ? 3 : 6);
                } else {
                    r45.j07 s17 = com.tencent.mm.plugin.voip.model.j0.s(msg.j());
                    if (s17 == null) {
                        return false;
                    }
                    msg.u3(s17.f377477d);
                    if (s17.f377478e == 0) {
                        int i17 = com.tencent.mm.storage.f9.f193926r2;
                        str = "voip_content_video";
                    } else {
                        int i18 = com.tencent.mm.storage.f9.f193926r2;
                        str = "voip_content_voice";
                    }
                    msg.d1(str);
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("MicroMsg.RoamBackupItemNormal", "recover voip message error = " + th6.getMessage());
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.RoamBackupItemNormal", th6, "", new java.lang.Object[0]);
                return false;
            }
        }
        return true;
    }

    @Override // do1.b
    public co1.h e(long j17, com.tencent.mm.storage.f9 msg, do1.a backupExtraInfo) {
        kotlin.jvm.internal.o.g(msg, "msg");
        kotlin.jvm.internal.o.g(backupExtraInfo, "backupExtraInfo");
        bw5.u0 u0Var = new bw5.u0();
        u0Var.f33671d = msg.getType();
        u0Var.f33672e = msg.y0();
        u0Var.f33673f = msg.T0();
        java.lang.String j18 = msg.j();
        if (j18 == null) {
            j18 = "";
        }
        u0Var.f33674g = j18;
        u0Var.f33675h = msg.getCreateTime();
        java.lang.String str = msg.G;
        u0Var.f33676i = str != null ? str : "";
        u0Var.f33677m = msg.I0();
        u0Var.f33678n = msg.F0();
        bw5.t0 t0Var = new bw5.t0();
        t0Var.f33202d = msg.I0();
        return new co1.h(u0Var, t0Var);
    }

    @Override // do1.b
    public long g(com.tencent.mm.storage.f9 msg, java.lang.String mediaId, int i17) {
        kotlin.jvm.internal.o.g(msg, "msg");
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        return 0L;
    }
}
