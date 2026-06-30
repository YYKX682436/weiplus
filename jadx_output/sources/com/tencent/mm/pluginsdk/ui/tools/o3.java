package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes8.dex */
public class o3 extends com.tencent.mm.plugin.ball.service.d {

    /* renamed from: r, reason: collision with root package name */
    public static final com.tencent.mm.pluginsdk.ui.tools.o3 f191799r = new com.tencent.mm.pluginsdk.ui.tools.o3();

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f191800n = "";

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f191801o = "";

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f191802p = "";

    /* renamed from: q, reason: collision with root package name */
    public int f191803q = 0;

    @Override // com.tencent.mm.plugin.ball.service.d
    public void A(boolean z17, int i17) {
        if (!z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FilesFloatBall.FilesFloatBallHelper", "onMenuFloatBallSelected, exit float ball");
            d();
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FilesFloatBall.FilesFloatBallHelper", "onMenuFloatBallSelected, enter float ball");
        a0(false);
        if (!k()) {
            com.tencent.mm.plugin.ball.ui.FloatBallProxyUI.U6(com.tencent.mm.sdk.platformtools.x2.f193071a, 1, this.f93132d, l(), this.f93137i);
            return;
        }
        j();
        gp1.v vVar = this.f93136h;
        if (vVar != null) {
            vVar.Z();
        }
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        android.content.Intent intent = new android.content.Intent("com.tencent.QQBrowser.action.sdk.document.receiver");
        intent.setPackage("com.tencent.mtt");
        intent.putExtra("key_reader_sdk_window_close", true);
        try {
            context.sendBroadcast(intent);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FilesFloatBall.FilesFloatBallHelper", "closeQb() Exception:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
        }
    }

    @Override // com.tencent.mm.plugin.ball.service.d
    public void H() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FilesFloatBall.FilesFloatBallHelper", "onReceivedBallInfoRemovedEvent, filePath:%s", this.f191800n);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        android.content.Intent intent = new android.content.Intent("com.tencent.QQBrowser.action.sdk.document.receiver");
        intent.setPackage("com.tencent.mtt");
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(dm.i4.COL_ID, 1);
            jSONObject.put("isShow", true);
            jSONArray.put(jSONObject);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put(dm.i4.COL_ID, 2);
            jSONObject2.put("isShow", false);
            jSONArray.put(jSONObject2);
            intent.putExtra("menuItems", jSONArray.toString());
            context.sendBroadcast(intent);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FilesFloatBall.FilesFloatBallHelper", "updateQbFloatBallMenu() Exception:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
        }
    }

    @Override // com.tencent.mm.plugin.ball.service.d
    public void I() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FilesFloatBall.FilesFloatBallHelper", "onReceivedFinishWhenSwitchBallEvent, filePath:%s", this.f191800n);
    }

    @Override // com.tencent.mm.plugin.ball.service.d
    public boolean n() {
        return true;
    }
}
