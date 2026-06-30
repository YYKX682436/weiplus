package com.tencent.mm.plugin.game.model;

/* loaded from: classes8.dex */
public class l1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f140357d;

    public l1(com.tencent.mm.plugin.game.model.i1 i1Var, java.lang.String str) {
        this.f140357d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        m53.o4 o4Var = new m53.o4();
        o4Var.f323941d = "zh_CN";
        o4Var.f323942e = "";
        m53.g gVar = new m53.g();
        gVar.f323687d = android.os.Build.VERSION.SDK_INT;
        gVar.f323688e = oj.d.e(com.tencent.mm.sdk.platformtools.x2.f193071a).f345682d;
        o4Var.f323943f = gVar;
        o4Var.f323944g = ((java.util.ArrayList) ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().z1()).size();
        java.lang.String str = this.f140357d;
        o4Var.f323945h = str;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = o4Var;
        lVar.f70665b = new m53.p4();
        lVar.f70666c = "/cgi-bin/mmgame-bin/gamemsgpushappsvr/pullusermessage";
        lVar.f70667d = 9175;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_GAME_REDDOT_LAST_PULL_MSG_TIME_SEC_LONG, java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.i1()));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GameMessageService", "gamelog.srv_msg, service,PullUserMessageRequest,transData:%s", str);
        ((h80.i) ((com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class))).wi(a17, new com.tencent.mm.plugin.game.model.k1(this));
    }
}
