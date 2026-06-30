package uy;

/* loaded from: classes8.dex */
public class i extends gp1.e0 {
    @Override // gp1.x
    public void G0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
    }

    @Override // gp1.e0, gp1.x
    public void V(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
    }

    @Override // gp1.x
    public void r0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        java.util.Set set = gc5.b.f270466x;
        if (ballInfo == null || ballInfo.G == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FilesFloatBall.FilesPageFloatBallHelper", "handleBallInfoClicked, openFile ballInfo:%s", ballInfo);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        long j17 = gc5.b.f270468z + 30000;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        gc5.b.f270468z = currentTimeMillis;
        if (j17 < currentTimeMillis) {
            gm0.j1.i();
            gc5.b.f270467y = gm0.j1.u().l();
        }
        if (!gc5.b.f270467y) {
            db5.t7.k(context, null);
            return;
        }
        boolean z17 = ballInfo.G.getBoolean("ifAppAttachDownloadUI");
        java.lang.String string = ballInfo.G.getString(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
        if (!com.tencent.mm.vfs.w6.j(string)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FilesFloatBall.FilesPageFloatBallHelper", "handleBallInfoClicked() %s not exist", string);
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(context);
            u1Var.u("");
            u1Var.g(context.getString(com.tencent.mm.R.string.cfe));
            u1Var.a(true);
            u1Var.l(null);
            u1Var.q(false);
            ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().U(ballInfo);
            return;
        }
        if (!z17) {
            java.lang.String string2 = ballInfo.G.getString("fileExt");
            java.lang.String string3 = ballInfo.G.getString("appId");
            java.lang.String string4 = ballInfo.G.getString("processName");
            boolean z18 = ballInfo.G.getBoolean("showMenu");
            ((d73.i) i95.n0.c(d73.i.class)).Ja(com.tencent.mm.plugin.handoff.model.HandOffFile.fromBallInfo(ballInfo));
            if (com.tencent.mm.sdk.platformtools.t8.K0(string4)) {
                ((ht.a) ((jt.v) i95.n0.c(jt.v.class))).Bi(string, string2, 9);
                return;
            } else {
                ((com.tencent.mm.plugin.appbrand.service.f5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f5.class)).v7(context, string, string2, string3, z18, string4);
                return;
            }
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(context, "com.tencent.mm.ui.chatting.AppAttachNewDownloadUI");
        qp1.m.b(intent, ballInfo.G, gc5.b.f270466x);
        intent.getExtras().putInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 9);
        intent.addFlags(268435456);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/ui/chatting/floatball/FilesPageFloatBallHelper", "handleBallInfoClicked", "(Lcom/tencent/mm/plugin/ball/model/BallInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/ui/chatting/floatball/FilesPageFloatBallHelper", "handleBallInfoClicked", "(Lcom/tencent/mm/plugin/ball/model/BallInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
