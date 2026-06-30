package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes.dex */
public final class j7 implements q80.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.jsapi.comms.k7 f143626a;

    public j7(com.tencent.mm.plugin.lite.jsapi.comms.k7 k7Var) {
        this.f143626a = k7Var;
    }

    @Override // q80.x
    public final void onActivityResult(int i17, int i18, android.content.Intent intent) {
        kotlin.jvm.internal.o.d(intent);
        com.tencent.mm.plugin.lite.jsapi.comms.k7 k7Var = this.f143626a;
        if (i17 != 4132) {
            k7Var.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiShareMediaToTimeline", "onSnsActivityResult receive other code(not 4132): " + i18);
            return;
        }
        if (i18 == -1) {
            k7Var.f143443f.c(new org.json.JSONObject().put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_REASON, "ok"), false);
            return;
        }
        if (i18 == 0) {
            k7Var.f143443f.c(new org.json.JSONObject().put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_REASON, "canceled"), false);
            return;
        }
        k7Var.f143443f.a("activity result is invalid, result code: " + i18);
    }
}
