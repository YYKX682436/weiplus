package vj0;

/* loaded from: classes11.dex */
public final class j implements vg3.r4 {
    @Override // vg3.r4
    public void h0(java.lang.String subType, java.util.Map values, com.tencent.mm.modelbase.p0 addMsgInfo) {
        kotlin.jvm.internal.o.g(subType, "subType");
        kotlin.jvm.internal.o.g(values, "values");
        kotlin.jvm.internal.o.g(addMsgInfo, "addMsgInfo");
        boolean isForeground = com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner.INSTANCE.isForeground();
        com.tencent.mars.xlog.Log.i("MicroMsg.CommonLiteAppGuidanceNewXmlReceiver", "CommonLiteAppGuidanceNewXmlReceiver: onNewXmlReceived: " + isForeground);
        if (isForeground) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (subType.equals("CommonLiteAppGuidance")) {
                w15.a aVar = new w15.a();
                aVar.fromXmlMap(values);
                vj0.i iVar = vj0.i.f437649a;
                vj0.i.f437650b = aVar;
                if (!ot5.h.f348877a.a(aVar.getUuid(), wo.w0.k(), "MicroMsg.CommonLiteAppGuidanceManager", false)) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.CommonLiteAppGuidanceManager", "ignore onReceiveInfo: not my info");
                    return;
                }
                if (aVar.getScene() == null) {
                    return;
                }
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("appId", aVar.getAppid());
                bundle.putString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, aVar.k());
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                java.lang.String c17 = c01.z1.c();
                jSONObject.put(dm.i4.COL_USERNAME, c17 == null || c17.length() == 0 ? c01.z1.r() : c01.z1.c());
                jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, aVar.getScene());
                java.lang.String jSONObject2 = jSONObject.toString();
                kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                bundle.putString("query", jSONObject2);
                bundle.putBoolean("forbidRightGesture", true);
                ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).kk(com.tencent.mm.sdk.platformtools.x2.f193071a, bundle, true, true, new vj0.g(bundle));
            }
        }
    }
}
