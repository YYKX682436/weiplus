package do1;

/* loaded from: classes12.dex */
public final class k implements do1.b {
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
        if (msgInfo.getType() == 34) {
            java.lang.String d17 = tn1.e.d(msgInfo, msgInfo.z0(), false);
            com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackupItemVoice", "complementMediaFile, existFullPath = " + d17 + ", len = " + com.tencent.mm.vfs.w6.k(d17));
            if (com.tencent.mm.vfs.w6.k(d17) == 0) {
                java.util.LinkedList linkedList = mediaInfo.f33205g;
                if (linkedList.size() == 1) {
                    com.tencent.mm.vfs.w6.w((java.lang.String) linkedList.get(0), d17);
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.RoamBackupItemVoice", "mediaCount error, count:" + linkedList.size());
                }
                return true;
            }
        }
        return false;
    }

    @Override // do1.b
    public boolean d(com.tencent.mm.storage.f9 msg, bw5.u0 msgItem, bw5.t0 mediaInfo, co1.c cVar) {
        int b17;
        int i17;
        kotlin.jvm.internal.o.g(msg, "msg");
        kotlin.jvm.internal.o.g(msgItem, "msgItem");
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
        java.lang.String element = msgItem.f33674g;
        if (tn1.e.h(msg.Q0()) && (b17 = tn1.e.b(element)) != -1 && (i17 = b17 + 2) < element.length()) {
            element = element.substring(i17);
        }
        try {
            z15.a aVar = new z15.a();
            kotlin.jvm.internal.o.f(element, "element");
            aVar.fromXml(element);
            msg.d1(w21.u0.c(aVar.getFromUsername(), aVar.k(), aVar.l() == 1));
            if (cVar != null) {
                cVar.f43757f = aVar.j();
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RoamBackupItemVoice", "parsing voice msg xml failed");
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.RoamBackupItemVoice", e17, "", new java.lang.Object[0]);
            fo1.m mVar = fo1.m.f264882a;
            java.lang.String Q0 = msg.Q0();
            kotlin.jvm.internal.o.f(Q0, "getTalker(...)");
            mVar.g("Restore", 0L, Q0, fo1.e.f264872t, mVar.e(msg));
        }
        java.lang.String s07 = w21.g1.s0(msg.I0());
        if (!pt0.f0.f358209b1.j()) {
            msg.i1(s07);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackupItemVoice", "insert voice msg, svrId:" + msg.I0());
        java.util.LinkedList linkedList = mediaInfo.f33205g;
        if (linkedList.size() == 1) {
            java.lang.String d17 = tn1.e.d(msg, s07, true);
            com.tencent.mm.vfs.w6.w((java.lang.String) linkedList.get(0), d17);
            co1.g.f43768a.j(msg.I0(), d17);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.RoamBackupItemVoice", "mediaCount error, count:" + linkedList.size());
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
        java.lang.String d17 = tn1.e.d(msg, msg.z0(), false);
        java.lang.String str2 = null;
        if (com.tencent.mm.sdk.platformtools.t8.K0(d17)) {
            fo1.m mVar = fo1.m.f264882a;
            java.lang.String Q0 = msg.Q0();
            kotlin.jvm.internal.o.f(Q0, "getTalker(...)");
            mVar.g("Backup", j17, Q0, fo1.e.f264860e, mVar.e(msg));
            return null;
        }
        long k17 = com.tencent.mm.vfs.w6.k(d17);
        if (k17 <= 0) {
            fo1.m mVar2 = fo1.m.f264882a;
            java.lang.String Q02 = msg.Q0();
            kotlin.jvm.internal.o.f(Q02, "getTalker(...)");
            mVar2.g("Backup", j17, Q02, fo1.e.f264859d, mVar2.e(msg));
            return null;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(msg.j())) {
            w21.w0 D0 = w21.p0.Di().D0(msg.I0());
            w21.u0 u0Var2 = new w21.u0(msg.j());
            z15.a aVar = new z15.a();
            aVar.t(D0 != null ? D0.f442499p : w21.v0.g(bm5.y.a(msg, bm5.f0.f22573u), d17, 0, true) ? "0" : "4");
            aVar.r((int) k17);
            aVar.o(1);
            aVar.n(0);
            aVar.u(u0Var2.f442480b);
            java.lang.String str3 = u0Var2.f442479a;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                kotlin.jvm.internal.o.f(str3, "getHuman(...)");
                aVar.q(str3);
            }
            aVar.s(u0Var2.f442481c ? 1 : 0);
            aVar.p(((ri3.e) ((aa0.e) i95.n0.c(aa0.e.class))).Ai(msg.Q0(), msg.getMsgId()));
            str2 = aVar.toXml();
            if (tn1.e.h(msg.Q0())) {
                str2 = r26.b0.b("\n            " + str3 + ":\n            " + str2 + "\n            ");
            }
        }
        u0Var.f33674g = str2;
        co1.i.a(t0Var, co1.d.f43763b.f(msg.I0()), 9, d17, u0Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackupItemVoice", "content : " + u0Var.f33674g);
        return new co1.h(u0Var, t0Var);
    }

    @Override // do1.b
    public long g(com.tencent.mm.storage.f9 msg, java.lang.String mediaId, int i17) {
        kotlin.jvm.internal.o.g(msg, "msg");
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        java.lang.String d17 = tn1.e.d(msg, msg.z0(), false);
        if (i17 == 9) {
            return com.tencent.mm.vfs.w6.k(d17);
        }
        return 0L;
    }
}
