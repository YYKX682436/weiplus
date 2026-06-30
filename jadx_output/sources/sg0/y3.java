package sg0;

@j95.b
/* loaded from: classes.dex */
public class y3 extends i95.w implements tg0.o1 {
    public void Ai(android.content.Context context, r45.un6 un6Var, int i17) {
        if (((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode()) {
            ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(context);
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        try {
            intent.putExtra("key_context", un6Var.toByteArray());
        } catch (java.io.IOException unused) {
        }
        if (un6Var.f387505h == 100203) {
            com.tencent.mm.plugin.websearch.l2.j(context, ".ui.video.fs.TopStoryFSVideoUI", intent, i17);
        } else {
            com.tencent.mm.plugin.websearch.l2.j(context, ".ui.video.list.TopStoryListVideoUI", intent, i17);
        }
    }

    public void Bi(android.content.Context context, android.content.Intent intent, double d17, com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a aVar, com.tencent.mm.ui.zc zcVar) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(intent, "intent");
        zg0.s3 s3Var = new zg0.s3(context, intent, true, 0.0d, false, null, null, false, 248, null);
        s3Var.f472782c = false;
        s3Var.f472783d = d17;
        s3Var.f472784e = true;
        s3Var.f472785f = aVar;
        s3Var.f472786g = zcVar;
        ((yg0.c4) ((zg0.f3) i95.n0.c(zg0.f3.class))).Ai(s3Var);
    }

    public void wi(android.content.Intent intent, int i17, boolean z17, int i18) {
        intent.putExtra("ftsbizscene", i17);
        java.util.Map b17 = su4.r2.b(i17, z17, i18);
        java.util.HashMap hashMap = (java.util.HashMap) b17;
        java.lang.String f17 = su4.r2.f(com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) hashMap.get(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE), 0));
        hashMap.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, f17);
        intent.putExtra(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, f17);
        intent.putExtra("rawUrl", su4.r2.e(b17, 0));
        intent.putExtra("ftsType", i18);
    }
}
