package com.tencent.mm.plugin.game.luggage;

/* loaded from: classes8.dex */
public class c0 implements qf.c {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.game.luggage.page.b0 f139543a;

    public c0(com.tencent.mm.plugin.game.luggage.page.b0 b0Var) {
        this.f139543a = b0Var;
    }

    @Override // qf.c
    public android.webkit.WebResourceResponse a(java.lang.String str) {
        java.lang.String replaceFirst;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuggageGameJsResourceProvider", "onResourceRequest, url = %s", str);
        com.tencent.mm.plugin.game.luggage.page.b0 b0Var = this.f139543a;
        boolean z17 = b0Var.getWePkgPlugin() != null ? b0Var.getWePkgPlugin().f441756d : false;
        com.tencent.mars.xlog.Log.i("MicroMsg.GameScriptManager", "getGameScriptResponse");
        java.lang.String e17 = ik1.f.e("game.js");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(e17)) {
            java.lang.String replaceFirst2 = e17.replaceFirst("#__usewepkg__#", java.lang.String.valueOf(z17));
            android.os.PowerManager powerManager = (android.os.PowerManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("power");
            java.lang.String replaceFirst3 = replaceFirst2.replaceFirst("#__lowPowerMode__#", java.lang.String.valueOf(powerManager != null ? powerManager.isPowerSaveMode() : false)).replaceFirst("#__lowPower__#", java.lang.String.valueOf(false));
            if (h53.j.d() != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("\"");
                int ordinal = h53.j.d().f279058h.ordinal();
                sb6.append(ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? ordinal != 5 ? com.tencent.mm.plugin.lite.LiteAppCenter.FRAMEWORK_TYPE_NONE : "destroyed" : "stopped" : com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.FAILED : "inited" : "initing");
                sb6.append("\"");
                replaceFirst = replaceFirst3.replaceFirst("#__jscore_state__#", sb6.toString());
            } else {
                replaceFirst = replaceFirst3.replaceFirst("#__jscore_state__#", "\"none\"");
            }
            try {
                android.webkit.WebResourceResponse webResourceResponse = new android.webkit.WebResourceResponse("application/javascript", com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding, new java.io.ByteArrayInputStream(replaceFirst.getBytes(com.tencent.mapsdk.internal.rv.f51270c)));
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("Cache-Control", "no-cache, no-store, must-revalidate");
                hashMap.put("Pragma", "no-cache");
                hashMap.put("Expires", "0");
                webResourceResponse.setResponseHeaders(hashMap);
                com.tencent.mars.xlog.Log.i("MicroMsg.GameScriptManager", "getGameScriptResponse end");
                return webResourceResponse;
            } catch (java.lang.Exception e18) {
                com.tencent.mm.sdk.platformtools.Log.a("MicroMsg.GameScriptManager", "", e18);
            }
        }
        return null;
    }

    @Override // qf.c
    public java.lang.String b() {
        return "weixin://game.js";
    }
}
