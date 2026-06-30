package com.tencent.mm.plugin.game.luggage.jsevent;

/* loaded from: classes.dex */
public final class n {
    public n(kotlin.jvm.internal.i iVar) {
    }

    public final void a(android.os.Bundle data) {
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppIpcEventDispatch", "dispatchEventFromMMProcess");
        if (!com.tencent.mm.sdk.platformtools.x2.n() && com.tencent.mm.sdk.platformtools.x2.o(com.tencent.mm.sdk.platformtools.x2.f193072b)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppIpcEventDispatch", "process alive");
            com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.x2.f193072b, data, com.tencent.mm.plugin.game.luggage.jsevent.m.class, null);
            return;
        }
        java.lang.String string = data.getString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME);
        java.lang.String string2 = data.getString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppIpcEventDispatch", "invoke, " + string);
        if (string != null && ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Ij()) {
            try {
                ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
                com.tencent.mm.plugin.lite.w.initLib();
                cl0.g gVar = new cl0.g(string2);
                ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
                com.tencent.mm.plugin.lite.w.l(string, gVar);
            } catch (java.lang.Exception e17) {
                cl0.g gVar2 = new cl0.g();
                try {
                    gVar2.h("error", e17.toString());
                    java.lang.String gVar3 = gVar2.toString();
                    kotlin.jvm.internal.o.f(gVar3, "toString(...)");
                    java.util.regex.Pattern compile = java.util.regex.Pattern.compile(",");
                    kotlin.jvm.internal.o.f(compile, "compile(...)");
                    java.lang.String replaceAll = compile.matcher(gVar3).replaceAll(";");
                    kotlin.jvm.internal.o.f(replaceAll, "replaceAll(...)");
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(23449, "LiteAppIpcEventDispatch,".concat(replaceAll));
                } catch (cl0.f e18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LiteAppIpcEventDispatch", e18, "", new java.lang.Object[0]);
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppIpcEventDispatch", e17.toString());
            }
        }
    }
}
