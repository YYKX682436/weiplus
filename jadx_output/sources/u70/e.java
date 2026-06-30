package u70;

/* loaded from: classes9.dex */
public class e extends com.tencent.mm.sdk.event.n {
    public e() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        final com.tencent.mm.storage.f9 f9Var = ((com.tencent.mm.autogen.events.SendImageMsgEvent) iEvent).f54751g.f7272a;
        ((ku5.t0) ku5.t0.f312615d).h(new java.lang.Runnable() { // from class: u70.e$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.storage.f9 f9Var2 = com.tencent.mm.storage.f9.this;
                com.tencent.mm.storage.f9 f27 = pt0.f0.f2(f9Var2.Q0(), f9Var2.getMsgId());
                if (f27 == null || f27.I0() != 0) {
                    if (f27 != null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.SendImageMsgListener", "sendImg already send msgId:%s msgSvrId:%s", java.lang.Long.valueOf(f27.getMsgId()), java.lang.Long.valueOf(f27.I0()));
                        return;
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.SendImageMsgListener", "sendImg msg not exist msgId:%s", java.lang.Long.valueOf(f27.getMsgId()));
                        return;
                    }
                }
                f27.r1(1);
                int s17 = pt0.f0.f358209b1.s(f27.Q0(), f27.getMsgId(), f27);
                ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                m11.b0 S1 = m11.b1.Di().S1(f27);
                if (S1 == null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SendImageMsgListener", "sendImg imgInfo is null msgId:%s", java.lang.Long.valueOf(f27.getMsgId()));
                    return;
                }
                java.lang.String Q0 = f27.Q0();
                if (Q0 == null) {
                    Q0 = "";
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.SendImageMsgListener", "sendImg updateRet:%s msgId:%s imgLocalId:%s", java.lang.Integer.valueOf(s17), java.lang.Long.valueOf(f27.getMsgId()), java.lang.Long.valueOf(S1.f322633a));
                o70.l lVar = new o70.l(f27.getMsgId(), f27.getCreateTime(), S1.f322633a, Q0);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(f9Var2.j())) {
                    r15.b bVar = new r15.b();
                    bVar.fromXml(f9Var2.j(), "msg");
                    if (bVar.n() != null) {
                        lVar.f343283s = bVar;
                    }
                }
                g80.p pVar = (g80.p) ((v70.w) ((xs.d1) i95.n0.c(xs.d1.class))).hj(Q0, f27.getMsgId());
                java.lang.String str = (java.lang.String) pVar.a(s70.c.f403917e).f302833d;
                kotlin.jvm.internal.o.g(str, "<set-?>");
                lVar.f343270f = str;
                java.lang.String str2 = (java.lang.String) pVar.a(s70.c.f403918f).f302833d;
                kotlin.jvm.internal.o.g(str2, "<set-?>");
                lVar.f343273i = str2;
                jz5.l a17 = pVar.a(s70.c.f403919g);
                java.lang.String str3 = (java.lang.String) a17.f302833d;
                kotlin.jvm.internal.o.g(str3, "<set-?>");
                lVar.f343271g = str3;
                if (com.tencent.mm.sdk.platformtools.y1.g(str3)) {
                    lVar.f343274j = str3;
                } else {
                    java.lang.String str4 = (java.lang.String) a17.f302834e;
                    kotlin.jvm.internal.o.g(str4, "<set-?>");
                    lVar.f343274j = str4;
                }
                java.lang.String str5 = (java.lang.String) pVar.a(s70.c.f403920h).f302833d;
                kotlin.jvm.internal.o.g(str5, "<set-?>");
                lVar.f343272h = str5;
                j15.a ij6 = ((a80.b) ((xs.w0) i95.n0.c(xs.w0.class))).ij(f27);
                lVar.f343276l = ij6.q();
                lVar.f343277m = ij6.n();
                lVar.f343278n = S1.f322649q;
                java.lang.String str6 = S1.f322643k;
                if (str6 == null) {
                    str6 = "";
                }
                lVar.f343275k = str6;
                java.lang.String str7 = f27.G;
                if (str7 == null) {
                    str7 = "";
                }
                lVar.f343279o = str7;
                java.lang.String U1 = f27.U1();
                if (U1 == null) {
                    U1 = "";
                }
                lVar.f343281q = U1;
                j15.d dVar = new j15.d();
                java.lang.String U12 = f27.U1();
                if (U12 == null) {
                    U12 = "";
                }
                dVar.fromXml(U12);
                lVar.f343284t = dVar.o().t();
                k70.i0 i0Var = new k70.i0();
                i0Var.f304642a = S1.f322650r;
                i0Var.f304655n = S1.f322641i;
                i0Var.f304647f = f27.G;
                i0Var.f304661t = lVar.f343283s;
                if (dVar.n() != null) {
                    i0Var.f304657p = dVar.n().j();
                }
                boolean j17 = S1.j();
                java.lang.String str8 = com.tencent.mm.sdk.platformtools.t8.K0(lVar.f343272h) ? lVar.f343271g : lVar.f343272h;
                java.lang.String r17 = c01.z1.r();
                r70.g gVar = new r70.g(str8, j17 ? 1 : 0, r17 == null ? "" : r17, Q0, i0Var);
                gVar.f393108j = "send_image_event";
                lVar.f343280p = j17 ? 1 : 0;
                ((v70.w) ((xs.d1) i95.n0.c(xs.d1.class))).oj(gVar, lVar);
            }
        }, "Thread_SendImageMsgListener");
        return false;
    }
}
