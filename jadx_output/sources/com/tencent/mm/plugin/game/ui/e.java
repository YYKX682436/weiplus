package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public abstract class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f141368d;

    /* renamed from: e, reason: collision with root package name */
    public int f141369e;

    public e(android.content.Context context, int i17) {
        this.f141368d = context;
        if (context == null) {
            throw new java.lang.IllegalArgumentException("context is null.");
        }
    }

    public int a(android.content.Context context, com.tencent.mm.plugin.game.model.e1 e1Var) {
        if (e1Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameMessageOnClickListener", "game message is null.");
            return 0;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(e1Var.field_appId)) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putCharSequence("game_app_id", e1Var.field_appId);
            bundle.putInt("game_report_from_scene", com.tencent.mm.plugin.appbrand.jsapi.pay.n.CTRL_INDEX);
            return r53.f.o(context, e1Var.field_appId, null, bundle, 0);
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.GameMessageOnClickListener", "message type : " + e1Var.field_msgType + " ,message.field_appId is null.");
        return 0;
    }
}
