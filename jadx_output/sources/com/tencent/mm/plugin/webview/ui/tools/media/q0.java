package com.tencent.mm.plugin.webview.ui.tools.media;

/* loaded from: classes9.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.media.q0 f185815a = new com.tencent.mm.plugin.webview.ui.tools.media.q0();

    public final void a(ot0.m1 msgInfo) {
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        com.tencent.mm.plugin.webview.ui.tools.media.MpVideoDataParcelable mpVideoDataParcelable = new com.tencent.mm.plugin.webview.ui.tools.media.MpVideoDataParcelable();
        mpVideoDataParcelable.f185733h = msgInfo;
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, mpVideoDataParcelable, com.tencent.mm.plugin.webview.ui.tools.media.o0.class, com.tencent.mm.plugin.webview.ui.tools.media.p0.f185810d);
    }

    public final void b(r45.ee eeVar) {
        if (eeVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MpShareVideoMsgFav", "doFav msgInfo is null");
            return;
        }
        com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
        java.lang.String str = eeVar.f373350r;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        c01.l2 c17 = c01.n2.d().c(c01.n2.a(str), true);
        kotlin.jvm.internal.o.d(c17);
        c17.i("sendAppMsgScene", 2);
        c17.i("preChatName", eeVar.f373351s);
        c17.i("prePublishId", eeVar.f373350r);
        c17.i("preUsername", eeVar.f373352t);
        c17.i("referUrl", eeVar.f373347o);
        am.c4 c4Var = doFavoriteEvent.f54090g;
        c4Var.f6327m = 36;
        r45.bq0 bq0Var = new r45.bq0();
        r45.jq0 jq0Var = new r45.jq0();
        jq0Var.e(c01.z1.r());
        jq0Var.j(c01.z1.r());
        jq0Var.g(4);
        jq0Var.c(java.lang.System.currentTimeMillis());
        jq0Var.f(eeVar.f373347o);
        bq0Var.o(jq0Var);
        r45.gp0 gp0Var = new r45.gp0();
        gp0Var.A0("");
        gp0Var.o0(eeVar.f373343h);
        gp0Var.g0(com.tencent.mm.sdk.platformtools.w2.a(eeVar.f373341f + eeVar.f373339d));
        gp0Var.n0(eeVar.f373344i);
        gp0Var.O0(eeVar.f373342g);
        gp0Var.K0(eeVar.f373347o);
        gp0Var.x0(true);
        gp0Var.z0(true);
        r45.qp0 qp0Var = new r45.qp0();
        qp0Var.f384168m = eeVar.f373341f;
        qp0Var.f384175t = eeVar.f373340e;
        qp0Var.f384174s = eeVar.f373339d;
        qp0Var.f384169n = eeVar.f373348p;
        qp0Var.f384170o = eeVar.f373349q;
        qp0Var.f384173r = eeVar.f373343h;
        qp0Var.f384164f = eeVar.f373345m;
        qp0Var.f384165g = eeVar.f373346n;
        qp0Var.f384167i = eeVar.f373344i;
        r45.hp0 hp0Var = new r45.hp0();
        hp0Var.f376370x = qp0Var;
        gp0Var.J1 = hp0Var;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(gp0Var);
        bq0Var.d(linkedList);
        c4Var.f6315a = bq0Var;
        c4Var.f6317c = 4;
        gp0Var.h0(4);
        doFavoriteEvent.e();
    }
}
