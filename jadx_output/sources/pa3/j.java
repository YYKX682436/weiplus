package pa3;

/* loaded from: classes8.dex */
public class j extends gp1.e0 {
    @Override // gp1.x
    public void G0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        if (ballInfo == null) {
            com.tencent.mars.xlog.Log.w("LiteAppFloatBallHelper", "ballInfo is null");
            return;
        }
        android.os.Bundle bundle = ballInfo.G;
        com.tencent.mm.plugin.lite.LiteAppCenter.releaseKeepAlive(bundle.getString("appId"), bundle.getString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_PAGE), bundle.getString("query"), 2);
        com.tencent.mars.xlog.Log.i("LiteAppFloatBallHelper", "float ball remove, so release keepalive");
    }

    @Override // gp1.e0, gp1.x
    public void V(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
    }

    @Override // gp1.x
    public void r0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        if (ballInfo == null) {
            com.tencent.mars.xlog.Log.w("LiteAppFloatBallHelper", "ballInfo is null");
            return;
        }
        android.os.Bundle bundle = ballInfo.G;
        q80.d0 d0Var = new q80.d0();
        d0Var.f360649a = bundle.getString("appId");
        d0Var.f360650b = bundle.getString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_PAGE);
        java.lang.String string = bundle.getString("query");
        d0Var.f360651c = string != null ? new org.json.JSONObject(string).toString() : null;
        com.tencent.liteapp.storage.LiteAppReferrerInfo liteAppReferrerInfo = new com.tencent.liteapp.storage.LiteAppReferrerInfo();
        liteAppReferrerInfo.scene = com.tencent.liteapp.gen.LiteAppOpenScene.FLOAT;
        liteAppReferrerInfo.sceneId = bundle.getString("appId");
        java.lang.String string2 = bundle.getString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA);
        liteAppReferrerInfo.extraData = string2 != null ? new org.json.JSONObject(string2) : null;
        d0Var.f360674z = liteAppReferrerInfo;
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putBoolean("key_enter_from_float_ball", true);
        bundle2.putBoolean("key_enter_with_animation", true);
        bundle2.putInt("key_enter_group_type", ballInfo.f93048f);
        d0Var.f360655g = bundle2;
        d0Var.f360664p = com.tencent.mm.R.anim.f477728p;
        d0Var.f360665q = com.tencent.mm.R.anim.f477728p;
        d0Var.A = 180;
        d0Var.C = 2;
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).lk(com.tencent.mm.sdk.platformtools.x2.f193071a, d0Var, new pa3.f());
    }
}
