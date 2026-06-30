package dh0;

/* loaded from: classes5.dex */
public final class k implements vg3.q4 {
    public final java.lang.String b(q15.e eVar, boolean z17) {
        long n17 = eVar.n();
        java.lang.String k17 = eVar.k();
        java.lang.String username = eVar.getUsername();
        java.lang.String l17 = eVar.l();
        if (n17 != 0) {
            if (!(k17 == null || k17.length() == 0)) {
                if (!(username == null || username.length() == 0)) {
                    java.lang.String Di = ((eh0.o) ((dh0.j) i95.n0.c(dh0.j.class))).Di(username, n17, k17, z17);
                    if (Di == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.WeClawStream.NewXml", "startStream createDownStream failed");
                        return null;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.WeClawStream.NewXml", "startStream success, stream started: %s", Di);
                    if (l17 == null || l17.length() == 0) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.WeClawStream.NewXml", "insert bootstrap text: bootstrapContent is empty");
                        return Di;
                    }
                    byte[] a17 = n51.d.a(l17, 0);
                    java.nio.charset.Charset forName = java.nio.charset.Charset.forName(com.tencent.mapsdk.internal.rv.f51270c);
                    kotlin.jvm.internal.o.f(forName, "forName(...)");
                    java.lang.String str = new java.lang.String(a17, forName);
                    if (r26.n0.N(str)) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.WeClawStream.NewXml", "startStream bootstrapContent is empty");
                        return null;
                    }
                    pt0.e0 e0Var = pt0.f0.f358209b1;
                    com.tencent.mm.storage.f9 l18 = e0Var.l(username, n17);
                    if (l18 == null) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.WeClawStream.NewXml", "insert bootstrap text: msgInfo not found, msgSvrId:%s", java.lang.Long.valueOf(n17));
                        l18 = new com.tencent.mm.storage.f9();
                        l18.o1(n17);
                        l18.u1(username);
                        l18.setType(16777265);
                        l18.j1(0);
                        l18.r1(3);
                        l18.e1(c01.w9.o(username));
                    }
                    v05.b bVar = new v05.b();
                    if (!z17) {
                        bVar.set(bVar.f368365d + 2, str);
                    }
                    l18.d1(bVar.toXml());
                    l18.f1(l18.w0() | 8388608);
                    try {
                        if (l18.getMsgId() > 0) {
                            e0Var.s(l18.Q0(), l18.getMsgId(), l18);
                        } else {
                            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().M9(l18);
                        }
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WeClawStream.NewXml", e17, "updateMsgInfoContent failed", new java.lang.Object[0]);
                    }
                    return Di;
                }
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.WeClawStream.NewXml", "startStream invalid params: msgSvrId=%s, streamTicket=%s, username=%s", java.lang.Long.valueOf(n17), k17, username);
        return null;
    }

    @Override // vg3.q4
    public com.tencent.mm.modelbase.q0 k7(java.lang.String str, java.util.Map map, com.tencent.mm.modelbase.p0 p0Var) {
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WeClawStream.NewXml", "onRecieveMsg acc not ready");
            return null;
        }
        if (!kotlin.jvm.internal.o.b(j62.e.g().f(new com.tencent.mm.repairer.config.chatting.markdown.RepairerConfigWeClawStreamStartXMLEnable()), "1")) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WeClawStream.NewXml", "onRecieveMsg Expt not enable");
            return null;
        }
        r45.j4 j4Var = p0Var != null ? p0Var.f70726a : null;
        if (j4Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WeClawStream.NewXml", "empty addMsg");
            return null;
        }
        java.lang.String g17 = x51.j1.g(j4Var.f377561h);
        if (g17 == null || g17.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WeClawStream.NewXml", "empty msg content");
            return null;
        }
        q15.e eVar = new q15.e();
        kotlin.jvm.internal.o.d(g17);
        eVar.fromXml(g17);
        java.lang.String j17 = eVar.j();
        int o17 = eVar.o();
        com.tencent.mars.xlog.Log.i("MicroMsg.WeClawStream.NewXml", "onRecieveMsg action:%s, streamType:%d, msgSvrId:%s, username:%s", j17, java.lang.Integer.valueOf(o17), java.lang.Long.valueOf(eVar.n()), eVar.getUsername());
        if (j17 == null || j17.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WeClawStream.NewXml", "unknown action, ignore");
            return null;
        }
        if (o17 != 1) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WeClawStream.NewXml", "unsupported stream_type:%d, ignore", java.lang.Integer.valueOf(o17));
            return null;
        }
        if (kotlin.jvm.internal.o.b(j17, "thinking")) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WeClawStream.NewXml", "handleThinking msgSvrId:%s", java.lang.Long.valueOf(eVar.n()));
            b(eVar, true);
        } else if (kotlin.jvm.internal.o.b(j17, "result")) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WeClawStream.NewXml", "handleResult msgSvrId:%s", java.lang.Long.valueOf(eVar.n()));
            b(eVar, false);
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.WeClawStream.NewXml", "unknown action:%s, ignore", j17);
        }
        return null;
    }
}
