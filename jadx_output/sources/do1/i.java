package do1;

/* loaded from: classes12.dex */
public final class i implements do1.b {
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
        kotlin.jvm.internal.o.g(msg, "msg");
        kotlin.jvm.internal.o.g(msgItem, "msgItem");
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
        msg.d1(msgItem.f33674g);
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackupItemSys", "msg.type:" + msg.getType() + ", content:" + msg.j() + ", msgSource:" + msgItem.f33676i);
        java.lang.String content = msgItem.f33674g;
        kotlin.jvm.internal.o.f(content, "content");
        if (r26.n0.L(content, "<sysmsg", 0, false, 6, null) >= 0) {
            msg.setType(570425393);
            return true;
        }
        msg.setType(10000);
        return true;
    }

    @Override // do1.b
    public co1.h e(long j17, com.tencent.mm.storage.f9 msg, do1.a backupExtraInfo) {
        kotlin.jvm.internal.o.g(msg, "msg");
        kotlin.jvm.internal.o.g(backupExtraInfo, "backupExtraInfo");
        if (msg.I0() == 0) {
            return null;
        }
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
        if (msg.getType() == 570425393) {
            java.lang.String j19 = msg.j();
            kotlin.jvm.internal.o.f(j19, "getContent(...)");
            if (r26.n0.B(j19, "type=\"sysmsgtemplate\"", false)) {
                u0Var.f33671d = 10002;
            }
        }
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
